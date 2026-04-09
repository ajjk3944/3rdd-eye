package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class eo1 extends ag0 implements kh2 {

    /* renamed from: A, reason: collision with root package name */
    private boolean f26970A;

    /* renamed from: B, reason: collision with root package name */
    private final a f26971B;

    /* renamed from: y, reason: collision with root package name */
    private final ap0 f26972y;

    /* renamed from: z, reason: collision with root package name */
    private final ga f26973z;

    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            fp0.d(new Object[0]);
            eo1.this.b(eo1.this.f().a());
        }
    }

    public /* synthetic */ eo1(Context context, ap0 ap0Var, C4198s4 c4198s4) {
        this(context, ap0Var, c4198s4, new ga(ap0Var));
    }

    private final void y() {
        fp0.d(new Object[0]);
        m().removeCallbacks(this.f26971B);
        fp0.d(new Object[0]);
        a8<String> a8VarK = k();
        if (a8VarK != null && a8VarK.T() && this.f26970A && !o() && this.f26973z.b()) {
            m().postDelayed(this.f26971B, a8VarK.g());
            fp0.d(Integer.valueOf(a8VarK.h()));
        }
    }

    @Override // com.yandex.mobile.ads.impl.vj, com.yandex.mobile.ads.impl.ah1.b
    public final void a(xg1 phoneState) {
        kotlin.jvm.internal.l.f(phoneState, "phoneState");
        super.a(phoneState);
        y();
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final void b(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        super.b(error);
        if (5 == error.b() || 2 == error.b()) {
            return;
        }
        y();
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public void d() {
        super.d();
        this.f26972y.removeVisibilityChangeListener(this);
        fp0.d(new Object[0]);
        this.f26970A = false;
        m().removeCallbacks(this.f26971B);
        fp0.d(new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final void s() {
        super.s();
        y();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo1(Context context, ap0 adView, C4198s4 adLoadingPhasesManager, ga adViewVisibilityValidator) {
        super(context, adView.getAdConfiguration$mobileads_externalRelease(), adLoadingPhasesManager);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adView, "adView");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(adViewVisibilityValidator, "adViewVisibilityValidator");
        this.f26972y = adView;
        this.f26973z = adViewVisibilityValidator;
        this.f26970A = true;
        this.f26971B = new a();
        adView.addVisibilityChangeListener(this);
    }

    @Override // com.yandex.mobile.ads.impl.kh2
    public final void a(int i) {
        y();
    }
}
