package ku;

import com.google.android.gms.internal.measurement.y3;

/* loaded from: classes.dex */
public final class r implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r f14604a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f14605b = new v0("kotlin.time.Duration", iu.c.f12996l);

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        int i10 = ut.a.f23695r;
        String strN = cVar.n();
        br.l.e(strN, "value");
        try {
            return new ut.a(y3.a(strN));
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException(h0.b.o("Invalid ISO duration string format: '", strN, "'."), e4);
        }
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return f14605b;
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        long j = ((ut.a) obj).f23696a;
        int i10 = ut.a.f23695r;
        StringBuilder sb2 = new StringBuilder();
        if (j < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jI = j < 0 ? ut.a.i(j) : j;
        long jH = ut.a.h(jI, ut.c.HOURS);
        boolean z10 = false;
        int iH = ut.a.f(jI) ? 0 : (int) (ut.a.h(jI, ut.c.MINUTES) % 60);
        int iH2 = ut.a.f(jI) ? 0 : (int) (ut.a.h(jI, ut.c.SECONDS) % 60);
        int iE = ut.a.e(jI);
        if (ut.a.f(j)) {
            jH = 9999999999999L;
        }
        boolean z11 = jH != 0;
        boolean z12 = (iH2 == 0 && iE == 0) ? false : true;
        if (iH != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(jH);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iH);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            ut.a.b(sb2, iH2, iE, 9, "S", true);
        }
        dVar.r(sb2.toString());
    }
}
