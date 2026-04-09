package l7;

import b9.InterfaceC2000g;
import b9.p;
import java.util.ArrayList;
import java.util.List;
import k8.F;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: JsonFieldResolver.java */
/* loaded from: classes.dex */
public final class d {
    public static <T extends Z6.b<V>, V> V a(D7.f fVar, AbstractC5371a<T> abstractC5371a, JSONObject json, String str, InterfaceC2000g<D7.j<JSONObject, T, V>> interfaceC2000g, InterfaceC2000g<D7.b<JSONObject, V>> interfaceC2000g2) {
        if (abstractC5371a.f44399b && json.has(str)) {
            return (V) F.l(fVar, json, str, interfaceC2000g2);
        }
        int i = abstractC5371a.f44398a;
        if (i != 2) {
            if (i == 3) {
                return (V) F.l(fVar, json, ((AbstractC5371a.c) abstractC5371a).f44402c, interfaceC2000g2);
            }
            throw z7.e.g(str, json);
        }
        try {
            return (V) interfaceC2000g.getValue().a(fVar, (Z6.b) ((AbstractC5371a.d) abstractC5371a).f44403c, json);
        } catch (z7.d e4) {
            z7.d dVar = z7.e.f48479a;
            kotlin.jvm.internal.l.f(json, "json");
            throw z7.e.b(json, str, e4);
        }
    }

    public static Object b(AbstractC5371a abstractC5371a, JSONObject jSONObject, String str, p9.l lVar, l lVar2) {
        if (abstractC5371a.f44399b && jSONObject.has(str)) {
            return F.n(jSONObject, str, lVar, lVar2);
        }
        int i = abstractC5371a.f44398a;
        if (i == 2) {
            return ((AbstractC5371a.d) abstractC5371a).f44403c;
        }
        if (i == 3) {
            return F.n(jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, lVar, lVar2);
        }
        throw z7.e.g(str, jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> A7.b<V> c(D7.f fVar, AbstractC5371a<A7.b<V>> abstractC5371a, JSONObject jSONObject, String str, j<V> jVar) {
        boolean z10 = abstractC5371a.f44399b;
        j6.l lVar = e.f43877a;
        A8.d dVar = e.f43878b;
        if (z10 && jSONObject.has(str)) {
            return b.a(fVar, jSONObject, str, jVar, dVar, lVar);
        }
        int i = abstractC5371a.f44398a;
        if (i == 2) {
            return (A7.b) ((AbstractC5371a.d) abstractC5371a).f44403c;
        }
        if (i == 3) {
            return b.a(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, jVar, dVar, lVar);
        }
        throw z7.e.g(str, jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> A7.b<V> d(D7.f fVar, AbstractC5371a<A7.b<V>> abstractC5371a, JSONObject jSONObject, String str, j<V> jVar, p9.l<R, V> lVar) {
        boolean z10 = abstractC5371a.f44399b;
        j6.l lVar2 = e.f43877a;
        if (z10 && jSONObject.has(str)) {
            return b.a(fVar, jSONObject, str, jVar, lVar, lVar2);
        }
        int i = abstractC5371a.f44398a;
        if (i == 2) {
            return (A7.b) ((AbstractC5371a.d) abstractC5371a).f44403c;
        }
        if (i == 3) {
            return b.a(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, jVar, lVar, lVar2);
        }
        throw z7.e.g(str, jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> A7.b<V> e(D7.f fVar, AbstractC5371a<A7.b<V>> abstractC5371a, JSONObject jSONObject, String str, j<V> jVar, p9.l<R, V> lVar, l<V> lVar2) {
        if (abstractC5371a.f44399b && jSONObject.has(str)) {
            return b.a(fVar, jSONObject, str, jVar, lVar, lVar2);
        }
        int i = abstractC5371a.f44398a;
        if (i == 2) {
            return (A7.b) ((AbstractC5371a.d) abstractC5371a).f44403c;
        }
        if (i == 3) {
            return b.a(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, jVar, lVar, lVar2);
        }
        throw z7.e.g(str, jSONObject);
    }

    public static <T extends Z6.b<V>, V> List<V> f(D7.f fVar, AbstractC5371a<List<T>> abstractC5371a, JSONObject jSONObject, String str, InterfaceC2000g<D7.j<JSONObject, T, V>> interfaceC2000g, InterfaceC2000g<D7.b<JSONObject, V>> interfaceC2000g2, g<V> gVar) {
        if (abstractC5371a.f44399b && jSONObject.has(str)) {
            return F.o(fVar, jSONObject, str, interfaceC2000g2, gVar);
        }
        int i = abstractC5371a.f44398a;
        if (i != 2) {
            if (i == 3) {
                return F.o(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, interfaceC2000g2, gVar);
            }
            throw z7.e.g(str, jSONObject);
        }
        List list = (List) ((AbstractC5371a.d) abstractC5371a).f44403c;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        D7.j<JSONObject, T, V> value = interfaceC2000g.getValue();
        for (int i10 = 0; i10 < size; i10++) {
            Object objI = i(fVar, (Z6.b) list.get(i10), jSONObject, value);
            if (objI != null) {
                arrayList.add(objI);
            }
        }
        if (gVar.a(arrayList)) {
            return arrayList;
        }
        throw z7.e.e(jSONObject, str, arrayList);
    }

    public static Object g(D7.f fVar, String str, AbstractC5371a abstractC5371a, JSONObject jSONObject, p9.l lVar) {
        j6.l lVar2 = e.f43877a;
        if (abstractC5371a.f44399b && jSONObject.has(str)) {
            return F.r(fVar, jSONObject, str, lVar, lVar2);
        }
        int i = abstractC5371a.f44398a;
        if (i == 2) {
            return ((AbstractC5371a.d) abstractC5371a).f44403c;
        }
        if (i == 3) {
            return F.r(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, lVar, lVar2);
        }
        return null;
    }

    public static <T extends Z6.b<V>, V> V h(D7.f fVar, AbstractC5371a<T> abstractC5371a, JSONObject jSONObject, String str, InterfaceC2000g<D7.j<JSONObject, T, V>> interfaceC2000g, InterfaceC2000g<D7.b<JSONObject, V>> interfaceC2000g2) {
        if (abstractC5371a.f44399b && jSONObject.has(str)) {
            return (V) F.q(fVar, jSONObject, str, interfaceC2000g2);
        }
        int i = abstractC5371a.f44398a;
        if (i == 2) {
            return (V) i(fVar, (Z6.b) ((AbstractC5371a.d) abstractC5371a).f44403c, jSONObject, interfaceC2000g.getValue());
        }
        if (i == 3) {
            return (V) F.q(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, interfaceC2000g2);
        }
        return null;
    }

    public static <T extends Z6.b<V>, V> V i(D7.f fVar, T t10, JSONObject jSONObject, D7.j<JSONObject, T, V> jVar) {
        try {
            return (V) jVar.a(fVar, t10, jSONObject);
        } catch (z7.d e4) {
            fVar.a().d(e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> A7.b<V> j(D7.f fVar, AbstractC5371a<A7.b<V>> abstractC5371a, JSONObject jSONObject, String str, j<V> jVar) {
        boolean z10 = abstractC5371a.f44399b;
        A8.d dVar = e.f43878b;
        j6.l lVar = e.f43877a;
        if (z10 && jSONObject.has(str)) {
            return b.b(fVar, jSONObject, str, jVar, dVar, lVar, null);
        }
        int i = abstractC5371a.f44398a;
        if (i == 2) {
            return (A7.b) ((AbstractC5371a.d) abstractC5371a).f44403c;
        }
        if (i == 3) {
            return b.b(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, jVar, dVar, lVar, null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> A7.b<V> k(D7.f fVar, AbstractC5371a<A7.b<V>> abstractC5371a, JSONObject jSONObject, String str, j<V> jVar, p9.l<R, V> lVar) {
        boolean z10 = abstractC5371a.f44399b;
        j6.l lVar2 = e.f43877a;
        if (z10 && jSONObject.has(str)) {
            return b.b(fVar, jSONObject, str, jVar, lVar, lVar2, null);
        }
        int i = abstractC5371a.f44398a;
        if (i == 2) {
            return (A7.b) ((AbstractC5371a.d) abstractC5371a).f44403c;
        }
        if (i == 3) {
            return b.b(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, jVar, lVar, lVar2, null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> A7.b<V> l(D7.f fVar, AbstractC5371a<A7.b<V>> abstractC5371a, JSONObject jSONObject, String str, j<V> jVar, p9.l<R, V> lVar, A7.b<V> bVar) {
        boolean z10 = abstractC5371a.f44399b;
        j6.l lVar2 = e.f43877a;
        if (z10 && jSONObject.has(str)) {
            return b.b(fVar, jSONObject, str, jVar, lVar, lVar2, bVar);
        }
        int i = abstractC5371a.f44398a;
        if (i == 2) {
            return (A7.b) ((AbstractC5371a.d) abstractC5371a).f44403c;
        }
        if (i == 3) {
            return b.b(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, jVar, lVar, lVar2, bVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> A7.b<V> m(D7.f fVar, AbstractC5371a<A7.b<V>> abstractC5371a, JSONObject jSONObject, String str, j<V> jVar, p9.l<R, V> lVar, l<V> lVar2) {
        if (abstractC5371a.f44399b && jSONObject.has(str)) {
            return b.b(fVar, jSONObject, str, jVar, lVar, lVar2, null);
        }
        int i = abstractC5371a.f44398a;
        if (i == 2) {
            return (A7.b) ((AbstractC5371a.d) abstractC5371a).f44403c;
        }
        if (i == 3) {
            return b.b(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, jVar, lVar, lVar2, null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> A7.b<V> n(D7.f fVar, AbstractC5371a<A7.b<V>> abstractC5371a, JSONObject jSONObject, String str, j<V> jVar, p9.l<R, V> lVar, l<V> lVar2, A7.b<V> bVar) {
        if (abstractC5371a.f44399b && jSONObject.has(str)) {
            return b.b(fVar, jSONObject, str, jVar, lVar, lVar2, bVar);
        }
        int i = abstractC5371a.f44398a;
        if (i == 2) {
            return (A7.b) ((AbstractC5371a.d) abstractC5371a).f44403c;
        }
        if (i == 3) {
            return b.b(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, jVar, lVar, lVar2, bVar);
        }
        return null;
    }

    public static A7.c o(D7.f fVar, AbstractC5371a abstractC5371a, JSONObject jSONObject, k.b bVar, h.f fVar2, g gVar) {
        if (abstractC5371a.f44399b && jSONObject.has("colors")) {
            return b.c(fVar, jSONObject, "colors", bVar, fVar2, gVar);
        }
        int i = abstractC5371a.f44398a;
        if (i == 2) {
            return (A7.c) ((AbstractC5371a.d) abstractC5371a).f44403c;
        }
        if (i == 3) {
            return b.c(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, bVar, fVar2, gVar);
        }
        return null;
    }

    public static List p(D7.f fVar, AbstractC5371a abstractC5371a, JSONObject jSONObject, p pVar, p pVar2, g gVar) {
        if (abstractC5371a.f44399b && jSONObject.has("color_map")) {
            return F.t(fVar, jSONObject, "color_map", pVar2, gVar);
        }
        int i = abstractC5371a.f44398a;
        if (i != 2) {
            if (i == 3) {
                return F.t(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, pVar2, gVar);
            }
            return null;
        }
        List list = (List) ((AbstractC5371a.d) abstractC5371a).f44403c;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        D7.j jVar = (D7.j) pVar.getValue();
        for (int i10 = 0; i10 < size; i10++) {
            Object objI = i(fVar, (Z6.b) list.get(i10), jSONObject, jVar);
            if (objI != null) {
                arrayList.add(objI);
            }
        }
        if (gVar.a(arrayList)) {
            return arrayList;
        }
        fVar.a().d(z7.e.e(jSONObject, "color_map", arrayList));
        return null;
    }

    public static <T extends Z6.b<V>, V> List<V> q(D7.f fVar, AbstractC5371a<List<T>> abstractC5371a, JSONObject jSONObject, String str, InterfaceC2000g<D7.j<JSONObject, T, V>> interfaceC2000g, InterfaceC2000g<D7.b<JSONObject, V>> interfaceC2000g2) {
        if (abstractC5371a.f44399b && jSONObject.has(str)) {
            return F.s(fVar, jSONObject, str, interfaceC2000g2);
        }
        int i = abstractC5371a.f44398a;
        if (i != 2) {
            if (i == 3) {
                return F.s(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, interfaceC2000g2);
            }
            return null;
        }
        List list = (List) ((AbstractC5371a.d) abstractC5371a).f44403c;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        D7.j<JSONObject, T, V> value = interfaceC2000g.getValue();
        for (int i10 = 0; i10 < size; i10++) {
            Object objI = i(fVar, (Z6.b) list.get(i10), jSONObject, value);
            if (objI != null) {
                arrayList.add(objI);
            }
        }
        return arrayList;
    }

    public static List r(D7.f fVar, AbstractC5371a abstractC5371a, JSONObject jSONObject, p9.l lVar, g gVar) {
        if (abstractC5371a.f44399b && jSONObject.has("transition_triggers")) {
            return F.u(fVar, jSONObject, "transition_triggers", lVar, gVar);
        }
        int i = abstractC5371a.f44398a;
        if (i == 2) {
            return (List) ((AbstractC5371a.d) abstractC5371a).f44403c;
        }
        if (i == 3) {
            return F.u(fVar, jSONObject, ((AbstractC5371a.c) abstractC5371a).f44402c, lVar, gVar);
        }
        return null;
    }
}
