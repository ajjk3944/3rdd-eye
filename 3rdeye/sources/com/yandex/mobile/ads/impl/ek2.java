package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2097r;
import java.util.List;

/* loaded from: classes3.dex */
public final class ek2 {

    /* renamed from: a, reason: collision with root package name */
    private final jk2 f26882a;

    /* renamed from: b, reason: collision with root package name */
    private final kd2 f26883b;

    /* renamed from: c, reason: collision with root package name */
    private final zj2 f26884c;

    public /* synthetic */ ek2(Context context, za2 za2Var) {
        this(context, za2Var, new jk2(za2Var), new kd2(), new zj2(context, za2Var));
    }

    public final List<za2> a(List<za2> videoAds) {
        kotlin.jvm.internal.l.f(videoAds, "videoAds");
        hk2 hk2VarA = this.f26882a.a();
        if (hk2VarA == null) {
            return videoAds;
        }
        if (!hk2VarA.a()) {
            this.f26883b.getClass();
            videoAds = kd2.a(videoAds).a();
        }
        if (!hk2VarA.b()) {
            videoAds = C2097r.D0(1, videoAds);
        }
        return this.f26884c.a(videoAds);
    }

    public ek2(Context context, za2 wrapperAd, jk2 wrapperConfigurationProvider, kd2 wrappersProviderFactory, zj2 wrappedVideoAdCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(wrapperAd, "wrapperAd");
        kotlin.jvm.internal.l.f(wrapperConfigurationProvider, "wrapperConfigurationProvider");
        kotlin.jvm.internal.l.f(wrappersProviderFactory, "wrappersProviderFactory");
        kotlin.jvm.internal.l.f(wrappedVideoAdCreator, "wrappedVideoAdCreator");
        this.f26882a = wrapperConfigurationProvider;
        this.f26883b = wrappersProviderFactory;
        this.f26884c = wrappedVideoAdCreator;
    }
}
