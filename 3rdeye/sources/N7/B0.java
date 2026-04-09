package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionArraySetValueJsonParser.kt */
/* loaded from: classes.dex */
public final class B0 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f4829a;

    public B0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f4829a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }

    public final D0 d(D7.f fVar, D0 d02, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new D0(l7.c.e(fVarW, jSONObject, "index", l7.k.f43897b, zP, d02 != null ? d02.f5052a : null, l7.h.f43886g, l7.e.f43877a), l7.c.b(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, zP, d02 != null ? d02.f5053b : null, this.f4829a.f6679Z8), l7.c.d(fVarW, jSONObject, "variable_name", l7.k.f43898c, zP, d02 != null ? d02.f5054c : null));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, D0 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "index", value.f5052a);
        k8.F.y(context, jSONObject, "type", "array_set_value");
        l7.c.u(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f5053b, this.f4829a.f6679Z8);
        l7.c.q(context, jSONObject, "variable_name", value.f5054c);
        return jSONObject;
    }
}
