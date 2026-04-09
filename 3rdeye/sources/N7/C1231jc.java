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

/* compiled from: DivVideoJsonParser.kt */
/* renamed from: N7.jc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1231jc {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8598a = b.a.a(Double.valueOf(1.0d));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8599b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final C9.c f8600c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8601d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8602e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8603f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8604g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8605h;

    @Deprecated
    public static final C9.b i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8606j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8607k;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8608l;

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8609m;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final H7 f8610n;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final B8 f8611o;

    /* renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final C1154e9 f8612p;

    /* renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final G8 f8613q;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final C1094a9 f8614r;

    /* compiled from: DivVideoJsonParser.kt */
    /* renamed from: N7.jc$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8615g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1305p2);
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
    /* renamed from: N7.jc$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f8616g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1319q2);
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
    /* renamed from: N7.jc$c */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f8617g = new c(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1245kc);
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
    /* renamed from: N7.jc$d */
    public static final class d extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final d f8618g = new d(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1356sc);
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
    /* renamed from: N7.jc$e */
    public static final class e implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8619a;

        public e(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8619a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v22, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v29, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v32, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v37, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v54, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v7, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C1217ic a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f8619a;
            C1130d0 c1130d0 = (C1130d0) k8.F.q(context, data, "accessibility", uc.f6479H);
            l7.i iVar = C1231jc.f8606j;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "alignment_horizontal", iVar, lVar, lVar2, null);
            A7.b bVarB2 = l7.b.b(context, data, "alignment_vertical", C1231jc.f8607k, EnumC1319q2.FROM_STRING, lVar2, null);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            H7 h72 = C1231jc.f8610n;
            b.C0000b c0000b = C1231jc.f8598a;
            ?? B10 = l7.b.b(context, data, "alpha", dVar, dVar2, h72, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            List listS = k8.F.s(context, data, "animators", uc.f6863q1);
            K2 k22 = (K2) k8.F.q(context, data, "aspect", uc.f6960z1);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b3 = C1231jc.f8599b;
            ?? B11 = l7.b.b(context, data, "autostart", aVar, aVar2, lVar2, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            List listS2 = k8.F.s(context, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6429C1);
            X2 x22 = (X2) k8.F.q(context, data, "border", uc.f6492I1);
            b9.p pVar = uc.f6766h1;
            List listS3 = k8.F.s(context, data, "buffering_actions", pVar);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarB3 = l7.b.b(context, data, "column_span", eVar, eVar2, C1231jc.f8611o, null);
            List listS4 = k8.F.s(context, data, "disappear_actions", uc.f6535M2);
            A8.d dVar3 = l7.e.f43878b;
            String str = (String) k8.F.r(context, data, "elapsed_time_variable", dVar3, lVar2);
            List listS5 = k8.F.s(context, data, "end_actions", pVar);
            List listS6 = k8.F.s(context, data, "extensions", uc.f6662Y2);
            List listS7 = k8.F.s(context, data, "fatal_actions", pVar);
            Z4 z42 = (Z4) k8.F.q(context, data, "focus", uc.f6929w3);
            List listS8 = k8.F.s(context, data, "functions", uc.f6463F3);
            b9.p pVar2 = uc.f6602S6;
            C9 c92 = (C9) k8.F.q(context, data, "height", pVar2);
            if (c92 == null) {
                c92 = C1231jc.f8600c;
            }
            kotlin.jvm.internal.l.e(c92, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) k8.F.r(context, data, FacebookMediationAdapter.KEY_ID, dVar3, lVar2);
            L6 l62 = (L6) k8.F.q(context, data, "layout_provider", uc.f6506J4);
            b9.p pVar3 = uc.f6630V2;
            C1362t4 c1362t4 = (C1362t4) k8.F.q(context, data, "margins", pVar3);
            b.C0000b c0000b5 = C1231jc.f8601d;
            C9 c93 = c92;
            ?? B12 = l7.b.b(context, data, "muted", aVar, aVar2, lVar2, c0000b5);
            b.C0000b c0000b6 = B12 == 0 ? c0000b5 : B12;
            C1362t4 c1362t42 = (C1362t4) k8.F.q(context, data, "paddings", pVar3);
            List listS9 = k8.F.s(context, data, "pause_actions", pVar);
            JSONObject jSONObject = (JSONObject) k8.F.r(context, data, "player_settings_payload", dVar3, lVar2);
            b.C0000b c0000b7 = C1231jc.f8602e;
            ?? B13 = l7.b.b(context, data, "preload_required", aVar, aVar2, lVar2, c0000b7);
            b.C0000b c0000b8 = B13 == 0 ? c0000b7 : B13;
            k.g gVar = l7.k.f43898c;
            A7.b bVarB4 = l7.b.b(context, data, "preview", gVar, dVar3, lVar2, null);
            b.C0000b c0000b9 = C1231jc.f8603f;
            ?? B14 = l7.b.b(context, data, "repeatable", aVar, aVar2, lVar2, c0000b9);
            b.C0000b c0000b10 = B14 == 0 ? c0000b9 : B14;
            List listS10 = k8.F.s(context, data, "resume_actions", pVar);
            A7.b bVarB5 = l7.b.b(context, data, "reuse_id", gVar, dVar3, lVar2, null);
            A7.b bVarB6 = l7.b.b(context, data, "row_span", eVar, eVar2, C1231jc.f8612p, null);
            l7.i iVar2 = C1231jc.f8608l;
            p9.l<String, EnumC1245kc> lVar3 = EnumC1245kc.FROM_STRING;
            b.C0000b c0000b11 = C1231jc.f8604g;
            ?? B15 = l7.b.b(context, data, "scale", iVar2, lVar3, lVar2, c0000b11);
            b.C0000b c0000b12 = B15 == 0 ? c0000b11 : B15;
            List listS11 = k8.F.s(context, data, "selected_actions", pVar);
            List listS12 = k8.F.s(context, data, "tooltips", uc.f6572P8);
            Qb qb = (Qb) k8.F.q(context, data, "transform", uc.f6604S8);
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) k8.F.q(context, data, "transition_change", uc.f6586R1);
            b9.p pVar4 = uc.f6927w1;
            F2 f22 = (F2) k8.F.q(context, data, "transition_in", pVar4);
            F2 f23 = (F2) k8.F.q(context, data, "transition_out", pVar4);
            List listU = k8.F.u(context, data, "transition_triggers", Ub.FROM_STRING, C1231jc.f8613q);
            List listS13 = k8.F.s(context, data, "variable_triggers", uc.f6636V8);
            List listS14 = k8.F.s(context, data, "variables", uc.f6703b9);
            List listO = k8.F.o(context, data, "video_sources", uc.f6738e9, C1231jc.f8614r);
            kotlin.jvm.internal.l.e(listO, "readList(context, data, … VIDEO_SOURCES_VALIDATOR)");
            l7.i iVar3 = C1231jc.f8609m;
            p9.l<String, EnumC1356sc> lVar4 = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b13 = C1231jc.f8605h;
            ?? B16 = l7.b.b(context, data, "visibility", iVar3, lVar4, lVar2, c0000b13);
            if (B16 != 0) {
                c0000b13 = B16;
            }
            b9.p pVar5 = uc.n9;
            C1370tc c1370tc = (C1370tc) k8.F.q(context, data, "visibility_action", pVar5);
            List listS15 = k8.F.s(context, data, "visibility_actions", pVar5);
            C9 c94 = (C9) k8.F.q(context, data, "width", pVar2);
            if (c94 == null) {
                c94 = C1231jc.i;
            }
            kotlin.jvm.internal.l.e(c94, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1217ic(c1130d0, bVarB, bVarB2, c0000b2, listS, k22, c0000b4, listS2, x22, listS3, bVarB3, listS4, str, listS5, listS6, listS7, z42, listS8, c93, str2, l62, c1362t4, c0000b6, c1362t42, listS9, jSONObject, c0000b8, bVarB4, c0000b10, listS10, bVarB5, bVarB6, c0000b12, listS11, listS12, qb, abstractC1178g3, f22, f23, listU, listS13, listS14, listO, c0000b13, c1370tc, listS15, c94);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1217ic value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f8619a;
            k8.F.z(context, jSONObject, "accessibility", value.f8444a, uc.f6479H);
            l7.b.e(context, jSONObject, "alignment_horizontal", value.f8445b, EnumC1305p2.TO_STRING);
            l7.b.e(context, jSONObject, "alignment_vertical", value.f8446c, EnumC1319q2.TO_STRING);
            l7.b.d(context, jSONObject, "alpha", value.f8447d);
            k8.F.B(context, jSONObject, "animators", value.f8448e, uc.f6863q1);
            k8.F.z(context, jSONObject, "aspect", value.f8449f, uc.f6960z1);
            l7.b.d(context, jSONObject, "autostart", value.f8450g);
            k8.F.B(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f8451h, uc.f6429C1);
            k8.F.z(context, jSONObject, "border", value.i, uc.f6492I1);
            List<C1175g0> list = value.f8452j;
            b9.p pVar = uc.f6766h1;
            k8.F.B(context, jSONObject, "buffering_actions", list, pVar);
            l7.b.d(context, jSONObject, "column_span", value.f8453k);
            k8.F.B(context, jSONObject, "disappear_actions", value.f8454l, uc.f6535M2);
            k8.F.y(context, jSONObject, "elapsed_time_variable", value.f8455m);
            k8.F.B(context, jSONObject, "end_actions", value.f8456n, pVar);
            k8.F.B(context, jSONObject, "extensions", value.f8457o, uc.f6662Y2);
            k8.F.B(context, jSONObject, "fatal_actions", value.f8458p, pVar);
            k8.F.z(context, jSONObject, "focus", value.f8459q, uc.f6929w3);
            k8.F.B(context, jSONObject, "functions", value.f8460r, uc.f6463F3);
            C9 c92 = value.f8461s;
            b9.p pVar2 = uc.f6602S6;
            k8.F.z(context, jSONObject, "height", c92, pVar2);
            k8.F.y(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f8462t);
            k8.F.z(context, jSONObject, "layout_provider", value.f8463u, uc.f6506J4);
            C1362t4 c1362t4 = value.f8464v;
            b9.p pVar3 = uc.f6630V2;
            k8.F.z(context, jSONObject, "margins", c1362t4, pVar3);
            l7.b.d(context, jSONObject, "muted", value.f8465w);
            k8.F.z(context, jSONObject, "paddings", value.f8466x, pVar3);
            k8.F.B(context, jSONObject, "pause_actions", value.f8467y, pVar);
            k8.F.y(context, jSONObject, "player_settings_payload", value.f8468z);
            l7.b.d(context, jSONObject, "preload_required", value.f8422A);
            l7.b.d(context, jSONObject, "preview", value.f8423B);
            l7.b.d(context, jSONObject, "repeatable", value.f8424C);
            k8.F.B(context, jSONObject, "resume_actions", value.f8425D, pVar);
            l7.b.d(context, jSONObject, "reuse_id", value.f8426E);
            l7.b.d(context, jSONObject, "row_span", value.f8427F);
            l7.b.e(context, jSONObject, "scale", value.f8428G, EnumC1245kc.TO_STRING);
            k8.F.B(context, jSONObject, "selected_actions", value.f8429H, pVar);
            k8.F.B(context, jSONObject, "tooltips", value.f8430I, uc.f6572P8);
            k8.F.z(context, jSONObject, "transform", value.f8431J, uc.f6604S8);
            k8.F.z(context, jSONObject, "transition_change", value.f8432K, uc.f6586R1);
            F2 f22 = value.f8433L;
            b9.p pVar4 = uc.f6927w1;
            k8.F.z(context, jSONObject, "transition_in", f22, pVar4);
            k8.F.z(context, jSONObject, "transition_out", value.f8434M, pVar4);
            k8.F.C(context, jSONObject, value.f8435N, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "video");
            k8.F.B(context, jSONObject, "variable_triggers", value.f8436O, uc.f6636V8);
            k8.F.B(context, jSONObject, "variables", value.f8437P, uc.f6703b9);
            k8.F.B(context, jSONObject, "video_sources", value.f8438Q, uc.f6738e9);
            l7.b.e(context, jSONObject, "visibility", value.f8439R, EnumC1356sc.TO_STRING);
            C1370tc c1370tc = value.f8440S;
            b9.p pVar5 = uc.n9;
            k8.F.z(context, jSONObject, "visibility_action", c1370tc, pVar5);
            k8.F.B(context, jSONObject, "visibility_actions", value.f8441T, pVar5);
            k8.F.z(context, jSONObject, "width", value.f8442U, pVar2);
            return jSONObject;
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
    /* renamed from: N7.jc$f */
    public static final class f implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8620a;

        public f(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8620a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final C1342rc d(D7.f fVar, C1342rc c1342rc, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a<C1160f0> abstractC5371a = c1342rc != null ? c1342rc.f9104a : null;
            Uc uc = this.f8620a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "accessibility", zP, abstractC5371a, uc.f6490I);
            l7.i iVar = C1231jc.f8606j;
            AbstractC5371a<A7.b<EnumC1305p2>> abstractC5371a2 = c1342rc != null ? c1342rc.f9105b : null;
            p9.l<String, EnumC1305p2> lVar = EnumC1305p2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "alignment_horizontal", iVar, zP, abstractC5371a2, lVar, lVar2);
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "alignment_vertical", C1231jc.f8607k, zP, c1342rc != null ? c1342rc.f9106c : null, EnumC1319q2.FROM_STRING, lVar2);
            AbstractC5371a abstractC5371aJ3 = l7.c.j(fVarW, jSONObject, "alpha", l7.k.f43899d, zP, c1342rc != null ? c1342rc.f9107d : null, l7.h.f43885f, C1231jc.f8610n);
            AbstractC5371a abstractC5371aK = l7.c.k(fVarW, jSONObject, "animators", zP, c1342rc != null ? c1342rc.f9108e : null, uc.f6874r1);
            AbstractC5371a abstractC5371aH2 = l7.c.h(fVarW, jSONObject, "aspect", zP, c1342rc != null ? c1342rc.f9109f : null, uc.f6407A1);
            k.a aVar = l7.k.f43896a;
            AbstractC5371a<A7.b<Boolean>> abstractC5371a3 = c1342rc != null ? c1342rc.f9110g : null;
            h.a aVar2 = l7.h.f43884e;
            AbstractC5371a abstractC5371aJ4 = l7.c.j(fVarW, jSONObject, "autostart", aVar, zP, abstractC5371a3, aVar2, lVar2);
            AbstractC5371a abstractC5371aK2 = l7.c.k(fVarW, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, zP, c1342rc != null ? c1342rc.f9111h : null, uc.f6440D1);
            AbstractC5371a abstractC5371aH3 = l7.c.h(fVarW, jSONObject, "border", zP, c1342rc != null ? c1342rc.i : null, uc.f6503J1);
            AbstractC5371a abstractC5371aK3 = l7.c.k(fVarW, jSONObject, "buffering_actions", zP, c1342rc != null ? c1342rc.f9112j : null, uc.f6777i1);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a4 = c1342rc != null ? c1342rc.f9113k : null;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aJ5 = l7.c.j(fVarW, jSONObject, "column_span", eVar, zP, abstractC5371a4, eVar2, C1231jc.f8611o);
            AbstractC5371a abstractC5371aK4 = l7.c.k(fVarW, jSONObject, "disappear_actions", zP, c1342rc != null ? c1342rc.f9114l : null, uc.f6545N2);
            AbstractC5371a<String> abstractC5371a5 = c1342rc != null ? c1342rc.f9115m : null;
            A8.d dVar = l7.e.f43878b;
            AbstractC5371a abstractC5371aI = l7.c.i(fVarW, jSONObject, "elapsed_time_variable", zP, abstractC5371a5, dVar);
            AbstractC5371a abstractC5371aK5 = l7.c.k(fVarW, jSONObject, "end_actions", zP, c1342rc != null ? c1342rc.f9116n : null, uc.f6777i1);
            AbstractC5371a abstractC5371aK6 = l7.c.k(fVarW, jSONObject, "extensions", zP, c1342rc != null ? c1342rc.f9117o : null, uc.f6673Z2);
            AbstractC5371a abstractC5371aK7 = l7.c.k(fVarW, jSONObject, "fatal_actions", zP, c1342rc != null ? c1342rc.f9118p : null, uc.f6777i1);
            AbstractC5371a abstractC5371aH4 = l7.c.h(fVarW, jSONObject, "focus", zP, c1342rc != null ? c1342rc.f9119q : null, uc.f6940x3);
            AbstractC5371a abstractC5371aK8 = l7.c.k(fVarW, jSONObject, "functions", zP, c1342rc != null ? c1342rc.f9120r : null, uc.f6474G3);
            AbstractC5371a abstractC5371aH5 = l7.c.h(fVarW, jSONObject, "height", zP, c1342rc != null ? c1342rc.f9121s : null, uc.f6613T6);
            AbstractC5371a abstractC5371aI2 = l7.c.i(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, zP, c1342rc != null ? c1342rc.f9122t : null, dVar);
            AbstractC5371a abstractC5371aH6 = l7.c.h(fVarW, jSONObject, "layout_provider", zP, c1342rc != null ? c1342rc.f9123u : null, uc.f6517K4);
            AbstractC5371a abstractC5371aH7 = l7.c.h(fVarW, jSONObject, "margins", zP, c1342rc != null ? c1342rc.f9124v : null, uc.f6641W2);
            AbstractC5371a abstractC5371aJ6 = l7.c.j(fVarW, jSONObject, "muted", aVar, zP, c1342rc != null ? c1342rc.f9125w : null, aVar2, lVar2);
            AbstractC5371a abstractC5371aH8 = l7.c.h(fVarW, jSONObject, "paddings", zP, c1342rc != null ? c1342rc.f9126x : null, uc.f6641W2);
            AbstractC5371a abstractC5371aK9 = l7.c.k(fVarW, jSONObject, "pause_actions", zP, c1342rc != null ? c1342rc.f9127y : null, uc.f6777i1);
            AbstractC5371a abstractC5371aI3 = l7.c.i(fVarW, jSONObject, "player_settings_payload", zP, c1342rc != null ? c1342rc.f9128z : null, dVar);
            AbstractC5371a abstractC5371aJ7 = l7.c.j(fVarW, jSONObject, "preload_required", aVar, zP, c1342rc != null ? c1342rc.f9083A : null, aVar2, lVar2);
            k.g gVar = l7.k.f43898c;
            AbstractC5371a abstractC5371aJ8 = l7.c.j(fVarW, jSONObject, "preview", gVar, zP, c1342rc != null ? c1342rc.f9084B : null, dVar, lVar2);
            AbstractC5371a abstractC5371aJ9 = l7.c.j(fVarW, jSONObject, "repeatable", aVar, zP, c1342rc != null ? c1342rc.f9085C : null, aVar2, lVar2);
            AbstractC5371a abstractC5371aK10 = l7.c.k(fVarW, jSONObject, "resume_actions", zP, c1342rc != null ? c1342rc.f9086D : null, uc.f6777i1);
            AbstractC5371a abstractC5371aJ10 = l7.c.j(fVarW, jSONObject, "reuse_id", gVar, zP, c1342rc != null ? c1342rc.f9087E : null, dVar, lVar2);
            AbstractC5371a abstractC5371aJ11 = l7.c.j(fVarW, jSONObject, "row_span", eVar, zP, c1342rc != null ? c1342rc.f9088F : null, eVar2, C1231jc.f8612p);
            AbstractC5371a abstractC5371aJ12 = l7.c.j(fVarW, jSONObject, "scale", C1231jc.f8608l, zP, c1342rc != null ? c1342rc.f9089G : null, EnumC1245kc.FROM_STRING, lVar2);
            AbstractC5371a abstractC5371aK11 = l7.c.k(fVarW, jSONObject, "selected_actions", zP, c1342rc != null ? c1342rc.f9090H : null, uc.f6777i1);
            AbstractC5371a abstractC5371aK12 = l7.c.k(fVarW, jSONObject, "tooltips", zP, c1342rc != null ? c1342rc.f9091I : null, uc.f6582Q8);
            AbstractC5371a abstractC5371aH9 = l7.c.h(fVarW, jSONObject, "transform", zP, c1342rc != null ? c1342rc.f9092J : null, uc.f6615T8);
            AbstractC5371a abstractC5371aH10 = l7.c.h(fVarW, jSONObject, "transition_change", zP, c1342rc != null ? c1342rc.f9093K : null, uc.f6597S1);
            AbstractC5371a abstractC5371aH11 = l7.c.h(fVarW, jSONObject, "transition_in", zP, c1342rc != null ? c1342rc.f9094L : null, uc.f6938x1);
            AbstractC5371a abstractC5371aH12 = l7.c.h(fVarW, jSONObject, "transition_out", zP, c1342rc != null ? c1342rc.f9095M : null, uc.f6938x1);
            AbstractC5371a<List<Ub>> abstractC5371a6 = c1342rc != null ? c1342rc.f9096N : null;
            p9.l<String, Ub> lVar3 = Ub.FROM_STRING;
            G8 g82 = C1231jc.f8613q;
            kotlin.jvm.internal.l.d(g82, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            AbstractC5371a abstractC5371aM = l7.c.m(fVarW, jSONObject, zP, abstractC5371a6, lVar3, g82);
            AbstractC5371a abstractC5371aK13 = l7.c.k(fVarW, jSONObject, "variable_triggers", zP, c1342rc != null ? c1342rc.f9097O : null, uc.f6647W8);
            AbstractC5371a abstractC5371aK14 = l7.c.k(fVarW, jSONObject, "variables", zP, c1342rc != null ? c1342rc.f9098P : null, uc.f6715c9);
            AbstractC5371a<List<C1329qc>> abstractC5371a7 = c1342rc != null ? c1342rc.f9099Q : null;
            C1094a9 c1094a9 = C1231jc.f8614r;
            kotlin.jvm.internal.l.d(c1094a9, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new C1342rc(abstractC5371aH, abstractC5371aJ, abstractC5371aJ2, abstractC5371aJ3, abstractC5371aK, abstractC5371aH2, abstractC5371aJ4, abstractC5371aK2, abstractC5371aH3, abstractC5371aK3, abstractC5371aJ5, abstractC5371aK4, abstractC5371aI, abstractC5371aK5, abstractC5371aK6, abstractC5371aK7, abstractC5371aH4, abstractC5371aK8, abstractC5371aH5, abstractC5371aI2, abstractC5371aH6, abstractC5371aH7, abstractC5371aJ6, abstractC5371aH8, abstractC5371aK9, abstractC5371aI3, abstractC5371aJ7, abstractC5371aJ8, abstractC5371aJ9, abstractC5371aK10, abstractC5371aJ10, abstractC5371aJ11, abstractC5371aJ12, abstractC5371aK11, abstractC5371aK12, abstractC5371aH9, abstractC5371aH10, abstractC5371aH11, abstractC5371aH12, abstractC5371aM, abstractC5371aK13, abstractC5371aK14, l7.c.f(fVarW, jSONObject, "video_sources", zP, abstractC5371a7, uc.f6750f9, c1094a9), l7.c.j(fVarW, jSONObject, "visibility", C1231jc.f8609m, zP, c1342rc != null ? c1342rc.f9100R : null, EnumC1356sc.FROM_STRING, lVar2), l7.c.h(fVarW, jSONObject, "visibility_action", zP, c1342rc != null ? c1342rc.f9101S : null, uc.f6849o9), l7.c.k(fVarW, jSONObject, "visibility_actions", zP, c1342rc != null ? c1342rc.f9102T : null, uc.f6849o9), l7.c.h(fVarW, jSONObject, "width", zP, c1342rc != null ? c1342rc.f9103U : null, uc.f6613T6));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1342rc value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f8620a;
            l7.c.u(context, jSONObject, "accessibility", value.f9104a, uc.f6490I);
            l7.c.p(context, "alignment_horizontal", value.f9105b, jSONObject, EnumC1305p2.TO_STRING);
            l7.c.p(context, "alignment_vertical", value.f9106c, jSONObject, EnumC1319q2.TO_STRING);
            l7.c.q(context, jSONObject, "alpha", value.f9107d);
            l7.c.v(context, jSONObject, "animators", value.f9108e, uc.f6874r1);
            l7.c.u(context, jSONObject, "aspect", value.f9109f, uc.f6407A1);
            l7.c.q(context, jSONObject, "autostart", value.f9110g);
            l7.c.v(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f9111h, uc.f6440D1);
            l7.c.u(context, jSONObject, "border", value.i, uc.f6503J1);
            AbstractC5371a<List<C1132d2>> abstractC5371a = value.f9112j;
            b9.p pVar = uc.f6777i1;
            l7.c.v(context, jSONObject, "buffering_actions", abstractC5371a, pVar);
            l7.c.q(context, jSONObject, "column_span", value.f9113k);
            l7.c.v(context, jSONObject, "disappear_actions", value.f9114l, uc.f6545N2);
            l7.c.t(context, jSONObject, "elapsed_time_variable", value.f9115m);
            l7.c.v(context, jSONObject, "end_actions", value.f9116n, pVar);
            l7.c.v(context, jSONObject, "extensions", value.f9117o, uc.f6673Z2);
            l7.c.v(context, jSONObject, "fatal_actions", value.f9118p, pVar);
            l7.c.u(context, jSONObject, "focus", value.f9119q, uc.f6940x3);
            l7.c.v(context, jSONObject, "functions", value.f9120r, uc.f6474G3);
            AbstractC5371a<G9> abstractC5371a2 = value.f9121s;
            b9.p pVar2 = uc.f6613T6;
            l7.c.u(context, jSONObject, "height", abstractC5371a2, pVar2);
            l7.c.t(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f9122t);
            l7.c.u(context, jSONObject, "layout_provider", value.f9123u, uc.f6517K4);
            AbstractC5371a<C1390v4> abstractC5371a3 = value.f9124v;
            b9.p pVar3 = uc.f6641W2;
            l7.c.u(context, jSONObject, "margins", abstractC5371a3, pVar3);
            l7.c.q(context, jSONObject, "muted", value.f9125w);
            l7.c.u(context, jSONObject, "paddings", value.f9126x, pVar3);
            l7.c.v(context, jSONObject, "pause_actions", value.f9127y, pVar);
            l7.c.t(context, jSONObject, "player_settings_payload", value.f9128z);
            l7.c.q(context, jSONObject, "preload_required", value.f9083A);
            l7.c.q(context, jSONObject, "preview", value.f9084B);
            l7.c.q(context, jSONObject, "repeatable", value.f9085C);
            l7.c.v(context, jSONObject, "resume_actions", value.f9086D, pVar);
            l7.c.q(context, jSONObject, "reuse_id", value.f9087E);
            l7.c.q(context, jSONObject, "row_span", value.f9088F);
            l7.c.p(context, "scale", value.f9089G, jSONObject, EnumC1245kc.TO_STRING);
            l7.c.v(context, jSONObject, "selected_actions", value.f9090H, pVar);
            l7.c.v(context, jSONObject, "tooltips", value.f9091I, uc.f6582Q8);
            l7.c.u(context, jSONObject, "transform", value.f9092J, uc.f6615T8);
            l7.c.u(context, jSONObject, "transition_change", value.f9093K, uc.f6597S1);
            AbstractC5371a<J2> abstractC5371a4 = value.f9094L;
            b9.p pVar4 = uc.f6938x1;
            l7.c.u(context, jSONObject, "transition_in", abstractC5371a4, pVar4);
            l7.c.u(context, jSONObject, "transition_out", value.f9095M, pVar4);
            l7.c.w(context, jSONObject, value.f9096N, Ub.TO_STRING);
            k8.F.y(context, jSONObject, "type", "video");
            l7.c.v(context, jSONObject, "variable_triggers", value.f9097O, uc.f6647W8);
            l7.c.v(context, jSONObject, "variables", value.f9098P, uc.f6715c9);
            l7.c.v(context, jSONObject, "video_sources", value.f9099Q, uc.f6750f9);
            l7.c.p(context, "visibility", value.f9100R, jSONObject, EnumC1356sc.TO_STRING);
            AbstractC5371a<C1398vc> abstractC5371a5 = value.f9101S;
            b9.p pVar5 = uc.f6849o9;
            l7.c.u(context, jSONObject, "visibility_action", abstractC5371a5, pVar5);
            l7.c.v(context, jSONObject, "visibility_actions", value.f9102T, pVar5);
            l7.c.u(context, jSONObject, "width", value.f9103U, pVar2);
            return jSONObject;
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
    /* renamed from: N7.jc$g */
    public static final class g implements D7.j<JSONObject, C1342rc, C1217ic> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8621a;

        public g(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8621a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v13, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v37, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v44, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v47, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v52, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v69, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v8, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1217ic a(D7.f context, C1342rc template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f8621a;
            C1130d0 c1130d0 = (C1130d0) l7.d.h(context, template.f9104a, data, "accessibility", uc.f6501J, uc.f6479H);
            A7.b bVarK = l7.d.k(context, template.f9105b, data, "alignment_horizontal", C1231jc.f8606j, EnumC1305p2.FROM_STRING);
            A7.b bVarK2 = l7.d.k(context, template.f9106c, data, "alignment_vertical", C1231jc.f8607k, EnumC1319q2.FROM_STRING);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            H7 h72 = C1231jc.f8610n;
            b.C0000b c0000b = C1231jc.f8598a;
            ?? N8 = l7.d.n(context, template.f9107d, data, "alpha", dVar, dVar2, h72, c0000b);
            if (N8 != 0) {
                c0000b = N8;
            }
            List listQ = l7.d.q(context, template.f9108e, data, "animators", uc.f6884s1, uc.f6863q1);
            K2 k22 = (K2) l7.d.h(context, template.f9109f, data, "aspect", uc.f6418B1, uc.f6960z1);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b2 = C1231jc.f8599b;
            ?? L7 = l7.d.l(context, template.f9110g, data, "autostart", aVar, aVar2, c0000b2);
            b.C0000b c0000b3 = L7 == 0 ? c0000b2 : L7;
            List listQ2 = l7.d.q(context, template.f9111h, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6451E1, uc.f6429C1);
            X2 x22 = (X2) l7.d.h(context, template.i, data, "border", uc.f6514K1, uc.f6492I1);
            List listQ3 = l7.d.q(context, template.f9112j, data, "buffering_actions", uc.f6789j1, uc.f6766h1);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarM = l7.d.m(context, template.f9113k, data, "column_span", eVar, eVar2, C1231jc.f8611o);
            List listQ4 = l7.d.q(context, template.f9114l, data, "disappear_actions", uc.f6555O2, uc.f6535M2);
            AbstractC5371a<String> abstractC5371a = template.f9115m;
            A8.d dVar3 = l7.e.f43878b;
            String str = (String) l7.d.g(context, "elapsed_time_variable", abstractC5371a, data, dVar3);
            List listQ5 = l7.d.q(context, template.f9116n, data, "end_actions", uc.f6789j1, uc.f6766h1);
            List listQ6 = l7.d.q(context, template.f9117o, data, "extensions", uc.f6685a3, uc.f6662Y2);
            List listQ7 = l7.d.q(context, template.f9118p, data, "fatal_actions", uc.f6789j1, uc.f6766h1);
            Z4 z42 = (Z4) l7.d.h(context, template.f9119q, data, "focus", uc.f6951y3, uc.f6929w3);
            List listQ8 = l7.d.q(context, template.f9120r, data, "functions", uc.f6483H3, uc.f6463F3);
            C9 c92 = (C9) l7.d.h(context, template.f9121s, data, "height", uc.U6, uc.f6602S6);
            if (c92 == null) {
                c92 = C1231jc.f8600c;
            }
            kotlin.jvm.internal.l.e(c92, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            String str2 = (String) l7.d.g(context, FacebookMediationAdapter.KEY_ID, template.f9122t, data, dVar3);
            C9 c93 = c92;
            L6 l62 = (L6) l7.d.h(context, template.f9123u, data, "layout_provider", uc.f6528L4, uc.f6506J4);
            C1362t4 c1362t4 = (C1362t4) l7.d.h(context, template.f9124v, data, "margins", uc.f6652X2, uc.f6630V2);
            b.C0000b c0000b4 = C1231jc.f8601d;
            b.C0000b c0000b5 = c0000b;
            ?? L8 = l7.d.l(context, template.f9125w, data, "muted", aVar, aVar2, c0000b4);
            b.C0000b c0000b6 = L8 == 0 ? c0000b4 : L8;
            C1362t4 c1362t42 = (C1362t4) l7.d.h(context, template.f9126x, data, "paddings", uc.f6652X2, uc.f6630V2);
            List listQ9 = l7.d.q(context, template.f9127y, data, "pause_actions", uc.f6789j1, uc.f6766h1);
            JSONObject jSONObject = (JSONObject) l7.d.g(context, "player_settings_payload", template.f9128z, data, dVar3);
            b.C0000b c0000b7 = C1231jc.f8602e;
            ?? L10 = l7.d.l(context, template.f9083A, data, "preload_required", aVar, aVar2, c0000b7);
            b.C0000b c0000b8 = L10 == 0 ? c0000b7 : L10;
            k.g gVar = l7.k.f43898c;
            A7.b bVarJ = l7.d.j(context, template.f9084B, data, "preview", gVar);
            b.C0000b c0000b9 = C1231jc.f8603f;
            ?? L11 = l7.d.l(context, template.f9085C, data, "repeatable", aVar, aVar2, c0000b9);
            b.C0000b c0000b10 = L11 == 0 ? c0000b9 : L11;
            List listQ10 = l7.d.q(context, template.f9086D, data, "resume_actions", uc.f6789j1, uc.f6766h1);
            A7.b bVarJ2 = l7.d.j(context, template.f9087E, data, "reuse_id", gVar);
            A7.b bVarM2 = l7.d.m(context, template.f9088F, data, "row_span", eVar, eVar2, C1231jc.f8612p);
            l7.i iVar = C1231jc.f8608l;
            p9.l<String, EnumC1245kc> lVar = EnumC1245kc.FROM_STRING;
            b.C0000b c0000b11 = C1231jc.f8604g;
            ?? L12 = l7.d.l(context, template.f9089G, data, "scale", iVar, lVar, c0000b11);
            b.C0000b c0000b12 = L12 == 0 ? c0000b11 : L12;
            List listQ11 = l7.d.q(context, template.f9090H, data, "selected_actions", uc.f6789j1, uc.f6766h1);
            List listQ12 = l7.d.q(context, template.f9091I, data, "tooltips", uc.f6593R8, uc.f6572P8);
            Qb qb = (Qb) l7.d.h(context, template.f9092J, data, "transform", uc.f6625U8, uc.f6604S8);
            AbstractC1178g3 abstractC1178g3 = (AbstractC1178g3) l7.d.h(context, template.f9093K, data, "transition_change", uc.f6608T1, uc.f6586R1);
            F2 f22 = (F2) l7.d.h(context, template.f9094L, data, "transition_in", uc.f6949y1, uc.f6927w1);
            F2 f23 = (F2) l7.d.h(context, template.f9095M, data, "transition_out", uc.f6949y1, uc.f6927w1);
            List listR = l7.d.r(context, template.f9096N, data, Ub.FROM_STRING, C1231jc.f8613q);
            List listQ13 = l7.d.q(context, template.f9097O, data, "variable_triggers", uc.f6657X8, uc.f6636V8);
            List listQ14 = l7.d.q(context, template.f9098P, data, "variables", uc.f6727d9, uc.f6703b9);
            List listF = l7.d.f(context, template.f9099Q, data, "video_sources", uc.f6762g9, uc.f6738e9, C1231jc.f8614r);
            kotlin.jvm.internal.l.e(listF, "resolveList(context, tem… VIDEO_SOURCES_VALIDATOR)");
            l7.i iVar2 = C1231jc.f8609m;
            p9.l<String, EnumC1356sc> lVar2 = EnumC1356sc.FROM_STRING;
            b.C0000b c0000b13 = C1231jc.f8605h;
            ?? L13 = l7.d.l(context, template.f9100R, data, "visibility", iVar2, lVar2, c0000b13);
            if (L13 != 0) {
                c0000b13 = L13;
            }
            C1370tc c1370tc = (C1370tc) l7.d.h(context, template.f9101S, data, "visibility_action", uc.f6860p9, uc.n9);
            List listQ15 = l7.d.q(context, template.f9102T, data, "visibility_actions", uc.f6860p9, uc.n9);
            C9 c94 = (C9) l7.d.h(context, template.f9103U, data, "width", uc.U6, uc.f6602S6);
            if (c94 == null) {
                c94 = C1231jc.i;
            }
            kotlin.jvm.internal.l.e(c94, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new C1217ic(c1130d0, bVarK, bVarK2, c0000b5, listQ, k22, c0000b3, listQ2, x22, listQ3, bVarM, listQ4, str, listQ5, listQ6, listQ7, z42, listQ8, c93, str2, l62, c1362t4, c0000b6, c1362t42, listQ9, jSONObject, c0000b8, bVarJ, c0000b10, listQ10, bVarJ2, bVarM2, c0000b12, listQ11, listQ12, qb, abstractC1178g3, f22, f23, listR, listQ13, listQ14, listF, c0000b13, c1370tc, listQ15, c94);
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f8599b = b.a.a(bool);
        f8600c = new C9.c(new C1412wc(null, null, null));
        f8601d = b.a.a(bool);
        f8602e = b.a.a(bool);
        f8603f = b.a.a(bool);
        f8604g = b.a.a(EnumC1245kc.FIT);
        f8605h = b.a.a(EnumC1356sc.VISIBLE);
        i = new C9.b(new V6(null));
        Object objM = C2091l.m(EnumC1305p2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f8615g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f8606j = new l7.i(objM, validator);
        Object objM2 = C2091l.m(EnumC1319q2.values());
        kotlin.jvm.internal.l.f(objM2, "default");
        b validator2 = b.f8616g;
        kotlin.jvm.internal.l.f(validator2, "validator");
        f8607k = new l7.i(objM2, validator2);
        Object objM3 = C2091l.m(EnumC1245kc.values());
        kotlin.jvm.internal.l.f(objM3, "default");
        c validator3 = c.f8617g;
        kotlin.jvm.internal.l.f(validator3, "validator");
        f8608l = new l7.i(objM3, validator3);
        Object objM4 = C2091l.m(EnumC1356sc.values());
        kotlin.jvm.internal.l.f(objM4, "default");
        d validator4 = d.f8618g;
        kotlin.jvm.internal.l.f(validator4, "validator");
        f8609m = new l7.i(objM4, validator4);
        f8610n = new H7(15);
        f8611o = new B8(15);
        f8612p = new C1154e9(13);
        f8613q = new G8(15);
        f8614r = new C1094a9(15);
    }
}
