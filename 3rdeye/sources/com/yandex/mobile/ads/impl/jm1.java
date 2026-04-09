package com.yandex.mobile.ads.impl;

import C.RunnableC0615b;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class jm1 implements hd0 {

    /* renamed from: a, reason: collision with root package name */
    private final gd0 f29216a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f29217b;

    /* renamed from: c, reason: collision with root package name */
    private ps f29218c;

    public /* synthetic */ jm1(gd0 gd0Var) {
        this(gd0Var, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(jm1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        ps psVar = this$0.f29218c;
        if (psVar != null) {
            psVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(jm1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        ps psVar = this$0.f29218c;
        if (psVar != null) {
            psVar.onAdShown();
        }
        gd0 gd0Var = this$0.f29216a;
        if (gd0Var != null) {
            gd0Var.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.hd0
    public final void onAdClicked() {
        this.f29217b.post(new N(this, 5));
    }

    @Override // com.yandex.mobile.ads.impl.hd0
    public final void onAdDismissed() {
        this.f29217b.post(new Z(this, 6));
    }

    @Override // com.yandex.mobile.ads.impl.hd0
    public final void onAdShown() {
        this.f29217b.post(new P0(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(jm1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        ps psVar = this$0.f29218c;
        if (psVar != null) {
            psVar.onAdDismissed();
        }
    }

    public jm1(gd0 gd0Var, Handler handler) {
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f29216a = gd0Var;
        this.f29217b = handler;
    }

    public final void a(c6 adPresentationError) {
        kotlin.jvm.internal.l.f(adPresentationError, "adPresentationError");
        this.f29217b.post(new RunnableC0615b(26, adPresentationError, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(c6 adPresentationError, jm1 this$0) {
        kotlin.jvm.internal.l.f(adPresentationError, "$adPresentationError");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        zx1 zx1Var = new zx1(adPresentationError.a());
        ps psVar = this$0.f29218c;
        if (psVar != null) {
            psVar.a(zx1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.hd0
    public final void a(C4108f4 c4108f4) {
        this.f29217b.post(new L4(12, this, c4108f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(jm1 this$0, C4108f4 c4108f4) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        ps psVar = this$0.f29218c;
        if (psVar != null) {
            psVar.a(c4108f4);
        }
    }

    public final void a(dl2 dl2Var) {
        this.f29218c = dl2Var;
    }
}
