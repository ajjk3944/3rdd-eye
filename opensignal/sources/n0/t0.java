package n0;

/* loaded from: classes.dex */
public final class t0 implements pq.g, c2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ t0 f17317d = new t0(0);

    /* renamed from: g, reason: collision with root package name */
    public static final t0 f17318g = new t0(1);

    /* renamed from: r, reason: collision with root package name */
    public static final t0 f17319r = new t0(2);

    /* renamed from: x, reason: collision with root package name */
    public static final t0 f17320x = new t0(3);

    /* renamed from: y, reason: collision with root package name */
    public static final t0 f17321y = new t0(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17322a;

    public /* synthetic */ t0(int i10) {
        this.f17322a = i10;
    }

    public static final void b(t0 t0Var) {
        zt.o0 o0Var;
        Object obj;
        t0.b bVar;
        zt.o0 o0Var2 = o1.f17231x;
        do {
            o0Var = o1.f17231x;
            obj = (q0.b) o0Var.getValue();
            bVar = (t0.b) obj;
            s0.c cVarA = bVar.f22379g;
            t0.a aVar = (t0.a) cVarA.get(t0Var);
            if (aVar != null) {
                Object obj2 = aVar.f22374a;
                Object obj3 = aVar.f22375b;
                s0.k kVar = cVarA.f21826a;
                s0.k kVarV = kVar.v(t0Var != null ? t0Var.hashCode() : 0, 0, t0Var);
                if (kVar != kVarV) {
                    cVarA = kVarV == null ? s0.c.f21825g : new s0.c(kVarV, cVarA.f21827d - 1);
                }
                u0.b bVar2 = u0.b.f23137a;
                if (obj2 != bVar2) {
                    Object obj4 = cVarA.get(obj2);
                    br.l.b(obj4);
                    cVarA = cVarA.a(obj2, new t0.a(((t0.a) obj4).f22374a, obj3));
                }
                if (obj3 != bVar2) {
                    Object obj5 = cVarA.get(obj3);
                    br.l.b(obj5);
                    cVarA = cVarA.a(obj3, new t0.a(obj2, ((t0.a) obj5).f22375b));
                }
                Object obj6 = obj2 != bVar2 ? bVar.f22377a : obj3;
                if (obj3 != bVar2) {
                    obj2 = bVar.f22378d;
                }
                bVar = new t0.b(obj6, obj2, cVarA);
            }
            if (obj == bVar) {
                return;
            }
            Object obj7 = au.c.f2321b;
            if (obj == null) {
                obj = obj7;
            }
        } while (!o0Var.h(obj, bVar));
    }

    @Override // n0.c2
    public boolean a(Object obj, Object obj2) {
        switch (this.f17322a) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return br.l.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f17322a) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return "Empty";
        }
    }
}
