package N7;

import N7.S8;
import c9.C2091l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
/* loaded from: classes.dex */
public final class T8 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final l7.i f6346a;

    /* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f6347g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof S8.a);
        }
    }

    /* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class b implements D7.h, D7.b {
        public static S8 d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            return new S8(l7.b.a(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, T8.f6346a, S8.a.FROM_STRING, l7.e.f43877a));
        }

        public static JSONObject e(D7.f context, S8 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "relative");
            l7.b.e(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f6207a, S8.a.TO_STRING);
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (S8) obj);
        }
    }

    /* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class c implements D7.h, D7.i {
        public static U8 d(D7.f fVar, U8 u8, JSONObject jSONObject) throws z7.d {
            return new U8(l7.c.e(T1.B.w(fVar), jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, T8.f6346a, B4.g.p(fVar, "context", jSONObject, "data"), u8 != null ? u8.f6401a : null, S8.a.FROM_STRING, l7.e.f43877a));
        }

        public static JSONObject e(D7.f context, U8 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "relative");
            l7.c.p(context, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f6401a, jSONObject, S8.a.TO_STRING);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (U8) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class d implements D7.j<JSONObject, U8, S8> {
        public static S8 b(D7.f context, U8 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarD = l7.d.d(context, template.f6401a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, T8.f6346a, S8.a.FROM_STRING);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…Radius.Value.FROM_STRING)");
            return new S8(bVarD);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (U8) bVar, jSONObject);
        }
    }

    static {
        Object objM = C2091l.m(S8.a.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f6347g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f6346a = new l7.i(objM, validator);
    }
}
