package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class i51 implements InterfaceC4132j0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f28495a;

    /* renamed from: b, reason: collision with root package name */
    private lt f28496b;

    public /* synthetic */ i51() {
        this(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(i51 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        lt ltVar = this$0.f28496b;
        if (ltVar != null) {
            ltVar.onReturnedToApplication();
        }
    }

    public final void a() {
        this.f28495a.post(new Z(this, 5));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4132j0
    public final void onLeftApplication() {
        this.f28495a.post(new J2(this, 6));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4132j0
    public final void onReturnedToApplication() {
        this.f28495a.post(new P0(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(i51 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        lt ltVar = this$0.f28496b;
        if (ltVar != null) {
            ltVar.closeNativeAd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(i51 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        lt ltVar = this$0.f28496b;
        if (ltVar != null) {
            ltVar.onAdClicked();
        }
        lt ltVar2 = this$0.f28496b;
        if (ltVar2 != null) {
            ltVar2.onLeftApplication();
        }
    }

    public i51(Handler handler) {
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f28495a = handler;
    }

    public final void a(C4108f4 c4108f4) {
        this.f28495a.post(new L4(8, this, c4108f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(i51 this$0, C4108f4 c4108f4) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        lt ltVar = this$0.f28496b;
        if (ltVar != null) {
            ltVar.a(c4108f4);
        }
    }

    public final void a(lt ltVar) {
        this.f28496b = ltVar;
    }
}
