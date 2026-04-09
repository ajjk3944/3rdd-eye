package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.util.Util;

/* loaded from: classes3.dex */
public final class za {

    /* renamed from: a, reason: collision with root package name */
    private final kl f36259a;

    /* renamed from: b, reason: collision with root package name */
    private final C4081b5 f36260b;

    /* renamed from: c, reason: collision with root package name */
    private final ce2 f36261c;

    /* renamed from: d, reason: collision with root package name */
    private final oj1 f36262d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f36263e;

    public za(kl bindingControllerHolder, C4081b5 adPlaybackStateController, ce2 videoDurationHolder, oj1 positionProviderHolder) {
        kotlin.jvm.internal.l.f(bindingControllerHolder, "bindingControllerHolder");
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        this.f36259a = bindingControllerHolder;
        this.f36260b = adPlaybackStateController;
        this.f36261c = videoDurationHolder;
        this.f36262d = positionProviderHolder;
    }

    public final boolean a() {
        return this.f36263e;
    }

    public final void b() {
        gl glVarA = this.f36259a.a();
        if (glVarA != null) {
            ji1 ji1VarB = this.f36262d.b();
            if (ji1VarB == null) {
                fp0.b(new Object[0]);
                return;
            }
            this.f36263e = true;
            int adGroupIndexForPositionUs = this.f36260b.a().getAdGroupIndexForPositionUs(Util.msToUs(ji1VarB.a()), Util.msToUs(this.f36261c.a()));
            if (adGroupIndexForPositionUs == -1) {
                glVarA.a();
            } else if (adGroupIndexForPositionUs == this.f36260b.a().adGroupCount) {
                this.f36259a.c();
            } else {
                glVarA.a();
            }
        }
    }
}
