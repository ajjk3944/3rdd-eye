package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gh4 extends xg4 {
    public final pg4 k;
    public final boolean l;
    public final ez1 m;
    public final sw1 n;
    public eh4 o;
    public dh4 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public gh4(pg4 pg4Var, boolean z) {
        boolean z2;
        this.k = pg4Var;
        if (z) {
            pg4Var.e();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new ez1();
        this.n = new sw1();
        pg4Var.d();
        this.o = new eh4(new fh4(pg4Var.f()), ez1.m, eh4.e);
    }

    @Override // defpackage.pg4
    public final void a(fk1 fk1Var) {
        if (this.s) {
            eh4 eh4Var = this.o;
            this.o = new eh4(new hc4(this.o.b, fk1Var), eh4Var.c, eh4Var.d);
        } else {
            this.o = new eh4(new fh4(fk1Var), ez1.m, eh4.e);
        }
        this.k.a(fk1Var);
    }

    @Override // defpackage.pg4
    public final void b(jh4 jh4Var) {
        dh4 dh4Var = (dh4) jh4Var;
        jh4 jh4Var2 = dh4Var.j;
        if (jh4Var2 != null) {
            pg4 pg4Var = dh4Var.i;
            pg4Var.getClass();
            pg4Var.b(jh4Var2);
        }
        if (jh4Var == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.pg4
    public final void d() {
        this.k.d();
    }

    @Override // defpackage.pg4
    public final void e() {
        this.k.e();
    }

    @Override // defpackage.pg4
    public final fk1 f() {
        return this.k.f();
    }

    @Override // defpackage.pg4
    public final void h(ws3 ws3Var) {
        this.j = ws3Var;
        String str = v23.a;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.i = new Handler(looperMyLooper, null);
        if (this.l) {
            return;
        }
        this.q = true;
        t(null, this.k);
    }

    @Override // defpackage.xg4, defpackage.pg4
    public final void j() {
        this.r = false;
        this.q = false;
        super.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    @Override // defpackage.xg4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.Object r10, defpackage.pg4 r11, defpackage.oz1 r12) {
        /*
            r9 = this;
            java.lang.Void r10 = (java.lang.Void) r10
            boolean r10 = r9.r
            r11 = 0
            if (r10 == 0) goto L1f
            eh4 r10 = r9.o
            java.lang.Object r0 = r10.c
            java.lang.Object r10 = r10.d
            eh4 r1 = new eh4
            r1.<init>(r12, r0, r10)
            r9.o = r1
            dh4 r10 = r9.p
            if (r10 == 0) goto Lb5
            long r0 = r10.l
            r9.y(r0)
            goto Lb5
        L1f:
            boolean r10 = r12.g()
            if (r10 == 0) goto L42
            boolean r10 = r9.s
            if (r10 == 0) goto L35
            eh4 r10 = r9.o
            java.lang.Object r0 = r10.c
            java.lang.Object r10 = r10.d
            eh4 r1 = new eh4
            r1.<init>(r12, r0, r10)
            goto L3e
        L35:
            java.lang.Object r10 = defpackage.ez1.m
            java.lang.Object r0 = defpackage.eh4.e
            eh4 r1 = new eh4
            r1.<init>(r12, r10, r0)
        L3e:
            r9.o = r1
            goto Lb5
        L42:
            r10 = 0
            ez1 r1 = r9.m
            r2 = 0
            r12.b(r10, r1, r2)
            java.lang.Object r6 = r1.a
            dh4 r0 = r9.p
            if (r0 == 0) goto L67
            long r4 = r0.g
            eh4 r7 = r9.o
            kh4 r0 = r0.f
            java.lang.Object r0 = r0.a
            sw1 r8 = r9.n
            r7.o(r0, r8)
            eh4 r0 = r9.o
            r0.b(r10, r1, r2)
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 == 0) goto L67
            goto L68
        L67:
            r4 = r2
        L68:
            sw1 r2 = r9.n
            r3 = 0
            r0 = r12
            android.util.Pair r10 = r0.m(r1, r2, r3, r4)
            java.lang.Object r12 = r10.first
            java.lang.Object r10 = r10.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r1 = r10.longValue()
            boolean r10 = r9.s
            if (r10 == 0) goto L8a
            eh4 r10 = r9.o
            java.lang.Object r12 = r10.c
            java.lang.Object r10 = r10.d
            eh4 r3 = new eh4
            r3.<init>(r0, r12, r10)
            goto L8f
        L8a:
            eh4 r3 = new eh4
            r3.<init>(r0, r6, r12)
        L8f:
            r9.o = r3
            dh4 r10 = r9.p
            if (r10 == 0) goto Lb5
            boolean r12 = r9.y(r1)
            if (r12 == 0) goto Lb5
            kh4 r10 = r10.f
            java.lang.Object r11 = r10.a
            eh4 r12 = r9.o
            java.lang.Object r12 = r12.d
            if (r12 == 0) goto Lb1
            java.lang.Object r12 = defpackage.eh4.e
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto Lb1
            eh4 r11 = r9.o
            java.lang.Object r11 = r11.d
        Lb1:
            kh4 r11 = r10.a(r11)
        Lb5:
            r10 = 1
            r9.s = r10
            r9.r = r10
            eh4 r10 = r9.o
            r9.k(r10)
            if (r11 == 0) goto Lc9
            dh4 r10 = r9.p
            r10.getClass()
            r10.n(r11)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh4.s(java.lang.Object, pg4, oz1):void");
    }

    @Override // defpackage.xg4
    public final /* bridge */ /* synthetic */ void u(Object obj) {
    }

    @Override // defpackage.xg4
    public final kh4 v(Object obj, kh4 kh4Var) {
        Object obj2 = this.o.d;
        Object obj3 = kh4Var.a;
        if (obj2 != null && obj2.equals(obj3)) {
            obj3 = eh4.e;
        }
        return kh4Var.a(obj3);
    }

    @Override // defpackage.xg4
    public final /* synthetic */ void w(long j, Object obj) {
    }

    @Override // defpackage.pg4
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final dh4 c(kh4 kh4Var, rj4 rj4Var, long j) {
        dh4 dh4Var = new dh4(kh4Var, rj4Var, j);
        zt0.b0(dh4Var.i == null);
        pg4 pg4Var = this.k;
        dh4Var.i = pg4Var;
        if (!this.r) {
            this.p = dh4Var;
            if (!this.q) {
                this.q = true;
                t(null, pg4Var);
            }
            return dh4Var;
        }
        Object obj = kh4Var.a;
        if (this.o.d != null && obj.equals(eh4.e)) {
            obj = this.o.d;
        }
        dh4Var.n(kh4Var.a(obj));
        return dh4Var;
    }

    public final boolean y(long j) {
        dh4 dh4Var = this.p;
        int iE = this.o.e(dh4Var.f.a);
        if (iE == -1) {
            return false;
        }
        eh4 eh4Var = this.o;
        sw1 sw1Var = this.n;
        eh4Var.d(iE, sw1Var, false);
        long j2 = sw1Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        dh4Var.l = j;
        return true;
    }
}
