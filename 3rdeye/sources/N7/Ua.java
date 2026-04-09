package N7;

import N7.C1383ub;
import N7.Ka;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes.dex */
public final class Ua {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final Ka.b.a.EnumC0086a f6402a = Ka.b.a.EnumC0086a.AUTO;

    /* compiled from: DivTextJsonParser.kt */
    public static final class a implements D7.h, D7.b {
        public static JSONObject d(D7.f context, Ka.b.a value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "description", value.f5712a);
            k8.F.A(context, jSONObject, "type", value.f5713b, Ka.b.a.EnumC0086a.TO_STRING);
            return jSONObject;
        }

        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.g gVar = l7.k.f43898c;
            A8.d dVar = l7.e.f43878b;
            j6.l lVar = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "description", gVar, dVar, lVar, null);
            Ka.b.a.EnumC0086a enumC0086a = (Ka.b.a.EnumC0086a) k8.F.r(context, data, "type", Ka.b.a.EnumC0086a.FROM_STRING, lVar);
            if (enumC0086a == null) {
                enumC0086a = Ua.f6402a;
            }
            kotlin.jvm.internal.l.e(enumC0086a, "JsonPropertyParser.readO…NG) ?: TYPE_DEFAULT_VALUE");
            return new Ka.b.a(bVarB, enumC0086a);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (Ka.b.a) obj);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class b implements D7.h, D7.i {
        public static JSONObject d(D7.f context, C1383ub.b.a value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "description", value.f9511a);
            l7.c.s(context, "type", value.f9512b, jSONObject, Ka.b.a.EnumC0086a.TO_STRING);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1383ub.b.a) obj);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            return new C1383ub.b.a(l7.c.j(fVarW, jSONObject, "description", l7.k.f43898c, zP, null, l7.e.f43878b, l7.e.f43877a), l7.c.i(fVarW, jSONObject, "type", zP, null, Ka.b.a.EnumC0086a.FROM_STRING));
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class c implements D7.j<JSONObject, C1383ub.b.a, Ka.b.a> {
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1383ub.b.a template = (C1383ub.b.a) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarJ = l7.d.j(context, template.f9511a, data, "description", l7.k.f43898c);
            Ka.b.a.EnumC0086a enumC0086a = (Ka.b.a.EnumC0086a) l7.d.g(context, "type", template.f9512b, data, Ka.b.a.EnumC0086a.FROM_STRING);
            if (enumC0086a == null) {
                enumC0086a = Ua.f6402a;
            }
            kotlin.jvm.internal.l.e(enumC0086a, "JsonFieldResolver.resolv…NG) ?: TYPE_DEFAULT_VALUE");
            return new Ka.b.a(bVarJ, enumC0086a);
        }
    }
}
