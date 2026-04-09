package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.window.OnBackInvokedCallback;

/* loaded from: classes3.dex */
public final class re1 implements pe1 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f32601a;

    /* renamed from: b, reason: collision with root package name */
    private final C4229x0 f32602b;

    /* renamed from: c, reason: collision with root package name */
    private final OnBackInvokedCallback f32603c;

    public re1(Activity activity, C4229x0 c4229x0) {
        kotlin.jvm.internal.l.f(activity, "activity");
        this.f32601a = activity;
        this.f32602b = c4229x0;
        this.f32603c = new OnBackInvokedCallback() { // from class: com.yandex.mobile.ads.impl.H3
            public final void onBackInvoked() {
                re1.a(this.f24132a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(re1 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        C4229x0 c4229x0 = this$0.f32602b;
        if (c4229x0 == null || !c4229x0.c()) {
            return;
        }
        this$0.f32601a.finish();
    }

    @Override // com.yandex.mobile.ads.impl.pe1
    public final void destroy() {
        this.f32601a.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f32603c);
    }

    @Override // com.yandex.mobile.ads.impl.pe1
    public final void a() {
        this.f32601a.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f32603c);
    }
}
