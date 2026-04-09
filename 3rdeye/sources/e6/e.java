package E6;

import E.u;
import E6.a;
import N7.id;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.jvm.internal.l;
import org.json.JSONException;
import org.json.JSONObject;
import y9.q;

/* compiled from: PhoneInputMask.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List<a.c> f1468a;

    /* renamed from: b, reason: collision with root package name */
    public static final a.b f1469b;

    static {
        List<a.c> listG = u.G(new a.c('0', '_', "\\d"));
        f1468a = listG;
        f1469b = new a.b(a(""), listG, false);
    }

    public static final String a(String str) throws JSONException {
        if (q.i0(str)) {
            return "000000000000000";
        }
        JSONObject jSONObject = id.f8469a;
        int i = 0;
        while (true) {
            if (jSONObject.has(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                break;
            }
            String str2 = "*";
            if (i >= str.length()) {
                Object obj = jSONObject.get("*");
                l.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                jSONObject = (JSONObject) obj;
                break;
            }
            int i10 = i + 1;
            String strValueOf = String.valueOf(str.charAt(i));
            if (jSONObject.has(strValueOf)) {
                str2 = strValueOf;
            }
            Object obj2 = jSONObject.get(str2);
            l.d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj2;
            i = i10;
        }
        return jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE) + "00";
    }
}
