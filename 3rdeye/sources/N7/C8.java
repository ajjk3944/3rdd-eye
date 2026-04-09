package N7;

import N7.C1394v8;
import N7.V8;
import org.json.JSONObject;

/* compiled from: DivRadialGradientJsonParser.kt */
/* loaded from: classes.dex */
public final class C8 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final B8 f5041a = new B8(0);

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class a implements D7.h, D7.b {
        public static JSONObject d(D7.f context, C1394v8.a value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.e(context, jSONObject, "color", value.f9635a, l7.h.f43880a);
            l7.b.d(context, jSONObject, "position", value.f9636b);
            return jSONObject;
        }

        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            return new C1394v8.a(l7.b.a(context, data, "color", l7.k.f43901f, l7.h.f43881b, l7.e.f43877a), l7.b.a(context, data, "position", l7.k.f43899d, l7.h.f43885f, C8.f5041a));
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1394v8.a) obj);
        }
    }

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class b implements D7.h, D7.i {
        public static JSONObject d(D7.f context, V8.a value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.p(context, "color", value.f7582a, jSONObject, l7.h.f43880a);
            l7.c.q(context, jSONObject, "position", value.f7583b);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (V8.a) obj);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            return new V8.a(l7.c.e(fVarW, jSONObject, "color", l7.k.f43901f, zP, null, l7.h.f43881b, l7.e.f43877a), l7.c.e(fVarW, jSONObject, "position", l7.k.f43899d, zP, null, l7.h.f43885f, C8.f5041a));
        }
    }

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class c implements D7.j<JSONObject, V8.a, C1394v8.a> {
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            V8.a template = (V8.a) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarD = l7.d.d(context, template.f7582a, data, "color", l7.k.f43901f, l7.h.f43881b);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
            A7.b bVarE = l7.d.e(context, template.f7583b, data, "position", l7.k.f43899d, l7.h.f43885f, C8.f5041a);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex…UBLE, POSITION_VALIDATOR)");
            return new C1394v8.a(bVarD, bVarE);
        }
    }
}
