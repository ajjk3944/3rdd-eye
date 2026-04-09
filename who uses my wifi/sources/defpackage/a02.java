package defpackage;

import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a02 extends wm0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public a02(i01 i01Var, String str) {
        this.b = str;
        this.c = i01Var;
    }

    @Override // defpackage.wm0
    public final void a(String str) {
        switch (this.a) {
            case 0:
                gi2.i0("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
                try {
                    b02 b02Var = (b02) this.c;
                    b02Var.g.h(b02Var.b(this.b, str).toString());
                    break;
                } catch (JSONException e) {
                    gi2.c0("Error creating PACT Error Response JSON: ", e);
                    return;
                }
            default:
                i01 i01Var = (i01) this.c;
                gi2.i0("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
                String strConcat = ((Boolean) x02.c.w()).booleanValue() ? ",\"as\":".concat(i01Var.k.b().toString()) : "";
                Locale locale = Locale.getDefault();
                so1 so1Var = x02.e;
                String str2 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.b, str, Long.valueOf(((Boolean) so1Var.w()).booleanValue() ? ((Long) x02.h.w()).longValue() : 0L), strConcat);
                if (((Boolean) so1Var.w()).booleanValue()) {
                    try {
                        i01Var.h.execute(new n42(this, str2, 0));
                    } catch (RuntimeException e2) {
                        hg4.C.h.e("TaggingLibraryJsInterface.getQueryInfo.onFailure", e2);
                    }
                } else {
                    i01Var.b.evaluateJavascript(str2, null);
                }
                if (((Boolean) x02.c.w()).booleanValue() && ((Boolean) x02.d.w()).booleanValue()) {
                    sa4 sa4Var = i01Var.l;
                    sa4Var.getClass();
                    sa4Var.c.execute(new jt3(sa4Var, 0));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wm0
    public final void b(ug0 ug0Var) throws JSONException {
        String str;
        switch (this.a) {
            case 0:
                String str2 = ((ls3) ug0Var.g).b;
                try {
                    b02 b02Var = (b02) this.c;
                    b02Var.g.h(b02Var.c(this.b, str2).toString());
                    break;
                } catch (JSONException e) {
                    gi2.c0("Error creating PACT Signal Response JSON: ", e);
                    return;
                }
            default:
                String str3 = this.b;
                i01 i01Var = (i01) this.c;
                String str4 = ((ls3) ug0Var.g).b;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("paw_id", str3);
                    if (((Boolean) x02.c.w()).booleanValue()) {
                        jSONObject.put("as", i01Var.k.b());
                    }
                    jSONObject.put("sdk_ttl_ms", ((Boolean) x02.e.w()).booleanValue() ? ((Long) x02.h.w()).longValue() : 0L);
                    jSONObject.put("signal", str4);
                    str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
                } catch (JSONException unused) {
                    str = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str3, ((ls3) ug0Var.g).b, Long.valueOf(((Boolean) x02.e.w()).booleanValue() ? ((Long) x02.h.w()).longValue() : 0L), ((Boolean) x02.c.w()).booleanValue() ? ",\"as\":".concat(i01Var.k.b().toString()) : "");
                }
                if (((Boolean) x02.e.w()).booleanValue()) {
                    try {
                        i01Var.h.execute(new n42(this, str, 1));
                    } catch (RuntimeException e2) {
                        hg4.C.h.e("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e2);
                    }
                } else {
                    i01Var.b.evaluateJavascript(str, null);
                }
                if (((Boolean) x02.c.w()).booleanValue() && ((Boolean) x02.d.w()).booleanValue()) {
                    sa4 sa4Var = i01Var.l;
                    sa4Var.getClass();
                    sa4Var.c.execute(new jt3(sa4Var, 0));
                    break;
                }
                break;
        }
    }

    public a02(b02 b02Var, String str) {
        this.b = str;
        Objects.requireNonNull(b02Var);
        this.c = b02Var;
    }
}
