package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionDictSetValueJsonParser.kt */
/* loaded from: classes.dex */
public final class U0 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f6357a;

    public U0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f6357a = component;
    }

    @Override // D7.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final T0 a(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        k.g gVar = l7.k.f43898c;
        A8.d dVar = l7.e.f43878b;
        j6.l lVar = l7.e.f43877a;
        return new T0(l7.b.a(context, data, "key", gVar, dVar, lVar), l7.b.a(context, data, "variable_name", gVar, dVar, lVar), (Yb) k8.F.q(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, this.f6357a.f6668Y8));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, T0 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, "key", value.f6218a);
        k8.F.y(context, jSONObject, "type", "dict_set_value");
        k8.F.z(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f6219b, this.f6357a.f6668Y8);
        l7.b.d(context, jSONObject, "variable_name", value.f6220c);
        return jSONObject;
    }
}
