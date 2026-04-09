package N7;

import A7.b;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivInputValidatorExpressionJsonParser.kt */
/* renamed from: N7.z6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1448z6 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f10089a = new b.C0000b(Boolean.FALSE);

    /* compiled from: DivInputValidatorExpressionJsonParser.kt */
    /* renamed from: N7.z6$a */
    public static final class a implements D7.h, D7.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [A7.b] */
        public static C1434y6 d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1448z6.f10089a;
            j6.l lVar = l7.e.f43877a;
            ?? B10 = l7.b.b(context, data, "allow_empty", aVar, aVar2, lVar, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            A7.b bVarA = l7.b.a(context, data, "condition", aVar, aVar2, lVar);
            A7.b bVarA2 = l7.b.a(context, data, "label_id", l7.k.f43898c, l7.e.f43878b, lVar);
            Object objOpt = data.opt("variable");
            if (objOpt == JSONObject.NULL) {
                objOpt = null;
            }
            if (objOpt != null) {
                return new C1434y6(c0000b, bVarA, bVarA2, (String) objOpt);
            }
            throw z7.e.g("variable", data);
        }

        public static JSONObject e(D7.f context, C1434y6 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "allow_empty", value.f9932a);
            l7.b.d(context, jSONObject, "condition", value.f9933b);
            l7.b.d(context, jSONObject, "label_id", value.f9934c);
            k8.F.y(context, jSONObject, "type", "expression");
            k8.F.y(context, jSONObject, "variable", value.f9935d);
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C1434y6) obj);
        }
    }

    /* compiled from: DivInputValidatorExpressionJsonParser.kt */
    /* renamed from: N7.z6$b */
    public static final class b implements D7.h, D7.i {
        public static A6 d(D7.f fVar, A6 a62, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.a aVar = l7.k.f43896a;
            AbstractC5371a<A7.b<Boolean>> abstractC5371a = a62 != null ? a62.f4772a : null;
            h.a aVar2 = l7.h.f43884e;
            j6.l lVar = l7.e.f43877a;
            return new A6(l7.c.j(fVarW, jSONObject, "allow_empty", aVar, zP, abstractC5371a, aVar2, lVar), l7.c.e(fVarW, jSONObject, "condition", aVar, zP, a62 != null ? a62.f4773b : null, aVar2, lVar), l7.c.d(fVarW, jSONObject, "label_id", l7.k.f43898c, zP, a62 != null ? a62.f4774c : null), l7.c.a(fVarW, jSONObject, "variable", zP, a62 != null ? a62.f4775d : null));
        }

        public static JSONObject e(D7.f context, A6 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "allow_empty", value.f4772a);
            l7.c.q(context, jSONObject, "condition", value.f4773b);
            l7.c.q(context, jSONObject, "label_id", value.f4774c);
            k8.F.y(context, jSONObject, "type", "expression");
            l7.c.t(context, jSONObject, "variable", value.f4775d);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (A6) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivInputValidatorExpressionJsonParser.kt */
    /* renamed from: N7.z6$c */
    public static final class c implements D7.j<JSONObject, A6, C1434y6> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v1, types: [A7.b] */
        public static C1434y6 b(D7.f context, A6 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1448z6.f10089a;
            ?? L7 = l7.d.l(context, template.f4772a, data, "allow_empty", aVar, aVar2, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            A7.b bVarD = l7.d.d(context, template.f4773b, data, "condition", aVar, aVar2);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…_BOOLEAN, ANY_TO_BOOLEAN)");
            A7.b bVarC = l7.d.c(context, template.f4774c, data, "label_id", l7.k.f43898c);
            kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…_id\", TYPE_HELPER_STRING)");
            Object objB = l7.d.b(template.f4775d, data, "variable", l7.e.f43878b, l7.e.f43877a);
            kotlin.jvm.internal.l.e(objB, "resolve(context, templat…riable, data, \"variable\")");
            return new C1434y6(c0000b, bVarD, bVarC, (String) objB);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (A6) bVar, jSONObject);
        }
    }
}
