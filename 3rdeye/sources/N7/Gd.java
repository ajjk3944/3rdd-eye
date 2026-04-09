package N7;

import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: UrlVariableJsonParser.kt */
/* loaded from: classes.dex */
public final class Gd implements D7.j<JSONObject, Hd, Dd> {
    public static Dd b(D7.f context, Hd template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        AbstractC5371a<String> abstractC5371a = template.f5436a;
        A8.d dVar = l7.e.f43878b;
        j6.l lVar = l7.e.f43877a;
        Object objB = l7.d.b(abstractC5371a, data, AppMeasurementSdk.ConditionalUserProperty.NAME, dVar, lVar);
        kotlin.jvm.internal.l.e(objB, "resolve(context, template.name, data, \"name\")");
        Object objB2 = l7.d.b(template.f5437b, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.h.f43883d, lVar);
        kotlin.jvm.internal.l.e(objB2, "resolve(context, templat…ata, \"value\", ANY_TO_URI)");
        return new Dd((String) objB, (Uri) objB2);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (Hd) bVar, jSONObject);
    }
}
