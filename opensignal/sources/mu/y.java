package mu;

import ku.t0;

/* loaded from: classes.dex */
public final class y implements ju.d, ju.b {

    /* renamed from: a, reason: collision with root package name */
    public final ab.g f17048a;

    /* renamed from: b, reason: collision with root package name */
    public final lu.c f17049b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f17050c;

    /* renamed from: d, reason: collision with root package name */
    public final y[] f17051d;

    /* renamed from: e, reason: collision with root package name */
    public final cg.e f17052e;

    /* renamed from: f, reason: collision with root package name */
    public final lu.i f17053f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17054g;

    /* renamed from: h, reason: collision with root package name */
    public String f17055h;

    /* renamed from: i, reason: collision with root package name */
    public String f17056i;

    public y(ab.g gVar, lu.c cVar, b0 b0Var, y[] yVarArr) {
        br.l.e(gVar, "composer");
        this.f17048a = gVar;
        this.f17049b = cVar;
        this.f17050c = b0Var;
        this.f17051d = yVarArr;
        this.f17052e = cVar.f15935b;
        this.f17053f = cVar.f15934a;
        int iOrdinal = b0Var.ordinal();
        if (yVarArr != null) {
            y yVar = yVarArr[iOrdinal];
            if (yVar == null && yVar == this) {
                return;
            }
            yVarArr[iOrdinal] = this;
        }
    }

    @Override // ju.d
    public final cg.e a() {
        return this.f17052e;
    }

    @Override // ju.d
    public final ju.b b(iu.e eVar) {
        y yVar;
        br.l.e(eVar, "descriptor");
        lu.c cVar = this.f17049b;
        b0 b0VarO = l.o(eVar, cVar);
        char c4 = b0VarO.begin;
        ab.g gVar = this.f17048a;
        if (c4 != 0) {
            gVar.q(c4);
            gVar.f308d = true;
        }
        String str = this.f17055h;
        if (str != null) {
            String strH = this.f17056i;
            if (strH == null) {
                strH = eVar.h();
            }
            gVar.n();
            r(str);
            gVar.q(':');
            gVar.getClass();
            r(strH);
            this.f17055h = null;
            this.f17056i = null;
        }
        if (this.f17050c == b0VarO) {
            return this;
        }
        y[] yVarArr = this.f17051d;
        return (yVarArr == null || (yVar = yVarArr[b0VarO.ordinal()]) == null) ? new y(gVar, cVar, b0VarO, yVarArr) : yVar;
    }

    @Override // ju.b
    public final void c(iu.e eVar) {
        br.l.e(eVar, "descriptor");
        b0 b0Var = this.f17050c;
        if (b0Var.end != 0) {
            ab.g gVar = this.f17048a;
            gVar.getClass();
            gVar.f308d = false;
            gVar.q(b0Var.end);
        }
    }

    @Override // ju.d
    public final void d() {
        this.f17048a.t("null");
    }

    @Override // ju.d
    public final void e(double d6) {
        boolean z10 = this.f17054g;
        ab.g gVar = this.f17048a;
        if (z10) {
            r(String.valueOf(d6));
        } else {
            ((ag.b) gVar.f309g).t(String.valueOf(d6));
        }
        if (Double.isInfinite(d6) || Double.isNaN(d6)) {
            throw l.b(((ag.b) gVar.f309g).toString(), Double.valueOf(d6));
        }
    }

    @Override // ju.d
    public final void f(short s8) {
        if (this.f17054g) {
            r(String.valueOf((int) s8));
        } else {
            this.f17048a.u(s8);
        }
    }

    @Override // ju.d
    public final void g(byte b2) {
        if (this.f17054g) {
            r(String.valueOf((int) b2));
        } else {
            this.f17048a.p(b2);
        }
    }

    @Override // ju.d
    public final void h(boolean z10) {
        if (this.f17054g) {
            r(String.valueOf(z10));
        } else {
            ((ag.b) this.f17048a.f309g).t(String.valueOf(z10));
        }
    }

    @Override // ju.b
    public final void i(iu.e eVar, int i10, gu.a aVar, Object obj) {
        br.l.e(eVar, "descriptor");
        br.l.e(aVar, "serializer");
        if (obj != null || this.f17053f.f15945c) {
            br.l.e(eVar, "descriptor");
            br.l.e(aVar, "serializer");
            t(eVar, i10);
            if (aVar.getDescriptor().i()) {
                l(aVar, obj);
            } else if (obj == null) {
                d();
            } else {
                l(aVar, obj);
            }
        }
    }

    @Override // ju.d
    public final void j(float f10) {
        boolean z10 = this.f17054g;
        ab.g gVar = this.f17048a;
        if (z10) {
            r(String.valueOf(f10));
        } else {
            ((ag.b) gVar.f309g).t(String.valueOf(f10));
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw l.b(((ag.b) gVar.f309g).toString(), Float.valueOf(f10));
        }
    }

    @Override // ju.d
    public final void k(char c4) {
        r(String.valueOf(c4));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // ju.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(gu.a r5, java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.y.l(gu.a, java.lang.Object):void");
    }

    @Override // ju.d
    public final ju.d m(iu.e eVar) {
        br.l.e(eVar, "descriptor");
        boolean zA = z.a(eVar);
        b0 b0Var = this.f17050c;
        lu.c cVar = this.f17049b;
        ab.g eVar2 = this.f17048a;
        if (zA) {
            if (!(eVar2 instanceof f)) {
                eVar2 = new f((ag.b) eVar2.f309g, this.f17054g);
            }
            return new y(eVar2, cVar, b0Var, null);
        }
        if (eVar.g() && eVar.equals(lu.m.f15950a)) {
            if (!(eVar2 instanceof e)) {
                eVar2 = new e((ag.b) eVar2.f309g, this.f17054g);
            }
            return new y(eVar2, cVar, b0Var, null);
        }
        if (this.f17055h != null) {
            this.f17056i = eVar.h();
        }
        return this;
    }

    @Override // ju.b
    public final boolean n(iu.e eVar) {
        br.l.e(eVar, "descriptor");
        return this.f17053f.f15943a;
    }

    @Override // ju.d
    public final void o(iu.e eVar, int i10) {
        br.l.e(eVar, "enumDescriptor");
        r(eVar.l(i10));
    }

    @Override // ju.d
    public final void p(int i10) {
        if (this.f17054g) {
            r(String.valueOf(i10));
        } else {
            this.f17048a.r(i10);
        }
    }

    @Override // ju.d
    public final void q(long j) {
        if (this.f17054g) {
            r(String.valueOf(j));
        } else {
            this.f17048a.s(j);
        }
    }

    @Override // ju.d
    public final void r(String str) {
        br.l.e(str, "value");
        this.f17048a.v(str);
    }

    public final void s(iu.e eVar, int i10, boolean z10) {
        br.l.e(eVar, "descriptor");
        t(eVar, i10);
        h(z10);
    }

    public final void t(iu.e eVar, int i10) {
        br.l.e(eVar, "descriptor");
        int i11 = x.f17047a[this.f17050c.ordinal()];
        ab.g gVar = this.f17048a;
        boolean z10 = true;
        if (i11 == 1) {
            if (!gVar.f308d) {
                gVar.q(',');
            }
            gVar.n();
            return;
        }
        if (i11 == 2) {
            if (gVar.f308d) {
                this.f17054g = true;
                gVar.n();
                return;
            }
            if (i10 % 2 == 0) {
                gVar.q(',');
                gVar.n();
            } else {
                gVar.q(':');
                gVar.w();
                z10 = false;
            }
            this.f17054g = z10;
            return;
        }
        if (i11 != 3) {
            if (!gVar.f308d) {
                gVar.q(',');
            }
            gVar.n();
            l.m(eVar, this.f17049b);
            r(eVar.l(i10));
            gVar.q(':');
            gVar.w();
            return;
        }
        if (i10 == 0) {
            this.f17054g = true;
        }
        if (i10 == 1) {
            gVar.q(',');
            gVar.w();
            this.f17054g = false;
        }
    }

    public final ju.d u(t0 t0Var, int i10) {
        br.l.e(t0Var, "descriptor");
        t(t0Var, i10);
        return m(t0Var.n(i10));
    }

    public final void v(iu.e eVar, int i10, long j) {
        br.l.e(eVar, "descriptor");
        t(eVar, i10);
        q(j);
    }

    public final void w(iu.e eVar, int i10, gu.a aVar, Object obj) {
        br.l.e(eVar, "descriptor");
        br.l.e(aVar, "serializer");
        t(eVar, i10);
        l(aVar, obj);
    }

    public final void x(iu.e eVar, int i10, String str) {
        br.l.e(eVar, "descriptor");
        br.l.e(str, "value");
        t(eVar, i10);
        r(str);
    }
}
