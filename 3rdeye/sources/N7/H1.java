package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionSetStoredValueJsonParser.kt */
/* loaded from: classes.dex */
public final class H1 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5384a;

    public H1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5384a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }

    public final J1 d(D7.f fVar, J1 j12, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new J1(l7.c.e(fVarW, jSONObject, "lifetime", l7.k.f43897b, zP, j12 != null ? j12.f5561a : null, l7.h.f43886g, l7.e.f43877a), l7.c.d(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, l7.k.f43898c, zP, j12 != null ? j12.f5562b : null), l7.c.b(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, zP, j12 != null ? j12.f5563c : null, this.f5384a.f6679Z8));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, J1 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "lifetime", value.f5561a);
        l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f5562b);
        k8.F.y(context, jSONObject, "type", "set_stored_value");
        l7.c.u(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f5563c, this.f5384a.f6679Z8);
        return jSONObject;
    }
}
