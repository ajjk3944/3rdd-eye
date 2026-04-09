package N7;

import N7.C1117c2;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes.dex */
public final class Z1 implements D7.h, D7.i {
    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final JSONObject b(D7.f context, Object obj) {
        C1117c2.a.C0100a value = (C1117c2.a.C0100a) obj;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f7965a);
        l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f7966b);
        return jSONObject;
    }

    @Override // D7.i
    public final Z6.b c(D7.f fVar, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        k.g gVar = l7.k.f43898c;
        return new C1117c2.a.C0100a(l7.c.d(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, gVar, zP, null), l7.c.d(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, gVar, zP, null));
    }
}
