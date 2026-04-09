package N7;

import A7.b;
import c9.C2091l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
/* loaded from: classes.dex */
public final class E8 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5151a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final l7.i f5152b;

    /* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f5153g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof H9);
        }
    }

    /* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class b implements D7.h, D7.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [A7.b] */
        public static D8 d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            l7.i iVar = E8.f5152b;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            b.C0000b c0000b = E8.f5151a;
            j6.l lVar2 = l7.e.f43877a;
            ?? B10 = l7.b.b(context, data, "unit", iVar, lVar, lVar2, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            return new D8(c0000b, l7.b.a(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, l7.h.f43886g, lVar2));
        }

        public static JSONObject e(D7.f context, D8 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "fixed");
            l7.b.e(context, jSONObject, "unit", value.f5115a, H9.TO_STRING);
            l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f5116b);
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (D8) obj);
        }
    }

    /* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class c implements D7.h, D7.i {
        public static F8 d(D7.f fVar, F8 f82, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            l7.i iVar = E8.f5152b;
            AbstractC5371a<A7.b<H9>> abstractC5371a = f82 != null ? f82.f5230a : null;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            return new F8(l7.c.j(fVarW, jSONObject, "unit", iVar, zP, abstractC5371a, lVar, lVar2), l7.c.e(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, zP, f82 != null ? f82.f5231b : null, l7.h.f43886g, lVar2));
        }

        public static JSONObject e(D7.f context, F8 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "fixed");
            l7.c.p(context, "unit", value.f5230a, jSONObject, H9.TO_STRING);
            l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f5231b);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (F8) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class d implements D7.j<JSONObject, F8, D8> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v1, types: [A7.b] */
        public static D8 b(D7.f context, F8 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            l7.i iVar = E8.f5152b;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            b.C0000b c0000b = E8.f5151a;
            ?? L7 = l7.d.l(context, template.f5230a, data, "unit", iVar, lVar, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            A7.b bVarD = l7.d.d(context, template.f5231b, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, l7.h.f43886g);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…ELPER_INT, NUMBER_TO_INT)");
            return new D8(c0000b, bVarD);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (F8) bVar, jSONObject);
        }
    }

    static {
        H9 value = H9.DP;
        kotlin.jvm.internal.l.f(value, "value");
        f5151a = new b.C0000b(value);
        Object objM = C2091l.m(H9.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f5153g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f5152b = new l7.i(objM, validator);
    }
}
