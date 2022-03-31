package com.android.hyper.utils.network

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.os.Build
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject

class NetworkMonitor @Inject constructor(
    @ActivityContext private val context: Context
) {

    private lateinit var networkCallback: ConnectivityManager.NetworkCallback
    private val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    lateinit var result: (isAvailable: Boolean, type: ConnectionType?) -> Unit

    fun register() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            if (connectivityManager.activeNetwork == null) {
                result(false, null)
            }

            networkCallback = object : ConnectivityManager.NetworkCallback() {
                override fun onLost(network: Network) {
                    result(false, null)
                }

                override fun onCapabilitiesChanged(
                    network: Network,
                    networkCapabilities: NetworkCapabilities
                ) {
                    result(true, null)
                }
            }
            connectivityManager.registerDefaultNetworkCallback(networkCallback)
        } else {
            val intentFilter = IntentFilter()
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE")
        }
    }

    fun unregister() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            connectivityManager.unregisterNetworkCallback(networkCallback)
        } else {

        }
    }

    private val networkChangeReciever = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
        }
    }
}