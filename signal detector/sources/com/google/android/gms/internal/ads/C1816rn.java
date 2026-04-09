package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1816rn implements InterfaceC0619Mb {

    /* renamed from: a, reason: collision with root package name */
    public final C2191yk f16614a;

    /* renamed from: b, reason: collision with root package name */
    public final C0520Ge f16615b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16616c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16617d;

    public C1816rn(C2191yk c2191yk, Qt qt) {
        this.f16614a = c2191yk;
        this.f16615b = qt.f10777l;
        this.f16616c = qt.f10773j;
        this.f16617d = qt.f10775k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0619Mb
    public final void N(C0520Ge c0520Ge) {
        int i;
        String str;
        C0520Ge c0520Ge2 = this.f16615b;
        if (c0520Ge2 != null) {
            c0520Ge = c0520Ge2;
        }
        if (c0520Ge != null) {
            str = c0520Ge.f8406a;
            i = c0520Ge.f8407b;
        } else {
            i = 1;
            str = "";
        }
        BinderC2185ye binderC2185ye = new BinderC2185ye(str, i);
        C2191yk c2191yk = this.f16614a;
        c2191yk.getClass();
        c2191yk.C1(new C1338iu(binderC2185ye, this.f16616c, this.f16617d, 14, false));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0619Mb
    public final void a() {
        this.f16614a.C1(C1652ok.f16044g);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0619Mb
    public final void s() {
        this.f16614a.C1(C1652ok.f16045h);
    }
}
