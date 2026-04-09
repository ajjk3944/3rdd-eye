package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xu1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18508a;

    /* renamed from: b, reason: collision with root package name */
    public int f18509b;

    /* renamed from: c, reason: collision with root package name */
    public long f18510c;

    /* renamed from: d, reason: collision with root package name */
    public final jy1 f18511d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18512e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18513f;
    public final /* synthetic */ yu1 g;

    public xu1(yu1 yu1Var, String str, int i4, jy1 jy1Var) {
        this.g = yu1Var;
        this.f18508a = str;
        this.f18509b = i4;
        this.f18510c = jy1Var == null ? -1L : jy1Var.f12878d;
        if (jy1Var == null || !jy1Var.b()) {
            return;
        }
        this.f18511d = jy1Var;
    }

    public final boolean a(uh uhVar, uh uhVar2) {
        jy1 jy1Var;
        int i4 = this.f18509b;
        if (i4 < uhVar.a()) {
            yu1 yu1Var = this.g;
            fh fhVar = yu1Var.f18876a;
            uhVar.b(i4, fhVar, 0L);
            for (int i10 = fhVar.f11172k; i10 <= fhVar.f11173l; i10++) {
                int iE = uhVar2.e(uhVar.f(i10));
                if (iE != -1) {
                    i4 = uhVar2.d(iE, yu1Var.f18877b, false).f16811c;
                    break;
                }
            }
            i4 = -1;
        } else if (i4 >= uhVar2.a()) {
            i4 = -1;
        }
        this.f18509b = i4;
        return i4 != -1 && ((jy1Var = this.f18511d) == null || uhVar2.e(jy1Var.f12875a) != -1);
    }

    public final boolean b(qu1 qu1Var) {
        jy1 jy1Var = qu1Var.f15450d;
        if (jy1Var == null) {
            return this.f18509b != qu1Var.f15449c;
        }
        long j = this.f18510c;
        if (j == -1) {
            return false;
        }
        long j8 = jy1Var.f12878d;
        if (j8 > j) {
            return true;
        }
        jy1 jy1Var2 = this.f18511d;
        if (jy1Var2 == null) {
            return false;
        }
        uh uhVar = qu1Var.f15448b;
        int iE = uhVar.e(jy1Var.f12875a);
        int iE2 = uhVar.e(jy1Var2.f12875a);
        long j9 = jy1Var2.f12878d;
        int i4 = jy1Var2.f12876b;
        if (j8 < j9 || iE < iE2) {
            return false;
        }
        if (iE > iE2) {
            return true;
        }
        if (!jy1Var.b()) {
            int i10 = jy1Var.f12879e;
            return i10 == -1 || i10 > i4;
        }
        int i11 = jy1Var.f12876b;
        int i12 = jy1Var.f12877c;
        if (i11 <= i4) {
            return i11 == i4 && i12 > jy1Var2.f12877c;
        }
        return true;
    }
}
