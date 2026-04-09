package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class m81 implements ho {
    public int a;
    public pi b;
    public mr0 c;
    public int d;
    public final ap e = new ap(this);
    public int f = 0;
    public boolean g = false;
    public final jo h = new jo(this);
    public final jo i = new jo(this);
    public int j = 1;

    public m81(pi piVar) {
        this.b = piVar;
    }

    public static void b(jo joVar, jo joVar2, int i) {
        joVar.l.add(joVar2);
        joVar.f = i;
        joVar2.k.add(joVar);
    }

    public static jo h(wh whVar) {
        wh whVar2 = whVar.f;
        if (whVar2 == null) {
            return null;
        }
        pi piVar = whVar2.d;
        int iS = ex0.s(whVar2.e);
        if (iS == 1) {
            return piVar.d.h;
        }
        if (iS == 2) {
            return piVar.e.h;
        }
        if (iS == 3) {
            return piVar.d.i;
        }
        if (iS == 4) {
            return piVar.e.i;
        }
        if (iS != 5) {
            return null;
        }
        return piVar.e.k;
    }

    public static jo i(wh whVar, int i) {
        wh whVar2 = whVar.f;
        if (whVar2 == null) {
            return null;
        }
        pi piVar = whVar2.d;
        m81 m81Var = i == 0 ? piVar.d : piVar.e;
        int iS = ex0.s(whVar2.e);
        if (iS == 1 || iS == 2) {
            return m81Var.h;
        }
        if (iS == 3 || iS == 4) {
            return m81Var.i;
        }
        return null;
    }

    public final void c(jo joVar, jo joVar2, int i, ap apVar) {
        joVar.l.add(joVar2);
        joVar.l.add(this.e);
        joVar.h = i;
        joVar.i = apVar;
        joVar2.k.add(joVar);
        apVar.k.add(joVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        if (i2 == 0) {
            pi piVar = this.b;
            int i3 = piVar.v;
            int iMax = Math.max(piVar.u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            pi piVar2 = this.b;
            int i4 = piVar2.y;
            int iMax2 = Math.max(piVar2.x, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        if (this.e.j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.wh r12, defpackage.wh r13, int r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m81.l(wh, wh, int):void");
    }
}
