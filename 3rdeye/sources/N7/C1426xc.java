package N7;

import A7.b;
import N7.Bc;
import N7.C1412wc;
import c9.C2091l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: DivWrapContentSizeJsonParser.kt */
/* renamed from: N7.xc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1426xc {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9799a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final l7.i f9800b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final H7 f9801c;

    /* compiled from: DivWrapContentSizeJsonParser.kt */
    /* renamed from: N7.xc$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f9802g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof H9);
        }
    }

    /* compiled from: DivWrapContentSizeJsonParser.kt */
    /* renamed from: N7.xc$b */
    public static final class b implements D7.h, D7.b {
        public static JSONObject d(D7.f context, C1412wc.a value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.e(context, jSONObject, "unit", value.f9741a, H9.TO_STRING);
            l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f9742b);
            return jSONObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v1, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            l7.i iVar = C1426xc.f9800b;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            b.C0000b c0000b = C1426xc.f9799a;
            ?? B10 = l7.b.b(context, data, "unit", iVar, lVar, l7.e.f43877a, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            return new C1412wc.a(c0000b, l7.b.a(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, l7.h.f43886g, C1426xc.f9801c));
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1412wc.a) obj);
        }
    }

    /* compiled from: DivWrapContentSizeJsonParser.kt */
    /* renamed from: N7.xc$c */
    public static final class c implements D7.h, D7.i {
        public static JSONObject d(D7.f context, Bc.a value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.p(context, "unit", value.f5004a, jSONObject, H9.TO_STRING);
            l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f5005b);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (Bc.a) obj);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            return new Bc.a(l7.c.j(fVarW, jSONObject, "unit", C1426xc.f9800b, zP, null, H9.FROM_STRING, l7.e.f43877a), l7.c.e(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, zP, null, l7.h.f43886g, C1426xc.f9801c));
        }
    }

    /* compiled from: DivWrapContentSizeJsonParser.kt */
    /* renamed from: N7.xc$d */
    public static final class d implements D7.j<JSONObject, Bc.a, C1412wc.a> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            Bc.a template = (Bc.a) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            l7.i iVar = C1426xc.f9800b;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            b.C0000b c0000b = C1426xc.f9799a;
            ?? L7 = l7.d.l(context, template.f5004a, data, "unit", iVar, lVar, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            A7.b bVarE = l7.d.e(context, template.f5005b, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, l7.h.f43886g, C1426xc.f9801c);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex…_TO_INT, VALUE_VALIDATOR)");
            return new C1412wc.a(c0000b2, bVarE);
        }
    }

    static {
        H9 value = H9.DP;
        kotlin.jvm.internal.l.f(value, "value");
        f9799a = new b.C0000b(value);
        Object objM = C2091l.m(H9.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f9802g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f9800b = new l7.i(objM, validator);
        f9801c = new H7(17);
    }
}
