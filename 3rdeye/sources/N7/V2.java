package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivBlurJsonParser.kt */
/* loaded from: classes.dex */
public final class V2 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final B4.i f7556a = new B4.i(9);

    /* compiled from: DivBlurJsonParser.kt */
    public static final class a implements D7.h, D7.b {
        public static U2 d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            return new U2(l7.b.a(context, data, "radius", l7.k.f43897b, l7.h.f43886g, V2.f7556a));
        }

        public static JSONObject e(D7.f context, U2 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "radius", value.f6372a);
            k8.F.y(context, jSONObject, "type", "blur");
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (U2) obj);
        }
    }

    /* compiled from: DivBlurJsonParser.kt */
    public static final class b implements D7.h, D7.i {
        public static W2 d(D7.f fVar, W2 w22, JSONObject jSONObject) throws z7.d {
            return new W2(l7.c.e(T1.B.w(fVar), jSONObject, "radius", l7.k.f43897b, B4.g.p(fVar, "context", jSONObject, "data"), w22 != null ? w22.f7609a : null, l7.h.f43886g, V2.f7556a));
        }

        public static JSONObject e(D7.f context, W2 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "radius", value.f7609a);
            k8.F.y(context, jSONObject, "type", "blur");
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (W2) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivBlurJsonParser.kt */
    public static final class c implements D7.j<JSONObject, W2, U2> {
        public static U2 b(D7.f context, W2 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarE = l7.d.e(context, template.f7609a, data, "radius", l7.k.f43897b, l7.h.f43886g, V2.f7556a);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex…TO_INT, RADIUS_VALIDATOR)");
            return new U2(bVarE);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (W2) bVar, jSONObject);
        }
    }
}
