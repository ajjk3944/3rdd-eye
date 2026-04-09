package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class de2 implements ie2 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f26151a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private eu f26152b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(de2 this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        eu euVar = this$0.f26152b;
        if (euVar != null) {
            euVar.onVideoComplete();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ie2
    public final void onVideoComplete() {
        this.f26151a.post(new J2(this, 3));
    }

    public final void a(fn2 fn2Var) {
        this.f26152b = fn2Var;
    }
}
