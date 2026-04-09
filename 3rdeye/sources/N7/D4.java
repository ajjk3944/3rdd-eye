package N7;

import A7.b;
import c9.C2091l;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivFadeTransitionJsonParser.kt */
/* loaded from: classes.dex */
public final class D4 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5062a = b.a.a(Double.valueOf(0.0d));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5063b = b.a.a(200L);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5064c = b.a.a(EnumC1360t2.EASE_IN_OUT);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5065d = b.a.a(0L);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final l7.i f5066e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final B4.g f5067f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final B4.h f5068g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final B4.i f5069h;

    /* compiled from: DivFadeTransitionJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f5070g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1360t2);
        }
    }

    /* compiled from: DivFadeTransitionJsonParser.kt */
    public static final class b implements D7.h, D7.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v5, types: [A7.b] */
        public static C4 d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B4.g gVar = D4.f5067f;
            b.C0000b c0000b = D4.f5062a;
            ?? B10 = l7.b.b(context, data, "alpha", dVar, dVar2, gVar, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            B4.h hVar = D4.f5068g;
            b.C0000b c0000b3 = D4.f5063b;
            ?? B11 = l7.b.b(context, data, "duration", eVar, eVar2, hVar, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            l7.i iVar = D4.f5066e;
            p9.l<String, EnumC1360t2> lVar = EnumC1360t2.FROM_STRING;
            b.C0000b c0000b5 = D4.f5064c;
            ?? B12 = l7.b.b(context, data, "interpolator", iVar, lVar, l7.e.f43877a, c0000b5);
            b.C0000b c0000b6 = B12 == 0 ? c0000b5 : B12;
            B4.i iVar2 = D4.f5069h;
            b.C0000b c0000b7 = D4.f5065d;
            ?? B13 = l7.b.b(context, data, "start_delay", eVar, eVar2, iVar2, c0000b7);
            if (B13 != 0) {
                c0000b7 = B13;
            }
            return new C4(c0000b2, c0000b4, c0000b6, c0000b7);
        }

        public static JSONObject e(D7.f context, C4 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "alpha", value.f5018a);
            l7.b.d(context, jSONObject, "duration", value.f5019b);
            l7.b.e(context, jSONObject, "interpolator", value.f5020c, EnumC1360t2.TO_STRING);
            l7.b.d(context, jSONObject, "start_delay", value.f5021d);
            k8.F.y(context, jSONObject, "type", "fade");
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C4) obj);
        }
    }

    /* compiled from: DivFadeTransitionJsonParser.kt */
    public static final class c implements D7.h, D7.i {
        public static E4 d(D7.f fVar, E4 e4, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "alpha", l7.k.f43899d, zP, e4 != null ? e4.f5135a : null, l7.h.f43885f, D4.f5067f);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a = e4 != null ? e4.f5136b : null;
            h.e eVar2 = l7.h.f43886g;
            return new E4(abstractC5371aJ, l7.c.j(fVarW, jSONObject, "duration", eVar, zP, abstractC5371a, eVar2, D4.f5068g), l7.c.j(fVarW, jSONObject, "interpolator", D4.f5066e, zP, e4 != null ? e4.f5137c : null, EnumC1360t2.FROM_STRING, l7.e.f43877a), l7.c.j(fVarW, jSONObject, "start_delay", eVar, zP, e4 != null ? e4.f5138d : null, eVar2, D4.f5069h));
        }

        public static JSONObject e(D7.f context, E4 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "alpha", value.f5135a);
            l7.c.q(context, jSONObject, "duration", value.f5136b);
            l7.c.p(context, "interpolator", value.f5137c, jSONObject, EnumC1360t2.TO_STRING);
            l7.c.q(context, jSONObject, "start_delay", value.f5138d);
            k8.F.y(context, jSONObject, "type", "fade");
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (E4) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivFadeTransitionJsonParser.kt */
    public static final class d implements D7.j<JSONObject, E4, C4> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v5, types: [A7.b] */
        public static C4 b(D7.f context, E4 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B4.g gVar = D4.f5067f;
            b.C0000b c0000b = D4.f5062a;
            ?? N8 = l7.d.n(context, template.f5135a, data, "alpha", dVar, dVar2, gVar, c0000b);
            b.C0000b c0000b2 = N8 == 0 ? c0000b : N8;
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            B4.h hVar = D4.f5068g;
            b.C0000b c0000b3 = D4.f5063b;
            ?? N10 = l7.d.n(context, template.f5136b, data, "duration", eVar, eVar2, hVar, c0000b3);
            b.C0000b c0000b4 = N10 == 0 ? c0000b3 : N10;
            l7.i iVar = D4.f5066e;
            p9.l<String, EnumC1360t2> lVar = EnumC1360t2.FROM_STRING;
            b.C0000b c0000b5 = D4.f5064c;
            ?? L7 = l7.d.l(context, template.f5137c, data, "interpolator", iVar, lVar, c0000b5);
            b.C0000b c0000b6 = L7 == 0 ? c0000b5 : L7;
            B4.i iVar2 = D4.f5069h;
            b.C0000b c0000b7 = D4.f5065d;
            ?? N11 = l7.d.n(context, template.f5138d, data, "start_delay", eVar, eVar2, iVar2, c0000b7);
            if (N11 != 0) {
                c0000b7 = N11;
            }
            return new C4(c0000b2, c0000b4, c0000b6, c0000b7);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (E4) bVar, jSONObject);
        }
    }

    static {
        Object objM = C2091l.m(EnumC1360t2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f5070g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f5066e = new l7.i(objM, validator);
        f5067f = new B4.g(17);
        f5068g = new B4.h(16);
        f5069h = new B4.i(15);
    }
}
