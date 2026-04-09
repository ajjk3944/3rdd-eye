package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class nm1 implements hd0, js1 {

    /* renamed from: a, reason: collision with root package name */
    private final gd0 f30937a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f30938b;

    /* renamed from: c, reason: collision with root package name */
    private au f30939c;

    public /* synthetic */ nm1(gd0 gd0Var) {
        this(gd0Var, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nm1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        au auVar = this$0.f30939c;
        if (auVar != null) {
            auVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(nm1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        au auVar = this$0.f30939c;
        if (auVar != null) {
            auVar.onAdShown();
        }
        gd0 gd0Var = this$0.f30937a;
        if (gd0Var != null) {
            gd0Var.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.hd0
    public final void onAdClicked() {
        this.f30938b.post(new J2(this, 9));
    }

    @Override // com.yandex.mobile.ads.impl.hd0
    public final void onAdDismissed() {
        this.f30938b.post(new Z(this, 10));
    }

    @Override // com.yandex.mobile.ads.impl.hd0
    public final void onAdShown() {
        this.f30938b.post(new P0(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(nm1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        au auVar = this$0.f30939c;
        if (auVar != null) {
            auVar.onAdDismissed();
        }
    }

    public nm1(gd0 gd0Var, Handler handler) {
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f30937a = gd0Var;
        this.f30938b = handler;
    }

    public final void a(c6 adPresentationError) {
        kotlin.jvm.internal.l.f(adPresentationError, "adPresentationError");
        this.f30938b.post(new I2(5, adPresentationError, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(c6 adPresentationError, nm1 this$0) {
        kotlin.jvm.internal.l.f(adPresentationError, "$adPresentationError");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        zx1 zx1Var = new zx1(adPresentationError.a());
        au auVar = this$0.f30939c;
        if (auVar != null) {
            auVar.a(zx1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.hd0
    public final void a(C4108f4 c4108f4) {
        this.f30938b.post(new V1(11, this, c4108f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nm1 this$0, C4108f4 c4108f4) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        au auVar = this$0.f30939c;
        if (auVar != null) {
            auVar.a(c4108f4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.js1
    public final void a(dw1 reward) {
        kotlin.jvm.internal.l.f(reward, "reward");
        this.f30938b.post(new L4(15, this, reward));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nm1 this$0, pr1 reward) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(reward, "$reward");
        au auVar = this$0.f30939c;
        if (auVar != null) {
            auVar.a(reward);
        }
    }

    public final void a(pm2 pm2Var) {
        this.f30939c = pm2Var;
    }
}
