package N7;

import N7.C1259lc;
import N7.C1329qc;
import l7.h;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivVideoSourceJsonParser.kt */
/* renamed from: N7.pc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1315pc {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final H7 f8917a = new H7(16);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final B8 f8918b = new B8(16);

    /* compiled from: DivVideoSourceJsonParser.kt */
    /* renamed from: N7.pc$a */
    public static final class a implements D7.h, D7.b {
        public static JSONObject d(D7.f context, C1259lc.a value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "height", value.f8743a);
            k8.F.y(context, jSONObject, "type", "resolution");
            l7.b.d(context, jSONObject, "width", value.f8744b);
            return jSONObject;
        }

        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            return new C1259lc.a(l7.b.a(context, data, "height", eVar, eVar2, C1315pc.f8917a), l7.b.a(context, data, "width", eVar, eVar2, C1315pc.f8918b));
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1259lc.a) obj);
        }
    }

    /* compiled from: DivVideoSourceJsonParser.kt */
    /* renamed from: N7.pc$b */
    public static final class b implements D7.h, D7.i {
        public static JSONObject d(D7.f context, C1329qc.a value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "height", value.f9007a);
            k8.F.y(context, jSONObject, "type", "resolution");
            l7.c.q(context, jSONObject, "width", value.f9008b);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1329qc.a) obj);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            return new C1329qc.a(l7.c.e(fVarW, jSONObject, "height", eVar, zP, null, eVar2, C1315pc.f8917a), l7.c.e(fVarW, jSONObject, "width", eVar, zP, null, eVar2, C1315pc.f8918b));
        }
    }

    /* compiled from: DivVideoSourceJsonParser.kt */
    /* renamed from: N7.pc$c */
    public static final class c implements D7.j<JSONObject, C1329qc.a, C1259lc.a> {
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1329qc.a template = (C1329qc.a) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarE = l7.d.e(context, template.f9007a, data, "height", eVar, eVar2, C1315pc.f8917a);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex…TO_INT, HEIGHT_VALIDATOR)");
            A7.b bVarE2 = l7.d.e(context, template.f9008b, data, "width", eVar, eVar2, C1315pc.f8918b);
            kotlin.jvm.internal.l.e(bVarE2, "resolveExpression(contex…_TO_INT, WIDTH_VALIDATOR)");
            return new C1259lc.a(bVarE, bVarE2);
        }
    }
}
