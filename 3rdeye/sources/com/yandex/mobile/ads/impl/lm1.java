package com.yandex.mobile.ads.impl;

import C.RunnableC0615b;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class lm1 implements hd0 {

    /* renamed from: a, reason: collision with root package name */
    private final gd0 f30047a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f30048b;

    /* renamed from: c, reason: collision with root package name */
    private gt f30049c;

    public /* synthetic */ lm1(gd0 gd0Var) {
        this(gd0Var, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(lm1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        gt gtVar = this$0.f30049c;
        if (gtVar != null) {
            gtVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(lm1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        gt gtVar = this$0.f30049c;
        if (gtVar != null) {
            gtVar.onAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(lm1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        gt gtVar = this$0.f30049c;
        if (gtVar != null) {
            gtVar.onAdShown();
        }
        gd0 gd0Var = this$0.f30047a;
        if (gd0Var != null) {
            gd0Var.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.hd0
    public final void onAdClicked() {
        this.f30048b.post(new I1(this, 0));
    }

    @Override // com.yandex.mobile.ads.impl.hd0
    public final void onAdDismissed() {
        this.f30048b.post(new P0(this, 5));
    }

    @Override // com.yandex.mobile.ads.impl.hd0
    public final void onAdShown() {
        this.f30048b.post(new Z(this, 7));
    }

    public lm1(gd0 gd0Var, Handler handler) {
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f30047a = gd0Var;
        this.f30048b = handler;
    }

    public final void a(c6 adPresentationError) {
        kotlin.jvm.internal.l.f(adPresentationError, "adPresentationError");
        this.f30048b.post(new V1(9, adPresentationError, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(c6 adPresentationError, lm1 this$0) {
        kotlin.jvm.internal.l.f(adPresentationError, "$adPresentationError");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        zx1 zx1Var = new zx1(adPresentationError.a());
        gt gtVar = this$0.f30049c;
        if (gtVar != null) {
            gtVar.a(zx1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.hd0
    public final void a(C4108f4 c4108f4) {
        this.f30048b.post(new RunnableC0615b(28, this, c4108f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(lm1 this$0, C4108f4 c4108f4) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        gt gtVar = this$0.f30049c;
        if (gtVar != null) {
            gtVar.a(c4108f4);
        }
    }

    public final void a(am2 am2Var) {
        this.f30049c = am2Var;
    }
}
