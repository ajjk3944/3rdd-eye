package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivPercentageSizeJsonParser.kt */
/* loaded from: classes.dex */
public final class W7 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final B4.f f7616a = new B4.f(29);

    /* compiled from: DivPercentageSizeJsonParser.kt */
    public static final class a implements D7.h, D7.b {
        @Override // D7.b
        public final Object a(D7.f context, JSONObject jSONObject) {
            kotlin.jvm.internal.l.f(context, "context");
            return new V7(l7.b.a(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43899d, l7.h.f43885f, W7.f7616a));
        }

        @Override // D7.h
        public final JSONObject b(D7.f context, Object obj) throws JSONException {
            V7 value = (V7) obj;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "percentage");
            l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f7575a);
            return jSONObject;
        }
    }

    /* compiled from: DivPercentageSizeJsonParser.kt */
    public static final class b implements D7.h, D7.i {
        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final JSONObject b(D7.f context, Object obj) throws JSONException {
            X7 value = (X7) obj;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "percentage");
            l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f7699a);
            return jSONObject;
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            return new X7(l7.c.e(T1.B.w(fVar), jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43899d, B4.g.p(fVar, "context", jSONObject, "data"), null, l7.h.f43885f, W7.f7616a));
        }
    }

    /* compiled from: DivPercentageSizeJsonParser.kt */
    public static final class c implements D7.j<JSONObject, X7, V7> {
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            X7 template = (X7) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarE = l7.d.e(context, template.f7699a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43899d, l7.h.f43885f, W7.f7616a);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex…_DOUBLE, VALUE_VALIDATOR)");
            return new V7(bVarE);
        }
    }
}
