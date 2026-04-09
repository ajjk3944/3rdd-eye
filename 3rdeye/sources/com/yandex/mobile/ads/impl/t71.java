package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class t71 {

    /* renamed from: a, reason: collision with root package name */
    private final de2 f33472a;

    /* renamed from: b, reason: collision with root package name */
    private final c91 f33473b;

    public t71(de2 videoEventController, c91 nativeMediaContent) {
        kotlin.jvm.internal.l.f(videoEventController, "videoEventController");
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        this.f33472a = videoEventController;
        this.f33473b = nativeMediaContent;
    }

    public final u71 a() {
        ta1 ta1VarA = this.f33473b.a();
        if (ta1VarA == null) {
            return null;
        }
        de2 de2Var = this.f33472a;
        return new u71(ta1VarA, de2Var, de2Var);
    }
}
