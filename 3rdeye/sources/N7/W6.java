package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivMatchParentSizeJsonParser.kt */
/* loaded from: classes.dex */
public final class W6 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final B4.i f7615a = new B4.i(24);

    /* compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class a implements D7.h, D7.b {
        public static V6 d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            return new V6(l7.b.b(context, data, "weight", l7.k.f43899d, l7.h.f43885f, W6.f7615a, null));
        }

        public static JSONObject e(D7.f context, V6 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "match_parent");
            l7.b.d(context, jSONObject, "weight", value.f7573a);
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (V6) obj);
        }
    }

    /* compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class b implements D7.h, D7.i {
        public static X6 d(D7.f fVar, X6 x62, JSONObject jSONObject) throws z7.d {
            return new X6(l7.c.j(T1.B.w(fVar), jSONObject, "weight", l7.k.f43899d, B4.g.p(fVar, "context", jSONObject, "data"), x62 != null ? x62.f7698a : null, l7.h.f43885f, W6.f7615a));
        }

        public static JSONObject e(D7.f context, X6 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "type", "match_parent");
            l7.c.q(context, jSONObject, "weight", value.f7698a);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (X6) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class c implements D7.j<JSONObject, X6, V6> {
        public static V6 b(D7.f context, X6 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            return new V6(l7.d.m(context, template.f7698a, data, "weight", l7.k.f43899d, l7.h.f43885f, W6.f7615a));
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (X6) bVar, jSONObject);
        }
    }
}
