package as;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final p f2241a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f2242b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f2243c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f2244d;

    static {
        vr.a aVar = vr.a.f23949r;
        p pVar = new p(aVar, 0);
        f2241a = pVar;
        vr.c cVar = vr.c.f23951r;
        p pVar2 = new p(cVar, 1);
        f2242b = pVar2;
        vr.b bVar = vr.b.f23950r;
        p pVar3 = new p(bVar, 2);
        f2243c = pVar3;
        HashMap map = new HashMap();
        f2244d = map;
        map.put(aVar, pVar);
        map.put(cVar, pVar2);
        map.put(bVar, pVar3);
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(bt.d dVar, rr.o oVar, rr.l lVar) {
        rr.o oVarT;
        if (lVar == null) {
            a(1);
            throw null;
        }
        if (oVar instanceof rr.d) {
            oVarT = ts.d.t((rr.d) oVar);
        } else {
            int i10 = ts.d.f22961a;
            oVarT = oVar;
        }
        if (c(oVarT, lVar)) {
            return true;
        }
        return rr.p.f21699c.a(dVar, oVar, lVar);
    }

    public static boolean c(rr.o oVar, rr.l lVar) {
        if (oVar == null) {
            a(2);
            throw null;
        }
        if (lVar == null) {
            a(3);
            throw null;
        }
        rr.f0 f0Var = (rr.f0) ts.d.i(oVar, rr.f0.class, false);
        rr.f0 f0Var2 = (rr.f0) ts.d.i(lVar, rr.f0.class, false);
        return (f0Var2 == null || f0Var == null || !((ur.c0) f0Var).f23629y.equals(((ur.c0) f0Var2).f23629y)) ? false : true;
    }
}
