package A2;

import com.google.android.gms.internal.ads.AbstractC1642oa;
import com.google.android.gms.internal.ads.J4;
import com.google.android.gms.internal.ads.S9;
import j$.util.Objects;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z extends D2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f354a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f356c;

    public z(C0113a c0113a, String str) {
        this.f355b = str;
        this.f356c = c0113a;
    }

    @Override // D2.a
    public final void a(String str) {
        int i = this.f354a;
        String str2 = this.f355b;
        Object obj = this.f356c;
        switch (i) {
            case 0:
                C0113a c0113a = (C0113a) obj;
                u2.k.h("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
                String strConcat = ((Boolean) AbstractC1642oa.f15957c.v()).booleanValue() ? ",\"as\":".concat(c0113a.f227k.b().toString()) : "";
                Locale locale = Locale.getDefault();
                J4 j42 = AbstractC1642oa.f15959e;
                int i3 = 0;
                String str3 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) j42.v()).booleanValue() ? ((Long) AbstractC1642oa.f15962h.v()).longValue() : 0L), strConcat);
                if (((Boolean) j42.v()).booleanValue()) {
                    try {
                        c0113a.f225h.execute(new y(this, str3, i3));
                    } catch (RuntimeException e6) {
                        p2.j.f22785C.f22795h.g("TaggingLibraryJsInterface.getQueryInfo.onFailure", e6);
                    }
                } else {
                    c0113a.f219b.evaluateJavascript(str3, null);
                }
                if (((Boolean) AbstractC1642oa.f15957c.v()).booleanValue() && ((Boolean) AbstractC1642oa.f15958d.v()).booleanValue()) {
                    J j6 = c0113a.f228l;
                    j6.getClass();
                    j6.f176c.execute(new I(j6, i3));
                    break;
                }
                break;
            default:
                u2.k.h("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
                try {
                    S9 s9 = (S9) obj;
                    s9.f11145g.C(s9.b(str2, str).toString());
                    break;
                } catch (JSONException e7) {
                    u2.k.f("Error creating PACT Error Response JSON: ", e7);
                }
        }
    }

    @Override // D2.a
    public final void b(C0117e c0117e) throws JSONException {
        String str;
        int i = this.f354a;
        String str2 = this.f355b;
        Object obj = this.f356c;
        switch (i) {
            case 0:
                C0113a c0113a = (C0113a) obj;
                String str3 = ((B2.a) c0117e.f245b).f521b;
                int i3 = 0;
                int i6 = 1;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("paw_id", str2);
                    if (((Boolean) AbstractC1642oa.f15957c.v()).booleanValue()) {
                        jSONObject.put("as", c0113a.f227k.b());
                    }
                    jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC1642oa.f15959e.v()).booleanValue() ? ((Long) AbstractC1642oa.f15962h.v()).longValue() : 0L);
                    jSONObject.put("signal", str3);
                    str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
                } catch (JSONException unused) {
                    str = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, ((B2.a) c0117e.f245b).f521b, Long.valueOf(((Boolean) AbstractC1642oa.f15959e.v()).booleanValue() ? ((Long) AbstractC1642oa.f15962h.v()).longValue() : 0L), ((Boolean) AbstractC1642oa.f15957c.v()).booleanValue() ? ",\"as\":".concat(c0113a.f227k.b().toString()) : "");
                }
                if (((Boolean) AbstractC1642oa.f15959e.v()).booleanValue()) {
                    try {
                        c0113a.f225h.execute(new y(this, str, i6));
                    } catch (RuntimeException e6) {
                        p2.j.f22785C.f22795h.g("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e6);
                    }
                } else {
                    c0113a.f219b.evaluateJavascript(str, null);
                }
                if (((Boolean) AbstractC1642oa.f15957c.v()).booleanValue() && ((Boolean) AbstractC1642oa.f15958d.v()).booleanValue()) {
                    J j6 = c0113a.f228l;
                    j6.getClass();
                    j6.f176c.execute(new I(j6, i3));
                    break;
                }
                break;
            default:
                try {
                    S9 s9 = (S9) obj;
                    s9.f11145g.C(s9.c(str2, ((B2.a) c0117e.f245b).f521b).toString());
                    break;
                } catch (JSONException e7) {
                    u2.k.f("Error creating PACT Signal Response JSON: ", e7);
                }
        }
    }

    public z(S9 s9, String str) {
        this.f355b = str;
        Objects.requireNonNull(s9);
        this.f356c = s9;
    }
}
