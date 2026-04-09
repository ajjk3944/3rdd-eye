package N7;

import N7.C1139d9;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivSelectJsonParser.kt */
/* renamed from: N7.g9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1184g9 implements D7.h, D7.b {
    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        k.g gVar = l7.k.f43898c;
        A8.d dVar = l7.e.f43878b;
        j6.l lVar = l7.e.f43877a;
        return new C1139d9.a(l7.b.b(context, data, "text", gVar, dVar, lVar, null), l7.b.a(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, gVar, dVar, lVar));
    }

    @Override // D7.h
    public final JSONObject b(D7.f context, Object obj) {
        C1139d9.a value = (C1139d9.a) obj;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, "text", value.f8122a);
        l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f8123b);
        return jSONObject;
    }
}
