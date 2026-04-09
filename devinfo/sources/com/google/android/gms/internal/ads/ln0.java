package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ln0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13553a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13554b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13555c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13556d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f13557e;

    public ln0(String str, String str2, String str3, String str4, Long l10) {
        this.f13553a = str;
        this.f13554b = str2;
        this.f13555c = str3;
        this.f13556d = str4;
        this.f13557e = l10;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((t50) obj).f16705a;
        mq0.V("gmp_app_id", this.f13553a, bundle);
        mq0.V("fbs_aiid", this.f13554b, bundle);
        mq0.V("fbs_aeid", this.f13555c, bundle);
        mq0.V("apm_id_origin", this.f13556d, bundle);
        Long l10 = this.f13557e;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        mq0.V("fbs_aeid", this.f13555c, ((t50) obj).f16706b);
    }
}
