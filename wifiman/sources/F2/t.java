package f2;

import Zg.AbstractC3689v;
import Zg.U;
import f2.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mh.InterfaceC6835l;
import nh.InterfaceC6944a;
import o.W;
import o.Y;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes.dex */
public class t extends r implements Iterable, InterfaceC6944a {

    /* renamed from: q, reason: collision with root package name */
    public static final a f46899q = new a(null);

    /* renamed from: m, reason: collision with root package name */
    private final W f46900m;

    /* renamed from: n, reason: collision with root package name */
    private int f46901n;

    /* renamed from: o, reason: collision with root package name */
    private String f46902o;

    /* renamed from: p, reason: collision with root package name */
    private String f46903p;

    public static final class a {

        /* renamed from: f2.t$a$a, reason: collision with other inner class name */
        static final class C1757a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final C1757a f46904a = new C1757a();

            C1757a() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r invoke(r it) {
                AbstractC6492s.i(it, "it");
                if (!(it instanceof t)) {
                    return null;
                }
                t tVar = (t) it;
                return tVar.N(tVar.V());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC8780j a(t tVar) {
            AbstractC6492s.i(tVar, "<this>");
            return AbstractC8783m.n(tVar, C1757a.f46904a);
        }

        public final r b(t tVar) {
            AbstractC6492s.i(tVar, "<this>");
            return (r) AbstractC8783m.M(a(tVar));
        }

        private a() {
        }
    }

    public static final class b implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private int f46905a = -1;

        /* renamed from: b, reason: collision with root package name */
        private boolean f46906b;

        b() {
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public r next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f46906b = true;
            W wT = t.this.T();
            int i10 = this.f46905a + 1;
            this.f46905a = i10;
            return (r) wT.q(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f46905a + 1 < t.this.T().p();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f46906b) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            W wT = t.this.T();
            ((r) wT.q(this.f46905a)).H(null);
            wT.n(this.f46905a);
            this.f46905a--;
            this.f46906b = false;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f46908a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj) {
            super(1);
            this.f46908a = obj;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(r startDestination) {
            AbstractC6492s.i(startDestination, "startDestination");
            Map mapK = startDestination.k();
            LinkedHashMap linkedHashMap = new LinkedHashMap(U.d(mapK.size()));
            for (Map.Entry entry : mapK.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((C5509h) entry.getValue()).a());
            }
            return h2.c.c(this.f46908a, linkedHashMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(AbstractC5498D navGraphNavigator) {
        super(navGraphNavigator);
        AbstractC6492s.i(navGraphNavigator, "navGraphNavigator");
        this.f46900m = new W(0, 1, null);
    }

    public static /* synthetic */ r S(t tVar, int i10, r rVar, boolean z10, r rVar2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
        }
        if ((i11 & 8) != 0) {
            rVar2 = null;
        }
        return tVar.R(i10, rVar, z10, rVar2);
    }

    private final void e0(int i10) {
        if (i10 != s()) {
            if (this.f46903p != null) {
                g0(null);
            }
            this.f46901n = i10;
            this.f46902o = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this).toString());
    }

    private final void g0(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (AbstractC6492s.d(str, w())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (kotlin.text.t.m0(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = r.f46869k.a(str).hashCode();
        }
        this.f46901n = iHashCode;
        this.f46903p = str;
    }

    public final void L(r node) {
        AbstractC6492s.i(node, "node");
        int iS = node.s();
        String strW = node.w();
        if (iS == 0 && strW == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (w() != null && AbstractC6492s.d(strW, w())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (iS == s()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        r rVar = (r) this.f46900m.f(iS);
        if (rVar == node) {
            return;
        }
        if (node.v() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (rVar != null) {
            rVar.H(null);
        }
        node.H(this);
        this.f46900m.l(node.s(), node);
    }

    public final void M(Collection nodes) {
        AbstractC6492s.i(nodes, "nodes");
        Iterator it = nodes.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                L(rVar);
            }
        }
    }

    public final r N(int i10) {
        return S(this, i10, this, false, null, 8, null);
    }

    public final r O(String str) {
        if (str == null || kotlin.text.t.m0(str)) {
            return null;
        }
        return Q(str, true);
    }

    public final r Q(String route, boolean z10) {
        Object next;
        AbstractC6492s.i(route, "route");
        Iterator it = AbstractC8783m.g(Y.b(this.f46900m)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            r rVar = (r) next;
            if (kotlin.text.t.D(rVar.w(), route, false, 2, null) || rVar.A(route) != null) {
                break;
            }
        }
        r rVar2 = (r) next;
        if (rVar2 != null) {
            return rVar2;
        }
        if (!z10 || v() == null) {
            return null;
        }
        t tVarV = v();
        AbstractC6492s.f(tVarV);
        return tVarV.O(route);
    }

    public final r R(int i10, r rVar, boolean z10, r rVar2) {
        r rVar3 = (r) this.f46900m.f(i10);
        if (rVar2 != null) {
            if (AbstractC6492s.d(rVar3, rVar2) && AbstractC6492s.d(rVar3.v(), rVar2.v())) {
                return rVar3;
            }
            rVar3 = null;
        } else if (rVar3 != null) {
            return rVar3;
        }
        if (z10) {
            Iterator it = AbstractC8783m.g(Y.b(this.f46900m)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    rVar3 = null;
                    break;
                }
                r rVar4 = (r) it.next();
                r rVarR = (!(rVar4 instanceof t) || AbstractC6492s.d(rVar4, rVar)) ? null : ((t) rVar4).R(i10, this, true, rVar2);
                if (rVarR != null) {
                    rVar3 = rVarR;
                    break;
                }
            }
        }
        if (rVar3 != null) {
            return rVar3;
        }
        if (v() == null || AbstractC6492s.d(v(), rVar)) {
            return null;
        }
        t tVarV = v();
        AbstractC6492s.f(tVarV);
        return tVarV.R(i10, this, z10, rVar2);
    }

    public final W T() {
        return this.f46900m;
    }

    public final String U() {
        if (this.f46902o == null) {
            String strValueOf = this.f46903p;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.f46901n);
            }
            this.f46902o = strValueOf;
        }
        String str = this.f46902o;
        AbstractC6492s.f(str);
        return str;
    }

    public final int V() {
        return this.f46901n;
    }

    public final String W() {
        return this.f46903p;
    }

    public final r.b X(q navDeepLinkRequest, boolean z10, boolean z11, r lastVisited) {
        r.b bVar;
        AbstractC6492s.i(navDeepLinkRequest, "navDeepLinkRequest");
        AbstractC6492s.i(lastVisited, "lastVisited");
        r.b bVarZ = super.z(navDeepLinkRequest);
        r.b bVarX = null;
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterator();
            while (it.hasNext()) {
                r rVar = (r) it.next();
                r.b bVarZ2 = !AbstractC6492s.d(rVar, lastVisited) ? rVar.z(navDeepLinkRequest) : null;
                if (bVarZ2 != null) {
                    arrayList.add(bVarZ2);
                }
            }
            bVar = (r.b) AbstractC3689v.F0(arrayList);
        } else {
            bVar = null;
        }
        t tVarV = v();
        if (tVarV != null && z11 && !AbstractC6492s.d(tVarV, lastVisited)) {
            bVarX = tVarV.X(navDeepLinkRequest, z10, true, this);
        }
        return (r.b) AbstractC3689v.F0(AbstractC3689v.q(bVarZ, bVar, bVarX));
    }

    public final r.b Y(String route, boolean z10, boolean z11, r lastVisited) {
        r.b bVar;
        AbstractC6492s.i(route, "route");
        AbstractC6492s.i(lastVisited, "lastVisited");
        r.b bVarA = A(route);
        r.b bVarY = null;
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterator();
            while (it.hasNext()) {
                r rVar = (r) it.next();
                r.b bVarY2 = AbstractC6492s.d(rVar, lastVisited) ? null : rVar instanceof t ? ((t) rVar).Y(route, true, false, this) : rVar.A(route);
                if (bVarY2 != null) {
                    arrayList.add(bVarY2);
                }
            }
            bVar = (r.b) AbstractC3689v.F0(arrayList);
        } else {
            bVar = null;
        }
        t tVarV = v();
        if (tVarV != null && z11 && !AbstractC6492s.d(tVarV, lastVisited)) {
            bVarY = tVarV.Y(route, z10, true, this);
        }
        return (r.b) AbstractC3689v.F0(AbstractC3689v.q(bVarA, bVar, bVarY));
    }

    public final void Z(int i10) {
        e0(i10);
    }

    public final void a0(Vi.b serializer, InterfaceC6835l parseRoute) {
        AbstractC6492s.i(serializer, "serializer");
        AbstractC6492s.i(parseRoute, "parseRoute");
        int iB = h2.c.b(serializer);
        r rVarN = N(iB);
        if (rVarN != null) {
            g0((String) parseRoute.invoke(rVarN));
            this.f46901n = iB;
        } else {
            throw new IllegalStateException(("Cannot find startDestination " + serializer.a().a() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
    }

    public final void b0(Object startDestRoute) {
        AbstractC6492s.i(startDestRoute, "startDestRoute");
        a0(Vi.w.d(O.b(startDestRoute.getClass())), new c(startDestRoute));
    }

    public final void c0(String startDestRoute) {
        AbstractC6492s.i(startDestRoute, "startDestRoute");
        g0(startDestRoute);
    }

    @Override // f2.r
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        if (super.equals(obj)) {
            t tVar = (t) obj;
            if (this.f46900m.p() == tVar.f46900m.p() && V() == tVar.V()) {
                for (r rVar : AbstractC8783m.g(Y.b(this.f46900m))) {
                    if (!AbstractC6492s.d(rVar, tVar.f46900m.f(rVar.s()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // f2.r
    public int hashCode() {
        int iV = V();
        W w10 = this.f46900m;
        int iP = w10.p();
        for (int i10 = 0; i10 < iP; i10++) {
            iV = (((iV * 31) + w10.k(i10)) * 31) + ((r) w10.q(i10)).hashCode();
        }
        return iV;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b();
    }

    @Override // f2.r
    public String q() {
        return s() != 0 ? super.q() : "the root navigation";
    }

    @Override // f2.r
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        r rVarO = O(this.f46903p);
        if (rVarO == null) {
            rVarO = N(V());
        }
        sb2.append(" startDestination=");
        if (rVarO == null) {
            String str = this.f46903p;
            if (str != null) {
                sb2.append(str);
            } else {
                String str2 = this.f46902o;
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.f46901n));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(rVarO.toString());
            sb2.append("}");
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "sb.toString()");
        return string;
    }

    @Override // f2.r
    public r.b z(q navDeepLinkRequest) {
        AbstractC6492s.i(navDeepLinkRequest, "navDeepLinkRequest");
        return X(navDeepLinkRequest, true, false, this);
    }
}
