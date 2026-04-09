package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t33 implements n53 {
    public final /* synthetic */ int a;
    public final String b;
    public final int c;

    public /* synthetic */ t33(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.n53
    public final void c(Object obj) throws JSONException {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                Bundle bundle = ((jm2) obj).a;
                String str = this.b;
                if (!TextUtils.isEmpty(str) && (i = this.c) != -1) {
                    Bundle bundleY = i30.Y(bundle, "pii");
                    bundle.putBundle("pii", bundleY);
                    bundleY.putString("pvid", str);
                    bundleY.putInt("pvid_s", i);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = ((jm2) obj).a;
                if (((Boolean) tw1.e.c.a(mz1.ib)).booleanValue()) {
                    String str2 = this.b;
                    if (!TextUtils.isEmpty(str2)) {
                        bundle2.putString("topics", str2);
                    }
                    int i3 = this.c;
                    if (i3 != -1) {
                        bundle2.putInt("atps", i3);
                        break;
                    }
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                String str3 = this.b;
                if (!TextUtils.isEmpty(str3) && (i2 = this.c) != -1) {
                    try {
                        JSONObject jSONObjectU = bd2.U("pii", jSONObject);
                        jSONObjectU.put("pvid", str3);
                        jSONObjectU.put("pvid_s", i2);
                        break;
                    } catch (JSONException unused) {
                        gi2.R();
                    }
                }
                break;
        }
    }
}
