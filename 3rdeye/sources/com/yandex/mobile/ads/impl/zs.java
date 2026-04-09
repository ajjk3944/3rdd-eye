package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zs {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f36603a;

    /* renamed from: b, reason: collision with root package name */
    private final List<mb2<tn0>> f36604b;

    /* renamed from: c, reason: collision with root package name */
    private final List<tn0> f36605c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36606d;

    /* renamed from: e, reason: collision with root package name */
    private final C4078b2 f36607e;

    /* renamed from: f, reason: collision with root package name */
    private final at f36608f;

    /* renamed from: g, reason: collision with root package name */
    private final long f36609g;

    public zs(vu1 sdkEnvironmentModule, ArrayList videoAdInfoList, ArrayList videoAds, String type, C4078b2 adBreak, at adBreakPosition, long j4) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(videoAdInfoList, "videoAdInfoList");
        kotlin.jvm.internal.l.f(videoAds, "videoAds");
        kotlin.jvm.internal.l.f(type, "type");
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(adBreakPosition, "adBreakPosition");
        this.f36603a = sdkEnvironmentModule;
        this.f36604b = videoAdInfoList;
        this.f36605c = videoAds;
        this.f36606d = type;
        this.f36607e = adBreak;
        this.f36608f = adBreakPosition;
        this.f36609g = j4;
    }

    public final void a(vz vzVar) {
    }

    public final at b() {
        return this.f36608f;
    }

    public final vz c() {
        return null;
    }

    public final vu1 d() {
        return this.f36603a;
    }

    public final String e() {
        return this.f36606d;
    }

    public final List<mb2<tn0>> f() {
        return this.f36604b;
    }

    public final List<tn0> g() {
        return this.f36605c;
    }

    public final String toString() {
        return Oo.d(this.f36609g, "ad_break_#");
    }

    public final C4078b2 a() {
        return this.f36607e;
    }
}
