package f2;

import Zg.U;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import f.AbstractC5487d;
import f2.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import o.W;
import o.Y;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: k, reason: collision with root package name */
    public static final a f46869k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    private static final Map f46870l = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final String f46871a;

    /* renamed from: b, reason: collision with root package name */
    private t f46872b;

    /* renamed from: c, reason: collision with root package name */
    private String f46873c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f46874d;

    /* renamed from: e, reason: collision with root package name */
    private final List f46875e;

    /* renamed from: f, reason: collision with root package name */
    private final W f46876f;

    /* renamed from: g, reason: collision with root package name */
    private Map f46877g;

    /* renamed from: h, reason: collision with root package name */
    private int f46878h;

    /* renamed from: i, reason: collision with root package name */
    private String f46879i;

    /* renamed from: j, reason: collision with root package name */
    private Yg.m f46880j;

    public static final class a {

        /* renamed from: f2.r$a$a, reason: collision with other inner class name */
        static final class C1756a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final C1756a f46881a = new C1756a();

            C1756a() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r invoke(r it) {
                AbstractC6492s.i(it, "it");
                return it.v();
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        public final String b(Context context, int i10) throws Resources.NotFoundException {
            String strValueOf;
            AbstractC6492s.i(context, "context");
            if (i10 <= 16777215) {
                return String.valueOf(i10);
            }
            try {
                strValueOf = context.getResources().getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i10);
            }
            AbstractC6492s.h(strValueOf, "try {\n                  …tring()\n                }");
            return strValueOf;
        }

        public final InterfaceC8780j c(r rVar) {
            AbstractC6492s.i(rVar, "<this>");
            return AbstractC8783m.n(rVar, C1756a.f46881a);
        }

        private a() {
        }
    }

    public static final class b implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        private final r f46882a;

        /* renamed from: b, reason: collision with root package name */
        private final Bundle f46883b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f46884c;

        /* renamed from: d, reason: collision with root package name */
        private final int f46885d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f46886e;

        /* renamed from: f, reason: collision with root package name */
        private final int f46887f;

        public b(r destination, Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
            AbstractC6492s.i(destination, "destination");
            this.f46882a = destination;
            this.f46883b = bundle;
            this.f46884c = z10;
            this.f46885d = i10;
            this.f46886e = z11;
            this.f46887f = i11;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b other) {
            AbstractC6492s.i(other, "other");
            boolean z10 = this.f46884c;
            if (z10 && !other.f46884c) {
                return 1;
            }
            if (!z10 && other.f46884c) {
                return -1;
            }
            int i10 = this.f46885d - other.f46885d;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            Bundle bundle = this.f46883b;
            if (bundle != null && other.f46883b == null) {
                return 1;
            }
            if (bundle == null && other.f46883b != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.f46883b;
                AbstractC6492s.f(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z11 = this.f46886e;
            if (z11 && !other.f46886e) {
                return 1;
            }
            if (z11 || !other.f46886e) {
                return this.f46887f - other.f46887f;
            }
            return -1;
        }

        public final r b() {
            return this.f46882a;
        }

        public final Bundle c() {
            return this.f46883b;
        }

        public final boolean d(Bundle bundle) {
            Bundle bundle2;
            Object objA;
            if (bundle == null || (bundle2 = this.f46883b) == null) {
                return false;
            }
            Set<String> setKeySet = bundle2.keySet();
            AbstractC6492s.h(setKeySet, "matchingArgs.keySet()");
            for (String key : setKeySet) {
                if (!bundle.containsKey(key)) {
                    return false;
                }
                C5509h c5509h = (C5509h) this.f46882a.f46877g.get(key);
                Object objA2 = null;
                AbstractC5496B abstractC5496BA = c5509h != null ? c5509h.a() : null;
                if (abstractC5496BA != null) {
                    Bundle bundle3 = this.f46883b;
                    AbstractC6492s.h(key, "key");
                    objA = abstractC5496BA.a(bundle3, key);
                } else {
                    objA = null;
                }
                if (abstractC5496BA != null) {
                    AbstractC6492s.h(key, "key");
                    objA2 = abstractC5496BA.a(bundle, key);
                }
                if (abstractC5496BA != null && !abstractC5496BA.j(objA, objA2)) {
                    return false;
                }
            }
            return true;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f46888a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p pVar) {
            super(1);
            this.f46888a = pVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            AbstractC6492s.i(key, "key");
            return Boolean.valueOf(!this.f46888a.j().contains(key));
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f46889a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Bundle bundle) {
            super(1);
            this.f46889a = bundle;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            AbstractC6492s.i(key, "key");
            return Boolean.valueOf(!this.f46889a.containsKey(key));
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f46890a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.f46890a = str;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p invoke() {
            return new p.a().b(this.f46890a).a();
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f46891a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p pVar) {
            super(1);
            this.f46891a = pVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            AbstractC6492s.i(key, "key");
            return Boolean.valueOf(!this.f46891a.j().contains(key));
        }
    }

    public r(String navigatorName) {
        AbstractC6492s.i(navigatorName, "navigatorName");
        this.f46871a = navigatorName;
        this.f46875e = new ArrayList();
        this.f46876f = new W(0, 1, null);
        this.f46877g = new LinkedHashMap();
    }

    public static /* synthetic */ int[] j(r rVar, r rVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i10 & 1) != 0) {
            rVar2 = null;
        }
        return rVar.i(rVar2);
    }

    private final boolean x(p pVar, Uri uri, Map map) {
        return AbstractC5511j.a(map, new d(pVar.p(uri, map))).isEmpty();
    }

    public final b A(String route) {
        p pVar;
        AbstractC6492s.i(route, "route");
        Yg.m mVar = this.f46880j;
        if (mVar == null || (pVar = (p) mVar.getValue()) == null) {
            return null;
        }
        Uri uri = Uri.parse(f46869k.a(route));
        AbstractC6492s.e(uri, "Uri.parse(this)");
        Bundle bundleO = pVar.o(uri, this.f46877g);
        if (bundleO == null) {
            return null;
        }
        return new b(this, bundleO, pVar.z(), pVar.h(uri), false, -1);
    }

    public final void C(int i10, AbstractC5508g action) {
        AbstractC6492s.i(action, "action");
        if (J()) {
            if (i10 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.f46876f.l(i10, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i10 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void D(int i10) {
        this.f46878h = i10;
        this.f46873c = null;
    }

    public final void G(CharSequence charSequence) {
        this.f46874d = charSequence;
    }

    public final void H(t tVar) {
        this.f46872b = tVar;
    }

    public final void I(String str) {
        if (str == null) {
            D(0);
        } else {
            if (kotlin.text.t.m0(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strA = f46869k.a(str);
            List listA = AbstractC5511j.a(this.f46877g, new f(new p.a().b(strA).a()));
            if (!listA.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + listA).toString());
            }
            this.f46880j = Yg.n.b(new e(strA));
            D(strA.hashCode());
        }
        this.f46879i = str;
    }

    public boolean J() {
        return true;
    }

    public final void e(String argumentName, C5509h argument) {
        AbstractC6492s.i(argumentName, "argumentName");
        AbstractC6492s.i(argument, "argument");
        this.f46877g.put(argumentName, argument);
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        boolean zD = AbstractC6492s.d(this.f46875e, rVar.f46875e);
        if (this.f46876f.p() != rVar.f46876f.p()) {
            z10 = false;
            break;
        }
        Iterator it = AbstractC8783m.g(Y.a(this.f46876f)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (!AbstractC6492s.d(this.f46876f.f(iIntValue), rVar.f46876f.f(iIntValue))) {
                z10 = false;
                break;
            }
        }
        z10 = true;
        if (this.f46877g.size() != rVar.f46877g.size()) {
            z11 = false;
            break;
        }
        for (Map.Entry entry : U.y(this.f46877g)) {
            if (!rVar.f46877g.containsKey(entry.getKey()) || !AbstractC6492s.d(rVar.f46877g.get(entry.getKey()), entry.getValue())) {
                z11 = false;
                break;
            }
        }
        z11 = true;
        return this.f46878h == rVar.f46878h && AbstractC6492s.d(this.f46879i, rVar.f46879i) && zD && z10 && z11;
    }

    public final void f(p navDeepLink) {
        AbstractC6492s.i(navDeepLink, "navDeepLink");
        List listA = AbstractC5511j.a(this.f46877g, new c(navDeepLink));
        if (listA.isEmpty()) {
            this.f46875e.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.y() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + listA).toString());
    }

    public final Bundle g(Bundle bundle) {
        if (bundle == null && this.f46877g.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f46877g.entrySet()) {
            ((C5509h) entry.getValue()).e((String) entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : this.f46877g.entrySet()) {
                String str = (String) entry2.getKey();
                C5509h c5509h = (C5509h) entry2.getValue();
                if (!c5509h.c() && !c5509h.f(str, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + c5509h.a().b() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    public int hashCode() {
        int i10 = this.f46878h * 31;
        String str = this.f46879i;
        int iHashCode = i10 + (str != null ? str.hashCode() : 0);
        for (p pVar : this.f46875e) {
            int i11 = iHashCode * 31;
            String strY = pVar.y();
            int iHashCode2 = (i11 + (strY != null ? strY.hashCode() : 0)) * 31;
            String strI = pVar.i();
            int iHashCode3 = (iHashCode2 + (strI != null ? strI.hashCode() : 0)) * 31;
            String strT = pVar.t();
            iHashCode = iHashCode3 + (strT != null ? strT.hashCode() : 0);
        }
        Iterator itB = Y.b(this.f46876f);
        if (itB.hasNext()) {
            AbstractC5487d.a(itB.next());
            throw null;
        }
        for (String str2 : this.f46877g.keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str2.hashCode()) * 31;
            Object obj = this.f46877g.get(str2);
            iHashCode = iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] i(f2.r r6) {
        /*
            r5 = this;
            Zg.m r0 = new Zg.m
            r0.<init>()
            r1 = r5
        L6:
            kotlin.jvm.internal.AbstractC6492s.f(r1)
            f2.t r2 = r1.f46872b
            if (r6 == 0) goto L10
            f2.t r3 = r6.f46872b
            goto L11
        L10:
            r3 = 0
        L11:
            if (r3 == 0) goto L24
            f2.t r3 = r6.f46872b
            kotlin.jvm.internal.AbstractC6492s.f(r3)
            int r4 = r1.f46878h
            f2.r r3 = r3.N(r4)
            if (r3 != r1) goto L24
            r0.addFirst(r1)
            goto L3a
        L24:
            if (r2 == 0) goto L2e
            int r3 = r2.V()
            int r4 = r1.f46878h
            if (r3 == r4) goto L31
        L2e:
            r0.addFirst(r1)
        L31:
            boolean r1 = kotlin.jvm.internal.AbstractC6492s.d(r2, r6)
            if (r1 == 0) goto L38
            goto L3a
        L38:
            if (r2 != 0) goto L6a
        L3a:
            java.util.List r6 = Zg.AbstractC3689v.i1(r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = Zg.AbstractC3689v.w(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L4f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r6.next()
            f2.r r1 = (f2.r) r1
            int r1 = r1.f46878h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L4f
        L65:
            int[] r6 = Zg.AbstractC3689v.h1(r0)
            return r6
        L6a:
            r1 = r2
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.r.i(f2.r):int[]");
    }

    public final Map k() {
        return U.t(this.f46877g);
    }

    public String q() {
        String str = this.f46873c;
        return str == null ? String.valueOf(this.f46878h) : str;
    }

    public final int s() {
        return this.f46878h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f46873c;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f46878h));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.f46879i;
        if (str2 != null && !kotlin.text.t.m0(str2)) {
            sb2.append(" route=");
            sb2.append(this.f46879i);
        }
        if (this.f46874d != null) {
            sb2.append(" label=");
            sb2.append(this.f46874d);
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "sb.toString()");
        return string;
    }

    public final String u() {
        return this.f46871a;
    }

    public final t v() {
        return this.f46872b;
    }

    public final String w() {
        return this.f46879i;
    }

    public final boolean y(String route, Bundle bundle) {
        AbstractC6492s.i(route, "route");
        if (AbstractC6492s.d(this.f46879i, route)) {
            return true;
        }
        b bVarA = A(route);
        if (AbstractC6492s.d(this, bVarA != null ? bVarA.b() : null)) {
            return bVarA.d(bundle);
        }
        return false;
    }

    public b z(q navDeepLinkRequest) {
        AbstractC6492s.i(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.f46875e.isEmpty()) {
            return null;
        }
        b bVar = null;
        for (p pVar : this.f46875e) {
            Uri uriC = navDeepLinkRequest.c();
            if (pVar.E(navDeepLinkRequest)) {
                Bundle bundleO = uriC != null ? pVar.o(uriC, this.f46877g) : null;
                int iH = pVar.h(uriC);
                String strA = navDeepLinkRequest.a();
                boolean z10 = strA != null && AbstractC6492s.d(strA, pVar.i());
                String strB = navDeepLinkRequest.b();
                int iU = strB != null ? pVar.u(strB) : -1;
                if (bundleO == null) {
                    if (z10 || iU > -1) {
                        if (x(pVar, uriC, this.f46877g)) {
                        }
                    }
                }
                b bVar2 = new b(this, bundleO, pVar.z(), iH, z10, iU);
                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                    bVar = bVar2;
                }
            }
        }
        return bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(AbstractC5498D navigator) {
        this(C5499E.f46695b.a(navigator.getClass()));
        AbstractC6492s.i(navigator, "navigator");
    }
}
