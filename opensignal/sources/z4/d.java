package z4;

import ak.p0;
import ak.y;
import ch.n;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.n8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.x7;
import com.google.android.gms.internal.measurement.z6;
import g4.j;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import zc.q;
import zc.u;

/* loaded from: classes.dex */
public final class d implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26659a;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d f26654d = new d(1);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d f26655g = new d(2);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ d f26656r = new d(3);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ d f26657x = new d(4);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ d f26658y = new d(5);
    public static final /* synthetic */ d B = new d(6);
    public static final /* synthetic */ d D = new d(7);
    public static final /* synthetic */ d E = new d(8);
    public static final /* synthetic */ d F = new d(9);
    public static final /* synthetic */ d G = new d(10);
    public static final /* synthetic */ d H = new d(11);
    public static final /* synthetic */ d I = new d(12);
    public static final /* synthetic */ d J = new d(13);
    public static final /* synthetic */ d K = new d(14);
    public static final /* synthetic */ d L = new d(15);
    public static final /* synthetic */ d M = new d(16);
    public static final /* synthetic */ d N = new d(17);

    public /* synthetic */ d(int i10) {
        this.f26659a = i10;
    }

    public JSONObject a(y yVar) throws JSONException {
        n.b("InnerTubeConfigMapper", "mapFrom() called with: input = " + yVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", yVar.f790a);
            jSONObject.put("key", yVar.f791b);
            jSONObject.put("client_name", yVar.f792c);
            jSONObject.put("client_version", yVar.f793d);
            xu.d.Y(jSONObject, "user_agent", yVar.f794e);
            return jSONObject;
        } catch (JSONException e4) {
            return h0.b.x("InnerTubeConfigMapper", e4, e4);
        }
    }

    public y b(JSONObject jSONObject, y yVar) {
        if (jSONObject == null) {
            return yVar;
        }
        try {
            String strK = xu.d.K("url", jSONObject);
            if (strK == null) {
                strK = yVar.f790a;
            }
            String strK2 = xu.d.K("key", jSONObject);
            if (strK2 == null) {
                strK2 = yVar.f791b;
            }
            String strK3 = xu.d.K("client_name", jSONObject);
            if (strK3 == null) {
                strK3 = yVar.f792c;
            }
            String strK4 = xu.d.K("client_version", jSONObject);
            if (strK4 == null) {
                strK4 = yVar.f793d;
            }
            String strK5 = xu.d.K("user_agent", jSONObject);
            if (strK5 == null) {
                strK5 = yVar.f794e;
            }
            return new y(strK, strK2, strK3, strK4, strK5);
        } catch (JSONException e4) {
            String str = "Can't mapTo() to InnerTubeConfig for input: " + jSONObject;
            n.d("InnerTubeConfigMapper", str, e4);
            cj.a.E(e4, str);
            return yVar;
        }
    }

    public p0 c(JSONObject jSONObject, p0 p0Var) {
        if (jSONObject == null) {
            return p0Var;
        }
        try {
            return new p0(jSONObject.optString("priority_list", p0Var.f638a));
        } catch (JSONException e4) {
            n.e("SdkInSdkConfigMapper", e4);
            cj.a.G(e4);
            return p0Var;
        }
    }

    @Override // zc.q
    public Object zza() {
        switch (this.f26659a) {
            case 1:
                return new Boolean(((Boolean) r7.f5184a.b()).booleanValue());
            case 2:
                List list = u.f27161a;
                d7.f4955d.get();
                return (String) f7.f4995e.b();
            case 3:
                List list2 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.f5019r.b()).longValue());
            case 4:
                List list3 = u.f27161a;
                d7.f4955d.get();
                Long l10 = (Long) f7.U.b();
                l10.getClass();
                return l10;
            case j.STRING_FIELD_NUMBER /* 5 */:
                List list4 = u.f27161a;
                d7.f4955d.get();
                Long l11 = (Long) f7.R.b();
                l11.getClass();
                return l11;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                List list5 = u.f27161a;
                d7.f4955d.get();
                Long l12 = (Long) f7.E.b();
                l12.getClass();
                return l12;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                List list6 = u.f27161a;
                d7.f4955d.get();
                return (String) f7.f5001h.b();
            case j.BYTES_FIELD_NUMBER /* 8 */:
                List list7 = u.f27161a;
                d7.f4955d.get();
                Long l13 = (Long) f7.G.b();
                l13.getClass();
                return l13;
            case 9:
                List list8 = u.f27161a;
                n8.f5142d.get();
                return Integer.valueOf((int) ((Long) p8.f5163d.b()).longValue());
            case 10:
                List list9 = u.f27161a;
                d7.f4955d.get();
                Long l14 = (Long) f7.f4996e0.b();
                l14.getClass();
                return l14;
            case 11:
                List list10 = u.f27161a;
                d7.f4955d.get();
                Long l15 = (Long) f7.j.b();
                l15.getClass();
                return l15;
            case 12:
                List list11 = u.f27161a;
                d7.f4955d.get();
                return Integer.valueOf((int) ((Long) f7.W.b()).longValue());
            case 13:
                List list12 = u.f27161a;
                Boolean bool = (Boolean) x7.f5263b.b();
                bool.getClass();
                return bool;
            case 14:
                List list13 = u.f27161a;
                return Integer.valueOf((int) ((Long) i7.f5083a.b()).longValue());
            case 15:
                List list14 = u.f27161a;
                q8.f5180d.get();
                Boolean bool2 = (Boolean) s8.f5198a.b();
                bool2.getClass();
                return bool2;
            case 16:
                List list15 = u.f27161a;
                Boolean bool3 = (Boolean) z6.f5287a.b();
                bool3.getClass();
                return bool3;
            default:
                return new Boolean(((Boolean) v8.f5239a.b()).booleanValue());
        }
    }

    public /* synthetic */ d(cj.a aVar, int i10) {
        this.f26659a = i10;
    }
}
