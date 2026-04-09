package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class Hs implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final String f9011a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9012b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9013c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9014d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f9015e;

    public Hs(String str, String str2, String str3, String str4, Long l2) {
        this.f9011a = str;
        this.f9012b = str2;
        this.f9013c = str3;
        this.f9014d = str4;
        this.f9015e = l2;
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12308a;
        AbstractC0582Jp.X("gmp_app_id", bundle, this.f9011a);
        AbstractC0582Jp.X("fbs_aiid", bundle, this.f9012b);
        AbstractC0582Jp.X("fbs_aeid", bundle, this.f9013c);
        AbstractC0582Jp.X("apm_id_origin", bundle, this.f9014d);
        Long l2 = this.f9015e;
        if (l2 != null) {
            bundle.putLong("sai_timeout", l2.longValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        AbstractC0582Jp.X("fbs_aeid", ((C0797Wj) obj).f12309b, this.f9013c);
    }
}
