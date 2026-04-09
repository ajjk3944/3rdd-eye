package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class mn0 implements fo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f30458a;

    /* renamed from: b, reason: collision with root package name */
    private fl0 f30459b;

    public /* synthetic */ mn0() {
        this(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(mn0 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        fl0 fl0Var = this$0.f30459b;
        if (fl0Var != null) {
            fl0Var.onInstreamAdPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(mn0 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        fl0 fl0Var = this$0.f30459b;
        if (fl0Var != null) {
            fl0Var.onInstreamAdCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.impl.fo0
    public final void onInstreamAdPrepared() {
        this.f30458a.post(new J2(this, 8));
    }

    public mn0(Handler handler) {
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f30458a = handler;
    }

    @Override // com.yandex.mobile.ads.impl.fo0
    public final void a() {
        this.f30458a.post(new P0(this, 7));
    }

    @Override // com.yandex.mobile.ads.impl.fo0
    public final void b() {
        this.f30458a.post(new N(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(mn0 this$0, String reason) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(reason, "$reason");
        fl0 fl0Var = this$0.f30459b;
        if (fl0Var != null) {
            fl0Var.onError(reason);
        }
    }

    public final void a(sl2 sl2Var) {
        this.f30459b = sl2Var;
    }
}
