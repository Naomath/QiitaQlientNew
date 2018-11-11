package com.naoto.dennnoukishidann.qittaclient

import android.app.Application
import android.support.v7.app.AppCompatActivity

/**
 * Created by gotounaoto on 2018/11/08.
 */

class QiitaQlientApp : Application() {

    val component: AppCompatActivity by lazy {
        DaggerAppComponent.create()
    }
}