package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ak2 implements ca4 {
    public final /* synthetic */ int a;
    public final ll2 b;

    public /* synthetic */ ak2(ll2 ll2Var, int i) {
        this.a = i;
        this.b = ll2Var;
    }

    @Override // defpackage.ga4
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.a) {
            case 0:
                try {
                    return new JSONObject(this.b.a().z);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new vr2(this.b.a());
        }
    }
}
