package N7;

import A7.b;
import N7.C9;
import N7.L9;
import N7.Q9;
import c9.C2091l;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes.dex */
public final class M9 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5863a = b.a.a(Double.valueOf(1.0d));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final C9.c f5864b = new C9.c(new C1412wc(null, null, null));

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5865c = b.a.a(Boolean.TRUE);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5866d = b.a.a(100L);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5867e = b.a.a(0L);

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5868f = b.a.a(EnumC1356sc.VISIBLE);

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final C9.b f5869g = new C9.b(new V6(null));

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final l7.i f5870h;

    @Deprecated
    public static final l7.i i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final l7.i f5871j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final H7 f5872k;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final B8 f5873l;

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final C1154e9 f5874m;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final G8 f5875n;

    /* compiled from: DivSliderJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f5876g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1305p2);
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f5877g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1319q2);
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f5878g = new c(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1356sc);
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class d implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5879a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5879a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v23, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v29, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v31, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v7, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v73, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final L9 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f5879a;
            C1130d0 c1130d0 = (C1130d0) k8.F.q(context, data, "accessibility", uc.f6479H);
            l7.i iVar = M9.f5870h;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "alignment_horizontal", iVar, lVar, lVar2, null);
            A7.b bVarB2 = l7.b.b(context, data, "alignment_vertical", M9.i, EnumC1319q2.FROM_STRING, lVar2, null);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            H7 h72 = M9.f5872k;
            b.C0000b c0000b = M9.f5863a;
            ?? B10 = l7.b.b(context, data, "alpha", dVar, dVar2, h72, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            List listS = k8.F.s(context, data, "animators", uc.f6863q1);
            List listS2 = k8.F.s(context, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6429C1);
            X2 x22 = (X2) k8.F.q(context, data, "border", uc.f6492I1);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarB3 = l7.b.b(context, data, "column_span", eVar, eVar2, M9.f5873l, null);
            List listS3 = k8.F.s(context, data, "disappear_actions", uc.f6535M2);
            List listS4 = k8.F.s(context, data, "extensions", uc.f6662Y2);
            Z4 z42 = (Z4) k8.F.q(context, data, "focus", uc.f6929w3);
            List listS5 = k8.F.s(context, data, "functions", uc.f6463F3);
            b9.p pVar = uc.f6602S6;
            C9 c92 = (C9) k8.F.q(context, data, "height", pVar);
            if (c92 == null) {
                c92 = M9.f5864b;
            }
            kotlin.jvm.internal.l.e(c92, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            A8.d dVar3 = l7.e.f43878b;
            String str = (String) k8.F.r(context, data, FacebookMediationAdapter.KEY_ID, dVar3, lVar2);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b3 = M9.f5865c;
            C9 c93 = c92;
            ?? B11 = l7.b.b(context, data, "is_enabled", aVar, aVar2, lVar2, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            L6 l62 = (L6) k8.F.q(context, data, "layout_provider", uc.f6506J4);
            b9.p pVar2 = uc.f6630V2;
            C1362t4 c1362t4 = (C1362t4) k8.F.q(context, data, "margins", pVar2);
            b.C0000b c0000b5 = M9.f5866d;
            ?? B12 = l7.b.b(context, data, "max_value", eVar, eVar2, lVar2, c0000b5);
            b.C0000b c0000b6 = B12 == 0 ? c0000b5 : B12;
            b.C0000b c0000b7 = M9.f5867e;
            ?? B13 = l7.b.b(context, data, "min_value", eVar, eVar2, lVar2, c0000b7);
            b.C0000b c0000b8 = B13 == 0 ? c0000b7 : B13;
            C1362t4 c1362t42 = (C1362t4) k8.F.q(context, data, "paddings", pVar2);
            List listS6 = k8.F.s(context, data, "ranges", uc.f6736e7);
            A7.b bVarB4 = l7.b.b(context, data, "reuse_id", l7.k.f43898c, dVar3, lVar2, null);
            A7.b bVarB5 = l7.b.b(context, data, "row_span", eVar, eVar2, M9.f5874m, null);
            C1130d0 c1130d02 = (C1130d0) k8.F.q(context, data, "secondary_value_accessibility", uc.f6479H);
            List listS7 = k8.F.s(context, data, "selected_actions", uc.f6766h1);
            b9.p pVar3 = uc.f6598S2;
            AbstractC1293o4 abstractC1293o4 = (AbstractC1293o4) k8.F.q(context, data, "thumb_secondary_style", pVar3);
            b9.p pVar4 = uc.f6701b7;
            L9.b bVar = (L9.b) k8.F.q(context, data, "thumb_secondary_text_style", pVar4);
            String str2 = (String) k8.F.r(context, data, "thumb_secondary_value_variable", dVar3, lVar2);
            AbstractC1293o4 abstractC1293o42 = (AbstractC1293o4) k8.F.l(context, data, "thumb_style", pVar3);
            L9.b bVar2 = (L9.b) k8.F.q(context, data, "thumb_text_style", pVar4);
            String str3 = (String) k8.F.r(context, data, "thumb_value_variable", dVar3, lVar2);
            AbstractC1293o4 abstractC1293o43 = (AbstractC1293o4) k8.F.q(context, data, "tick_mark_active_style", pVar3);
            AbstractC1293o4 abstractC1293o44 = (AbstractC1293o4) k8.F.q(context, data, "tick_mark_inactive_style", pVar3);
            List listS8 = k8.F.s(context, data, "tooltips", uc.f6572P8);
            AbstractC1293o4 abstractC1293o45 = (AbstractC1293o4) k8.F.l(context, data, "track_active_style", pVar3);
            AbstractC1293o4 abstractC1293o46 = (AbstractC1293o4) k8.F.l(context, data, "track_inactive_style", pVar3);
            Qb qb = (Qb) k8.F.q(context, data, "transform", uc.f6604S8);
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) k8.F.q(context, data, "transition_change", uc.f6586R1);
            b9.p pVar5 = uc.f6927w1;
            F2 f22 = (F2) k8.F.q(context, data, "transition_in", pVar5);
            F2 f23 = (F2) k8.F.q(context, data, "transition_out", pVar5);
            List listU = k8.F.u(context, data, "transition_triggers", Ub.FROM_STRING, M9.f5875n);
            List listS9 = k8.F.s(context, data, "variable_triggers", uc.f6636V8);
            List listS10 = k8.F.s(context, data, "variables", uc.f6703b9);
            l7.i iVar2 = M9.f5871j;
            p9.l<String, EnumC1356sc> lVar3 = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b9 = M9.f5868f;
            ?? B14 = l7.b.b(context, data, "visibility", iVar2, lVar3, lVar2, c0000b9);
            if (B14 != 0) {
                c0000b9 = B14;
            }
            b9.p pVar6 = uc.n9;
            C1370tc c1370tc = (C1370tc) k8.F.q(context, data, "visibility_action", pVar6);
            List listS11 = k8.F.s(context, data, "visibility_actions", pVar6);
            C9 c94 = (C9) k8.F.q(context, data, "width", pVar);
            if (c94 == null) {
                c94 = M9.f5869g;
            }
            kotlin.jvm.internal.l.e(c94, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new L9(c1130d0, bVarB, bVarB2, c0000b2, listS, listS2, x22, bVarB3, listS3, listS4, z42, listS5, c93, str, c0000b4, l62, c1362t4, c0000b6, c0000b8, c1362t42, listS6, bVarB4, bVarB5, c1130d02, listS7, abstractC1293o4, bVar, str2, abstractC1293o42, bVar2, str3, abstractC1293o43, abstractC1293o44, listS8, abstractC1293o45, abstractC1293o46, qb, abstractC1178g3, f22, f23, listU, listS9, listS10, c0000b9, c1370tc, listS11, c94);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, L9 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f5879a;
            k8.F.z(context, jSONObject, "accessibility", value.f5782a, uc.f6479H);
            l7.b.e(context, jSONObject, "alignment_horizontal", value.f5783b, EnumC1305p2.TO_STRING);
            l7.b.e(context, jSONObject, "alignment_vertical", value.f5784c, EnumC1319q2.TO_STRING);
            l7.b.d(context, jSONObject, "alpha", value.f5785d);
            k8.F.B(context, jSONObject, "animators", value.f5786e, uc.f6863q1);
            k8.F.B(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f5787f, uc.f6429C1);
            k8.F.z(context, jSONObject, "border", value.f5788g, uc.f6492I1);
            l7.b.d(context, jSONObject, "column_span", value.f5789h);
            k8.F.B(context, jSONObject, "disappear_actions", value.i, uc.f6535M2);
            k8.F.B(context, jSONObject, "extensions", value.f5790j, uc.f6662Y2);
            k8.F.z(context, jSONObject, "focus", value.f5791k, uc.f6929w3);
            k8.F.B(context, jSONObject, "functions", value.f5792l, uc.f6463F3);
            C9 c92 = value.f5793m;
            b9.p pVar = uc.f6602S6;
            k8.F.z(context, jSONObject, "height", c92, pVar);
            k8.F.y(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f5794n);
            l7.b.d(context, jSONObject, "is_enabled", value.f5795o);
            k8.F.z(context, jSONObject, "layout_provider", value.f5796p, uc.f6506J4);
            C1362t4 c1362t4 = value.f5797q;
            b9.p pVar2 = uc.f6630V2;
            k8.F.z(context, jSONObject, "margins", c1362t4, pVar2);
            l7.b.d(context, jSONObject, "max_value", value.f5798r);
            l7.b.d(context, jSONObject, "min_value", value.f5799s);
            k8.F.z(context, jSONObject, "paddings", value.f5800t, pVar2);
            k8.F.B(context, jSONObject, "ranges", value.f5801u, uc.f6736e7);
            l7.b.d(context, jSONObject, "reuse_id", value.f5802v);
            l7.b.d(context, jSONObject, "row_span", value.f5803w);
            k8.F.z(context, jSONObject, "secondary_value_accessibility", value.f5804x, uc.f6479H);
            k8.F.B(context, jSONObject, "selected_actions", value.f5805y, uc.f6766h1);
            AbstractC1293o4 abstractC1293o4 = value.f5806z;
            b9.p pVar3 = uc.f6598S2;
            k8.F.z(context, jSONObject, "thumb_secondary_style", abstractC1293o4, pVar3);
            L9.b bVar = value.f5760A;
            b9.p pVar4 = uc.f6701b7;
            k8.F.z(context, jSONObject, "thumb_secondary_text_style", bVar, pVar4);
            k8.F.y(context, jSONObject, "thumb_secondary_value_variable", value.f5761B);
            k8.F.z(context, jSONObject, "thumb_style", value.f5762C, pVar3);
            k8.F.z(context, jSONObject, "thumb_text_style", value.f5763D, pVar4);
            k8.F.y(context, jSONObject, "thumb_value_variable", value.f5764E);
            k8.F.z(context, jSONObject, "tick_mark_active_style", value.f5765F, pVar3);
            k8.F.z(context, jSONObject, "tick_mark_inactive_style", value.f5766G, pVar3);
            k8.F.B(context, jSONObject, "tooltips", value.f5767H, uc.f6572P8);
            k8.F.z(context, jSONObject, "track_active_style", value.f5768I, pVar3);
            k8.F.z(context, jSONObject, "track_inactive_style", value.f5769J, pVar3);
            k8.F.z(context, jSONObject, "transform", value.f5770K, uc.f6604S8);
            k8.F.z(context, jSONObject, "transition_change", value.f5771L, uc.f6586R1);
            F2 f22 = value.f5772M;
            b9.p pVar5 = uc.f6927w1;
            k8.F.z(context, jSONObject, "transition_in", f22, pVar5);
            k8.F.z(context, jSONObject, "transition_out", value.f5773N, pVar5);
            k8.F.C(context, jSONObject, value.f5774O, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "slider");
            k8.F.B(context, jSONObject, "variable_triggers", value.f5775P, uc.f6636V8);
            k8.F.B(context, jSONObject, "variables", value.f5776Q, uc.f6703b9);
            l7.b.e(context, jSONObject, "visibility", value.f5777R, EnumC1356sc.TO_STRING);
            C1370tc c1370tc = value.f5778S;
            b9.p pVar6 = uc.n9;
            k8.F.z(context, jSONObject, "visibility_action", c1370tc, pVar6);
            k8.F.B(context, jSONObject, "visibility_actions", value.f5779T, pVar6);
            k8.F.z(context, jSONObject, "width", value.f5780U, pVar);
            return jSONObject;
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class e implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5880a;

        public e(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5880a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final Q9 d(D7.f fVar, Q9 q92, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a<C1160f0> abstractC5371a = q92 != null ? q92.f6062a : null;
            Uc uc = this.f5880a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "accessibility", zP, abstractC5371a, uc.f6490I);
            l7.i iVar = M9.f5870h;
            AbstractC5371a<A7.b<EnumC1305p2>> abstractC5371a2 = q92 != null ? q92.f6063b : null;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "alignment_horizontal", iVar, zP, abstractC5371a2, lVar, lVar2);
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "alignment_vertical", M9.i, zP, q92 != null ? q92.f6064c : null, EnumC1319q2.FROM_STRING, lVar2);
            AbstractC5371a abstractC5371aJ3 = l7.c.j(fVarW, jSONObject, "alpha", l7.k.f43899d, zP, q92 != null ? q92.f6065d : null, l7.h.f43885f, M9.f5872k);
            AbstractC5371a abstractC5371aK = l7.c.k(fVarW, jSONObject, "animators", zP, q92 != null ? q92.f6066e : null, uc.f6874r1);
            AbstractC5371a abstractC5371aK2 = l7.c.k(fVarW, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, zP, q92 != null ? q92.f6067f : null, uc.f6440D1);
            AbstractC5371a abstractC5371aH2 = l7.c.h(fVarW, jSONObject, "border", zP, q92 != null ? q92.f6068g : null, uc.f6503J1);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a3 = q92 != null ? q92.f6069h : null;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aJ4 = l7.c.j(fVarW, jSONObject, "column_span", eVar, zP, abstractC5371a3, eVar2, M9.f5873l);
            AbstractC5371a abstractC5371aK3 = l7.c.k(fVarW, jSONObject, "disappear_actions", zP, q92 != null ? q92.i : null, uc.f6545N2);
            AbstractC5371a abstractC5371aK4 = l7.c.k(fVarW, jSONObject, "extensions", zP, q92 != null ? q92.f6070j : null, uc.f6673Z2);
            AbstractC5371a abstractC5371aH3 = l7.c.h(fVarW, jSONObject, "focus", zP, q92 != null ? q92.f6071k : null, uc.f6940x3);
            AbstractC5371a abstractC5371aK5 = l7.c.k(fVarW, jSONObject, "functions", zP, q92 != null ? q92.f6072l : null, uc.f6474G3);
            AbstractC5371a abstractC5371aH4 = l7.c.h(fVarW, jSONObject, "height", zP, q92 != null ? q92.f6073m : null, uc.f6613T6);
            AbstractC5371a<String> abstractC5371a4 = q92 != null ? q92.f6074n : null;
            A8.d dVar = l7.e.f43878b;
            AbstractC5371a abstractC5371aI = l7.c.i(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, zP, abstractC5371a4, dVar);
            AbstractC5371a abstractC5371aJ5 = l7.c.j(fVarW, jSONObject, "is_enabled", l7.k.f43896a, zP, q92 != null ? q92.f6075o : null, l7.h.f43884e, lVar2);
            AbstractC5371a abstractC5371aH5 = l7.c.h(fVarW, jSONObject, "layout_provider", zP, q92 != null ? q92.f6076p : null, uc.f6517K4);
            AbstractC5371a abstractC5371aH6 = l7.c.h(fVarW, jSONObject, "margins", zP, q92 != null ? q92.f6077q : null, uc.f6641W2);
            AbstractC5371a abstractC5371aJ6 = l7.c.j(fVarW, jSONObject, "max_value", eVar, zP, q92 != null ? q92.f6078r : null, eVar2, lVar2);
            AbstractC5371a abstractC5371aJ7 = l7.c.j(fVarW, jSONObject, "min_value", eVar, zP, q92 != null ? q92.f6079s : null, eVar2, lVar2);
            AbstractC5371a abstractC5371aH7 = l7.c.h(fVarW, jSONObject, "paddings", zP, q92 != null ? q92.f6080t : null, uc.f6641W2);
            AbstractC5371a abstractC5371aK6 = l7.c.k(fVarW, jSONObject, "ranges", zP, q92 != null ? q92.f6081u : null, uc.f6748f7);
            AbstractC5371a abstractC5371aJ8 = l7.c.j(fVarW, jSONObject, "reuse_id", l7.k.f43898c, zP, q92 != null ? q92.f6082v : null, dVar, lVar2);
            AbstractC5371a abstractC5371aJ9 = l7.c.j(fVarW, jSONObject, "row_span", eVar, zP, q92 != null ? q92.f6083w : null, eVar2, M9.f5874m);
            AbstractC5371a abstractC5371aH8 = l7.c.h(fVarW, jSONObject, "secondary_value_accessibility", zP, q92 != null ? q92.f6084x : null, uc.f6490I);
            AbstractC5371a abstractC5371aK7 = l7.c.k(fVarW, jSONObject, "selected_actions", zP, q92 != null ? q92.f6085y : null, uc.f6777i1);
            AbstractC5371a abstractC5371aH9 = l7.c.h(fVarW, jSONObject, "thumb_secondary_style", zP, q92 != null ? q92.f6086z : null, uc.f6609T2);
            AbstractC5371a abstractC5371aH10 = l7.c.h(fVarW, jSONObject, "thumb_secondary_text_style", zP, q92 != null ? q92.f6041A : null, uc.f6713c7);
            AbstractC5371a abstractC5371aI2 = l7.c.i(fVarW, jSONObject, "thumb_secondary_value_variable", zP, q92 != null ? q92.f6042B : null, dVar);
            AbstractC5371a abstractC5371aB = l7.c.b(fVarW, jSONObject, "thumb_style", zP, q92 != null ? q92.f6043C : null, uc.f6609T2);
            AbstractC5371a abstractC5371aH11 = l7.c.h(fVarW, jSONObject, "thumb_text_style", zP, q92 != null ? q92.f6044D : null, uc.f6713c7);
            AbstractC5371a abstractC5371aI3 = l7.c.i(fVarW, jSONObject, "thumb_value_variable", zP, q92 != null ? q92.f6045E : null, dVar);
            AbstractC5371a abstractC5371aH12 = l7.c.h(fVarW, jSONObject, "tick_mark_active_style", zP, q92 != null ? q92.f6046F : null, uc.f6609T2);
            AbstractC5371a abstractC5371aH13 = l7.c.h(fVarW, jSONObject, "tick_mark_inactive_style", zP, q92 != null ? q92.f6047G : null, uc.f6609T2);
            AbstractC5371a abstractC5371aK8 = l7.c.k(fVarW, jSONObject, "tooltips", zP, q92 != null ? q92.f6048H : null, uc.f6582Q8);
            AbstractC5371a abstractC5371aB2 = l7.c.b(fVarW, jSONObject, "track_active_style", zP, q92 != null ? q92.f6049I : null, uc.f6609T2);
            AbstractC5371a abstractC5371aB3 = l7.c.b(fVarW, jSONObject, "track_inactive_style", zP, q92 != null ? q92.f6050J : null, uc.f6609T2);
            AbstractC5371a abstractC5371aH14 = l7.c.h(fVarW, jSONObject, "transform", zP, q92 != null ? q92.f6051K : null, uc.f6615T8);
            AbstractC5371a abstractC5371aH15 = l7.c.h(fVarW, jSONObject, "transition_change", zP, q92 != null ? q92.f6052L : null, uc.f6597S1);
            AbstractC5371a abstractC5371aH16 = l7.c.h(fVarW, jSONObject, "transition_in", zP, q92 != null ? q92.f6053M : null, uc.f6938x1);
            AbstractC5371a abstractC5371aH17 = l7.c.h(fVarW, jSONObject, "transition_out", zP, q92 != null ? q92.f6054N : null, uc.f6938x1);
            AbstractC5371a<List<Ub>> abstractC5371a5 = q92 != null ? q92.f6055O : null;
            p9.l<String, Ub> lVar3 = Ub.FROM_STRING;
            G8 g82 = M9.f5875n;
            kotlin.jvm.internal.l.d(g82, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new Q9(abstractC5371aH, abstractC5371aJ, abstractC5371aJ2, abstractC5371aJ3, abstractC5371aK, abstractC5371aK2, abstractC5371aH2, abstractC5371aJ4, abstractC5371aK3, abstractC5371aK4, abstractC5371aH3, abstractC5371aK5, abstractC5371aH4, abstractC5371aI, abstractC5371aJ5, abstractC5371aH5, abstractC5371aH6, abstractC5371aJ6, abstractC5371aJ7, abstractC5371aH7, abstractC5371aK6, abstractC5371aJ8, abstractC5371aJ9, abstractC5371aH8, abstractC5371aK7, abstractC5371aH9, abstractC5371aH10, abstractC5371aI2, abstractC5371aB, abstractC5371aH11, abstractC5371aI3, abstractC5371aH12, abstractC5371aH13, abstractC5371aK8, abstractC5371aB2, abstractC5371aB3, abstractC5371aH14, abstractC5371aH15, abstractC5371aH16, abstractC5371aH17, l7.c.m(fVarW, jSONObject, zP, abstractC5371a5, lVar3, g82), l7.c.k(fVarW, jSONObject, "variable_triggers", zP, q92 != null ? q92.f6056P : null, uc.f6647W8), l7.c.k(fVarW, jSONObject, "variables", zP, q92 != null ? q92.f6057Q : null, uc.f6715c9), l7.c.j(fVarW, jSONObject, "visibility", M9.f5871j, zP, q92 != null ? q92.f6058R : null, EnumC1356sc.FROM_STRING, lVar2), l7.c.h(fVarW, jSONObject, "visibility_action", zP, q92 != null ? q92.f6059S : null, uc.f6849o9), l7.c.k(fVarW, jSONObject, "visibility_actions", zP, q92 != null ? q92.f6060T : null, uc.f6849o9), l7.c.h(fVarW, jSONObject, "width", zP, q92 != null ? q92.f6061U : null, uc.f6613T6));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Q9 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f5880a;
            l7.c.u(context, jSONObject, "accessibility", value.f6062a, uc.f6490I);
            l7.c.p(context, "alignment_horizontal", value.f6063b, jSONObject, EnumC1305p2.TO_STRING);
            l7.c.p(context, "alignment_vertical", value.f6064c, jSONObject, EnumC1319q2.TO_STRING);
            l7.c.q(context, jSONObject, "alpha", value.f6065d);
            l7.c.v(context, jSONObject, "animators", value.f6066e, uc.f6874r1);
            l7.c.v(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f6067f, uc.f6440D1);
            l7.c.u(context, jSONObject, "border", value.f6068g, uc.f6503J1);
            l7.c.q(context, jSONObject, "column_span", value.f6069h);
            l7.c.v(context, jSONObject, "disappear_actions", value.i, uc.f6545N2);
            l7.c.v(context, jSONObject, "extensions", value.f6070j, uc.f6673Z2);
            l7.c.u(context, jSONObject, "focus", value.f6071k, uc.f6940x3);
            l7.c.v(context, jSONObject, "functions", value.f6072l, uc.f6474G3);
            AbstractC5371a<G9> abstractC5371a = value.f6073m;
            b9.p pVar = uc.f6613T6;
            l7.c.u(context, jSONObject, "height", abstractC5371a, pVar);
            l7.c.t(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f6074n);
            l7.c.q(context, jSONObject, "is_enabled", value.f6075o);
            l7.c.u(context, jSONObject, "layout_provider", value.f6076p, uc.f6517K4);
            AbstractC5371a<C1390v4> abstractC5371a2 = value.f6077q;
            b9.p pVar2 = uc.f6641W2;
            l7.c.u(context, jSONObject, "margins", abstractC5371a2, pVar2);
            l7.c.q(context, jSONObject, "max_value", value.f6078r);
            l7.c.q(context, jSONObject, "min_value", value.f6079s);
            l7.c.u(context, jSONObject, "paddings", value.f6080t, pVar2);
            l7.c.v(context, jSONObject, "ranges", value.f6081u, uc.f6748f7);
            l7.c.q(context, jSONObject, "reuse_id", value.f6082v);
            l7.c.q(context, jSONObject, "row_span", value.f6083w);
            l7.c.u(context, jSONObject, "secondary_value_accessibility", value.f6084x, uc.f6490I);
            l7.c.v(context, jSONObject, "selected_actions", value.f6085y, uc.f6777i1);
            AbstractC5371a<AbstractC1348s4> abstractC5371a3 = value.f6086z;
            b9.p pVar3 = uc.f6609T2;
            l7.c.u(context, jSONObject, "thumb_secondary_style", abstractC5371a3, pVar3);
            AbstractC5371a<Q9.b> abstractC5371a4 = value.f6041A;
            b9.p pVar4 = uc.f6713c7;
            l7.c.u(context, jSONObject, "thumb_secondary_text_style", abstractC5371a4, pVar4);
            l7.c.t(context, jSONObject, "thumb_secondary_value_variable", value.f6042B);
            l7.c.u(context, jSONObject, "thumb_style", value.f6043C, pVar3);
            l7.c.u(context, jSONObject, "thumb_text_style", value.f6044D, pVar4);
            l7.c.t(context, jSONObject, "thumb_value_variable", value.f6045E);
            l7.c.u(context, jSONObject, "tick_mark_active_style", value.f6046F, pVar3);
            l7.c.u(context, jSONObject, "tick_mark_inactive_style", value.f6047G, pVar3);
            l7.c.v(context, jSONObject, "tooltips", value.f6048H, uc.f6582Q8);
            l7.c.u(context, jSONObject, "track_active_style", value.f6049I, pVar3);
            l7.c.u(context, jSONObject, "track_inactive_style", value.f6050J, pVar3);
            l7.c.u(context, jSONObject, "transform", value.f6051K, uc.f6615T8);
            l7.c.u(context, jSONObject, "transition_change", value.f6052L, uc.f6597S1);
            AbstractC5371a<J2> abstractC5371a5 = value.f6053M;
            b9.p pVar5 = uc.f6938x1;
            l7.c.u(context, jSONObject, "transition_in", abstractC5371a5, pVar5);
            l7.c.u(context, jSONObject, "transition_out", value.f6054N, pVar5);
            l7.c.w(context, jSONObject, value.f6055O, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "slider");
            l7.c.v(context, jSONObject, "variable_triggers", value.f6056P, uc.f6647W8);
            l7.c.v(context, jSONObject, "variables", value.f6057Q, uc.f6715c9);
            l7.c.p(context, "visibility", value.f6058R, jSONObject, EnumC1356sc.TO_STRING);
            AbstractC5371a<C1398vc> abstractC5371a6 = value.f6059S;
            b9.p pVar6 = uc.f6849o9;
            l7.c.u(context, jSONObject, "visibility_action", abstractC5371a6, pVar6);
            l7.c.v(context, jSONObject, "visibility_actions", value.f6060T, pVar6);
            l7.c.u(context, jSONObject, "width", value.f6061U, pVar);
            return jSONObject;
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class f implements D7.j<JSONObject, Q9, L9> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5881a;

        public f(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5881a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v24, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v30, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v32, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v74, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v8, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final L9 a(D7.f context, Q9 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f5881a;
            C1130d0 c1130d0 = (C1130d0) l7.d.h(context, template.f6062a, data, "accessibility", uc.f6501J, uc.f6479H);
            A7.b bVarK = l7.d.k(context, template.f6063b, data, "alignment_horizontal", M9.f5870h, EnumC1305p2.FROM_STRING);
            A7.b bVarK2 = l7.d.k(context, template.f6064c, data, "alignment_vertical", M9.i, EnumC1319q2.FROM_STRING);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            H7 h72 = M9.f5872k;
            b.C0000b c0000b = M9.f5863a;
            ?? N8 = l7.d.n(context, template.f6065d, data, "alpha", dVar, dVar2, h72, c0000b);
            if (N8 != 0) {
                c0000b = N8;
            }
            List listQ = l7.d.q(context, template.f6066e, data, "animators", uc.f6884s1, uc.f6863q1);
            List listQ2 = l7.d.q(context, template.f6067f, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6451E1, uc.f6429C1);
            X2 x22 = (X2) l7.d.h(context, template.f6068g, data, "border", uc.f6514K1, uc.f6492I1);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarM = l7.d.m(context, template.f6069h, data, "column_span", eVar, eVar2, M9.f5873l);
            List listQ3 = l7.d.q(context, template.i, data, "disappear_actions", uc.f6555O2, uc.f6535M2);
            List listQ4 = l7.d.q(context, template.f6070j, data, "extensions", uc.f6685a3, uc.f6662Y2);
            Z4 z42 = (Z4) l7.d.h(context, template.f6071k, data, "focus", uc.f6951y3, uc.f6929w3);
            List listQ5 = l7.d.q(context, template.f6072l, data, "functions", uc.f6483H3, uc.f6463F3);
            C9 c92 = (C9) l7.d.h(context, template.f6073m, data, "height", uc.U6, uc.f6602S6);
            if (c92 == null) {
                c92 = M9.f5864b;
            }
            kotlin.jvm.internal.l.e(c92, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            AbstractC5371a<String> abstractC5371a = template.f6074n;
            A8.d dVar3 = l7.e.f43878b;
            String str = (String) l7.d.g(context, FacebookMediationAdapter.KEY_ID, abstractC5371a, data, dVar3);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b2 = M9.f5865c;
            C9 c93 = c92;
            b.C0000b c0000b3 = c0000b;
            ?? L7 = l7.d.l(context, template.f6075o, data, "is_enabled", aVar, aVar2, c0000b2);
            b.C0000b c0000b4 = L7 == 0 ? c0000b2 : L7;
            L6 l62 = (L6) l7.d.h(context, template.f6076p, data, "layout_provider", uc.f6528L4, uc.f6506J4);
            C1362t4 c1362t4 = (C1362t4) l7.d.h(context, template.f6077q, data, "margins", uc.f6652X2, uc.f6630V2);
            b.C0000b c0000b5 = M9.f5866d;
            ?? L8 = l7.d.l(context, template.f6078r, data, "max_value", eVar, eVar2, c0000b5);
            b.C0000b c0000b6 = L8 == 0 ? c0000b5 : L8;
            b.C0000b c0000b7 = M9.f5867e;
            ?? L10 = l7.d.l(context, template.f6079s, data, "min_value", eVar, eVar2, c0000b7);
            b.C0000b c0000b8 = L10 == 0 ? c0000b7 : L10;
            C1362t4 c1362t42 = (C1362t4) l7.d.h(context, template.f6080t, data, "paddings", uc.f6652X2, uc.f6630V2);
            List listQ6 = l7.d.q(context, template.f6081u, data, "ranges", uc.f6760g7, uc.f6736e7);
            A7.b bVarJ = l7.d.j(context, template.f6082v, data, "reuse_id", l7.k.f43898c);
            A7.b bVarM2 = l7.d.m(context, template.f6083w, data, "row_span", eVar, eVar2, M9.f5874m);
            C1130d0 c1130d02 = (C1130d0) l7.d.h(context, template.f6084x, data, "secondary_value_accessibility", uc.f6501J, uc.f6479H);
            List listQ7 = l7.d.q(context, template.f6085y, data, "selected_actions", uc.f6789j1, uc.f6766h1);
            AbstractC1293o4 abstractC1293o4 = (AbstractC1293o4) l7.d.h(context, template.f6086z, data, "thumb_secondary_style", uc.f6620U2, uc.f6598S2);
            L9.b bVar = (L9.b) l7.d.h(context, template.f6041A, data, "thumb_secondary_text_style", uc.f6725d7, uc.f6701b7);
            String str2 = (String) l7.d.g(context, "thumb_secondary_value_variable", template.f6042B, data, dVar3);
            AbstractC1293o4 abstractC1293o42 = (AbstractC1293o4) l7.d.a(context, template.f6043C, data, "thumb_style", uc.f6620U2, uc.f6598S2);
            L9.b bVar2 = (L9.b) l7.d.h(context, template.f6044D, data, "thumb_text_style", uc.f6725d7, uc.f6701b7);
            String str3 = (String) l7.d.g(context, "thumb_value_variable", template.f6045E, data, dVar3);
            AbstractC1293o4 abstractC1293o43 = (AbstractC1293o4) l7.d.h(context, template.f6046F, data, "tick_mark_active_style", uc.f6620U2, uc.f6598S2);
            AbstractC1293o4 abstractC1293o44 = (AbstractC1293o4) l7.d.h(context, template.f6047G, data, "tick_mark_inactive_style", uc.f6620U2, uc.f6598S2);
            List listQ8 = l7.d.q(context, template.f6048H, data, "tooltips", uc.f6593R8, uc.f6572P8);
            AbstractC1293o4 abstractC1293o45 = (AbstractC1293o4) l7.d.a(context, template.f6049I, data, "track_active_style", uc.f6620U2, uc.f6598S2);
            AbstractC1293o4 abstractC1293o46 = (AbstractC1293o4) l7.d.a(context, template.f6050J, data, "track_inactive_style", uc.f6620U2, uc.f6598S2);
            Qb qb = (Qb) l7.d.h(context, template.f6051K, data, "transform", uc.f6625U8, uc.f6604S8);
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) l7.d.h(context, template.f6052L, data, "transition_change", uc.f6608T1, uc.f6586R1);
            F2 f22 = (F2) l7.d.h(context, template.f6053M, data, "transition_in", uc.f6949y1, uc.f6927w1);
            F2 f23 = (F2) l7.d.h(context, template.f6054N, data, "transition_out", uc.f6949y1, uc.f6927w1);
            List listR = l7.d.r(context, template.f6055O, data, Ub.FROM_STRING, M9.f5875n);
            List listQ9 = l7.d.q(context, template.f6056P, data, "variable_triggers", uc.f6657X8, uc.f6636V8);
            List listQ10 = l7.d.q(context, template.f6057Q, data, "variables", uc.f6727d9, uc.f6703b9);
            l7.i iVar = M9.f5871j;
            p9.l<String, EnumC1356sc> lVar = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b9 = M9.f5868f;
            ?? L11 = l7.d.l(context, template.f6058R, data, "visibility", iVar, lVar, c0000b9);
            if (L11 != 0) {
                c0000b9 = L11;
            }
            C1370tc c1370tc = (C1370tc) l7.d.h(context, template.f6059S, data, "visibility_action", uc.f6860p9, uc.n9);
            List listQ11 = l7.d.q(context, template.f6060T, data, "visibility_actions", uc.f6860p9, uc.n9);
            C9 c94 = (C9) l7.d.h(context, template.f6061U, data, "width", uc.U6, uc.f6602S6);
            if (c94 == null) {
                c94 = M9.f5869g;
            }
            kotlin.jvm.internal.l.e(c94, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new L9(c1130d0, bVarK, bVarK2, c0000b3, listQ, listQ2, x22, bVarM, listQ3, listQ4, z42, listQ5, c93, str, c0000b4, l62, c1362t4, c0000b6, c0000b8, c1362t42, listQ6, bVarJ, bVarM2, c1130d02, listQ7, abstractC1293o4, bVar, str2, abstractC1293o42, bVar2, str3, abstractC1293o43, abstractC1293o44, listQ8, abstractC1293o45, abstractC1293o46, qb, abstractC1178g3, f22, f23, listR, listQ9, listQ10, c0000b9, c1370tc, listQ11, c94);
        }
    }

    static {
        Object objM = C2091l.m(EnumC1305p2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f5876g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f5870h = new l7.i(objM, validator);
        Object objM2 = C2091l.m(EnumC1319q2.values());
        kotlin.jvm.internal.l.f(objM2, "default");
        b validator2 = b.f5877g;
        kotlin.jvm.internal.l.f(validator2, "validator");
        i = new l7.i(objM2, validator2);
        Object objM3 = C2091l.m(EnumC1356sc.values());
        kotlin.jvm.internal.l.f(objM3, "default");
        c validator3 = c.f5878g;
        kotlin.jvm.internal.l.f(validator3, "validator");
        f5871j = new l7.i(objM3, validator3);
        f5872k = new H7(5);
        f5873l = new B8(5);
        f5874m = new C1154e9(3);
        f5875n = new G8(5);
    }
}
