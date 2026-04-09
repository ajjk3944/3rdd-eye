package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nd4 {
    public final String a;
    public int b;
    public long c;
    public final kh4 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ od4 g;

    public nd4(od4 od4Var, String str, int i, kh4 kh4Var) {
        this.g = od4Var;
        this.a = str;
        this.b = i;
        this.c = kh4Var == null ? -1L : kh4Var.d;
        if (kh4Var == null || !kh4Var.b()) {
            return;
        }
        this.d = kh4Var;
    }

    public final boolean a(oz1 oz1Var, oz1 oz1Var2) {
        kh4 kh4Var;
        int i = this.b;
        if (i < oz1Var.a()) {
            od4 od4Var = this.g;
            ez1 ez1Var = od4Var.a;
            oz1Var.b(i, ez1Var, 0L);
            for (int i2 = ez1Var.k; i2 <= ez1Var.l; i2++) {
                int iE = oz1Var2.e(oz1Var.f(i2));
                if (iE != -1) {
                    i = oz1Var2.d(iE, od4Var.b, false).c;
                    break;
                }
            }
            i = -1;
        } else if (i >= oz1Var2.a()) {
            i = -1;
        }
        this.b = i;
        return i != -1 && ((kh4Var = this.d) == null || oz1Var2.e(kh4Var.a) != -1);
    }

    public final boolean b(ad4 ad4Var) {
        kh4 kh4Var = ad4Var.d;
        if (kh4Var == null) {
            return this.b != ad4Var.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        long j2 = kh4Var.d;
        if (j2 > j) {
            return true;
        }
        kh4 kh4Var2 = this.d;
        if (kh4Var2 == null) {
            return false;
        }
        oz1 oz1Var = ad4Var.b;
        int iE = oz1Var.e(kh4Var.a);
        int iE2 = oz1Var.e(kh4Var2.a);
        long j3 = kh4Var2.d;
        int i = kh4Var2.b;
        if (j2 < j3 || iE < iE2) {
            return false;
        }
        if (iE > iE2) {
            return true;
        }
        if (!kh4Var.b()) {
            int i2 = kh4Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = kh4Var.b;
        int i4 = kh4Var.c;
        if (i3 <= i) {
            return i3 == i && i4 > kh4Var2.c;
        }
        return true;
    }
}
