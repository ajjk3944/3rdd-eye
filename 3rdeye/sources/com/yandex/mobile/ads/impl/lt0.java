package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class lt0 implements ct0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f30099a;

    /* renamed from: b, reason: collision with root package name */
    private ct0 f30100b;

    public /* synthetic */ lt0() {
        this(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(lt0 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        ct0 ct0Var = this$0.f30100b;
        if (ct0Var != null) {
            ct0Var.onInstreamAdBreakCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(lt0 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        ct0 ct0Var = this$0.f30100b;
        if (ct0Var != null) {
            ct0Var.onInstreamAdBreakPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(lt0 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        ct0 ct0Var = this$0.f30100b;
        if (ct0Var != null) {
            ct0Var.onInstreamAdBreakStarted();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ct0
    public final void onInstreamAdBreakCompleted() {
        this.f30099a.post(new J2(this, 7));
    }

    @Override // com.yandex.mobile.ads.impl.ct0
    public final void onInstreamAdBreakError(String reason) {
        kotlin.jvm.internal.l.f(reason, "reason");
        this.f30099a.post(new L4(13, this, reason));
    }

    @Override // com.yandex.mobile.ads.impl.ct0
    public final void onInstreamAdBreakPrepared() {
        this.f30099a.post(new P0(this, 6));
    }

    @Override // com.yandex.mobile.ads.impl.ct0
    public final void onInstreamAdBreakStarted() {
        this.f30099a.post(new Z(this, 8));
    }

    public lt0(Handler handler) {
        kotlin.jvm.internal.l.f(handler, "handler");
        this.f30099a = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(lt0 this$0, String reason) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(reason, "$reason");
        ct0 ct0Var = this$0.f30100b;
        if (ct0Var != null) {
            ct0Var.onInstreamAdBreakError(reason);
        }
    }

    public final void a(pl2 pl2Var) {
        this.f30100b = pl2Var;
    }
}
