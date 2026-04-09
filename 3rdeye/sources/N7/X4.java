package N7;

import A7.b;
import c9.C2091l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivFixedSizeJsonParser.kt */
/* loaded from: classes.dex */
public final class X4 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7694a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final l7.i f7695b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final B4.i f7696c;

    /* compiled from: DivFixedSizeJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f7697g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof H9);
        }
    }

    /* compiled from: DivFixedSizeJsonParser.kt */
    public static final class b implements D7.h, D7.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v1, types: [A7.b] */
        public static W4 d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            l7.i iVar = X4.f7695b;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            b.C0000b c0000b = X4.f7694a;
            ?? B10 = l7.b.b(context, data, "unit", iVar, lVar, l7.e.f43877a, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            return new W4(c0000b, l7.b.a(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, l7.h.f43886g, X4.f7696c));
        }

        public static JSONObject e(D7.f context, W4 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "fixed");
            l7.b.e(context, jSONObject, "unit", value.f7612a, H9.TO_STRING);
            l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f7613b);
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (W4) obj);
        }
    }

    /* compiled from: DivFixedSizeJsonParser.kt */
    public static final class c implements D7.h, D7.i {
        public static Y4 d(D7.f fVar, Y4 y42, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            return new Y4(l7.c.j(fVarW, jSONObject, "unit", X4.f7695b, zP, y42 != null ? y42.f7769a : null, H9.FROM_STRING, l7.e.f43877a), l7.c.e(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, zP, y42 != null ? y42.f7770b : null, l7.h.f43886g, X4.f7696c));
        }

        public static JSONObject e(D7.f context, Y4 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "fixed");
            l7.c.p(context, "unit", value.f7769a, jSONObject, H9.TO_STRING);
            l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f7770b);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (Y4) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivFixedSizeJsonParser.kt */
    public static final class d implements D7.j<JSONObject, Y4, W4> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [A7.b] */
        public static W4 b(D7.f context, Y4 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            l7.i iVar = X4.f7695b;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            b.C0000b c0000b = X4.f7694a;
            ?? L7 = l7.d.l(context, template.f7769a, data, "unit", iVar, lVar, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            A7.b bVarE = l7.d.e(context, template.f7770b, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, l7.h.f43886g, X4.f7696c);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex…_TO_INT, VALUE_VALIDATOR)");
            return new W4(c0000b2, bVarE);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (Y4) bVar, jSONObject);
        }
    }

    static {
        H9 value = H9.DP;
        kotlin.jvm.internal.l.f(value, "value");
        f7694a = new b.C0000b(value);
        Object objM = C2091l.m(H9.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f7697g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f7695b = new l7.i(objM, validator);
        f7696c = new B4.i(16);
    }
}
