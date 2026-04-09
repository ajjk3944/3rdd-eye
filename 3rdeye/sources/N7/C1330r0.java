package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionArrayInsertValueJsonParser.kt */
/* renamed from: N7.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1330r0 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9009a;

    public C1330r0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9009a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }

    public final C1358t0 d(D7.f fVar, C1358t0 c1358t0, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new C1358t0(l7.c.j(fVarW, jSONObject, "index", l7.k.f43897b, zP, c1358t0 != null ? c1358t0.f9198a : null, l7.h.f43886g, l7.e.f43877a), l7.c.b(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, zP, c1358t0 != null ? c1358t0.f9199b : null, this.f9009a.f6679Z8), l7.c.d(fVarW, jSONObject, "variable_name", l7.k.f43898c, zP, c1358t0 != null ? c1358t0.f9200c : null));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1358t0 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "index", value.f9198a);
        k8.F.y(context, jSONObject, "type", "array_insert_value");
        l7.c.u(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f9199b, this.f9009a.f6679Z8);
        l7.c.q(context, jSONObject, "variable_name", value.f9200c);
        return jSONObject;
    }
}
