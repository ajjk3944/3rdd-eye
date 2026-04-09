package N7;

import A7.b;
import c9.C2091l;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivScaleTransitionJsonParser.kt */
/* renamed from: N7.b9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1109b9 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7935a = b.a.a(200L);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7936b = b.a.a(EnumC1360t2.EASE_IN_OUT);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7937c = b.a.a(Double.valueOf(0.5d));

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7938d = b.a.a(Double.valueOf(0.5d));

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7939e = b.a.a(Double.valueOf(0.0d));

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7940f = b.a.a(0L);

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final l7.i f7941g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final C1094a9 f7942h;

    @Deprecated
    public static final H7 i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final B8 f7943j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final B4.i f7944k;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final G8 f7945l;

    /* compiled from: DivScaleTransitionJsonParser.kt */
    /* renamed from: N7.b9$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f7946g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1360t2);
        }
    }

    /* compiled from: DivScaleTransitionJsonParser.kt */
    /* renamed from: N7.b9$b */
    public static final class b implements D7.h, D7.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v5, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v7, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v9, types: [A7.b] */
        public static Z8 d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            C1094a9 c1094a9 = C1109b9.f7942h;
            b.C0000b c0000b = C1109b9.f7935a;
            ?? B10 = l7.b.b(context, data, "duration", eVar, eVar2, c1094a9, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            l7.i iVar = C1109b9.f7941g;
            p9.l<String, EnumC1360t2> lVar = EnumC1360t2.FROM_STRING;
            b.C0000b c0000b3 = C1109b9.f7936b;
            ?? B11 = l7.b.b(context, data, "interpolator", iVar, lVar, l7.e.f43877a, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            H7 h72 = C1109b9.i;
            b.C0000b c0000b5 = C1109b9.f7937c;
            ?? B12 = l7.b.b(context, data, "pivot_x", dVar, dVar2, h72, c0000b5);
            b.C0000b c0000b6 = B12 == 0 ? c0000b5 : B12;
            B8 b82 = C1109b9.f7943j;
            b.C0000b c0000b7 = C1109b9.f7938d;
            ?? B13 = l7.b.b(context, data, "pivot_y", dVar, dVar2, b82, c0000b7);
            b.C0000b c0000b8 = B13 == 0 ? c0000b7 : B13;
            B4.i iVar2 = C1109b9.f7944k;
            b.C0000b c0000b9 = C1109b9.f7939e;
            ?? B14 = l7.b.b(context, data, "scale", dVar, dVar2, iVar2, c0000b9);
            b.C0000b c0000b10 = B14 == 0 ? c0000b9 : B14;
            G8 g82 = C1109b9.f7945l;
            b.C0000b c0000b11 = C1109b9.f7940f;
            ?? B15 = l7.b.b(context, data, "start_delay", eVar, eVar2, g82, c0000b11);
            if (B15 != 0) {
                c0000b11 = B15;
            }
            return new Z8(c0000b2, c0000b4, c0000b6, c0000b8, c0000b10, c0000b11);
        }

        public static JSONObject e(D7.f context, Z8 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "duration", value.f7864a);
            l7.b.e(context, jSONObject, "interpolator", value.f7865b, EnumC1360t2.TO_STRING);
            l7.b.d(context, jSONObject, "pivot_x", value.f7866c);
            l7.b.d(context, jSONObject, "pivot_y", value.f7867d);
            l7.b.d(context, jSONObject, "scale", value.f7868e);
            l7.b.d(context, jSONObject, "start_delay", value.f7869f);
            k8.F.y(context, jSONObject, "type", "scale");
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (Z8) obj);
        }
    }

    /* compiled from: DivScaleTransitionJsonParser.kt */
    /* renamed from: N7.b9$c */
    public static final class c implements D7.h, D7.i {
        public static C1124c9 d(D7.f fVar, C1124c9 c1124c9, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a = c1124c9 != null ? c1124c9.f7975a : null;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "duration", eVar, zP, abstractC5371a, eVar2, C1109b9.f7942h);
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "interpolator", C1109b9.f7941g, zP, c1124c9 != null ? c1124c9.f7976b : null, EnumC1360t2.FROM_STRING, l7.e.f43877a);
            k.d dVar = l7.k.f43899d;
            AbstractC5371a<A7.b<Double>> abstractC5371a2 = c1124c9 != null ? c1124c9.f7977c : null;
            h.d dVar2 = l7.h.f43885f;
            return new C1124c9(abstractC5371aJ, abstractC5371aJ2, l7.c.j(fVarW, jSONObject, "pivot_x", dVar, zP, abstractC5371a2, dVar2, C1109b9.i), l7.c.j(fVarW, jSONObject, "pivot_y", dVar, zP, c1124c9 != null ? c1124c9.f7978d : null, dVar2, C1109b9.f7943j), l7.c.j(fVarW, jSONObject, "scale", dVar, zP, c1124c9 != null ? c1124c9.f7979e : null, dVar2, C1109b9.f7944k), l7.c.j(fVarW, jSONObject, "start_delay", eVar, zP, c1124c9 != null ? c1124c9.f7980f : null, eVar2, C1109b9.f7945l));
        }

        public static JSONObject e(D7.f context, C1124c9 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "duration", value.f7975a);
            l7.c.p(context, "interpolator", value.f7976b, jSONObject, EnumC1360t2.TO_STRING);
            l7.c.q(context, jSONObject, "pivot_x", value.f7977c);
            l7.c.q(context, jSONObject, "pivot_y", value.f7978d);
            l7.c.q(context, jSONObject, "scale", value.f7979e);
            l7.c.q(context, jSONObject, "start_delay", value.f7980f);
            k8.F.y(context, jSONObject, "type", "scale");
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C1124c9) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivScaleTransitionJsonParser.kt */
    /* renamed from: N7.b9$d */
    public static final class d implements D7.j<JSONObject, C1124c9, Z8> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v5, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v7, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v9, types: [A7.b] */
        public static Z8 b(D7.f context, C1124c9 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            C1094a9 c1094a9 = C1109b9.f7942h;
            b.C0000b c0000b = C1109b9.f7935a;
            ?? N8 = l7.d.n(context, template.f7975a, data, "duration", eVar, eVar2, c1094a9, c0000b);
            b.C0000b c0000b2 = N8 == 0 ? c0000b : N8;
            l7.i iVar = C1109b9.f7941g;
            p9.l<String, EnumC1360t2> lVar = EnumC1360t2.FROM_STRING;
            b.C0000b c0000b3 = C1109b9.f7936b;
            ?? L7 = l7.d.l(context, template.f7976b, data, "interpolator", iVar, lVar, c0000b3);
            b.C0000b c0000b4 = L7 == 0 ? c0000b3 : L7;
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            H7 h72 = C1109b9.i;
            b.C0000b c0000b5 = C1109b9.f7937c;
            ?? N10 = l7.d.n(context, template.f7977c, data, "pivot_x", dVar, dVar2, h72, c0000b5);
            b.C0000b c0000b6 = N10 == 0 ? c0000b5 : N10;
            B8 b82 = C1109b9.f7943j;
            b.C0000b c0000b7 = C1109b9.f7938d;
            ?? N11 = l7.d.n(context, template.f7978d, data, "pivot_y", dVar, dVar2, b82, c0000b7);
            b.C0000b c0000b8 = N11 == 0 ? c0000b7 : N11;
            B4.i iVar2 = C1109b9.f7944k;
            b.C0000b c0000b9 = C1109b9.f7939e;
            ?? N12 = l7.d.n(context, template.f7979e, data, "scale", dVar, dVar2, iVar2, c0000b9);
            b.C0000b c0000b10 = N12 == 0 ? c0000b9 : N12;
            G8 g82 = C1109b9.f7945l;
            b.C0000b c0000b11 = C1109b9.f7940f;
            ?? N13 = l7.d.n(context, template.f7980f, data, "start_delay", eVar, eVar2, g82, c0000b11);
            return new Z8(c0000b2, c0000b4, c0000b6, c0000b8, c0000b10, N13 == 0 ? c0000b11 : N13);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (C1124c9) bVar, jSONObject);
        }
    }

    static {
        Object objM = C2091l.m(EnumC1360t2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f7946g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f7941g = new l7.i(objM, validator);
        f7942h = new C1094a9(0);
        i = new H7(1);
        f7943j = new B8(1);
        f7944k = new B4.i(29);
        f7945l = new G8(1);
    }
}
