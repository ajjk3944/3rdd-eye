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

/* compiled from: DivSwitchJsonParser.kt */
/* renamed from: N7.za, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1452za {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f10104a = b.a.a(Double.valueOf(1.0d));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final C9.c f10105b = new C9.c(new C1412wc(null, null, null));

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f10106c = b.a.a(Boolean.TRUE);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f10107d = b.a.a(EnumC1356sc.VISIBLE);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final C9.b f10108e = new C9.b(new V6(null));

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final l7.i f10109f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final l7.i f10110g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final l7.i f10111h;

    @Deprecated
    public static final G8 i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final C1094a9 f10112j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final H7 f10113k;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final B8 f10114l;

    /* compiled from: DivSwitchJsonParser.kt */
    /* renamed from: N7.za$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f10115g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1305p2);
        }
    }

    /* compiled from: DivSwitchJsonParser.kt */
    /* renamed from: N7.za$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f10116g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1319q2);
        }
    }

    /* compiled from: DivSwitchJsonParser.kt */
    /* renamed from: N7.za$c */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f10117g = new c(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1356sc);
        }
    }

    /* compiled from: DivSwitchJsonParser.kt */
    /* renamed from: N7.za$d */
    public static final class d implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f10118a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f10118a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v23, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v49, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v7, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C1438ya a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f10118a;
            C1130d0 c1130d0 = (C1130d0) k8.F.q(context, data, "accessibility", uc.f6479H);
            l7.i iVar = C1452za.f10109f;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "alignment_horizontal", iVar, lVar, lVar2, null);
            A7.b bVarB2 = l7.b.b(context, data, "alignment_vertical", C1452za.f10110g, EnumC1319q2.FROM_STRING, lVar2, null);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            G8 g82 = C1452za.i;
            b.C0000b c0000b = C1452za.f10104a;
            ?? B10 = l7.b.b(context, data, "alpha", dVar, dVar2, g82, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            List listS = k8.F.s(context, data, "animators", uc.f6863q1);
            List listS2 = k8.F.s(context, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6429C1);
            X2 x22 = (X2) k8.F.q(context, data, "border", uc.f6492I1);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarB3 = l7.b.b(context, data, "column_span", eVar, eVar2, C1452za.f10112j, null);
            List listS3 = k8.F.s(context, data, "disappear_actions", uc.f6535M2);
            List listS4 = k8.F.s(context, data, "extensions", uc.f6662Y2);
            Z4 z42 = (Z4) k8.F.q(context, data, "focus", uc.f6929w3);
            List listS5 = k8.F.s(context, data, "functions", uc.f6463F3);
            b9.p pVar = uc.f6602S6;
            C9 c92 = (C9) k8.F.q(context, data, "height", pVar);
            if (c92 == null) {
                c92 = C1452za.f10105b;
            }
            kotlin.jvm.internal.l.e(c92, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            A8.d dVar3 = l7.e.f43878b;
            String str = (String) k8.F.r(context, data, FacebookMediationAdapter.KEY_ID, dVar3, lVar2);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b3 = C1452za.f10106c;
            C9 c93 = c92;
            ?? B11 = l7.b.b(context, data, "is_enabled", aVar, aVar2, lVar2, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            Object objOpt = data.opt("is_on_variable");
            if (objOpt == JSONObject.NULL) {
                objOpt = null;
            }
            if (objOpt == null) {
                throw z7.e.g("is_on_variable", data);
            }
            String str2 = (String) objOpt;
            L6 l62 = (L6) k8.F.q(context, data, "layout_provider", uc.f6506J4);
            b9.p pVar2 = uc.f6630V2;
            C1362t4 c1362t4 = (C1362t4) k8.F.q(context, data, "margins", pVar2);
            A7.b bVarB4 = l7.b.b(context, data, "on_color", l7.k.f43901f, l7.h.f43881b, lVar2, null);
            C1362t4 c1362t42 = (C1362t4) k8.F.q(context, data, "paddings", pVar2);
            A7.b bVarB5 = l7.b.b(context, data, "reuse_id", l7.k.f43898c, dVar3, lVar2, null);
            A7.b bVarB6 = l7.b.b(context, data, "row_span", eVar, eVar2, C1452za.f10113k, null);
            List listS6 = k8.F.s(context, data, "selected_actions", uc.f6766h1);
            List listS7 = k8.F.s(context, data, "tooltips", uc.f6572P8);
            Qb qb = (Qb) k8.F.q(context, data, "transform", uc.f6604S8);
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) k8.F.q(context, data, "transition_change", uc.f6586R1);
            b9.p pVar3 = uc.f6927w1;
            F2 f22 = (F2) k8.F.q(context, data, "transition_in", pVar3);
            F2 f23 = (F2) k8.F.q(context, data, "transition_out", pVar3);
            List listU = k8.F.u(context, data, "transition_triggers", Ub.FROM_STRING, C1452za.f10114l);
            List listS8 = k8.F.s(context, data, "variable_triggers", uc.f6636V8);
            List listS9 = k8.F.s(context, data, "variables", uc.f6703b9);
            l7.i iVar2 = C1452za.f10111h;
            p9.l<String, EnumC1356sc> lVar3 = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b5 = C1452za.f10107d;
            ?? B12 = l7.b.b(context, data, "visibility", iVar2, lVar3, lVar2, c0000b5);
            if (B12 != 0) {
                c0000b5 = B12;
            }
            b9.p pVar4 = uc.n9;
            C1370tc c1370tc = (C1370tc) k8.F.q(context, data, "visibility_action", pVar4);
            List listS10 = k8.F.s(context, data, "visibility_actions", pVar4);
            C9 c94 = (C9) k8.F.q(context, data, "width", pVar);
            if (c94 == null) {
                c94 = C1452za.f10108e;
            }
            kotlin.jvm.internal.l.e(c94, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1438ya(c1130d0, bVarB, bVarB2, c0000b2, listS, listS2, x22, bVarB3, listS3, listS4, z42, listS5, c93, str, c0000b4, str2, l62, c1362t4, bVarB4, c1362t42, bVarB5, bVarB6, listS6, listS7, qb, abstractC1178g3, f22, f23, listU, listS8, listS9, c0000b5, c1370tc, listS10, c94);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1438ya value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f10118a;
            k8.F.z(context, jSONObject, "accessibility", value.f9950a, uc.f6479H);
            l7.b.e(context, jSONObject, "alignment_horizontal", value.f9951b, EnumC1305p2.TO_STRING);
            l7.b.e(context, jSONObject, "alignment_vertical", value.f9952c, EnumC1319q2.TO_STRING);
            l7.b.d(context, jSONObject, "alpha", value.f9953d);
            k8.F.B(context, jSONObject, "animators", value.f9954e, uc.f6863q1);
            k8.F.B(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f9955f, uc.f6429C1);
            k8.F.z(context, jSONObject, "border", value.f9956g, uc.f6492I1);
            l7.b.d(context, jSONObject, "column_span", value.f9957h);
            k8.F.B(context, jSONObject, "disappear_actions", value.i, uc.f6535M2);
            k8.F.B(context, jSONObject, "extensions", value.f9958j, uc.f6662Y2);
            k8.F.z(context, jSONObject, "focus", value.f9959k, uc.f6929w3);
            k8.F.B(context, jSONObject, "functions", value.f9960l, uc.f6463F3);
            C9 c92 = value.f9961m;
            b9.p pVar = uc.f6602S6;
            k8.F.z(context, jSONObject, "height", c92, pVar);
            k8.F.y(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f9962n);
            l7.b.d(context, jSONObject, "is_enabled", value.f9963o);
            k8.F.y(context, jSONObject, "is_on_variable", value.f9964p);
            k8.F.z(context, jSONObject, "layout_provider", value.f9965q, uc.f6506J4);
            C1362t4 c1362t4 = value.f9966r;
            b9.p pVar2 = uc.f6630V2;
            k8.F.z(context, jSONObject, "margins", c1362t4, pVar2);
            l7.b.e(context, jSONObject, "on_color", value.f9967s, l7.h.f43880a);
            k8.F.z(context, jSONObject, "paddings", value.f9968t, pVar2);
            l7.b.d(context, jSONObject, "reuse_id", value.f9969u);
            l7.b.d(context, jSONObject, "row_span", value.f9970v);
            k8.F.B(context, jSONObject, "selected_actions", value.f9971w, uc.f6766h1);
            k8.F.B(context, jSONObject, "tooltips", value.f9972x, uc.f6572P8);
            k8.F.z(context, jSONObject, "transform", value.f9973y, uc.f6604S8);
            k8.F.z(context, jSONObject, "transition_change", value.f9974z, uc.f6586R1);
            F2 f22 = value.f9940A;
            b9.p pVar3 = uc.f6927w1;
            k8.F.z(context, jSONObject, "transition_in", f22, pVar3);
            k8.F.z(context, jSONObject, "transition_out", value.f9941B, pVar3);
            k8.F.C(context, jSONObject, value.f9942C, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "switch");
            k8.F.B(context, jSONObject, "variable_triggers", value.f9943D, uc.f6636V8);
            k8.F.B(context, jSONObject, "variables", value.f9944E, uc.f6703b9);
            l7.b.e(context, jSONObject, "visibility", value.f9945F, EnumC1356sc.TO_STRING);
            C1370tc c1370tc = value.f9946G;
            b9.p pVar4 = uc.n9;
            k8.F.z(context, jSONObject, "visibility_action", c1370tc, pVar4);
            k8.F.B(context, jSONObject, "visibility_actions", value.f9947H, pVar4);
            k8.F.z(context, jSONObject, "width", value.f9948I, pVar);
            return jSONObject;
        }
    }

    /* compiled from: DivSwitchJsonParser.kt */
    /* renamed from: N7.za$e */
    public static final class e implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f10119a;

        public e(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f10119a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final Aa d(D7.f fVar, Aa aa2, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a<C1160f0> abstractC5371a = aa2 != null ? aa2.f4800a : null;
            Uc uc = this.f10119a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "accessibility", zP, abstractC5371a, uc.f6490I);
            l7.i iVar = C1452za.f10109f;
            AbstractC5371a<A7.b<EnumC1305p2>> abstractC5371a2 = aa2 != null ? aa2.f4801b : null;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "alignment_horizontal", iVar, zP, abstractC5371a2, lVar, lVar2);
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "alignment_vertical", C1452za.f10110g, zP, aa2 != null ? aa2.f4802c : null, EnumC1319q2.FROM_STRING, lVar2);
            AbstractC5371a abstractC5371aJ3 = l7.c.j(fVarW, jSONObject, "alpha", l7.k.f43899d, zP, aa2 != null ? aa2.f4803d : null, l7.h.f43885f, C1452za.i);
            AbstractC5371a abstractC5371aK = l7.c.k(fVarW, jSONObject, "animators", zP, aa2 != null ? aa2.f4804e : null, uc.f6874r1);
            AbstractC5371a abstractC5371aK2 = l7.c.k(fVarW, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, zP, aa2 != null ? aa2.f4805f : null, uc.f6440D1);
            AbstractC5371a abstractC5371aH2 = l7.c.h(fVarW, jSONObject, "border", zP, aa2 != null ? aa2.f4806g : null, uc.f6503J1);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a3 = aa2 != null ? aa2.f4807h : null;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aJ4 = l7.c.j(fVarW, jSONObject, "column_span", eVar, zP, abstractC5371a3, eVar2, C1452za.f10112j);
            AbstractC5371a abstractC5371aK3 = l7.c.k(fVarW, jSONObject, "disappear_actions", zP, aa2 != null ? aa2.i : null, uc.f6545N2);
            AbstractC5371a abstractC5371aK4 = l7.c.k(fVarW, jSONObject, "extensions", zP, aa2 != null ? aa2.f4808j : null, uc.f6673Z2);
            AbstractC5371a abstractC5371aH3 = l7.c.h(fVarW, jSONObject, "focus", zP, aa2 != null ? aa2.f4809k : null, uc.f6940x3);
            AbstractC5371a abstractC5371aK5 = l7.c.k(fVarW, jSONObject, "functions", zP, aa2 != null ? aa2.f4810l : null, uc.f6474G3);
            AbstractC5371a abstractC5371aH4 = l7.c.h(fVarW, jSONObject, "height", zP, aa2 != null ? aa2.f4811m : null, uc.f6613T6);
            AbstractC5371a<String> abstractC5371a4 = aa2 != null ? aa2.f4812n : null;
            A8.d dVar = l7.e.f43878b;
            AbstractC5371a abstractC5371aI = l7.c.i(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, zP, abstractC5371a4, dVar);
            AbstractC5371a abstractC5371aJ5 = l7.c.j(fVarW, jSONObject, "is_enabled", l7.k.f43896a, zP, aa2 != null ? aa2.f4813o : null, l7.h.f43884e, lVar2);
            AbstractC5371a abstractC5371aA = l7.c.a(fVarW, jSONObject, "is_on_variable", zP, aa2 != null ? aa2.f4814p : null);
            AbstractC5371a abstractC5371aH5 = l7.c.h(fVarW, jSONObject, "layout_provider", zP, aa2 != null ? aa2.f4815q : null, uc.f6517K4);
            AbstractC5371a abstractC5371aH6 = l7.c.h(fVarW, jSONObject, "margins", zP, aa2 != null ? aa2.f4816r : null, uc.f6641W2);
            AbstractC5371a abstractC5371aJ6 = l7.c.j(fVarW, jSONObject, "on_color", l7.k.f43901f, zP, aa2 != null ? aa2.f4817s : null, l7.h.f43881b, lVar2);
            AbstractC5371a abstractC5371aH7 = l7.c.h(fVarW, jSONObject, "paddings", zP, aa2 != null ? aa2.f4818t : null, uc.f6641W2);
            AbstractC5371a abstractC5371aJ7 = l7.c.j(fVarW, jSONObject, "reuse_id", l7.k.f43898c, zP, aa2 != null ? aa2.f4819u : null, dVar, lVar2);
            AbstractC5371a abstractC5371aJ8 = l7.c.j(fVarW, jSONObject, "row_span", eVar, zP, aa2 != null ? aa2.f4820v : null, eVar2, C1452za.f10113k);
            AbstractC5371a abstractC5371aK6 = l7.c.k(fVarW, jSONObject, "selected_actions", zP, aa2 != null ? aa2.f4821w : null, uc.f6777i1);
            AbstractC5371a abstractC5371aK7 = l7.c.k(fVarW, jSONObject, "tooltips", zP, aa2 != null ? aa2.f4822x : null, uc.f6582Q8);
            AbstractC5371a abstractC5371aH8 = l7.c.h(fVarW, jSONObject, "transform", zP, aa2 != null ? aa2.f4823y : null, uc.f6615T8);
            AbstractC5371a abstractC5371aH9 = l7.c.h(fVarW, jSONObject, "transition_change", zP, aa2 != null ? aa2.f4824z : null, uc.f6597S1);
            AbstractC5371a abstractC5371aH10 = l7.c.h(fVarW, jSONObject, "transition_in", zP, aa2 != null ? aa2.f4791A : null, uc.f6938x1);
            AbstractC5371a abstractC5371aH11 = l7.c.h(fVarW, jSONObject, "transition_out", zP, aa2 != null ? aa2.f4792B : null, uc.f6938x1);
            AbstractC5371a<List<Ub>> abstractC5371a5 = aa2 != null ? aa2.f4793C : null;
            p9.l<String, Ub> lVar3 = Ub.FROM_STRING;
            B8 b82 = C1452za.f10114l;
            kotlin.jvm.internal.l.d(b82, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new Aa(abstractC5371aH, abstractC5371aJ, abstractC5371aJ2, abstractC5371aJ3, abstractC5371aK, abstractC5371aK2, abstractC5371aH2, abstractC5371aJ4, abstractC5371aK3, abstractC5371aK4, abstractC5371aH3, abstractC5371aK5, abstractC5371aH4, abstractC5371aI, abstractC5371aJ5, abstractC5371aA, abstractC5371aH5, abstractC5371aH6, abstractC5371aJ6, abstractC5371aH7, abstractC5371aJ7, abstractC5371aJ8, abstractC5371aK6, abstractC5371aK7, abstractC5371aH8, abstractC5371aH9, abstractC5371aH10, abstractC5371aH11, l7.c.m(fVarW, jSONObject, zP, abstractC5371a5, lVar3, b82), l7.c.k(fVarW, jSONObject, "variable_triggers", zP, aa2 != null ? aa2.f4794D : null, uc.f6647W8), l7.c.k(fVarW, jSONObject, "variables", zP, aa2 != null ? aa2.f4795E : null, uc.f6715c9), l7.c.j(fVarW, jSONObject, "visibility", C1452za.f10111h, zP, aa2 != null ? aa2.f4796F : null, EnumC1356sc.FROM_STRING, lVar2), l7.c.h(fVarW, jSONObject, "visibility_action", zP, aa2 != null ? aa2.f4797G : null, uc.f6849o9), l7.c.k(fVarW, jSONObject, "visibility_actions", zP, aa2 != null ? aa2.f4798H : null, uc.f6849o9), l7.c.h(fVarW, jSONObject, "width", zP, aa2 != null ? aa2.f4799I : null, uc.f6613T6));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Aa value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f10119a;
            l7.c.u(context, jSONObject, "accessibility", value.f4800a, uc.f6490I);
            l7.c.p(context, "alignment_horizontal", value.f4801b, jSONObject, EnumC1305p2.TO_STRING);
            l7.c.p(context, "alignment_vertical", value.f4802c, jSONObject, EnumC1319q2.TO_STRING);
            l7.c.q(context, jSONObject, "alpha", value.f4803d);
            l7.c.v(context, jSONObject, "animators", value.f4804e, uc.f6874r1);
            l7.c.v(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f4805f, uc.f6440D1);
            l7.c.u(context, jSONObject, "border", value.f4806g, uc.f6503J1);
            l7.c.q(context, jSONObject, "column_span", value.f4807h);
            l7.c.v(context, jSONObject, "disappear_actions", value.i, uc.f6545N2);
            l7.c.v(context, jSONObject, "extensions", value.f4808j, uc.f6673Z2);
            l7.c.u(context, jSONObject, "focus", value.f4809k, uc.f6940x3);
            l7.c.v(context, jSONObject, "functions", value.f4810l, uc.f6474G3);
            AbstractC5371a<G9> abstractC5371a = value.f4811m;
            b9.p pVar = uc.f6613T6;
            l7.c.u(context, jSONObject, "height", abstractC5371a, pVar);
            l7.c.t(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f4812n);
            l7.c.q(context, jSONObject, "is_enabled", value.f4813o);
            l7.c.t(context, jSONObject, "is_on_variable", value.f4814p);
            l7.c.u(context, jSONObject, "layout_provider", value.f4815q, uc.f6517K4);
            AbstractC5371a<C1390v4> abstractC5371a2 = value.f4816r;
            b9.p pVar2 = uc.f6641W2;
            l7.c.u(context, jSONObject, "margins", abstractC5371a2, pVar2);
            l7.c.p(context, "on_color", value.f4817s, jSONObject, l7.h.f43880a);
            l7.c.u(context, jSONObject, "paddings", value.f4818t, pVar2);
            l7.c.q(context, jSONObject, "reuse_id", value.f4819u);
            l7.c.q(context, jSONObject, "row_span", value.f4820v);
            l7.c.v(context, jSONObject, "selected_actions", value.f4821w, uc.f6777i1);
            l7.c.v(context, jSONObject, "tooltips", value.f4822x, uc.f6582Q8);
            l7.c.u(context, jSONObject, "transform", value.f4823y, uc.f6615T8);
            l7.c.u(context, jSONObject, "transition_change", value.f4824z, uc.f6597S1);
            AbstractC5371a<J2> abstractC5371a3 = value.f4791A;
            b9.p pVar3 = uc.f6938x1;
            l7.c.u(context, jSONObject, "transition_in", abstractC5371a3, pVar3);
            l7.c.u(context, jSONObject, "transition_out", value.f4792B, pVar3);
            l7.c.w(context, jSONObject, value.f4793C, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "switch");
            l7.c.v(context, jSONObject, "variable_triggers", value.f4794D, uc.f6647W8);
            l7.c.v(context, jSONObject, "variables", value.f4795E, uc.f6715c9);
            l7.c.p(context, "visibility", value.f4796F, jSONObject, EnumC1356sc.TO_STRING);
            AbstractC5371a<C1398vc> abstractC5371a4 = value.f4797G;
            b9.p pVar4 = uc.f6849o9;
            l7.c.u(context, jSONObject, "visibility_action", abstractC5371a4, pVar4);
            l7.c.v(context, jSONObject, "visibility_actions", value.f4798H, pVar4);
            l7.c.u(context, jSONObject, "width", value.f4799I, pVar);
            return jSONObject;
        }
    }

    /* compiled from: DivSwitchJsonParser.kt */
    /* renamed from: N7.za$f */
    public static final class f implements D7.j<JSONObject, Aa, C1438ya> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f10120a;

        public f(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f10120a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v24, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v50, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v8, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1438ya a(D7.f context, Aa template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f10120a;
            C1130d0 c1130d0 = (C1130d0) l7.d.h(context, template.f4800a, data, "accessibility", uc.f6501J, uc.f6479H);
            A7.b bVarK = l7.d.k(context, template.f4801b, data, "alignment_horizontal", C1452za.f10109f, EnumC1305p2.FROM_STRING);
            A7.b bVarK2 = l7.d.k(context, template.f4802c, data, "alignment_vertical", C1452za.f10110g, EnumC1319q2.FROM_STRING);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            G8 g82 = C1452za.i;
            b.C0000b c0000b = C1452za.f10104a;
            ?? N8 = l7.d.n(context, template.f4803d, data, "alpha", dVar, dVar2, g82, c0000b);
            if (N8 != 0) {
                c0000b = N8;
            }
            List listQ = l7.d.q(context, template.f4804e, data, "animators", uc.f6884s1, uc.f6863q1);
            List listQ2 = l7.d.q(context, template.f4805f, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6451E1, uc.f6429C1);
            X2 x22 = (X2) l7.d.h(context, template.f4806g, data, "border", uc.f6514K1, uc.f6492I1);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarM = l7.d.m(context, template.f4807h, data, "column_span", eVar, eVar2, C1452za.f10112j);
            List listQ3 = l7.d.q(context, template.i, data, "disappear_actions", uc.f6555O2, uc.f6535M2);
            List listQ4 = l7.d.q(context, template.f4808j, data, "extensions", uc.f6685a3, uc.f6662Y2);
            Z4 z42 = (Z4) l7.d.h(context, template.f4809k, data, "focus", uc.f6951y3, uc.f6929w3);
            List listQ5 = l7.d.q(context, template.f4810l, data, "functions", uc.f6483H3, uc.f6463F3);
            C9 c92 = (C9) l7.d.h(context, template.f4811m, data, "height", uc.U6, uc.f6602S6);
            if (c92 == null) {
                c92 = C1452za.f10105b;
            }
            kotlin.jvm.internal.l.e(c92, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            AbstractC5371a<String> abstractC5371a = template.f4812n;
            A8.d dVar3 = l7.e.f43878b;
            String str = (String) l7.d.g(context, FacebookMediationAdapter.KEY_ID, abstractC5371a, data, dVar3);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b2 = C1452za.f10106c;
            C9 c93 = c92;
            b.C0000b c0000b3 = c0000b;
            ?? L7 = l7.d.l(context, template.f4813o, data, "is_enabled", aVar, aVar2, c0000b2);
            b.C0000b c0000b4 = L7 == 0 ? c0000b2 : L7;
            Object objB = l7.d.b(template.f4814p, data, "is_on_variable", dVar3, l7.e.f43877a);
            kotlin.jvm.internal.l.e(objB, "resolve(context, templat…, data, \"is_on_variable\")");
            String str2 = (String) objB;
            L6 l62 = (L6) l7.d.h(context, template.f4815q, data, "layout_provider", uc.f6528L4, uc.f6506J4);
            C1362t4 c1362t4 = (C1362t4) l7.d.h(context, template.f4816r, data, "margins", uc.f6652X2, uc.f6630V2);
            A7.b bVarK3 = l7.d.k(context, template.f4817s, data, "on_color", l7.k.f43901f, l7.h.f43881b);
            C1362t4 c1362t42 = (C1362t4) l7.d.h(context, template.f4818t, data, "paddings", uc.f6652X2, uc.f6630V2);
            A7.b bVarJ = l7.d.j(context, template.f4819u, data, "reuse_id", l7.k.f43898c);
            A7.b bVarM2 = l7.d.m(context, template.f4820v, data, "row_span", eVar, eVar2, C1452za.f10113k);
            List listQ6 = l7.d.q(context, template.f4821w, data, "selected_actions", uc.f6789j1, uc.f6766h1);
            List listQ7 = l7.d.q(context, template.f4822x, data, "tooltips", uc.f6593R8, uc.f6572P8);
            Qb qb = (Qb) l7.d.h(context, template.f4823y, data, "transform", uc.f6625U8, uc.f6604S8);
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) l7.d.h(context, template.f4824z, data, "transition_change", uc.f6608T1, uc.f6586R1);
            F2 f22 = (F2) l7.d.h(context, template.f4791A, data, "transition_in", uc.f6949y1, uc.f6927w1);
            F2 f23 = (F2) l7.d.h(context, template.f4792B, data, "transition_out", uc.f6949y1, uc.f6927w1);
            List listR = l7.d.r(context, template.f4793C, data, Ub.FROM_STRING, C1452za.f10114l);
            List listQ8 = l7.d.q(context, template.f4794D, data, "variable_triggers", uc.f6657X8, uc.f6636V8);
            List listQ9 = l7.d.q(context, template.f4795E, data, "variables", uc.f6727d9, uc.f6703b9);
            l7.i iVar = C1452za.f10111h;
            p9.l<String, EnumC1356sc> lVar = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b5 = C1452za.f10107d;
            ?? L8 = l7.d.l(context, template.f4796F, data, "visibility", iVar, lVar, c0000b5);
            if (L8 != 0) {
                c0000b5 = L8;
            }
            C1370tc c1370tc = (C1370tc) l7.d.h(context, template.f4797G, data, "visibility_action", uc.f6860p9, uc.n9);
            List listQ10 = l7.d.q(context, template.f4798H, data, "visibility_actions", uc.f6860p9, uc.n9);
            C9 c94 = (C9) l7.d.h(context, template.f4799I, data, "width", uc.U6, uc.f6602S6);
            if (c94 == null) {
                c94 = C1452za.f10108e;
            }
            kotlin.jvm.internal.l.e(c94, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1438ya(c1130d0, bVarK, bVarK2, c0000b3, listQ, listQ2, x22, bVarM, listQ3, listQ4, z42, listQ5, c93, str, c0000b4, str2, l62, c1362t4, bVarK3, c1362t42, bVarJ, bVarM2, listQ6, listQ7, qb, abstractC1178g3, f22, f23, listR, listQ8, listQ9, c0000b5, c1370tc, listQ10, c94);
        }
    }

    static {
        Object objM = C2091l.m(EnumC1305p2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f10115g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f10109f = new l7.i(objM, validator);
        Object objM2 = C2091l.m(EnumC1319q2.values());
        kotlin.jvm.internal.l.f(objM2, "default");
        b validator2 = b.f10116g;
        kotlin.jvm.internal.l.f(validator2, "validator");
        f10110g = new l7.i(objM2, validator2);
        Object objM3 = C2091l.m(EnumC1356sc.values());
        kotlin.jvm.internal.l.f(objM3, "default");
        c validator3 = c.f10117g;
        kotlin.jvm.internal.l.f(validator3, "validator");
        f10111h = new l7.i(objM3, validator3);
        i = new G8(7);
        f10112j = new C1094a9(7);
        f10113k = new H7(8);
        f10114l = new B8(8);
    }
}
