package defpackage;

import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fr2 implements ca4 {
    public final /* synthetic */ int a;
    public final mc2 b;

    public /* synthetic */ fr2(mc2 mc2Var, int i) {
        this.a = i;
        this.b = mc2Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.b.g;
                i41.M(jSONObject);
                return jSONObject;
            case 1:
                au2 au2Var = (au2) this.b.h;
                i41.M(au2Var);
                return au2Var;
            case 2:
                return (su1) this.b.i;
            default:
                return (sb2) this.b.j;
        }
    }
}
