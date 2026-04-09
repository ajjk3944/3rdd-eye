package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t20 f13972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13973c;

    public /* synthetic */ mo(t20 t20Var, String str, int i4) {
        this.f13971a = i4;
        this.f13972b = t20Var;
        this.f13973c = str;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) {
        int i4 = this.f13971a;
        String str = this.f13973c;
        t20 t20Var = this.f13972b;
        switch (i4) {
            case 0:
                String str2 = (String) obj;
                io ioVar = no.f14362a;
                return (((Boolean) va.s.f36163e.f36166c.a(sk.f16261ob)).booleanValue() && t20Var != null && t20.b(str)) ? t20Var.a(str2, va.r.g.f36161e) : yo0.e(str2);
            default:
                ((ex) t20Var.f16674e).c(new s20(t20Var, (Throwable) obj, 1));
                return yo0.e(str);
        }
    }
}
