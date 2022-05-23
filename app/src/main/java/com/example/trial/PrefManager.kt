package com.example.trial

import android.content.Context
import android.content.SharedPreferences


class PrefManager(var _context: Context) {
    var pref: SharedPreferences
    var editor: SharedPreferences.Editor

    // shared pref mode
    var PRIVATE_MODE = 0
    var isFirstTimeLaunch: Boolean
        get() = pref.getBoolean(PrefManager.Companion.IS_FIRST_TIME_LAUNCH, true)
        set(isFirstTime) {
            editor.putBoolean(PrefManager.Companion.IS_FIRST_TIME_LAUNCH, isFirstTime)
            editor.commit()
        }

    companion object {
        // Shared preferences file name
        private const val PREF_NAME = "androidhive-welcome"
        private const val IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch"
    }

    init {
        pref = _context.getSharedPreferences(PrefManager.Companion.PREF_NAME, PRIVATE_MODE)
        editor = pref.edit()
    }
}