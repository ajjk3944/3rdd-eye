package v1;

import x1.a1;

/* loaded from: classes.dex */
public abstract class u implements t2.c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(u uVar, v vVar) {
        uVar.getClass();
        if (vVar instanceof a1) {
            ((a1) vVar).c();
        }
    }

    public static void e(u uVar, v vVar, int i10, int i11) {
        uVar.getClass();
        a(uVar, vVar);
        vVar.N(i3.g.A((i11 & 4294967295L) | (i10 << 32), vVar.f23813f), 0.0f, null);
    }

    public static void f(u uVar, v vVar, long j) {
        uVar.getClass();
        a(uVar, vVar);
        vVar.N(i3.g.A(j, vVar.f23813f), 0.0f, null);
    }

    public static void h(u uVar, v vVar, int i10, int i11) {
        long j = (i10 << 32) | (i11 & 4294967295L);
        if (uVar.c() == t2.i.Ltr || uVar.d() == 0) {
            a(uVar, vVar);
            vVar.N(i3.g.A(j, vVar.f23813f), 0.0f, null);
        } else {
            int iD = (uVar.d() - vVar.f23809b) - ((int) (j >> 32));
            a(uVar, vVar);
            vVar.N(i3.g.A((iD << 32) | (((int) (j & 4294967295L)) & 4294967295L), vVar.f23813f), 0.0f, null);
        }
    }

    public static void j(u uVar, v vVar, int i10, int i11) {
        int i12 = x.f23818b;
        w wVar = w.f23814g;
        long j = (i10 << 32) | (i11 & 4294967295L);
        if (uVar.c() == t2.i.Ltr || uVar.d() == 0) {
            a(uVar, vVar);
            vVar.N(i3.g.A(j, vVar.f23813f), 0.0f, wVar);
        } else {
            int iD = (uVar.d() - vVar.f23809b) - ((int) (j >> 32));
            a(uVar, vVar);
            vVar.N(i3.g.A((iD << 32) | (((int) (j & 4294967295L)) & 4294967295L), vVar.f23813f), 0.0f, wVar);
        }
    }

    public float b(j jVar) {
        return Float.NaN;
    }

    public abstract t2.i c();

    public abstract int d();
}
