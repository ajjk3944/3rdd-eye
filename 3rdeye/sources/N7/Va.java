package N7;

import A7.b;
import N7.C1383ub;
import N7.Ka;
import c9.C2091l;
import com.google.android.gms.common.internal.ImagesContract;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes.dex */
public final class Va {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7584a = b.a.a(La.CENTER);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final W4 f7585b = new W4(b.a.a(20L));

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7586c = b.a.a(Ka.b.EnumC0089b.NORMAL);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7587d = b.a.a(Boolean.FALSE);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7588e = b.a.a(T2.SOURCE_IN);

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final W4 f7589f = new W4(b.a.a(20L));

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final l7.i f7590g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final l7.i f7591h;

    @Deprecated
    public static final l7.i i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final G8 f7592j;

    /* compiled from: DivTextJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f7593g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof La);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f7594g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof Ka.b.EnumC0089b);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f7595g = new c(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof T2);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class d implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7596a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7596a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v14, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v18, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v5, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f7596a;
            Ka.b.a aVar = (Ka.b.a) k8.F.q(context, data, "accessibility", uc.f6945x8);
            l7.i iVar = Va.f7590g;
            p9.l<String, La> lVar = La.FROM_STRING;
            b.C0000b c0000b = Va.f7584a;
            j6.l lVar2 = l7.e.f43877a;
            ?? B10 = l7.b.b(context, data, "alignment_vertical", iVar, lVar, lVar2, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            b9.p pVar = uc.f6897t3;
            W4 w42 = (W4) k8.F.q(context, data, "height", pVar);
            if (w42 == null) {
                w42 = Va.f7585b;
            }
            W4 w43 = w42;
            kotlin.jvm.internal.l.e(w43, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            l7.i iVar2 = Va.f7591h;
            p9.l<String, Ka.b.EnumC0089b> lVar3 = Ka.b.EnumC0089b.FROM_STRING;
            b.C0000b c0000b3 = Va.f7586c;
            ?? B11 = l7.b.b(context, data, "indexing_direction", iVar2, lVar3, lVar2, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            k.a aVar2 = l7.k.f43896a;
            h.a aVar3 = l7.h.f43884e;
            b.C0000b c0000b5 = Va.f7587d;
            ?? B12 = l7.b.b(context, data, "preload_required", aVar2, aVar3, lVar2, c0000b5);
            b.C0000b c0000b6 = B12 == 0 ? c0000b5 : B12;
            A7.b bVarA = l7.b.a(context, data, "start", l7.k.f43897b, l7.h.f43886g, Va.f7592j);
            A7.b bVarB = l7.b.b(context, data, "tint_color", l7.k.f43901f, l7.h.f43881b, lVar2, null);
            l7.i iVar3 = Va.i;
            p9.l<String, T2> lVar4 = T2.FROM_STRING;
            b.C0000b c0000b7 = Va.f7588e;
            ?? B13 = l7.b.b(context, data, "tint_mode", iVar3, lVar4, lVar2, c0000b7);
            if (B13 != 0) {
                c0000b7 = B13;
            }
            A7.b bVarA2 = l7.b.a(context, data, ImagesContract.URL, l7.k.f43900e, l7.h.f43883d, lVar2);
            W4 w44 = (W4) k8.F.q(context, data, "width", pVar);
            if (w44 == null) {
                w44 = Va.f7589f;
            }
            kotlin.jvm.internal.l.e(w44, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new Ka.b(aVar, c0000b2, w43, c0000b4, c0000b6, bVarA, bVarB, c0000b7, bVarA2, w44);
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Ka.b value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f7596a;
            k8.F.z(context, jSONObject, "accessibility", value.f5701a, uc.f6945x8);
            l7.b.e(context, jSONObject, "alignment_vertical", value.f5702b, La.TO_STRING);
            W4 w42 = value.f5703c;
            b9.p pVar = uc.f6897t3;
            k8.F.z(context, jSONObject, "height", w42, pVar);
            l7.b.e(context, jSONObject, "indexing_direction", value.f5704d, Ka.b.EnumC0089b.TO_STRING);
            l7.b.d(context, jSONObject, "preload_required", value.f5705e);
            l7.b.d(context, jSONObject, "start", value.f5706f);
            l7.b.e(context, jSONObject, "tint_color", value.f5707g, l7.h.f43880a);
            l7.b.e(context, jSONObject, "tint_mode", value.f5708h, T2.TO_STRING);
            l7.b.e(context, jSONObject, ImagesContract.URL, value.i, l7.h.f43882c);
            k8.F.z(context, jSONObject, "width", value.f5709j, pVar);
            return jSONObject;
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class e implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7597a;

        public e(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7597a = component;
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
            Uc uc = this.f7597a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "accessibility", zP, null, uc.f6956y8);
            l7.i iVar = Va.f7590g;
            p9.l<String, La> lVar = La.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "alignment_vertical", iVar, zP, null, lVar, lVar2);
            b9.p pVar = uc.f6908u3;
            return new C1383ub.b(abstractC5371aH, abstractC5371aJ, l7.c.h(fVarW, jSONObject, "height", zP, null, pVar), l7.c.j(fVarW, jSONObject, "indexing_direction", Va.f7591h, zP, null, Ka.b.EnumC0089b.FROM_STRING, lVar2), l7.c.j(fVarW, jSONObject, "preload_required", l7.k.f43896a, zP, null, l7.h.f43884e, lVar2), l7.c.e(fVarW, jSONObject, "start", l7.k.f43897b, zP, null, l7.h.f43886g, Va.f7592j), l7.c.j(fVarW, jSONObject, "tint_color", l7.k.f43901f, zP, null, l7.h.f43881b, lVar2), l7.c.j(fVarW, jSONObject, "tint_mode", Va.i, zP, null, T2.FROM_STRING, lVar2), l7.c.e(fVarW, jSONObject, ImagesContract.URL, l7.k.f43900e, zP, null, l7.h.f43883d, lVar2), l7.c.h(fVarW, jSONObject, "width", zP, null, pVar));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1383ub.b value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f7597a;
            l7.c.u(context, jSONObject, "accessibility", value.f9502a, uc.f6956y8);
            l7.c.p(context, "alignment_vertical", value.f9503b, jSONObject, La.TO_STRING);
            AbstractC5371a<Y4> abstractC5371a = value.f9504c;
            b9.p pVar = uc.f6908u3;
            l7.c.u(context, jSONObject, "height", abstractC5371a, pVar);
            l7.c.p(context, "indexing_direction", value.f9505d, jSONObject, Ka.b.EnumC0089b.TO_STRING);
            l7.c.q(context, jSONObject, "preload_required", value.f9506e);
            l7.c.q(context, jSONObject, "start", value.f9507f);
            l7.c.p(context, "tint_color", value.f9508g, jSONObject, l7.h.f43880a);
            l7.c.p(context, "tint_mode", value.f9509h, jSONObject, T2.TO_STRING);
            l7.c.p(context, ImagesContract.URL, value.i, jSONObject, l7.h.f43882c);
            l7.c.u(context, jSONObject, "width", value.f9510j, pVar);
            return jSONObject;
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class f implements D7.j<JSONObject, C1383ub.b, Ka.b> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7598a;

        public f(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7598a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v11, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v15, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v9, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1383ub.b template = (C1383ub.b) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f7598a;
            Ka.b.a aVar = (Ka.b.a) l7.d.h(context, template.f9502a, data, "accessibility", uc.f6967z8, uc.f6945x8);
            l7.i iVar = Va.f7590g;
            p9.l<String, La> lVar = La.FROM_STRING;
            b.C0000b c0000b = Va.f7584a;
            ?? L7 = l7.d.l(context, template.f9503b, data, "alignment_vertical", iVar, lVar, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            AbstractC5371a<Y4> abstractC5371a = template.f9504c;
            b9.p pVar = uc.f6918v3;
            b9.p pVar2 = uc.f6897t3;
            W4 w42 = (W4) l7.d.h(context, abstractC5371a, data, "height", pVar, pVar2);
            if (w42 == null) {
                w42 = Va.f7585b;
            }
            W4 w43 = w42;
            kotlin.jvm.internal.l.e(w43, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            l7.i iVar2 = Va.f7591h;
            p9.l<String, Ka.b.EnumC0089b> lVar2 = Ka.b.EnumC0089b.FROM_STRING;
            b.C0000b c0000b3 = Va.f7586c;
            ?? L8 = l7.d.l(context, template.f9505d, data, "indexing_direction", iVar2, lVar2, c0000b3);
            b.C0000b c0000b4 = L8 == 0 ? c0000b3 : L8;
            k.a aVar2 = l7.k.f43896a;
            h.a aVar3 = l7.h.f43884e;
            b.C0000b c0000b5 = Va.f7587d;
            ?? L10 = l7.d.l(context, template.f9506e, data, "preload_required", aVar2, aVar3, c0000b5);
            b.C0000b c0000b6 = L10 == 0 ? c0000b5 : L10;
            A7.b bVarE = l7.d.e(context, template.f9507f, data, "start", l7.k.f43897b, l7.h.f43886g, Va.f7592j);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex…_TO_INT, START_VALIDATOR)");
            A7.b bVarK = l7.d.k(context, template.f9508g, data, "tint_color", l7.k.f43901f, l7.h.f43881b);
            l7.i iVar3 = Va.i;
            p9.l<String, T2> lVar3 = T2.FROM_STRING;
            b.C0000b c0000b7 = Va.f7588e;
            ?? L11 = l7.d.l(context, template.f9509h, data, "tint_mode", iVar3, lVar3, c0000b7);
            if (L11 != 0) {
                c0000b7 = L11;
            }
            A7.b bVarD = l7.d.d(context, template.i, data, ImagesContract.URL, l7.k.f43900e, l7.h.f43883d);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
            W4 w44 = (W4) l7.d.h(context, template.f9510j, data, "width", pVar, pVar2);
            if (w44 == null) {
                w44 = Va.f7589f;
            }
            W4 w45 = w44;
            kotlin.jvm.internal.l.e(w45, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new Ka.b(aVar, c0000b2, w43, c0000b4, c0000b6, bVarE, bVarK, c0000b7, bVarD, w45);
        }
    }

    static {
        Object objM = C2091l.m(La.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f7593g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f7590g = new l7.i(objM, validator);
        Object objM2 = C2091l.m(Ka.b.EnumC0089b.values());
        kotlin.jvm.internal.l.f(objM2, "default");
        b validator2 = b.f7594g;
        kotlin.jvm.internal.l.f(validator2, "validator");
        f7591h = new l7.i(objM2, validator2);
        Object objM3 = C2091l.m(T2.values());
        kotlin.jvm.internal.l.f(objM3, "default");
        c validator3 = c.f7595g;
        kotlin.jvm.internal.l.f(validator3, "validator");
        i = new l7.i(objM3, validator3);
        f7592j = new G8(10);
    }
}
