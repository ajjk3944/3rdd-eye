package N7;

import A7.b;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivRoundedRectangleShapeJsonParser.kt */
/* loaded from: classes.dex */
public final class X8 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final W4 f7700a = new W4(b.a.a(5L));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final W4 f7701b = new W4(b.a.a(10L));

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final W4 f7702c = new W4(b.a.a(10L));

    /* compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7703a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7703a = component;
        }

        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final W8 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarB = l7.b.b(context, data, "background_color", l7.k.f43901f, l7.h.f43881b, l7.e.f43877a, null);
            Uc uc = this.f7703a;
            W4 w42 = (W4) k8.F.q(context, data, "corner_radius", uc.f6897t3);
            if (w42 == null) {
                w42 = X8.f7700a;
            }
            kotlin.jvm.internal.l.e(w42, "JsonPropertyParser.readO…RNER_RADIUS_DEFAULT_VALUE");
            b9.p pVar = uc.f6897t3;
            W4 w43 = (W4) k8.F.q(context, data, "item_height", pVar);
            if (w43 == null) {
                w43 = X8.f7701b;
            }
            kotlin.jvm.internal.l.e(w43, "JsonPropertyParser.readO…ITEM_HEIGHT_DEFAULT_VALUE");
            W4 w44 = (W4) k8.F.q(context, data, "item_width", pVar);
            if (w44 == null) {
                w44 = X8.f7702c;
            }
            kotlin.jvm.internal.l.e(w44, "JsonPropertyParser.readO… ITEM_WIDTH_DEFAULT_VALUE");
            return new W8(bVarB, w42, w43, w44, (C1185ga) k8.F.q(context, data, "stroke", uc.f6435C7));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, W8 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.e(context, jSONObject, "background_color", value.f7619a, l7.h.f43880a);
            Uc uc = this.f7703a;
            k8.F.z(context, jSONObject, "corner_radius", value.f7620b, uc.f6897t3);
            W4 w42 = value.f7621c;
            b9.p pVar = uc.f6897t3;
            k8.F.z(context, jSONObject, "item_height", w42, pVar);
            k8.F.z(context, jSONObject, "item_width", value.f7622d, pVar);
            k8.F.z(context, jSONObject, "stroke", value.f7623e, uc.f6435C7);
            k8.F.y(context, jSONObject, "type", "rounded_rectangle");
            return jSONObject;
        }
    }

    /* compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7704a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7704a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final Y8 d(D7.f fVar, Y8 y82, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "background_color", l7.k.f43901f, zP, y82 != null ? y82.f7775a : null, l7.h.f43881b, l7.e.f43877a);
            AbstractC5371a<Y4> abstractC5371a = y82 != null ? y82.f7776b : null;
            Uc uc = this.f7704a;
            return new Y8(abstractC5371aJ, l7.c.h(fVarW, jSONObject, "corner_radius", zP, abstractC5371a, uc.f6908u3), l7.c.h(fVarW, jSONObject, "item_height", zP, y82 != null ? y82.f7777c : null, uc.f6908u3), l7.c.h(fVarW, jSONObject, "item_width", zP, y82 != null ? y82.f7778d : null, uc.f6908u3), l7.c.h(fVarW, jSONObject, "stroke", zP, y82 != null ? y82.f7779e : null, uc.f6446D7));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Y8 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.p(context, "background_color", value.f7775a, jSONObject, l7.h.f43880a);
            Uc uc = this.f7704a;
            l7.c.u(context, jSONObject, "corner_radius", value.f7776b, uc.f6908u3);
            AbstractC5371a<Y4> abstractC5371a = value.f7777c;
            b9.p pVar = uc.f6908u3;
            l7.c.u(context, jSONObject, "item_height", abstractC5371a, pVar);
            l7.c.u(context, jSONObject, "item_width", value.f7778d, pVar);
            l7.c.u(context, jSONObject, "stroke", value.f7779e, uc.f6446D7);
            k8.F.y(context, jSONObject, "type", "rounded_rectangle");
            return jSONObject;
        }
    }

    /* compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class c implements D7.j<JSONObject, Y8, W8> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7705a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7705a = component;
        }

        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final W8 a(D7.f context, Y8 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarK = l7.d.k(context, template.f7775a, data, "background_color", l7.k.f43901f, l7.h.f43881b);
            Uc uc = this.f7705a;
            W4 w42 = (W4) l7.d.h(context, template.f7776b, data, "corner_radius", uc.f6918v3, uc.f6897t3);
            if (w42 == null) {
                w42 = X8.f7700a;
            }
            kotlin.jvm.internal.l.e(w42, "JsonFieldResolver.resolv…RNER_RADIUS_DEFAULT_VALUE");
            W4 w43 = (W4) l7.d.h(context, template.f7777c, data, "item_height", uc.f6918v3, uc.f6897t3);
            if (w43 == null) {
                w43 = X8.f7701b;
            }
            W4 w44 = w43;
            kotlin.jvm.internal.l.e(w44, "JsonFieldResolver.resolv…ITEM_HEIGHT_DEFAULT_VALUE");
            W4 w45 = (W4) l7.d.h(context, template.f7778d, data, "item_width", uc.f6918v3, uc.f6897t3);
            if (w45 == null) {
                w45 = X8.f7702c;
            }
            W4 w46 = w45;
            kotlin.jvm.internal.l.e(w46, "JsonFieldResolver.resolv… ITEM_WIDTH_DEFAULT_VALUE");
            return new W8(bVarK, w42, w44, w46, (C1185ga) l7.d.h(context, template.f7779e, data, "stroke", uc.f6457E7, uc.f6435C7));
        }
    }
}
