package N7;

import l7.h;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivCornersRadiusJsonParser.kt */
/* loaded from: classes.dex */
public final class F3 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final B4.g f5166a = new B4.g(13);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final B4.h f5167b = new B4.h(12);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final B4.i f5168c = new B4.i(12);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final F3.h f5169d = new F3.h(13);

    /* compiled from: DivCornersRadiusJsonParser.kt */
    public static final class a implements D7.h, D7.b {
        public static JSONObject d(D7.f context, E3 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "bottom-left", value.f5130a);
            l7.b.d(context, jSONObject, "bottom-right", value.f5131b);
            l7.b.d(context, jSONObject, "top-left", value.f5132c);
            l7.b.d(context, jSONObject, "top-right", value.f5133d);
            return jSONObject;
        }

        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            return new E3(l7.b.b(context, data, "bottom-left", eVar, eVar2, F3.f5166a, null), l7.b.b(context, data, "bottom-right", eVar, eVar2, F3.f5167b, null), l7.b.b(context, data, "top-left", eVar, eVar2, F3.f5168c, null), l7.b.b(context, data, "top-right", eVar, eVar2, F3.f5169d, null));
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (E3) obj);
        }
    }

    /* compiled from: DivCornersRadiusJsonParser.kt */
    public static final class b implements D7.h, D7.i {
        public static JSONObject d(D7.f context, G3 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "bottom-left", value.f5261a);
            l7.c.q(context, jSONObject, "bottom-right", value.f5262b);
            l7.c.q(context, jSONObject, "top-left", value.f5263c);
            l7.c.q(context, jSONObject, "top-right", value.f5264d);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (G3) obj);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            return new G3(l7.c.j(fVarW, jSONObject, "bottom-left", eVar, zP, null, eVar2, F3.f5166a), l7.c.j(fVarW, jSONObject, "bottom-right", eVar, zP, null, eVar2, F3.f5167b), l7.c.j(fVarW, jSONObject, "top-left", eVar, zP, null, eVar2, F3.f5168c), l7.c.j(fVarW, jSONObject, "top-right", eVar, zP, null, eVar2, F3.f5169d));
        }
    }

    /* compiled from: DivCornersRadiusJsonParser.kt */
    public static final class c implements D7.j<JSONObject, G3, E3> {
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            G3 template = (G3) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            return new E3(l7.d.m(context, template.f5261a, data, "bottom-left", eVar, eVar2, F3.f5166a), l7.d.m(context, template.f5262b, data, "bottom-right", eVar, eVar2, F3.f5167b), l7.d.m(context, template.f5263c, data, "top-left", eVar, eVar2, F3.f5168c), l7.d.m(context, template.f5264d, data, "top-right", eVar, eVar2, F3.f5169d));
        }
    }
}
