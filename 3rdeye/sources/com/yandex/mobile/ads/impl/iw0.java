package com.yandex.mobile.ads.impl;

import c9.C2097r;
import java.util.Set;
import x9.C5786d;

/* loaded from: classes3.dex */
public final class iw0 {

    /* renamed from: a, reason: collision with root package name */
    private final uw0 f28883a = new uw0();

    public static final class a extends kotlin.jvm.internal.m implements p9.l<w31, Set<? extends sw0>> {
        public a() {
            super(1);
        }

        @Override // p9.l
        public final Set<? extends sw0> invoke(w31 w31Var) {
            w31 nativeAd = w31Var;
            kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
            iw0.this.f28883a.getClass();
            return uw0.a(nativeAd);
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements p9.l<sw0, ku0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f28885b = new b();

        public b() {
            super(1);
        }

        @Override // p9.l
        public final ku0 invoke(sw0 sw0Var) {
            sw0 mediaValue = sw0Var;
            kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
            return mediaValue.b();
        }
    }

    public final Set<ku0> a(j41 nativeAdBlock) {
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        return x9.l.M(new C5786d(x9.l.J(x9.l.H(C2097r.j0(nativeAdBlock.c().e()), new a()), b.f28885b), false, new A8.d(4)));
    }
}
