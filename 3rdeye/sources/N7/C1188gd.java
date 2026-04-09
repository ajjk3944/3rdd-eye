package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OffsetDestinationJsonParser.kt */
/* renamed from: N7.gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188gd {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final C1154e9 f8308a = new C1154e9(15);

    /* compiled from: OffsetDestinationJsonParser.kt */
    /* renamed from: N7.gd$a */
    public static final class a implements D7.h, D7.b {
        public static C1173fd d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            return new C1173fd(l7.b.a(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, l7.h.f43886g, C1188gd.f8308a));
        }

        public static JSONObject e(D7.f context, C1173fd value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "offset");
            l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f8251a);
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C1173fd) obj);
        }
    }

    /* compiled from: OffsetDestinationJsonParser.kt */
    /* renamed from: N7.gd$b */
    public static final class b implements D7.h, D7.i {
        public static C1203hd d(D7.f fVar, C1203hd c1203hd, JSONObject jSONObject) throws z7.d {
            return new C1203hd(l7.c.e(T1.B.w(fVar), jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, B4.g.p(fVar, "context", jSONObject, "data"), c1203hd != null ? c1203hd.f8375a : null, l7.h.f43886g, C1188gd.f8308a));
        }

        public static JSONObject e(D7.f context, C1203hd value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "offset");
            l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f8375a);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C1203hd) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: OffsetDestinationJsonParser.kt */
    /* renamed from: N7.gd$c */
    public static final class c implements D7.j<JSONObject, C1203hd, C1173fd> {
        public static C1173fd b(D7.f context, C1203hd template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarE = l7.d.e(context, template.f8375a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, l7.h.f43886g, C1188gd.f8308a);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex…_TO_INT, VALUE_VALIDATOR)");
            return new C1173fd(bVarE);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (C1203hd) bVar, jSONObject);
        }
    }
}
