package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class ap1 {

    /* renamed from: a, reason: collision with root package name */
    private final eg2 f24784a;

    /* renamed from: b, reason: collision with root package name */
    private final ml f24785b;

    /* renamed from: c, reason: collision with root package name */
    private final cp1 f24786c;

    /* renamed from: d, reason: collision with root package name */
    private final yo1 f24787d;

    public ap1(eg2 videoViewAdapter, gp1 replayController) {
        kotlin.jvm.internal.l.f(videoViewAdapter, "videoViewAdapter");
        kotlin.jvm.internal.l.f(replayController, "replayController");
        this.f24784a = videoViewAdapter;
        this.f24785b = new ml();
        this.f24786c = new cp1(videoViewAdapter, replayController);
        this.f24787d = new yo1();
    }

    public final void a() {
        ob1 ob1VarB = this.f24784a.b();
        if (ob1VarB != null) {
            bp1 bp1VarB = ob1VarB.a().b();
            this.f24786c.a(bp1VarB);
            Bitmap bitmap = ob1VarB.c().getBitmap();
            if (bitmap != null) {
                this.f24785b.a(bitmap, new zo1(this, ob1VarB, bp1VarB));
            }
        }
    }
}
