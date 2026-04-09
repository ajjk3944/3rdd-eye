package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class s42 {

    /* renamed from: a, reason: collision with root package name */
    private final rl1 f32869a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4216v1 f32870b;

    /* renamed from: c, reason: collision with root package name */
    private final hz f32871c;

    /* renamed from: d, reason: collision with root package name */
    private final ep f32872d;

    /* renamed from: e, reason: collision with root package name */
    private final up f32873e;

    public /* synthetic */ s42(rl1 rl1Var, InterfaceC4216v1 interfaceC4216v1, hz hzVar, ep epVar) {
        this(rl1Var, interfaceC4216v1, hzVar, epVar, new up());
    }

    public final InterfaceC4216v1 a() {
        return this.f32870b;
    }

    public final ep b() {
        return this.f32872d;
    }

    public final up c() {
        return this.f32873e;
    }

    public final hz d() {
        return this.f32871c;
    }

    public final rl1 e() {
        return this.f32869a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s42)) {
            return false;
        }
        s42 s42Var = (s42) obj;
        return kotlin.jvm.internal.l.b(this.f32869a, s42Var.f32869a) && kotlin.jvm.internal.l.b(this.f32870b, s42Var.f32870b) && kotlin.jvm.internal.l.b(this.f32871c, s42Var.f32871c) && kotlin.jvm.internal.l.b(this.f32872d, s42Var.f32872d) && kotlin.jvm.internal.l.b(this.f32873e, s42Var.f32873e);
    }

    public final int hashCode() {
        return this.f32873e.hashCode() + ((this.f32872d.hashCode() + ((this.f32871c.hashCode() + ((this.f32870b.hashCode() + (this.f32869a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TimeProviderContainer(progressIncrementer=" + this.f32869a + ", adBlockDurationProvider=" + this.f32870b + ", defaultContentDelayProvider=" + this.f32871c + ", closableAdChecker=" + this.f32872d + ", closeTimerProgressIncrementer=" + this.f32873e + ")";
    }

    public s42(rl1 progressIncrementer, InterfaceC4216v1 adBlockDurationProvider, hz defaultContentDelayProvider, ep closableAdChecker, up closeTimerProgressIncrementer) {
        kotlin.jvm.internal.l.f(progressIncrementer, "progressIncrementer");
        kotlin.jvm.internal.l.f(adBlockDurationProvider, "adBlockDurationProvider");
        kotlin.jvm.internal.l.f(defaultContentDelayProvider, "defaultContentDelayProvider");
        kotlin.jvm.internal.l.f(closableAdChecker, "closableAdChecker");
        kotlin.jvm.internal.l.f(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        this.f32869a = progressIncrementer;
        this.f32870b = adBlockDurationProvider;
        this.f32871c = defaultContentDelayProvider;
        this.f32872d = closableAdChecker;
        this.f32873e = closeTimerProgressIncrementer;
    }
}
