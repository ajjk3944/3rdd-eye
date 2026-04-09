package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class oq {

    /* renamed from: b, reason: collision with root package name */
    public static final hl f14768b = new hl(10);

    /* renamed from: a, reason: collision with root package name */
    public final y50 f14769a;

    public oq(Context context, za.a aVar, String str, cs0 cs0Var) {
        y50 y50Var = new y50();
        y50Var.f18643b = new Object();
        y50Var.g = 1;
        y50Var.f18644c = str;
        y50Var.f18642a = context.getApplicationContext();
        y50Var.f18645d = aVar;
        y50Var.f18646e = cs0Var;
        this.f14769a = y50Var;
    }

    public final qq a(String str, nq nqVar, mq mqVar) {
        return new qq(this.f14769a, str, nqVar, mqVar);
    }
}
