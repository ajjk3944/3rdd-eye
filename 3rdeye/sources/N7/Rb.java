package N7;

import A7.b;
import N7.AbstractC1138d8;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivTransformJsonParser.kt */
/* loaded from: classes.dex */
public final class Rb {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final AbstractC1138d8.b f6174a = new AbstractC1138d8.b(new C1241k8(new b.C0000b(Double.valueOf(50.0d))));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final AbstractC1138d8.b f6175b = new AbstractC1138d8.b(new C1241k8(new b.C0000b(Double.valueOf(50.0d))));

    /* compiled from: DivTransformJsonParser.kt */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6176a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6176a = component;
        }

        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f6176a;
            AbstractC1138d8 abstractC1138d8 = (AbstractC1138d8) k8.F.q(context, data, "pivot_x", uc.Q5);
            if (abstractC1138d8 == null) {
                abstractC1138d8 = Rb.f6174a;
            }
            kotlin.jvm.internal.l.e(abstractC1138d8, "JsonPropertyParser.readO… ?: PIVOT_X_DEFAULT_VALUE");
            AbstractC1138d8 abstractC1138d82 = (AbstractC1138d8) k8.F.q(context, data, "pivot_y", uc.Q5);
            if (abstractC1138d82 == null) {
                abstractC1138d82 = Rb.f6175b;
            }
            kotlin.jvm.internal.l.e(abstractC1138d82, "JsonPropertyParser.readO… ?: PIVOT_Y_DEFAULT_VALUE");
            return new Qb(abstractC1138d8, abstractC1138d82, l7.b.b(context, data, "rotation", l7.k.f43899d, l7.h.f43885f, l7.e.f43877a, null));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Qb value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f6176a;
            k8.F.z(context, jSONObject, "pivot_x", value.f6103a, uc.Q5);
            k8.F.z(context, jSONObject, "pivot_y", value.f6104b, uc.Q5);
            l7.b.d(context, jSONObject, "rotation", value.f6105c);
            return jSONObject;
        }
    }

    /* compiled from: DivTransformJsonParser.kt */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6177a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6177a = component;
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
            Uc uc = this.f6177a;
            return new Sb(l7.c.h(fVarW, jSONObject, "pivot_x", zP, null, uc.f6590R5), l7.c.h(fVarW, jSONObject, "pivot_y", zP, null, uc.f6590R5), l7.c.j(fVarW, jSONObject, "rotation", l7.k.f43899d, zP, null, l7.h.f43885f, l7.e.f43877a));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Sb value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f6177a;
            l7.c.u(context, jSONObject, "pivot_x", value.f6214a, uc.f6590R5);
            l7.c.u(context, jSONObject, "pivot_y", value.f6215b, uc.f6590R5);
            l7.c.q(context, jSONObject, "rotation", value.f6216c);
            return jSONObject;
        }
    }

    /* compiled from: DivTransformJsonParser.kt */
    public static final class c implements D7.j<JSONObject, Sb, Qb> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6178a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6178a = component;
        }

        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            Sb template = (Sb) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f6178a;
            b9.p pVar = uc.f6601S5;
            AbstractC5371a<AbstractC1311p8> abstractC5371a = template.f6214a;
            b9.p pVar2 = uc.Q5;
            AbstractC1138d8 abstractC1138d8 = (AbstractC1138d8) l7.d.h(context, abstractC5371a, data, "pivot_x", pVar, pVar2);
            if (abstractC1138d8 == null) {
                abstractC1138d8 = Rb.f6174a;
            }
            AbstractC1138d8 abstractC1138d82 = abstractC1138d8;
            kotlin.jvm.internal.l.e(abstractC1138d82, "JsonFieldResolver.resolv… ?: PIVOT_X_DEFAULT_VALUE");
            AbstractC1138d8 abstractC1138d83 = (AbstractC1138d8) l7.d.h(context, template.f6215b, data, "pivot_y", uc.f6601S5, pVar2);
            if (abstractC1138d83 == null) {
                abstractC1138d83 = Rb.f6175b;
            }
            AbstractC1138d8 abstractC1138d84 = abstractC1138d83;
            kotlin.jvm.internal.l.e(abstractC1138d84, "JsonFieldResolver.resolv… ?: PIVOT_Y_DEFAULT_VALUE");
            return new Qb(abstractC1138d82, abstractC1138d84, l7.d.k(context, template.f6216c, data, "rotation", l7.k.f43899d, l7.h.f43885f));
        }
    }
}
