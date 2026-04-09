package N7;

import A7.b;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivInputValidatorRegexJsonParser.kt */
/* loaded from: classes.dex */
public final class F6 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5227a = new b.C0000b(Boolean.FALSE);

    /* compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class a implements D7.h, D7.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [A7.b] */
        public static E6 d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = F6.f5227a;
            j6.l lVar = l7.e.f43877a;
            ?? B10 = l7.b.b(context, data, "allow_empty", aVar, aVar2, lVar, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            k.g gVar = l7.k.f43898c;
            A8.d dVar = l7.e.f43878b;
            A7.b bVarA = l7.b.a(context, data, "label_id", gVar, dVar, lVar);
            A7.b bVarA2 = l7.b.a(context, data, "pattern", gVar, dVar, lVar);
            Object objOpt = data.opt("variable");
            if (objOpt == JSONObject.NULL) {
                objOpt = null;
            }
            if (objOpt != null) {
                return new E6(c0000b, bVarA, bVarA2, (String) objOpt);
            }
            throw z7.e.g("variable", data);
        }

        public static JSONObject e(D7.f context, E6 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "allow_empty", value.f5141a);
            l7.b.d(context, jSONObject, "label_id", value.f5142b);
            l7.b.d(context, jSONObject, "pattern", value.f5143c);
            k8.F.y(context, jSONObject, "type", "regex");
            k8.F.y(context, jSONObject, "variable", value.f5144d);
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (E6) obj);
        }
    }

    /* compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class b implements D7.h, D7.i {
        public static G6 d(D7.f fVar, G6 g62, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "allow_empty", l7.k.f43896a, zP, g62 != null ? g62.f5323a : null, l7.h.f43884e, l7.e.f43877a);
            k.g gVar = l7.k.f43898c;
            return new G6(abstractC5371aJ, l7.c.d(fVarW, jSONObject, "label_id", gVar, zP, g62 != null ? g62.f5324b : null), l7.c.d(fVarW, jSONObject, "pattern", gVar, zP, g62 != null ? g62.f5325c : null), l7.c.a(fVarW, jSONObject, "variable", zP, g62 != null ? g62.f5326d : null));
        }

        public static JSONObject e(D7.f context, G6 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "allow_empty", value.f5323a);
            l7.c.q(context, jSONObject, "label_id", value.f5324b);
            l7.c.q(context, jSONObject, "pattern", value.f5325c);
            k8.F.y(context, jSONObject, "type", "regex");
            l7.c.t(context, jSONObject, "variable", value.f5326d);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (G6) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class c implements D7.j<JSONObject, G6, E6> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v1, types: [A7.b] */
        public static E6 b(D7.f context, G6 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = F6.f5227a;
            ?? L7 = l7.d.l(context, template.f5323a, data, "allow_empty", aVar, aVar2, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            k.g gVar = l7.k.f43898c;
            A7.b bVarC = l7.d.c(context, template.f5324b, data, "label_id", gVar);
            kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…_id\", TYPE_HELPER_STRING)");
            A7.b bVarC2 = l7.d.c(context, template.f5325c, data, "pattern", gVar);
            kotlin.jvm.internal.l.e(bVarC2, "resolveExpression(contex…ern\", TYPE_HELPER_STRING)");
            Object objB = l7.d.b(template.f5326d, data, "variable", l7.e.f43878b, l7.e.f43877a);
            kotlin.jvm.internal.l.e(objB, "resolve(context, templat…riable, data, \"variable\")");
            return new E6(c0000b, bVarC, bVarC2, (String) objB);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (G6) bVar, jSONObject);
        }
    }
}
