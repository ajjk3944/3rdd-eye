package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class q11 implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r11 f15190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zy0 f15191c;

    public /* synthetic */ q11(r11 r11Var, zy0 zy0Var, int i4) {
        this.f15189a = i4;
        this.f15190b = r11Var;
        this.f15191c = zy0Var;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) {
        switch (this.f15189a) {
            case 0:
                r11 r11Var = this.f15190b;
                h91 h91VarA = r11Var.f15502a.a(this.f15191c);
                r11Var.f15505d.e(20303, h91VarA);
                return h91VarA;
            default:
                r11 r11Var2 = this.f15190b;
                h91 h91VarA2 = r11Var2.f15502a.a(this.f15191c);
                r11Var2.f15505d.e(20303, h91VarA2);
                return h91VarA2;
        }
    }
}
