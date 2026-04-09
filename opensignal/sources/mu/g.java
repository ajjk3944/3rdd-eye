package mu;

/* loaded from: classes.dex */
public final class g extends io.sentry.config.a {

    /* renamed from: a, reason: collision with root package name */
    public final bj.c f17014a;

    /* renamed from: b, reason: collision with root package name */
    public final cg.e f17015b;

    public g(bj.c cVar, lu.c cVar2) {
        br.l.e(cVar2, "json");
        this.f17014a = cVar;
        this.f17015b = cVar2.f15935b;
    }

    @Override // io.sentry.config.a, ju.c
    public final short A() {
        lq.z zVar;
        bj.c cVar = this.f17014a;
        String strQ = cVar.q();
        try {
            br.l.e(strQ, "<this>");
            lq.u uVarJ = dr.a.J(strQ);
            if (uVarJ != null) {
                int i10 = uVarJ.f15585a;
                zVar = Integer.compare(Integer.MIN_VALUE ^ i10, -2147418113) > 0 ? null : new lq.z((short) i10);
            }
            if (zVar != null) {
                return zVar.f15590a;
            }
            tt.s.h0(strQ);
            throw null;
        } catch (IllegalArgumentException unused) {
            bj.c.u(cVar, h0.b.g('\'', "Failed to parse type 'UShort' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override // ju.a
    public final cg.e a() {
        return this.f17015b;
    }

    @Override // io.sentry.config.a, ju.c
    public final int k() {
        bj.c cVar = this.f17014a;
        String strQ = cVar.q();
        try {
            br.l.e(strQ, "<this>");
            lq.u uVarJ = dr.a.J(strQ);
            if (uVarJ != null) {
                return uVarJ.f15585a;
            }
            tt.s.h0(strQ);
            throw null;
        } catch (IllegalArgumentException unused) {
            bj.c.u(cVar, h0.b.g('\'', "Failed to parse type 'UInt' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override // io.sentry.config.a, ju.c
    public final long r() {
        bj.c cVar = this.f17014a;
        String strQ = cVar.q();
        try {
            br.l.e(strQ, "<this>");
            lq.w wVarK = dr.a.K(strQ);
            if (wVarK != null) {
                return wVarK.f15587a;
            }
            tt.s.h0(strQ);
            throw null;
        } catch (IllegalArgumentException unused) {
            bj.c.u(cVar, h0.b.g('\'', "Failed to parse type 'ULong' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override // ju.a
    public final int t(iu.e eVar) {
        br.l.e(eVar, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // io.sentry.config.a, ju.c
    public final byte z() {
        lq.s sVar;
        bj.c cVar = this.f17014a;
        String strQ = cVar.q();
        try {
            br.l.e(strQ, "<this>");
            lq.u uVarJ = dr.a.J(strQ);
            if (uVarJ != null) {
                int i10 = uVarJ.f15585a;
                sVar = Integer.compare(Integer.MIN_VALUE ^ i10, -2147483393) > 0 ? null : new lq.s((byte) i10);
            }
            if (sVar != null) {
                return sVar.f15583a;
            }
            tt.s.h0(strQ);
            throw null;
        } catch (IllegalArgumentException unused) {
            bj.c.u(cVar, h0.b.g('\'', "Failed to parse type 'UByte' for input '", strQ), 0, null, 6);
            throw null;
        }
    }
}
