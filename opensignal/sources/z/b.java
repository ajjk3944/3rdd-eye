package z;

import ak.x;
import br.l;
import ch.n;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.n8;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.t9;
import g4.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zc.q;
import zc.u;

/* loaded from: classes.dex */
public final class b implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26477a;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b f26472d = new b(1);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b f26473g = new b(2);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ b f26474r = new b(3);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ b f26475x = new b(4);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ b f26476y = new b(5);
    public static final /* synthetic */ b B = new b(6);
    public static final /* synthetic */ b D = new b(7);
    public static final /* synthetic */ b E = new b(8);
    public static final /* synthetic */ b F = new b(9);
    public static final /* synthetic */ b G = new b(10);
    public static final /* synthetic */ b H = new b(11);
    public static final /* synthetic */ b I = new b(12);
    public static final /* synthetic */ b J = new b(13);
    public static final /* synthetic */ b K = new b(14);
    public static final /* synthetic */ b L = new b(15);
    public static final /* synthetic */ b M = new b(16);
    public static final /* synthetic */ b N = new b(17);

    public /* synthetic */ b(int i10) {
        this.f26477a = i10;
    }

    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        bi.b bVar;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            if (jSONObject == null) {
                bVar = null;
            } else {
                String string = jSONObject.getString("name");
                String string2 = jSONObject.getString("op");
                Object obj = jSONObject.get("expected_value");
                l.b(string);
                l.b(string2);
                bVar = new bi.b(string, string2, obj);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public static JSONArray b(List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bi.b bVar = (bi.b) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", bVar.f2762a);
            jSONObject.put("op", bVar.f2763b);
            Object obj = bVar.f2764c;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("expected_value", obj);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static JSONObject e(mj.e eVar) throws JSONException {
        l.e(eVar, "input");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("kilobytes", eVar.f16851a);
            jSONObject.put("days", eVar.f16852b);
            jSONObject.put("app_status_mode", eVar.f16853c.getValue());
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public static JSONObject f(bi.c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = cVar.f2766b;
        List list = cVar.f2768d;
        jSONObject.put("recipe_name", str);
        jSONObject.put("type", cVar.f2765a);
        JSONObject jSONObject2 = new JSONObject();
        List list2 = cVar.f2767c;
        if (!list2.isEmpty()) {
            jSONObject2.put("AND", b(list2));
        }
        if (!list.isEmpty()) {
            jSONObject2.put("OR", b(list));
        }
        jSONObject.put("field_rules", jSONObject2);
        jSONObject.put("analysis_result", cVar.f2769e.a());
        return jSONObject;
    }

    public static mj.e i(JSONObject jSONObject, mj.e eVar) {
        mj.b bVarA;
        if (jSONObject != null) {
            try {
                Long lC = xu.d.C("kilobytes", jSONObject);
                long jLongValue = lC != null ? lC.longValue() : eVar.f16851a;
                Long lC2 = xu.d.C("days", jSONObject);
                long jLongValue2 = lC2 != null ? lC2.longValue() : eVar.f16852b;
                Integer numY = xu.d.y("app_status_mode", jSONObject);
                if (numY != null) {
                    mj.a aVar = mj.b.Companion;
                    int iIntValue = numY.intValue();
                    aVar.getClass();
                    bVarA = mj.a.a(iIntValue);
                } else {
                    bVarA = eVar.f16853c;
                }
                return new mj.e(jLongValue, jLongValue2, bVarA);
            } catch (JSONException unused) {
            }
        }
        return eVar;
    }

    public JSONArray c(ak.c cVar) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = cVar.f448a.iterator();
            while (it.hasNext()) {
                jSONArray.put(f((bi.c) it.next()));
            }
            return jSONArray;
        } catch (JSONException e4) {
            n.e("AssistantConfigMapper", e4);
            cj.a.G(e4);
            return new JSONArray();
        }
    }

    public JSONObject d(x xVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("test_url", xVar.f759a);
            jSONObject.put("test_servers", new JSONArray((Collection) xVar.f760b));
            jSONObject.put("test_count", xVar.f761c);
            jSONObject.put("test_timeout_ms", xVar.f762d);
            jSONObject.put("test_size_bytes", xVar.f763e);
            jSONObject.put("test_period_ms", xVar.f764f);
            jSONObject.put("test_arguments", xVar.f765g);
            jSONObject.put("traceroute_enabled", xVar.f766h);
            jSONObject.put("traceroute_test_period_ms", xVar.f767i);
            jSONObject.put("traceroute_node_timeout_ms", xVar.j);
            jSONObject.put("traceroute_max_hop_count", xVar.k);
            jSONObject.put("traceroute_test_timeout_ms", xVar.f768l);
            jSONObject.put("traceroute_test_count", xVar.f769m);
            jSONObject.put("traceroute_ip_mask_count", xVar.f770n);
            jSONObject.put("traceroute_ipv4_mask", xVar.f771o);
            jSONObject.put("traceroute_ipv6_mask", xVar.f772p);
            jSONObject.put("traceroute_first_hop_wifi", xVar.f773q);
            jSONObject.put("traceroute_first_hop_cellular", xVar.f774r);
            jSONObject.put("traceroute_internal_address_for_wifi_enabled", xVar.f775s);
            jSONObject.put("traceroute_internal_address_for_cellular_enabled", xVar.f776t);
            jSONObject.put("traceroute_run_on_resolved_ip_address", xVar.f777u);
            jSONObject.put("traceroute_continue_on_duplicate_hops", xVar.f778v);
            return jSONObject;
        } catch (JSONException e4) {
            return h0.b.x("IcmpTestConfigMapper", e4, e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[Catch: Exception -> 0x0047, TRY_LEAVE, TryCatch #0 {Exception -> 0x0047, blocks: (B:7:0x001e, B:10:0x003a, B:14:0x004a, B:16:0x0050, B:17:0x005b, B:19:0x006a, B:22:0x0071, B:33:0x009a, B:28:0x0084, B:30:0x008d, B:25:0x0078), top: B:41:0x001e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ak.c g(org.json.JSONArray r14, ak.c r15) throws org.json.JSONException {
        /*
            r13 = this;
            if (r14 != 0) goto L3
            return r15
        L3:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r1 = r14.length()
            r0 = 0
            r2 = r0
        Le:
            if (r2 >= r1) goto Lb8
            org.json.JSONObject r0 = r14.getJSONObject(r2)
            java.lang.String r3 = "getJSONObject(...)"
            br.l.d(r0, r3)
            java.lang.String r3 = "OR"
            java.lang.String r4 = "AND"
            r5 = 0
            java.lang.String r6 = "recipe_name"
            java.lang.String r9 = r0.getString(r6)     // Catch: java.lang.Exception -> L47
            java.lang.String r6 = "type"
            java.lang.String r8 = r0.getString(r6)     // Catch: java.lang.Exception -> L47
            java.lang.String r6 = "field_rules"
            org.json.JSONObject r6 = r0.getJSONObject(r6)     // Catch: java.lang.Exception -> L47
            mq.w r7 = mq.w.f16945a     // Catch: java.lang.Exception -> L47
            boolean r10 = r6.has(r4)     // Catch: java.lang.Exception -> L47
            java.lang.String r11 = "getJSONArray(...)"
            if (r10 == 0) goto L49
            org.json.JSONArray r4 = r6.getJSONArray(r4)     // Catch: java.lang.Exception -> L47
            br.l.d(r4, r11)     // Catch: java.lang.Exception -> L47
            java.util.ArrayList r4 = a(r4)     // Catch: java.lang.Exception -> L47
            r10 = r4
            goto L4a
        L47:
            r0 = move-exception
            goto La7
        L49:
            r10 = r7
        L4a:
            boolean r4 = r6.has(r3)     // Catch: java.lang.Exception -> L47
            if (r4 == 0) goto L5b
            org.json.JSONArray r3 = r6.getJSONArray(r3)     // Catch: java.lang.Exception -> L47
            br.l.d(r3, r11)     // Catch: java.lang.Exception -> L47
            java.util.ArrayList r7 = a(r3)     // Catch: java.lang.Exception -> L47
        L5b:
            r11 = r7
            java.lang.String r3 = "analysis_result"
            org.json.JSONObject r0 = r0.getJSONObject(r3)     // Catch: java.lang.Exception -> L47
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L47
            java.lang.String r3 = "AssistantAnalysisResult"
            if (r0 == 0) goto L8d
            int r4 = r0.length()     // Catch: java.lang.Exception -> L47
            if (r4 != 0) goto L71
            goto L8d
        L71:
            boolean r4 = tt.l.D0(r0)     // Catch: java.lang.Exception -> L47
            if (r4 == 0) goto L78
            goto L8d
        L78:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L83
            r4.<init>(r0)     // Catch: java.lang.Exception -> L83
            bh.a r0 = com.google.android.gms.internal.measurement.i4.p(r4)     // Catch: java.lang.Exception -> L83
            r12 = r0
            goto L97
        L83:
            r0 = move-exception
            java.lang.String r0 = ir.f0.W(r0)     // Catch: java.lang.Exception -> L47
            ch.n.c(r3, r0)     // Catch: java.lang.Exception -> L47
        L8b:
            r12 = r5
            goto L97
        L8d:
            java.lang.String r0 = "Null or blank JSON"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L47
            ch.n.g(r3, r0)     // Catch: java.lang.Exception -> L47
            goto L8b
        L97:
            if (r12 != 0) goto L9a
            goto Laf
        L9a:
            bi.c r7 = new bi.c     // Catch: java.lang.Exception -> L47
            br.l.b(r8)     // Catch: java.lang.Exception -> L47
            br.l.b(r9)     // Catch: java.lang.Exception -> L47
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L47
            r5 = r7
            goto Laf
        La7:
            java.lang.String r3 = "AssistantConfigMapper"
            ch.n.e(r3, r0)
            cj.a.G(r0)
        Laf:
            if (r5 == 0) goto Lb4
            r15.add(r5)
        Lb4:
            int r2 = r2 + 1
            goto Le
        Lb8:
            ak.c r14 = new ak.c
            r14.<init>(r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: z.b.g(org.json.JSONArray, ak.c):ak.c");
    }

    public x h(JSONObject jSONObject, x xVar) {
        if (jSONObject == null) {
            return xVar;
        }
        try {
            String strK = xu.d.K("test_url", jSONObject);
            if (strK == null) {
                strK = xVar.f759a;
            }
            String str = strK;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("test_servers");
            List listI0 = jSONArrayOptJSONArray != null ? xu.d.i0(jSONArrayOptJSONArray) : null;
            if (listI0 == null) {
                listI0 = xVar.f760b;
            }
            List list = listI0;
            Integer numY = xu.d.y("test_count", jSONObject);
            int iIntValue = numY != null ? numY.intValue() : xVar.f761c;
            Long lC = xu.d.C("test_timeout_ms", jSONObject);
            long jLongValue = lC != null ? lC.longValue() : xVar.f762d;
            Integer numY2 = xu.d.y("test_size_bytes", jSONObject);
            int iIntValue2 = numY2 != null ? numY2.intValue() : xVar.f763e;
            Integer numY3 = xu.d.y("test_period_ms", jSONObject);
            int iIntValue3 = numY3 != null ? numY3.intValue() : xVar.f764f;
            String strK2 = xu.d.K("test_arguments", jSONObject);
            if (strK2 == null) {
                strK2 = xVar.f765g;
            }
            String str2 = strK2;
            Boolean boolR = xu.d.r("traceroute_enabled", jSONObject);
            boolean zBooleanValue = boolR != null ? boolR.booleanValue() : xVar.f766h;
            Integer numY4 = xu.d.y("traceroute_test_period_ms", jSONObject);
            int iIntValue4 = numY4 != null ? numY4.intValue() : xVar.f767i;
            Integer numY5 = xu.d.y("traceroute_node_timeout_ms", jSONObject);
            int iIntValue5 = numY5 != null ? numY5.intValue() : xVar.j;
            Integer numY6 = xu.d.y("traceroute_max_hop_count", jSONObject);
            int iIntValue6 = numY6 != null ? numY6.intValue() : xVar.k;
            Integer numY7 = xu.d.y("traceroute_test_timeout_ms", jSONObject);
            int iIntValue7 = numY7 != null ? numY7.intValue() : xVar.f768l;
            Integer numY8 = xu.d.y("traceroute_test_count", jSONObject);
            int iIntValue8 = numY8 != null ? numY8.intValue() : xVar.f769m;
            Integer numY9 = xu.d.y("traceroute_ip_mask_count", jSONObject);
            int iIntValue9 = numY9 != null ? numY9.intValue() : xVar.f770n;
            String strK3 = xu.d.K("traceroute_ipv4_mask", jSONObject);
            if (strK3 == null) {
                strK3 = xVar.f771o;
            }
            String str3 = strK3;
            String strK4 = xu.d.K("traceroute_ipv6_mask", jSONObject);
            if (strK4 == null) {
                strK4 = xVar.f772p;
            }
            String str4 = strK4;
            Integer numY10 = xu.d.y("traceroute_first_hop_wifi", jSONObject);
            int iIntValue10 = numY10 != null ? numY10.intValue() : xVar.f773q;
            Integer numY11 = xu.d.y("traceroute_first_hop_cellular", jSONObject);
            int iIntValue11 = numY11 != null ? numY11.intValue() : xVar.f774r;
            Boolean boolR2 = xu.d.r("traceroute_internal_address_for_wifi_enabled", jSONObject);
            boolean zBooleanValue2 = boolR2 != null ? boolR2.booleanValue() : xVar.f775s;
            Boolean boolR3 = xu.d.r("traceroute_internal_address_for_cellular_enabled", jSONObject);
            boolean zBooleanValue3 = boolR3 != null ? boolR3.booleanValue() : xVar.f776t;
            Boolean boolR4 = xu.d.r("traceroute_run_on_resolved_ip_address", jSONObject);
            boolean zBooleanValue4 = boolR4 != null ? boolR4.booleanValue() : xVar.f777u;
            Boolean boolR5 = xu.d.r("traceroute_continue_on_duplicate_hops", jSONObject);
            return new x(str, list, iIntValue, jLongValue, iIntValue2, iIntValue3, str2, zBooleanValue, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9, str3, str4, iIntValue10, iIntValue11, zBooleanValue2, zBooleanValue3, zBooleanValue4, boolR5 != null ? boolR5.booleanValue() : xVar.f778v);
        } catch (JSONException e4) {
            n.e("IcmpTestConfigMapper", e4);
            cj.a.G(e4);
            return xVar;
        }
    }

    @Override // zc.q
    public Object zza() {
        switch (this.f26477a) {
            case 1:
                return new Boolean(((Boolean) l7.f5108b.b()).booleanValue());
            case 2:
                List list = u.f27161a;
                Boolean bool = (Boolean) b9.f4923a.b();
                bool.getClass();
                return bool;
            case 3:
                List list2 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5018q0.b()).longValue());
            case 4:
                List list3 = u.f27161a;
                d7.f4955d.get();
                Long l10 = (Long) f7.A.b();
                l10.getClass();
                return l10;
            case j.STRING_FIELD_NUMBER /* 5 */:
                List list4 = u.f27161a;
                d7.f4955d.get();
                Long l11 = (Long) f7.S.b();
                l11.getClass();
                return l11;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                List list5 = u.f27161a;
                d7.f4955d.get();
                Long l12 = (Long) f7.f5002h0.b();
                l12.getClass();
                return l12;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list6 = u.f27161a;
                d7.f4955d.get();
                Long l13 = (Long) f7.f5000g0.b();
                l13.getClass();
                return l13;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                List list7 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5023t.b()).longValue());
            case 9:
                List list8 = u.f27161a;
                n8.f5142d.get();
                Long l14 = (Long) p8.f5161b.b();
                l14.getClass();
                return l14;
            case 10:
                List list9 = u.f27161a;
                d7.f4955d.get();
                Long l15 = (Long) f7.f4994d0.b();
                l15.getClass();
                return l15;
            case 11:
                List list10 = u.f27161a;
                d7.f4955d.get();
                return (String) f7.f4988a0.b();
            case 12:
                List list11 = u.f27161a;
                d7.f4955d.get();
                Long l16 = (Long) f7.Z.b();
                l16.getClass();
                return l16;
            case 13:
                List list12 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.B.b()).longValue());
            case 14:
                List list13 = u.f27161a;
                Boolean bool2 = (Boolean) t9.f5212a.b();
                bool2.getClass();
                return bool2;
            case 15:
                List list14 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5010m0.b()).longValue());
            case 16:
                List list15 = u.f27161a;
                Boolean bool3 = (Boolean) o7.f5150a.b();
                bool3.getClass();
                return bool3;
            default:
                return new Boolean(((Boolean) j8.f5090a.b()).booleanValue());
        }
    }

    public /* synthetic */ b(cj.a aVar, int i10) {
        this.f26477a = i10;
    }

    public b(gt.l lVar) {
        this.f26477a = 21;
        String str = gt.l.f9656d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }
}
