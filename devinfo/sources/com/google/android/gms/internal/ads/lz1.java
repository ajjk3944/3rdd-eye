package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lz1 extends uh {
    public static final Object g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f13689b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13690c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13691d;

    /* renamed from: e, reason: collision with root package name */
    public final h5 f13692e;

    /* renamed from: f, reason: collision with root package name */
    public final a2 f13693f;

    static {
        v41 v41Var = x41.f18307b;
        u51 u51Var = u51.f17096e;
        List list = Collections.EMPTY_LIST;
        u51 u51Var2 = u51.f17096e;
        w3 w3Var = w3.f17852a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new o2(uri, u51Var2);
        }
        new g0();
        j7 j7Var = j7.B;
    }

    public lz1(long j, long j8, boolean z3, h5 h5Var, a2 a2Var) {
        this.f13689b = j;
        this.f13690c = j8;
        this.f13691d = z3;
        h5Var.getClass();
        this.f13692e = h5Var;
        this.f13693f = a2Var;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final fh b(int i4, fh fhVar, long j) {
        mq0.f0(i4, 1);
        Object obj = fh.f11162m;
        fhVar.a(this.f13692e, this.f13691d, false, this.f13693f, this.f13690c);
        return fhVar;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final tg d(int i4, tg tgVar, boolean z3) {
        mq0.f0(i4, 1);
        Object obj = z3 ? g : null;
        mu muVar = mu.f14017b;
        tgVar.a(null, obj, 0, this.f13689b, false);
        return tgVar;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int e(Object obj) {
        return g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final Object f(int i4) {
        mq0.f0(i4, 1);
        return g;
    }
}
