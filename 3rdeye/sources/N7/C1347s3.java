package N7;

import java.util.List;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivCollectionItemBuilderJsonParser.kt */
/* renamed from: N7.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1347s3 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final F3.h f9138a = new F3.h(11);

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    /* renamed from: N7.s3$a */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9139a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9139a = component;
        }

        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.f fVar = l7.k.f43902g;
            A8.d dVar = l7.e.f43878b;
            j6.l lVar = l7.e.f43877a;
            A7.b bVarA = l7.b.a(context, data, "data", fVar, dVar, lVar);
            String str = (String) k8.F.r(context, data, "data_element_name", dVar, lVar);
            if (str == null) {
                str = "it";
            }
            List listO = k8.F.o(context, data, "prototypes", this.f9139a.f6720d2, C1347s3.f9138a);
            kotlin.jvm.internal.l.e(listO, "readList(context, data, …er, PROTOTYPES_VALIDATOR)");
            return new C1333r3(bVarA, str, listO);
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1333r3 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "data", value.f9032a);
            k8.F.y(context, jSONObject, "data_element_name", value.f9033b);
            k8.F.B(context, jSONObject, "prototypes", value.f9034c, this.f9139a.f6720d2);
            return jSONObject;
        }
    }

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    /* renamed from: N7.s3$b */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9140a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9140a = component;
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
            return new C1375u3(l7.c.d(fVarW, jSONObject, "data", l7.k.f43902g, zP, null), l7.c.i(fVarW, jSONObject, "data_element_name", zP, null, l7.e.f43878b), l7.c.f(fVarW, jSONObject, "prototypes", zP, null, this.f9140a.f6732e2, C1347s3.f9138a));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1375u3 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "data", value.f9376a);
            l7.c.t(context, jSONObject, "data_element_name", value.f9377b);
            l7.c.v(context, jSONObject, "prototypes", value.f9378c, this.f9140a.f6732e2);
            return jSONObject;
        }
    }

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    /* renamed from: N7.s3$c */
    public static final class c implements D7.j<JSONObject, C1375u3, C1333r3> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9141a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9141a = component;
        }

        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1375u3 template = (C1375u3) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarC = l7.d.c(context, template.f9376a, data, "data", l7.k.f43902g);
            kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…, TYPE_HELPER_JSON_ARRAY)");
            String str = (String) l7.d.g(context, "data_element_name", template.f9377b, data, l7.e.f43878b);
            if (str == null) {
                str = "it";
            }
            Uc uc = this.f9141a;
            List listF = l7.d.f(context, template.f9378c, data, "prototypes", uc.f6743f2, uc.f6720d2, C1347s3.f9138a);
            kotlin.jvm.internal.l.e(listF, "resolveList(context, tem…er, PROTOTYPES_VALIDATOR)");
            return new C1333r3(bVarC, str, listF);
        }
    }
}
