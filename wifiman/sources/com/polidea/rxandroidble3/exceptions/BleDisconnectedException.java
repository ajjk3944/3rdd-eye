package com.polidea.rxandroidble3.exceptions;

import L6.b;
import R6.a;

/* loaded from: classes3.dex */
public class BleDisconnectedException extends BleException {

    /* renamed from: a, reason: collision with root package name */
    public final String f39270a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39271b;

    @Deprecated
    public BleDisconnectedException() {
        this("", -1);
    }

    public static BleDisconnectedException a(String str) {
        return new BleDisconnectedException(new BleAdapterDisabledException(), str, -1);
    }

    private static String c(String str, int i10) {
        return "Disconnected from " + b.d(str) + " with status " + i10 + " (" + a.a(i10) + ")";
    }

    public BleDisconnectedException(Throwable th2, String str, int i10) {
        super(c(str, i10), th2);
        this.f39270a = str;
        this.f39271b = i10;
    }

    public BleDisconnectedException(String str, int i10) {
        super(c(str, i10));
        this.f39270a = str;
        this.f39271b = i10;
    }
}
