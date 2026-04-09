package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class en0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10830a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f10831b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10832c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10833d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10834e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10835f;

    public en0(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f10830a = str;
        this.f10831b = num;
        this.f10832c = str2;
        this.f10833d = str3;
        this.f10834e = str4;
        this.f10835f = str5;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) {
        Bundle bundle = ((t50) obj).f16705a;
        mq0.V("pn", this.f10830a, bundle);
        Integer num = this.f10831b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        mq0.V("vnm", this.f10832c, bundle);
        mq0.V("dl", this.f10833d, bundle);
        mq0.V("ins_pn", this.f10834e, bundle);
        mq0.V("ini_pn", this.f10835f, bundle);
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        Bundle bundle = ((t50) obj).f16706b;
        mq0.V("pn", this.f10830a, bundle);
        mq0.V("dl", this.f10833d, bundle);
    }
}
