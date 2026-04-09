package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class el {

    /* renamed from: a, reason: collision with root package name */
    private final j41 f26885a;

    /* renamed from: b, reason: collision with root package name */
    private final ca1 f26886b;

    /* renamed from: c, reason: collision with root package name */
    private final vb1 f26887c;

    /* renamed from: d, reason: collision with root package name */
    private final tb1 f26888d;

    /* renamed from: e, reason: collision with root package name */
    private final j51 f26889e;

    /* renamed from: f, reason: collision with root package name */
    private final h81 f26890f;

    /* renamed from: g, reason: collision with root package name */
    private final ea f26891g;

    /* renamed from: h, reason: collision with root package name */
    private final vu1 f26892h;
    private final w31 i;

    /* renamed from: j, reason: collision with root package name */
    private final e9 f26893j;

    public el(j41 nativeAdBlock, ca1 nativeValidator, vb1 nativeVisualBlock, tb1 nativeViewRenderer, j51 nativeAdFactoriesProvider, h81 forceImpressionConfigurator, d71 adViewRenderingValidator, vu1 sdkEnvironmentModule, w31 w31Var, e9 adStructureType) {
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(nativeValidator, "nativeValidator");
        kotlin.jvm.internal.l.f(nativeVisualBlock, "nativeVisualBlock");
        kotlin.jvm.internal.l.f(nativeViewRenderer, "nativeViewRenderer");
        kotlin.jvm.internal.l.f(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        kotlin.jvm.internal.l.f(forceImpressionConfigurator, "forceImpressionConfigurator");
        kotlin.jvm.internal.l.f(adViewRenderingValidator, "adViewRenderingValidator");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adStructureType, "adStructureType");
        this.f26885a = nativeAdBlock;
        this.f26886b = nativeValidator;
        this.f26887c = nativeVisualBlock;
        this.f26888d = nativeViewRenderer;
        this.f26889e = nativeAdFactoriesProvider;
        this.f26890f = forceImpressionConfigurator;
        this.f26891g = adViewRenderingValidator;
        this.f26892h = sdkEnvironmentModule;
        this.i = w31Var;
        this.f26893j = adStructureType;
    }

    public final e9 a() {
        return this.f26893j;
    }

    public final ea b() {
        return this.f26891g;
    }

    public final h81 c() {
        return this.f26890f;
    }

    public final j41 d() {
        return this.f26885a;
    }

    public final j51 e() {
        return this.f26889e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el)) {
            return false;
        }
        el elVar = (el) obj;
        return kotlin.jvm.internal.l.b(this.f26885a, elVar.f26885a) && kotlin.jvm.internal.l.b(this.f26886b, elVar.f26886b) && kotlin.jvm.internal.l.b(this.f26887c, elVar.f26887c) && kotlin.jvm.internal.l.b(this.f26888d, elVar.f26888d) && kotlin.jvm.internal.l.b(this.f26889e, elVar.f26889e) && kotlin.jvm.internal.l.b(this.f26890f, elVar.f26890f) && kotlin.jvm.internal.l.b(this.f26891g, elVar.f26891g) && kotlin.jvm.internal.l.b(this.f26892h, elVar.f26892h) && kotlin.jvm.internal.l.b(this.i, elVar.i) && this.f26893j == elVar.f26893j;
    }

    public final w31 f() {
        return this.i;
    }

    public final ca1 g() {
        return this.f26886b;
    }

    public final tb1 h() {
        return this.f26888d;
    }

    public final int hashCode() {
        int iHashCode = (this.f26892h.hashCode() + ((this.f26891g.hashCode() + ((this.f26890f.hashCode() + ((this.f26889e.hashCode() + ((this.f26888d.hashCode() + ((this.f26887c.hashCode() + ((this.f26886b.hashCode() + (this.f26885a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        w31 w31Var = this.i;
        return this.f26893j.hashCode() + ((iHashCode + (w31Var == null ? 0 : w31Var.hashCode())) * 31);
    }

    public final vb1 i() {
        return this.f26887c;
    }

    public final vu1 j() {
        return this.f26892h;
    }

    public final String toString() {
        return "BinderConfiguration(nativeAdBlock=" + this.f26885a + ", nativeValidator=" + this.f26886b + ", nativeVisualBlock=" + this.f26887c + ", nativeViewRenderer=" + this.f26888d + ", nativeAdFactoriesProvider=" + this.f26889e + ", forceImpressionConfigurator=" + this.f26890f + ", adViewRenderingValidator=" + this.f26891g + ", sdkEnvironmentModule=" + this.f26892h + ", nativeData=" + this.i + ", adStructureType=" + this.f26893j + ")";
    }
}
