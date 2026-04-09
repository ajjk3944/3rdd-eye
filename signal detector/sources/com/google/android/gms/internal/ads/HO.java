package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class HO {

    /* renamed from: a, reason: collision with root package name */
    public final String f8911a;

    /* renamed from: b, reason: collision with root package name */
    public int f8912b;

    /* renamed from: c, reason: collision with root package name */
    public long f8913c;

    /* renamed from: d, reason: collision with root package name */
    public final C1749qQ f8914d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8915e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ IO f8917g;

    public HO(IO io, String str, int i, C1749qQ c1749qQ) {
        this.f8917g = io;
        this.f8911a = str;
        this.f8912b = i;
        this.f8913c = c1749qQ == null ? -1L : c1749qQ.f16377d;
        if (c1749qQ == null || !c1749qQ.b()) {
            return;
        }
        this.f8914d = c1749qQ;
    }

    public final boolean a(AbstractC1353j8 abstractC1353j8, AbstractC1353j8 abstractC1353j82) {
        C1749qQ c1749qQ;
        int i = this.f8912b;
        if (i < abstractC1353j8.a()) {
            IO io = this.f8917g;
            U7 u7 = io.f9094a;
            abstractC1353j8.b(i, u7, 0L);
            for (int i3 = u7.f11612k; i3 <= u7.f11613l; i3++) {
                int iE = abstractC1353j82.e(abstractC1353j8.f(i3));
                if (iE != -1) {
                    i = abstractC1353j82.d(iE, io.f9095b, false).f9072c;
                    break;
                }
            }
            i = -1;
        } else if (i >= abstractC1353j82.a()) {
            i = -1;
        }
        this.f8912b = i;
        return i != -1 && ((c1749qQ = this.f8914d) == null || abstractC1353j82.e(c1749qQ.f16374a) != -1);
    }

    public final boolean b(BO bo) {
        C1749qQ c1749qQ = bo.f7346d;
        if (c1749qQ == null) {
            return this.f8912b != bo.f7345c;
        }
        long j6 = this.f8913c;
        if (j6 == -1) {
            return false;
        }
        long j7 = c1749qQ.f16377d;
        if (j7 > j6) {
            return true;
        }
        C1749qQ c1749qQ2 = this.f8914d;
        if (c1749qQ2 == null) {
            return false;
        }
        AbstractC1353j8 abstractC1353j8 = bo.f7344b;
        int iE = abstractC1353j8.e(c1749qQ.f16374a);
        int iE2 = abstractC1353j8.e(c1749qQ2.f16374a);
        long j8 = c1749qQ2.f16377d;
        int i = c1749qQ2.f16375b;
        if (j7 < j8 || iE < iE2) {
            return false;
        }
        if (iE > iE2) {
            return true;
        }
        if (!c1749qQ.b()) {
            int i3 = c1749qQ.f16378e;
            return i3 == -1 || i3 > i;
        }
        int i6 = c1749qQ.f16375b;
        int i7 = c1749qQ.f16376c;
        if (i6 <= i) {
            return i6 == i && i7 > c1749qQ2.f16376c;
        }
        return true;
    }
}
