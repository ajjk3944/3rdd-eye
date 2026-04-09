package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IndexDestinationJsonParser.kt */
/* loaded from: classes.dex */
public final class Ic {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final B8 f5556a = new B8(17);

    /* compiled from: IndexDestinationJsonParser.kt */
    public static final class a implements D7.h, D7.b {
        public static Hc d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            return new Hc(l7.b.a(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, l7.h.f43886g, Ic.f5556a));
        }

        public static JSONObject e(D7.f context, Hc value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "index");
            l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f5434a);
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (Hc) obj);
        }
    }

    /* compiled from: IndexDestinationJsonParser.kt */
    public static final class b implements D7.h, D7.i {
        public static Jc d(D7.f fVar, Jc jc, JSONObject jSONObject) throws z7.d {
            return new Jc(l7.c.e(T1.B.w(fVar), jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, B4.g.p(fVar, "context", jSONObject, "data"), jc != null ? jc.f5608a : null, l7.h.f43886g, Ic.f5556a));
        }

        public static JSONObject e(D7.f context, Jc value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "index");
            l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f5608a);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (Jc) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: IndexDestinationJsonParser.kt */
    public static final class c implements D7.j<JSONObject, Jc, Hc> {
        public static Hc b(D7.f context, Jc template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarE = l7.d.e(context, template.f5608a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, l7.h.f43886g, Ic.f5556a);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex…_TO_INT, VALUE_VALIDATOR)");
            return new Hc(bVarE);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (Jc) bVar, jSONObject);
        }
    }
}
