package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class ep1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final eg2 f26977a;

    /* renamed from: b, reason: collision with root package name */
    private final gp1 f26978b;

    /* renamed from: c, reason: collision with root package name */
    private final cp1 f26979c;

    public ep1(eg2 videoViewAdapter, gp1 replayController, cp1 replayViewConfigurator) {
        kotlin.jvm.internal.l.f(videoViewAdapter, "videoViewAdapter");
        kotlin.jvm.internal.l.f(replayController, "replayController");
        kotlin.jvm.internal.l.f(replayViewConfigurator, "replayViewConfigurator");
        this.f26977a = videoViewAdapter;
        this.f26978b = replayController;
        this.f26979c = replayViewConfigurator;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        kotlin.jvm.internal.l.f(v10, "v");
        ob1 ob1VarB = this.f26977a.b();
        if (ob1VarB != null) {
            bp1 bp1VarB = ob1VarB.a().b();
            this.f26979c.getClass();
            cp1.b(bp1VarB);
            this.f26978b.a(ob1VarB);
        }
    }
}
