package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: DivFunctionArgumentJsonParser.kt */
/* renamed from: N7.m5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1266m5 implements D7.j<JSONObject, C1280n5, C1224j5> {
    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        C1280n5 template = (C1280n5) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        AbstractC5371a<String> abstractC5371a = template.f8791a;
        A8.d dVar = l7.e.f43878b;
        j6.l lVar = l7.e.f43877a;
        Object objB = l7.d.b(abstractC5371a, data, AppMeasurementSdk.ConditionalUserProperty.NAME, dVar, lVar);
        kotlin.jvm.internal.l.e(objB, "resolve(context, template.name, data, \"name\")");
        Object objB2 = l7.d.b(template.f8792b, data, "type", EnumC1404w4.FROM_STRING, lVar);
        kotlin.jvm.internal.l.e(objB2, "resolve(context, templat…valuableType.FROM_STRING)");
        return new C1224j5((String) objB, (EnumC1404w4) objB2);
    }
}
