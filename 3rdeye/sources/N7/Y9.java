package N7;

import A7.b;
import N7.C1125ca;
import N7.C9;
import c9.C2091l;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivStateJsonParser.kt */
/* loaded from: classes.dex */
public final class Y9 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7780a = b.a.a(Double.valueOf(1.0d));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7781b = b.a.a(Boolean.TRUE);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final C9.c f7782c = new C9.c(new C1412wc(null, null, null));

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7783d = b.a.a(Tb.STATE_CHANGE);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7784e = b.a.a(EnumC1356sc.VISIBLE);

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final C9.b f7785f = new C9.b(new V6(null));

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final l7.i f7786g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final l7.i f7787h;

    @Deprecated
    public static final l7.i i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final l7.i f7788j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final B8 f7789k;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final C1154e9 f7790l;

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final G8 f7791m;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final C1094a9 f7792n;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final H7 f7793o;

    /* compiled from: DivStateJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f7794g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1305p2);
        }
    }

    /* compiled from: DivStateJsonParser.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f7795g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1319q2);
        }
    }

    /* compiled from: DivStateJsonParser.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f7796g = new c(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof Tb);
        }
    }

    /* compiled from: DivStateJsonParser.kt */
    public static final class d extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final d f7797g = new d(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1356sc);
        }
    }

    /* compiled from: DivStateJsonParser.kt */
    public static final class e implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7798a;

        public e(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7798a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v42, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v53, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v7, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final X9 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f7798a;
            C1130d0 c1130d0 = (C1130d0) k8.F.q(context, data, "accessibility", uc.f6479H);
            l7.i iVar = Y9.f7786g;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "alignment_horizontal", iVar, lVar, lVar2, null);
            A7.b bVarB2 = l7.b.b(context, data, "alignment_vertical", Y9.f7787h, EnumC1319q2.FROM_STRING, lVar2, null);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B8 b82 = Y9.f7789k;
            b.C0000b c0000b = Y9.f7780a;
            ?? B10 = l7.b.b(context, data, "alpha", dVar, dVar2, b82, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            List listS = k8.F.s(context, data, "animators", uc.f6863q1);
            List listS2 = k8.F.s(context, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6429C1);
            X2 x22 = (X2) k8.F.q(context, data, "border", uc.f6492I1);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b3 = Y9.f7781b;
            ?? B11 = l7.b.b(context, data, "clip_to_bounds", aVar, aVar2, lVar2, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarB3 = l7.b.b(context, data, "column_span", eVar, eVar2, Y9.f7790l, null);
            k.g gVar = l7.k.f43898c;
            A8.d dVar3 = l7.e.f43878b;
            A7.b bVarB4 = l7.b.b(context, data, "default_state_id", gVar, dVar3, lVar2, null);
            List listS3 = k8.F.s(context, data, "disappear_actions", uc.f6535M2);
            String str = (String) k8.F.r(context, data, "div_id", dVar3, lVar2);
            List listS4 = k8.F.s(context, data, "extensions", uc.f6662Y2);
            Z4 z42 = (Z4) k8.F.q(context, data, "focus", uc.f6929w3);
            List listS5 = k8.F.s(context, data, "functions", uc.f6463F3);
            b9.p pVar = uc.f6602S6;
            C9 c92 = (C9) k8.F.q(context, data, "height", pVar);
            if (c92 == null) {
                c92 = Y9.f7782c;
            }
            kotlin.jvm.internal.l.e(c92, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) k8.F.r(context, data, FacebookMediationAdapter.KEY_ID, dVar3, lVar2);
            C9 c93 = c92;
            L6 l62 = (L6) k8.F.q(context, data, "layout_provider", uc.f6506J4);
            b9.p pVar2 = uc.f6630V2;
            C1362t4 c1362t4 = (C1362t4) k8.F.q(context, data, "margins", pVar2);
            C1362t4 c1362t42 = (C1362t4) k8.F.q(context, data, "paddings", pVar2);
            A7.b bVarB5 = l7.b.b(context, data, "reuse_id", gVar, dVar3, lVar2, null);
            A7.b bVarB6 = l7.b.b(context, data, "row_span", eVar, eVar2, Y9.f7791m, null);
            List listS6 = k8.F.s(context, data, "selected_actions", uc.f6766h1);
            String str3 = (String) k8.F.r(context, data, "state_id_variable", dVar3, lVar2);
            List listO = k8.F.o(context, data, "states", uc.f6837n7, Y9.f7792n);
            kotlin.jvm.internal.l.e(listO, "readList(context, data, …Parser, STATES_VALIDATOR)");
            List listS7 = k8.F.s(context, data, "tooltips", uc.f6572P8);
            Qb qb = (Qb) k8.F.q(context, data, "transform", uc.f6604S8);
            l7.i iVar2 = Y9.i;
            p9.l<String, Tb> lVar3 = Tb.FROM_STRING;
            b.C0000b c0000b5 = Y9.f7783d;
            ?? B12 = l7.b.b(context, data, "transition_animation_selector", iVar2, lVar3, lVar2, c0000b5);
            b.C0000b c0000b6 = B12 == 0 ? c0000b5 : B12;
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) k8.F.q(context, data, "transition_change", uc.f6586R1);
            b9.p pVar3 = uc.f6927w1;
            F2 f22 = (F2) k8.F.q(context, data, "transition_in", pVar3);
            F2 f23 = (F2) k8.F.q(context, data, "transition_out", pVar3);
            List listU = k8.F.u(context, data, "transition_triggers", Ub.FROM_STRING, Y9.f7793o);
            List listS8 = k8.F.s(context, data, "variable_triggers", uc.f6636V8);
            List listS9 = k8.F.s(context, data, "variables", uc.f6703b9);
            l7.i iVar3 = Y9.f7788j;
            p9.l<String, EnumC1356sc> lVar4 = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b7 = Y9.f7784e;
            ?? B13 = l7.b.b(context, data, "visibility", iVar3, lVar4, lVar2, c0000b7);
            if (B13 != 0) {
                c0000b7 = B13;
            }
            b9.p pVar4 = uc.n9;
            C1370tc c1370tc = (C1370tc) k8.F.q(context, data, "visibility_action", pVar4);
            List listS10 = k8.F.s(context, data, "visibility_actions", pVar4);
            C9 c94 = (C9) k8.F.q(context, data, "width", pVar);
            if (c94 == null) {
                c94 = Y9.f7785f;
            }
            kotlin.jvm.internal.l.e(c94, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new X9(c1130d0, bVarB, bVarB2, c0000b2, listS, listS2, x22, c0000b4, bVarB3, bVarB4, listS3, str, listS4, z42, listS5, c93, str2, l62, c1362t4, c1362t42, bVarB5, bVarB6, listS6, str3, listO, listS7, qb, c0000b6, abstractC1178g3, f22, f23, listU, listS8, listS9, c0000b7, c1370tc, listS10, c94);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, X9 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f7798a;
            k8.F.z(context, jSONObject, "accessibility", value.f7720a, uc.f6479H);
            l7.b.e(context, jSONObject, "alignment_horizontal", value.f7721b, EnumC1305p2.TO_STRING);
            l7.b.e(context, jSONObject, "alignment_vertical", value.f7722c, EnumC1319q2.TO_STRING);
            l7.b.d(context, jSONObject, "alpha", value.f7723d);
            k8.F.B(context, jSONObject, "animators", value.f7724e, uc.f6863q1);
            k8.F.B(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f7725f, uc.f6429C1);
            k8.F.z(context, jSONObject, "border", value.f7726g, uc.f6492I1);
            l7.b.d(context, jSONObject, "clip_to_bounds", value.f7727h);
            l7.b.d(context, jSONObject, "column_span", value.i);
            l7.b.d(context, jSONObject, "default_state_id", value.f7728j);
            k8.F.B(context, jSONObject, "disappear_actions", value.f7729k, uc.f6535M2);
            k8.F.y(context, jSONObject, "div_id", value.f7730l);
            k8.F.B(context, jSONObject, "extensions", value.f7731m, uc.f6662Y2);
            k8.F.z(context, jSONObject, "focus", value.f7732n, uc.f6929w3);
            k8.F.B(context, jSONObject, "functions", value.f7733o, uc.f6463F3);
            C9 c92 = value.f7734p;
            b9.p pVar = uc.f6602S6;
            k8.F.z(context, jSONObject, "height", c92, pVar);
            k8.F.y(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f7735q);
            k8.F.z(context, jSONObject, "layout_provider", value.f7736r, uc.f6506J4);
            C1362t4 c1362t4 = value.f7737s;
            b9.p pVar2 = uc.f6630V2;
            k8.F.z(context, jSONObject, "margins", c1362t4, pVar2);
            k8.F.z(context, jSONObject, "paddings", value.f7738t, pVar2);
            l7.b.d(context, jSONObject, "reuse_id", value.f7739u);
            l7.b.d(context, jSONObject, "row_span", value.f7740v);
            k8.F.B(context, jSONObject, "selected_actions", value.f7741w, uc.f6766h1);
            k8.F.y(context, jSONObject, "state_id_variable", value.f7742x);
            k8.F.B(context, jSONObject, "states", value.f7743y, uc.f6837n7);
            k8.F.B(context, jSONObject, "tooltips", value.f7744z, uc.f6572P8);
            k8.F.z(context, jSONObject, "transform", value.f7706A, uc.f6604S8);
            l7.b.e(context, jSONObject, "transition_animation_selector", value.f7707B, Tb.TO_STRING);
            k8.F.z(context, jSONObject, "transition_change", value.f7708C, uc.f6586R1);
            F2 f22 = value.f7709D;
            b9.p pVar3 = uc.f6927w1;
            k8.F.z(context, jSONObject, "transition_in", f22, pVar3);
            k8.F.z(context, jSONObject, "transition_out", value.f7710E, pVar3);
            k8.F.C(context, jSONObject, value.f7711F, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "state");
            k8.F.B(context, jSONObject, "variable_triggers", value.f7712G, uc.f6636V8);
            k8.F.B(context, jSONObject, "variables", value.f7713H, uc.f6703b9);
            l7.b.e(context, jSONObject, "visibility", value.f7714I, EnumC1356sc.TO_STRING);
            C1370tc c1370tc = value.f7715J;
            b9.p pVar4 = uc.n9;
            k8.F.z(context, jSONObject, "visibility_action", c1370tc, pVar4);
            k8.F.B(context, jSONObject, "visibility_actions", value.f7716K, pVar4);
            k8.F.z(context, jSONObject, "width", value.f7717L, pVar);
            return jSONObject;
        }
    }

    /* compiled from: DivStateJsonParser.kt */
    public static final class f implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7799a;

        public f(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7799a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final C1125ca d(D7.f fVar, C1125ca c1125ca, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a<C1160f0> abstractC5371a = c1125ca != null ? c1125ca.f7993a : null;
            Uc uc = this.f7799a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "accessibility", zP, abstractC5371a, uc.f6490I);
            l7.i iVar = Y9.f7786g;
            AbstractC5371a<A7.b<EnumC1305p2>> abstractC5371a2 = c1125ca != null ? c1125ca.f7994b : null;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "alignment_horizontal", iVar, zP, abstractC5371a2, lVar, lVar2);
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "alignment_vertical", Y9.f7787h, zP, c1125ca != null ? c1125ca.f7995c : null, EnumC1319q2.FROM_STRING, lVar2);
            AbstractC5371a abstractC5371aJ3 = l7.c.j(fVarW, jSONObject, "alpha", l7.k.f43899d, zP, c1125ca != null ? c1125ca.f7996d : null, l7.h.f43885f, Y9.f7789k);
            AbstractC5371a abstractC5371aK = l7.c.k(fVarW, jSONObject, "animators", zP, c1125ca != null ? c1125ca.f7997e : null, uc.f6874r1);
            AbstractC5371a abstractC5371aK2 = l7.c.k(fVarW, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, zP, c1125ca != null ? c1125ca.f7998f : null, uc.f6440D1);
            AbstractC5371a abstractC5371aH2 = l7.c.h(fVarW, jSONObject, "border", zP, c1125ca != null ? c1125ca.f7999g : null, uc.f6503J1);
            AbstractC5371a abstractC5371aJ4 = l7.c.j(fVarW, jSONObject, "clip_to_bounds", l7.k.f43896a, zP, c1125ca != null ? c1125ca.f8000h : null, l7.h.f43884e, lVar2);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a3 = c1125ca != null ? c1125ca.i : null;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aJ5 = l7.c.j(fVarW, jSONObject, "column_span", eVar, zP, abstractC5371a3, eVar2, Y9.f7790l);
            k.g gVar = l7.k.f43898c;
            AbstractC5371a<A7.b<String>> abstractC5371a4 = c1125ca != null ? c1125ca.f8001j : null;
            A8.d dVar = l7.e.f43878b;
            AbstractC5371a abstractC5371aJ6 = l7.c.j(fVarW, jSONObject, "default_state_id", gVar, zP, abstractC5371a4, dVar, lVar2);
            AbstractC5371a abstractC5371aK3 = l7.c.k(fVarW, jSONObject, "disappear_actions", zP, c1125ca != null ? c1125ca.f8002k : null, uc.f6545N2);
            AbstractC5371a abstractC5371aI = l7.c.i(fVarW, jSONObject, "div_id", zP, c1125ca != null ? c1125ca.f8003l : null, dVar);
            AbstractC5371a abstractC5371aK4 = l7.c.k(fVarW, jSONObject, "extensions", zP, c1125ca != null ? c1125ca.f8004m : null, uc.f6673Z2);
            AbstractC5371a abstractC5371aH3 = l7.c.h(fVarW, jSONObject, "focus", zP, c1125ca != null ? c1125ca.f8005n : null, uc.f6940x3);
            AbstractC5371a abstractC5371aK5 = l7.c.k(fVarW, jSONObject, "functions", zP, c1125ca != null ? c1125ca.f8006o : null, uc.f6474G3);
            AbstractC5371a abstractC5371aH4 = l7.c.h(fVarW, jSONObject, "height", zP, c1125ca != null ? c1125ca.f8007p : null, uc.f6613T6);
            AbstractC5371a abstractC5371aI2 = l7.c.i(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, zP, c1125ca != null ? c1125ca.f8008q : null, dVar);
            AbstractC5371a abstractC5371aH5 = l7.c.h(fVarW, jSONObject, "layout_provider", zP, c1125ca != null ? c1125ca.f8009r : null, uc.f6517K4);
            AbstractC5371a abstractC5371aH6 = l7.c.h(fVarW, jSONObject, "margins", zP, c1125ca != null ? c1125ca.f8010s : null, uc.f6641W2);
            AbstractC5371a abstractC5371aH7 = l7.c.h(fVarW, jSONObject, "paddings", zP, c1125ca != null ? c1125ca.f8011t : null, uc.f6641W2);
            AbstractC5371a abstractC5371aJ7 = l7.c.j(fVarW, jSONObject, "reuse_id", gVar, zP, c1125ca != null ? c1125ca.f8012u : null, dVar, lVar2);
            AbstractC5371a abstractC5371aJ8 = l7.c.j(fVarW, jSONObject, "row_span", eVar, zP, c1125ca != null ? c1125ca.f8013v : null, eVar2, Y9.f7791m);
            AbstractC5371a abstractC5371aK6 = l7.c.k(fVarW, jSONObject, "selected_actions", zP, c1125ca != null ? c1125ca.f8014w : null, uc.f6777i1);
            AbstractC5371a abstractC5371aI3 = l7.c.i(fVarW, jSONObject, "state_id_variable", zP, c1125ca != null ? c1125ca.f8015x : null, dVar);
            AbstractC5371a<List<C1125ca.a>> abstractC5371a5 = c1125ca != null ? c1125ca.f8016y : null;
            C1094a9 c1094a9 = Y9.f7792n;
            kotlin.jvm.internal.l.d(c1094a9, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            AbstractC5371a abstractC5371aF = l7.c.f(fVarW, jSONObject, "states", zP, abstractC5371a5, uc.f6847o7, c1094a9);
            AbstractC5371a abstractC5371aK7 = l7.c.k(fVarW, jSONObject, "tooltips", zP, c1125ca != null ? c1125ca.f8017z : null, uc.f6582Q8);
            AbstractC5371a abstractC5371aH8 = l7.c.h(fVarW, jSONObject, "transform", zP, c1125ca != null ? c1125ca.f7981A : null, uc.f6615T8);
            AbstractC5371a abstractC5371aJ9 = l7.c.j(fVarW, jSONObject, "transition_animation_selector", Y9.i, zP, c1125ca != null ? c1125ca.f7982B : null, Tb.FROM_STRING, lVar2);
            AbstractC5371a abstractC5371aH9 = l7.c.h(fVarW, jSONObject, "transition_change", zP, c1125ca != null ? c1125ca.f7983C : null, uc.f6597S1);
            AbstractC5371a abstractC5371aH10 = l7.c.h(fVarW, jSONObject, "transition_in", zP, c1125ca != null ? c1125ca.f7984D : null, uc.f6938x1);
            AbstractC5371a abstractC5371aH11 = l7.c.h(fVarW, jSONObject, "transition_out", zP, c1125ca != null ? c1125ca.f7985E : null, uc.f6938x1);
            AbstractC5371a<List<Ub>> abstractC5371a6 = c1125ca != null ? c1125ca.f7986F : null;
            p9.l<String, Ub> lVar3 = Ub.FROM_STRING;
            H7 h72 = Y9.f7793o;
            kotlin.jvm.internal.l.d(h72, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new C1125ca(abstractC5371aH, abstractC5371aJ, abstractC5371aJ2, abstractC5371aJ3, abstractC5371aK, abstractC5371aK2, abstractC5371aH2, abstractC5371aJ4, abstractC5371aJ5, abstractC5371aJ6, abstractC5371aK3, abstractC5371aI, abstractC5371aK4, abstractC5371aH3, abstractC5371aK5, abstractC5371aH4, abstractC5371aI2, abstractC5371aH5, abstractC5371aH6, abstractC5371aH7, abstractC5371aJ7, abstractC5371aJ8, abstractC5371aK6, abstractC5371aI3, abstractC5371aF, abstractC5371aK7, abstractC5371aH8, abstractC5371aJ9, abstractC5371aH9, abstractC5371aH10, abstractC5371aH11, l7.c.m(fVarW, jSONObject, zP, abstractC5371a6, lVar3, h72), l7.c.k(fVarW, jSONObject, "variable_triggers", zP, c1125ca != null ? c1125ca.f7987G : null, uc.f6647W8), l7.c.k(fVarW, jSONObject, "variables", zP, c1125ca != null ? c1125ca.f7988H : null, uc.f6715c9), l7.c.j(fVarW, jSONObject, "visibility", Y9.f7788j, zP, c1125ca != null ? c1125ca.f7989I : null, EnumC1356sc.FROM_STRING, lVar2), l7.c.h(fVarW, jSONObject, "visibility_action", zP, c1125ca != null ? c1125ca.f7990J : null, uc.f6849o9), l7.c.k(fVarW, jSONObject, "visibility_actions", zP, c1125ca != null ? c1125ca.f7991K : null, uc.f6849o9), l7.c.h(fVarW, jSONObject, "width", zP, c1125ca != null ? c1125ca.f7992L : null, uc.f6613T6));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1125ca value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f7799a;
            l7.c.u(context, jSONObject, "accessibility", value.f7993a, uc.f6490I);
            l7.c.p(context, "alignment_horizontal", value.f7994b, jSONObject, EnumC1305p2.TO_STRING);
            l7.c.p(context, "alignment_vertical", value.f7995c, jSONObject, EnumC1319q2.TO_STRING);
            l7.c.q(context, jSONObject, "alpha", value.f7996d);
            l7.c.v(context, jSONObject, "animators", value.f7997e, uc.f6874r1);
            l7.c.v(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f7998f, uc.f6440D1);
            l7.c.u(context, jSONObject, "border", value.f7999g, uc.f6503J1);
            l7.c.q(context, jSONObject, "clip_to_bounds", value.f8000h);
            l7.c.q(context, jSONObject, "column_span", value.i);
            l7.c.q(context, jSONObject, "default_state_id", value.f8001j);
            l7.c.v(context, jSONObject, "disappear_actions", value.f8002k, uc.f6545N2);
            l7.c.t(context, jSONObject, "div_id", value.f8003l);
            l7.c.v(context, jSONObject, "extensions", value.f8004m, uc.f6673Z2);
            l7.c.u(context, jSONObject, "focus", value.f8005n, uc.f6940x3);
            l7.c.v(context, jSONObject, "functions", value.f8006o, uc.f6474G3);
            AbstractC5371a<G9> abstractC5371a = value.f8007p;
            b9.p pVar = uc.f6613T6;
            l7.c.u(context, jSONObject, "height", abstractC5371a, pVar);
            l7.c.t(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f8008q);
            l7.c.u(context, jSONObject, "layout_provider", value.f8009r, uc.f6517K4);
            AbstractC5371a<C1390v4> abstractC5371a2 = value.f8010s;
            b9.p pVar2 = uc.f6641W2;
            l7.c.u(context, jSONObject, "margins", abstractC5371a2, pVar2);
            l7.c.u(context, jSONObject, "paddings", value.f8011t, pVar2);
            l7.c.q(context, jSONObject, "reuse_id", value.f8012u);
            l7.c.q(context, jSONObject, "row_span", value.f8013v);
            l7.c.v(context, jSONObject, "selected_actions", value.f8014w, uc.f6777i1);
            l7.c.t(context, jSONObject, "state_id_variable", value.f8015x);
            l7.c.v(context, jSONObject, "states", value.f8016y, uc.f6847o7);
            l7.c.v(context, jSONObject, "tooltips", value.f8017z, uc.f6582Q8);
            l7.c.u(context, jSONObject, "transform", value.f7981A, uc.f6615T8);
            l7.c.p(context, "transition_animation_selector", value.f7982B, jSONObject, Tb.TO_STRING);
            l7.c.u(context, jSONObject, "transition_change", value.f7983C, uc.f6597S1);
            AbstractC5371a<J2> abstractC5371a3 = value.f7984D;
            b9.p pVar3 = uc.f6938x1;
            l7.c.u(context, jSONObject, "transition_in", abstractC5371a3, pVar3);
            l7.c.u(context, jSONObject, "transition_out", value.f7985E, pVar3);
            l7.c.w(context, jSONObject, value.f7986F, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "state");
            l7.c.v(context, jSONObject, "variable_triggers", value.f7987G, uc.f6647W8);
            l7.c.v(context, jSONObject, "variables", value.f7988H, uc.f6715c9);
            l7.c.p(context, "visibility", value.f7989I, jSONObject, EnumC1356sc.TO_STRING);
            AbstractC5371a<C1398vc> abstractC5371a4 = value.f7990J;
            b9.p pVar4 = uc.f6849o9;
            l7.c.u(context, jSONObject, "visibility_action", abstractC5371a4, pVar4);
            l7.c.v(context, jSONObject, "visibility_actions", value.f7991K, pVar4);
            l7.c.u(context, jSONObject, "width", value.f7992L, pVar);
            return jSONObject;
        }
    }

    /* compiled from: DivStateJsonParser.kt */
    public static final class g implements D7.j<JSONObject, C1125ca, X9> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7800a;

        public g(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7800a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v14, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v44, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v55, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v8, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final X9 a(D7.f context, C1125ca template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f7800a;
            C1130d0 c1130d0 = (C1130d0) l7.d.h(context, template.f7993a, data, "accessibility", uc.f6501J, uc.f6479H);
            A7.b bVarK = l7.d.k(context, template.f7994b, data, "alignment_horizontal", Y9.f7786g, EnumC1305p2.FROM_STRING);
            A7.b bVarK2 = l7.d.k(context, template.f7995c, data, "alignment_vertical", Y9.f7787h, EnumC1319q2.FROM_STRING);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B8 b82 = Y9.f7789k;
            b.C0000b c0000b = Y9.f7780a;
            ?? N8 = l7.d.n(context, template.f7996d, data, "alpha", dVar, dVar2, b82, c0000b);
            if (N8 != 0) {
                c0000b = N8;
            }
            List listQ = l7.d.q(context, template.f7997e, data, "animators", uc.f6884s1, uc.f6863q1);
            List listQ2 = l7.d.q(context, template.f7998f, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6451E1, uc.f6429C1);
            X2 x22 = (X2) l7.d.h(context, template.f7999g, data, "border", uc.f6514K1, uc.f6492I1);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b2 = Y9.f7781b;
            ?? L7 = l7.d.l(context, template.f8000h, data, "clip_to_bounds", aVar, aVar2, c0000b2);
            b.C0000b c0000b3 = L7 == 0 ? c0000b2 : L7;
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarM = l7.d.m(context, template.i, data, "column_span", eVar, eVar2, Y9.f7790l);
            k.g gVar = l7.k.f43898c;
            A7.b bVarJ = l7.d.j(context, template.f8001j, data, "default_state_id", gVar);
            List listQ3 = l7.d.q(context, template.f8002k, data, "disappear_actions", uc.f6555O2, uc.f6535M2);
            AbstractC5371a<String> abstractC5371a = template.f8003l;
            A8.d dVar3 = l7.e.f43878b;
            String str = (String) l7.d.g(context, "div_id", abstractC5371a, data, dVar3);
            b.C0000b c0000b4 = c0000b;
            List listQ4 = l7.d.q(context, template.f8004m, data, "extensions", uc.f6685a3, uc.f6662Y2);
            Z4 z42 = (Z4) l7.d.h(context, template.f8005n, data, "focus", uc.f6951y3, uc.f6929w3);
            List listQ5 = l7.d.q(context, template.f8006o, data, "functions", uc.f6483H3, uc.f6463F3);
            C9 c92 = (C9) l7.d.h(context, template.f8007p, data, "height", uc.U6, uc.f6602S6);
            if (c92 == null) {
                c92 = Y9.f7782c;
            }
            kotlin.jvm.internal.l.e(c92, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) l7.d.g(context, FacebookMediationAdapter.KEY_ID, template.f8008q, data, dVar3);
            C9 c93 = c92;
            L6 l62 = (L6) l7.d.h(context, template.f8009r, data, "layout_provider", uc.f6528L4, uc.f6506J4);
            C1362t4 c1362t4 = (C1362t4) l7.d.h(context, template.f8010s, data, "margins", uc.f6652X2, uc.f6630V2);
            C1362t4 c1362t42 = (C1362t4) l7.d.h(context, template.f8011t, data, "paddings", uc.f6652X2, uc.f6630V2);
            A7.b bVarJ2 = l7.d.j(context, template.f8012u, data, "reuse_id", gVar);
            A7.b bVarM2 = l7.d.m(context, template.f8013v, data, "row_span", eVar, eVar2, Y9.f7791m);
            List listQ6 = l7.d.q(context, template.f8014w, data, "selected_actions", uc.f6789j1, uc.f6766h1);
            String str3 = (String) l7.d.g(context, "state_id_variable", template.f8015x, data, dVar3);
            List listF = l7.d.f(context, template.f8016y, data, "states", uc.f6858p7, uc.f6837n7, Y9.f7792n);
            kotlin.jvm.internal.l.e(listF, "resolveList(context, tem…Parser, STATES_VALIDATOR)");
            List listQ7 = l7.d.q(context, template.f8017z, data, "tooltips", uc.f6593R8, uc.f6572P8);
            Qb qb = (Qb) l7.d.h(context, template.f7981A, data, "transform", uc.f6625U8, uc.f6604S8);
            l7.i iVar = Y9.i;
            p9.l<String, Tb> lVar = Tb.FROM_STRING;
            b.C0000b c0000b5 = Y9.f7783d;
            ?? L8 = l7.d.l(context, template.f7982B, data, "transition_animation_selector", iVar, lVar, c0000b5);
            b.C0000b c0000b6 = L8 == 0 ? c0000b5 : L8;
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) l7.d.h(context, template.f7983C, data, "transition_change", uc.f6608T1, uc.f6586R1);
            F2 f22 = (F2) l7.d.h(context, template.f7984D, data, "transition_in", uc.f6949y1, uc.f6927w1);
            F2 f23 = (F2) l7.d.h(context, template.f7985E, data, "transition_out", uc.f6949y1, uc.f6927w1);
            List listR = l7.d.r(context, template.f7986F, data, Ub.FROM_STRING, Y9.f7793o);
            List listQ8 = l7.d.q(context, template.f7987G, data, "variable_triggers", uc.f6657X8, uc.f6636V8);
            List listQ9 = l7.d.q(context, template.f7988H, data, "variables", uc.f6727d9, uc.f6703b9);
            l7.i iVar2 = Y9.f7788j;
            p9.l<String, EnumC1356sc> lVar2 = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b7 = Y9.f7784e;
            ?? L10 = l7.d.l(context, template.f7989I, data, "visibility", iVar2, lVar2, c0000b7);
            if (L10 != 0) {
                c0000b7 = L10;
            }
            C1370tc c1370tc = (C1370tc) l7.d.h(context, template.f7990J, data, "visibility_action", uc.f6860p9, uc.n9);
            List listQ10 = l7.d.q(context, template.f7991K, data, "visibility_actions", uc.f6860p9, uc.n9);
            C9 c94 = (C9) l7.d.h(context, template.f7992L, data, "width", uc.U6, uc.f6602S6);
            if (c94 == null) {
                c94 = Y9.f7785f;
            }
            kotlin.jvm.internal.l.e(c94, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new X9(c1130d0, bVarK, bVarK2, c0000b4, listQ, listQ2, x22, c0000b3, bVarM, bVarJ, listQ3, str, listQ4, z42, listQ5, c93, str2, l62, c1362t4, c1362t42, bVarJ2, bVarM2, listQ6, str3, listF, listQ7, qb, c0000b6, abstractC1178g3, f22, f23, listR, listQ8, listQ9, c0000b7, c1370tc, listQ10, c94);
        }
    }

    static {
        Object objM = C2091l.m(EnumC1305p2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f7794g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f7786g = new l7.i(objM, validator);
        Object objM2 = C2091l.m(EnumC1319q2.values());
        kotlin.jvm.internal.l.f(objM2, "default");
        b validator2 = b.f7795g;
        kotlin.jvm.internal.l.f(validator2, "validator");
        f7787h = new l7.i(objM2, validator2);
        Object objM3 = C2091l.m(Tb.values());
        kotlin.jvm.internal.l.f(objM3, "default");
        c validator3 = c.f7796g;
        kotlin.jvm.internal.l.f(validator3, "validator");
        i = new l7.i(objM3, validator3);
        Object objM4 = C2091l.m(EnumC1356sc.values());
        kotlin.jvm.internal.l.f(objM4, "default");
        d validator4 = d.f7797g;
        kotlin.jvm.internal.l.f(validator4, "validator");
        f7788j = new l7.i(objM4, validator4);
        f7789k = new B8(6);
        f7790l = new C1154e9(4);
        f7791m = new G8(6);
        f7792n = new C1094a9(6);
        f7793o = new H7(7);
    }
}
