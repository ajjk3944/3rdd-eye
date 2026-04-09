package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionDictSetValueJsonParser.kt */
/* loaded from: classes.dex */
public final class V0 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7554a;

    public V0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7554a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }

    public final X0 d(D7.f fVar, X0 x02, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        k.g gVar = l7.k.f43898c;
        return new X0(l7.c.d(fVarW, jSONObject, "key", gVar, zP, x02 != null ? x02.f7682a : null), l7.c.h(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, zP, x02 != null ? x02.f7683b : null, this.f7554a.f6679Z8), l7.c.d(fVarW, jSONObject, "variable_name", gVar, zP, x02 != null ? x02.f7684c : null));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, X0 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "key", value.f7682a);
        k8.F.y(context, jSONObject, "type", "dict_set_value");
        l7.c.u(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f7683b, this.f7554a.f6679Z8);
        l7.c.q(context, jSONObject, "variable_name", value.f7684c);
        return jSONObject;
    }
}
