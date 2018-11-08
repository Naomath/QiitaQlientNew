package com.dennnoukishidann.dagger

import com.dennnoukishidann.qittaclientnew.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by gotounaoto on 2018/11/08.
 */
@Component(modules = arrayOf(ClientModule::class))
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}