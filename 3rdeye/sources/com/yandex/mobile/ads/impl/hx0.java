package com.yandex.mobile.ads.impl;

import b9.m;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.model.MediatedAdObject;

/* loaded from: classes3.dex */
public final class hx0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.monetization.ads.mediation.base.a f28409a;

    public hx0(com.monetization.ads.mediation.base.a mediatedAd) {
        kotlin.jvm.internal.l.f(mediatedAd, "mediatedAd");
        this.f28409a = mediatedAd;
    }

    public final MediatedAdObject a() {
        Object objA;
        try {
            objA = this.f28409a.getAdObject();
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (objA instanceof m.a) {
            objA = null;
        }
        return (MediatedAdObject) objA;
    }

    public final MediatedAdapterInfo b() {
        Object objA;
        try {
            objA = this.f28409a.getAdapterInfo();
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) != null) {
            objA = new MediatedAdapterInfo.Builder().setAdapterVersion("null").setNetworkName("null").setNetworkSdkVersion("null").build();
        }
        return (MediatedAdapterInfo) objA;
    }

    public final boolean c() {
        Object objA;
        try {
            objA = Boolean.valueOf(this.f28409a.getShouldTrackImpressionAutomatically());
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) != null) {
            objA = Boolean.TRUE;
        }
        return ((Boolean) objA).booleanValue();
    }
}
