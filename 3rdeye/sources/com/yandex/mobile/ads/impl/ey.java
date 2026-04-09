package com.yandex.mobile.ads.impl;

import c9.C2097r;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ey {

    /* renamed from: b, reason: collision with root package name */
    private static final String f27084b = "https://yandex.ru/ads";

    /* renamed from: a, reason: collision with root package name */
    private final j50 f27085a;

    public static final class a extends kotlin.jvm.internal.m implements p9.l<bn1, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f27086b = new a();

        public a() {
            super(1);
        }

        public static String a(bn1 it) {
            kotlin.jvm.internal.l.f(it, "it");
            return B4.g.o(it.getKey(), "=", it.getValue());
        }

        @Override // p9.l
        public final /* bridge */ /* synthetic */ CharSequence invoke(bn1 bn1Var) {
            return a(bn1Var);
        }
    }

    public ey(j50 environmentConfiguration) {
        kotlin.jvm.internal.l.f(environmentConfiguration, "environmentConfiguration");
        this.f27085a = environmentConfiguration;
    }

    public final Map<String, String> a() {
        return this.f27085a.d();
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        String strA = this.f27085a.a();
        if (strA == null) {
            strA = f27084b;
        }
        sb.append(strA);
        Character chValueOf = sb.length() == 0 ? null : Character.valueOf(sb.charAt(sb.length() - 1));
        if (chValueOf == null || chValueOf.charValue() != '/') {
            sb.append('/');
        }
        sb.append("v1/debugpanel");
        if (!this.f27085a.f().isEmpty()) {
            sb.append(C2097r.u0(this.f27085a.f(), "&", "?", null, a.f27086b, 28));
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        return string;
    }
}
