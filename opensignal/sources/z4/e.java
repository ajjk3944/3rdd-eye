package z4;

import ak.r0;
import br.l;
import ch.n;
import com.google.android.gms.internal.measurement.a8;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.h9;
import com.google.android.gms.internal.measurement.n8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.u7;
import com.google.android.gms.internal.measurement.x7;
import g4.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zc.q;
import zc.u;

/* loaded from: classes.dex */
public final class e implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26665a;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e f26660d = new e(1);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e f26661g = new e(2);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ e f26662r = new e(3);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ e f26663x = new e(4);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ e f26664y = new e(5);
    public static final /* synthetic */ e B = new e(6);
    public static final /* synthetic */ e D = new e(7);
    public static final /* synthetic */ e E = new e(8);
    public static final /* synthetic */ e F = new e(9);
    public static final /* synthetic */ e G = new e(10);
    public static final /* synthetic */ e H = new e(11);
    public static final /* synthetic */ e I = new e(12);
    public static final /* synthetic */ e J = new e(13);
    public static final /* synthetic */ e K = new e(14);
    public static final /* synthetic */ e L = new e(15);
    public static final /* synthetic */ e M = new e(16);
    public static final /* synthetic */ e N = new e(17);

    public /* synthetic */ e(int i10) {
        this.f26665a = i10;
    }

    public JSONArray a(ArrayList arrayList) throws JSONException {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r0 r0Var = (r0) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("latitude", r0Var.f653a);
                jSONObject.put("longitude", r0Var.f654b);
                jSONObject.put("server", r0Var.f655c);
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (JSONException e4) {
            n.e("ServerResponseTestServerConfigMapper", e4);
            cj.a.G(e4);
            return new JSONArray();
        }
    }

    public ak.e b(JSONObject jSONObject, ak.e eVar) {
        if (jSONObject == null) {
            return eVar;
        }
        try {
            Long lC = xu.d.C("nr_cell_min_nrarfcn", jSONObject);
            long jLongValue = lC != null ? lC.longValue() : eVar.f505a;
            Long lC2 = xu.d.C("nr_cell_max_nrarfcn", jSONObject);
            long jLongValue2 = lC2 != null ? lC2.longValue() : eVar.f506b;
            Long lC3 = xu.d.C("freshness_ms", jSONObject);
            return new ak.e(jLongValue, jLongValue2, lC3 != null ? lC3.longValue() : eVar.f507c);
        } catch (JSONException e4) {
            n.e("CellConfigMapper", e4);
            cj.a.G(e4);
            return eVar;
        }
    }

    public ArrayList c(JSONArray jSONArray) throws JSONException {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                l.d(jSONObject, "getJSONObject(...)");
                double d6 = jSONObject.getDouble("latitude");
                double d10 = jSONObject.getDouble("longitude");
                String string = jSONObject.getString("server");
                l.d(string, "getString(...)");
                arrayList.add(new r0(d6, d10, string));
            }
            return arrayList;
        } catch (JSONException e4) {
            n.e("ServerResponseTestServerConfigMapper", e4);
            cj.a.G(e4);
            return new ArrayList();
        }
    }

    @Override // zc.q
    public Object zza() {
        switch (this.f26665a) {
            case 1:
                return new Boolean(((Boolean) a8.f4910a.b()).booleanValue());
            case 2:
                List list = u.f27161a;
                d7.f4955d.get();
                return (String) f7.f5007l.b();
            case 3:
                List list2 = u.f27161a;
                d7.f4955d.get();
                return (String) f7.f5026u0.b();
            case 4:
                List list3 = u.f27161a;
                d7.f4955d.get();
                Long l10 = (Long) f7.J.b();
                l10.getClass();
                return l10;
            case j.STRING_FIELD_NUMBER /* 5 */:
                List list4 = u.f27161a;
                d7.f4955d.get();
                Long l11 = (Long) f7.Q.b();
                l11.getClass();
                return l11;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                List list5 = u.f27161a;
                d7.f4955d.get();
                Long l12 = (Long) f7.f5003i.b();
                l12.getClass();
                return l12;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list6 = u.f27161a;
                d7.f4955d.get();
                Long l13 = (Long) f7.f5024t0.b();
                l13.getClass();
                return l13;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                List list7 = u.f27161a;
                d7.f4955d.get();
                Long l14 = (Long) f7.H.b();
                l14.getClass();
                return l14;
            case 9:
                List list8 = u.f27161a;
                n8.f5142d.get();
                Double d6 = (Double) p8.f5162c.b();
                d6.getClass();
                return d6;
            case 10:
                List list9 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5005j0.b()).longValue());
            case 11:
                List list10 = u.f27161a;
                d7.f4955d.get();
                return (String) f7.D.b();
            case 12:
                List list11 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.X.b()).longValue());
            case 13:
                List list12 = u.f27161a;
                Boolean bool = (Boolean) x7.f5262a.b();
                bool.getClass();
                return bool;
            case 14:
                List list13 = u.f27161a;
                Boolean bool2 = (Boolean) u7.f5219a.b();
                bool2.getClass();
                return bool2;
            case 15:
                List list14 = u.f27161a;
                q8.f5180d.get();
                Boolean bool3 = (Boolean) s8.f5205h.b();
                bool3.getClass();
                return bool3;
            case 16:
                List list15 = u.f27161a;
                q8.f5180d.get();
                Boolean bool4 = (Boolean) s8.f5201d.b();
                bool4.getClass();
                return bool4;
            default:
                return new Boolean(((Boolean) h9.f5064a.b()).booleanValue());
        }
    }

    public /* synthetic */ e(cj.a aVar, int i10) {
        this.f26665a = i10;
    }
}
