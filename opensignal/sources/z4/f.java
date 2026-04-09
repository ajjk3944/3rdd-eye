package z4;

import ak.d0;
import ak.k;
import ak.y0;
import br.l;
import ch.n;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.d8;
import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.n8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.u7;
import com.google.android.gms.internal.measurement.y8;
import g4.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zc.q;
import zc.u;

/* loaded from: classes.dex */
public class f implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26671a;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f f26666d = new f(1);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f f26667g = new f(2);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ f f26668r = new f(3);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ f f26669x = new f(4);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ f f26670y = new f(5);
    public static final /* synthetic */ f B = new f(6);
    public static final /* synthetic */ f D = new f(7);
    public static final /* synthetic */ f E = new f(8);
    public static final /* synthetic */ f F = new f(9);
    public static final /* synthetic */ f G = new f(10);
    public static final /* synthetic */ f H = new f(11);
    public static final /* synthetic */ f I = new f(12);
    public static final /* synthetic */ f J = new f(13);
    public static final /* synthetic */ f K = new f(14);
    public static final /* synthetic */ f L = new f(15);
    public static final /* synthetic */ f M = new f(16);

    public /* synthetic */ f(int i10) {
        this.f26671a = i10;
    }

    public float a(float f10) {
        return 1.0f;
    }

    public JSONArray b(List list) throws JSONException {
        l.e(list, "input");
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                y0 y0Var = (y0) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("endpoint", y0Var.f795a);
                jSONObject.put("name", y0Var.f796b);
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (JSONException e4) {
            n.e("TestServerItemMapper", e4);
            cj.a.G(e4);
            return new JSONArray();
        }
    }

    public JSONObject c(k kVar) throws JSONException {
        l.e(kVar, "input");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("delay_in_ms", kVar.f599a);
            jSONObject.put("triggers", xu.d.h0(kVar.f600b));
            jSONObject.put("group", kVar.f601c);
            return jSONObject;
        } catch (Exception e4) {
            n.e("CrossTaskDelayConfigJsonMapper", e4);
            cj.a.G(e4);
            return new JSONObject();
        }
    }

    public JSONObject d(d0 d0Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_enabled", d0Var.f496a);
            jSONObject.put("report", d0Var.f497b);
            jSONObject.put("hard_file_size_limit_bytes", d0Var.f498c);
            jSONObject.put("context_maximum_count", d0Var.f500e);
            jSONObject.put("write_threshold", d0Var.f499d);
            jSONObject.put("export_url", d0Var.f501f);
            return jSONObject;
        } catch (JSONException e4) {
            return h0.b.x("MlvisConfigMapper", e4, e4);
        }
    }

    public k e(JSONObject jSONObject) throws JSONException {
        w wVar = w.f16945a;
        try {
            long j = jSONObject.getLong("delay_in_ms");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("triggers");
            List listI0 = jSONArrayOptJSONArray != null ? xu.d.i0(jSONArrayOptJSONArray) : wVar;
            String strOptString = jSONObject.optString("group");
            if (strOptString == null) {
                strOptString = "";
            }
            return new k(j, strOptString, listI0);
        } catch (Exception e4) {
            n.e("CrossTaskDelayConfigJsonMapper", e4);
            cj.a.G(e4);
            return new k(0L, "", wVar);
        }
    }

    public d0 f(JSONObject jSONObject, d0 d0Var) {
        l.e(d0Var, "fallbackConfig");
        if (jSONObject == null) {
            return d0Var;
        }
        try {
            boolean zOptBoolean = jSONObject.optBoolean("is_enabled", d0Var.f496a);
            String strOptString = jSONObject.optString("report", d0Var.f497b);
            l.d(strOptString, "optString(...)");
            int iOptInt = jSONObject.optInt("hard_file_size_limit_bytes", d0Var.f498c);
            String strOptString2 = jSONObject.optString("write_threshold", d0Var.f499d);
            l.d(strOptString2, "optString(...)");
            int iOptInt2 = jSONObject.optInt("context_maximum_count", d0Var.f500e);
            String strOptString3 = jSONObject.optString("export_url", d0Var.f501f);
            l.d(strOptString3, "optString(...)");
            return new d0(iOptInt, iOptInt2, strOptString, strOptString2, strOptString3, zOptBoolean);
        } catch (JSONException e4) {
            n.e("MlvisConfigMapper", e4);
            cj.a.G(e4);
            return d0Var;
        }
    }

    public List g(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                l.d(jSONObject, "getJSONObject(...)");
                String string = jSONObject.getString("endpoint");
                l.d(string, "getString(...)");
                String string2 = jSONObject.getString("name");
                l.d(string2, "getString(...)");
                arrayList.add(new y0(string, string2));
            }
            return arrayList;
        } catch (JSONException e4) {
            n.e("TestServerItemMapper", e4);
            cj.a.G(e4);
            return w.f16945a;
        }
    }

    @Override // zc.q
    public Object zza() {
        switch (this.f26671a) {
            case 1:
                return new Boolean(((Boolean) d8.f4957a.b()).booleanValue());
            case 2:
                List list = u.f27161a;
                Boolean bool = (Boolean) c7.f4942a.b();
                bool.getClass();
                return bool;
            case 3:
                List list2 = u.f27161a;
                d7.f4955d.get();
                return (String) f7.f5011n.b();
            case 4:
                List list3 = u.f27161a;
                d7.f4955d.get();
                Long l10 = (Long) f7.L.b();
                l10.getClass();
                return l10;
            case j.STRING_FIELD_NUMBER /* 5 */:
                List list4 = u.f27161a;
                d7.f4955d.get();
                Long l11 = (Long) f7.I.b();
                l11.getClass();
                return l11;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                List list5 = u.f27161a;
                d7.f4955d.get();
                Long l12 = (Long) f7.f5033z.b();
                l12.getClass();
                return l12;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list6 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5022s0.b()).longValue());
            case j.BYTES_FIELD_NUMBER /* 8 */:
                List list7 = u.f27161a;
                n8.f5142d.get();
                Boolean bool2 = (Boolean) p8.f5160a.b();
                bool2.getClass();
                return bool2;
            case 9:
                List list8 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5021s.b()).longValue());
            case 10:
                List list9 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5031x.b()).longValue());
            case 11:
                List list10 = u.f27161a;
                d7.f4955d.get();
                return (String) f7.f5030w0.b();
            case 12:
                List list11 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5029w.b()).longValue());
            case 13:
                List list12 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5004i0.b()).longValue());
            case 14:
                List list13 = u.f27161a;
                Boolean bool3 = (Boolean) u7.f5220b.b();
                bool3.getClass();
                return bool3;
            case 15:
                List list14 = u.f27161a;
                q8.f5180d.get();
                Boolean bool4 = (Boolean) s8.f5204g.b();
                bool4.getClass();
                return bool4;
            default:
                List list15 = u.f27161a;
                Boolean bool5 = (Boolean) y8.f5275a.b();
                bool5.getClass();
                return bool5;
        }
    }

    public /* synthetic */ f(cj.a aVar, int i10) {
        this.f26671a = i10;
    }
}
