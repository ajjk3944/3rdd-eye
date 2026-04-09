package N7;

import D7.a;
import N7.W7;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPercentageSizeTemplate.kt */
/* loaded from: classes.dex */
public final class X7 implements InterfaceC5868a, z7.b<V7> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f7699a;

    public X7(AbstractC5371a<A7.b<Double>> abstractC5371a) {
        this.f7699a = abstractC5371a;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() throws JSONException {
        W7.b bVar = (W7.b) D7.a.f1071b.f6465F5.getValue();
        a.C0011a context = D7.a.f1070a;
        bVar.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", "percentage");
        l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, this.f7699a);
        return jSONObject;
    }
}
