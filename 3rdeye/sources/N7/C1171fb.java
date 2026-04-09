package N7;

import A7.b;
import N7.C1383ub;
import N7.Ka;
import c9.C2091l;
import java.util.List;
import l7.h;
import l7.j;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* renamed from: N7.fb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1171fb {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8229a = b.a.a(Double.valueOf(0.0d));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8230b = b.a.a(H9.SP);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8231c = b.a.a(0L);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8232d = j.a.a(C2091l.m(La.values()), a.f8242g);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8233e = j.a.a(C2091l.m(H9.values()), b.f8243g);

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8234f = j.a.a(C2091l.m(EnumC1195h5.values()), c.f8244g);

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8235g = j.a.a(C2091l.m(Q6.values()), d.f8245g);

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8236h = j.a.a(C2091l.m(Q6.values()), e.f8246g);

    @Deprecated
    public static final C1094a9 i = new C1094a9(12);

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final H7 f8237j = new H7(13);

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final B8 f8238k = new B8(13);

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final C1154e9 f8239l = new C1154e9(11);

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final G8 f8240m = new G8(13);

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final C1094a9 f8241n = new C1094a9(13);

    /* compiled from: DivTextJsonParser.kt */
    /* renamed from: N7.fb$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8242g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof La);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    /* renamed from: N7.fb$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f8243g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof H9);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    /* renamed from: N7.fb$c */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f8244g = new c(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1195h5);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    /* renamed from: N7.fb$d */
    public static final class d extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final d f8245g = new d(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof Q6);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    /* renamed from: N7.fb$e */
    public static final class e extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final e f8246g = new e(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof Q6);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    /* renamed from: N7.fb$f */
    public static final class f implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8247a;

        public f(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8247a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v15, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v24, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v7, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f8247a;
            List listS = k8.F.s(context, data, "actions", uc.f6766h1);
            l7.i iVar = C1171fb.f8232d;
            p9.l<String, La> lVar = La.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "alignment_vertical", iVar, lVar, lVar2, null);
            Xa xa = (Xa) k8.F.q(context, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6656X7);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            b.C0000b c0000b = C1171fb.f8229a;
            ?? B10 = l7.b.b(context, data, "baseline_offset", dVar, dVar2, lVar2, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            C1126cb c1126cb = (C1126cb) k8.F.q(context, data, "border", uc.f6690a8);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarB2 = l7.b.b(context, data, "end", eVar, eVar2, C1171fb.i, null);
            k.g gVar = l7.k.f43898c;
            A8.d dVar3 = l7.e.f43878b;
            A7.b bVarB3 = l7.b.b(context, data, "font_family", gVar, dVar3, lVar2, null);
            A7.b bVarB4 = l7.b.b(context, data, "font_feature_settings", gVar, dVar3, lVar2, null);
            A7.b bVarB5 = l7.b.b(context, data, "font_size", eVar, eVar2, C1171fb.f8237j, null);
            l7.i iVar2 = C1171fb.f8233e;
            p9.l<String, H9> lVar3 = H9.FROM_STRING;
            b.C0000b c0000b3 = C1171fb.f8230b;
            ?? B11 = l7.b.b(context, data, "font_size_unit", iVar2, lVar3, lVar2, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            A7.b bVarB6 = l7.b.b(context, data, "font_variation_settings", l7.k.f43903h, dVar3, lVar2, null);
            A7.b bVarB7 = l7.b.b(context, data, "font_weight", C1171fb.f8234f, EnumC1195h5.FROM_STRING, lVar2, null);
            A7.b bVarB8 = l7.b.b(context, data, "font_weight_value", eVar, eVar2, C1171fb.f8238k, null);
            A7.b bVarB9 = l7.b.b(context, data, "letter_spacing", dVar, dVar2, lVar2, null);
            A7.b bVarB10 = l7.b.b(context, data, "line_height", eVar, eVar2, C1171fb.f8239l, null);
            AbstractC1186gb abstractC1186gb = (AbstractC1186gb) k8.F.q(context, data, "mask", uc.f6816l8);
            G8 g82 = C1171fb.f8240m;
            b.C0000b c0000b5 = C1171fb.f8231c;
            ?? B12 = l7.b.b(context, data, "start", eVar, eVar2, g82, c0000b5);
            b.C0000b c0000b6 = B12 == 0 ? c0000b5 : B12;
            l7.i iVar3 = C1171fb.f8235g;
            p9.l<String, Q6> lVar4 = Q6.FROM_STRING;
            return new Ka.c(listS, bVarB, xa, c0000b2, c1126cb, bVarB2, bVarB3, bVarB4, bVarB5, c0000b4, bVarB6, bVarB7, bVarB8, bVarB9, bVarB10, abstractC1186gb, c0000b6, l7.b.b(context, data, "strike", iVar3, lVar4, lVar2, null), l7.b.b(context, data, "text_color", l7.k.f43901f, l7.h.f43881b, lVar2, null), (C1298o9) k8.F.q(context, data, "text_shadow", uc.f6508J6), l7.b.b(context, data, "top_offset", eVar, eVar2, C1171fb.f8241n, null), l7.b.b(context, data, "underline", C1171fb.f8236h, lVar4, lVar2, null));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Ka.c value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f8247a;
            k8.F.B(context, jSONObject, "actions", value.f5722a, uc.f6766h1);
            l7.b.e(context, jSONObject, "alignment_vertical", value.f5723b, La.TO_STRING);
            k8.F.z(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f5724c, uc.f6656X7);
            l7.b.d(context, jSONObject, "baseline_offset", value.f5725d);
            k8.F.z(context, jSONObject, "border", value.f5726e, uc.f6690a8);
            l7.b.d(context, jSONObject, "end", value.f5727f);
            l7.b.d(context, jSONObject, "font_family", value.f5728g);
            l7.b.d(context, jSONObject, "font_feature_settings", value.f5729h);
            l7.b.d(context, jSONObject, "font_size", value.i);
            l7.b.e(context, jSONObject, "font_size_unit", value.f5730j, H9.TO_STRING);
            l7.b.d(context, jSONObject, "font_variation_settings", value.f5731k);
            l7.b.e(context, jSONObject, "font_weight", value.f5732l, EnumC1195h5.TO_STRING);
            l7.b.d(context, jSONObject, "font_weight_value", value.f5733m);
            l7.b.d(context, jSONObject, "letter_spacing", value.f5734n);
            l7.b.d(context, jSONObject, "line_height", value.f5735o);
            k8.F.z(context, jSONObject, "mask", value.f5736p, uc.f6816l8);
            l7.b.d(context, jSONObject, "start", value.f5737q);
            p9.l<Q6, String> lVar = Q6.TO_STRING;
            l7.b.e(context, jSONObject, "strike", value.f5738r, lVar);
            l7.b.e(context, jSONObject, "text_color", value.f5739s, l7.h.f43880a);
            k8.F.z(context, jSONObject, "text_shadow", value.f5740t, uc.f6508J6);
            l7.b.d(context, jSONObject, "top_offset", value.f5741u);
            l7.b.e(context, jSONObject, "underline", value.f5742v, lVar);
            return jSONObject;
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    /* renamed from: N7.fb$g */
    public static final class g implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8248a;

        public g(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8248a = component;
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
            Uc uc = this.f8248a;
            AbstractC5371a abstractC5371aK = l7.c.k(fVarW, jSONObject, "actions", zP, null, uc.f6777i1);
            l7.i iVar = C1171fb.f8232d;
            p9.l<String, La> lVar = La.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "alignment_vertical", iVar, zP, null, lVar, lVar2);
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, zP, null, uc.f6667Y7);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "baseline_offset", dVar, zP, null, dVar2, lVar2);
            AbstractC5371a abstractC5371aH2 = l7.c.h(fVarW, jSONObject, "border", zP, null, uc.f6702b8);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aJ3 = l7.c.j(fVarW, jSONObject, "end", eVar, zP, null, eVar2, C1171fb.i);
            k.g gVar = l7.k.f43898c;
            A8.d dVar3 = l7.e.f43878b;
            AbstractC5371a abstractC5371aJ4 = l7.c.j(fVarW, jSONObject, "font_family", gVar, zP, null, dVar3, lVar2);
            AbstractC5371a abstractC5371aJ5 = l7.c.j(fVarW, jSONObject, "font_feature_settings", gVar, zP, null, dVar3, lVar2);
            AbstractC5371a abstractC5371aJ6 = l7.c.j(fVarW, jSONObject, "font_size", eVar, zP, null, eVar2, C1171fb.f8237j);
            AbstractC5371a abstractC5371aJ7 = l7.c.j(fVarW, jSONObject, "font_size_unit", C1171fb.f8233e, zP, null, H9.FROM_STRING, lVar2);
            AbstractC5371a abstractC5371aJ8 = l7.c.j(fVarW, jSONObject, "font_variation_settings", l7.k.f43903h, zP, null, dVar3, lVar2);
            AbstractC5371a abstractC5371aJ9 = l7.c.j(fVarW, jSONObject, "font_weight", C1171fb.f8234f, zP, null, EnumC1195h5.FROM_STRING, lVar2);
            AbstractC5371a abstractC5371aJ10 = l7.c.j(fVarW, jSONObject, "font_weight_value", eVar, zP, null, eVar2, C1171fb.f8238k);
            AbstractC5371a abstractC5371aJ11 = l7.c.j(fVarW, jSONObject, "letter_spacing", dVar, zP, null, dVar2, lVar2);
            AbstractC5371a abstractC5371aJ12 = l7.c.j(fVarW, jSONObject, "line_height", eVar, zP, null, eVar2, C1171fb.f8239l);
            AbstractC5371a abstractC5371aH3 = l7.c.h(fVarW, jSONObject, "mask", zP, null, uc.f6827m8);
            AbstractC5371a abstractC5371aJ13 = l7.c.j(fVarW, jSONObject, "start", eVar, zP, null, eVar2, C1171fb.f8240m);
            l7.i iVar2 = C1171fb.f8235g;
            p9.l<String, Q6> lVar3 = Q6.FROM_STRING;
            return new C1383ub.c(abstractC5371aK, abstractC5371aJ, abstractC5371aH, abstractC5371aJ2, abstractC5371aH2, abstractC5371aJ3, abstractC5371aJ4, abstractC5371aJ5, abstractC5371aJ6, abstractC5371aJ7, abstractC5371aJ8, abstractC5371aJ9, abstractC5371aJ10, abstractC5371aJ11, abstractC5371aJ12, abstractC5371aH3, abstractC5371aJ13, l7.c.j(fVarW, jSONObject, "strike", iVar2, zP, null, lVar3, lVar2), l7.c.j(fVarW, jSONObject, "text_color", l7.k.f43901f, zP, null, l7.h.f43881b, lVar2), l7.c.h(fVarW, jSONObject, "text_shadow", zP, null, uc.f6519K6), l7.c.j(fVarW, jSONObject, "top_offset", eVar, zP, null, eVar2, C1171fb.f8241n), l7.c.j(fVarW, jSONObject, "underline", C1171fb.f8236h, zP, null, lVar3, lVar2));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1383ub.c value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f8248a;
            l7.c.v(context, jSONObject, "actions", value.f9513a, uc.f6777i1);
            l7.c.p(context, "alignment_vertical", value.f9514b, jSONObject, La.TO_STRING);
            l7.c.u(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f9515c, uc.f6667Y7);
            l7.c.q(context, jSONObject, "baseline_offset", value.f9516d);
            l7.c.u(context, jSONObject, "border", value.f9517e, uc.f6702b8);
            l7.c.q(context, jSONObject, "end", value.f9518f);
            l7.c.q(context, jSONObject, "font_family", value.f9519g);
            l7.c.q(context, jSONObject, "font_feature_settings", value.f9520h);
            l7.c.q(context, jSONObject, "font_size", value.i);
            l7.c.p(context, "font_size_unit", value.f9521j, jSONObject, H9.TO_STRING);
            l7.c.q(context, jSONObject, "font_variation_settings", value.f9522k);
            l7.c.p(context, "font_weight", value.f9523l, jSONObject, EnumC1195h5.TO_STRING);
            l7.c.q(context, jSONObject, "font_weight_value", value.f9524m);
            l7.c.q(context, jSONObject, "letter_spacing", value.f9525n);
            l7.c.q(context, jSONObject, "line_height", value.f9526o);
            l7.c.u(context, jSONObject, "mask", value.f9527p, uc.f6827m8);
            l7.c.q(context, jSONObject, "start", value.f9528q);
            p9.l<Q6, String> lVar = Q6.TO_STRING;
            l7.c.p(context, "strike", value.f9529r, jSONObject, lVar);
            l7.c.p(context, "text_color", value.f9530s, jSONObject, l7.h.f43880a);
            l7.c.u(context, jSONObject, "text_shadow", value.f9531t, uc.f6519K6);
            l7.c.q(context, jSONObject, "top_offset", value.f9532u);
            l7.c.p(context, "underline", value.f9533v, jSONObject, lVar);
            return jSONObject;
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    /* renamed from: N7.fb$h */
    public static final class h implements D7.j<JSONObject, C1383ub.c, Ka.c> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8249a;

        public h(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8249a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v15, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v24, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v8, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1383ub.c template = (C1383ub.c) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f8249a;
            List listQ = l7.d.q(context, template.f9513a, data, "actions", uc.f6789j1, uc.f6766h1);
            A7.b bVarK = l7.d.k(context, template.f9514b, data, "alignment_vertical", C1171fb.f8232d, La.FROM_STRING);
            Xa xa = (Xa) l7.d.h(context, template.f9515c, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6678Z7, uc.f6656X7);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            b.C0000b c0000b = C1171fb.f8229a;
            ?? L7 = l7.d.l(context, template.f9516d, data, "baseline_offset", dVar, dVar2, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            C1126cb c1126cb = (C1126cb) l7.d.h(context, template.f9517e, data, "border", uc.f6714c8, uc.f6690a8);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarM = l7.d.m(context, template.f9518f, data, "end", eVar, eVar2, C1171fb.i);
            k.g gVar = l7.k.f43898c;
            A7.b bVarJ = l7.d.j(context, template.f9519g, data, "font_family", gVar);
            A7.b bVarJ2 = l7.d.j(context, template.f9520h, data, "font_feature_settings", gVar);
            A7.b bVarM2 = l7.d.m(context, template.i, data, "font_size", eVar, eVar2, C1171fb.f8237j);
            l7.i iVar = C1171fb.f8233e;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            b.C0000b c0000b3 = C1171fb.f8230b;
            ?? L8 = l7.d.l(context, template.f9521j, data, "font_size_unit", iVar, lVar, c0000b3);
            b.C0000b c0000b4 = L8 == 0 ? c0000b3 : L8;
            A7.b bVarJ3 = l7.d.j(context, template.f9522k, data, "font_variation_settings", l7.k.f43903h);
            A7.b bVarK2 = l7.d.k(context, template.f9523l, data, "font_weight", C1171fb.f8234f, EnumC1195h5.FROM_STRING);
            A7.b bVarM3 = l7.d.m(context, template.f9524m, data, "font_weight_value", eVar, eVar2, C1171fb.f8238k);
            A7.b bVarK3 = l7.d.k(context, template.f9525n, data, "letter_spacing", dVar, dVar2);
            A7.b bVarM4 = l7.d.m(context, template.f9526o, data, "line_height", eVar, eVar2, C1171fb.f8239l);
            AbstractC1186gb abstractC1186gb = (AbstractC1186gb) l7.d.h(context, template.f9527p, data, "mask", uc.f6838n8, uc.f6816l8);
            G8 g82 = C1171fb.f8240m;
            b.C0000b c0000b5 = C1171fb.f8231c;
            ?? N8 = l7.d.n(context, template.f9528q, data, "start", eVar, eVar2, g82, c0000b5);
            if (N8 != 0) {
                c0000b5 = N8;
            }
            l7.i iVar2 = C1171fb.f8235g;
            p9.l<String, Q6> lVar2 = Q6.FROM_STRING;
            return new Ka.c(listQ, bVarK, xa, c0000b2, c1126cb, bVarM, bVarJ, bVarJ2, bVarM2, c0000b4, bVarJ3, bVarK2, bVarM3, bVarK3, bVarM4, abstractC1186gb, c0000b5, l7.d.k(context, template.f9529r, data, "strike", iVar2, lVar2), l7.d.k(context, template.f9530s, data, "text_color", l7.k.f43901f, l7.h.f43881b), (C1298o9) l7.d.h(context, template.f9531t, data, "text_shadow", uc.f6530L6, uc.f6508J6), l7.d.m(context, template.f9532u, data, "top_offset", eVar, eVar2, C1171fb.f8241n), l7.d.k(context, template.f9533v, data, "underline", C1171fb.f8236h, lVar2));
        }
    }
}
