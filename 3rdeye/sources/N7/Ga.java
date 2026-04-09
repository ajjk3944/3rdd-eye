package N7;

import A7.b;
import N7.Ba;
import N7.Ia;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes.dex */
public final class Ga {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final W4 f5379a = new W4(new b.C0000b(12L));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final W4 f5380b = new W4(new b.C0000b(12L));

    /* compiled from: DivTabsJsonParser.kt */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5381a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5381a = component;
        }

        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f5381a;
            W4 w42 = (W4) k8.F.q(context, data, "height", uc.f6897t3);
            if (w42 == null) {
                w42 = Ga.f5379a;
            }
            kotlin.jvm.internal.l.e(w42, "JsonPropertyParser.readO…) ?: HEIGHT_DEFAULT_VALUE");
            A7.b bVarA = l7.b.a(context, data, "image_url", l7.k.f43900e, l7.h.f43883d, l7.e.f43877a);
            W4 w43 = (W4) k8.F.q(context, data, "width", uc.f6897t3);
            if (w43 == null) {
                w43 = Ga.f5380b;
            }
            kotlin.jvm.internal.l.e(w43, "JsonPropertyParser.readO…r) ?: WIDTH_DEFAULT_VALUE");
            return new Ba.b(w42, bVarA, w43);
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Ba.b value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f5381a;
            k8.F.z(context, jSONObject, "height", value.f4963a, uc.f6897t3);
            l7.b.e(context, jSONObject, "image_url", value.f4964b, l7.h.f43882c);
            k8.F.z(context, jSONObject, "width", value.f4965c, uc.f6897t3);
            return jSONObject;
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5382a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5382a = component;
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
            Uc uc = this.f5382a;
            return new Ia.b(l7.c.h(fVarW, jSONObject, "height", zP, null, uc.f6908u3), l7.c.e(fVarW, jSONObject, "image_url", l7.k.f43900e, zP, null, l7.h.f43883d, l7.e.f43877a), l7.c.h(fVarW, jSONObject, "width", zP, null, uc.f6908u3));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Ia.b value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f5382a;
            l7.c.u(context, jSONObject, "height", value.f5534a, uc.f6908u3);
            l7.c.p(context, "image_url", value.f5535b, jSONObject, l7.h.f43882c);
            l7.c.u(context, jSONObject, "width", value.f5536c, uc.f6908u3);
            return jSONObject;
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class c implements D7.j<JSONObject, Ia.b, Ba.b> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5383a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5383a = component;
        }

        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            Ia.b template = (Ia.b) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f5383a;
            b9.p pVar = uc.f6918v3;
            AbstractC5371a<Y4> abstractC5371a = template.f5534a;
            b9.p pVar2 = uc.f6897t3;
            W4 w42 = (W4) l7.d.h(context, abstractC5371a, data, "height", pVar, pVar2);
            if (w42 == null) {
                w42 = Ga.f5379a;
            }
            W4 w43 = w42;
            kotlin.jvm.internal.l.e(w43, "JsonFieldResolver.resolv…) ?: HEIGHT_DEFAULT_VALUE");
            A7.b bVarD = l7.d.d(context, template.f5535b, data, "image_url", l7.k.f43900e, l7.h.f43883d);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
            W4 w44 = (W4) l7.d.h(context, template.f5536c, data, "width", uc.f6918v3, pVar2);
            if (w44 == null) {
                w44 = Ga.f5380b;
            }
            kotlin.jvm.internal.l.e(w44, "JsonFieldResolver.resolv…r) ?: WIDTH_DEFAULT_VALUE");
            return new Ba.b(w43, bVarD, w44);
        }
    }
}
