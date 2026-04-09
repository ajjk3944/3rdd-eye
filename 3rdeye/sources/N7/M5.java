package N7;

import A7.b;
import N7.AbstractC1339r9;
import N7.C9;
import N7.G5;
import c9.C2091l;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivIndicatorJsonParser.kt */
/* loaded from: classes.dex */
public final class M5 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5833a = b.a.a(16768096);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5834b = b.a.a(Double.valueOf(1.3d));

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5835c = b.a.a(Double.valueOf(1.0d));

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5836d = b.a.a(G5.a.SCALE);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final C9.c f5837e = new C9.c(new C1412wc(null, null, null));

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5838f = b.a.a(865180853);

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5839g = b.a.a(Double.valueOf(0.5d));

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final AbstractC1339r9.b f5840h = new AbstractC1339r9.b(new W8(0));

    @Deprecated
    public static final W4 i = new W4(b.a.a(15L));

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5841j = b.a.a(EnumC1356sc.VISIBLE);

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final C9.b f5842k = new C9.b(new V6(null));

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final l7.i f5843l;

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final l7.i f5844m;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final l7.i f5845n;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final l7.i f5846o;

    /* renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final B4.i f5847p;

    /* renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final F3.h f5848q;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final B4.f f5849r;

    /* renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final B4.g f5850s;

    /* renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final B4.h f5851t;

    /* renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final B4.i f5852u;

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f5853g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1305p2);
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f5854g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1319q2);
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f5855g = new c(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof G5.a);
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class d extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final d f5856g = new d(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1356sc);
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class e implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5857a;

        public e(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5857a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v14, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v16, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v33, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v46, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v5, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v59, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v7, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final G5 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f5857a;
            C1130d0 c1130d0 = (C1130d0) k8.F.q(context, data, "accessibility", uc.f6479H);
            k.b bVar = l7.k.f43901f;
            h.f fVar = l7.h.f43881b;
            b.C0000b c0000b = M5.f5833a;
            j6.l lVar = l7.e.f43877a;
            ?? B10 = l7.b.b(context, data, "active_item_color", bVar, fVar, lVar, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B4.i iVar = M5.f5847p;
            b.C0000b c0000b3 = M5.f5834b;
            ?? B11 = l7.b.b(context, data, "active_item_size", dVar, dVar2, iVar, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            b9.p pVar = uc.f6879r6;
            W8 w82 = (W8) k8.F.q(context, data, "active_shape", pVar);
            A7.b bVarB = l7.b.b(context, data, "alignment_horizontal", M5.f5843l, EnumC1305p2.FROM_STRING, lVar, null);
            A7.b bVarB2 = l7.b.b(context, data, "alignment_vertical", M5.f5844m, EnumC1319q2.FROM_STRING, lVar, null);
            F3.h hVar = M5.f5848q;
            b.C0000b c0000b5 = M5.f5835c;
            ?? B12 = l7.b.b(context, data, "alpha", dVar, dVar2, hVar, c0000b5);
            b.C0000b c0000b6 = B12 == 0 ? c0000b5 : B12;
            l7.i iVar2 = M5.f5845n;
            p9.l<String, G5.a> lVar2 = G5.a.FROM_STRING;
            b.C0000b c0000b7 = M5.f5836d;
            ?? B13 = l7.b.b(context, data, "animation", iVar2, lVar2, lVar, c0000b7);
            b.C0000b c0000b8 = B13 == 0 ? c0000b7 : B13;
            List listS = k8.F.s(context, data, "animators", uc.f6863q1);
            List listS2 = k8.F.s(context, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6429C1);
            X2 x22 = (X2) k8.F.q(context, data, "border", uc.f6492I1);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarB3 = l7.b.b(context, data, "column_span", eVar, eVar2, M5.f5849r, null);
            List listS3 = k8.F.s(context, data, "disappear_actions", uc.f6535M2);
            List listS4 = k8.F.s(context, data, "extensions", uc.f6662Y2);
            Z4 z42 = (Z4) k8.F.q(context, data, "focus", uc.f6929w3);
            List listS5 = k8.F.s(context, data, "functions", uc.f6463F3);
            b9.p pVar2 = uc.f6602S6;
            C9 c92 = (C9) k8.F.q(context, data, "height", pVar2);
            if (c92 == null) {
                c92 = M5.f5837e;
            }
            kotlin.jvm.internal.l.e(c92, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            A8.d dVar3 = l7.e.f43878b;
            String str = (String) k8.F.r(context, data, FacebookMediationAdapter.KEY_ID, dVar3, lVar);
            b.C0000b c0000b9 = M5.f5838f;
            C9 c93 = c92;
            ?? B14 = l7.b.b(context, data, "inactive_item_color", bVar, fVar, lVar, c0000b9);
            b.C0000b c0000b10 = B14 == 0 ? c0000b9 : B14;
            W8 w83 = (W8) k8.F.q(context, data, "inactive_minimum_shape", pVar);
            W8 w84 = (W8) k8.F.q(context, data, "inactive_shape", pVar);
            H5 h52 = (H5) k8.F.q(context, data, "items_placement", uc.X3);
            L6 l62 = (L6) k8.F.q(context, data, "layout_provider", uc.f6506J4);
            b9.p pVar3 = uc.f6630V2;
            C1362t4 c1362t4 = (C1362t4) k8.F.q(context, data, "margins", pVar3);
            B4.g gVar = M5.f5850s;
            b.C0000b c0000b11 = M5.f5839g;
            ?? B15 = l7.b.b(context, data, "minimum_item_size", dVar, dVar2, gVar, c0000b11);
            b.C0000b c0000b12 = B15 == 0 ? c0000b11 : B15;
            C1362t4 c1362t42 = (C1362t4) k8.F.q(context, data, "paddings", pVar3);
            String str2 = (String) k8.F.r(context, data, "pager_id", dVar3, lVar);
            A7.b bVarB4 = l7.b.b(context, data, "reuse_id", l7.k.f43898c, dVar3, lVar, null);
            A7.b bVarB5 = l7.b.b(context, data, "row_span", eVar, eVar2, M5.f5851t, null);
            List listS6 = k8.F.s(context, data, "selected_actions", uc.f6766h1);
            AbstractC1339r9 abstractC1339r9 = (AbstractC1339r9) k8.F.q(context, data, "shape", uc.f6570P6);
            if (abstractC1339r9 == null) {
                abstractC1339r9 = M5.f5840h;
            }
            kotlin.jvm.internal.l.e(abstractC1339r9, "JsonPropertyParser.readO…r) ?: SHAPE_DEFAULT_VALUE");
            W4 w42 = (W4) k8.F.q(context, data, "space_between_centers", uc.f6897t3);
            if (w42 == null) {
                w42 = M5.i;
            }
            kotlin.jvm.internal.l.e(w42, "JsonPropertyParser.readO…EEN_CENTERS_DEFAULT_VALUE");
            List listS7 = k8.F.s(context, data, "tooltips", uc.f6572P8);
            Qb qb = (Qb) k8.F.q(context, data, "transform", uc.f6604S8);
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) k8.F.q(context, data, "transition_change", uc.f6586R1);
            b9.p pVar4 = uc.f6927w1;
            F2 f22 = (F2) k8.F.q(context, data, "transition_in", pVar4);
            F2 f23 = (F2) k8.F.q(context, data, "transition_out", pVar4);
            List listU = k8.F.u(context, data, "transition_triggers", Ub.FROM_STRING, M5.f5852u);
            List listS8 = k8.F.s(context, data, "variable_triggers", uc.f6636V8);
            List listS9 = k8.F.s(context, data, "variables", uc.f6703b9);
            W4 w43 = w42;
            l7.i iVar3 = M5.f5846o;
            p9.l<String, EnumC1356sc> lVar3 = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b13 = M5.f5841j;
            AbstractC1339r9 abstractC1339r92 = abstractC1339r9;
            b.C0000b c0000b14 = c0000b10;
            b.C0000b c0000b15 = c0000b6;
            ?? B16 = l7.b.b(context, data, "visibility", iVar3, lVar3, lVar, c0000b13);
            if (B16 != 0) {
                c0000b13 = B16;
            }
            b9.p pVar5 = uc.n9;
            C1370tc c1370tc = (C1370tc) k8.F.q(context, data, "visibility_action", pVar5);
            List listS10 = k8.F.s(context, data, "visibility_actions", pVar5);
            C9 c94 = (C9) k8.F.q(context, data, "width", pVar2);
            if (c94 == null) {
                c94 = M5.f5842k;
            }
            kotlin.jvm.internal.l.e(c94, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new G5(c1130d0, c0000b2, c0000b4, w82, bVarB, bVarB2, c0000b15, c0000b8, listS, listS2, x22, bVarB3, listS3, listS4, z42, listS5, c93, str, c0000b14, w83, w84, h52, l62, c1362t4, c0000b12, c1362t42, str2, bVarB4, bVarB5, listS6, abstractC1339r92, w43, listS7, qb, abstractC1178g3, f22, f23, listU, listS8, listS9, c0000b13, c1370tc, listS10, c94);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, G5 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f5857a;
            k8.F.z(context, jSONObject, "accessibility", value.f5296a, uc.f6479H);
            h.c cVar = l7.h.f43880a;
            l7.b.e(context, jSONObject, "active_item_color", value.f5297b, cVar);
            l7.b.d(context, jSONObject, "active_item_size", value.f5298c);
            W8 w82 = value.f5299d;
            b9.p pVar = uc.f6879r6;
            k8.F.z(context, jSONObject, "active_shape", w82, pVar);
            l7.b.e(context, jSONObject, "alignment_horizontal", value.f5300e, EnumC1305p2.TO_STRING);
            l7.b.e(context, jSONObject, "alignment_vertical", value.f5301f, EnumC1319q2.TO_STRING);
            l7.b.d(context, jSONObject, "alpha", value.f5302g);
            l7.b.e(context, jSONObject, "animation", value.f5303h, G5.a.TO_STRING);
            k8.F.B(context, jSONObject, "animators", value.i, uc.f6863q1);
            k8.F.B(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f5304j, uc.f6429C1);
            k8.F.z(context, jSONObject, "border", value.f5305k, uc.f6492I1);
            l7.b.d(context, jSONObject, "column_span", value.f5306l);
            k8.F.B(context, jSONObject, "disappear_actions", value.f5307m, uc.f6535M2);
            k8.F.B(context, jSONObject, "extensions", value.f5308n, uc.f6662Y2);
            k8.F.z(context, jSONObject, "focus", value.f5309o, uc.f6929w3);
            k8.F.B(context, jSONObject, "functions", value.f5310p, uc.f6463F3);
            C9 c92 = value.f5311q;
            b9.p pVar2 = uc.f6602S6;
            k8.F.z(context, jSONObject, "height", c92, pVar2);
            k8.F.y(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f5312r);
            l7.b.e(context, jSONObject, "inactive_item_color", value.f5313s, cVar);
            k8.F.z(context, jSONObject, "inactive_minimum_shape", value.f5314t, pVar);
            k8.F.z(context, jSONObject, "inactive_shape", value.f5315u, pVar);
            k8.F.z(context, jSONObject, "items_placement", value.f5316v, uc.X3);
            k8.F.z(context, jSONObject, "layout_provider", value.f5317w, uc.f6506J4);
            C1362t4 c1362t4 = value.f5318x;
            b9.p pVar3 = uc.f6630V2;
            k8.F.z(context, jSONObject, "margins", c1362t4, pVar3);
            l7.b.d(context, jSONObject, "minimum_item_size", value.f5319y);
            k8.F.z(context, jSONObject, "paddings", value.f5320z, pVar3);
            k8.F.y(context, jSONObject, "pager_id", value.f5277A);
            l7.b.d(context, jSONObject, "reuse_id", value.f5278B);
            l7.b.d(context, jSONObject, "row_span", value.f5279C);
            k8.F.B(context, jSONObject, "selected_actions", value.f5280D, uc.f6766h1);
            k8.F.z(context, jSONObject, "shape", value.f5281E, uc.f6570P6);
            k8.F.z(context, jSONObject, "space_between_centers", value.f5282F, uc.f6897t3);
            k8.F.B(context, jSONObject, "tooltips", value.f5283G, uc.f6572P8);
            k8.F.z(context, jSONObject, "transform", value.f5284H, uc.f6604S8);
            k8.F.z(context, jSONObject, "transition_change", value.f5285I, uc.f6586R1);
            F2 f22 = value.f5286J;
            b9.p pVar4 = uc.f6927w1;
            k8.F.z(context, jSONObject, "transition_in", f22, pVar4);
            k8.F.z(context, jSONObject, "transition_out", value.f5287K, pVar4);
            k8.F.C(context, jSONObject, value.f5288L, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "indicator");
            k8.F.B(context, jSONObject, "variable_triggers", value.f5289M, uc.f6636V8);
            k8.F.B(context, jSONObject, "variables", value.f5290N, uc.f6703b9);
            l7.b.e(context, jSONObject, "visibility", value.f5291O, EnumC1356sc.TO_STRING);
            C1370tc c1370tc = value.f5292P;
            b9.p pVar5 = uc.n9;
            k8.F.z(context, jSONObject, "visibility_action", c1370tc, pVar5);
            k8.F.B(context, jSONObject, "visibility_actions", value.f5293Q, pVar5);
            k8.F.z(context, jSONObject, "width", value.f5294R, pVar2);
            return jSONObject;
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class f implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5858a;

        public f(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5858a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final N5 d(D7.f fVar, N5 n52, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a<C1160f0> abstractC5371a = n52 != null ? n52.f5910a : null;
            Uc uc = this.f5858a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "accessibility", zP, abstractC5371a, uc.f6490I);
            k.b bVar = l7.k.f43901f;
            AbstractC5371a<A7.b<Integer>> abstractC5371a2 = n52 != null ? n52.f5911b : null;
            h.f fVar2 = l7.h.f43881b;
            j6.l lVar = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "active_item_color", bVar, zP, abstractC5371a2, fVar2, lVar);
            k.d dVar = l7.k.f43899d;
            AbstractC5371a<A7.b<Double>> abstractC5371a3 = n52 != null ? n52.f5912c : null;
            h.d dVar2 = l7.h.f43885f;
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "active_item_size", dVar, zP, abstractC5371a3, dVar2, M5.f5847p);
            AbstractC5371a abstractC5371aH2 = l7.c.h(fVarW, jSONObject, "active_shape", zP, n52 != null ? n52.f5913d : null, uc.f6889s6);
            AbstractC5371a abstractC5371aJ3 = l7.c.j(fVarW, jSONObject, "alignment_horizontal", M5.f5843l, zP, n52 != null ? n52.f5914e : null, EnumC1305p2.FROM_STRING, lVar);
            AbstractC5371a abstractC5371aJ4 = l7.c.j(fVarW, jSONObject, "alignment_vertical", M5.f5844m, zP, n52 != null ? n52.f5915f : null, EnumC1319q2.FROM_STRING, lVar);
            AbstractC5371a abstractC5371aJ5 = l7.c.j(fVarW, jSONObject, "alpha", dVar, zP, n52 != null ? n52.f5916g : null, dVar2, M5.f5848q);
            AbstractC5371a abstractC5371aJ6 = l7.c.j(fVarW, jSONObject, "animation", M5.f5845n, zP, n52 != null ? n52.f5917h : null, G5.a.FROM_STRING, lVar);
            AbstractC5371a abstractC5371aK = l7.c.k(fVarW, jSONObject, "animators", zP, n52 != null ? n52.i : null, uc.f6874r1);
            AbstractC5371a abstractC5371aK2 = l7.c.k(fVarW, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, zP, n52 != null ? n52.f5918j : null, uc.f6440D1);
            AbstractC5371a abstractC5371aH3 = l7.c.h(fVarW, jSONObject, "border", zP, n52 != null ? n52.f5919k : null, uc.f6503J1);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a4 = n52 != null ? n52.f5920l : null;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aJ7 = l7.c.j(fVarW, jSONObject, "column_span", eVar, zP, abstractC5371a4, eVar2, M5.f5849r);
            AbstractC5371a abstractC5371aK3 = l7.c.k(fVarW, jSONObject, "disappear_actions", zP, n52 != null ? n52.f5921m : null, uc.f6545N2);
            AbstractC5371a abstractC5371aK4 = l7.c.k(fVarW, jSONObject, "extensions", zP, n52 != null ? n52.f5922n : null, uc.f6673Z2);
            AbstractC5371a abstractC5371aH4 = l7.c.h(fVarW, jSONObject, "focus", zP, n52 != null ? n52.f5923o : null, uc.f6940x3);
            AbstractC5371a abstractC5371aK5 = l7.c.k(fVarW, jSONObject, "functions", zP, n52 != null ? n52.f5924p : null, uc.f6474G3);
            AbstractC5371a abstractC5371aH5 = l7.c.h(fVarW, jSONObject, "height", zP, n52 != null ? n52.f5925q : null, uc.f6613T6);
            AbstractC5371a<String> abstractC5371a5 = n52 != null ? n52.f5926r : null;
            A8.d dVar3 = l7.e.f43878b;
            AbstractC5371a abstractC5371aI = l7.c.i(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, zP, abstractC5371a5, dVar3);
            AbstractC5371a abstractC5371aJ8 = l7.c.j(fVarW, jSONObject, "inactive_item_color", bVar, zP, n52 != null ? n52.f5927s : null, fVar2, lVar);
            AbstractC5371a abstractC5371aH6 = l7.c.h(fVarW, jSONObject, "inactive_minimum_shape", zP, n52 != null ? n52.f5928t : null, uc.f6889s6);
            AbstractC5371a abstractC5371aH7 = l7.c.h(fVarW, jSONObject, "inactive_shape", zP, n52 != null ? n52.f5929u : null, uc.f6889s6);
            AbstractC5371a abstractC5371aH8 = l7.c.h(fVarW, jSONObject, "items_placement", zP, n52 != null ? n52.f5930v : null, uc.f6663Y3);
            AbstractC5371a abstractC5371aH9 = l7.c.h(fVarW, jSONObject, "layout_provider", zP, n52 != null ? n52.f5931w : null, uc.f6517K4);
            AbstractC5371a abstractC5371aH10 = l7.c.h(fVarW, jSONObject, "margins", zP, n52 != null ? n52.f5932x : null, uc.f6641W2);
            AbstractC5371a abstractC5371aJ9 = l7.c.j(fVarW, jSONObject, "minimum_item_size", dVar, zP, n52 != null ? n52.f5933y : null, dVar2, M5.f5850s);
            AbstractC5371a abstractC5371aH11 = l7.c.h(fVarW, jSONObject, "paddings", zP, n52 != null ? n52.f5934z : null, uc.f6641W2);
            AbstractC5371a abstractC5371aI2 = l7.c.i(fVarW, jSONObject, "pager_id", zP, n52 != null ? n52.f5892A : null, dVar3);
            AbstractC5371a abstractC5371aJ10 = l7.c.j(fVarW, jSONObject, "reuse_id", l7.k.f43898c, zP, n52 != null ? n52.f5893B : null, dVar3, lVar);
            AbstractC5371a abstractC5371aJ11 = l7.c.j(fVarW, jSONObject, "row_span", eVar, zP, n52 != null ? n52.f5894C : null, eVar2, M5.f5851t);
            AbstractC5371a abstractC5371aK6 = l7.c.k(fVarW, jSONObject, "selected_actions", zP, n52 != null ? n52.f5895D : null, uc.f6777i1);
            AbstractC5371a abstractC5371aH12 = l7.c.h(fVarW, jSONObject, "shape", zP, n52 != null ? n52.f5896E : null, uc.f6580Q6);
            AbstractC5371a abstractC5371aH13 = l7.c.h(fVarW, jSONObject, "space_between_centers", zP, n52 != null ? n52.f5897F : null, uc.f6908u3);
            AbstractC5371a abstractC5371aK7 = l7.c.k(fVarW, jSONObject, "tooltips", zP, n52 != null ? n52.f5898G : null, uc.f6582Q8);
            AbstractC5371a abstractC5371aH14 = l7.c.h(fVarW, jSONObject, "transform", zP, n52 != null ? n52.f5899H : null, uc.f6615T8);
            AbstractC5371a abstractC5371aH15 = l7.c.h(fVarW, jSONObject, "transition_change", zP, n52 != null ? n52.f5900I : null, uc.f6597S1);
            AbstractC5371a abstractC5371aH16 = l7.c.h(fVarW, jSONObject, "transition_in", zP, n52 != null ? n52.f5901J : null, uc.f6938x1);
            AbstractC5371a abstractC5371aH17 = l7.c.h(fVarW, jSONObject, "transition_out", zP, n52 != null ? n52.f5902K : null, uc.f6938x1);
            AbstractC5371a<List<Ub>> abstractC5371a6 = n52 != null ? n52.f5903L : null;
            p9.l<String, Ub> lVar2 = Ub.FROM_STRING;
            B4.i iVar = M5.f5852u;
            kotlin.jvm.internal.l.d(iVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new N5(abstractC5371aH, abstractC5371aJ, abstractC5371aJ2, abstractC5371aH2, abstractC5371aJ3, abstractC5371aJ4, abstractC5371aJ5, abstractC5371aJ6, abstractC5371aK, abstractC5371aK2, abstractC5371aH3, abstractC5371aJ7, abstractC5371aK3, abstractC5371aK4, abstractC5371aH4, abstractC5371aK5, abstractC5371aH5, abstractC5371aI, abstractC5371aJ8, abstractC5371aH6, abstractC5371aH7, abstractC5371aH8, abstractC5371aH9, abstractC5371aH10, abstractC5371aJ9, abstractC5371aH11, abstractC5371aI2, abstractC5371aJ10, abstractC5371aJ11, abstractC5371aK6, abstractC5371aH12, abstractC5371aH13, abstractC5371aK7, abstractC5371aH14, abstractC5371aH15, abstractC5371aH16, abstractC5371aH17, l7.c.m(fVarW, jSONObject, zP, abstractC5371a6, lVar2, iVar), l7.c.k(fVarW, jSONObject, "variable_triggers", zP, n52 != null ? n52.f5904M : null, uc.f6647W8), l7.c.k(fVarW, jSONObject, "variables", zP, n52 != null ? n52.f5905N : null, uc.f6715c9), l7.c.j(fVarW, jSONObject, "visibility", M5.f5846o, zP, n52 != null ? n52.f5906O : null, EnumC1356sc.FROM_STRING, lVar), l7.c.h(fVarW, jSONObject, "visibility_action", zP, n52 != null ? n52.f5907P : null, uc.f6849o9), l7.c.k(fVarW, jSONObject, "visibility_actions", zP, n52 != null ? n52.f5908Q : null, uc.f6849o9), l7.c.h(fVarW, jSONObject, "width", zP, n52 != null ? n52.f5909R : null, uc.f6613T6));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, N5 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f5858a;
            l7.c.u(context, jSONObject, "accessibility", value.f5910a, uc.f6490I);
            h.c cVar = l7.h.f43880a;
            l7.c.p(context, "active_item_color", value.f5911b, jSONObject, cVar);
            l7.c.q(context, jSONObject, "active_item_size", value.f5912c);
            AbstractC5371a<Y8> abstractC5371a = value.f5913d;
            b9.p pVar = uc.f6889s6;
            l7.c.u(context, jSONObject, "active_shape", abstractC5371a, pVar);
            l7.c.p(context, "alignment_horizontal", value.f5914e, jSONObject, EnumC1305p2.TO_STRING);
            l7.c.p(context, "alignment_vertical", value.f5915f, jSONObject, EnumC1319q2.TO_STRING);
            l7.c.q(context, jSONObject, "alpha", value.f5916g);
            l7.c.p(context, "animation", value.f5917h, jSONObject, G5.a.TO_STRING);
            l7.c.v(context, jSONObject, "animators", value.i, uc.f6874r1);
            l7.c.v(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f5918j, uc.f6440D1);
            l7.c.u(context, jSONObject, "border", value.f5919k, uc.f6503J1);
            l7.c.q(context, jSONObject, "column_span", value.f5920l);
            l7.c.v(context, jSONObject, "disappear_actions", value.f5921m, uc.f6545N2);
            l7.c.v(context, jSONObject, "extensions", value.f5922n, uc.f6673Z2);
            l7.c.u(context, jSONObject, "focus", value.f5923o, uc.f6940x3);
            l7.c.v(context, jSONObject, "functions", value.f5924p, uc.f6474G3);
            AbstractC5371a<G9> abstractC5371a2 = value.f5925q;
            b9.p pVar2 = uc.f6613T6;
            l7.c.u(context, jSONObject, "height", abstractC5371a2, pVar2);
            l7.c.t(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f5926r);
            l7.c.p(context, "inactive_item_color", value.f5927s, jSONObject, cVar);
            l7.c.u(context, jSONObject, "inactive_minimum_shape", value.f5928t, pVar);
            l7.c.u(context, jSONObject, "inactive_shape", value.f5929u, pVar);
            l7.c.u(context, jSONObject, "items_placement", value.f5930v, uc.f6663Y3);
            l7.c.u(context, jSONObject, "layout_provider", value.f5931w, uc.f6517K4);
            AbstractC5371a<C1390v4> abstractC5371a3 = value.f5932x;
            b9.p pVar3 = uc.f6641W2;
            l7.c.u(context, jSONObject, "margins", abstractC5371a3, pVar3);
            l7.c.q(context, jSONObject, "minimum_item_size", value.f5933y);
            l7.c.u(context, jSONObject, "paddings", value.f5934z, pVar3);
            l7.c.t(context, jSONObject, "pager_id", value.f5892A);
            l7.c.q(context, jSONObject, "reuse_id", value.f5893B);
            l7.c.q(context, jSONObject, "row_span", value.f5894C);
            l7.c.v(context, jSONObject, "selected_actions", value.f5895D, uc.f6777i1);
            l7.c.u(context, jSONObject, "shape", value.f5896E, uc.f6580Q6);
            l7.c.u(context, jSONObject, "space_between_centers", value.f5897F, uc.f6908u3);
            l7.c.v(context, jSONObject, "tooltips", value.f5898G, uc.f6582Q8);
            l7.c.u(context, jSONObject, "transform", value.f5899H, uc.f6615T8);
            l7.c.u(context, jSONObject, "transition_change", value.f5900I, uc.f6597S1);
            AbstractC5371a<J2> abstractC5371a4 = value.f5901J;
            b9.p pVar4 = uc.f6938x1;
            l7.c.u(context, jSONObject, "transition_in", abstractC5371a4, pVar4);
            l7.c.u(context, jSONObject, "transition_out", value.f5902K, pVar4);
            l7.c.w(context, jSONObject, value.f5903L, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "indicator");
            l7.c.v(context, jSONObject, "variable_triggers", value.f5904M, uc.f6647W8);
            l7.c.v(context, jSONObject, "variables", value.f5905N, uc.f6715c9);
            l7.c.p(context, "visibility", value.f5906O, jSONObject, EnumC1356sc.TO_STRING);
            AbstractC5371a<C1398vc> abstractC5371a5 = value.f5907P;
            b9.p pVar5 = uc.f6849o9;
            l7.c.u(context, jSONObject, "visibility_action", abstractC5371a5, pVar5);
            l7.c.v(context, jSONObject, "visibility_actions", value.f5908Q, pVar5);
            l7.c.u(context, jSONObject, "width", value.f5909R, pVar2);
            return jSONObject;
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class g implements D7.j<JSONObject, N5, G5> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5859a;

        public g(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5859a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v14, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v16, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v35, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v48, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v6, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v79, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v8, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G5 a(D7.f context, N5 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f5859a;
            C1130d0 c1130d0 = (C1130d0) l7.d.h(context, template.f5910a, data, "accessibility", uc.f6501J, uc.f6479H);
            k.b bVar = l7.k.f43901f;
            h.f fVar = l7.h.f43881b;
            b.C0000b c0000b = M5.f5833a;
            ?? L7 = l7.d.l(context, template.f5911b, data, "active_item_color", bVar, fVar, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B4.i iVar = M5.f5847p;
            b.C0000b c0000b3 = M5.f5834b;
            ?? N8 = l7.d.n(context, template.f5912c, data, "active_item_size", dVar, dVar2, iVar, c0000b3);
            b.C0000b c0000b4 = N8 == 0 ? c0000b3 : N8;
            W8 w82 = (W8) l7.d.h(context, template.f5913d, data, "active_shape", uc.f6900t6, uc.f6879r6);
            A7.b bVarK = l7.d.k(context, template.f5914e, data, "alignment_horizontal", M5.f5843l, EnumC1305p2.FROM_STRING);
            A7.b bVarK2 = l7.d.k(context, template.f5915f, data, "alignment_vertical", M5.f5844m, EnumC1319q2.FROM_STRING);
            F3.h hVar = M5.f5848q;
            b.C0000b c0000b5 = M5.f5835c;
            ?? N10 = l7.d.n(context, template.f5916g, data, "alpha", dVar, dVar2, hVar, c0000b5);
            b.C0000b c0000b6 = N10 == 0 ? c0000b5 : N10;
            l7.i iVar2 = M5.f5845n;
            p9.l<String, G5.a> lVar = G5.a.FROM_STRING;
            b.C0000b c0000b7 = M5.f5836d;
            ?? L8 = l7.d.l(context, template.f5917h, data, "animation", iVar2, lVar, c0000b7);
            b.C0000b c0000b8 = L8 == 0 ? c0000b7 : L8;
            List listQ = l7.d.q(context, template.i, data, "animators", uc.f6884s1, uc.f6863q1);
            List listQ2 = l7.d.q(context, template.f5918j, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6451E1, uc.f6429C1);
            X2 x22 = (X2) l7.d.h(context, template.f5919k, data, "border", uc.f6514K1, uc.f6492I1);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarM = l7.d.m(context, template.f5920l, data, "column_span", eVar, eVar2, M5.f5849r);
            List listQ3 = l7.d.q(context, template.f5921m, data, "disappear_actions", uc.f6555O2, uc.f6535M2);
            List listQ4 = l7.d.q(context, template.f5922n, data, "extensions", uc.f6685a3, uc.f6662Y2);
            Z4 z42 = (Z4) l7.d.h(context, template.f5923o, data, "focus", uc.f6951y3, uc.f6929w3);
            List listQ5 = l7.d.q(context, template.f5924p, data, "functions", uc.f6483H3, uc.f6463F3);
            C9 c92 = (C9) l7.d.h(context, template.f5925q, data, "height", uc.U6, uc.f6602S6);
            if (c92 == null) {
                c92 = M5.f5837e;
            }
            C9 c93 = c92;
            kotlin.jvm.internal.l.e(c93, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            AbstractC5371a<String> abstractC5371a = template.f5926r;
            A8.d dVar3 = l7.e.f43878b;
            String str = (String) l7.d.g(context, FacebookMediationAdapter.KEY_ID, abstractC5371a, data, dVar3);
            b.C0000b c0000b9 = M5.f5838f;
            ?? L10 = l7.d.l(context, template.f5927s, data, "inactive_item_color", bVar, fVar, c0000b9);
            b.C0000b c0000b10 = L10 == 0 ? c0000b9 : L10;
            W8 w83 = (W8) l7.d.h(context, template.f5928t, data, "inactive_minimum_shape", uc.f6900t6, uc.f6879r6);
            W8 w84 = (W8) l7.d.h(context, template.f5929u, data, "inactive_shape", uc.f6900t6, uc.f6879r6);
            H5 h52 = (H5) l7.d.h(context, template.f5930v, data, "items_placement", uc.f6674Z3, uc.X3);
            L6 l62 = (L6) l7.d.h(context, template.f5931w, data, "layout_provider", uc.f6528L4, uc.f6506J4);
            C1362t4 c1362t4 = (C1362t4) l7.d.h(context, template.f5932x, data, "margins", uc.f6652X2, uc.f6630V2);
            B4.g gVar = M5.f5850s;
            b.C0000b c0000b11 = M5.f5839g;
            ?? N11 = l7.d.n(context, template.f5933y, data, "minimum_item_size", dVar, dVar2, gVar, c0000b11);
            if (N11 != 0) {
                c0000b11 = N11;
            }
            C1362t4 c1362t42 = (C1362t4) l7.d.h(context, template.f5934z, data, "paddings", uc.f6652X2, uc.f6630V2);
            String str2 = (String) l7.d.g(context, "pager_id", template.f5892A, data, dVar3);
            A7.b bVarJ = l7.d.j(context, template.f5893B, data, "reuse_id", l7.k.f43898c);
            A7.b bVarM2 = l7.d.m(context, template.f5894C, data, "row_span", eVar, eVar2, M5.f5851t);
            List listQ6 = l7.d.q(context, template.f5895D, data, "selected_actions", uc.f6789j1, uc.f6766h1);
            AbstractC1339r9 abstractC1339r9 = (AbstractC1339r9) l7.d.h(context, template.f5896E, data, "shape", uc.f6591R6, uc.f6570P6);
            if (abstractC1339r9 == null) {
                abstractC1339r9 = M5.f5840h;
            }
            AbstractC1339r9 abstractC1339r92 = abstractC1339r9;
            kotlin.jvm.internal.l.e(abstractC1339r92, "JsonFieldResolver.resolv…r) ?: SHAPE_DEFAULT_VALUE");
            W4 w42 = (W4) l7.d.h(context, template.f5897F, data, "space_between_centers", uc.f6918v3, uc.f6897t3);
            if (w42 == null) {
                w42 = M5.i;
            }
            W4 w43 = w42;
            kotlin.jvm.internal.l.e(w43, "JsonFieldResolver.resolv…EEN_CENTERS_DEFAULT_VALUE");
            List listQ7 = l7.d.q(context, template.f5898G, data, "tooltips", uc.f6593R8, uc.f6572P8);
            Qb qb = (Qb) l7.d.h(context, template.f5899H, data, "transform", uc.f6625U8, uc.f6604S8);
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) l7.d.h(context, template.f5900I, data, "transition_change", uc.f6608T1, uc.f6586R1);
            F2 f22 = (F2) l7.d.h(context, template.f5901J, data, "transition_in", uc.f6949y1, uc.f6927w1);
            F2 f23 = (F2) l7.d.h(context, template.f5902K, data, "transition_out", uc.f6949y1, uc.f6927w1);
            List listR = l7.d.r(context, template.f5903L, data, Ub.FROM_STRING, M5.f5852u);
            List listQ8 = l7.d.q(context, template.f5904M, data, "variable_triggers", uc.f6657X8, uc.f6636V8);
            List listQ9 = l7.d.q(context, template.f5905N, data, "variables", uc.f6727d9, uc.f6703b9);
            l7.i iVar3 = M5.f5846o;
            p9.l<String, EnumC1356sc> lVar2 = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b12 = M5.f5841j;
            ?? L11 = l7.d.l(context, template.f5906O, data, "visibility", iVar3, lVar2, c0000b12);
            if (L11 != 0) {
                c0000b12 = L11;
            }
            C1370tc c1370tc = (C1370tc) l7.d.h(context, template.f5907P, data, "visibility_action", uc.f6860p9, uc.n9);
            List listQ10 = l7.d.q(context, template.f5908Q, data, "visibility_actions", uc.f6860p9, uc.n9);
            C9 c94 = (C9) l7.d.h(context, template.f5909R, data, "width", uc.U6, uc.f6602S6);
            if (c94 == null) {
                c94 = M5.f5842k;
            }
            kotlin.jvm.internal.l.e(c94, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new G5(c1130d0, c0000b2, c0000b4, w82, bVarK, bVarK2, c0000b6, c0000b8, listQ, listQ2, x22, bVarM, listQ3, listQ4, z42, listQ5, c93, str, c0000b10, w83, w84, h52, l62, c1362t4, c0000b11, c1362t42, str2, bVarJ, bVarM2, listQ6, abstractC1339r92, w43, listQ7, qb, abstractC1178g3, f22, f23, listR, listQ8, listQ9, c0000b12, c1370tc, listQ10, c94);
        }
    }

    static {
        Object objM = C2091l.m(EnumC1305p2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f5853g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f5843l = new l7.i(objM, validator);
        Object objM2 = C2091l.m(EnumC1319q2.values());
        kotlin.jvm.internal.l.f(objM2, "default");
        b validator2 = b.f5854g;
        kotlin.jvm.internal.l.f(validator2, "validator");
        f5844m = new l7.i(objM2, validator2);
        Object objM3 = C2091l.m(G5.a.values());
        kotlin.jvm.internal.l.f(objM3, "default");
        c validator3 = c.f5855g;
        kotlin.jvm.internal.l.f(validator3, "validator");
        f5845n = new l7.i(objM3, validator3);
        Object objM4 = C2091l.m(EnumC1356sc.values());
        kotlin.jvm.internal.l.f(objM4, "default");
        d validator4 = d.f5856g;
        kotlin.jvm.internal.l.f(validator4, "validator");
        f5846o = new l7.i(objM4, validator4);
        f5847p = new B4.i(21);
        f5848q = new F3.h(22);
        f5849r = new B4.f(22);
        f5850s = new B4.g(24);
        f5851t = new B4.h(23);
        f5852u = new B4.i(22);
    }
}
