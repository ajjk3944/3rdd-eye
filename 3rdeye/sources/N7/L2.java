package N7;

import org.json.JSONObject;

/* compiled from: DivAspectJsonParser.kt */
/* loaded from: classes.dex */
public final class L2 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final B4.h f5750a = new B4.h(9);

    /* compiled from: DivAspectJsonParser.kt */
    public static final class a implements D7.h, D7.b {
        @Override // D7.b
        public final Object a(D7.f context, JSONObject jSONObject) {
            kotlin.jvm.internal.l.f(context, "context");
            return new K2(l7.b.a(context, jSONObject, "ratio", l7.k.f43899d, l7.h.f43885f, L2.f5750a));
        }

        @Override // D7.h
        public final JSONObject b(D7.f context, Object obj) {
            K2 value = (K2) obj;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "ratio", value.f5615a);
            return jSONObject;
        }
    }

    /* compiled from: DivAspectJsonParser.kt */
    public static final class b implements D7.h, D7.i {
        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final JSONObject b(D7.f context, Object obj) {
            M2 value = (M2) obj;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "ratio", value.f5829a);
            return jSONObject;
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            return new M2(l7.c.e(T1.B.w(fVar), jSONObject, "ratio", l7.k.f43899d, B4.g.p(fVar, "context", jSONObject, "data"), null, l7.h.f43885f, L2.f5750a));
        }
    }

    /* compiled from: DivAspectJsonParser.kt */
    public static final class c implements D7.j<JSONObject, M2, K2> {
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            M2 template = (M2) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarE = l7.d.e(context, template.f5829a, data, "ratio", l7.k.f43899d, l7.h.f43885f, L2.f5750a);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex…_DOUBLE, RATIO_VALIDATOR)");
            return new K2(bVarE);
        }
    }
}
