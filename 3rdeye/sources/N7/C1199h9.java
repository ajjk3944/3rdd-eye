package N7;

import N7.C1228j9;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivSelectJsonParser.kt */
/* renamed from: N7.h9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1199h9 implements D7.h, D7.i {
    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final JSONObject b(D7.f context, Object obj) {
        C1228j9.a value = (C1228j9.a) obj;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "text", value.f8594a);
        l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f8595b);
        return jSONObject;
    }

    @Override // D7.i
    public final Z6.b c(D7.f fVar, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        k.g gVar = l7.k.f43898c;
        return new C1228j9.a(l7.c.j(fVarW, jSONObject, "text", gVar, zP, null, l7.e.f43878b, l7.e.f43877a), l7.c.d(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, gVar, zP, null));
    }
}
