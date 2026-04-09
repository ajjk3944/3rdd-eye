package N7;

import A7.b;
import c9.C2091l;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivPageTransformationOverlapJsonParser.kt */
/* loaded from: classes.dex */
public final class A7 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4776a = b.a.a(EnumC1360t2.EASE_IN_OUT);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4777b = b.a.a(Double.valueOf(1.0d));

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4778c = b.a.a(Double.valueOf(1.0d));

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4779d = b.a.a(Double.valueOf(1.0d));

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4780e = b.a.a(Double.valueOf(1.0d));

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4781f = b.a.a(Boolean.FALSE);

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final l7.i f4782g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final B4.g f4783h;

    @Deprecated
    public static final B4.h i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final B4.i f4784j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final F3.h f4785k;

    /* compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f4786g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1360t2);
        }
    }

    /* compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class b implements D7.h, D7.b {
        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public static N7.C1449z7 d(D7.f r14, org.json.JSONObject r15) throws z7.d {
            /*
                java.lang.String r0 = "context"
                kotlin.jvm.internal.l.f(r14, r0)
                java.lang.String r0 = "data"
                kotlin.jvm.internal.l.f(r15, r0)
                N7.z7 r0 = new N7.z7
                l7.i r4 = N7.A7.f4782g
                p9.l<java.lang.String, N7.t2> r5 = N7.EnumC1360t2.FROM_STRING
                A7.b$b r7 = N7.A7.f4776a
                j6.l r6 = l7.e.f43877a
                java.lang.String r3 = "interpolator"
                r1 = r14
                r2 = r15
                A7.b r3 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                r8 = r6
                if (r3 != 0) goto L21
                r9 = r7
                goto L22
            L21:
                r9 = r3
            L22:
                l7.k$d r4 = l7.k.f43899d
                l7.h$d r5 = l7.h.f43885f
                B4.g r6 = N7.A7.f4783h
                A7.b$b r7 = N7.A7.f4777b
                java.lang.String r3 = "next_page_alpha"
                r1 = r14
                r2 = r15
                A7.b r3 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L36
                r10 = r7
                goto L37
            L36:
                r10 = r3
            L37:
                B4.h r6 = N7.A7.i
                A7.b$b r7 = N7.A7.f4778c
                java.lang.String r3 = "next_page_scale"
                r1 = r14
                r2 = r15
                A7.b r3 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L47
                r11 = r7
                goto L48
            L47:
                r11 = r3
            L48:
                B4.i r6 = N7.A7.f4784j
                A7.b$b r7 = N7.A7.f4779d
                java.lang.String r3 = "previous_page_alpha"
                r1 = r14
                r2 = r15
                A7.b r3 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L58
                r12 = r7
                goto L59
            L58:
                r12 = r3
            L59:
                F3.h r6 = N7.A7.f4785k
                A7.b$b r7 = N7.A7.f4780e
                java.lang.String r3 = "previous_page_scale"
                r1 = r14
                r2 = r15
                A7.b r3 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L69
                r13 = r7
                goto L6a
            L69:
                r13 = r3
            L6a:
                l7.k$a r4 = l7.k.f43896a
                l7.h$a r5 = l7.h.f43884e
                A7.b$b r7 = N7.A7.f4781f
                java.lang.String r3 = "reversed_stacking_order"
                r1 = r14
                r2 = r15
                r6 = r8
                A7.b r1 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                if (r1 != 0) goto L82
                r1 = r0
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                goto L89
            L82:
                r7 = r1
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r1 = r0
            L89:
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: N7.A7.b.d(D7.f, org.json.JSONObject):N7.z7");
        }

        public static JSONObject e(D7.f context, C1449z7 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.e(context, jSONObject, "interpolator", value.f10095a, EnumC1360t2.TO_STRING);
            l7.b.d(context, jSONObject, "next_page_alpha", value.f10096b);
            l7.b.d(context, jSONObject, "next_page_scale", value.f10097c);
            l7.b.d(context, jSONObject, "previous_page_alpha", value.f10098d);
            l7.b.d(context, jSONObject, "previous_page_scale", value.f10099e);
            l7.b.d(context, jSONObject, "reversed_stacking_order", value.f10100f);
            k8.F.y(context, jSONObject, "type", "overlap");
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C1449z7) obj);
        }
    }

    /* compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class c implements D7.h, D7.i {
        public static B7 d(D7.f fVar, B7 b72, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            l7.i iVar = A7.f4782g;
            AbstractC5371a<A7.b<EnumC1360t2>> abstractC5371a = b72 != null ? b72.f4908a : null;
            p9.l<String, EnumC1360t2> lVar = EnumC1360t2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "interpolator", iVar, zP, abstractC5371a, lVar, lVar2);
            k.d dVar = l7.k.f43899d;
            AbstractC5371a<A7.b<Double>> abstractC5371a2 = b72 != null ? b72.f4909b : null;
            h.d dVar2 = l7.h.f43885f;
            return new B7(abstractC5371aJ, l7.c.j(fVarW, jSONObject, "next_page_alpha", dVar, zP, abstractC5371a2, dVar2, A7.f4783h), l7.c.j(fVarW, jSONObject, "next_page_scale", dVar, zP, b72 != null ? b72.f4910c : null, dVar2, A7.i), l7.c.j(fVarW, jSONObject, "previous_page_alpha", dVar, zP, b72 != null ? b72.f4911d : null, dVar2, A7.f4784j), l7.c.j(fVarW, jSONObject, "previous_page_scale", dVar, zP, b72 != null ? b72.f4912e : null, dVar2, A7.f4785k), l7.c.j(fVarW, jSONObject, "reversed_stacking_order", l7.k.f43896a, zP, b72 != null ? b72.f4913f : null, l7.h.f43884e, lVar2));
        }

        public static JSONObject e(D7.f context, B7 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.p(context, "interpolator", value.f4908a, jSONObject, EnumC1360t2.TO_STRING);
            l7.c.q(context, jSONObject, "next_page_alpha", value.f4909b);
            l7.c.q(context, jSONObject, "next_page_scale", value.f4910c);
            l7.c.q(context, jSONObject, "previous_page_alpha", value.f4911d);
            l7.c.q(context, jSONObject, "previous_page_scale", value.f4912e);
            l7.c.q(context, jSONObject, "reversed_stacking_order", value.f4913f);
            k8.F.y(context, jSONObject, "type", "overlap");
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (B7) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class d implements D7.j<JSONObject, B7, C1449z7> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v5, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v7, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v9, types: [A7.b] */
        public static C1449z7 b(D7.f context, B7 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            l7.i iVar = A7.f4782g;
            p9.l<String, EnumC1360t2> lVar = EnumC1360t2.FROM_STRING;
            b.C0000b c0000b = A7.f4776a;
            ?? L7 = l7.d.l(context, template.f4908a, data, "interpolator", iVar, lVar, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B4.g gVar = A7.f4783h;
            b.C0000b c0000b3 = A7.f4777b;
            ?? N8 = l7.d.n(context, template.f4909b, data, "next_page_alpha", dVar, dVar2, gVar, c0000b3);
            b.C0000b c0000b4 = N8 == 0 ? c0000b3 : N8;
            B4.h hVar = A7.i;
            b.C0000b c0000b5 = A7.f4778c;
            ?? N10 = l7.d.n(context, template.f4910c, data, "next_page_scale", dVar, dVar2, hVar, c0000b5);
            b.C0000b c0000b6 = N10 == 0 ? c0000b5 : N10;
            B4.i iVar2 = A7.f4784j;
            b.C0000b c0000b7 = A7.f4779d;
            ?? N11 = l7.d.n(context, template.f4911d, data, "previous_page_alpha", dVar, dVar2, iVar2, c0000b7);
            b.C0000b c0000b8 = N11 == 0 ? c0000b7 : N11;
            F3.h hVar2 = A7.f4785k;
            b.C0000b c0000b9 = A7.f4780e;
            ?? N12 = l7.d.n(context, template.f4912e, data, "previous_page_scale", dVar, dVar2, hVar2, c0000b9);
            if (N12 != 0) {
                c0000b9 = N12;
            }
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b10 = A7.f4781f;
            ?? L8 = l7.d.l(context, template.f4913f, data, "reversed_stacking_order", aVar, aVar2, c0000b10);
            if (L8 != 0) {
                c0000b10 = L8;
            }
            return new C1449z7(c0000b2, c0000b4, c0000b6, c0000b8, c0000b9, c0000b10);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (B7) bVar, jSONObject);
        }
    }

    static {
        Object objM = C2091l.m(EnumC1360t2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f4786g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f4782g = new l7.i(objM, validator);
        f4783h = new B4.g(28);
        i = new B4.h(27);
        f4784j = new B4.i(25);
        f4785k = new F3.h(27);
    }
}
