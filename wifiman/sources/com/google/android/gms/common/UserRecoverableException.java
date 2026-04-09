package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes.dex */
public class UserRecoverableException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final Intent f34709a;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f34709a = intent;
    }
}
