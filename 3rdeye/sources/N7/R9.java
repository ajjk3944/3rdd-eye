package N7;

import A7.b;
import N7.L9;
import N7.Q9;
import c9.C2091l;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes.dex */
public final class R9 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f6160a = b.a.a(12L);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f6161b = b.a.a(H9.SP);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f6162c = b.a.a(EnumC1195h5.REGULAR);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f6163d = b.a.a(-16777216);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final l7.i f6164e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final l7.i f6165f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final C1094a9 f6166g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final H7 f6167h;

    /* compiled from: DivSliderJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f6168g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof H9);
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f6169g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1195h5);
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class c implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6170a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6170a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v4, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v6, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v9, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            b.C0000b c0000b;
            A7.b bVar;
            b.C0000b c0000b2;
            b.C0000b c0000b3;
            b.C0000b c0000b4;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.g gVar = l7.k.f43898c;
            A8.d dVar = l7.e.f43878b;
            j6.l lVar = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "font_family", gVar, dVar, lVar, null);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            C1094a9 c1094a9 = R9.f6166g;
            b.C0000b c0000b5 = R9.f6160a;
            ?? B10 = l7.b.b(context, data, "font_size", eVar, eVar2, c1094a9, c0000b5);
            b.C0000b c0000b6 = B10 == 0 ? c0000b5 : B10;
            l7.i iVar = R9.f6164e;
            p9.l<String, H9> lVar2 = H9.FROM_STRING;
            b.C0000b c0000b7 = R9.f6161b;
            ?? B11 = l7.b.b(context, data, "font_size_unit", iVar, lVar2, lVar, c0000b7);
            b.C0000b c0000b8 = B11 == 0 ? c0000b7 : B11;
            A7.b bVarB2 = l7.b.b(context, data, "font_variation_settings", l7.k.f43903h, dVar, lVar, null);
            l7.i iVar2 = R9.f6165f;
            p9.l<String, EnumC1195h5> lVar3 = EnumC1195h5.FROM_STRING;
            b.C0000b c0000b9 = R9.f6162c;
            ?? B12 = l7.b.b(context, data, "font_weight", iVar2, lVar3, lVar, c0000b9);
            b.C0000b c0000b10 = B12 == 0 ? c0000b9 : B12;
            A7.b bVarB3 = l7.b.b(context, data, "font_weight_value", eVar, eVar2, R9.f6167h, null);
            C1325q8 c1325q8 = (C1325q8) k8.F.q(context, data, "offset", this.f6170a.f6612T5);
            k.b bVar2 = l7.k.f43901f;
            h.f fVar = l7.h.f43881b;
            b.C0000b c0000b11 = R9.f6163d;
            ?? B13 = l7.b.b(context, data, "text_color", bVar2, fVar, lVar, c0000b11);
            if (B13 == 0) {
                c0000b = c0000b11;
                bVar = bVarB;
                c0000b3 = c0000b6;
                c0000b4 = c0000b10;
                c0000b2 = c0000b8;
            } else {
                c0000b = B13;
                bVar = bVarB;
                c0000b2 = c0000b8;
                c0000b3 = c0000b6;
                c0000b4 = c0000b10;
            }
            return new L9.b(bVar, c0000b3, c0000b2, bVarB2, c0000b4, bVarB3, c1325q8, c0000b);
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, L9.b value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "font_family", value.f5817a);
            l7.b.d(context, jSONObject, "font_size", value.f5818b);
            l7.b.e(context, jSONObject, "font_size_unit", value.f5819c, H9.TO_STRING);
            l7.b.d(context, jSONObject, "font_variation_settings", value.f5820d);
            l7.b.e(context, jSONObject, "font_weight", value.f5821e, EnumC1195h5.TO_STRING);
            l7.b.d(context, jSONObject, "font_weight_value", value.f5822f);
            k8.F.z(context, jSONObject, "offset", value.f5823g, this.f6170a.f6612T5);
            l7.b.e(context, jSONObject, "text_color", value.f5824h, l7.h.f43880a);
            return jSONObject;
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class d implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6171a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6171a = component;
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
            k.g gVar = l7.k.f43898c;
            A8.d dVar = l7.e.f43878b;
            j6.l lVar = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "font_family", gVar, zP, null, dVar, lVar);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            return new Q9.b(abstractC5371aJ, l7.c.j(fVarW, jSONObject, "font_size", eVar, zP, null, eVar2, R9.f6166g), l7.c.j(fVarW, jSONObject, "font_size_unit", R9.f6164e, zP, null, H9.FROM_STRING, lVar), l7.c.j(fVarW, jSONObject, "font_variation_settings", l7.k.f43903h, zP, null, dVar, lVar), l7.c.j(fVarW, jSONObject, "font_weight", R9.f6165f, zP, null, EnumC1195h5.FROM_STRING, lVar), l7.c.j(fVarW, jSONObject, "font_weight_value", eVar, zP, null, eVar2, R9.f6167h), l7.c.h(fVarW, jSONObject, "offset", zP, null, this.f6171a.f6623U5), l7.c.j(fVarW, jSONObject, "text_color", l7.k.f43901f, zP, null, l7.h.f43881b, lVar));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Q9.b value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "font_family", value.f6092a);
            l7.c.q(context, jSONObject, "font_size", value.f6093b);
            l7.c.p(context, "font_size_unit", value.f6094c, jSONObject, H9.TO_STRING);
            l7.c.q(context, jSONObject, "font_variation_settings", value.f6095d);
            l7.c.p(context, "font_weight", value.f6096e, jSONObject, EnumC1195h5.TO_STRING);
            l7.c.q(context, jSONObject, "font_weight_value", value.f6097f);
            l7.c.u(context, jSONObject, "offset", value.f6098g, this.f6171a.f6623U5);
            l7.c.p(context, "text_color", value.f6099h, jSONObject, l7.h.f43880a);
            return jSONObject;
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class e implements D7.j<JSONObject, Q9.b, L9.b> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6172a;

        public e(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6172a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v10, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v5, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v7, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            Q9.b template = (Q9.b) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarJ = l7.d.j(context, template.f6092a, data, "font_family", l7.k.f43898c);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            C1094a9 c1094a9 = R9.f6166g;
            b.C0000b c0000b = R9.f6160a;
            ?? N8 = l7.d.n(context, template.f6093b, data, "font_size", eVar, eVar2, c1094a9, c0000b);
            if (N8 != 0) {
                c0000b = N8;
            }
            l7.i iVar = R9.f6164e;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            b.C0000b c0000b2 = R9.f6161b;
            ?? L7 = l7.d.l(context, template.f6094c, data, "font_size_unit", iVar, lVar, c0000b2);
            b.C0000b c0000b3 = L7 == 0 ? c0000b2 : L7;
            A7.b bVarJ2 = l7.d.j(context, template.f6095d, data, "font_variation_settings", l7.k.f43903h);
            l7.i iVar2 = R9.f6165f;
            p9.l<String, EnumC1195h5> lVar2 = EnumC1195h5.FROM_STRING;
            b.C0000b c0000b4 = R9.f6162c;
            ?? L8 = l7.d.l(context, template.f6096e, data, "font_weight", iVar2, lVar2, c0000b4);
            b.C0000b c0000b5 = L8 == 0 ? c0000b4 : L8;
            A7.b bVarM = l7.d.m(context, template.f6097f, data, "font_weight_value", eVar, eVar2, R9.f6167h);
            Uc uc = this.f6172a;
            C1325q8 c1325q8 = (C1325q8) l7.d.h(context, template.f6098g, data, "offset", uc.f6633V5, uc.f6612T5);
            k.b bVar2 = l7.k.f43901f;
            h.f fVar = l7.h.f43881b;
            b.C0000b c0000b6 = R9.f6163d;
            ?? L10 = l7.d.l(context, template.f6099h, data, "text_color", bVar2, fVar, c0000b6);
            return new L9.b(bVarJ, c0000b, c0000b3, bVarJ2, c0000b5, bVarM, c1325q8, L10 == 0 ? c0000b6 : L10);
        }
    }

    static {
        Object objM = C2091l.m(H9.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f6168g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f6164e = new l7.i(objM, validator);
        Object objM2 = C2091l.m(EnumC1195h5.values());
        kotlin.jvm.internal.l.f(objM2, "default");
        b validator2 = b.f6169g;
        kotlin.jvm.internal.l.f(validator2, "validator");
        f6165f = new l7.i(objM2, validator2);
        f6166g = new C1094a9(5);
        f6167h = new H7(6);
    }
}
