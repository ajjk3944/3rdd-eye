package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class ur<V extends ViewGroup> implements w00<V> {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f34180a;

    /* renamed from: b, reason: collision with root package name */
    private final C4070a1 f34181b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4224w2 f34182c;

    /* renamed from: d, reason: collision with root package name */
    private final c91 f34183d;

    /* renamed from: e, reason: collision with root package name */
    private final s42 f34184e;

    /* renamed from: f, reason: collision with root package name */
    private final w20 f34185f;

    /* renamed from: g, reason: collision with root package name */
    private final wr f34186g;

    /* renamed from: h, reason: collision with root package name */
    private final hr0 f34187h;
    private sc0 i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC4077b1 f34188j;

    public final class a implements InterfaceC4077b1 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4077b1
        public final void a() {
            sc0 sc0Var = ((ur) ur.this).i;
            if (sc0Var != null) {
                sc0Var.resume();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4077b1
        public final void b() {
            sc0 sc0Var = ((ur) ur.this).i;
            if (sc0Var != null) {
                sc0Var.pause();
            }
        }
    }

    public /* synthetic */ ur(a8 a8Var, C4070a1 c4070a1, InterfaceC4224w2 interfaceC4224w2, c91 c91Var, s42 s42Var, w20 w20Var) {
        this(a8Var, c4070a1, interfaceC4224w2, c91Var, s42Var, w20Var, new wr(), new hr0(0));
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
        InterfaceC4077b1 interfaceC4077b1 = this.f34188j;
        if (interfaceC4077b1 != null) {
            this.f34181b.b(interfaceC4077b1);
        }
        sc0 sc0Var = this.i;
        if (sc0Var != null) {
            sc0Var.invalidate();
        }
        this.f34187h.b();
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        kotlin.jvm.internal.l.f(container, "container");
        a aVar = new a();
        this.f34181b.a(aVar);
        this.f34188j = aVar;
        this.f34187h.a(container);
        wr wrVar = this.f34186g;
        a8<?> adResponse = this.f34180a;
        InterfaceC4224w2 adCompleteListener = this.f34182c;
        c91 nativeMediaContent = this.f34183d;
        s42 timeProviderContainer = this.f34184e;
        w20 w20Var = this.f34185f;
        hr0 progressListener = this.f34187h;
        wrVar.getClass();
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adCompleteListener, "adCompleteListener");
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        kotlin.jvm.internal.l.f(progressListener, "progressListener");
        sc0 sc0VarA = new vr(adResponse, adCompleteListener, nativeMediaContent, timeProviderContainer, w20Var, progressListener).a();
        sc0VarA.start();
        this.i = sc0VarA;
    }

    public ur(a8<?> adResponse, C4070a1 adActivityEventController, InterfaceC4224w2 adCompleteListener, c91 nativeMediaContent, s42 timeProviderContainer, w20 w20Var, wr contentCompleteControllerProvider, hr0 progressListener) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adActivityEventController, "adActivityEventController");
        kotlin.jvm.internal.l.f(adCompleteListener, "adCompleteListener");
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        kotlin.jvm.internal.l.f(contentCompleteControllerProvider, "contentCompleteControllerProvider");
        kotlin.jvm.internal.l.f(progressListener, "progressListener");
        this.f34180a = adResponse;
        this.f34181b = adActivityEventController;
        this.f34182c = adCompleteListener;
        this.f34183d = nativeMediaContent;
        this.f34184e = timeProviderContainer;
        this.f34185f = w20Var;
        this.f34186g = contentCompleteControllerProvider;
        this.f34187h = progressListener;
    }
}
