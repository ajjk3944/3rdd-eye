package b7;

import N7.B8;
import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2078B;
import c9.C2095p;
import c9.C2097r;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ToString.kt */
/* loaded from: classes.dex */
public final class B0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final B0 f17213a = new B0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f17214b = "toString";

    /* renamed from: c, reason: collision with root package name */
    public static final List<a7.j> f17215c = E.u.G(new a7.j(EnumC1667d.DICT, false));

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1667d f17216d = EnumC1667d.STRING;

    public static TreeMap j(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.l.e(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            kotlin.jvm.internal.l.e(key, "key");
            arrayList.add(key);
        }
        C2095p.h0(arrayList);
        TreeMap treeMap = new TreeMap();
        C2078B.r(treeMap, new b9.l[0]);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object objJ = jSONObject.get(str);
            if (objJ instanceof JSONObject) {
                f17213a.getClass();
                objJ = j((JSONObject) objJ);
            }
            treeMap.put(str, objJ);
        }
        return treeMap;
    }

    public static String k(Object obj) {
        String strK;
        if (!(obj instanceof Map)) {
            if (!(obj instanceof String)) {
                return obj.toString();
            }
            return "\"" + obj + '\"';
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append(entry.getKey());
            sb.append("\":");
            Object value = entry.getValue();
            if (value != null) {
                f17213a.getClass();
                strK = k(value);
            } else {
                strK = null;
            }
            sb.append(strK);
            arrayList.add(sb.toString());
        }
        return B8.j(new StringBuilder("{"), C2097r.u0(arrayList, StringUtils.COMMA, null, null, null, 62), '}');
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type org.json.JSONObject");
        return k(j((JSONObject) objP0));
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return f17215c;
    }

    @Override // a7.g
    public final String c() {
        return f17214b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return f17216d;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }
}
