package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class dm0 {

    /* renamed from: a, reason: collision with root package name */
    private final xs f26252a;

    /* renamed from: b, reason: collision with root package name */
    private final cm0 f26253b;

    /* renamed from: c, reason: collision with root package name */
    private bm0 f26254c;

    public /* synthetic */ dm0(xs xsVar, te2 te2Var) {
        this(xsVar, te2Var, new cm0(te2Var));
    }

    public final bm0 a() {
        bm0 bm0Var = this.f26254c;
        if (bm0Var != null) {
            return bm0Var;
        }
        bm0 bm0VarA = this.f26253b.a(this.f26252a.a());
        this.f26254c = bm0VarA;
        return bm0VarA;
    }

    public dm0(xs instreamVideoAd, te2 videoPlayerController, cm0 instreamAdPlaylistCreator) {
        kotlin.jvm.internal.l.f(instreamVideoAd, "instreamVideoAd");
        kotlin.jvm.internal.l.f(videoPlayerController, "videoPlayerController");
        kotlin.jvm.internal.l.f(instreamAdPlaylistCreator, "instreamAdPlaylistCreator");
        this.f26252a = instreamVideoAd;
        this.f26253b = instreamAdPlaylistCreator;
    }
}
