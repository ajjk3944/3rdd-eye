package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class ms1<V extends ViewGroup> implements w00<V> {

    /* renamed from: a, reason: collision with root package name */
    private final C4070a1 f30500a;

    /* renamed from: b, reason: collision with root package name */
    private final a52 f30501b;

    /* renamed from: c, reason: collision with root package name */
    private final t91 f30502c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4077b1 f30503d;

    public static final class a implements InterfaceC4077b1 {

        /* renamed from: a, reason: collision with root package name */
        private final t91 f30504a;

        public a(t91 nativeRewardViewController) {
            kotlin.jvm.internal.l.f(nativeRewardViewController, "nativeRewardViewController");
            this.f30504a = nativeRewardViewController;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4077b1
        public final void a() {
            this.f30504a.c();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4077b1
        public final void b() {
            this.f30504a.b();
        }
    }

    public /* synthetic */ ms1(C4070a1 c4070a1, b52 b52Var, c91 c91Var, s42 s42Var) {
        t91 t91Var = new t91(b52Var, c91Var, s42Var);
        this(c4070a1, b52Var, c91Var, s42Var, t91Var, new a(t91Var));
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        kotlin.jvm.internal.l.f(container, "container");
        this.f30500a.a(this.f30503d);
        this.f30502c.a(this.f30501b.b(container));
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
        this.f30500a.b(this.f30503d);
        this.f30502c.a();
    }

    public ms1(C4070a1 adActivityEventController, b52 timerViewProvider, c91 nativeMediaContent, s42 timeProviderContainer, t91 nativeRewardViewController, InterfaceC4077b1 adActivityFocusListener) {
        kotlin.jvm.internal.l.f(adActivityEventController, "adActivityEventController");
        kotlin.jvm.internal.l.f(timerViewProvider, "timerViewProvider");
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        kotlin.jvm.internal.l.f(nativeRewardViewController, "nativeRewardViewController");
        kotlin.jvm.internal.l.f(adActivityFocusListener, "adActivityFocusListener");
        this.f30500a = adActivityEventController;
        this.f30501b = timerViewProvider;
        this.f30502c = nativeRewardViewController;
        this.f30503d = adActivityFocusListener;
    }
}
