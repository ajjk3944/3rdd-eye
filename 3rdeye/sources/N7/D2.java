package N7;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivAppearanceSetTransitionJsonParser.kt */
/* loaded from: classes.dex */
public final class D2 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final B4.g f5056a = new B4.g(10);

    /* compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5057a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5057a = component;
        }

        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C2 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            List listO = k8.F.o(context, data, "items", this.f5057a.f6927w1, D2.f5056a);
            kotlin.jvm.internal.l.e(listO, "readList(context, data, …yParser, ITEMS_VALIDATOR)");
            return new C2(listO);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C2 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.B(context, jSONObject, "items", value.f5010a, this.f5057a.f6927w1);
            k8.F.y(context, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5058a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5058a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final E2 d(D7.f fVar, E2 e22, JSONObject jSONObject) throws z7.d {
            return new E2(l7.c.f(T1.B.w(fVar), jSONObject, "items", B4.g.p(fVar, "context", jSONObject, "data"), e22 != null ? e22.f5129a : null, this.f5058a.f6938x1, D2.f5056a));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, E2 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.v(context, jSONObject, "items", value.f5129a, this.f5058a.f6938x1);
            k8.F.y(context, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class c implements D7.j<JSONObject, E2, C2> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5059a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5059a = component;
        }

        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2 a(D7.f context, E2 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f5059a;
            List listF = l7.d.f(context, template.f5129a, data, "items", uc.f6949y1, uc.f6927w1, D2.f5056a);
            kotlin.jvm.internal.l.e(listF, "resolveList(context, tem…yParser, ITEMS_VALIDATOR)");
            return new C2(listF);
        }
    }
}
