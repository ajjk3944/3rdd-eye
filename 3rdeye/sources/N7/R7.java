package N7;

import N7.U7;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONObject;

/* compiled from: DivPatchJsonParser.kt */
/* loaded from: classes.dex */
public final class R7 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f6158a;

    public R7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f6158a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final Z6.b c(D7.f fVar, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new U7.a(l7.c.a(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, zP, null), l7.c.k(fVarW, jSONObject, "items", zP, null, this.f6158a.f6946x9));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, U7.a value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.t(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f6399a);
        l7.c.v(context, jSONObject, "items", value.f6400b, this.f6158a.f6946x9);
        return jSONObject;
    }
}
