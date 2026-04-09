package com.yandex.mobile.ads.impl;

import R9.C1565b;
import R9.C1566c;
import b9.C1992A;
import b9.m;
import c9.C2079C;
import c9.C2100u;
import c9.C2101v;
import d9.C4285c;
import d9.C4289g;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g6 {

    public static final class a extends kotlin.jvm.internal.m implements p9.l<C1566c, C1992A> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n6 f27551b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n6 n6Var) {
            super(1);
            this.f27551b = n6Var;
        }

        @Override // p9.l
        public final C1992A invoke(C1566c c1566c) {
            C1566c putJsonArray = c1566c;
            kotlin.jvm.internal.l.f(putJsonArray, "$this$putJsonArray");
            Iterator<T> it = this.f27551b.f().iterator();
            while (it.hasNext()) {
                R9.C element = R9.j.b((String) it.next());
                kotlin.jvm.internal.l.f(element, "element");
                putJsonArray.f11785a.add(element);
            }
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements p9.l<R9.A, C1992A> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n6 f27552b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n6 n6Var) {
            super(1);
            this.f27552b = n6Var;
        }

        @Override // p9.l
        public final C1992A invoke(R9.A a10) {
            R9.A putJsonObject = a10;
            kotlin.jvm.internal.l.f(putJsonObject, "$this$putJsonObject");
            Iterator<T> it = this.f27552b.a().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                T1.B.v(putJsonObject, (String) entry.getKey(), new h6(entry));
            }
            return C1992A.f18074a;
        }
    }

    public static n6 a(String jsonData) {
        Object objA;
        kotlin.jvm.internal.l.f(jsonData, "jsonData");
        try {
            objA = a(new JSONObject(jsonData));
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) != null) {
            fp0.b(new Object[0]);
        }
        if (objA instanceof m.a) {
            objA = null;
        }
        return (n6) objA;
    }

    private static Map b(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        C4285c c4285c = new C4285c();
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.l.e(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            o6 o6Var = new o6(jSONObject2.getBoolean("isDisabled"), jSONObject2.getInt("usagePercent"));
            kotlin.jvm.internal.l.c(next);
            c4285c.put(next, o6Var);
        }
        return c4285c.c();
    }

    public static n6 a(JSONObject jSONObject) {
        Object objA;
        Set setA;
        if (jSONObject == null) {
            return null;
        }
        try {
            boolean z10 = jSONObject.getBoolean("isEnabled");
            boolean z11 = jSONObject.getBoolean("isInDebug");
            String string = jSONObject.getString("apiKey");
            kotlin.jvm.internal.l.e(string, "getString(...)");
            long j4 = jSONObject.getLong("validationTimeoutInSec");
            int i = jSONObject.getInt("usagePercent");
            boolean z12 = jSONObject.getBoolean("willBlockAdOnInternalError");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("enabledAdUnits");
            if (jSONArrayOptJSONArray != null) {
                C4289g c4289g = new C4289g();
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string2 = jSONArrayOptJSONArray.getString(i10);
                    kotlin.jvm.internal.l.c(string2);
                    if (string2.length() > 0) {
                        c4289g.add(string2);
                    }
                }
                setA = C2079C.a(c4289g);
            } else {
                setA = null;
            }
            if (setA == null) {
                setA = C2101v.f18583b;
            }
            Set set = setA;
            Map mapB = b(jSONObject.optJSONObject("adNetworksCustomParameters"));
            if (mapB == null) {
                mapB = C2100u.f18582b;
            }
            objA = new n6(z10, z11, string, j4, i, z12, set, mapB);
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) != null) {
            jSONObject.toString();
            fp0.b(new Object[0]);
        }
        return (n6) (objA instanceof m.a ? null : objA);
    }

    public static String a(n6 n6Var) {
        if (n6Var == null) {
            return null;
        }
        R9.A a10 = new R9.A();
        T1.B.s(a10, "isEnabled", Boolean.valueOf(n6Var.e()));
        T1.B.s(a10, "isInDebug", Boolean.valueOf(n6Var.d()));
        T1.B.u(a10, "apiKey", n6Var.b());
        T1.B.t(a10, "validationTimeoutInSec", Long.valueOf(n6Var.h()));
        T1.B.t(a10, "usagePercent", Integer.valueOf(n6Var.g()));
        T1.B.s(a10, "willBlockAdOnInternalError", Boolean.valueOf(n6Var.c()));
        a aVar = new a(n6Var);
        C1566c c1566c = new C1566c();
        aVar.invoke(c1566c);
        a10.b(new C1565b(c1566c.f11785a), "enabledAdUnits");
        T1.B.v(a10, "adNetworksCustomParameters", new b(n6Var));
        return a10.a().toString();
    }
}
