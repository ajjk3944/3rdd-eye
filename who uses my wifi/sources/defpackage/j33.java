package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j33 implements n53 {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ j33(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.n53
    public final void c(Object obj) throws JSONException {
        switch (this.a) {
            case 0:
                jm2 jm2Var = (jm2) obj;
                String str = this.b;
                if (str != null) {
                    jm2Var.a.putString("arek", str);
                    break;
                }
                break;
            case 1:
                ((jm2) obj).a.putString("ms", this.b);
                break;
            case 2:
                i30.p0("key_schema", ((jm2) obj).a, this.b);
                break;
            case 3:
                i30.p0("omid_v", ((jm2) obj).a, this.b);
                break;
            case 4:
                try {
                    ((JSONObject) obj).put("ms", this.b);
                    break;
                } catch (JSONException unused) {
                    gi2.R();
                    return;
                }
            default:
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    String str2 = this.b;
                    if (!TextUtils.isEmpty(str2)) {
                        bd2.U("pii", jSONObject).put("adsid", str2);
                        break;
                    }
                } catch (JSONException unused2) {
                    gi2.q0(5);
                }
                break;
        }
    }
}
