package N7;

import A7.b;
import N7.C9;
import c9.C2091l;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivCustomJsonParser.kt */
/* loaded from: classes.dex */
public final class S3 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f6180a = new b.C0000b(Double.valueOf(1.0d));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final C9.c f6181b = new C9.c(new C1412wc(null, null, null));

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f6182c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final C9.b f6183d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final l7.i f6184e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final l7.i f6185f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final l7.i f6186g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final B4.f f6187h;

    @Deprecated
    public static final B4.g i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final B4.h f6188j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final B4.i f6189k;

    /* compiled from: DivCustomJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f6190g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1305p2);
        }
    }

    /* compiled from: DivCustomJsonParser.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f6191g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1319q2);
        }
    }

    /* compiled from: DivCustomJsonParser.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f6192g = new c(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1356sc);
        }
    }

    /* compiled from: DivCustomJsonParser.kt */
    public static final class d implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6193a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6193a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v41, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v7, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final R3 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f6193a;
            C1130d0 c1130d0 = (C1130d0) k8.F.q(context, data, "accessibility", uc.f6479H);
            l7.i iVar = S3.f6184e;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "alignment_horizontal", iVar, lVar, lVar2, null);
            A7.b bVarB2 = l7.b.b(context, data, "alignment_vertical", S3.f6185f, EnumC1319q2.FROM_STRING, lVar2, null);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B4.f fVar = S3.f6187h;
            b.C0000b c0000b = S3.f6180a;
            ?? B10 = l7.b.b(context, data, "alpha", dVar, dVar2, fVar, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            List listS = k8.F.s(context, data, "animators", uc.f6863q1);
            List listS2 = k8.F.s(context, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6429C1);
            X2 x22 = (X2) k8.F.q(context, data, "border", uc.f6492I1);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarB3 = l7.b.b(context, data, "column_span", eVar, eVar2, S3.i, null);
            A8.d dVar3 = l7.e.f43878b;
            JSONObject jSONObject = (JSONObject) k8.F.r(context, data, "custom_props", dVar3, lVar2);
            Object objOpt = data.opt("custom_type");
            if (objOpt == JSONObject.NULL) {
                objOpt = null;
            }
            if (objOpt == null) {
                throw z7.e.g("custom_type", data);
            }
            String str = (String) objOpt;
            List listS3 = k8.F.s(context, data, "disappear_actions", uc.f6535M2);
            List listS4 = k8.F.s(context, data, "extensions", uc.f6662Y2);
            Z4 z42 = (Z4) k8.F.q(context, data, "focus", uc.f6929w3);
            List listS5 = k8.F.s(context, data, "functions", uc.f6463F3);
            b9.p pVar = uc.f6602S6;
            C9 c92 = (C9) k8.F.q(context, data, "height", pVar);
            if (c92 == null) {
                c92 = S3.f6181b;
            }
            kotlin.jvm.internal.l.e(c92, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) k8.F.r(context, data, FacebookMediationAdapter.KEY_ID, dVar3, lVar2);
            List listS6 = k8.F.s(context, data, "items", uc.f6935w9);
            L6 l62 = (L6) k8.F.q(context, data, "layout_provider", uc.f6506J4);
            b9.p pVar2 = uc.f6630V2;
            C1362t4 c1362t4 = (C1362t4) k8.F.q(context, data, "margins", pVar2);
            C1362t4 c1362t42 = (C1362t4) k8.F.q(context, data, "paddings", pVar2);
            C9 c93 = c92;
            A7.b bVarB4 = l7.b.b(context, data, "reuse_id", l7.k.f43898c, dVar3, lVar2, null);
            A7.b bVarB5 = l7.b.b(context, data, "row_span", eVar, eVar2, S3.f6188j, null);
            List listS7 = k8.F.s(context, data, "selected_actions", uc.f6766h1);
            List listS8 = k8.F.s(context, data, "tooltips", uc.f6572P8);
            Qb qb = (Qb) k8.F.q(context, data, "transform", uc.f6604S8);
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) k8.F.q(context, data, "transition_change", uc.f6586R1);
            b9.p pVar3 = uc.f6927w1;
            F2 f22 = (F2) k8.F.q(context, data, "transition_in", pVar3);
            F2 f23 = (F2) k8.F.q(context, data, "transition_out", pVar3);
            List listU = k8.F.u(context, data, "transition_triggers", Ub.FROM_STRING, S3.f6189k);
            List listS9 = k8.F.s(context, data, "variable_triggers", uc.f6636V8);
            List listS10 = k8.F.s(context, data, "variables", uc.f6703b9);
            l7.i iVar2 = S3.f6186g;
            p9.l<String, EnumC1356sc> lVar3 = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b3 = S3.f6182c;
            ?? B11 = l7.b.b(context, data, "visibility", iVar2, lVar3, lVar2, c0000b3);
            if (B11 != 0) {
                c0000b3 = B11;
            }
            b9.p pVar4 = uc.n9;
            C1370tc c1370tc = (C1370tc) k8.F.q(context, data, "visibility_action", pVar4);
            List listS11 = k8.F.s(context, data, "visibility_actions", pVar4);
            C9 c94 = (C9) k8.F.q(context, data, "width", pVar);
            if (c94 == null) {
                c94 = S3.f6183d;
            }
            kotlin.jvm.internal.l.e(c94, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new R3(c1130d0, bVarB, bVarB2, c0000b2, listS, listS2, x22, bVarB3, jSONObject, str, listS3, listS4, z42, listS5, c93, str2, listS6, l62, c1362t4, c1362t42, bVarB4, bVarB5, listS7, listS8, qb, abstractC1178g3, f22, f23, listU, listS9, listS10, c0000b3, c1370tc, listS11, c94);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, R3 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f6193a;
            k8.F.z(context, jSONObject, "accessibility", value.f6124a, uc.f6479H);
            l7.b.e(context, jSONObject, "alignment_horizontal", value.f6125b, EnumC1305p2.TO_STRING);
            l7.b.e(context, jSONObject, "alignment_vertical", value.f6126c, EnumC1319q2.TO_STRING);
            l7.b.d(context, jSONObject, "alpha", value.f6127d);
            k8.F.B(context, jSONObject, "animators", value.f6128e, uc.f6863q1);
            k8.F.B(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f6129f, uc.f6429C1);
            k8.F.z(context, jSONObject, "border", value.f6130g, uc.f6492I1);
            l7.b.d(context, jSONObject, "column_span", value.f6131h);
            k8.F.y(context, jSONObject, "custom_props", value.i);
            k8.F.y(context, jSONObject, "custom_type", value.f6132j);
            k8.F.B(context, jSONObject, "disappear_actions", value.f6133k, uc.f6535M2);
            k8.F.B(context, jSONObject, "extensions", value.f6134l, uc.f6662Y2);
            k8.F.z(context, jSONObject, "focus", value.f6135m, uc.f6929w3);
            k8.F.B(context, jSONObject, "functions", value.f6136n, uc.f6463F3);
            C9 c92 = value.f6137o;
            b9.p pVar = uc.f6602S6;
            k8.F.z(context, jSONObject, "height", c92, pVar);
            k8.F.y(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f6138p);
            k8.F.B(context, jSONObject, "items", value.f6139q, uc.f6935w9);
            k8.F.z(context, jSONObject, "layout_provider", value.f6140r, uc.f6506J4);
            C1362t4 c1362t4 = value.f6141s;
            b9.p pVar2 = uc.f6630V2;
            k8.F.z(context, jSONObject, "margins", c1362t4, pVar2);
            k8.F.z(context, jSONObject, "paddings", value.f6142t, pVar2);
            l7.b.d(context, jSONObject, "reuse_id", value.f6143u);
            l7.b.d(context, jSONObject, "row_span", value.f6144v);
            k8.F.B(context, jSONObject, "selected_actions", value.f6145w, uc.f6766h1);
            k8.F.B(context, jSONObject, "tooltips", value.f6146x, uc.f6572P8);
            k8.F.z(context, jSONObject, "transform", value.f6147y, uc.f6604S8);
            k8.F.z(context, jSONObject, "transition_change", value.f6148z, uc.f6586R1);
            F2 f22 = value.f6113A;
            b9.p pVar3 = uc.f6927w1;
            k8.F.z(context, jSONObject, "transition_in", f22, pVar3);
            k8.F.z(context, jSONObject, "transition_out", value.f6114B, pVar3);
            k8.F.C(context, jSONObject, value.f6115C, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "custom");
            k8.F.B(context, jSONObject, "variable_triggers", value.f6116D, uc.f6636V8);
            k8.F.B(context, jSONObject, "variables", value.f6117E, uc.f6703b9);
            l7.b.e(context, jSONObject, "visibility", value.f6118F, EnumC1356sc.TO_STRING);
            C1370tc c1370tc = value.f6119G;
            b9.p pVar4 = uc.n9;
            k8.F.z(context, jSONObject, "visibility_action", c1370tc, pVar4);
            k8.F.B(context, jSONObject, "visibility_actions", value.f6120H, pVar4);
            k8.F.z(context, jSONObject, "width", value.f6121I, pVar);
            return jSONObject;
        }
    }

    /* compiled from: DivCustomJsonParser.kt */
    public static final class e implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6194a;

        public e(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6194a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final T3 d(D7.f fVar, T3 t32, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a<C1160f0> abstractC5371a = t32 != null ? t32.f6235a : null;
            Uc uc = this.f6194a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "accessibility", zP, abstractC5371a, uc.f6490I);
            l7.i iVar = S3.f6184e;
            AbstractC5371a<A7.b<EnumC1305p2>> abstractC5371a2 = t32 != null ? t32.f6236b : null;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "alignment_horizontal", iVar, zP, abstractC5371a2, lVar, lVar2);
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "alignment_vertical", S3.f6185f, zP, t32 != null ? t32.f6237c : null, EnumC1319q2.FROM_STRING, lVar2);
            AbstractC5371a abstractC5371aJ3 = l7.c.j(fVarW, jSONObject, "alpha", l7.k.f43899d, zP, t32 != null ? t32.f6238d : null, l7.h.f43885f, S3.f6187h);
            AbstractC5371a abstractC5371aK = l7.c.k(fVarW, jSONObject, "animators", zP, t32 != null ? t32.f6239e : null, uc.f6874r1);
            AbstractC5371a abstractC5371aK2 = l7.c.k(fVarW, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, zP, t32 != null ? t32.f6240f : null, uc.f6440D1);
            AbstractC5371a abstractC5371aH2 = l7.c.h(fVarW, jSONObject, "border", zP, t32 != null ? t32.f6241g : null, uc.f6503J1);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a3 = t32 != null ? t32.f6242h : null;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aJ4 = l7.c.j(fVarW, jSONObject, "column_span", eVar, zP, abstractC5371a3, eVar2, S3.i);
            AbstractC5371a<JSONObject> abstractC5371a4 = t32 != null ? t32.i : null;
            A8.d dVar = l7.e.f43878b;
            AbstractC5371a abstractC5371aI = l7.c.i(fVarW, jSONObject, "custom_props", zP, abstractC5371a4, dVar);
            AbstractC5371a abstractC5371aA = l7.c.a(fVarW, jSONObject, "custom_type", zP, t32 != null ? t32.f6243j : null);
            AbstractC5371a abstractC5371aK3 = l7.c.k(fVarW, jSONObject, "disappear_actions", zP, t32 != null ? t32.f6244k : null, uc.f6545N2);
            AbstractC5371a abstractC5371aK4 = l7.c.k(fVarW, jSONObject, "extensions", zP, t32 != null ? t32.f6245l : null, uc.f6673Z2);
            AbstractC5371a abstractC5371aH3 = l7.c.h(fVarW, jSONObject, "focus", zP, t32 != null ? t32.f6246m : null, uc.f6940x3);
            AbstractC5371a abstractC5371aK5 = l7.c.k(fVarW, jSONObject, "functions", zP, t32 != null ? t32.f6247n : null, uc.f6474G3);
            AbstractC5371a abstractC5371aH4 = l7.c.h(fVarW, jSONObject, "height", zP, t32 != null ? t32.f6248o : null, uc.f6613T6);
            AbstractC5371a abstractC5371aI2 = l7.c.i(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, zP, t32 != null ? t32.f6249p : null, dVar);
            AbstractC5371a abstractC5371aK6 = l7.c.k(fVarW, jSONObject, "items", zP, t32 != null ? t32.f6250q : null, uc.f6946x9);
            AbstractC5371a abstractC5371aH5 = l7.c.h(fVarW, jSONObject, "layout_provider", zP, t32 != null ? t32.f6251r : null, uc.f6517K4);
            AbstractC5371a abstractC5371aH6 = l7.c.h(fVarW, jSONObject, "margins", zP, t32 != null ? t32.f6252s : null, uc.f6641W2);
            AbstractC5371a abstractC5371aH7 = l7.c.h(fVarW, jSONObject, "paddings", zP, t32 != null ? t32.f6253t : null, uc.f6641W2);
            AbstractC5371a abstractC5371aJ5 = l7.c.j(fVarW, jSONObject, "reuse_id", l7.k.f43898c, zP, t32 != null ? t32.f6254u : null, dVar, lVar2);
            AbstractC5371a abstractC5371aJ6 = l7.c.j(fVarW, jSONObject, "row_span", eVar, zP, t32 != null ? t32.f6255v : null, eVar2, S3.f6188j);
            AbstractC5371a abstractC5371aK7 = l7.c.k(fVarW, jSONObject, "selected_actions", zP, t32 != null ? t32.f6256w : null, uc.f6777i1);
            AbstractC5371a abstractC5371aK8 = l7.c.k(fVarW, jSONObject, "tooltips", zP, t32 != null ? t32.f6257x : null, uc.f6582Q8);
            AbstractC5371a abstractC5371aH8 = l7.c.h(fVarW, jSONObject, "transform", zP, t32 != null ? t32.f6258y : null, uc.f6615T8);
            AbstractC5371a abstractC5371aH9 = l7.c.h(fVarW, jSONObject, "transition_change", zP, t32 != null ? t32.f6259z : null, uc.f6597S1);
            AbstractC5371a abstractC5371aH10 = l7.c.h(fVarW, jSONObject, "transition_in", zP, t32 != null ? t32.f6226A : null, uc.f6938x1);
            AbstractC5371a abstractC5371aH11 = l7.c.h(fVarW, jSONObject, "transition_out", zP, t32 != null ? t32.f6227B : null, uc.f6938x1);
            AbstractC5371a<List<Ub>> abstractC5371a5 = t32 != null ? t32.f6228C : null;
            p9.l<String, Ub> lVar3 = Ub.FROM_STRING;
            B4.i iVar2 = S3.f6189k;
            kotlin.jvm.internal.l.d(iVar2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new T3(abstractC5371aH, abstractC5371aJ, abstractC5371aJ2, abstractC5371aJ3, abstractC5371aK, abstractC5371aK2, abstractC5371aH2, abstractC5371aJ4, abstractC5371aI, abstractC5371aA, abstractC5371aK3, abstractC5371aK4, abstractC5371aH3, abstractC5371aK5, abstractC5371aH4, abstractC5371aI2, abstractC5371aK6, abstractC5371aH5, abstractC5371aH6, abstractC5371aH7, abstractC5371aJ5, abstractC5371aJ6, abstractC5371aK7, abstractC5371aK8, abstractC5371aH8, abstractC5371aH9, abstractC5371aH10, abstractC5371aH11, l7.c.m(fVarW, jSONObject, zP, abstractC5371a5, lVar3, iVar2), l7.c.k(fVarW, jSONObject, "variable_triggers", zP, t32 != null ? t32.f6229D : null, uc.f6647W8), l7.c.k(fVarW, jSONObject, "variables", zP, t32 != null ? t32.f6230E : null, uc.f6715c9), l7.c.j(fVarW, jSONObject, "visibility", S3.f6186g, zP, t32 != null ? t32.f6231F : null, EnumC1356sc.FROM_STRING, lVar2), l7.c.h(fVarW, jSONObject, "visibility_action", zP, t32 != null ? t32.f6232G : null, uc.f6849o9), l7.c.k(fVarW, jSONObject, "visibility_actions", zP, t32 != null ? t32.f6233H : null, uc.f6849o9), l7.c.h(fVarW, jSONObject, "width", zP, t32 != null ? t32.f6234I : null, uc.f6613T6));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, T3 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f6194a;
            l7.c.u(context, jSONObject, "accessibility", value.f6235a, uc.f6490I);
            l7.c.p(context, "alignment_horizontal", value.f6236b, jSONObject, EnumC1305p2.TO_STRING);
            l7.c.p(context, "alignment_vertical", value.f6237c, jSONObject, EnumC1319q2.TO_STRING);
            l7.c.q(context, jSONObject, "alpha", value.f6238d);
            l7.c.v(context, jSONObject, "animators", value.f6239e, uc.f6874r1);
            l7.c.v(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f6240f, uc.f6440D1);
            l7.c.u(context, jSONObject, "border", value.f6241g, uc.f6503J1);
            l7.c.q(context, jSONObject, "column_span", value.f6242h);
            l7.c.t(context, jSONObject, "custom_props", value.i);
            l7.c.t(context, jSONObject, "custom_type", value.f6243j);
            l7.c.v(context, jSONObject, "disappear_actions", value.f6244k, uc.f6545N2);
            l7.c.v(context, jSONObject, "extensions", value.f6245l, uc.f6673Z2);
            l7.c.u(context, jSONObject, "focus", value.f6246m, uc.f6940x3);
            l7.c.v(context, jSONObject, "functions", value.f6247n, uc.f6474G3);
            AbstractC5371a<G9> abstractC5371a = value.f6248o;
            b9.p pVar = uc.f6613T6;
            l7.c.u(context, jSONObject, "height", abstractC5371a, pVar);
            l7.c.t(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f6249p);
            l7.c.v(context, jSONObject, "items", value.f6250q, uc.f6946x9);
            l7.c.u(context, jSONObject, "layout_provider", value.f6251r, uc.f6517K4);
            AbstractC5371a<C1390v4> abstractC5371a2 = value.f6252s;
            b9.p pVar2 = uc.f6641W2;
            l7.c.u(context, jSONObject, "margins", abstractC5371a2, pVar2);
            l7.c.u(context, jSONObject, "paddings", value.f6253t, pVar2);
            l7.c.q(context, jSONObject, "reuse_id", value.f6254u);
            l7.c.q(context, jSONObject, "row_span", value.f6255v);
            l7.c.v(context, jSONObject, "selected_actions", value.f6256w, uc.f6777i1);
            l7.c.v(context, jSONObject, "tooltips", value.f6257x, uc.f6582Q8);
            l7.c.u(context, jSONObject, "transform", value.f6258y, uc.f6615T8);
            l7.c.u(context, jSONObject, "transition_change", value.f6259z, uc.f6597S1);
            AbstractC5371a<J2> abstractC5371a3 = value.f6226A;
            b9.p pVar3 = uc.f6938x1;
            l7.c.u(context, jSONObject, "transition_in", abstractC5371a3, pVar3);
            l7.c.u(context, jSONObject, "transition_out", value.f6227B, pVar3);
            l7.c.w(context, jSONObject, value.f6228C, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "custom");
            l7.c.v(context, jSONObject, "variable_triggers", value.f6229D, uc.f6647W8);
            l7.c.v(context, jSONObject, "variables", value.f6230E, uc.f6715c9);
            l7.c.p(context, "visibility", value.f6231F, jSONObject, EnumC1356sc.TO_STRING);
            AbstractC5371a<C1398vc> abstractC5371a4 = value.f6232G;
            b9.p pVar4 = uc.f6849o9;
            l7.c.u(context, jSONObject, "visibility_action", abstractC5371a4, pVar4);
            l7.c.v(context, jSONObject, "visibility_actions", value.f6233H, pVar4);
            l7.c.u(context, jSONObject, "width", value.f6234I, pVar);
            return jSONObject;
        }
    }

    /* compiled from: DivCustomJsonParser.kt */
    public static final class f implements D7.j<JSONObject, T3, R3> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6195a;

        public f(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6195a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v50, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v8, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final R3 a(D7.f context, T3 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f6195a;
            C1130d0 c1130d0 = (C1130d0) l7.d.h(context, template.f6235a, data, "accessibility", uc.f6501J, uc.f6479H);
            A7.b bVarK = l7.d.k(context, template.f6236b, data, "alignment_horizontal", S3.f6184e, EnumC1305p2.FROM_STRING);
            A7.b bVarK2 = l7.d.k(context, template.f6237c, data, "alignment_vertical", S3.f6185f, EnumC1319q2.FROM_STRING);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B4.f fVar = S3.f6187h;
            b.C0000b c0000b = S3.f6180a;
            ?? N8 = l7.d.n(context, template.f6238d, data, "alpha", dVar, dVar2, fVar, c0000b);
            if (N8 != 0) {
                c0000b = N8;
            }
            List listQ = l7.d.q(context, template.f6239e, data, "animators", uc.f6884s1, uc.f6863q1);
            List listQ2 = l7.d.q(context, template.f6240f, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6451E1, uc.f6429C1);
            X2 x22 = (X2) l7.d.h(context, template.f6241g, data, "border", uc.f6514K1, uc.f6492I1);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarM = l7.d.m(context, template.f6242h, data, "column_span", eVar, eVar2, S3.i);
            AbstractC5371a<JSONObject> abstractC5371a = template.i;
            A8.d dVar3 = l7.e.f43878b;
            JSONObject jSONObject = (JSONObject) l7.d.g(context, "custom_props", abstractC5371a, data, dVar3);
            Object objB = l7.d.b(template.f6243j, data, "custom_type", dVar3, l7.e.f43877a);
            kotlin.jvm.internal.l.e(objB, "resolve(context, templat…ype, data, \"custom_type\")");
            String str = (String) objB;
            List listQ3 = l7.d.q(context, template.f6244k, data, "disappear_actions", uc.f6555O2, uc.f6535M2);
            List listQ4 = l7.d.q(context, template.f6245l, data, "extensions", uc.f6685a3, uc.f6662Y2);
            Z4 z42 = (Z4) l7.d.h(context, template.f6246m, data, "focus", uc.f6951y3, uc.f6929w3);
            List listQ5 = l7.d.q(context, template.f6247n, data, "functions", uc.f6483H3, uc.f6463F3);
            C9 c92 = (C9) l7.d.h(context, template.f6248o, data, "height", uc.U6, uc.f6602S6);
            if (c92 == null) {
                c92 = S3.f6181b;
            }
            kotlin.jvm.internal.l.e(c92, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) l7.d.g(context, FacebookMediationAdapter.KEY_ID, template.f6249p, data, dVar3);
            C9 c93 = c92;
            List listQ6 = l7.d.q(context, template.f6250q, data, "items", uc.f6957y9, uc.f6935w9);
            L6 l62 = (L6) l7.d.h(context, template.f6251r, data, "layout_provider", uc.f6528L4, uc.f6506J4);
            C1362t4 c1362t4 = (C1362t4) l7.d.h(context, template.f6252s, data, "margins", uc.f6652X2, uc.f6630V2);
            C1362t4 c1362t42 = (C1362t4) l7.d.h(context, template.f6253t, data, "paddings", uc.f6652X2, uc.f6630V2);
            A7.b bVarJ = l7.d.j(context, template.f6254u, data, "reuse_id", l7.k.f43898c);
            A7.b bVarM2 = l7.d.m(context, template.f6255v, data, "row_span", eVar, eVar2, S3.f6188j);
            List listQ7 = l7.d.q(context, template.f6256w, data, "selected_actions", uc.f6789j1, uc.f6766h1);
            List listQ8 = l7.d.q(context, template.f6257x, data, "tooltips", uc.f6593R8, uc.f6572P8);
            Qb qb = (Qb) l7.d.h(context, template.f6258y, data, "transform", uc.f6625U8, uc.f6604S8);
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) l7.d.h(context, template.f6259z, data, "transition_change", uc.f6608T1, uc.f6586R1);
            F2 f22 = (F2) l7.d.h(context, template.f6226A, data, "transition_in", uc.f6949y1, uc.f6927w1);
            F2 f23 = (F2) l7.d.h(context, template.f6227B, data, "transition_out", uc.f6949y1, uc.f6927w1);
            List listR = l7.d.r(context, template.f6228C, data, Ub.FROM_STRING, S3.f6189k);
            List listQ9 = l7.d.q(context, template.f6229D, data, "variable_triggers", uc.f6657X8, uc.f6636V8);
            List listQ10 = l7.d.q(context, template.f6230E, data, "variables", uc.f6727d9, uc.f6703b9);
            l7.i iVar = S3.f6186g;
            p9.l<String, EnumC1356sc> lVar = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b2 = S3.f6182c;
            ?? L7 = l7.d.l(context, template.f6231F, data, "visibility", iVar, lVar, c0000b2);
            if (L7 != 0) {
                c0000b2 = L7;
            }
            C1370tc c1370tc = (C1370tc) l7.d.h(context, template.f6232G, data, "visibility_action", uc.f6860p9, uc.n9);
            List listQ11 = l7.d.q(context, template.f6233H, data, "visibility_actions", uc.f6860p9, uc.n9);
            C9 c94 = (C9) l7.d.h(context, template.f6234I, data, "width", uc.U6, uc.f6602S6);
            if (c94 == null) {
                c94 = S3.f6183d;
            }
            kotlin.jvm.internal.l.e(c94, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new R3(c1130d0, bVarK, bVarK2, c0000b, listQ, listQ2, x22, bVarM, jSONObject, str, listQ3, listQ4, z42, listQ5, c93, str2, listQ6, l62, c1362t4, c1362t42, bVarJ, bVarM2, listQ7, listQ8, qb, abstractC1178g3, f22, f23, listR, listQ9, listQ10, c0000b2, c1370tc, listQ11, c94);
        }
    }

    static {
        EnumC1356sc value = EnumC1356sc.VISIBLE;
        kotlin.jvm.internal.l.f(value, "value");
        f6182c = new b.C0000b(value);
        f6183d = new C9.b(new V6(null));
        Object objM = C2091l.m(EnumC1305p2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f6190g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f6184e = new l7.i(objM, validator);
        Object objM2 = C2091l.m(EnumC1319q2.values());
        kotlin.jvm.internal.l.f(objM2, "default");
        b validator2 = b.f6191g;
        kotlin.jvm.internal.l.f(validator2, "validator");
        f6185f = new l7.i(objM2, validator2);
        Object objM3 = C2091l.m(EnumC1356sc.values());
        kotlin.jvm.internal.l.f(objM3, "default");
        c validator3 = c.f6192g;
        kotlin.jvm.internal.l.f(validator3, "validator");
        f6186g = new l7.i(objM3, validator3);
        f6187h = new B4.f(13);
        i = new B4.g(14);
        f6188j = new B4.h(13);
        f6189k = new B4.i(13);
    }
}
