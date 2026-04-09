package N7;

import A7.b;
import N7.U6;
import java.util.List;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivLinearGradientJsonParser.kt */
/* loaded from: classes.dex */
public final class T6 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f6332a = new b.C0000b(0L);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final B4.f f6333b = new B4.f(25);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final B4.g f6334c = new B4.g(27);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final B4.h f6335d = new B4.h(26);

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6336a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6336a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v1, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final R6 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            B4.f fVar = T6.f6333b;
            b.C0000b c0000b = T6.f6332a;
            ?? B10 = l7.b.b(context, data, "angle", eVar, eVar2, fVar, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            return new R6(c0000b, k8.F.t(context, data, "color_map", this.f6336a.f6568P4, T6.f6335d), l7.b.c(context, data, "colors", l7.k.f43901f, l7.h.f43881b, T6.f6334c));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, R6 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "angle", value.f6151a);
            k8.F.B(context, jSONObject, "color_map", value.f6152b, this.f6336a.f6568P4);
            l7.b.f(context, jSONObject, value.f6153c, l7.h.f43880a);
            k8.F.y(context, jSONObject, "type", "gradient");
            return jSONObject;
        }
    }

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6337a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6337a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final U6 d(D7.f fVar, U6 u62, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "angle", l7.k.f43897b, zP, u62 != null ? u62.f6390a : null, l7.h.f43886g, T6.f6333b);
            AbstractC5371a<List<U6.a>> abstractC5371a = u62 != null ? u62.f6391b : null;
            b9.p pVar = this.f6337a.f6579Q4;
            B4.h hVar = T6.f6335d;
            kotlin.jvm.internal.l.d(hVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            AbstractC5371a abstractC5371aL = l7.c.l(fVarW, jSONObject, zP, abstractC5371a, pVar, hVar);
            k.b bVar = l7.k.f43901f;
            AbstractC5371a<A7.c<Integer>> abstractC5371a2 = u62 != null ? u62.f6392c : null;
            h.f fVar2 = l7.h.f43881b;
            B4.g gVar = T6.f6334c;
            kotlin.jvm.internal.l.d(gVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new U6(abstractC5371aJ, abstractC5371aL, l7.c.g(fVarW, jSONObject, bVar, zP, abstractC5371a2, fVar2, gVar));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, U6 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "angle", value.f6390a);
            l7.c.v(context, jSONObject, "color_map", value.f6391b, this.f6337a.f6579Q4);
            l7.c.r(context, jSONObject, value.f6392c, l7.h.f43880a);
            k8.F.y(context, jSONObject, "type", "gradient");
            return jSONObject;
        }
    }

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class c implements D7.j<JSONObject, U6, R6> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6338a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6338a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v1, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final R6 a(D7.f context, U6 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            B4.f fVar = T6.f6333b;
            b.C0000b c0000b = T6.f6332a;
            ?? N8 = l7.d.n(context, template.f6390a, data, "angle", eVar, eVar2, fVar, c0000b);
            if (N8 != 0) {
                c0000b = N8;
            }
            Uc uc = this.f6338a;
            return new R6(c0000b, l7.d.p(context, template.f6391b, data, uc.f6589R4, uc.f6568P4, T6.f6335d), l7.d.o(context, template.f6392c, data, l7.k.f43901f, l7.h.f43881b, T6.f6334c));
        }
    }
}
