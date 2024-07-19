package com.karnamic.skillcase.auth.login.domain

import android.content.Context
import com.google.android.gms.auth.api.identity.SignInClient
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class GoogleAuthClient (
    private val context: Context,
    private val onTapSignInClient: SignInClient
) {
    private val auth = Firebase.auth


}