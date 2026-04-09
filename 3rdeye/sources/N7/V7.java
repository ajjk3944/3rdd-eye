package N7;

import D7.a;
import N7.W7;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPercentageSize.kt */
/* loaded from: classes.dex */
public final class V7 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Double> f7575a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f7576b;

    public V7(A7.b<Double> bVar) {
        this.f7575a = bVar;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() throws JSONException {
        W7.a aVar = (W7.a) D7.a.f1071b.f6455E5.getValue();
        a.C0011a context = D7.a.f1070a;
        aVar.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", "percentage");
        l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, this.f7575a);
        return jSONObject;
    }
}
