package N7;

import A7.b;
import l7.h;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
/* renamed from: N7.ea, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1155ea {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final W4 f8167a = new W4(new b.C0000b(5L));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8168b = new b.C0000b(10L);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final B8 f8169c = new B8(7);

    /* compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    /* renamed from: N7.ea$a */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8170a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8170a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v1, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C1140da a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            W4 w42 = (W4) k8.F.q(context, data, "item_spacing", this.f8170a.f6897t3);
            if (w42 == null) {
                w42 = C1155ea.f8167a;
            }
            kotlin.jvm.internal.l.e(w42, "JsonPropertyParser.readO…TEM_SPACING_DEFAULT_VALUE");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            B8 b82 = C1155ea.f8169c;
            b.C0000b c0000b = C1155ea.f8168b;
            ?? B10 = l7.b.b(context, data, "max_visible_items", eVar, eVar2, b82, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            return new C1140da(w42, c0000b);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1140da value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.z(context, jSONObject, "item_spacing", value.f8127a, this.f8170a.f6897t3);
            l7.b.d(context, jSONObject, "max_visible_items", value.f8128b);
            k8.F.y(context, jSONObject, "type", "stretch");
            return jSONObject;
        }
    }

    /* compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    /* renamed from: N7.ea$b */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8171a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8171a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final C1170fa d(D7.f fVar, C1170fa c1170fa, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            return new C1170fa(l7.c.h(fVarW, jSONObject, "item_spacing", zP, c1170fa != null ? c1170fa.f8227a : null, this.f8171a.f6908u3), l7.c.j(fVarW, jSONObject, "max_visible_items", l7.k.f43897b, zP, c1170fa != null ? c1170fa.f8228b : null, l7.h.f43886g, C1155ea.f8169c));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1170fa value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.u(context, jSONObject, "item_spacing", value.f8227a, this.f8171a.f6908u3);
            l7.c.q(context, jSONObject, "max_visible_items", value.f8228b);
            k8.F.y(context, jSONObject, "type", "stretch");
            return jSONObject;
        }
    }

    /* compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    /* renamed from: N7.ea$c */
    public static final class c implements D7.j<JSONObject, C1170fa, C1140da> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8172a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8172a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v1, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1140da a(D7.f context, C1170fa template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f8172a;
            W4 w42 = (W4) l7.d.h(context, template.f8227a, data, "item_spacing", uc.f6918v3, uc.f6897t3);
            if (w42 == null) {
                w42 = C1155ea.f8167a;
            }
            kotlin.jvm.internal.l.e(w42, "JsonFieldResolver.resolv…TEM_SPACING_DEFAULT_VALUE");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            B8 b82 = C1155ea.f8169c;
            b.C0000b c0000b = C1155ea.f8168b;
            ?? N8 = l7.d.n(context, template.f8228b, data, "max_visible_items", eVar, eVar2, b82, c0000b);
            if (N8 != 0) {
                c0000b = N8;
            }
            return new C1140da(w42, c0000b);
        }
    }
}
