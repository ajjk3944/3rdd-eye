package N7;

import A7.b;
import c9.C2091l;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivPageTransformationSlideJsonParser.kt */
/* loaded from: classes.dex */
public final class D7 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5105a = b.a.a(EnumC1360t2.EASE_IN_OUT);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5106b = b.a.a(Double.valueOf(1.0d));

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5107c = b.a.a(Double.valueOf(1.0d));

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5108d = b.a.a(Double.valueOf(1.0d));

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5109e = b.a.a(Double.valueOf(1.0d));

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final l7.i f5110f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final B4.f f5111g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final B4.g f5112h;

    @Deprecated
    public static final B4.h i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final B4.i f5113j;

    /* compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f5114g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1360t2);
        }
    }

    /* compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class b implements D7.h, D7.b {
        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public static N7.C7 d(D7.f r12, org.json.JSONObject r13) throws z7.d {
            /*
                java.lang.String r0 = "context"
                kotlin.jvm.internal.l.f(r12, r0)
                java.lang.String r0 = "data"
                kotlin.jvm.internal.l.f(r13, r0)
                N7.C7 r0 = new N7.C7
                l7.i r4 = N7.D7.f5110f
                p9.l<java.lang.String, N7.t2> r5 = N7.EnumC1360t2.FROM_STRING
                A7.b$b r7 = N7.D7.f5105a
                j6.l r6 = l7.e.f43877a
                java.lang.String r3 = "interpolator"
                r1 = r12
                r2 = r13
                A7.b r3 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L20
                r8 = r7
                goto L21
            L20:
                r8 = r3
            L21:
                l7.k$d r4 = l7.k.f43899d
                l7.h$d r5 = l7.h.f43885f
                B4.f r6 = N7.D7.f5111g
                A7.b$b r7 = N7.D7.f5106b
                java.lang.String r3 = "next_page_alpha"
                r1 = r12
                r2 = r13
                A7.b r3 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L35
                r9 = r7
                goto L36
            L35:
                r9 = r3
            L36:
                B4.g r6 = N7.D7.f5112h
                A7.b$b r7 = N7.D7.f5107c
                java.lang.String r3 = "next_page_scale"
                r1 = r12
                r2 = r13
                A7.b r3 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L46
                r10 = r7
                goto L47
            L46:
                r10 = r3
            L47:
                B4.h r6 = N7.D7.i
                A7.b$b r7 = N7.D7.f5108d
                java.lang.String r3 = "previous_page_alpha"
                r1 = r12
                r2 = r13
                A7.b r3 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L57
                r11 = r7
                goto L58
            L57:
                r11 = r3
            L58:
                B4.i r6 = N7.D7.f5113j
                A7.b$b r7 = N7.D7.f5109e
                java.lang.String r3 = "previous_page_scale"
                r1 = r12
                r2 = r13
                A7.b r1 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                if (r1 != 0) goto L6d
                r6 = r7
                r1 = r0
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                goto L73
            L6d:
                r6 = r1
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r1 = r0
            L73:
                r1.<init>(r2, r3, r4, r5, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: N7.D7.b.d(D7.f, org.json.JSONObject):N7.C7");
        }

        public static JSONObject e(D7.f context, C7 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.e(context, jSONObject, "interpolator", value.f5035a, EnumC1360t2.TO_STRING);
            l7.b.d(context, jSONObject, "next_page_alpha", value.f5036b);
            l7.b.d(context, jSONObject, "next_page_scale", value.f5037c);
            l7.b.d(context, jSONObject, "previous_page_alpha", value.f5038d);
            l7.b.d(context, jSONObject, "previous_page_scale", value.f5039e);
            k8.F.y(context, jSONObject, "type", "slide");
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C7) obj);
        }
    }

    /* compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class c implements D7.h, D7.i {
        public static E7 d(D7.f fVar, E7 e72, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "interpolator", D7.f5110f, zP, e72 != null ? e72.f5146a : null, EnumC1360t2.FROM_STRING, l7.e.f43877a);
            k.d dVar = l7.k.f43899d;
            AbstractC5371a<A7.b<Double>> abstractC5371a = e72 != null ? e72.f5147b : null;
            h.d dVar2 = l7.h.f43885f;
            return new E7(abstractC5371aJ, l7.c.j(fVarW, jSONObject, "next_page_alpha", dVar, zP, abstractC5371a, dVar2, D7.f5111g), l7.c.j(fVarW, jSONObject, "next_page_scale", dVar, zP, e72 != null ? e72.f5148c : null, dVar2, D7.f5112h), l7.c.j(fVarW, jSONObject, "previous_page_alpha", dVar, zP, e72 != null ? e72.f5149d : null, dVar2, D7.i), l7.c.j(fVarW, jSONObject, "previous_page_scale", dVar, zP, e72 != null ? e72.f5150e : null, dVar2, D7.f5113j));
        }

        public static JSONObject e(D7.f context, E7 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.p(context, "interpolator", value.f5146a, jSONObject, EnumC1360t2.TO_STRING);
            l7.c.q(context, jSONObject, "next_page_alpha", value.f5147b);
            l7.c.q(context, jSONObject, "next_page_scale", value.f5148c);
            l7.c.q(context, jSONObject, "previous_page_alpha", value.f5149d);
            l7.c.q(context, jSONObject, "previous_page_scale", value.f5150e);
            k8.F.y(context, jSONObject, "type", "slide");
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (E7) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class d implements D7.j<JSONObject, E7, C7> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v5, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v7, types: [A7.b] */
        public static C7 b(D7.f context, E7 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            l7.i iVar = D7.f5110f;
            p9.l<String, EnumC1360t2> lVar = EnumC1360t2.FROM_STRING;
            b.C0000b c0000b = D7.f5105a;
            ?? L7 = l7.d.l(context, template.f5146a, data, "interpolator", iVar, lVar, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B4.f fVar = D7.f5111g;
            b.C0000b c0000b3 = D7.f5106b;
            ?? N8 = l7.d.n(context, template.f5147b, data, "next_page_alpha", dVar, dVar2, fVar, c0000b3);
            b.C0000b c0000b4 = N8 == 0 ? c0000b3 : N8;
            B4.g gVar = D7.f5112h;
            b.C0000b c0000b5 = D7.f5107c;
            ?? N10 = l7.d.n(context, template.f5148c, data, "next_page_scale", dVar, dVar2, gVar, c0000b5);
            b.C0000b c0000b6 = N10 == 0 ? c0000b5 : N10;
            B4.h hVar = D7.i;
            b.C0000b c0000b7 = D7.f5108d;
            ?? N11 = l7.d.n(context, template.f5149d, data, "previous_page_alpha", dVar, dVar2, hVar, c0000b7);
            b.C0000b c0000b8 = N11 == 0 ? c0000b7 : N11;
            B4.i iVar2 = D7.f5113j;
            b.C0000b c0000b9 = D7.f5109e;
            ?? N12 = l7.d.n(context, template.f5150e, data, "previous_page_scale", dVar, dVar2, iVar2, c0000b9);
            return new C7(c0000b2, c0000b4, c0000b6, c0000b8, N12 == 0 ? c0000b9 : N12);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (E7) bVar, jSONObject);
        }
    }

    static {
        Object objM = C2091l.m(EnumC1360t2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f5114g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f5110f = new l7.i(objM, validator);
        f5111g = new B4.f(27);
        f5112h = new B4.g(29);
        i = new B4.h(28);
        f5113j = new B4.i(26);
    }
}
