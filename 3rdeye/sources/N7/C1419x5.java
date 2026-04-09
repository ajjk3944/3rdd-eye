package N7;

import A7.b;
import N7.C1332r2;
import N7.C9;
import c9.C2091l;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import l7.h;
import l7.j;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivGridJsonParser.kt */
/* renamed from: N7.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1419x5 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final C1332r2 f9758a = new C1332r2(b.a.a(100L), b.a.a(Double.valueOf(0.6d)), b.a.a(C1332r2.a.FADE), b.a.a(Double.valueOf(1.0d)));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9759b = b.a.a(Double.valueOf(1.0d));

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9760c = b.a.a(Boolean.TRUE);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9761d = b.a.a(EnumC1305p2.START);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9762e = b.a.a(EnumC1319q2.TOP);

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final C9.c f9763f = new C9.c(new C1412wc(null, null, null));

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9764g = b.a.a(EnumC1356sc.VISIBLE);

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final C9.b f9765h = new C9.b(new V6(null));

    @Deprecated
    public static final l7.i i = j.a.a(C2091l.m(EnumC1305p2.values()), a.f9775g);

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final l7.i f9766j = j.a.a(C2091l.m(EnumC1319q2.values()), b.f9776g);

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final l7.i f9767k = j.a.a(C2091l.m(EnumC1305p2.values()), c.f9777g);

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final l7.i f9768l = j.a.a(C2091l.m(EnumC1319q2.values()), d.f9778g);

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final l7.i f9769m = j.a.a(C2091l.m(EnumC1356sc.values()), e.f9779g);

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final B4.i f9770n = new B4.i(19);

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final F3.h f9771o = new F3.h(20);

    /* renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final B4.f f9772p = new B4.f(20);

    /* renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final B4.g f9773q = new B4.g(22);

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final B4.h f9774r = new B4.h(21);

    /* compiled from: DivGridJsonParser.kt */
    /* renamed from: N7.x5$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f9775g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1305p2);
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    /* renamed from: N7.x5$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f9776g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1319q2);
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    /* renamed from: N7.x5$c */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f9777g = new c(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1305p2);
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    /* renamed from: N7.x5$d */
    public static final class d extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final d f9778g = new d(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1319q2);
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    /* renamed from: N7.x5$e */
    public static final class e extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final e f9779g = new e(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1356sc);
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    /* renamed from: N7.x5$f */
    public static final class f implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9780a;

        public f(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9780a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v15, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v21, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v25, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v27, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v65, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C1405w5 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f9780a;
            C1130d0 c1130d0 = (C1130d0) k8.F.q(context, data, "accessibility", uc.f6479H);
            b9.p pVar = uc.f6766h1;
            C1175g0 c1175g0 = (C1175g0) k8.F.q(context, data, "action", pVar);
            C1332r2 c1332r2 = (C1332r2) k8.F.q(context, data, "action_animation", uc.f6831n1);
            if (c1332r2 == null) {
                c1332r2 = C1419x5.f9758a;
            }
            C1332r2 c1332r22 = c1332r2;
            kotlin.jvm.internal.l.e(c1332r22, "JsonPropertyParser.readO…N_ANIMATION_DEFAULT_VALUE");
            List listS = k8.F.s(context, data, "actions", pVar);
            l7.i iVar = C1419x5.i;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "alignment_horizontal", iVar, lVar, lVar2, null);
            l7.i iVar2 = C1419x5.f9766j;
            p9.l<String, EnumC1319q2> lVar3 = EnumC1319q2.FROM_STRING;
            A7.b bVarB2 = l7.b.b(context, data, "alignment_vertical", iVar2, lVar3, lVar2, null);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B4.i iVar3 = C1419x5.f9770n;
            b.C0000b c0000b = C1419x5.f9759b;
            ?? B10 = l7.b.b(context, data, "alpha", dVar, dVar2, iVar3, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            List listS2 = k8.F.s(context, data, "animators", uc.f6863q1);
            List listS3 = k8.F.s(context, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6429C1);
            X2 x22 = (X2) k8.F.q(context, data, "border", uc.f6492I1);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b3 = C1419x5.f9760c;
            ?? B11 = l7.b.b(context, data, "capture_focus_on_action", aVar, aVar2, lVar2, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarA = l7.b.a(context, data, "column_count", eVar, eVar2, C1419x5.f9771o);
            A7.b bVarB3 = l7.b.b(context, data, "column_span", eVar, eVar2, C1419x5.f9772p, null);
            l7.i iVar4 = C1419x5.f9767k;
            b.C0000b c0000b5 = C1419x5.f9761d;
            ?? B12 = l7.b.b(context, data, "content_alignment_horizontal", iVar4, lVar, lVar2, c0000b5);
            b.C0000b c0000b6 = B12 == 0 ? c0000b5 : B12;
            l7.i iVar5 = C1419x5.f9768l;
            b.C0000b c0000b7 = C1419x5.f9762e;
            ?? B13 = l7.b.b(context, data, "content_alignment_vertical", iVar5, lVar3, lVar2, c0000b7);
            b.C0000b c0000b8 = B13 == 0 ? c0000b7 : B13;
            List listS4 = k8.F.s(context, data, "disappear_actions", uc.f6535M2);
            List listS5 = k8.F.s(context, data, "doubletap_actions", pVar);
            List listS6 = k8.F.s(context, data, "extensions", uc.f6662Y2);
            Z4 z42 = (Z4) k8.F.q(context, data, "focus", uc.f6929w3);
            List listS7 = k8.F.s(context, data, "functions", uc.f6463F3);
            b9.p pVar2 = uc.f6602S6;
            C9 c92 = (C9) k8.F.q(context, data, "height", pVar2);
            if (c92 == null) {
                c92 = C1419x5.f9763f;
            }
            kotlin.jvm.internal.l.e(c92, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            List listS8 = k8.F.s(context, data, "hover_end_actions", pVar);
            List listS9 = k8.F.s(context, data, "hover_start_actions", pVar);
            A8.d dVar3 = l7.e.f43878b;
            String str = (String) k8.F.r(context, data, FacebookMediationAdapter.KEY_ID, dVar3, lVar2);
            C9 c93 = c92;
            List listS10 = k8.F.s(context, data, "items", uc.f6935w9);
            L6 l62 = (L6) k8.F.q(context, data, "layout_provider", uc.f6506J4);
            List listS11 = k8.F.s(context, data, "longtap_actions", pVar);
            b9.p pVar3 = uc.f6630V2;
            C1362t4 c1362t4 = (C1362t4) k8.F.q(context, data, "margins", pVar3);
            C1362t4 c1362t42 = (C1362t4) k8.F.q(context, data, "paddings", pVar3);
            List listS12 = k8.F.s(context, data, "press_end_actions", pVar);
            List listS13 = k8.F.s(context, data, "press_start_actions", pVar);
            A7.b bVarB4 = l7.b.b(context, data, "reuse_id", l7.k.f43898c, dVar3, lVar2, null);
            A7.b bVarB5 = l7.b.b(context, data, "row_span", eVar, eVar2, C1419x5.f9773q, null);
            List listS14 = k8.F.s(context, data, "selected_actions", pVar);
            List listS15 = k8.F.s(context, data, "tooltips", uc.f6572P8);
            Qb qb = (Qb) k8.F.q(context, data, "transform", uc.f6604S8);
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) k8.F.q(context, data, "transition_change", uc.f6586R1);
            b9.p pVar4 = uc.f6927w1;
            F2 f22 = (F2) k8.F.q(context, data, "transition_in", pVar4);
            F2 f23 = (F2) k8.F.q(context, data, "transition_out", pVar4);
            List listU = k8.F.u(context, data, "transition_triggers", Ub.FROM_STRING, C1419x5.f9774r);
            List listS16 = k8.F.s(context, data, "variable_triggers", uc.f6636V8);
            List listS17 = k8.F.s(context, data, "variables", uc.f6703b9);
            l7.i iVar6 = C1419x5.f9769m;
            p9.l<String, EnumC1356sc> lVar4 = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b9 = C1419x5.f9764g;
            ?? B14 = l7.b.b(context, data, "visibility", iVar6, lVar4, lVar2, c0000b9);
            b.C0000b c0000b10 = B14 == 0 ? c0000b9 : B14;
            b9.p pVar5 = uc.n9;
            C1370tc c1370tc = (C1370tc) k8.F.q(context, data, "visibility_action", pVar5);
            List listS18 = k8.F.s(context, data, "visibility_actions", pVar5);
            C9 c94 = (C9) k8.F.q(context, data, "width", pVar2);
            if (c94 == null) {
                c94 = C1419x5.f9765h;
            }
            kotlin.jvm.internal.l.e(c94, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1405w5(c1130d0, c1175g0, c1332r22, listS, bVarB, bVarB2, c0000b2, listS2, listS3, x22, c0000b4, bVarA, bVarB3, c0000b6, c0000b8, listS4, listS5, listS6, z42, listS7, c93, listS8, listS9, str, listS10, l62, listS11, c1362t4, c1362t42, listS12, listS13, bVarB4, bVarB5, listS14, listS15, qb, abstractC1178g3, f22, f23, listU, listS16, listS17, c0000b10, c1370tc, listS18, c94);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1405w5 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f9780a;
            k8.F.z(context, jSONObject, "accessibility", value.f9696a, uc.f6479H);
            C1175g0 c1175g0 = value.f9697b;
            b9.p pVar = uc.f6766h1;
            k8.F.z(context, jSONObject, "action", c1175g0, pVar);
            k8.F.z(context, jSONObject, "action_animation", value.f9698c, uc.f6831n1);
            k8.F.B(context, jSONObject, "actions", value.f9699d, pVar);
            p9.l<EnumC1305p2, String> lVar = EnumC1305p2.TO_STRING;
            l7.b.e(context, jSONObject, "alignment_horizontal", value.f9700e, lVar);
            p9.l<EnumC1319q2, String> lVar2 = EnumC1319q2.TO_STRING;
            l7.b.e(context, jSONObject, "alignment_vertical", value.f9701f, lVar2);
            l7.b.d(context, jSONObject, "alpha", value.f9702g);
            k8.F.B(context, jSONObject, "animators", value.f9703h, uc.f6863q1);
            k8.F.B(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.i, uc.f6429C1);
            k8.F.z(context, jSONObject, "border", value.f9704j, uc.f6492I1);
            l7.b.d(context, jSONObject, "capture_focus_on_action", value.f9705k);
            l7.b.d(context, jSONObject, "column_count", value.f9706l);
            l7.b.d(context, jSONObject, "column_span", value.f9707m);
            l7.b.e(context, jSONObject, "content_alignment_horizontal", value.f9708n, lVar);
            l7.b.e(context, jSONObject, "content_alignment_vertical", value.f9709o, lVar2);
            k8.F.B(context, jSONObject, "disappear_actions", value.f9710p, uc.f6535M2);
            k8.F.B(context, jSONObject, "doubletap_actions", value.f9711q, pVar);
            k8.F.B(context, jSONObject, "extensions", value.f9712r, uc.f6662Y2);
            k8.F.z(context, jSONObject, "focus", value.f9713s, uc.f6929w3);
            k8.F.B(context, jSONObject, "functions", value.f9714t, uc.f6463F3);
            C9 c92 = value.f9715u;
            b9.p pVar2 = uc.f6602S6;
            k8.F.z(context, jSONObject, "height", c92, pVar2);
            k8.F.B(context, jSONObject, "hover_end_actions", value.f9716v, pVar);
            k8.F.B(context, jSONObject, "hover_start_actions", value.f9717w, pVar);
            k8.F.y(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f9718x);
            k8.F.B(context, jSONObject, "items", value.f9719y, uc.f6935w9);
            k8.F.z(context, jSONObject, "layout_provider", value.f9720z, uc.f6506J4);
            k8.F.B(context, jSONObject, "longtap_actions", value.f9674A, pVar);
            C1362t4 c1362t4 = value.f9675B;
            b9.p pVar3 = uc.f6630V2;
            k8.F.z(context, jSONObject, "margins", c1362t4, pVar3);
            k8.F.z(context, jSONObject, "paddings", value.f9676C, pVar3);
            k8.F.B(context, jSONObject, "press_end_actions", value.f9677D, pVar);
            k8.F.B(context, jSONObject, "press_start_actions", value.f9678E, pVar);
            l7.b.d(context, jSONObject, "reuse_id", value.f9679F);
            l7.b.d(context, jSONObject, "row_span", value.f9680G);
            k8.F.B(context, jSONObject, "selected_actions", value.f9681H, pVar);
            k8.F.B(context, jSONObject, "tooltips", value.f9682I, uc.f6572P8);
            k8.F.z(context, jSONObject, "transform", value.f9683J, uc.f6604S8);
            k8.F.z(context, jSONObject, "transition_change", value.f9684K, uc.f6586R1);
            F2 f22 = value.f9685L;
            b9.p pVar4 = uc.f6927w1;
            k8.F.z(context, jSONObject, "transition_in", f22, pVar4);
            k8.F.z(context, jSONObject, "transition_out", value.f9686M, pVar4);
            k8.F.C(context, jSONObject, value.f9687N, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "grid");
            k8.F.B(context, jSONObject, "variable_triggers", value.f9688O, uc.f6636V8);
            k8.F.B(context, jSONObject, "variables", value.f9689P, uc.f6703b9);
            l7.b.e(context, jSONObject, "visibility", value.f9690Q, EnumC1356sc.TO_STRING);
            C1370tc c1370tc = value.f9691R;
            b9.p pVar5 = uc.n9;
            k8.F.z(context, jSONObject, "visibility_action", c1370tc, pVar5);
            k8.F.B(context, jSONObject, "visibility_actions", value.f9692S, pVar5);
            k8.F.z(context, jSONObject, "width", value.f9693T, pVar2);
            return jSONObject;
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    /* renamed from: N7.x5$g */
    public static final class g implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9781a;

        public g(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9781a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final C1433y5 d(D7.f fVar, C1433y5 c1433y5, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a<C1160f0> abstractC5371a = c1433y5 != null ? c1433y5.f9907a : null;
            Uc uc = this.f9781a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "accessibility", zP, abstractC5371a, uc.f6490I);
            AbstractC5371a abstractC5371aH2 = l7.c.h(fVarW, jSONObject, "action", zP, c1433y5 != null ? c1433y5.f9908b : null, uc.f6777i1);
            AbstractC5371a abstractC5371aH3 = l7.c.h(fVarW, jSONObject, "action_animation", zP, c1433y5 != null ? c1433y5.f9909c : null, uc.f6841o1);
            AbstractC5371a abstractC5371aK = l7.c.k(fVarW, jSONObject, "actions", zP, c1433y5 != null ? c1433y5.f9910d : null, uc.f6777i1);
            l7.i iVar = C1419x5.i;
            AbstractC5371a<A7.b<EnumC1305p2>> abstractC5371a2 = c1433y5 != null ? c1433y5.f9911e : null;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "alignment_horizontal", iVar, zP, abstractC5371a2, lVar, lVar2);
            l7.i iVar2 = C1419x5.f9766j;
            AbstractC5371a<A7.b<EnumC1319q2>> abstractC5371a3 = c1433y5 != null ? c1433y5.f9912f : null;
            p9.l<String, EnumC1319q2> lVar3 = EnumC1319q2.FROM_STRING;
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "alignment_vertical", iVar2, zP, abstractC5371a3, lVar3, lVar2);
            AbstractC5371a abstractC5371aJ3 = l7.c.j(fVarW, jSONObject, "alpha", l7.k.f43899d, zP, c1433y5 != null ? c1433y5.f9913g : null, l7.h.f43885f, C1419x5.f9770n);
            AbstractC5371a abstractC5371aK2 = l7.c.k(fVarW, jSONObject, "animators", zP, c1433y5 != null ? c1433y5.f9914h : null, uc.f6874r1);
            AbstractC5371a abstractC5371aK3 = l7.c.k(fVarW, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, zP, c1433y5 != null ? c1433y5.i : null, uc.f6440D1);
            AbstractC5371a abstractC5371aH4 = l7.c.h(fVarW, jSONObject, "border", zP, c1433y5 != null ? c1433y5.f9915j : null, uc.f6503J1);
            AbstractC5371a abstractC5371aJ4 = l7.c.j(fVarW, jSONObject, "capture_focus_on_action", l7.k.f43896a, zP, c1433y5 != null ? c1433y5.f9916k : null, l7.h.f43884e, lVar2);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a4 = c1433y5 != null ? c1433y5.f9917l : null;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aE = l7.c.e(fVarW, jSONObject, "column_count", eVar, zP, abstractC5371a4, eVar2, C1419x5.f9771o);
            AbstractC5371a abstractC5371aJ5 = l7.c.j(fVarW, jSONObject, "column_span", eVar, zP, c1433y5 != null ? c1433y5.f9918m : null, eVar2, C1419x5.f9772p);
            AbstractC5371a abstractC5371aJ6 = l7.c.j(fVarW, jSONObject, "content_alignment_horizontal", C1419x5.f9767k, zP, c1433y5 != null ? c1433y5.f9919n : null, lVar, lVar2);
            AbstractC5371a abstractC5371aJ7 = l7.c.j(fVarW, jSONObject, "content_alignment_vertical", C1419x5.f9768l, zP, c1433y5 != null ? c1433y5.f9920o : null, lVar3, lVar2);
            AbstractC5371a abstractC5371aK4 = l7.c.k(fVarW, jSONObject, "disappear_actions", zP, c1433y5 != null ? c1433y5.f9921p : null, uc.f6545N2);
            AbstractC5371a abstractC5371aK5 = l7.c.k(fVarW, jSONObject, "doubletap_actions", zP, c1433y5 != null ? c1433y5.f9922q : null, uc.f6777i1);
            AbstractC5371a abstractC5371aK6 = l7.c.k(fVarW, jSONObject, "extensions", zP, c1433y5 != null ? c1433y5.f9923r : null, uc.f6673Z2);
            AbstractC5371a abstractC5371aH5 = l7.c.h(fVarW, jSONObject, "focus", zP, c1433y5 != null ? c1433y5.f9924s : null, uc.f6940x3);
            AbstractC5371a abstractC5371aK7 = l7.c.k(fVarW, jSONObject, "functions", zP, c1433y5 != null ? c1433y5.f9925t : null, uc.f6474G3);
            AbstractC5371a abstractC5371aH6 = l7.c.h(fVarW, jSONObject, "height", zP, c1433y5 != null ? c1433y5.f9926u : null, uc.f6613T6);
            AbstractC5371a abstractC5371aK8 = l7.c.k(fVarW, jSONObject, "hover_end_actions", zP, c1433y5 != null ? c1433y5.f9927v : null, uc.f6777i1);
            AbstractC5371a abstractC5371aK9 = l7.c.k(fVarW, jSONObject, "hover_start_actions", zP, c1433y5 != null ? c1433y5.f9928w : null, uc.f6777i1);
            AbstractC5371a<String> abstractC5371a5 = c1433y5 != null ? c1433y5.f9929x : null;
            A8.d dVar = l7.e.f43878b;
            AbstractC5371a abstractC5371aI = l7.c.i(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, zP, abstractC5371a5, dVar);
            AbstractC5371a abstractC5371aK10 = l7.c.k(fVarW, jSONObject, "items", zP, c1433y5 != null ? c1433y5.f9930y : null, uc.f6946x9);
            AbstractC5371a abstractC5371aH7 = l7.c.h(fVarW, jSONObject, "layout_provider", zP, c1433y5 != null ? c1433y5.f9931z : null, uc.f6517K4);
            AbstractC5371a abstractC5371aK11 = l7.c.k(fVarW, jSONObject, "longtap_actions", zP, c1433y5 != null ? c1433y5.f9887A : null, uc.f6777i1);
            AbstractC5371a abstractC5371aH8 = l7.c.h(fVarW, jSONObject, "margins", zP, c1433y5 != null ? c1433y5.f9888B : null, uc.f6641W2);
            AbstractC5371a abstractC5371aH9 = l7.c.h(fVarW, jSONObject, "paddings", zP, c1433y5 != null ? c1433y5.f9889C : null, uc.f6641W2);
            AbstractC5371a abstractC5371aK12 = l7.c.k(fVarW, jSONObject, "press_end_actions", zP, c1433y5 != null ? c1433y5.f9890D : null, uc.f6777i1);
            AbstractC5371a abstractC5371aK13 = l7.c.k(fVarW, jSONObject, "press_start_actions", zP, c1433y5 != null ? c1433y5.f9891E : null, uc.f6777i1);
            AbstractC5371a abstractC5371aJ8 = l7.c.j(fVarW, jSONObject, "reuse_id", l7.k.f43898c, zP, c1433y5 != null ? c1433y5.f9892F : null, dVar, lVar2);
            AbstractC5371a abstractC5371aJ9 = l7.c.j(fVarW, jSONObject, "row_span", eVar, zP, c1433y5 != null ? c1433y5.f9893G : null, eVar2, C1419x5.f9773q);
            AbstractC5371a abstractC5371aK14 = l7.c.k(fVarW, jSONObject, "selected_actions", zP, c1433y5 != null ? c1433y5.f9894H : null, uc.f6777i1);
            AbstractC5371a abstractC5371aK15 = l7.c.k(fVarW, jSONObject, "tooltips", zP, c1433y5 != null ? c1433y5.f9895I : null, uc.f6582Q8);
            AbstractC5371a abstractC5371aH10 = l7.c.h(fVarW, jSONObject, "transform", zP, c1433y5 != null ? c1433y5.f9896J : null, uc.f6615T8);
            AbstractC5371a abstractC5371aH11 = l7.c.h(fVarW, jSONObject, "transition_change", zP, c1433y5 != null ? c1433y5.f9897K : null, uc.f6597S1);
            AbstractC5371a abstractC5371aH12 = l7.c.h(fVarW, jSONObject, "transition_in", zP, c1433y5 != null ? c1433y5.f9898L : null, uc.f6938x1);
            AbstractC5371a abstractC5371aH13 = l7.c.h(fVarW, jSONObject, "transition_out", zP, c1433y5 != null ? c1433y5.f9899M : null, uc.f6938x1);
            AbstractC5371a<List<Ub>> abstractC5371a6 = c1433y5 != null ? c1433y5.f9900N : null;
            p9.l<String, Ub> lVar4 = Ub.FROM_STRING;
            B4.h hVar = C1419x5.f9774r;
            kotlin.jvm.internal.l.d(hVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new C1433y5(abstractC5371aH, abstractC5371aH2, abstractC5371aH3, abstractC5371aK, abstractC5371aJ, abstractC5371aJ2, abstractC5371aJ3, abstractC5371aK2, abstractC5371aK3, abstractC5371aH4, abstractC5371aJ4, abstractC5371aE, abstractC5371aJ5, abstractC5371aJ6, abstractC5371aJ7, abstractC5371aK4, abstractC5371aK5, abstractC5371aK6, abstractC5371aH5, abstractC5371aK7, abstractC5371aH6, abstractC5371aK8, abstractC5371aK9, abstractC5371aI, abstractC5371aK10, abstractC5371aH7, abstractC5371aK11, abstractC5371aH8, abstractC5371aH9, abstractC5371aK12, abstractC5371aK13, abstractC5371aJ8, abstractC5371aJ9, abstractC5371aK14, abstractC5371aK15, abstractC5371aH10, abstractC5371aH11, abstractC5371aH12, abstractC5371aH13, l7.c.m(fVarW, jSONObject, zP, abstractC5371a6, lVar4, hVar), l7.c.k(fVarW, jSONObject, "variable_triggers", zP, c1433y5 != null ? c1433y5.f9901O : null, uc.f6647W8), l7.c.k(fVarW, jSONObject, "variables", zP, c1433y5 != null ? c1433y5.f9902P : null, uc.f6715c9), l7.c.j(fVarW, jSONObject, "visibility", C1419x5.f9769m, zP, c1433y5 != null ? c1433y5.f9903Q : null, EnumC1356sc.FROM_STRING, lVar2), l7.c.h(fVarW, jSONObject, "visibility_action", zP, c1433y5 != null ? c1433y5.f9904R : null, uc.f6849o9), l7.c.k(fVarW, jSONObject, "visibility_actions", zP, c1433y5 != null ? c1433y5.f9905S : null, uc.f6849o9), l7.c.h(fVarW, jSONObject, "width", zP, c1433y5 != null ? c1433y5.f9906T : null, uc.f6613T6));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1433y5 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f9781a;
            l7.c.u(context, jSONObject, "accessibility", value.f9907a, uc.f6490I);
            AbstractC5371a<C1132d2> abstractC5371a = value.f9908b;
            b9.p pVar = uc.f6777i1;
            l7.c.u(context, jSONObject, "action", abstractC5371a, pVar);
            l7.c.u(context, jSONObject, "action_animation", value.f9909c, uc.f6841o1);
            l7.c.v(context, jSONObject, "actions", value.f9910d, pVar);
            p9.l<EnumC1305p2, String> lVar = EnumC1305p2.TO_STRING;
            l7.c.p(context, "alignment_horizontal", value.f9911e, jSONObject, lVar);
            p9.l<EnumC1319q2, String> lVar2 = EnumC1319q2.TO_STRING;
            l7.c.p(context, "alignment_vertical", value.f9912f, jSONObject, lVar2);
            l7.c.q(context, jSONObject, "alpha", value.f9913g);
            l7.c.v(context, jSONObject, "animators", value.f9914h, uc.f6874r1);
            l7.c.v(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.i, uc.f6440D1);
            l7.c.u(context, jSONObject, "border", value.f9915j, uc.f6503J1);
            l7.c.q(context, jSONObject, "capture_focus_on_action", value.f9916k);
            l7.c.q(context, jSONObject, "column_count", value.f9917l);
            l7.c.q(context, jSONObject, "column_span", value.f9918m);
            l7.c.p(context, "content_alignment_horizontal", value.f9919n, jSONObject, lVar);
            l7.c.p(context, "content_alignment_vertical", value.f9920o, jSONObject, lVar2);
            l7.c.v(context, jSONObject, "disappear_actions", value.f9921p, uc.f6545N2);
            l7.c.v(context, jSONObject, "doubletap_actions", value.f9922q, pVar);
            l7.c.v(context, jSONObject, "extensions", value.f9923r, uc.f6673Z2);
            l7.c.u(context, jSONObject, "focus", value.f9924s, uc.f6940x3);
            l7.c.v(context, jSONObject, "functions", value.f9925t, uc.f6474G3);
            AbstractC5371a<G9> abstractC5371a2 = value.f9926u;
            b9.p pVar2 = uc.f6613T6;
            l7.c.u(context, jSONObject, "height", abstractC5371a2, pVar2);
            l7.c.v(context, jSONObject, "hover_end_actions", value.f9927v, pVar);
            l7.c.v(context, jSONObject, "hover_start_actions", value.f9928w, pVar);
            l7.c.t(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f9929x);
            l7.c.v(context, jSONObject, "items", value.f9930y, uc.f6946x9);
            l7.c.u(context, jSONObject, "layout_provider", value.f9931z, uc.f6517K4);
            l7.c.v(context, jSONObject, "longtap_actions", value.f9887A, pVar);
            AbstractC5371a<C1390v4> abstractC5371a3 = value.f9888B;
            b9.p pVar3 = uc.f6641W2;
            l7.c.u(context, jSONObject, "margins", abstractC5371a3, pVar3);
            l7.c.u(context, jSONObject, "paddings", value.f9889C, pVar3);
            l7.c.v(context, jSONObject, "press_end_actions", value.f9890D, pVar);
            l7.c.v(context, jSONObject, "press_start_actions", value.f9891E, pVar);
            l7.c.q(context, jSONObject, "reuse_id", value.f9892F);
            l7.c.q(context, jSONObject, "row_span", value.f9893G);
            l7.c.v(context, jSONObject, "selected_actions", value.f9894H, pVar);
            l7.c.v(context, jSONObject, "tooltips", value.f9895I, uc.f6582Q8);
            l7.c.u(context, jSONObject, "transform", value.f9896J, uc.f6615T8);
            l7.c.u(context, jSONObject, "transition_change", value.f9897K, uc.f6597S1);
            AbstractC5371a<J2> abstractC5371a4 = value.f9898L;
            b9.p pVar4 = uc.f6938x1;
            l7.c.u(context, jSONObject, "transition_in", abstractC5371a4, pVar4);
            l7.c.u(context, jSONObject, "transition_out", value.f9899M, pVar4);
            l7.c.w(context, jSONObject, value.f9900N, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "grid");
            l7.c.v(context, jSONObject, "variable_triggers", value.f9901O, uc.f6647W8);
            l7.c.v(context, jSONObject, "variables", value.f9902P, uc.f6715c9);
            l7.c.p(context, "visibility", value.f9903Q, jSONObject, EnumC1356sc.TO_STRING);
            AbstractC5371a<C1398vc> abstractC5371a5 = value.f9904R;
            b9.p pVar5 = uc.f6849o9;
            l7.c.u(context, jSONObject, "visibility_action", abstractC5371a5, pVar5);
            l7.c.v(context, jSONObject, "visibility_actions", value.f9905S, pVar5);
            l7.c.u(context, jSONObject, "width", value.f9906T, pVar2);
            return jSONObject;
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    /* renamed from: N7.x5$h */
    public static final class h implements D7.j<JSONObject, C1433y5, C1405w5> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9782a;

        public h(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9782a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v15, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v21, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v26, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v28, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v70, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1405w5 a(D7.f context, C1433y5 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f9782a;
            C1130d0 c1130d0 = (C1130d0) l7.d.h(context, template.f9907a, data, "accessibility", uc.f6501J, uc.f6479H);
            C1175g0 c1175g0 = (C1175g0) l7.d.h(context, template.f9908b, data, "action", uc.f6789j1, uc.f6766h1);
            C1332r2 c1332r2 = (C1332r2) l7.d.h(context, template.f9909c, data, "action_animation", uc.f6852p1, uc.f6831n1);
            if (c1332r2 == null) {
                c1332r2 = C1419x5.f9758a;
            }
            C1332r2 c1332r22 = c1332r2;
            kotlin.jvm.internal.l.e(c1332r22, "JsonFieldResolver.resolv…N_ANIMATION_DEFAULT_VALUE");
            List listQ = l7.d.q(context, template.f9910d, data, "actions", uc.f6789j1, uc.f6766h1);
            l7.i iVar = C1419x5.i;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            A7.b bVarK = l7.d.k(context, template.f9911e, data, "alignment_horizontal", iVar, lVar);
            l7.i iVar2 = C1419x5.f9766j;
            p9.l<String, EnumC1319q2> lVar2 = EnumC1319q2.FROM_STRING;
            A7.b bVarK2 = l7.d.k(context, template.f9912f, data, "alignment_vertical", iVar2, lVar2);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B4.i iVar3 = C1419x5.f9770n;
            b.C0000b c0000b = C1419x5.f9759b;
            ?? N8 = l7.d.n(context, template.f9913g, data, "alpha", dVar, dVar2, iVar3, c0000b);
            if (N8 != 0) {
                c0000b = N8;
            }
            List listQ2 = l7.d.q(context, template.f9914h, data, "animators", uc.f6884s1, uc.f6863q1);
            List listQ3 = l7.d.q(context, template.i, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6451E1, uc.f6429C1);
            X2 x22 = (X2) l7.d.h(context, template.f9915j, data, "border", uc.f6514K1, uc.f6492I1);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b2 = C1419x5.f9760c;
            ?? L7 = l7.d.l(context, template.f9916k, data, "capture_focus_on_action", aVar, aVar2, c0000b2);
            b.C0000b c0000b3 = L7 == 0 ? c0000b2 : L7;
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarE = l7.d.e(context, template.f9917l, data, "column_count", eVar, eVar2, C1419x5.f9771o);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex…, COLUMN_COUNT_VALIDATOR)");
            A7.b bVarM = l7.d.m(context, template.f9918m, data, "column_span", eVar, eVar2, C1419x5.f9772p);
            l7.i iVar4 = C1419x5.f9767k;
            b.C0000b c0000b4 = C1419x5.f9761d;
            ?? L8 = l7.d.l(context, template.f9919n, data, "content_alignment_horizontal", iVar4, lVar, c0000b4);
            b.C0000b c0000b5 = L8 == 0 ? c0000b4 : L8;
            l7.i iVar5 = C1419x5.f9768l;
            b.C0000b c0000b6 = C1419x5.f9762e;
            ?? L10 = l7.d.l(context, template.f9920o, data, "content_alignment_vertical", iVar5, lVar2, c0000b6);
            b.C0000b c0000b7 = L10 == 0 ? c0000b6 : L10;
            List listQ4 = l7.d.q(context, template.f9921p, data, "disappear_actions", uc.f6555O2, uc.f6535M2);
            List listQ5 = l7.d.q(context, template.f9922q, data, "doubletap_actions", uc.f6789j1, uc.f6766h1);
            List listQ6 = l7.d.q(context, template.f9923r, data, "extensions", uc.f6685a3, uc.f6662Y2);
            Z4 z42 = (Z4) l7.d.h(context, template.f9924s, data, "focus", uc.f6951y3, uc.f6929w3);
            List listQ7 = l7.d.q(context, template.f9925t, data, "functions", uc.f6483H3, uc.f6463F3);
            C9 c92 = (C9) l7.d.h(context, template.f9926u, data, "height", uc.U6, uc.f6602S6);
            if (c92 == null) {
                c92 = C1419x5.f9763f;
            }
            C9 c93 = c92;
            kotlin.jvm.internal.l.e(c93, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            List listQ8 = l7.d.q(context, template.f9927v, data, "hover_end_actions", uc.f6789j1, uc.f6766h1);
            List listQ9 = l7.d.q(context, template.f9928w, data, "hover_start_actions", uc.f6789j1, uc.f6766h1);
            String str = (String) l7.d.g(context, FacebookMediationAdapter.KEY_ID, template.f9929x, data, l7.e.f43878b);
            List listQ10 = l7.d.q(context, template.f9930y, data, "items", uc.f6957y9, uc.f6935w9);
            L6 l62 = (L6) l7.d.h(context, template.f9931z, data, "layout_provider", uc.f6528L4, uc.f6506J4);
            List listQ11 = l7.d.q(context, template.f9887A, data, "longtap_actions", uc.f6789j1, uc.f6766h1);
            C1362t4 c1362t4 = (C1362t4) l7.d.h(context, template.f9888B, data, "margins", uc.f6652X2, uc.f6630V2);
            C1362t4 c1362t42 = (C1362t4) l7.d.h(context, template.f9889C, data, "paddings", uc.f6652X2, uc.f6630V2);
            List listQ12 = l7.d.q(context, template.f9890D, data, "press_end_actions", uc.f6789j1, uc.f6766h1);
            List listQ13 = l7.d.q(context, template.f9891E, data, "press_start_actions", uc.f6789j1, uc.f6766h1);
            A7.b bVarJ = l7.d.j(context, template.f9892F, data, "reuse_id", l7.k.f43898c);
            A7.b bVarM2 = l7.d.m(context, template.f9893G, data, "row_span", eVar, eVar2, C1419x5.f9773q);
            List listQ14 = l7.d.q(context, template.f9894H, data, "selected_actions", uc.f6789j1, uc.f6766h1);
            List listQ15 = l7.d.q(context, template.f9895I, data, "tooltips", uc.f6593R8, uc.f6572P8);
            Qb qb = (Qb) l7.d.h(context, template.f9896J, data, "transform", uc.f6625U8, uc.f6604S8);
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) l7.d.h(context, template.f9897K, data, "transition_change", uc.f6608T1, uc.f6586R1);
            F2 f22 = (F2) l7.d.h(context, template.f9898L, data, "transition_in", uc.f6949y1, uc.f6927w1);
            F2 f23 = (F2) l7.d.h(context, template.f9899M, data, "transition_out", uc.f6949y1, uc.f6927w1);
            List listR = l7.d.r(context, template.f9900N, data, Ub.FROM_STRING, C1419x5.f9774r);
            List listQ16 = l7.d.q(context, template.f9901O, data, "variable_triggers", uc.f6657X8, uc.f6636V8);
            List listQ17 = l7.d.q(context, template.f9902P, data, "variables", uc.f6727d9, uc.f6703b9);
            l7.i iVar6 = C1419x5.f9769m;
            p9.l<String, EnumC1356sc> lVar3 = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b8 = C1419x5.f9764g;
            ?? L11 = l7.d.l(context, template.f9903Q, data, "visibility", iVar6, lVar3, c0000b8);
            if (L11 != 0) {
                c0000b8 = L11;
            }
            C1370tc c1370tc = (C1370tc) l7.d.h(context, template.f9904R, data, "visibility_action", uc.f6860p9, uc.n9);
            List listQ18 = l7.d.q(context, template.f9905S, data, "visibility_actions", uc.f6860p9, uc.n9);
            C9 c94 = (C9) l7.d.h(context, template.f9906T, data, "width", uc.U6, uc.f6602S6);
            if (c94 == null) {
                c94 = C1419x5.f9765h;
            }
            kotlin.jvm.internal.l.e(c94, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1405w5(c1130d0, c1175g0, c1332r22, listQ, bVarK, bVarK2, c0000b, listQ2, listQ3, x22, c0000b3, bVarE, bVarM, c0000b5, c0000b7, listQ4, listQ5, listQ6, z42, listQ7, c93, listQ8, listQ9, str, listQ10, l62, listQ11, c1362t4, c1362t42, listQ12, listQ13, bVarJ, bVarM2, listQ14, listQ15, qb, abstractC1178g3, f22, f23, listR, listQ16, listQ17, c0000b8, c1370tc, listQ18, c94);
        }
    }
}
