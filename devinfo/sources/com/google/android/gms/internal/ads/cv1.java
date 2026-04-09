package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cv1 {

    /* renamed from: c, reason: collision with root package name */
    public static final cv1 f10227c;

    /* renamed from: a, reason: collision with root package name */
    public final String f10228a;

    /* renamed from: b, reason: collision with root package name */
    public final bv1 f10229b;

    static {
        new cv1("");
        f10227c = new cv1("preload");
    }

    public cv1(String str) {
        this.f10228a = str;
        this.f10229b = Build.VERSION.SDK_INT >= 31 ? new bv1() : null;
    }

    public final synchronized void a(LogSessionId logSessionId) {
        bv1 bv1Var = this.f10229b;
        if (bv1Var == null) {
            throw null;
        }
        mq0.c0(bv1Var.f9812a.equals(LogSessionId.LOG_SESSION_ID_NONE));
        bv1Var.f9812a = logSessionId;
    }
}
