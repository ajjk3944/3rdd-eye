package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class m {

    /* renamed from: a, reason: collision with root package name */
    final k.g<RecyclerView.d0, a> f2221a = new k.g<>();

    /* renamed from: b, reason: collision with root package name */
    final k.d<RecyclerView.d0> f2222b = new k.d<>();

    static class a {

        /* renamed from: d, reason: collision with root package name */
        static z.d<a> f2223d = new z.e(20);

        /* renamed from: a, reason: collision with root package name */
        int f2224a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView.l.c f2225b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.l.c f2226c;

        private a() {
        }

        static void a() {
            while (f2223d.b() != null) {
            }
        }

        static a b() {
            a aVarB = f2223d.b();
            return aVarB == null ? new a() : aVarB;
        }

        static void c(a aVar) {
            aVar.f2224a = 0;
            aVar.f2225b = null;
            aVar.f2226c = null;
            f2223d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void b(RecyclerView.d0 d0Var);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    m() {
    }

    private RecyclerView.l.c l(RecyclerView.d0 d0Var, int i2) {
        a aVarL;
        RecyclerView.l.c cVar;
        int iF = this.f2221a.f(d0Var);
        if (iF >= 0 && (aVarL = this.f2221a.l(iF)) != null) {
            int i3 = aVarL.f2224a;
            if ((i3 & i2) != 0) {
                int i4 = (i2 ^ (-1)) & i3;
                aVarL.f2224a = i4;
                if (i2 == 4) {
                    cVar = aVarL.f2225b;
                } else {
                    if (i2 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarL.f2226c;
                }
                if ((i4 & 12) == 0) {
                    this.f2221a.j(iF);
                    a.c(aVarL);
                }
                return cVar;
            }
        }
        return null;
    }

    void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = this.f2221a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2221a.put(d0Var, aVarB);
        }
        aVarB.f2224a |= 2;
        aVarB.f2225b = cVar;
    }

    void b(RecyclerView.d0 d0Var) {
        a aVarB = this.f2221a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2221a.put(d0Var, aVarB);
        }
        aVarB.f2224a |= 1;
    }

    void c(long j2, RecyclerView.d0 d0Var) {
        this.f2222b.i(j2, d0Var);
    }

    void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = this.f2221a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2221a.put(d0Var, aVarB);
        }
        aVarB.f2226c = cVar;
        aVarB.f2224a |= 8;
    }

    void e(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVarB = this.f2221a.get(d0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2221a.put(d0Var, aVarB);
        }
        aVarB.f2225b = cVar;
        aVarB.f2224a |= 4;
    }

    void f() {
        this.f2221a.clear();
        this.f2222b.b();
    }

    RecyclerView.d0 g(long j2) {
        return this.f2222b.f(j2);
    }

    boolean h(RecyclerView.d0 d0Var) {
        a aVar = this.f2221a.get(d0Var);
        return (aVar == null || (aVar.f2224a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.d0 d0Var) {
        a aVar = this.f2221a.get(d0Var);
        return (aVar == null || (aVar.f2224a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    RecyclerView.l.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    RecyclerView.l.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void o(androidx.recyclerview.widget.m.b r7) {
        /*
            r6 = this;
            k.g<androidx.recyclerview.widget.RecyclerView$d0, androidx.recyclerview.widget.m$a> r0 = r6.f2221a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L63
            k.g<androidx.recyclerview.widget.RecyclerView$d0, androidx.recyclerview.widget.m$a> r1 = r6.f2221a
            java.lang.Object r1 = r1.i(r0)
            androidx.recyclerview.widget.RecyclerView$d0 r1 = (androidx.recyclerview.widget.RecyclerView.d0) r1
            k.g<androidx.recyclerview.widget.RecyclerView$d0, androidx.recyclerview.widget.m$a> r2 = r6.f2221a
            java.lang.Object r2 = r2.j(r0)
            androidx.recyclerview.widget.m$a r2 = (androidx.recyclerview.widget.m.a) r2
            int r3 = r2.f2224a
            r4 = r3 & 3
            r5 = 3
            if (r4 != r5) goto L25
        L21:
            r7.b(r1)
            goto L5d
        L25:
            r4 = r3 & 1
            if (r4 == 0) goto L34
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f2225b
            if (r3 != 0) goto L2e
            goto L21
        L2e:
            androidx.recyclerview.widget.RecyclerView$l$c r4 = r2.f2226c
        L30:
            r7.a(r1, r3, r4)
            goto L5d
        L34:
            r4 = r3 & 14
            r5 = 14
            if (r4 != r5) goto L42
        L3a:
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f2225b
            androidx.recyclerview.widget.RecyclerView$l$c r4 = r2.f2226c
            r7.d(r1, r3, r4)
            goto L5d
        L42:
            r4 = r3 & 12
            r5 = 12
            if (r4 != r5) goto L50
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f2225b
            androidx.recyclerview.widget.RecyclerView$l$c r4 = r2.f2226c
            r7.c(r1, r3, r4)
            goto L5d
        L50:
            r4 = r3 & 4
            if (r4 == 0) goto L58
            androidx.recyclerview.widget.RecyclerView$l$c r3 = r2.f2225b
            r4 = 0
            goto L30
        L58:
            r3 = r3 & 8
            if (r3 == 0) goto L5d
            goto L3a
        L5d:
            androidx.recyclerview.widget.m.a.c(r2)
            int r0 = r0 + (-1)
            goto L8
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.o(androidx.recyclerview.widget.m$b):void");
    }

    void p(RecyclerView.d0 d0Var) {
        a aVar = this.f2221a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.f2224a &= -2;
    }

    void q(RecyclerView.d0 d0Var) {
        int iL = this.f2222b.l() - 1;
        while (true) {
            if (iL < 0) {
                break;
            }
            if (d0Var == this.f2222b.m(iL)) {
                this.f2222b.k(iL);
                break;
            }
            iL--;
        }
        a aVarRemove = this.f2221a.remove(d0Var);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
