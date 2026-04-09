package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionSetVariableJsonParser.kt */
/* loaded from: classes.dex */
public final class L1 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5749a;

    public L1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5749a = component;
    }

    @Override // D7.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final K1 a(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        return new K1((Yb) k8.F.l(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, this.f5749a.f6668Y8), l7.b.a(context, data, "variable_name", l7.k.f43898c, l7.e.f43878b, l7.e.f43877a));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, K1 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", "set_variable");
        k8.F.z(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f5612a, this.f5749a.f6668Y8);
        l7.b.d(context, jSONObject, "variable_name", value.f5613b);
        return jSONObject;
    }
}
