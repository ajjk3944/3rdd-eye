package sm;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f22118a;

    /* renamed from: b, reason: collision with root package name */
    public String f22119b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22120c;

    /* renamed from: d, reason: collision with root package name */
    public String f22121d;

    /* renamed from: e, reason: collision with root package name */
    public final double f22122e;

    /* renamed from: f, reason: collision with root package name */
    public final double f22123f;

    /* renamed from: g, reason: collision with root package name */
    public final double f22124g;

    /* renamed from: h, reason: collision with root package name */
    public final double f22125h;

    public d(String str) throws JSONException {
        br.l.e(str, "jsonString");
        this.f22118a = "";
        this.f22119b = "";
        this.f22121d = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                this.f22122e = jSONObject.getDouble("asu");
            } catch (Exception unused) {
            }
            try {
                if (!jSONObject.isNull("logoUrlSmall")) {
                    br.l.d(jSONObject.optString("logoUrlSmall"), "optString(...)");
                }
            } catch (Exception unused2) {
            }
            try {
                if (!jSONObject.isNull("logoUrlLarge")) {
                    String string = jSONObject.getString("logoUrlLarge");
                    br.l.d(string, "getString(...)");
                    this.f22118a = string;
                }
            } catch (Exception unused3) {
            }
            try {
                if (!jSONObject.isNull("hexColor")) {
                    String string2 = jSONObject.getString("hexColor");
                    br.l.d(string2, "getString(...)");
                    this.f22119b = string2;
                }
            } catch (Exception unused4) {
            }
            try {
                if (!jSONObject.isNull("twitterHandle")) {
                    br.l.d(jSONObject.getString("twitterHandle"), "getString(...)");
                }
            } catch (Exception unused5) {
            }
            try {
                this.f22120c = jSONObject.getInt("networkId");
            } catch (Exception unused6) {
            }
            try {
                String string3 = jSONObject.getString("name");
                br.l.d(string3, "getString(...)");
                this.f22121d = string3;
            } catch (Exception unused7) {
            }
            try {
                this.f22123f = jSONObject.getDouble("downloadSpeed");
            } catch (Exception unused8) {
            }
            try {
                this.f22124g = jSONObject.getDouble("uploadSpeed");
            } catch (Exception unused9) {
            }
            this.f22125h = jSONObject.getDouble("pingTime");
        } catch (JSONException | Exception unused10) {
        }
    }
}
