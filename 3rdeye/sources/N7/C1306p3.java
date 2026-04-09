package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivCloudBackgroundJsonParser.kt */
/* renamed from: N7.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1306p3 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final B4.i f8889a = new B4.i(10);

    /* compiled from: DivCloudBackgroundJsonParser.kt */
    /* renamed from: N7.p3$a */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8890a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8890a = component;
        }

        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C1292o3 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            return new C1292o3(l7.b.a(context, data, "color", l7.k.f43901f, l7.h.f43881b, l7.e.f43877a), l7.b.a(context, data, "corner_radius", l7.k.f43897b, l7.h.f43886g, C1306p3.f8889a), (C1362t4) k8.F.q(context, data, "paddings", this.f8890a.f6630V2));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1292o3 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.e(context, jSONObject, "color", value.f8850a, l7.h.f43880a);
            l7.b.d(context, jSONObject, "corner_radius", value.f8851b);
            k8.F.z(context, jSONObject, "paddings", value.f8852c, this.f8890a.f6630V2);
            k8.F.y(context, jSONObject, "type", "cloud");
            return jSONObject;
        }
    }

    /* compiled from: DivCloudBackgroundJsonParser.kt */
    /* renamed from: N7.p3$b */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8891a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8891a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final C1320q3 d(D7.f fVar, C1320q3 c1320q3, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            return new C1320q3(l7.c.e(fVarW, jSONObject, "color", l7.k.f43901f, zP, c1320q3 != null ? c1320q3.f8923a : null, l7.h.f43881b, l7.e.f43877a), l7.c.e(fVarW, jSONObject, "corner_radius", l7.k.f43897b, zP, c1320q3 != null ? c1320q3.f8924b : null, l7.h.f43886g, C1306p3.f8889a), l7.c.h(fVarW, jSONObject, "paddings", zP, c1320q3 != null ? c1320q3.f8925c : null, this.f8891a.f6641W2));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1320q3 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.p(context, "color", value.f8923a, jSONObject, l7.h.f43880a);
            l7.c.q(context, jSONObject, "corner_radius", value.f8924b);
            l7.c.u(context, jSONObject, "paddings", value.f8925c, this.f8891a.f6641W2);
            k8.F.y(context, jSONObject, "type", "cloud");
            return jSONObject;
        }
    }

    /* compiled from: DivCloudBackgroundJsonParser.kt */
    /* renamed from: N7.p3$c */
    public static final class c implements D7.j<JSONObject, C1320q3, C1292o3> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8892a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8892a = component;
        }

        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1292o3 a(D7.f context, C1320q3 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarD = l7.d.d(context, template.f8923a, data, "color", l7.k.f43901f, l7.h.f43881b);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
            A7.b bVarE = l7.d.e(context, template.f8924b, data, "corner_radius", l7.k.f43897b, l7.h.f43886g, C1306p3.f8889a);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex… CORNER_RADIUS_VALIDATOR)");
            Uc uc = this.f8892a;
            return new C1292o3(bVarD, bVarE, (C1362t4) l7.d.h(context, template.f8925c, data, "paddings", uc.f6652X2, uc.f6630V2));
        }
    }
}
