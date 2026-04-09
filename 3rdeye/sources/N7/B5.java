package N7;

import A7.b;
import c9.C2091l;
import java.util.List;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivImageBackgroundJsonParser.kt */
/* loaded from: classes.dex */
public final class B5 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4893a = b.a.a(Double.valueOf(1.0d));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4894b = b.a.a(EnumC1305p2.CENTER);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4895c = b.a.a(EnumC1319q2.CENTER);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4896d = b.a.a(Boolean.FALSE);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4897e = b.a.a(E5.FILL);

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final l7.i f4898f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final l7.i f4899g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final l7.i f4900h;

    @Deprecated
    public static final B4.i i;

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f4901g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1305p2);
        }
    }

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f4902g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1319q2);
        }
    }

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f4903g = new c(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof E5);
        }
    }

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class d implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f4904a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f4904a = component;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final N7.A5 a(D7.f r15, org.json.JSONObject r16) throws z7.d {
            /*
                r14 = this;
                r1 = r16
                java.lang.String r0 = "context"
                kotlin.jvm.internal.l.f(r15, r0)
                java.lang.String r0 = "data"
                kotlin.jvm.internal.l.f(r1, r0)
                N7.A5 r7 = new N7.A5
                l7.k$d r3 = l7.k.f43899d
                l7.h$d r4 = l7.h.f43885f
                B4.i r5 = N7.B5.i
                A7.b$b r6 = N7.B5.f4893a
                java.lang.String r2 = "alpha"
                r0 = r15
                A7.b r2 = l7.b.b(r0, r1, r2, r3, r4, r5, r6)
                if (r2 != 0) goto L21
                r8 = r6
                goto L22
            L21:
                r8 = r2
            L22:
                l7.i r3 = N7.B5.f4898f
                p9.l<java.lang.String, N7.p2> r4 = N7.EnumC1305p2.FROM_STRING
                A7.b$b r6 = N7.B5.f4894b
                j6.l r5 = l7.e.f43877a
                java.lang.String r2 = "content_alignment_horizontal"
                r0 = r15
                r1 = r16
                A7.b r2 = l7.b.b(r0, r1, r2, r3, r4, r5, r6)
                if (r2 != 0) goto L37
                r9 = r6
                goto L38
            L37:
                r9 = r2
            L38:
                l7.i r3 = N7.B5.f4899g
                p9.l<java.lang.String, N7.q2> r4 = N7.EnumC1319q2.FROM_STRING
                A7.b$b r6 = N7.B5.f4895c
                java.lang.String r2 = "content_alignment_vertical"
                r0 = r15
                r1 = r16
                A7.b r2 = l7.b.b(r0, r1, r2, r3, r4, r5, r6)
                if (r2 != 0) goto L4b
                r10 = r6
                goto L4c
            L4b:
                r10 = r2
            L4c:
                N7.Uc r2 = r14.f4904a
                b9.p r2 = r2.f6768h3
                java.lang.String r3 = "filters"
                java.util.List r11 = k8.F.s(r15, r1, r3, r2)
                l7.k$h r3 = l7.k.f43900e
                l7.h$b r4 = l7.h.f43883d
                java.lang.String r2 = "image_url"
                r0 = r15
                A7.b r12 = l7.b.a(r0, r1, r2, r3, r4, r5)
                l7.k$a r3 = l7.k.f43896a
                l7.h$a r4 = l7.h.f43884e
                A7.b$b r6 = N7.B5.f4896d
                java.lang.String r2 = "preload_required"
                r0 = r15
                r1 = r16
                A7.b r2 = l7.b.b(r0, r1, r2, r3, r4, r5, r6)
                if (r2 != 0) goto L74
                r13 = r6
                goto L75
            L74:
                r13 = r2
            L75:
                l7.i r3 = N7.B5.f4900h
                p9.l<java.lang.String, N7.E5> r4 = N7.E5.FROM_STRING
                A7.b$b r6 = N7.B5.f4897e
                java.lang.String r2 = "scale"
                r0 = r15
                r1 = r16
                A7.b r15 = l7.b.b(r0, r1, r2, r3, r4, r5, r6)
                r2 = r8
                if (r15 != 0) goto L8f
                r8 = r6
                r1 = r7
                r3 = r9
                r4 = r10
                r5 = r11
                r7 = r13
                r6 = r12
                goto L96
            L8f:
                r8 = r15
                r1 = r7
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
            L96:
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: N7.B5.d.a(D7.f, org.json.JSONObject):N7.A5");
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, A5 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "alpha", value.f4764a);
            l7.b.e(context, jSONObject, "content_alignment_horizontal", value.f4765b, EnumC1305p2.TO_STRING);
            l7.b.e(context, jSONObject, "content_alignment_vertical", value.f4766c, EnumC1319q2.TO_STRING);
            k8.F.B(context, jSONObject, "filters", value.f4767d, this.f4904a.f6768h3);
            l7.b.e(context, jSONObject, "image_url", value.f4768e, l7.h.f43882c);
            l7.b.d(context, jSONObject, "preload_required", value.f4769f);
            l7.b.e(context, jSONObject, "scale", value.f4770g, E5.TO_STRING);
            k8.F.y(context, jSONObject, "type", "image");
            return jSONObject;
        }
    }

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class e implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f4905a;

        public e(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f4905a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final C5 d(D7.f fVar, C5 c52, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "alpha", l7.k.f43899d, zP, c52 != null ? c52.f5023a : null, l7.h.f43885f, B5.i);
            l7.i iVar = B5.f4898f;
            AbstractC5371a<A7.b<EnumC1305p2>> abstractC5371a = c52 != null ? c52.f5024b : null;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            return new C5(abstractC5371aJ, l7.c.j(fVarW, jSONObject, "content_alignment_horizontal", iVar, zP, abstractC5371a, lVar, lVar2), l7.c.j(fVarW, jSONObject, "content_alignment_vertical", B5.f4899g, zP, c52 != null ? c52.f5025c : null, EnumC1319q2.FROM_STRING, lVar2), l7.c.k(fVarW, jSONObject, "filters", zP, c52 != null ? c52.f5026d : null, this.f4905a.f6779i3), l7.c.e(fVarW, jSONObject, "image_url", l7.k.f43900e, zP, c52 != null ? c52.f5027e : null, l7.h.f43883d, lVar2), l7.c.j(fVarW, jSONObject, "preload_required", l7.k.f43896a, zP, c52 != null ? c52.f5028f : null, l7.h.f43884e, lVar2), l7.c.j(fVarW, jSONObject, "scale", B5.f4900h, zP, c52 != null ? c52.f5029g : null, E5.FROM_STRING, lVar2));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C5 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "alpha", value.f5023a);
            l7.c.p(context, "content_alignment_horizontal", value.f5024b, jSONObject, EnumC1305p2.TO_STRING);
            l7.c.p(context, "content_alignment_vertical", value.f5025c, jSONObject, EnumC1319q2.TO_STRING);
            l7.c.v(context, jSONObject, "filters", value.f5026d, this.f4905a.f6779i3);
            l7.c.p(context, "image_url", value.f5027e, jSONObject, l7.h.f43882c);
            l7.c.q(context, jSONObject, "preload_required", value.f5028f);
            l7.c.p(context, "scale", value.f5029g, jSONObject, E5.TO_STRING);
            k8.F.y(context, jSONObject, "type", "image");
            return jSONObject;
        }
    }

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class f implements D7.j<JSONObject, C5, A5> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f4906a;

        public f(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f4906a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r14v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v7, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final A5 a(D7.f context, C5 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B4.i iVar = B5.i;
            b.C0000b c0000b = B5.f4893a;
            ?? N8 = l7.d.n(context, template.f5023a, data, "alpha", dVar, dVar2, iVar, c0000b);
            if (N8 != 0) {
                c0000b = N8;
            }
            l7.i iVar2 = B5.f4898f;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            b.C0000b c0000b2 = B5.f4894b;
            A7.b bVarL = l7.d.l(context, template.f5024b, data, "content_alignment_horizontal", iVar2, lVar, c0000b2);
            if (bVarL == null) {
                bVarL = c0000b2;
            }
            l7.i iVar3 = B5.f4899g;
            p9.l<String, EnumC1319q2> lVar2 = EnumC1319q2.FROM_STRING;
            b.C0000b c0000b3 = B5.f4895c;
            A7.b bVarL2 = l7.d.l(context, template.f5025c, data, "content_alignment_vertical", iVar3, lVar2, c0000b3);
            if (bVarL2 == null) {
                bVarL2 = c0000b3;
            }
            Uc uc = this.f4906a;
            List listQ = l7.d.q(context, template.f5026d, data, "filters", uc.f6791j3, uc.f6768h3);
            A7.b bVarD = l7.d.d(context, template.f5027e, data, "image_url", l7.k.f43900e, l7.h.f43883d);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b4 = B5.f4896d;
            ?? L7 = l7.d.l(context, template.f5028f, data, "preload_required", aVar, aVar2, c0000b4);
            b.C0000b c0000b5 = L7 == 0 ? c0000b4 : L7;
            l7.i iVar4 = B5.f4900h;
            p9.l<String, E5> lVar3 = E5.FROM_STRING;
            b.C0000b c0000b6 = B5.f4897e;
            ?? L8 = l7.d.l(context, template.f5029g, data, "scale", iVar4, lVar3, c0000b6);
            if (L8 != 0) {
                c0000b6 = L8;
            }
            return new A5(c0000b, bVarL, bVarL2, listQ, bVarD, c0000b5, c0000b6);
        }
    }

    static {
        Object objM = C2091l.m(EnumC1305p2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f4901g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f4898f = new l7.i(objM, validator);
        Object objM2 = C2091l.m(EnumC1319q2.values());
        kotlin.jvm.internal.l.f(objM2, "default");
        b validator2 = b.f4902g;
        kotlin.jvm.internal.l.f(validator2, "validator");
        f4899g = new l7.i(objM2, validator2);
        Object objM3 = C2091l.m(E5.values());
        kotlin.jvm.internal.l.f(objM3, "default");
        c validator3 = c.f4903g;
        kotlin.jvm.internal.l.f(validator3, "validator");
        f4900h = new l7.i(objM3, validator3);
        i = new B4.i(20);
    }
}
