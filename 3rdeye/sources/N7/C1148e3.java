package N7;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivChangeSetTransitionJsonParser.kt */
/* renamed from: N7.e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1148e3 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final B4.h f8154a = new B4.h(10);

    /* compiled from: DivChangeSetTransitionJsonParser.kt */
    /* renamed from: N7.e3$a */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8155a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8155a = component;
        }

        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C1133d3 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            List listO = k8.F.o(context, data, "items", this.f8155a.f6586R1, C1148e3.f8154a);
            kotlin.jvm.internal.l.e(listO, "readList(context, data, …yParser, ITEMS_VALIDATOR)");
            return new C1133d3(listO);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1133d3 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.B(context, jSONObject, "items", value.f8063a, this.f8155a.f6586R1);
            k8.F.y(context, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* compiled from: DivChangeSetTransitionJsonParser.kt */
    /* renamed from: N7.e3$b */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8156a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8156a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final C1163f3 d(D7.f fVar, C1163f3 c1163f3, JSONObject jSONObject) throws z7.d {
            return new C1163f3(l7.c.f(T1.B.w(fVar), jSONObject, "items", B4.g.p(fVar, "context", jSONObject, "data"), c1163f3 != null ? c1163f3.f8190a : null, this.f8156a.f6597S1, C1148e3.f8154a));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1163f3 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.v(context, jSONObject, "items", value.f8190a, this.f8156a.f6597S1);
            k8.F.y(context, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* compiled from: DivChangeSetTransitionJsonParser.kt */
    /* renamed from: N7.e3$c */
    public static final class c implements D7.j<JSONObject, C1163f3, C1133d3> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8157a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8157a = component;
        }

        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1133d3 a(D7.f context, C1163f3 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f8157a;
            List listF = l7.d.f(context, template.f8190a, data, "items", uc.f6608T1, uc.f6586R1, C1148e3.f8154a);
            kotlin.jvm.internal.l.e(listF, "resolveList(context, tem…yParser, ITEMS_VALIDATOR)");
            return new C1133d3(listF);
        }
    }
}
