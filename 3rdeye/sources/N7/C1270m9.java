package N7;

import A7.b;
import N7.C1242k9;
import N7.C1332r2;
import N7.C9;
import c9.C2091l;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivSeparatorJsonParser.kt */
/* renamed from: N7.m9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1270m9 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final C1332r2 f8758a = new C1332r2(b.a.a(100L), b.a.a(Double.valueOf(0.6d)), b.a.a(C1332r2.a.FADE), b.a.a(Double.valueOf(1.0d)));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8759b = b.a.a(Double.valueOf(1.0d));

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8760c = b.a.a(Boolean.TRUE);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final C9.c f8761d = new C9.c(new C1412wc(null, null, null));

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8762e = b.a.a(EnumC1356sc.VISIBLE);

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final C9.b f8763f = new C9.b(new V6(null));

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8764g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8765h;

    @Deprecated
    public static final l7.i i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final C1154e9 f8766j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final G8 f8767k;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final C1094a9 f8768l;

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final H7 f8769m;

    /* compiled from: DivSeparatorJsonParser.kt */
    /* renamed from: N7.m9$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8770g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1305p2);
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    /* renamed from: N7.m9$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f8771g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1319q2);
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    /* renamed from: N7.m9$c */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f8772g = new c(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1356sc);
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    /* renamed from: N7.m9$d */
    public static final class d implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8773a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8773a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v15, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v21, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v51, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C1242k9 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f8773a;
            C1130d0 c1130d0 = (C1130d0) k8.F.q(context, data, "accessibility", uc.f6479H);
            b9.p pVar = uc.f6766h1;
            C1175g0 c1175g0 = (C1175g0) k8.F.q(context, data, "action", pVar);
            C1332r2 c1332r2 = (C1332r2) k8.F.q(context, data, "action_animation", uc.f6831n1);
            if (c1332r2 == null) {
                c1332r2 = C1270m9.f8758a;
            }
            C1332r2 c1332r22 = c1332r2;
            kotlin.jvm.internal.l.e(c1332r22, "JsonPropertyParser.readO…N_ANIMATION_DEFAULT_VALUE");
            List listS = k8.F.s(context, data, "actions", pVar);
            l7.i iVar = C1270m9.f8764g;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "alignment_horizontal", iVar, lVar, lVar2, null);
            A7.b bVarB2 = l7.b.b(context, data, "alignment_vertical", C1270m9.f8765h, EnumC1319q2.FROM_STRING, lVar2, null);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            C1154e9 c1154e9 = C1270m9.f8766j;
            b.C0000b c0000b = C1270m9.f8759b;
            ?? B10 = l7.b.b(context, data, "alpha", dVar, dVar2, c1154e9, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            List listS2 = k8.F.s(context, data, "animators", uc.f6863q1);
            List listS3 = k8.F.s(context, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6429C1);
            X2 x22 = (X2) k8.F.q(context, data, "border", uc.f6492I1);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b3 = C1270m9.f8760c;
            ?? B11 = l7.b.b(context, data, "capture_focus_on_action", aVar, aVar2, lVar2, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarB3 = l7.b.b(context, data, "column_span", eVar, eVar2, C1270m9.f8767k, null);
            C1242k9.a aVar3 = (C1242k9.a) k8.F.q(context, data, "delimiter_style", uc.f6477G6);
            List listS4 = k8.F.s(context, data, "disappear_actions", uc.f6535M2);
            List listS5 = k8.F.s(context, data, "doubletap_actions", pVar);
            List listS6 = k8.F.s(context, data, "extensions", uc.f6662Y2);
            Z4 z42 = (Z4) k8.F.q(context, data, "focus", uc.f6929w3);
            List listS7 = k8.F.s(context, data, "functions", uc.f6463F3);
            b9.p pVar2 = uc.f6602S6;
            C9 c92 = (C9) k8.F.q(context, data, "height", pVar2);
            if (c92 == null) {
                c92 = C1270m9.f8761d;
            }
            kotlin.jvm.internal.l.e(c92, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            List listS8 = k8.F.s(context, data, "hover_end_actions", pVar);
            List listS9 = k8.F.s(context, data, "hover_start_actions", pVar);
            A8.d dVar3 = l7.e.f43878b;
            String str = (String) k8.F.r(context, data, FacebookMediationAdapter.KEY_ID, dVar3, lVar2);
            L6 l62 = (L6) k8.F.q(context, data, "layout_provider", uc.f6506J4);
            List listS10 = k8.F.s(context, data, "longtap_actions", pVar);
            b9.p pVar3 = uc.f6630V2;
            C1362t4 c1362t4 = (C1362t4) k8.F.q(context, data, "margins", pVar3);
            C1362t4 c1362t42 = (C1362t4) k8.F.q(context, data, "paddings", pVar3);
            List listS11 = k8.F.s(context, data, "press_end_actions", pVar);
            List listS12 = k8.F.s(context, data, "press_start_actions", pVar);
            C9 c93 = c92;
            A7.b bVarB4 = l7.b.b(context, data, "reuse_id", l7.k.f43898c, dVar3, lVar2, null);
            A7.b bVarB5 = l7.b.b(context, data, "row_span", eVar, eVar2, C1270m9.f8768l, null);
            List listS13 = k8.F.s(context, data, "selected_actions", pVar);
            List listS14 = k8.F.s(context, data, "tooltips", uc.f6572P8);
            Qb qb = (Qb) k8.F.q(context, data, "transform", uc.f6604S8);
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) k8.F.q(context, data, "transition_change", uc.f6586R1);
            b9.p pVar4 = uc.f6927w1;
            F2 f22 = (F2) k8.F.q(context, data, "transition_in", pVar4);
            F2 f23 = (F2) k8.F.q(context, data, "transition_out", pVar4);
            List listU = k8.F.u(context, data, "transition_triggers", Ub.FROM_STRING, C1270m9.f8769m);
            List listS15 = k8.F.s(context, data, "variable_triggers", uc.f6636V8);
            List listS16 = k8.F.s(context, data, "variables", uc.f6703b9);
            l7.i iVar2 = C1270m9.i;
            p9.l<String, EnumC1356sc> lVar3 = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b5 = C1270m9.f8762e;
            ?? B12 = l7.b.b(context, data, "visibility", iVar2, lVar3, lVar2, c0000b5);
            b.C0000b c0000b6 = B12 == 0 ? c0000b5 : B12;
            b9.p pVar5 = uc.n9;
            C1370tc c1370tc = (C1370tc) k8.F.q(context, data, "visibility_action", pVar5);
            List listS17 = k8.F.s(context, data, "visibility_actions", pVar5);
            C9 c94 = (C9) k8.F.q(context, data, "width", pVar2);
            if (c94 == null) {
                c94 = C1270m9.f8763f;
            }
            kotlin.jvm.internal.l.e(c94, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1242k9(c1130d0, c1175g0, c1332r22, listS, bVarB, bVarB2, c0000b2, listS2, listS3, x22, c0000b4, bVarB3, aVar3, listS4, listS5, listS6, z42, listS7, c93, listS8, listS9, str, l62, listS10, c1362t4, c1362t42, listS11, listS12, bVarB4, bVarB5, listS13, listS14, qb, abstractC1178g3, f22, f23, listU, listS15, listS16, c0000b6, c1370tc, listS17, c94);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1242k9 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f8773a;
            k8.F.z(context, jSONObject, "accessibility", value.f8671a, uc.f6479H);
            C1175g0 c1175g0 = value.f8672b;
            b9.p pVar = uc.f6766h1;
            k8.F.z(context, jSONObject, "action", c1175g0, pVar);
            k8.F.z(context, jSONObject, "action_animation", value.f8673c, uc.f6831n1);
            k8.F.B(context, jSONObject, "actions", value.f8674d, pVar);
            l7.b.e(context, jSONObject, "alignment_horizontal", value.f8675e, EnumC1305p2.TO_STRING);
            l7.b.e(context, jSONObject, "alignment_vertical", value.f8676f, EnumC1319q2.TO_STRING);
            l7.b.d(context, jSONObject, "alpha", value.f8677g);
            k8.F.B(context, jSONObject, "animators", value.f8678h, uc.f6863q1);
            k8.F.B(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.i, uc.f6429C1);
            k8.F.z(context, jSONObject, "border", value.f8679j, uc.f6492I1);
            l7.b.d(context, jSONObject, "capture_focus_on_action", value.f8680k);
            l7.b.d(context, jSONObject, "column_span", value.f8681l);
            k8.F.z(context, jSONObject, "delimiter_style", value.f8682m, uc.f6477G6);
            k8.F.B(context, jSONObject, "disappear_actions", value.f8683n, uc.f6535M2);
            k8.F.B(context, jSONObject, "doubletap_actions", value.f8684o, pVar);
            k8.F.B(context, jSONObject, "extensions", value.f8685p, uc.f6662Y2);
            k8.F.z(context, jSONObject, "focus", value.f8686q, uc.f6929w3);
            k8.F.B(context, jSONObject, "functions", value.f8687r, uc.f6463F3);
            C9 c92 = value.f8688s;
            b9.p pVar2 = uc.f6602S6;
            k8.F.z(context, jSONObject, "height", c92, pVar2);
            k8.F.B(context, jSONObject, "hover_end_actions", value.f8689t, pVar);
            k8.F.B(context, jSONObject, "hover_start_actions", value.f8690u, pVar);
            k8.F.y(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f8691v);
            k8.F.z(context, jSONObject, "layout_provider", value.f8692w, uc.f6506J4);
            k8.F.B(context, jSONObject, "longtap_actions", value.f8693x, pVar);
            C1362t4 c1362t4 = value.f8694y;
            b9.p pVar3 = uc.f6630V2;
            k8.F.z(context, jSONObject, "margins", c1362t4, pVar3);
            k8.F.z(context, jSONObject, "paddings", value.f8695z, pVar3);
            k8.F.B(context, jSONObject, "press_end_actions", value.f8653A, pVar);
            k8.F.B(context, jSONObject, "press_start_actions", value.f8654B, pVar);
            l7.b.d(context, jSONObject, "reuse_id", value.f8655C);
            l7.b.d(context, jSONObject, "row_span", value.f8656D);
            k8.F.B(context, jSONObject, "selected_actions", value.f8657E, pVar);
            k8.F.B(context, jSONObject, "tooltips", value.f8658F, uc.f6572P8);
            k8.F.z(context, jSONObject, "transform", value.f8659G, uc.f6604S8);
            k8.F.z(context, jSONObject, "transition_change", value.f8660H, uc.f6586R1);
            F2 f22 = value.f8661I;
            b9.p pVar4 = uc.f6927w1;
            k8.F.z(context, jSONObject, "transition_in", f22, pVar4);
            k8.F.z(context, jSONObject, "transition_out", value.f8662J, pVar4);
            k8.F.C(context, jSONObject, value.f8663K, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "separator");
            k8.F.B(context, jSONObject, "variable_triggers", value.f8664L, uc.f6636V8);
            k8.F.B(context, jSONObject, "variables", value.f8665M, uc.f6703b9);
            l7.b.e(context, jSONObject, "visibility", value.f8666N, EnumC1356sc.TO_STRING);
            C1370tc c1370tc = value.f8667O;
            b9.p pVar5 = uc.n9;
            k8.F.z(context, jSONObject, "visibility_action", c1370tc, pVar5);
            k8.F.B(context, jSONObject, "visibility_actions", value.f8668P, pVar5);
            k8.F.z(context, jSONObject, "width", value.f8669Q, pVar2);
            return jSONObject;
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    /* renamed from: N7.m9$e */
    public static final class e implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8774a;

        public e(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8774a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final C1284n9 d(D7.f fVar, C1284n9 c1284n9, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a<C1160f0> abstractC5371a = c1284n9 != null ? c1284n9.f8811a : null;
            Uc uc = this.f8774a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "accessibility", zP, abstractC5371a, uc.f6490I);
            AbstractC5371a abstractC5371aH2 = l7.c.h(fVarW, jSONObject, "action", zP, c1284n9 != null ? c1284n9.f8812b : null, uc.f6777i1);
            AbstractC5371a abstractC5371aH3 = l7.c.h(fVarW, jSONObject, "action_animation", zP, c1284n9 != null ? c1284n9.f8813c : null, uc.f6841o1);
            AbstractC5371a abstractC5371aK = l7.c.k(fVarW, jSONObject, "actions", zP, c1284n9 != null ? c1284n9.f8814d : null, uc.f6777i1);
            l7.i iVar = C1270m9.f8764g;
            AbstractC5371a<A7.b<EnumC1305p2>> abstractC5371a2 = c1284n9 != null ? c1284n9.f8815e : null;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "alignment_horizontal", iVar, zP, abstractC5371a2, lVar, lVar2);
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "alignment_vertical", C1270m9.f8765h, zP, c1284n9 != null ? c1284n9.f8816f : null, EnumC1319q2.FROM_STRING, lVar2);
            AbstractC5371a abstractC5371aJ3 = l7.c.j(fVarW, jSONObject, "alpha", l7.k.f43899d, zP, c1284n9 != null ? c1284n9.f8817g : null, l7.h.f43885f, C1270m9.f8766j);
            AbstractC5371a abstractC5371aK2 = l7.c.k(fVarW, jSONObject, "animators", zP, c1284n9 != null ? c1284n9.f8818h : null, uc.f6874r1);
            AbstractC5371a abstractC5371aK3 = l7.c.k(fVarW, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, zP, c1284n9 != null ? c1284n9.i : null, uc.f6440D1);
            AbstractC5371a abstractC5371aH4 = l7.c.h(fVarW, jSONObject, "border", zP, c1284n9 != null ? c1284n9.f8819j : null, uc.f6503J1);
            AbstractC5371a abstractC5371aJ4 = l7.c.j(fVarW, jSONObject, "capture_focus_on_action", l7.k.f43896a, zP, c1284n9 != null ? c1284n9.f8820k : null, l7.h.f43884e, lVar2);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a3 = c1284n9 != null ? c1284n9.f8821l : null;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aJ5 = l7.c.j(fVarW, jSONObject, "column_span", eVar, zP, abstractC5371a3, eVar2, C1270m9.f8767k);
            AbstractC5371a abstractC5371aH5 = l7.c.h(fVarW, jSONObject, "delimiter_style", zP, c1284n9 != null ? c1284n9.f8822m : null, uc.f6486H6);
            AbstractC5371a abstractC5371aK4 = l7.c.k(fVarW, jSONObject, "disappear_actions", zP, c1284n9 != null ? c1284n9.f8823n : null, uc.f6545N2);
            AbstractC5371a abstractC5371aK5 = l7.c.k(fVarW, jSONObject, "doubletap_actions", zP, c1284n9 != null ? c1284n9.f8824o : null, uc.f6777i1);
            AbstractC5371a abstractC5371aK6 = l7.c.k(fVarW, jSONObject, "extensions", zP, c1284n9 != null ? c1284n9.f8825p : null, uc.f6673Z2);
            AbstractC5371a abstractC5371aH6 = l7.c.h(fVarW, jSONObject, "focus", zP, c1284n9 != null ? c1284n9.f8826q : null, uc.f6940x3);
            AbstractC5371a abstractC5371aK7 = l7.c.k(fVarW, jSONObject, "functions", zP, c1284n9 != null ? c1284n9.f8827r : null, uc.f6474G3);
            AbstractC5371a abstractC5371aH7 = l7.c.h(fVarW, jSONObject, "height", zP, c1284n9 != null ? c1284n9.f8828s : null, uc.f6613T6);
            AbstractC5371a abstractC5371aK8 = l7.c.k(fVarW, jSONObject, "hover_end_actions", zP, c1284n9 != null ? c1284n9.f8829t : null, uc.f6777i1);
            AbstractC5371a abstractC5371aK9 = l7.c.k(fVarW, jSONObject, "hover_start_actions", zP, c1284n9 != null ? c1284n9.f8830u : null, uc.f6777i1);
            AbstractC5371a<String> abstractC5371a4 = c1284n9 != null ? c1284n9.f8831v : null;
            A8.d dVar = l7.e.f43878b;
            AbstractC5371a abstractC5371aI = l7.c.i(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, zP, abstractC5371a4, dVar);
            AbstractC5371a abstractC5371aH8 = l7.c.h(fVarW, jSONObject, "layout_provider", zP, c1284n9 != null ? c1284n9.f8832w : null, uc.f6517K4);
            AbstractC5371a abstractC5371aK10 = l7.c.k(fVarW, jSONObject, "longtap_actions", zP, c1284n9 != null ? c1284n9.f8833x : null, uc.f6777i1);
            AbstractC5371a abstractC5371aH9 = l7.c.h(fVarW, jSONObject, "margins", zP, c1284n9 != null ? c1284n9.f8834y : null, uc.f6641W2);
            AbstractC5371a abstractC5371aH10 = l7.c.h(fVarW, jSONObject, "paddings", zP, c1284n9 != null ? c1284n9.f8835z : null, uc.f6641W2);
            AbstractC5371a abstractC5371aK11 = l7.c.k(fVarW, jSONObject, "press_end_actions", zP, c1284n9 != null ? c1284n9.f8794A : null, uc.f6777i1);
            AbstractC5371a abstractC5371aK12 = l7.c.k(fVarW, jSONObject, "press_start_actions", zP, c1284n9 != null ? c1284n9.f8795B : null, uc.f6777i1);
            AbstractC5371a abstractC5371aJ6 = l7.c.j(fVarW, jSONObject, "reuse_id", l7.k.f43898c, zP, c1284n9 != null ? c1284n9.f8796C : null, dVar, lVar2);
            AbstractC5371a abstractC5371aJ7 = l7.c.j(fVarW, jSONObject, "row_span", eVar, zP, c1284n9 != null ? c1284n9.f8797D : null, eVar2, C1270m9.f8768l);
            AbstractC5371a abstractC5371aK13 = l7.c.k(fVarW, jSONObject, "selected_actions", zP, c1284n9 != null ? c1284n9.f8798E : null, uc.f6777i1);
            AbstractC5371a abstractC5371aK14 = l7.c.k(fVarW, jSONObject, "tooltips", zP, c1284n9 != null ? c1284n9.f8799F : null, uc.f6582Q8);
            AbstractC5371a abstractC5371aH11 = l7.c.h(fVarW, jSONObject, "transform", zP, c1284n9 != null ? c1284n9.f8800G : null, uc.f6615T8);
            AbstractC5371a abstractC5371aH12 = l7.c.h(fVarW, jSONObject, "transition_change", zP, c1284n9 != null ? c1284n9.f8801H : null, uc.f6597S1);
            AbstractC5371a abstractC5371aH13 = l7.c.h(fVarW, jSONObject, "transition_in", zP, c1284n9 != null ? c1284n9.f8802I : null, uc.f6938x1);
            AbstractC5371a abstractC5371aH14 = l7.c.h(fVarW, jSONObject, "transition_out", zP, c1284n9 != null ? c1284n9.f8803J : null, uc.f6938x1);
            AbstractC5371a<List<Ub>> abstractC5371a5 = c1284n9 != null ? c1284n9.f8804K : null;
            p9.l<String, Ub> lVar3 = Ub.FROM_STRING;
            H7 h72 = C1270m9.f8769m;
            kotlin.jvm.internal.l.d(h72, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new C1284n9(abstractC5371aH, abstractC5371aH2, abstractC5371aH3, abstractC5371aK, abstractC5371aJ, abstractC5371aJ2, abstractC5371aJ3, abstractC5371aK2, abstractC5371aK3, abstractC5371aH4, abstractC5371aJ4, abstractC5371aJ5, abstractC5371aH5, abstractC5371aK4, abstractC5371aK5, abstractC5371aK6, abstractC5371aH6, abstractC5371aK7, abstractC5371aH7, abstractC5371aK8, abstractC5371aK9, abstractC5371aI, abstractC5371aH8, abstractC5371aK10, abstractC5371aH9, abstractC5371aH10, abstractC5371aK11, abstractC5371aK12, abstractC5371aJ6, abstractC5371aJ7, abstractC5371aK13, abstractC5371aK14, abstractC5371aH11, abstractC5371aH12, abstractC5371aH13, abstractC5371aH14, l7.c.m(fVarW, jSONObject, zP, abstractC5371a5, lVar3, h72), l7.c.k(fVarW, jSONObject, "variable_triggers", zP, c1284n9 != null ? c1284n9.f8805L : null, uc.f6647W8), l7.c.k(fVarW, jSONObject, "variables", zP, c1284n9 != null ? c1284n9.f8806M : null, uc.f6715c9), l7.c.j(fVarW, jSONObject, "visibility", C1270m9.i, zP, c1284n9 != null ? c1284n9.f8807N : null, EnumC1356sc.FROM_STRING, lVar2), l7.c.h(fVarW, jSONObject, "visibility_action", zP, c1284n9 != null ? c1284n9.f8808O : null, uc.f6849o9), l7.c.k(fVarW, jSONObject, "visibility_actions", zP, c1284n9 != null ? c1284n9.f8809P : null, uc.f6849o9), l7.c.h(fVarW, jSONObject, "width", zP, c1284n9 != null ? c1284n9.f8810Q : null, uc.f6613T6));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1284n9 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f8774a;
            l7.c.u(context, jSONObject, "accessibility", value.f8811a, uc.f6490I);
            AbstractC5371a<C1132d2> abstractC5371a = value.f8812b;
            b9.p pVar = uc.f6777i1;
            l7.c.u(context, jSONObject, "action", abstractC5371a, pVar);
            l7.c.u(context, jSONObject, "action_animation", value.f8813c, uc.f6841o1);
            l7.c.v(context, jSONObject, "actions", value.f8814d, pVar);
            l7.c.p(context, "alignment_horizontal", value.f8815e, jSONObject, EnumC1305p2.TO_STRING);
            l7.c.p(context, "alignment_vertical", value.f8816f, jSONObject, EnumC1319q2.TO_STRING);
            l7.c.q(context, jSONObject, "alpha", value.f8817g);
            l7.c.v(context, jSONObject, "animators", value.f8818h, uc.f6874r1);
            l7.c.v(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.i, uc.f6440D1);
            l7.c.u(context, jSONObject, "border", value.f8819j, uc.f6503J1);
            l7.c.q(context, jSONObject, "capture_focus_on_action", value.f8820k);
            l7.c.q(context, jSONObject, "column_span", value.f8821l);
            l7.c.u(context, jSONObject, "delimiter_style", value.f8822m, uc.f6486H6);
            l7.c.v(context, jSONObject, "disappear_actions", value.f8823n, uc.f6545N2);
            l7.c.v(context, jSONObject, "doubletap_actions", value.f8824o, pVar);
            l7.c.v(context, jSONObject, "extensions", value.f8825p, uc.f6673Z2);
            l7.c.u(context, jSONObject, "focus", value.f8826q, uc.f6940x3);
            l7.c.v(context, jSONObject, "functions", value.f8827r, uc.f6474G3);
            AbstractC5371a<G9> abstractC5371a2 = value.f8828s;
            b9.p pVar2 = uc.f6613T6;
            l7.c.u(context, jSONObject, "height", abstractC5371a2, pVar2);
            l7.c.v(context, jSONObject, "hover_end_actions", value.f8829t, pVar);
            l7.c.v(context, jSONObject, "hover_start_actions", value.f8830u, pVar);
            l7.c.t(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f8831v);
            l7.c.u(context, jSONObject, "layout_provider", value.f8832w, uc.f6517K4);
            l7.c.v(context, jSONObject, "longtap_actions", value.f8833x, pVar);
            AbstractC5371a<C1390v4> abstractC5371a3 = value.f8834y;
            b9.p pVar3 = uc.f6641W2;
            l7.c.u(context, jSONObject, "margins", abstractC5371a3, pVar3);
            l7.c.u(context, jSONObject, "paddings", value.f8835z, pVar3);
            l7.c.v(context, jSONObject, "press_end_actions", value.f8794A, pVar);
            l7.c.v(context, jSONObject, "press_start_actions", value.f8795B, pVar);
            l7.c.q(context, jSONObject, "reuse_id", value.f8796C);
            l7.c.q(context, jSONObject, "row_span", value.f8797D);
            l7.c.v(context, jSONObject, "selected_actions", value.f8798E, pVar);
            l7.c.v(context, jSONObject, "tooltips", value.f8799F, uc.f6582Q8);
            l7.c.u(context, jSONObject, "transform", value.f8800G, uc.f6615T8);
            l7.c.u(context, jSONObject, "transition_change", value.f8801H, uc.f6597S1);
            AbstractC5371a<J2> abstractC5371a4 = value.f8802I;
            b9.p pVar4 = uc.f6938x1;
            l7.c.u(context, jSONObject, "transition_in", abstractC5371a4, pVar4);
            l7.c.u(context, jSONObject, "transition_out", value.f8803J, pVar4);
            l7.c.w(context, jSONObject, value.f8804K, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "separator");
            l7.c.v(context, jSONObject, "variable_triggers", value.f8805L, uc.f6647W8);
            l7.c.v(context, jSONObject, "variables", value.f8806M, uc.f6715c9);
            l7.c.p(context, "visibility", value.f8807N, jSONObject, EnumC1356sc.TO_STRING);
            AbstractC5371a<C1398vc> abstractC5371a5 = value.f8808O;
            b9.p pVar5 = uc.f6849o9;
            l7.c.u(context, jSONObject, "visibility_action", abstractC5371a5, pVar5);
            l7.c.v(context, jSONObject, "visibility_actions", value.f8809P, pVar5);
            l7.c.u(context, jSONObject, "width", value.f8810Q, pVar2);
            return jSONObject;
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    /* renamed from: N7.m9$f */
    public static final class f implements D7.j<JSONObject, C1284n9, C1242k9> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8775a;

        public f(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8775a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v15, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v21, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v65, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1242k9 a(D7.f context, C1284n9 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f8775a;
            C1130d0 c1130d0 = (C1130d0) l7.d.h(context, template.f8811a, data, "accessibility", uc.f6501J, uc.f6479H);
            C1175g0 c1175g0 = (C1175g0) l7.d.h(context, template.f8812b, data, "action", uc.f6789j1, uc.f6766h1);
            C1332r2 c1332r2 = (C1332r2) l7.d.h(context, template.f8813c, data, "action_animation", uc.f6852p1, uc.f6831n1);
            if (c1332r2 == null) {
                c1332r2 = C1270m9.f8758a;
            }
            C1332r2 c1332r22 = c1332r2;
            kotlin.jvm.internal.l.e(c1332r22, "JsonFieldResolver.resolv…N_ANIMATION_DEFAULT_VALUE");
            List listQ = l7.d.q(context, template.f8814d, data, "actions", uc.f6789j1, uc.f6766h1);
            A7.b bVarK = l7.d.k(context, template.f8815e, data, "alignment_horizontal", C1270m9.f8764g, EnumC1305p2.FROM_STRING);
            A7.b bVarK2 = l7.d.k(context, template.f8816f, data, "alignment_vertical", C1270m9.f8765h, EnumC1319q2.FROM_STRING);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            C1154e9 c1154e9 = C1270m9.f8766j;
            b.C0000b c0000b = C1270m9.f8759b;
            ?? N8 = l7.d.n(context, template.f8817g, data, "alpha", dVar, dVar2, c1154e9, c0000b);
            if (N8 != 0) {
                c0000b = N8;
            }
            List listQ2 = l7.d.q(context, template.f8818h, data, "animators", uc.f6884s1, uc.f6863q1);
            List listQ3 = l7.d.q(context, template.i, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6451E1, uc.f6429C1);
            X2 x22 = (X2) l7.d.h(context, template.f8819j, data, "border", uc.f6514K1, uc.f6492I1);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b2 = C1270m9.f8760c;
            ?? L7 = l7.d.l(context, template.f8820k, data, "capture_focus_on_action", aVar, aVar2, c0000b2);
            b.C0000b c0000b3 = L7 == 0 ? c0000b2 : L7;
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarM = l7.d.m(context, template.f8821l, data, "column_span", eVar, eVar2, C1270m9.f8767k);
            C1242k9.a aVar3 = (C1242k9.a) l7.d.h(context, template.f8822m, data, "delimiter_style", uc.f6497I6, uc.f6477G6);
            List listQ4 = l7.d.q(context, template.f8823n, data, "disappear_actions", uc.f6555O2, uc.f6535M2);
            List listQ5 = l7.d.q(context, template.f8824o, data, "doubletap_actions", uc.f6789j1, uc.f6766h1);
            List listQ6 = l7.d.q(context, template.f8825p, data, "extensions", uc.f6685a3, uc.f6662Y2);
            Z4 z42 = (Z4) l7.d.h(context, template.f8826q, data, "focus", uc.f6951y3, uc.f6929w3);
            List listQ7 = l7.d.q(context, template.f8827r, data, "functions", uc.f6483H3, uc.f6463F3);
            C9 c92 = (C9) l7.d.h(context, template.f8828s, data, "height", uc.U6, uc.f6602S6);
            if (c92 == null) {
                c92 = C1270m9.f8761d;
            }
            C9 c93 = c92;
            kotlin.jvm.internal.l.e(c93, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            List listQ8 = l7.d.q(context, template.f8829t, data, "hover_end_actions", uc.f6789j1, uc.f6766h1);
            List listQ9 = l7.d.q(context, template.f8830u, data, "hover_start_actions", uc.f6789j1, uc.f6766h1);
            String str = (String) l7.d.g(context, FacebookMediationAdapter.KEY_ID, template.f8831v, data, l7.e.f43878b);
            L6 l62 = (L6) l7.d.h(context, template.f8832w, data, "layout_provider", uc.f6528L4, uc.f6506J4);
            List listQ10 = l7.d.q(context, template.f8833x, data, "longtap_actions", uc.f6789j1, uc.f6766h1);
            C1362t4 c1362t4 = (C1362t4) l7.d.h(context, template.f8834y, data, "margins", uc.f6652X2, uc.f6630V2);
            C1362t4 c1362t42 = (C1362t4) l7.d.h(context, template.f8835z, data, "paddings", uc.f6652X2, uc.f6630V2);
            List listQ11 = l7.d.q(context, template.f8794A, data, "press_end_actions", uc.f6789j1, uc.f6766h1);
            List listQ12 = l7.d.q(context, template.f8795B, data, "press_start_actions", uc.f6789j1, uc.f6766h1);
            A7.b bVarJ = l7.d.j(context, template.f8796C, data, "reuse_id", l7.k.f43898c);
            A7.b bVarM2 = l7.d.m(context, template.f8797D, data, "row_span", eVar, eVar2, C1270m9.f8768l);
            List listQ13 = l7.d.q(context, template.f8798E, data, "selected_actions", uc.f6789j1, uc.f6766h1);
            List listQ14 = l7.d.q(context, template.f8799F, data, "tooltips", uc.f6593R8, uc.f6572P8);
            Qb qb = (Qb) l7.d.h(context, template.f8800G, data, "transform", uc.f6625U8, uc.f6604S8);
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) l7.d.h(context, template.f8801H, data, "transition_change", uc.f6608T1, uc.f6586R1);
            F2 f22 = (F2) l7.d.h(context, template.f8802I, data, "transition_in", uc.f6949y1, uc.f6927w1);
            F2 f23 = (F2) l7.d.h(context, template.f8803J, data, "transition_out", uc.f6949y1, uc.f6927w1);
            List listR = l7.d.r(context, template.f8804K, data, Ub.FROM_STRING, C1270m9.f8769m);
            List listQ15 = l7.d.q(context, template.f8805L, data, "variable_triggers", uc.f6657X8, uc.f6636V8);
            List listQ16 = l7.d.q(context, template.f8806M, data, "variables", uc.f6727d9, uc.f6703b9);
            l7.i iVar = C1270m9.i;
            p9.l<String, EnumC1356sc> lVar = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b4 = C1270m9.f8762e;
            ?? L8 = l7.d.l(context, template.f8807N, data, "visibility", iVar, lVar, c0000b4);
            if (L8 != 0) {
                c0000b4 = L8;
            }
            C1370tc c1370tc = (C1370tc) l7.d.h(context, template.f8808O, data, "visibility_action", uc.f6860p9, uc.n9);
            List listQ17 = l7.d.q(context, template.f8809P, data, "visibility_actions", uc.f6860p9, uc.n9);
            C9 c94 = (C9) l7.d.h(context, template.f8810Q, data, "width", uc.U6, uc.f6602S6);
            if (c94 == null) {
                c94 = C1270m9.f8763f;
            }
            kotlin.jvm.internal.l.e(c94, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1242k9(c1130d0, c1175g0, c1332r22, listQ, bVarK, bVarK2, c0000b, listQ2, listQ3, x22, c0000b3, bVarM, aVar3, listQ4, listQ5, listQ6, z42, listQ7, c93, listQ8, listQ9, str, l62, listQ10, c1362t4, c1362t42, listQ11, listQ12, bVarJ, bVarM2, listQ13, listQ14, qb, abstractC1178g3, f22, f23, listR, listQ15, listQ16, c0000b4, c1370tc, listQ17, c94);
        }
    }

    static {
        Object objM = C2091l.m(EnumC1305p2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f8770g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f8764g = new l7.i(objM, validator);
        Object objM2 = C2091l.m(EnumC1319q2.values());
        kotlin.jvm.internal.l.f(objM2, "default");
        b validator2 = b.f8771g;
        kotlin.jvm.internal.l.f(validator2, "validator");
        f8765h = new l7.i(objM2, validator2);
        Object objM3 = C2091l.m(EnumC1356sc.values());
        kotlin.jvm.internal.l.f(objM3, "default");
        c validator3 = c.f8772g;
        kotlin.jvm.internal.l.f(validator3, "validator");
        i = new l7.i(objM3, validator3);
        f8766j = new C1154e9(1);
        f8767k = new G8(3);
        f8768l = new C1094a9(3);
        f8769m = new H7(4);
    }
}
