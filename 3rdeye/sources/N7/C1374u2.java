package N7;

import A7.b;
import N7.C1332r2;
import N7.H3;
import c9.C2091l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivAnimationJsonParser.kt */
/* renamed from: N7.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1374u2 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9363a = b.a.a(300L);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9364b = b.a.a(EnumC1360t2.SPRING);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final H3.b f9365c = new H3.b(new O5());

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9366d = b.a.a(0L);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final l7.i f9367e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final l7.i f9368f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final F3.h f9369g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final B4.f f9370h;

    /* compiled from: DivAnimationJsonParser.kt */
    /* renamed from: N7.u2$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f9371g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1360t2);
        }
    }

    /* compiled from: DivAnimationJsonParser.kt */
    /* renamed from: N7.u2$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f9372g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof C1332r2.a);
        }
    }

    /* compiled from: DivAnimationJsonParser.kt */
    /* renamed from: N7.u2$c */
    public static final class c implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9373a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9373a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v14, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v6, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            F3.h hVar = C1374u2.f9369g;
            b.C0000b c0000b = C1374u2.f9363a;
            ?? B10 = l7.b.b(context, data, "duration", eVar, eVar2, hVar, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            j6.l lVar = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "end_value", dVar, dVar2, lVar, null);
            l7.i iVar = C1374u2.f9367e;
            p9.l<String, EnumC1360t2> lVar2 = EnumC1360t2.FROM_STRING;
            b.C0000b c0000b3 = C1374u2.f9364b;
            ?? B11 = l7.b.b(context, data, "interpolator", iVar, lVar2, lVar, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            Uc uc = this.f9373a;
            List listS = k8.F.s(context, data, "items", uc.f6831n1);
            A7.b bVarA = l7.b.a(context, data, AppMeasurementSdk.ConditionalUserProperty.NAME, C1374u2.f9368f, C1332r2.a.FROM_STRING, lVar);
            H3 h32 = (H3) k8.F.q(context, data, "repeat", uc.f6885s2);
            if (h32 == null) {
                h32 = C1374u2.f9365c;
            }
            kotlin.jvm.internal.l.e(h32, "JsonPropertyParser.readO…) ?: REPEAT_DEFAULT_VALUE");
            B4.f fVar = C1374u2.f9370h;
            b.C0000b c0000b5 = C1374u2.f9366d;
            H3 h33 = h32;
            ?? B12 = l7.b.b(context, data, "start_delay", eVar, eVar2, fVar, c0000b5);
            return new C1332r2(c0000b2, bVarB, c0000b4, listS, bVarA, h33, B12 == 0 ? c0000b5 : B12, l7.b.b(context, data, "start_value", dVar, dVar2, lVar, null));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1332r2 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "duration", value.f9021a);
            l7.b.d(context, jSONObject, "end_value", value.f9022b);
            l7.b.e(context, jSONObject, "interpolator", value.f9023c, EnumC1360t2.TO_STRING);
            Uc uc = this.f9373a;
            k8.F.B(context, jSONObject, "items", value.f9024d, uc.f6831n1);
            l7.b.e(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f9025e, C1332r2.a.TO_STRING);
            k8.F.z(context, jSONObject, "repeat", value.f9026f, uc.f6885s2);
            l7.b.d(context, jSONObject, "start_delay", value.f9027g);
            l7.b.d(context, jSONObject, "start_value", value.f9028h);
            return jSONObject;
        }
    }

    /* compiled from: DivAnimationJsonParser.kt */
    /* renamed from: N7.u2$d */
    public static final class d implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9374a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9374a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "duration", eVar, zP, null, eVar2, C1374u2.f9369g);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            j6.l lVar = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "end_value", dVar, zP, null, dVar2, lVar);
            AbstractC5371a abstractC5371aJ3 = l7.c.j(fVarW, jSONObject, "interpolator", C1374u2.f9367e, zP, null, EnumC1360t2.FROM_STRING, lVar);
            Uc uc = this.f9374a;
            return new C1388v2(abstractC5371aJ, abstractC5371aJ2, abstractC5371aJ3, l7.c.k(fVarW, jSONObject, "items", zP, null, uc.f6841o1), l7.c.e(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, C1374u2.f9368f, zP, null, C1332r2.a.FROM_STRING, lVar), l7.c.h(fVarW, jSONObject, "repeat", zP, null, uc.f6896t2), l7.c.j(fVarW, jSONObject, "start_delay", eVar, zP, null, eVar2, C1374u2.f9370h), l7.c.j(fVarW, jSONObject, "start_value", dVar, zP, null, dVar2, lVar));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1388v2 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "duration", value.f9545a);
            l7.c.q(context, jSONObject, "end_value", value.f9546b);
            l7.c.p(context, "interpolator", value.f9547c, jSONObject, EnumC1360t2.TO_STRING);
            Uc uc = this.f9374a;
            l7.c.v(context, jSONObject, "items", value.f9548d, uc.f6841o1);
            l7.c.p(context, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f9549e, jSONObject, C1332r2.a.TO_STRING);
            l7.c.u(context, jSONObject, "repeat", value.f9550f, uc.f6896t2);
            l7.c.q(context, jSONObject, "start_delay", value.f9551g);
            l7.c.q(context, jSONObject, "start_value", value.f9552h);
            return jSONObject;
        }
    }

    /* compiled from: DivAnimationJsonParser.kt */
    /* renamed from: N7.u2$e */
    public static final class e implements D7.j<JSONObject, C1388v2, C1332r2> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9375a;

        public e(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9375a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v14, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v4, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1388v2 template = (C1388v2) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            F3.h hVar = C1374u2.f9369g;
            b.C0000b c0000b = C1374u2.f9363a;
            ?? N8 = l7.d.n(context, template.f9545a, data, "duration", eVar, eVar2, hVar, c0000b);
            b.C0000b c0000b2 = N8 == 0 ? c0000b : N8;
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            A7.b bVarK = l7.d.k(context, template.f9546b, data, "end_value", dVar, dVar2);
            l7.i iVar = C1374u2.f9367e;
            p9.l<String, EnumC1360t2> lVar = EnumC1360t2.FROM_STRING;
            b.C0000b c0000b3 = C1374u2.f9364b;
            ?? L7 = l7.d.l(context, template.f9547c, data, "interpolator", iVar, lVar, c0000b3);
            b.C0000b c0000b4 = L7 == 0 ? c0000b3 : L7;
            Uc uc = this.f9375a;
            List listQ = l7.d.q(context, template.f9548d, data, "items", uc.f6852p1, uc.f6831n1);
            A7.b bVarD = l7.d.d(context, template.f9549e, data, AppMeasurementSdk.ConditionalUserProperty.NAME, C1374u2.f9368f, C1332r2.a.FROM_STRING);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…imation.Name.FROM_STRING)");
            H3 h32 = (H3) l7.d.h(context, template.f9550f, data, "repeat", uc.f6907u2, uc.f6885s2);
            if (h32 == null) {
                h32 = C1374u2.f9365c;
            }
            H3 h33 = h32;
            kotlin.jvm.internal.l.e(h33, "JsonFieldResolver.resolv…) ?: REPEAT_DEFAULT_VALUE");
            B4.f fVar = C1374u2.f9370h;
            b.C0000b c0000b5 = C1374u2.f9366d;
            ?? N10 = l7.d.n(context, template.f9551g, data, "start_delay", eVar, eVar2, fVar, c0000b5);
            if (N10 != 0) {
                c0000b5 = N10;
            }
            return new C1332r2(c0000b2, bVarK, c0000b4, listQ, bVarD, h33, c0000b5, l7.d.k(context, template.f9552h, data, "start_value", dVar, dVar2));
        }
    }

    static {
        Object objM = C2091l.m(EnumC1360t2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f9371g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f9367e = new l7.i(objM, validator);
        Object objM2 = C2091l.m(C1332r2.a.values());
        kotlin.jvm.internal.l.f(objM2, "default");
        b validator2 = b.f9372g;
        kotlin.jvm.internal.l.f(validator2, "validator");
        f9368f = new l7.i(objM2, validator2);
        f9369g = new F3.h(9);
        f9370h = new B4.f(9);
    }
}
