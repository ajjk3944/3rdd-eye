package com.monetization.ads.mediation.base.model;

import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class MediatedAdObject {
    private final Object ad;
    private final MediatedAdObjectInfo info;

    public MediatedAdObject(Object ad, MediatedAdObjectInfo info) {
        l.f(ad, "ad");
        l.f(info, "info");
        this.ad = ad;
        this.info = info;
    }

    public final Object getAd() {
        return this.ad;
    }

    public final MediatedAdObjectInfo getInfo() {
        return this.info;
    }
}
