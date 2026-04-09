package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: DivFunctionArgumentJsonParser.kt */
/* renamed from: N7.l5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1252l5 implements D7.h, D7.i {
    public static JSONObject d(D7.f context, C1280n5 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.t(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f8791a);
        l7.c.s(context, "type", value.f8792b, jSONObject, EnumC1404w4.TO_STRING);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return d(fVar, (C1280n5) obj);
    }

    @Override // D7.i
    public final Z6.b c(D7.f fVar, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new C1280n5(l7.c.a(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, zP, null), l7.c.c(fVarW, jSONObject, "type", zP, null, EnumC1404w4.FROM_STRING, l7.e.f43877a));
    }
}
