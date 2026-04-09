package com.yandex.mobile.ads.impl;

import androidx.media3.common.util.Util;

/* loaded from: classes3.dex */
public final class ya {

    /* renamed from: a, reason: collision with root package name */
    private final jl f35675a;

    /* renamed from: b, reason: collision with root package name */
    private final C4074a5 f35676b;

    /* renamed from: c, reason: collision with root package name */
    private final be2 f35677c;

    /* renamed from: d, reason: collision with root package name */
    private final nj1 f35678d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f35679e;

    public ya(jl bindingControllerHolder, C4074a5 adPlaybackStateController, be2 videoDurationHolder, nj1 positionProviderHolder) {
        kotlin.jvm.internal.l.f(bindingControllerHolder, "bindingControllerHolder");
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        this.f35675a = bindingControllerHolder;
        this.f35676b = adPlaybackStateController;
        this.f35677c = videoDurationHolder;
        this.f35678d = positionProviderHolder;
    }

    public final boolean a() {
        return this.f35679e;
    }

    public final void b() {
        fl flVarA = this.f35675a.a();
        if (flVarA != null) {
            ii1 ii1VarB = this.f35678d.b();
            if (ii1VarB == null) {
                fp0.b(new Object[0]);
                return;
            }
            this.f35679e = true;
            int adGroupIndexForPositionUs = this.f35676b.a().getAdGroupIndexForPositionUs(Util.msToUs(ii1VarB.a()), Util.msToUs(this.f35677c.a()));
            if (adGroupIndexForPositionUs == -1) {
                flVarA.a();
            } else if (adGroupIndexForPositionUs == this.f35676b.a().adGroupCount) {
                this.f35675a.c();
            } else {
                flVarA.a();
            }
        }
    }
}
