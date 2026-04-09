package q0;

import android.net.Uri;
import android.os.Bundle;
import c5.C0410g;
import c5.C0412i;
import d5.AbstractC2282j;
import d5.AbstractC2283k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f23010q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f23011r = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name */
    public final String f23012a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23013b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23014c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f23015d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23016e;

    /* renamed from: f, reason: collision with root package name */
    public final C0410g f23017f;

    /* renamed from: g, reason: collision with root package name */
    public final C0410g f23018g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f23019h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f23020j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f23021k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f23022l;

    /* renamed from: m, reason: collision with root package name */
    public final C0410g f23023m;

    /* renamed from: n, reason: collision with root package name */
    public final String f23024n;

    /* renamed from: o, reason: collision with root package name */
    public final C0410g f23025o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f23026p;

    public s(String str, String str2, String str3) {
        List listL;
        List listG0;
        this.f23012a = str;
        this.f23013b = str2;
        this.f23014c = str3;
        ArrayList arrayList = new ArrayList();
        this.f23015d = arrayList;
        this.f23017f = new C0410g(new q(this, 6));
        this.f23018g = new C0410g(new q(this, 4));
        this.f23019h = I5.b.s(new q(this, 7));
        this.f23020j = I5.b.s(new q(this, 1));
        this.f23021k = I5.b.s(new q(this, 0));
        this.f23022l = I5.b.s(new q(this, 3));
        this.f23023m = new C0410g(new q(this, 2));
        this.f23025o = new C0410g(new q(this, 5));
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!f23010q.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            String strSubstring = str.substring(0, matcher.start());
            q5.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            a(strSubstring, arrayList, sb);
            this.f23026p = (y5.l.V(sb, ".*", false) || y5.l.V(sb, "([^/]+?)", false)) ? false : true;
            sb.append("($|(\\?(.)*)|(\\#(.)*))");
            String string = sb.toString();
            q5.i.d(string, "uriRegex.toString()");
            this.f23016e = y5.l.f0(string, ".*", "\\E.*\\Q");
        }
        if (str3 == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            throw new IllegalArgumentException(A.f.m("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
        }
        Pattern patternCompile = Pattern.compile("/");
        q5.i.d(patternCompile, "compile(...)");
        Matcher matcher2 = patternCompile.matcher(str3);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList2.add(str3.subSequence(iEnd, matcher2.start()).toString());
                iEnd = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str3.subSequence(iEnd, str3.length()).toString());
            listL = arrayList2;
        } else {
            listL = a4.p.l(str3.toString());
        }
        if (listL.isEmpty()) {
            listG0 = d5.s.f19824a;
        } else {
            ListIterator listIterator = listL.listIterator(listL.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listG0 = AbstractC2282j.g0(listIterator.nextIndex() + 1, listL);
                    break;
                }
            }
            listG0 = d5.s.f19824a;
        }
        this.f23024n = y5.l.f0("^(" + ((String) listG0.get(0)) + "|[*]+)/(" + ((String) listG0.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = f23011r.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            q5.i.c(strGroup, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                q5.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(strSubstring));
            }
            sb.append("([^/]+?)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            q5.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(strSubstring2));
        }
    }

    public static void d(Bundle bundle, String str, String str2, C2793f c2793f) {
        if (c2793f == null) {
            bundle.putString(str, str2);
            return;
        }
        J j6 = c2793f.f22960a;
        q5.i.e(str, "key");
        j6.e(bundle, str, j6.c(str2));
    }

    public final boolean b(Matcher matcher, Bundle bundle, Map map) {
        ArrayList arrayList = this.f23015d;
        ArrayList arrayList2 = new ArrayList(d5.l.P(arrayList));
        int size = arrayList.size();
        int i = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            int i6 = i + 1;
            if (i < 0) {
                AbstractC2283k.O();
                throw null;
            }
            String str = (String) obj;
            String strDecode = Uri.decode(matcher.group(i6));
            C2793f c2793f = (C2793f) map.get(str);
            try {
                q5.i.d(strDecode, "value");
                d(bundle, str, strDecode, c2793f);
                arrayList2.add(C0412i.f5929a);
                i = i6;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [c5.b, java.lang.Object] */
    public final boolean c(Uri uri, Bundle bundle, Map map) {
        Iterator it;
        p pVar;
        String query;
        s sVar = this;
        Iterator it2 = ((Map) sVar.f23019h.getValue()).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String str = (String) entry.getKey();
            p pVar2 = (p) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (sVar.i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = a4.p.l(query);
            }
            if (queryParameters != null) {
                for (String str2 : queryParameters) {
                    String str3 = pVar2.f23004a;
                    Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                    int i = 0;
                    if (matcher == null || !matcher.matches()) {
                        return false;
                    }
                    Bundle bundle2 = new Bundle();
                    try {
                        ArrayList arrayList = pVar2.f23005b;
                        ArrayList arrayList2 = new ArrayList(d5.l.P(arrayList));
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            int i6 = i + 1;
                            if (i < 0) {
                                AbstractC2283k.O();
                                throw null;
                            }
                            String str4 = (String) obj;
                            String strGroup = matcher.group(i6);
                            if (strGroup == null) {
                                strGroup = "";
                            }
                            try {
                                C2793f c2793f = (C2793f) map.get(str4);
                                if (bundle.containsKey(str4)) {
                                    it = it2;
                                    pVar = pVar2;
                                    if (c2793f != null) {
                                        J j6 = c2793f.f22960a;
                                        Object objA = j6.a(str4, bundle);
                                        if (!bundle.containsKey(str4)) {
                                            throw new IllegalArgumentException("There is no previous value in this bundle.");
                                        }
                                        j6.e(bundle, str4, j6.d(strGroup, objA));
                                    } else {
                                        continue;
                                    }
                                } else {
                                    it = it2;
                                    try {
                                        StringBuilder sb = new StringBuilder();
                                        pVar = pVar2;
                                        try {
                                            sb.append('{');
                                            sb.append(str4);
                                            sb.append('}');
                                            if (!strGroup.equals(sb.toString())) {
                                                d(bundle2, str4, strGroup, c2793f);
                                            }
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        pVar = pVar2;
                                        it2 = it;
                                        pVar2 = pVar;
                                    }
                                }
                                arrayList2.add(C0412i.f5929a);
                                i = i6;
                                it2 = it;
                                pVar2 = pVar;
                            } catch (IllegalArgumentException unused3) {
                                it = it2;
                                pVar = pVar2;
                                it2 = it;
                                pVar2 = pVar;
                            }
                        }
                        it = it2;
                        pVar = pVar2;
                        bundle.putAll(bundle2);
                    } catch (IllegalArgumentException unused4) {
                    }
                    it2 = it;
                    pVar2 = pVar;
                }
            }
            sVar = this;
            it2 = it2;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof s)) {
            s sVar = (s) obj;
            if (q5.i.a(this.f23012a, sVar.f23012a) && q5.i.a(this.f23013b, sVar.f23013b) && q5.i.a(this.f23014c, sVar.f23014c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f23012a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23013b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23014c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
