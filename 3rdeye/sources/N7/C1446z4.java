package N7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONObject;

/* compiled from: DivExtensionJsonParser.kt */
/* renamed from: N7.z4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1446z4 implements D7.h, D7.i {
    public static JSONObject d(D7.f context, B4 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.t(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f4891a);
        l7.c.t(context, jSONObject, "params", value.f4892b);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return d(fVar, (B4) obj);
    }

    @Override // D7.i
    public final Z6.b c(D7.f fVar, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new B4(l7.c.a(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, zP, null), l7.c.i(fVarW, jSONObject, "params", zP, null, l7.e.f43878b));
    }
}
