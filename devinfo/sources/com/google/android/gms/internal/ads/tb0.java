package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb0 implements m00 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ub0 f16771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qz f16772c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi f16773d;

    public /* synthetic */ tb0(ub0 ub0Var, qz qzVar, gi giVar, int i4) {
        this.f16770a = i4;
        this.f16771b = ub0Var;
        this.f16772c = qzVar;
        this.f16773d = giVar;
    }

    @Override // com.google.android.gms.internal.ads.m00
    public final void p(String str, int i4, String str2, boolean z3) {
        switch (this.f16770a) {
            case 0:
                ub0 ub0Var = this.f16771b;
                gi giVar = this.f16773d;
                if (!z3) {
                    ub0Var.getClass();
                    int length = String.valueOf(i4).length();
                    StringBuilder sb2 = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb2.append("Html video Web View failed to load. Error code: ");
                    sb2.append(i4);
                    sb2.append(", Description: ");
                    sb2.append(str);
                    giVar.d(new qj0(1, d.h.w(sb2, ", Failing URL: ", str2)));
                    break;
                } else {
                    va.x2 x2Var = ub0Var.f17139a.f11941a;
                    if (x2Var != null) {
                        qz qzVar = this.f16772c;
                        if (qzVar.z1() != null) {
                            qzVar.z1().i4(x2Var);
                        }
                    }
                    giVar.e();
                    break;
                }
            default:
                ub0 ub0Var2 = this.f16771b;
                ub0Var2.getClass();
                hq0 hq0Var = ub0Var2.f17139a;
                boolean zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(sk.E4)).booleanValue();
                qz qzVar2 = this.f16772c;
                gi giVar2 = this.f16773d;
                if (!zBooleanValue) {
                    va.x2 x2Var2 = hq0Var.f11941a;
                    if (x2Var2 != null && qzVar2.z1() != null) {
                        qzVar2.z1().i4(x2Var2);
                    }
                    giVar2.e();
                    break;
                } else if (!z3) {
                    int length2 = String.valueOf(i4).length();
                    StringBuilder sb3 = new StringBuilder(length2 + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb3.append("Native Video WebView failed to load. Error code: ");
                    sb3.append(i4);
                    sb3.append(", Description: ");
                    sb3.append(str);
                    giVar2.d(new qj0(1, d.h.w(sb3, ", Failing URL: ", str2)));
                    break;
                } else {
                    va.x2 x2Var3 = hq0Var.f11941a;
                    if (x2Var3 != null && qzVar2.z1() != null) {
                        qzVar2.z1().i4(x2Var3);
                    }
                    giVar2.e();
                    break;
                }
                break;
        }
    }
}
