package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class PQ extends AbstractC1353j8 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f10433g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f10434b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10435c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10436d;

    /* renamed from: e, reason: collision with root package name */
    public final C1241h2 f10437e;

    /* renamed from: f, reason: collision with root package name */
    public final C2154y0 f10438f;

    static {
        JB jb = LB.f9635b;
        C1197gC c1197gC = C1197gC.f14227e;
        List list = Collections.EMPTY_LIST;
        C1197gC c1197gC2 = C1197gC.f14227e;
        C1993v1 c1993v1 = C1993v1.f17203a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new N0(uri, c1197gC2);
        }
        new G();
        C1348j3 c1348j3 = C1348j3.f14865B;
    }

    public PQ(long j6, long j7, boolean z6, C1241h2 c1241h2, C2154y0 c2154y0) {
        this.f10434b = j6;
        this.f10435c = j7;
        this.f10436d = z6;
        c1241h2.getClass();
        this.f10437e = c1241h2;
        this.f10438f = c2154y0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final U7 b(int i, U7 u7, long j6) {
        AbstractC0582Jp.k0(i, 1);
        Object obj = U7.f11601m;
        u7.a(this.f10437e, this.f10436d, false, this.f10438f, this.f10435c);
        return u7;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final I7 d(int i, I7 i7, boolean z6) {
        AbstractC0582Jp.k0(i, 1);
        Object obj = z6 ? f10433g : null;
        C2023ve c2023ve = C2023ve.f17312b;
        i7.a(null, obj, 0, this.f10434b, false);
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final int e(Object obj) {
        return f10433g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final Object f(int i) {
        AbstractC0582Jp.k0(i, 1);
        return f10433g;
    }
}
