package l7;

import androidx.work.s;
import b9.InterfaceC2000g;
import b9.p;
import io.appmetrica.analytics.impl.Oo;
import java.util.List;
import k8.F;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import n7.C5372b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonFieldParser.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Oo f43876a = new Oo(4);

    public static <V> AbstractC5371a<V> a(D7.f fVar, JSONObject jSONObject, String str, boolean z10, AbstractC5371a<V> abstractC5371a) {
        return c(fVar, jSONObject, str, z10, abstractC5371a, e.f43878b, e.f43877a);
    }

    public static <V> AbstractC5371a<V> b(D7.f fVar, JSONObject jSONObject, String str, boolean z10, AbstractC5371a<V> abstractC5371a, InterfaceC2000g<D7.b<JSONObject, V>> interfaceC2000g) {
        AbstractC5371a<V> abstractC5371aO;
        try {
            return new AbstractC5371a.d(F.l(fVar, jSONObject, str, interfaceC2000g), z10);
        } catch (z7.d e4) {
            if (e4.f48476b != z7.f.MISSING_VALUE || (abstractC5371aO = o(z10, n(fVar, jSONObject, str), abstractC5371a)) == null) {
                throw e4;
            }
            return abstractC5371aO;
        }
    }

    public static <R, V> AbstractC5371a<V> c(D7.f fVar, JSONObject jSONObject, String str, boolean z10, AbstractC5371a<V> abstractC5371a, p9.l<R, V> lVar, l<V> lVar2) {
        AbstractC5371a<V> abstractC5371aO;
        try {
            return new AbstractC5371a.d(F.n(jSONObject, str, lVar, lVar2), z10);
        } catch (z7.d e4) {
            if (e4.f48476b != z7.f.MISSING_VALUE || (abstractC5371aO = o(z10, n(fVar, jSONObject, str), abstractC5371a)) == null) {
                throw e4;
            }
            return abstractC5371aO;
        }
    }

    public static <V> AbstractC5371a<A7.b<V>> d(D7.f fVar, JSONObject jSONObject, String str, j<V> jVar, boolean z10, AbstractC5371a<A7.b<V>> abstractC5371a) {
        return e(fVar, jSONObject, str, jVar, z10, abstractC5371a, e.f43878b, e.f43877a);
    }

    public static <R, V> AbstractC5371a<A7.b<V>> e(D7.f fVar, JSONObject jSONObject, String str, j<V> jVar, boolean z10, AbstractC5371a<A7.b<V>> abstractC5371a, p9.l<R, V> lVar, l<V> lVar2) {
        AbstractC5371a<A7.b<V>> abstractC5371aO;
        try {
            return new AbstractC5371a.d(b.a(fVar, jSONObject, str, jVar, lVar, lVar2), z10);
        } catch (z7.d e4) {
            if (e4.f48476b != z7.f.MISSING_VALUE || (abstractC5371aO = o(z10, n(fVar, jSONObject, str), abstractC5371a)) == null) {
                throw e4;
            }
            return abstractC5371aO;
        }
    }

    public static <V> AbstractC5371a<List<V>> f(D7.f fVar, JSONObject jSONObject, String str, boolean z10, AbstractC5371a<List<V>> abstractC5371a, InterfaceC2000g<D7.b<JSONObject, V>> interfaceC2000g, g<V> gVar) {
        AbstractC5371a<List<V>> abstractC5371aO;
        try {
            return new AbstractC5371a.d(F.o(fVar, jSONObject, str, interfaceC2000g, gVar), z10);
        } catch (z7.d e4) {
            if (e4.f48476b != z7.f.MISSING_VALUE || (abstractC5371aO = o(z10, n(fVar, jSONObject, str), abstractC5371a)) == null) {
                throw e4;
            }
            return abstractC5371aO;
        }
    }

    public static AbstractC5371a g(D7.f fVar, JSONObject jSONObject, k.b bVar, boolean z10, AbstractC5371a abstractC5371a, h.f fVar2, g gVar) {
        A7.c cVarC = b.c(fVar, jSONObject, "colors", bVar, fVar2, gVar);
        if (cVarC != null) {
            return new AbstractC5371a.d(cVarC, z10);
        }
        String strN = n(fVar, jSONObject, "colors");
        return strN != null ? new AbstractC5371a.c(z10, strN) : abstractC5371a != null ? C5372b.a(abstractC5371a, z10) : z10 ? AbstractC5371a.b.f44401c : AbstractC5371a.C0502a.f44400c;
    }

    public static <V> AbstractC5371a<V> h(D7.f fVar, JSONObject jSONObject, String str, boolean z10, AbstractC5371a<V> abstractC5371a, InterfaceC2000g<D7.b<JSONObject, V>> interfaceC2000g) {
        Object objQ = F.q(fVar, jSONObject, str, interfaceC2000g);
        if (objQ != null) {
            return new AbstractC5371a.d(objQ, z10);
        }
        String strN = n(fVar, jSONObject, str);
        return strN != null ? new AbstractC5371a.c(z10, strN) : abstractC5371a != null ? C5372b.a(abstractC5371a, z10) : z10 ? AbstractC5371a.b.f44401c : AbstractC5371a.C0502a.f44400c;
    }

    public static AbstractC5371a i(D7.f fVar, JSONObject jSONObject, String str, boolean z10, AbstractC5371a abstractC5371a, p9.l lVar) {
        Object objR = F.r(fVar, jSONObject, str, lVar, e.f43877a);
        if (objR != null) {
            return new AbstractC5371a.d(objR, z10);
        }
        String strN = n(fVar, jSONObject, str);
        return strN != null ? new AbstractC5371a.c(z10, strN) : abstractC5371a != null ? C5372b.a(abstractC5371a, z10) : z10 ? AbstractC5371a.b.f44401c : AbstractC5371a.C0502a.f44400c;
    }

    public static <R, V> AbstractC5371a<A7.b<V>> j(D7.f fVar, JSONObject jSONObject, String str, j<V> jVar, boolean z10, AbstractC5371a<A7.b<V>> abstractC5371a, p9.l<R, V> lVar, l<V> lVar2) {
        A7.b bVarB = b.b(fVar, jSONObject, str, jVar, lVar, lVar2, null);
        if (bVarB != null) {
            return new AbstractC5371a.d(bVarB, z10);
        }
        String strN = n(fVar, jSONObject, str);
        return strN != null ? new AbstractC5371a.c(z10, strN) : abstractC5371a != null ? C5372b.a(abstractC5371a, z10) : z10 ? AbstractC5371a.b.f44401c : AbstractC5371a.C0502a.f44400c;
    }

    public static <V> AbstractC5371a<List<V>> k(D7.f fVar, JSONObject jSONObject, String str, boolean z10, AbstractC5371a<List<V>> abstractC5371a, InterfaceC2000g<D7.b<JSONObject, V>> interfaceC2000g) {
        List listS = F.s(fVar, jSONObject, str, interfaceC2000g);
        if (listS != null) {
            return new AbstractC5371a.d(listS, z10);
        }
        String strN = n(fVar, jSONObject, str);
        return strN != null ? new AbstractC5371a.c(z10, strN) : abstractC5371a != null ? C5372b.a(abstractC5371a, z10) : z10 ? AbstractC5371a.b.f44401c : AbstractC5371a.C0502a.f44400c;
    }

    public static AbstractC5371a l(D7.f fVar, JSONObject jSONObject, boolean z10, AbstractC5371a abstractC5371a, p pVar, g gVar) {
        List listT = F.t(fVar, jSONObject, "color_map", pVar, gVar);
        if (listT != null) {
            return new AbstractC5371a.d(listT, z10);
        }
        String strN = n(fVar, jSONObject, "color_map");
        return strN != null ? new AbstractC5371a.c(z10, strN) : abstractC5371a != null ? C5372b.a(abstractC5371a, z10) : z10 ? AbstractC5371a.b.f44401c : AbstractC5371a.C0502a.f44400c;
    }

    public static AbstractC5371a m(D7.f fVar, JSONObject jSONObject, boolean z10, AbstractC5371a abstractC5371a, p9.l lVar, g gVar) {
        List listU = F.u(fVar, jSONObject, "transition_triggers", lVar, gVar);
        if (listU != null) {
            return new AbstractC5371a.d(listU, z10);
        }
        String strN = n(fVar, jSONObject, "transition_triggers");
        return strN != null ? new AbstractC5371a.c(z10, strN) : abstractC5371a != null ? C5372b.a(abstractC5371a, z10) : z10 ? AbstractC5371a.b.f44401c : AbstractC5371a.C0502a.f44400c;
    }

    public static String n(D7.f fVar, JSONObject jSONObject, String str) {
        return (String) F.r(fVar, jSONObject, s.d("$", str), e.f43878b, f43876a);
    }

    public static <V> AbstractC5371a<V> o(boolean z10, String str, AbstractC5371a<V> abstractC5371a) {
        if (str != null) {
            return new AbstractC5371a.c(z10, str);
        }
        if (abstractC5371a != null) {
            return C5372b.a(abstractC5371a, z10);
        }
        if (z10) {
            return z10 ? AbstractC5371a.b.f44401c : AbstractC5371a.C0502a.f44400c;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(D7.f fVar, String str, AbstractC5371a abstractC5371a, JSONObject jSONObject, p9.l lVar) {
        if (abstractC5371a instanceof AbstractC5371a.d) {
            b.e(fVar, jSONObject, str, (A7.b) ((AbstractC5371a.d) abstractC5371a).f44403c, lVar);
        } else if (abstractC5371a instanceof AbstractC5371a.c) {
            F.y(fVar, jSONObject, "$".concat(str), ((AbstractC5371a.c) abstractC5371a).f44402c);
        }
    }

    public static <V> void q(D7.f fVar, JSONObject jSONObject, String str, AbstractC5371a<A7.b<V>> abstractC5371a) {
        p(fVar, str, abstractC5371a, jSONObject, e.f43878b);
    }

    public static void r(D7.f fVar, JSONObject jSONObject, AbstractC5371a abstractC5371a, h.c cVar) throws JSONException, z7.d {
        if (abstractC5371a instanceof AbstractC5371a.d) {
            b.f(fVar, jSONObject, (A7.c) ((AbstractC5371a.d) abstractC5371a).f44403c, cVar);
        } else if (abstractC5371a instanceof AbstractC5371a.c) {
            F.y(fVar, jSONObject, "$colors", ((AbstractC5371a.c) abstractC5371a).f44402c);
        }
    }

    public static void s(D7.f fVar, String str, AbstractC5371a abstractC5371a, JSONObject jSONObject, p9.l lVar) {
        if (abstractC5371a instanceof AbstractC5371a.d) {
            F.A(fVar, jSONObject, str, ((AbstractC5371a.d) abstractC5371a).f44403c, lVar);
        } else if (abstractC5371a instanceof AbstractC5371a.c) {
            F.y(fVar, jSONObject, "$".concat(str), ((AbstractC5371a.c) abstractC5371a).f44402c);
        }
    }

    public static <V> void t(D7.f fVar, JSONObject jSONObject, String str, AbstractC5371a<V> abstractC5371a) {
        s(fVar, str, abstractC5371a, jSONObject, e.f43878b);
    }

    public static <V> void u(D7.f fVar, JSONObject jSONObject, String str, AbstractC5371a<V> abstractC5371a, InterfaceC2000g<D7.h<JSONObject, V>> interfaceC2000g) {
        if (abstractC5371a instanceof AbstractC5371a.d) {
            F.z(fVar, jSONObject, str, ((AbstractC5371a.d) abstractC5371a).f44403c, interfaceC2000g);
        } else if (abstractC5371a instanceof AbstractC5371a.c) {
            F.y(fVar, jSONObject, "$".concat(str), ((AbstractC5371a.c) abstractC5371a).f44402c);
        }
    }

    public static <V> void v(D7.f fVar, JSONObject jSONObject, String str, AbstractC5371a<List<V>> abstractC5371a, InterfaceC2000g<D7.h<JSONObject, V>> interfaceC2000g) {
        if (abstractC5371a instanceof AbstractC5371a.d) {
            F.B(fVar, jSONObject, str, (List) ((AbstractC5371a.d) abstractC5371a).f44403c, interfaceC2000g);
        } else if (abstractC5371a instanceof AbstractC5371a.c) {
            F.y(fVar, jSONObject, "$".concat(str), ((AbstractC5371a.c) abstractC5371a).f44402c);
        }
    }

    public static void w(D7.f fVar, JSONObject jSONObject, AbstractC5371a abstractC5371a, p9.l lVar) {
        if (abstractC5371a instanceof AbstractC5371a.d) {
            F.C(fVar, jSONObject, (List) ((AbstractC5371a.d) abstractC5371a).f44403c, lVar);
        } else if (abstractC5371a instanceof AbstractC5371a.c) {
            F.y(fVar, jSONObject, "$transition_triggers", ((AbstractC5371a.c) abstractC5371a).f44402c);
        }
    }
}
