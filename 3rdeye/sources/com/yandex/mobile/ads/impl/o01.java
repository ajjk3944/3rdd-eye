package com.yandex.mobile.ads.impl;

import b9.C1992A;
import j6.p;

/* loaded from: classes3.dex */
public final class o01 extends w01 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31118a;

    /* renamed from: b, reason: collision with root package name */
    private final va2 f31119b;

    public o01(va2 versionNameParser) {
        kotlin.jvm.internal.l.f(versionNameParser, "versionNameParser");
        this.f31118a = false;
        this.f31119b = versionNameParser;
    }

    @Override // com.yandex.mobile.ads.impl.w01
    public final void a(p9.l<? super oo0, C1992A> onValidationFailed) {
        kotlin.jvm.internal.l.f(onValidationFailed, "onValidationFailed");
        try {
            va2 va2Var = this.f31119b;
            p.a aVar = j6.p.f43037b;
            va2Var.getClass();
            ua2 ua2VarA = va2.a("31.13.0");
            this.f31119b.getClass();
            ua2 ua2VarA2 = va2.a("31.13.0");
            Integer numValueOf = ua2VarA2 != null ? Integer.valueOf(ua2VarA2.a()) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                if (ua2VarA == null || !(this.f31118a || ua2VarA.a() == iIntValue)) {
                    String strA = C4215v0.a(new Object[]{numValueOf, ua2VarA != null ? Integer.valueOf(ua2VarA.a()) : null}, 2, "Unsupported DivKit major version. Expected: %s. Actual: %s", "format(...)");
                    onValidationFailed.invoke(new oo0(strA, strA));
                    throw null;
                }
            }
        } catch (NoClassDefFoundError unused) {
            String strA2 = C4215v0.a(new Object[0], 0, "DivKit is unavailable. Please check your buildscripts for exclusion rules for 'com.yandex.div:div'", "format(...)");
            onValidationFailed.invoke(new oo0(strA2, strA2));
            throw null;
        }
    }
}
