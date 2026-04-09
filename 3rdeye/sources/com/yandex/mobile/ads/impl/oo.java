package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class oo {

    /* renamed from: a, reason: collision with root package name */
    private gg f31455a;

    public final void a(View view, String assetName) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(assetName, "assetName");
        gg ggVar = this.f31455a;
        if (ggVar != null) {
            ggVar.a(view, assetName);
        }
    }

    public final void a(gg listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f31455a = listener;
    }
}
