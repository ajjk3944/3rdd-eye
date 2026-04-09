package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f19383a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final i0 f19384b = new i0();

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}
