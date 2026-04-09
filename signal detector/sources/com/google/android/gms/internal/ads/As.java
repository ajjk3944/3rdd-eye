package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class As implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final String f7058a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f7059b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7060c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7061d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7062e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7063f;

    public As(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f7058a = str;
        this.f7059b = num;
        this.f7060c = str2;
        this.f7061d = str3;
        this.f7062e = str4;
        this.f7063f = str5;
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void b(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12308a;
        AbstractC0582Jp.X("pn", bundle, this.f7058a);
        Integer num = this.f7059b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        AbstractC0582Jp.X("vnm", bundle, this.f7060c);
        AbstractC0582Jp.X("dl", bundle, this.f7061d);
        AbstractC0582Jp.X("ins_pn", bundle, this.f7062e);
        AbstractC0582Jp.X("ini_pn", bundle, this.f7063f);
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12309b;
        AbstractC0582Jp.X("pn", bundle, this.f7058a);
        AbstractC0582Jp.X("dl", bundle, this.f7061d);
    }
}
