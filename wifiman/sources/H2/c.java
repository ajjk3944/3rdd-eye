package h2;

import Vi.w;
import Xi.f;
import Xi.n;
import Yg.J;
import f2.AbstractC5496B;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.O;
import mh.q;

/* loaded from: classes.dex */
public abstract class c {

    static final class a extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f48406a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5945a f48407b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Map map, C5945a c5945a) {
            super(3);
            this.f48406a = map;
            this.f48407b = c5945a;
        }

        public final void a(int i10, String argName, AbstractC5496B navType) {
            AbstractC6492s.i(argName, "argName");
            AbstractC6492s.i(navType, "navType");
            Object obj = this.f48406a.get(argName);
            AbstractC6492s.f(obj);
            this.f48407b.c(i10, argName, navType, (List) obj);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a(((Number) obj).intValue(), (String) obj2, (AbstractC5496B) obj3);
            return J.f24997a;
        }
    }

    private static final void a(Vi.b bVar, Map map, q qVar) {
        int iE = bVar.a().e();
        for (int i10 = 0; i10 < iE; i10++) {
            String strF = bVar.a().f(i10);
            AbstractC5496B abstractC5496B = (AbstractC5496B) map.get(strF);
            if (abstractC5496B == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + strF + ']').toString());
            }
            qVar.s(Integer.valueOf(i10), strF, abstractC5496B);
        }
    }

    public static final int b(Vi.b bVar) {
        AbstractC6492s.i(bVar, "<this>");
        int iHashCode = bVar.a().a().hashCode();
        int iE = bVar.a().e();
        for (int i10 = 0; i10 < iE; i10++) {
            iHashCode = (iHashCode * 31) + bVar.a().f(i10).hashCode();
        }
        return iHashCode;
    }

    public static final String c(Object route, Map typeMap) {
        AbstractC6492s.i(route, "route");
        AbstractC6492s.i(typeMap, "typeMap");
        Vi.b bVarD = w.d(O.b(route.getClass()));
        Map mapJ = new C5946b(bVarD, typeMap).J(route);
        C5945a c5945a = new C5945a(bVarD);
        a(bVarD, typeMap, new a(mapJ, c5945a));
        return c5945a.d();
    }

    public static final boolean d(f fVar) {
        AbstractC6492s.i(fVar, "<this>");
        return AbstractC6492s.d(fVar.h(), n.a.f24470a) && fVar.isInline() && fVar.e() == 1;
    }
}
