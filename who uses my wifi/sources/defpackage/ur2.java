package defpackage;

import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ur2 extends vr2 {
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final JSONObject h;

    public ur2(a83 a83Var, JSONObject jSONObject) {
        super(a83Var);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject jSONObjectB0 = bd2.b0(jSONObject, strArr);
        this.b = jSONObjectB0 == null ? null : jSONObjectB0.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject jSONObjectB02 = bd2.b0(jSONObject, strArr2);
        this.c = jSONObjectB02 == null ? false : jSONObjectB02.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject jSONObjectB03 = bd2.b0(jSONObject, strArr3);
        this.d = jSONObjectB03 == null ? false : jSONObjectB03.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject jSONObjectB04 = bd2.b0(jSONObject, strArr4);
        this.e = jSONObjectB04 == null ? false : jSONObjectB04.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject jSONObjectB05 = bd2.b0(jSONObject, strArr5);
        this.g = jSONObjectB05 != null ? jSONObjectB05.optString(strArr5[0], "") : "";
        this.f = jSONObject.optJSONObject("overlay") != null;
        this.h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // defpackage.vr2
    public final boolean a() {
        return this.f;
    }

    @Override // defpackage.vr2
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.vr2
    public final boolean c() {
        return this.e;
    }

    @Override // defpackage.vr2
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.vr2
    public final String e() {
        return this.g;
    }

    @Override // defpackage.vr2
    public final ug0 f() {
        JSONObject jSONObject = this.h;
        return jSONObject != null ? new ug0(28, jSONObject) : this.a.V;
    }
}
