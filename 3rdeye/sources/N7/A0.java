package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import l7.h;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionArraySetValueJsonParser.kt */
/* loaded from: classes.dex */
public final class A0 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f4752a;

    public A0(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f4752a = component;
    }

    @Override // D7.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C1442z0 a(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        k.e eVar = l7.k.f43897b;
        h.e eVar2 = l7.h.f43886g;
        j6.l lVar = l7.e.f43877a;
        return new C1442z0(l7.b.a(context, data, "index", eVar, eVar2, lVar), l7.b.a(context, data, "variable_name", l7.k.f43898c, l7.e.f43878b, lVar), (Yb) k8.F.l(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, this.f4752a.f6668Y8));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1442z0 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, "index", value.f9994a);
        k8.F.y(context, jSONObject, "type", "array_set_value");
        k8.F.z(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f9995b, this.f4752a.f6668Y8);
        l7.b.d(context, jSONObject, "variable_name", value.f9996c);
        return jSONObject;
    }
}
