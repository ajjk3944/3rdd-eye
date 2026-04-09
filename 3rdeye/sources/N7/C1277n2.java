package N7;

import N7.C1263m2;
import c9.C2091l;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionVideoJsonParser.kt */
/* renamed from: N7.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1277n2 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8784a;

    /* compiled from: DivActionVideoJsonParser.kt */
    /* renamed from: N7.n2$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8785g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof C1263m2.a);
        }
    }

    /* compiled from: DivActionVideoJsonParser.kt */
    /* renamed from: N7.n2$b */
    public static final class b implements D7.h, D7.b {
        public static C1263m2 d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            l7.i iVar = C1277n2.f8784a;
            p9.l<String, C1263m2.a> lVar = C1263m2.a.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            return new C1263m2(l7.b.a(context, data, "action", iVar, lVar, lVar2), l7.b.a(context, data, FacebookMediationAdapter.KEY_ID, l7.k.f43898c, l7.e.f43878b, lVar2));
        }

        public static JSONObject e(D7.f context, C1263m2 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.e(context, jSONObject, "action", value.f8747a, C1263m2.a.TO_STRING);
            l7.b.d(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f8748b);
            k8.F.y(context, jSONObject, "type", "video");
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C1263m2) obj);
        }
    }

    /* compiled from: DivActionVideoJsonParser.kt */
    /* renamed from: N7.n2$c */
    public static final class c implements D7.h, D7.i {
        public static C1291o2 d(D7.f fVar, C1291o2 c1291o2, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            return new C1291o2(l7.c.e(fVarW, jSONObject, "action", C1277n2.f8784a, zP, c1291o2 != null ? c1291o2.f8848a : null, C1263m2.a.FROM_STRING, l7.e.f43877a), l7.c.d(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, l7.k.f43898c, zP, c1291o2 != null ? c1291o2.f8849b : null));
        }

        public static JSONObject e(D7.f context, C1291o2 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.p(context, "action", value.f8848a, jSONObject, C1263m2.a.TO_STRING);
            l7.c.q(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f8849b);
            k8.F.y(context, jSONObject, "type", "video");
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C1291o2) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivActionVideoJsonParser.kt */
    /* renamed from: N7.n2$d */
    public static final class d implements D7.j<JSONObject, C1291o2, C1263m2> {
        public static C1263m2 b(D7.f context, C1291o2 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarD = l7.d.d(context, template.f8848a, data, "action", C1277n2.f8784a, C1263m2.a.FROM_STRING);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…Video.Action.FROM_STRING)");
            A7.b bVarC = l7.d.c(context, template.f8849b, data, FacebookMediationAdapter.KEY_ID, l7.k.f43898c);
            kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…\"id\", TYPE_HELPER_STRING)");
            return new C1263m2(bVarD, bVarC);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (C1291o2) bVar, jSONObject);
        }
    }

    static {
        Object objM = C2091l.m(C1263m2.a.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f8785g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f8784a = new l7.i(objM, validator);
    }
}
