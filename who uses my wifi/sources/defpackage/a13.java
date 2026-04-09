package defpackage;

import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a13 implements b03 {
    public final yu2 a;

    public a13(yu2 yu2Var) {
        this.a = yu2Var;
    }

    @Override // defpackage.b03
    public final c03 a(String str, JSONObject jSONObject) {
        return new c03(this.a.a(str, jSONObject), new u03(), str);
    }
}
