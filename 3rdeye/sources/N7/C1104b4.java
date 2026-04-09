package N7;

import A7.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
/* renamed from: N7.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1104b4 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final W4 f7928a = new W4(new b.C0000b(15L));

    /* compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    /* renamed from: N7.b4$a */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7929a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7929a = component;
        }

        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C1089a4 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            W4 w42 = (W4) k8.F.q(context, data, "space_between_centers", this.f7929a.f6897t3);
            if (w42 == null) {
                w42 = C1104b4.f7928a;
            }
            kotlin.jvm.internal.l.e(w42, "JsonPropertyParser.readO…EEN_CENTERS_DEFAULT_VALUE");
            return new C1089a4(w42);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1089a4 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.z(context, jSONObject, "space_between_centers", value.f7894a, this.f7929a.f6897t3);
            k8.F.y(context, jSONObject, "type", "default");
            return jSONObject;
        }
    }

    /* compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    /* renamed from: N7.b4$b */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7930a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7930a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final C1119c4 d(D7.f fVar, C1119c4 c1119c4, JSONObject jSONObject) throws z7.d {
            return new C1119c4(l7.c.h(T1.B.w(fVar), jSONObject, "space_between_centers", B4.g.p(fVar, "context", jSONObject, "data"), c1119c4 != null ? c1119c4.f7970a : null, this.f7930a.f6908u3));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1119c4 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.u(context, jSONObject, "space_between_centers", value.f7970a, this.f7930a.f6908u3);
            k8.F.y(context, jSONObject, "type", "default");
            return jSONObject;
        }
    }

    /* compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    /* renamed from: N7.b4$c */
    public static final class c implements D7.j<JSONObject, C1119c4, C1089a4> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7931a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7931a = component;
        }

        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1089a4 a(D7.f context, C1119c4 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f7931a;
            W4 w42 = (W4) l7.d.h(context, template.f7970a, data, "space_between_centers", uc.f6918v3, uc.f6897t3);
            if (w42 == null) {
                w42 = C1104b4.f7928a;
            }
            kotlin.jvm.internal.l.e(w42, "JsonFieldResolver.resolv…EEN_CENTERS_DEFAULT_VALUE");
            return new C1089a4(w42);
        }
    }
}
