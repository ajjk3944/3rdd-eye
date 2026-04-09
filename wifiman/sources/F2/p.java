package f2;

import Yg.J;
import Zg.AbstractC3689v;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: q, reason: collision with root package name */
    private static final b f46826q = new b(null);

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f46827r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: s, reason: collision with root package name */
    private static final Pattern f46828s = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: t, reason: collision with root package name */
    private static final String f46829t = "http[s]?://";

    /* renamed from: u, reason: collision with root package name */
    private static final String f46830u = ".*";

    /* renamed from: v, reason: collision with root package name */
    private static final String f46831v = "\\E.*\\Q";

    /* renamed from: w, reason: collision with root package name */
    private static final String f46832w = "([^/]*?|)";

    /* renamed from: a, reason: collision with root package name */
    private final String f46833a;

    /* renamed from: b, reason: collision with root package name */
    private final String f46834b;

    /* renamed from: c, reason: collision with root package name */
    private final String f46835c;

    /* renamed from: e, reason: collision with root package name */
    private String f46837e;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f46840h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f46841i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f46842j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f46843k;

    /* renamed from: l, reason: collision with root package name */
    private final Yg.m f46844l;

    /* renamed from: m, reason: collision with root package name */
    private final Yg.m f46845m;

    /* renamed from: n, reason: collision with root package name */
    private String f46846n;

    /* renamed from: o, reason: collision with root package name */
    private final Yg.m f46847o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f46848p;

    /* renamed from: d, reason: collision with root package name */
    private final List f46836d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final Yg.m f46838f = Yg.n.b(new l());

    /* renamed from: g, reason: collision with root package name */
    private final Yg.m f46839g = Yg.n.b(new j());

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final C1755a f46849d = new C1755a(null);

        /* renamed from: a, reason: collision with root package name */
        private String f46850a;

        /* renamed from: b, reason: collision with root package name */
        private String f46851b;

        /* renamed from: c, reason: collision with root package name */
        private String f46852c;

        /* renamed from: f2.p$a$a, reason: collision with other inner class name */
        public static final class C1755a {
            public /* synthetic */ C1755a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1755a() {
            }
        }

        public final p a() {
            return new p(this.f46850a, this.f46851b, this.f46852c);
        }

        public final a b(String uriPattern) {
            AbstractC6492s.i(uriPattern, "uriPattern");
            this.f46850a = uriPattern;
            return this;
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static final class c implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        private String f46853a;

        /* renamed from: b, reason: collision with root package name */
        private String f46854b;

        public c(String mimeType) {
            List listL;
            AbstractC6492s.i(mimeType, "mimeType");
            List listP = new kotlin.text.p(MqttTopic.TOPIC_LEVEL_SEPARATOR).p(mimeType, 0);
            if (listP.isEmpty()) {
                listL = AbstractC3689v.l();
            } else {
                ListIterator listIterator = listP.listIterator(listP.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listL = AbstractC3689v.a1(listP, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listL = AbstractC3689v.l();
            }
            this.f46853a = (String) listL.get(0);
            this.f46854b = (String) listL.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c other) {
            AbstractC6492s.i(other, "other");
            int i10 = AbstractC6492s.d(this.f46853a, other.f46853a) ? 2 : 0;
            return AbstractC6492s.d(this.f46854b, other.f46854b) ? i10 + 1 : i10;
        }

        public final String b() {
            return this.f46854b;
        }

        public final String c() {
            return this.f46853a;
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private String f46855a;

        /* renamed from: b, reason: collision with root package name */
        private final List f46856b = new ArrayList();

        public final void a(String name) {
            AbstractC6492s.i(name, "name");
            this.f46856b.add(name);
        }

        public final List b() {
            return this.f46856b;
        }

        public final String c() {
            return this.f46855a;
        }

        public final void d(String str) {
            this.f46855a = str;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {
        e() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List list;
            Yg.s sVarL = p.this.l();
            return (sVarL == null || (list = (List) sVarL.h()) == null) ? new ArrayList() : list;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6824a {
        f() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Yg.s invoke() {
            return p.this.H();
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6824a {
        g() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String strN = p.this.n();
            if (strN != null) {
                return Pattern.compile(strN, 2);
            }
            return null;
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {
        h() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            Yg.s sVarL = p.this.l();
            if (sVarL != null) {
                return (String) sVarL.j();
            }
            return null;
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f46861a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Bundle bundle) {
            super(1);
            this.f46861a = bundle;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String argName) {
            AbstractC6492s.i(argName, "argName");
            return Boolean.valueOf(!this.f46861a.containsKey(argName));
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6824a {
        j() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((p.this.y() == null || Uri.parse(p.this.y()).getQuery() == null) ? false : true);
        }
    }

    static final class k extends AbstractC6494u implements InterfaceC6824a {
        k() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = p.this.f46846n;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    static final class l extends AbstractC6494u implements InterfaceC6824a {
        l() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = p.this.f46837e;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    static final class m extends AbstractC6494u implements InterfaceC6824a {
        m() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return p.this.L();
        }
    }

    public p(String str, String str2, String str3) {
        this.f46833a = str;
        this.f46834b = str2;
        this.f46835c = str3;
        Yg.q qVar = Yg.q.NONE;
        this.f46840h = Yg.n.a(qVar, new m());
        this.f46842j = Yg.n.a(qVar, new f());
        this.f46843k = Yg.n.a(qVar, new e());
        this.f46844l = Yg.n.a(qVar, new h());
        this.f46845m = Yg.n.b(new g());
        this.f46847o = Yg.n.b(new k());
        K();
        J();
    }

    private final boolean A() {
        return ((Boolean) this.f46839g.getValue()).booleanValue();
    }

    private final boolean B(String str) {
        boolean z10 = str == null;
        String str2 = this.f46834b;
        return z10 != (str2 != null) && (str == null || AbstractC6492s.d(str2, str));
    }

    private final boolean C(String str) {
        if ((str == null) != (this.f46835c != null)) {
            if (str == null) {
                return true;
            }
            Pattern patternV = v();
            AbstractC6492s.f(patternV);
            if (patternV.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private final boolean D(Uri uri) {
        if ((uri == null) != (w() != null)) {
            if (uri == null) {
                return true;
            }
            Pattern patternW = w();
            AbstractC6492s.f(patternW);
            if (patternW.matcher(uri.toString()).matches()) {
                return true;
            }
        }
        return false;
    }

    private final void F(Bundle bundle, String str, String str2, C5509h c5509h) {
        if (c5509h != null) {
            c5509h.a().d(bundle, str, str2);
        } else {
            bundle.putString(str, str2);
        }
    }

    private final boolean G(Bundle bundle, String str, String str2, C5509h c5509h) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (c5509h == null) {
            return false;
        }
        AbstractC5496B abstractC5496BA = c5509h.a();
        abstractC5496BA.e(bundle, str, str2, abstractC5496BA.a(bundle, str));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Yg.s H() {
        String str = this.f46833a;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.f46833a).getFragment();
        StringBuilder sb2 = new StringBuilder();
        AbstractC6492s.f(fragment);
        g(fragment, arrayList, sb2);
        String string = sb2.toString();
        AbstractC6492s.h(string, "fragRegex.toString()");
        return Yg.z.a(arrayList, string);
    }

    private final boolean I(List list, d dVar, Bundle bundle, Map map) {
        Object objValueOf;
        Bundle bundleB = A1.d.b(new Yg.s[0]);
        Iterator it = dVar.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            C5509h c5509h = (C5509h) map.get(str);
            AbstractC5496B abstractC5496BA = c5509h != null ? c5509h.a() : null;
            if ((abstractC5496BA instanceof AbstractC5504c) && !c5509h.b()) {
                abstractC5496BA.h(bundleB, str, ((AbstractC5504c) abstractC5496BA).k());
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            String strC = dVar.c();
            Matcher matcher = strC != null ? Pattern.compile(strC, 32).matcher(str2) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            List listB = dVar.b();
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(listB, 10));
            int i10 = 0;
            for (Object obj : listB) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC3689v.v();
                }
                String str3 = (String) obj;
                String strGroup = matcher.group(i11);
                if (strGroup == null) {
                    strGroup = "";
                } else {
                    AbstractC6492s.h(strGroup, "argMatcher.group(index + 1) ?: \"\"");
                }
                C5509h c5509h2 = (C5509h) map.get(str3);
                try {
                    if (bundleB.containsKey(str3)) {
                        objValueOf = Boolean.valueOf(G(bundleB, str3, strGroup, c5509h2));
                    } else {
                        F(bundleB, str3, strGroup, c5509h2);
                        objValueOf = J.f24997a;
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = J.f24997a;
                }
                arrayList.add(objValueOf);
                i10 = i11;
            }
        }
        bundle.putAll(bundleB);
        return true;
    }

    private final void J() {
        if (this.f46835c == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f46835c).matches()) {
            throw new IllegalArgumentException(("The given mimeType " + this.f46835c + " does not match to required \"type/subtype\" format").toString());
        }
        c cVar = new c(this.f46835c);
        this.f46846n = kotlin.text.t.L("^(" + cVar.c() + "|[*]+)/(" + cVar.b() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    private final void K() {
        if (this.f46833a == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("^");
        if (!f46827r.matcher(this.f46833a).find()) {
            sb2.append(f46829t);
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.f46833a);
        matcher.find();
        boolean z10 = false;
        String strSubstring = this.f46833a.substring(0, matcher.start());
        AbstractC6492s.h(strSubstring, "substring(...)");
        g(strSubstring, this.f46836d, sb2);
        String str = f46830u;
        if (!kotlin.text.t.W(sb2, str, false, 2, null) && !kotlin.text.t.W(sb2, f46832w, false, 2, null)) {
            z10 = true;
        }
        this.f46848p = z10;
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb2.toString();
        AbstractC6492s.h(string, "uriRegex.toString()");
        this.f46837e = kotlin.text.t.L(string, str, f46831v, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map L() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!A()) {
            return linkedHashMap;
        }
        Uri uri = Uri.parse(this.f46833a);
        for (String paramName : uri.getQueryParameterNames()) {
            StringBuilder sb2 = new StringBuilder();
            List<String> queryParams = uri.getQueryParameters(paramName);
            if (queryParams.size() > 1) {
                throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.f46833a + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
            AbstractC6492s.h(queryParams, "queryParams");
            String queryParam = (String) AbstractC3689v.s0(queryParams);
            if (queryParam == null) {
                this.f46841i = true;
                queryParam = paramName;
            }
            Matcher matcher = f46828s.matcher(queryParam);
            d dVar = new d();
            int iEnd = 0;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                AbstractC6492s.g(strGroup, "null cannot be cast to non-null type kotlin.String");
                dVar.a(strGroup);
                AbstractC6492s.h(queryParam, "queryParam");
                String strSubstring = queryParam.substring(iEnd, matcher.start());
                AbstractC6492s.h(strSubstring, "substring(...)");
                sb2.append(Pattern.quote(strSubstring));
                sb2.append("(.+?)?");
                iEnd = matcher.end();
            }
            if (iEnd < queryParam.length()) {
                AbstractC6492s.h(queryParam, "queryParam");
                String strSubstring2 = queryParam.substring(iEnd);
                AbstractC6492s.h(strSubstring2, "substring(...)");
                sb2.append(Pattern.quote(strSubstring2));
            }
            String string = sb2.toString();
            AbstractC6492s.h(string, "argRegex.toString()");
            dVar.d(kotlin.text.t.L(string, f46830u, f46831v, false, 4, null));
            AbstractC6492s.h(paramName, "paramName");
            linkedHashMap.put(paramName, dVar);
        }
        return linkedHashMap;
    }

    private final void g(String str, List list, StringBuilder sb2) {
        Matcher matcher = f46828s.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            AbstractC6492s.g(strGroup, "null cannot be cast to non-null type kotlin.String");
            list.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                AbstractC6492s.h(strSubstring, "substring(...)");
                sb2.append(Pattern.quote(strSubstring));
            }
            sb2.append(f46832w);
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            AbstractC6492s.h(strSubstring2, "substring(...)");
            sb2.append(Pattern.quote(strSubstring2));
        }
    }

    private final List k() {
        return (List) this.f46843k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Yg.s l() {
        return (Yg.s) this.f46842j.getValue();
    }

    private final Pattern m() {
        return (Pattern) this.f46845m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        return (String) this.f46844l.getValue();
    }

    private final boolean q(Matcher matcher, Bundle bundle, Map map) {
        List list = this.f46836d;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i11));
            C5509h c5509h = (C5509h) map.get(str);
            try {
                AbstractC6492s.h(value, "value");
                F(bundle, str, value, c5509h);
                arrayList.add(J.f24997a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(Uri uri, Bundle bundle, Map map) {
        String query;
        for (Map.Entry entry : x().entrySet()) {
            String str = (String) entry.getKey();
            d dVar = (d) entry.getValue();
            List<String> inputParams = uri.getQueryParameters(str);
            if (this.f46841i && (query = uri.getQuery()) != null && !AbstractC6492s.d(query, uri.toString())) {
                inputParams = AbstractC3689v.e(query);
            }
            AbstractC6492s.h(inputParams, "inputParams");
            if (!I(inputParams, dVar, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    private final void s(String str, Bundle bundle, Map map) {
        Pattern patternM = m();
        Matcher matcher = patternM != null ? patternM.matcher(String.valueOf(str)) : null;
        if (matcher != null && matcher.matches()) {
            List listK = k();
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(listK, 10));
            int i10 = 0;
            for (Object obj : listK) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC3689v.v();
                }
                String str2 = (String) obj;
                String value = Uri.decode(matcher.group(i11));
                C5509h c5509h = (C5509h) map.get(str2);
                try {
                    AbstractC6492s.h(value, "value");
                    F(bundle, str2, value, c5509h);
                    arrayList.add(J.f24997a);
                    i10 = i11;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    private final Pattern v() {
        return (Pattern) this.f46847o.getValue();
    }

    private final Pattern w() {
        return (Pattern) this.f46838f.getValue();
    }

    private final Map x() {
        return (Map) this.f46840h.getValue();
    }

    public final boolean E(q deepLinkRequest) {
        AbstractC6492s.i(deepLinkRequest, "deepLinkRequest");
        if (D(deepLinkRequest.c()) && B(deepLinkRequest.a())) {
            return C(deepLinkRequest.b());
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC6492s.d(this.f46833a, pVar.f46833a) && AbstractC6492s.d(this.f46834b, pVar.f46834b) && AbstractC6492s.d(this.f46835c, pVar.f46835c);
    }

    public final int h(Uri uri) {
        if (uri == null || this.f46833a == null) {
            return 0;
        }
        List<String> requestedPathSegments = uri.getPathSegments();
        List<String> uriPathSegments = Uri.parse(this.f46833a).getPathSegments();
        AbstractC6492s.h(requestedPathSegments, "requestedPathSegments");
        AbstractC6492s.h(uriPathSegments, "uriPathSegments");
        return AbstractC3689v.v0(requestedPathSegments, uriPathSegments).size();
    }

    public int hashCode() {
        String str = this.f46833a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f46834b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f46835c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.f46834b;
    }

    public final List j() {
        List list = this.f46836d;
        Collection collectionValues = x().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            AbstractC3689v.C(arrayList, ((d) it.next()).b());
        }
        return AbstractC3689v.M0(AbstractC3689v.M0(list, arrayList), k());
    }

    public final Bundle o(Uri deepLink, Map arguments) {
        AbstractC6492s.i(deepLink, "deepLink");
        AbstractC6492s.i(arguments, "arguments");
        Pattern patternW = w();
        Matcher matcher = patternW != null ? patternW.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!q(matcher, bundle, arguments)) {
            return null;
        }
        if (A() && !r(deepLink, bundle, arguments)) {
            return null;
        }
        s(deepLink.getFragment(), bundle, arguments);
        if (AbstractC5511j.a(arguments, new i(bundle)).isEmpty()) {
            return bundle;
        }
        return null;
    }

    public final Bundle p(Uri uri, Map arguments) {
        AbstractC6492s.i(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern patternW = w();
        Matcher matcher = patternW != null ? patternW.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return bundle;
        }
        q(matcher, bundle, arguments);
        if (A()) {
            r(uri, bundle, arguments);
        }
        return bundle;
    }

    public final String t() {
        return this.f46835c;
    }

    public final int u(String mimeType) {
        AbstractC6492s.i(mimeType, "mimeType");
        if (this.f46835c != null) {
            Pattern patternV = v();
            AbstractC6492s.f(patternV);
            if (patternV.matcher(mimeType).matches()) {
                return new c(this.f46835c).compareTo(new c(mimeType));
            }
        }
        return -1;
    }

    public final String y() {
        return this.f46833a;
    }

    public final boolean z() {
        return this.f46848p;
    }
}
