package c0;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final x f3111a = new x(d.f3066a, z0.b.F);

    public static final x a(b bVar, z0.d dVar, n0.p pVar, int i10) {
        if (br.l.a(bVar, d.f3066a) && dVar.equals(z0.b.F)) {
            pVar.S(-1073795767);
            pVar.o(false);
            return f3111a;
        }
        pVar.S(-1073744896);
        boolean z10 = true;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && pVar.e(bVar)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !pVar.e(dVar)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI = pVar.I();
        if (z12 || objI == n0.j.f17190a) {
            objI = new x(bVar, dVar);
            pVar.b0(objI);
        }
        x xVar = (x) objI;
        pVar.o(false);
        return xVar;
    }
}
