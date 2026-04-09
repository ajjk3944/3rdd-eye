package N7;

import A7.b;
import N7.AbstractC1408w8;
import N7.I8;
import N7.S8;
import N7.V8;
import java.util.List;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivRadialGradientJsonParser.kt */
/* loaded from: classes.dex */
public final class H8 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final AbstractC1408w8.b f5396a = new AbstractC1408w8.b(new N8(b.a.a(Double.valueOf(0.5d))));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final AbstractC1408w8.b f5397b = new AbstractC1408w8.b(new N8(b.a.a(Double.valueOf(0.5d))));

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final I8.b f5398c = new I8.b(new S8(b.a.a(S8.a.FARTHEST_CORNER)));

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final B4.i f5399d = new B4.i(28);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final G8 f5400e = new G8(0);

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5401a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5401a = component;
        }

        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C1394v8 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f5401a;
            AbstractC1408w8 abstractC1408w8 = (AbstractC1408w8) k8.F.q(context, data, "center_x", uc.f6644W5);
            if (abstractC1408w8 == null) {
                abstractC1408w8 = H8.f5396a;
            }
            kotlin.jvm.internal.l.e(abstractC1408w8, "JsonPropertyParser.readO…?: CENTER_X_DEFAULT_VALUE");
            AbstractC1408w8 abstractC1408w82 = (AbstractC1408w8) k8.F.q(context, data, "center_y", uc.f6644W5);
            if (abstractC1408w82 == null) {
                abstractC1408w82 = H8.f5397b;
            }
            kotlin.jvm.internal.l.e(abstractC1408w82, "JsonPropertyParser.readO…?: CENTER_Y_DEFAULT_VALUE");
            List listT = k8.F.t(context, data, "color_map", uc.f6846o6, H8.f5400e);
            A7.c cVarC = l7.b.c(context, data, "colors", l7.k.f43901f, l7.h.f43881b, H8.f5399d);
            I8 i82 = (I8) k8.F.q(context, data, "radius", uc.f6712c6);
            if (i82 == null) {
                i82 = H8.f5398c;
            }
            I8 i83 = i82;
            kotlin.jvm.internal.l.e(i83, "JsonPropertyParser.readO…) ?: RADIUS_DEFAULT_VALUE");
            return new C1394v8(abstractC1408w8, abstractC1408w82, listT, cVarC, i83);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1394v8 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f5401a;
            k8.F.z(context, jSONObject, "center_x", value.f9629a, uc.f6644W5);
            k8.F.z(context, jSONObject, "center_y", value.f9630b, uc.f6644W5);
            k8.F.B(context, jSONObject, "color_map", value.f9631c, uc.f6846o6);
            l7.b.f(context, jSONObject, value.f9632d, l7.h.f43880a);
            k8.F.z(context, jSONObject, "radius", value.f9633e, uc.f6712c6);
            k8.F.y(context, jSONObject, "type", "radial_gradient");
            return jSONObject;
        }
    }

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5402a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5402a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final V8 d(D7.f fVar, V8 v82, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a<A8> abstractC5371a = v82 != null ? v82.f7577a : null;
            Uc uc = this.f5402a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "center_x", zP, abstractC5371a, uc.f6654X5);
            AbstractC5371a abstractC5371aH2 = l7.c.h(fVarW, jSONObject, "center_y", zP, v82 != null ? v82.f7578b : null, uc.f6654X5);
            AbstractC5371a<List<V8.a>> abstractC5371a2 = v82 != null ? v82.f7579c : null;
            G8 g82 = H8.f5400e;
            kotlin.jvm.internal.l.d(g82, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            AbstractC5371a abstractC5371aL = l7.c.l(fVarW, jSONObject, zP, abstractC5371a2, uc.f6857p6, g82);
            k.b bVar = l7.k.f43901f;
            AbstractC5371a<A7.c<Integer>> abstractC5371a3 = v82 != null ? v82.f7580d : null;
            h.f fVar2 = l7.h.f43881b;
            B4.i iVar = H8.f5399d;
            kotlin.jvm.internal.l.d(iVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new V8(abstractC5371aH, abstractC5371aH2, abstractC5371aL, l7.c.g(fVarW, jSONObject, bVar, zP, abstractC5371a3, fVar2, iVar), l7.c.h(fVarW, jSONObject, "radius", zP, v82 != null ? v82.f7581e : null, uc.f6724d6));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, V8 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f5402a;
            l7.c.u(context, jSONObject, "center_x", value.f7577a, uc.f6654X5);
            l7.c.u(context, jSONObject, "center_y", value.f7578b, uc.f6654X5);
            l7.c.v(context, jSONObject, "color_map", value.f7579c, uc.f6857p6);
            l7.c.r(context, jSONObject, value.f7580d, l7.h.f43880a);
            l7.c.u(context, jSONObject, "radius", value.f7581e, uc.f6724d6);
            k8.F.y(context, jSONObject, "type", "radial_gradient");
            return jSONObject;
        }
    }

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class c implements D7.j<JSONObject, V8, C1394v8> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5403a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5403a = component;
        }

        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1394v8 a(D7.f context, V8 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f5403a;
            AbstractC1408w8 abstractC1408w8 = (AbstractC1408w8) l7.d.h(context, template.f7577a, data, "center_x", uc.f6665Y5, uc.f6644W5);
            if (abstractC1408w8 == null) {
                abstractC1408w8 = H8.f5396a;
            }
            kotlin.jvm.internal.l.e(abstractC1408w8, "JsonFieldResolver.resolv…?: CENTER_X_DEFAULT_VALUE");
            AbstractC1408w8 abstractC1408w82 = (AbstractC1408w8) l7.d.h(context, template.f7578b, data, "center_y", uc.f6665Y5, uc.f6644W5);
            if (abstractC1408w82 == null) {
                abstractC1408w82 = H8.f5397b;
            }
            kotlin.jvm.internal.l.e(abstractC1408w82, "JsonFieldResolver.resolv…?: CENTER_Y_DEFAULT_VALUE");
            List listP = l7.d.p(context, template.f7579c, data, uc.f6868q6, uc.f6846o6, H8.f5400e);
            A7.c cVarO = l7.d.o(context, template.f7580d, data, l7.k.f43901f, l7.h.f43881b, H8.f5399d);
            I8 i82 = (I8) l7.d.h(context, template.f7581e, data, "radius", uc.f6735e6, uc.f6712c6);
            if (i82 == null) {
                i82 = H8.f5398c;
            }
            I8 i83 = i82;
            kotlin.jvm.internal.l.e(i83, "JsonFieldResolver.resolv…) ?: RADIUS_DEFAULT_VALUE");
            return new C1394v8(abstractC1408w8, abstractC1408w82, listP, cVarO, i83);
        }
    }
}
