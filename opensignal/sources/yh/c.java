package yh;

import ak.k1;
import ak.m0;
import ak.n0;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.k9;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.s8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zc.u;

/* loaded from: classes.dex */
public final class c implements zc.e, zc.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26254a;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c f26249d = new c(1);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c f26250g = new c(2);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ c f26251r = new c(3);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ c f26252x = new c(4);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ c f26253y = new c(5);
    public static final /* synthetic */ c B = new c(6);
    public static final /* synthetic */ c D = new c(7);
    public static final /* synthetic */ c E = new c(8);
    public static final /* synthetic */ c F = new c(9);
    public static final /* synthetic */ c G = new c(10);
    public static final /* synthetic */ c H = new c(11);
    public static final /* synthetic */ c I = new c(12);
    public static final /* synthetic */ c J = new c(13);
    public static final /* synthetic */ c K = new c(14);
    public static final /* synthetic */ c L = new c(15);
    public static final /* synthetic */ c M = new c(16);
    public static final /* synthetic */ c N = new c(17);

    public /* synthetic */ c(int i10) {
        this.f26254a = i10;
    }

    public static long a() {
        return TimeUnit.NANOSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public static k1 e(JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt("probability", 0);
        String string = jSONObject.getString("quality");
        br.l.d(string, "getString(...)");
        String string2 = jSONObject.getString("resource");
        br.l.d(string2, "getString(...)");
        String string3 = jSONObject.getString("routine");
        br.l.d(string3, "getString(...)");
        Object objValueOf = dh.f.f7370p;
        try {
            objValueOf = Enum.valueOf(nh.h.class, jSONObject.optString("manifest").toUpperCase());
        } catch (Exception unused) {
        }
        br.l.c(objValueOf, "null cannot be cast to non-null type com.opensignal.sdk.common.measurements.videotest.VideoManifest");
        return new k1(iOptInt, string, string2, string3, (nh.h) objValueOf, jSONObject.optInt("ignore_device_screen_resolution_probability", -1));
    }

    public static JSONObject f(k1 k1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("probability", k1Var.f602a);
        jSONObject.put("quality", k1Var.f603b);
        jSONObject.put("resource", k1Var.f604c);
        jSONObject.put("routine", k1Var.f605d);
        jSONObject.put("manifest", k1Var.f606e);
        jSONObject.put("ignore_device_screen_resolution_probability", k1Var.f607f);
        return jSONObject;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Iterable, java.lang.Object] */
    public JSONArray b(n0 n0Var) throws JSONException {
        try {
            JSONArray jSONArray = new JSONArray();
            for (m0 m0Var : n0Var.f620a) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("names", new JSONArray(m0Var.f617a));
                jSONObject.put("decimal_precision", m0Var.f618b);
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (JSONException e4) {
            ch.n.e("RegionRestrictionsConfigMapper", e4);
            cj.a.G(e4);
            return new JSONArray();
        }
    }

    public JSONArray c(List list) {
        br.l.e(list, "input");
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(f((k1) it.next()));
            }
            return jSONArray;
        } catch (JSONException e4) {
            ch.n.e("VideoConfigItemMapper", e4);
            cj.a.G(e4);
            return new JSONArray();
        }
    }

    public n0 d(JSONArray jSONArray, n0 n0Var) throws JSONException {
        br.l.e(n0Var, "fallbackConfig");
        if (jSONArray == null) {
            return n0Var;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                br.l.d(jSONObject, "getJSONObject(...)");
                JSONArray jSONArray2 = jSONObject.getJSONArray("names");
                int length2 = jSONArray2.length();
                ArrayList arrayList2 = new ArrayList(length2);
                for (int i11 = 0; i11 < length2; i11++) {
                    arrayList2.add(jSONArray2.getString(i11));
                }
                arrayList.add(new m0((String[]) arrayList2.toArray(new String[0]), jSONObject.getInt("decimal_precision")));
            }
            return new n0(arrayList);
        } catch (JSONException e4) {
            ch.n.e("RegionRestrictionsConfigMapper", e4);
            cj.a.G(e4);
            return n0Var;
        }
    }

    @Override // zc.e
    public /* synthetic */ String h0(String str, String str2) {
        return null;
    }

    @Override // zc.q
    public Object zza() {
        switch (this.f26254a) {
            case 2:
                List list = u.f27161a;
                q8.f5180d.get();
                Boolean bool = (Boolean) s8.f5200c.b();
                bool.getClass();
                return bool;
            case 3:
                List list2 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5014o0.b()).longValue());
            case 4:
                List list3 = u.f27161a;
                d7.f4955d.get();
                return (String) f7.N.b();
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                List list4 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.P.b()).longValue());
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                List list5 = u.f27161a;
                d7.f4955d.get();
                Long l10 = (Long) f7.f4998f0.b();
                l10.getClass();
                return l10;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list6 = u.f27161a;
                d7.f4955d.get();
                Long l11 = (Long) f7.V.b();
                l11.getClass();
                return l11;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                List list7 = u.f27161a;
                d7.f4955d.get();
                Long l12 = (Long) f7.f5009m.b();
                l12.getClass();
                return l12;
            case 9:
                List list8 = u.f27161a;
                d7.f4955d.get();
                return (String) f7.f4999g.b();
            case 10:
                List list9 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5017q.b()).longValue());
            case 11:
                List list10 = u.f27161a;
                d7.f4955d.get();
                return (String) f7.f4992c0.b();
            case 12:
                List list11 = u.f27161a;
                d7.f4955d.get();
                return (String) f7.f4990b0.b();
            case 13:
                List list12 = u.f27161a;
                d7.f4955d.get();
                Boolean bool2 = (Boolean) f7.f4991c.b();
                bool2.getClass();
                return bool2;
            case 14:
                List list13 = u.f27161a;
                Boolean bool3 = (Boolean) m8.f5128a.b();
                bool3.getClass();
                return bool3;
            case 15:
                List list14 = u.f27161a;
                Boolean bool4 = (Boolean) k9.f5098a.b();
                bool4.getClass();
                return bool4;
            case 16:
                List list15 = u.f27161a;
                q8.f5180d.get();
                Boolean bool5 = (Boolean) s8.f5202e.b();
                bool5.getClass();
                return bool5;
            default:
                List list16 = u.f27161a;
                d7.f4955d.get();
                Long l13 = (Long) f7.f4987a.b();
                l13.getClass();
                return l13;
        }
    }

    public /* synthetic */ c(cj.a aVar, int i10) {
        this.f26254a = i10;
    }
}
