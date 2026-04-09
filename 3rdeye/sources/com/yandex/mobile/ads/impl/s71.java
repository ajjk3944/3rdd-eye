package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class s71<V extends ViewGroup> implements w00<V> {

    /* renamed from: a, reason: collision with root package name */
    private final u71 f32886a;

    public /* synthetic */ s71(c91 c91Var, de2 de2Var) {
        this(c91Var, de2Var, new t71(de2Var, c91Var));
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        kotlin.jvm.internal.l.f(container, "container");
        u71 u71Var = this.f32886a;
        if (u71Var != null) {
            u71Var.d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
        u71 u71Var = this.f32886a;
        if (u71Var != null) {
            u71Var.c();
        }
    }

    public s71(c91 nativeMediaContent, de2 videoEventController, t71 contentCompleteControllerFactory) {
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        kotlin.jvm.internal.l.f(videoEventController, "videoEventController");
        kotlin.jvm.internal.l.f(contentCompleteControllerFactory, "contentCompleteControllerFactory");
        this.f32886a = contentCompleteControllerFactory.a();
    }
}
