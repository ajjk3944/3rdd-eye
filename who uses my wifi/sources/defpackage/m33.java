package defpackage;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m33 implements n53 {
    public final /* synthetic */ int a;
    public final Bundle b;

    public /* synthetic */ m33(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    @Override // defpackage.n53
    public final void c(Object obj) throws JSONException {
        switch (this.a) {
            case 0:
                jm2 jm2Var = (jm2) obj;
                Bundle bundle = this.b;
                if (!bundle.isEmpty()) {
                    jm2Var.a.putBundle("installed_adapter_data", bundle);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = ((jm2) obj).a;
                Bundle bundleY = i30.Y(bundle2, "device");
                bundleY.putBundle("android_mem_info", this.b);
                bundle2.putBundle("device", bundleY);
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle3 = this.b;
                if (bundle3 != null) {
                    try {
                        bd2.U("play_store", bd2.U("device", jSONObject)).put("parental_controls", sv1.f.a.j(bundle3));
                        break;
                    } catch (JSONException unused) {
                        gi2.G("Failed putting parental controls bundle.");
                    }
                }
                break;
        }
    }
}
