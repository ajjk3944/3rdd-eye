package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Range;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13306a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f13307b;

    /* renamed from: c, reason: collision with root package name */
    public o0 f13308c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13309d;

    /* renamed from: e, reason: collision with root package name */
    public w5 f13310e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13311f;
    public long g = 15000;

    /* renamed from: h, reason: collision with root package name */
    public final u0 f13312h;

    public l0(Context context, t0 t0Var) {
        this.f13306a = context.getApplicationContext();
        this.f13307b = t0Var;
        u0 u0Var = new u0();
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        u0Var.f17027d = range;
        u0Var.f17026c = ((Double) range.getUpper()).doubleValue();
        u0Var.f17024a = -9223372036854775807L;
        u0Var.f17025b = -9223372036854775807L;
        this.f13312h = u0Var;
        this.f13310e = w5.f17894f;
    }
}
