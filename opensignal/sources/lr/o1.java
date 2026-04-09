package lr;

/* loaded from: classes.dex */
public final class o1 implements ir.w {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ ir.v[] f15658r;

    /* renamed from: a, reason: collision with root package name */
    public final rr.r0 f15659a;

    /* renamed from: d, reason: collision with root package name */
    public final r1 f15660d = t1.n(null, new ht.g(23, this));

    /* renamed from: g, reason: collision with root package name */
    public final p1 f15661g;

    static {
        br.y yVar = br.x.f2918a;
        f15658r = new ir.v[]{yVar.f(new br.q(yVar.b(o1.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public o1(p1 p1Var, rr.r0 r0Var) {
        Class cls;
        z zVarB;
        Object objW0;
        this.f15659a = r0Var;
        if (p1Var == null) {
            rr.l lVarO = r0Var.o();
            br.l.d(lVarO, "descriptor.containingDeclaration");
            if (lVarO instanceof rr.f) {
                objW0 = b((rr.f) lVarO);
            } else {
                if (!(lVarO instanceof rr.d)) {
                    throw new lq.k("Unknown type parameter container: " + lVarO, 1);
                }
                rr.l lVarO2 = ((rr.d) lVarO).o();
                br.l.d(lVarO2, "declaration.containingDeclaration");
                if (lVarO2 instanceof rr.f) {
                    zVarB = b((rr.f) lVarO2);
                } else {
                    ft.l lVar = lVarO instanceof ft.l ? (ft.l) lVarO : null;
                    if (lVar == null) {
                        throw new lq.k("Non-class callable descriptor must be deserialized: " + lVarO, 1);
                    }
                    ft.k kVarB0 = lVar.b0();
                    js.i iVar = kVarB0 instanceof js.i ? (js.i) kVarB0 : null;
                    wr.b bVar = iVar != null ? iVar.f13812g : null;
                    wr.b bVar2 = bVar instanceof wr.b ? bVar : null;
                    if (bVar2 == null || (cls = bVar2.f24588a) == null) {
                        throw new lq.k("Container of deserialized member is not resolved: " + lVar, 1);
                    }
                    zVarB = (z) ir.f0.H(cls);
                }
                objW0 = lVarO.w0(new h7.r1(19, zVarB), lq.b0.f15562a);
            }
            br.l.d(objW0, "when (val declaration = … $declaration\")\n        }");
            p1Var = (p1) objW0;
        }
        this.f15661g = p1Var;
    }

    public static z b(rr.f fVar) {
        Class clsJ = z1.j(fVar);
        z zVar = (z) (clsJ != null ? ir.f0.H(clsJ) : null);
        if (zVar != null) {
            return zVar;
        }
        throw new lq.k("Type parameter container is not resolved: " + fVar.o(), 1);
    }

    public final String a() {
        String strB = this.f15659a.getName().b();
        br.l.d(strB, "descriptor.name.asString()");
        return strB;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return br.l.a(this.f15661g, o1Var.f15661g) && a().equals(o1Var.a());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f15661g.hashCode() * 31);
    }

    public final String toString() {
        ir.z zVar;
        StringBuilder sb2 = new StringBuilder();
        int i10 = n1.f15653a[this.f15659a.N().ordinal()];
        if (i10 == 1) {
            zVar = ir.z.INVARIANT;
        } else if (i10 == 2) {
            zVar = ir.z.IN;
        } else {
            if (i10 != 3) {
                throw new bf.n();
            }
            zVar = ir.z.OUT;
        }
        int i11 = br.c0.f2902a[zVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                sb2.append("in ");
            } else {
                if (i11 != 3) {
                    throw new bf.n();
                }
                sb2.append("out ");
            }
        }
        sb2.append(a());
        return sb2.toString();
    }
}
