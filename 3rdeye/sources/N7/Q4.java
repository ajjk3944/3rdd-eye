package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivFixedCountJsonParser.kt */
/* loaded from: classes.dex */
public final class Q4 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final F3.h f6037a = new F3.h(17);

    /* compiled from: DivFixedCountJsonParser.kt */
    public static final class a implements D7.h, D7.b {
        public static P4 d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            return new P4(l7.b.a(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, l7.h.f43886g, Q4.f6037a));
        }

        public static JSONObject e(D7.f context, P4 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "fixed");
            l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f6004a);
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (P4) obj);
        }
    }

    /* compiled from: DivFixedCountJsonParser.kt */
    public static final class b implements D7.h, D7.i {
        public static R4 d(D7.f fVar, R4 r42, JSONObject jSONObject) throws z7.d {
            return new R4(l7.c.e(T1.B.w(fVar), jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, B4.g.p(fVar, "context", jSONObject, "data"), r42 != null ? r42.f6149a : null, l7.h.f43886g, Q4.f6037a));
        }

        public static JSONObject e(D7.f context, R4 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "fixed");
            l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f6149a);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (R4) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivFixedCountJsonParser.kt */
    public static final class c implements D7.j<JSONObject, R4, P4> {
        public static P4 b(D7.f context, R4 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarE = l7.d.e(context, template.f6149a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, l7.h.f43886g, Q4.f6037a);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex…_TO_INT, VALUE_VALIDATOR)");
            return new P4(bVarE);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (R4) bVar, jSONObject);
        }
    }
}
