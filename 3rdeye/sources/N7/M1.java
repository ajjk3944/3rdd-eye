package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionSetVariableJsonParser.kt */
/* loaded from: classes.dex */
public final class M1 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5828a;

    public M1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5828a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }

    public final O1 d(D7.f fVar, O1 o12, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new O1(l7.c.b(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, zP, o12 != null ? o12.f5946a : null, this.f5828a.f6679Z8), l7.c.d(fVarW, jSONObject, "variable_name", l7.k.f43898c, zP, o12 != null ? o12.f5947b : null));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, O1 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", "set_variable");
        l7.c.u(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f5946a, this.f5828a.f6679Z8);
        l7.c.q(context, jSONObject, "variable_name", value.f5947b);
        return jSONObject;
    }
}
