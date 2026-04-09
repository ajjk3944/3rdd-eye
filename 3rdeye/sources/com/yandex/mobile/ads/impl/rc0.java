package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class rc0 implements te1 {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f32589c;

    /* renamed from: a, reason: collision with root package name */
    private n82 f32590a;

    /* renamed from: b, reason: collision with root package name */
    private final ao1 f32591b = bo1.a();

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(rc0.class, "contentCloseListener", "getContentCloseListener()Lcom/monetization/ads/fullscreen/content/ContentCloseListener;");
        kotlin.jvm.internal.x.f43661a.getClass();
        f32589c = new w9.i[]{nVar};
    }

    @Override // com.yandex.mobile.ads.impl.te1
    public final void a(boolean z10) {
        n82 n82Var = this.f32590a;
        if (n82Var != null) {
            n82Var.a(z10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.te1
    public final void c() {
        tr trVar = (tr) this.f32591b.getValue(this, f32589c[0]);
        if (trVar != null) {
            trVar.f();
        }
    }

    public final void a(tr trVar) {
        this.f32591b.setValue(this, f32589c[0], trVar);
    }

    public final void a(uc0 useCustomCloseListener) {
        kotlin.jvm.internal.l.f(useCustomCloseListener, "useCustomCloseListener");
        this.f32590a = useCustomCloseListener;
    }
}
