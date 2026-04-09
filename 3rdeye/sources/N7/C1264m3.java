package N7;

import A7.b;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivCircleShapeJsonParser.kt */
/* renamed from: N7.m3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1264m3 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final W4 f8752a = new W4(new b.C0000b(10L));

    /* compiled from: DivCircleShapeJsonParser.kt */
    /* renamed from: N7.m3$a */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8753a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8753a = component;
        }

        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C1250l3 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarB = l7.b.b(context, data, "background_color", l7.k.f43901f, l7.h.f43881b, l7.e.f43877a, null);
            Uc uc = this.f8753a;
            W4 w42 = (W4) k8.F.q(context, data, "radius", uc.f6897t3);
            if (w42 == null) {
                w42 = C1264m3.f8752a;
            }
            kotlin.jvm.internal.l.e(w42, "JsonPropertyParser.readO…) ?: RADIUS_DEFAULT_VALUE");
            return new C1250l3(bVarB, w42, (C1185ga) k8.F.q(context, data, "stroke", uc.f6435C7));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1250l3 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.e(context, jSONObject, "background_color", value.f8727a, l7.h.f43880a);
            Uc uc = this.f8753a;
            k8.F.z(context, jSONObject, "radius", value.f8728b, uc.f6897t3);
            k8.F.z(context, jSONObject, "stroke", value.f8729c, uc.f6435C7);
            k8.F.y(context, jSONObject, "type", "circle");
            return jSONObject;
        }
    }

    /* compiled from: DivCircleShapeJsonParser.kt */
    /* renamed from: N7.m3$b */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8754a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8754a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final C1278n3 d(D7.f fVar, C1278n3 c1278n3, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "background_color", l7.k.f43901f, zP, c1278n3 != null ? c1278n3.f8786a : null, l7.h.f43881b, l7.e.f43877a);
            AbstractC5371a<Y4> abstractC5371a = c1278n3 != null ? c1278n3.f8787b : null;
            Uc uc = this.f8754a;
            return new C1278n3(abstractC5371aJ, l7.c.h(fVarW, jSONObject, "radius", zP, abstractC5371a, uc.f6908u3), l7.c.h(fVarW, jSONObject, "stroke", zP, c1278n3 != null ? c1278n3.f8788c : null, uc.f6446D7));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1278n3 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.p(context, "background_color", value.f8786a, jSONObject, l7.h.f43880a);
            Uc uc = this.f8754a;
            l7.c.u(context, jSONObject, "radius", value.f8787b, uc.f6908u3);
            l7.c.u(context, jSONObject, "stroke", value.f8788c, uc.f6446D7);
            k8.F.y(context, jSONObject, "type", "circle");
            return jSONObject;
        }
    }

    /* compiled from: DivCircleShapeJsonParser.kt */
    /* renamed from: N7.m3$c */
    public static final class c implements D7.j<JSONObject, C1278n3, C1250l3> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8755a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8755a = component;
        }

        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1250l3 a(D7.f context, C1278n3 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarK = l7.d.k(context, template.f8786a, data, "background_color", l7.k.f43901f, l7.h.f43881b);
            Uc uc = this.f8755a;
            W4 w42 = (W4) l7.d.h(context, template.f8787b, data, "radius", uc.f6918v3, uc.f6897t3);
            if (w42 == null) {
                w42 = C1264m3.f8752a;
            }
            W4 w43 = w42;
            kotlin.jvm.internal.l.e(w43, "JsonFieldResolver.resolv…) ?: RADIUS_DEFAULT_VALUE");
            return new C1250l3(bVarK, w43, (C1185ga) l7.d.h(context, template.f8788c, data, "stroke", uc.f6457E7, uc.f6435C7));
        }
    }
}
