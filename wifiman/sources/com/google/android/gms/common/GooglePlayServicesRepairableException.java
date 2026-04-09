package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* renamed from: b, reason: collision with root package name */
    private final int f34708b;

    public GooglePlayServicesRepairableException(int i10, String str, Intent intent) {
        super(str, intent);
        this.f34708b = i10;
    }

    public int a() {
        return this.f34708b;
    }
}
