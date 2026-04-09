package com.yandex.mobile.ads.impl;

import N7.G8;
import c9.C2097r;
import com.yandex.mobile.ads.impl.x01;

/* loaded from: classes3.dex */
public final class vo0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f34642a = "Yandex Mobile Adsintegrated incorrectly";

    public static final class a extends kotlin.jvm.internal.m implements p9.l<oo0, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f34643b = new a();

        public a() {
            super(1);
        }

        public static String a(oo0 cause) {
            kotlin.jvm.internal.l.f(cause, "cause");
            return androidx.work.s.d("\t·\t", cause.getMessage());
        }

        @Override // p9.l
        public final /* bridge */ /* synthetic */ CharSequence invoke(oo0 oo0Var) {
            return a(oo0Var);
        }
    }

    public final String a(x01.a.b result) {
        kotlin.jvm.internal.l.f(result, "result");
        return C2097r.u0(result.a(), "\n", G8.s(this.f34642a, "\n"), null, a.f34643b, 28);
    }
}
