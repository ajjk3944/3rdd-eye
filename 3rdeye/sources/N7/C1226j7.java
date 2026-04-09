package N7;

import A7.b;
import N7.H3;
import c9.C2091l;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivNumberAnimatorJsonParser.kt */
/* renamed from: N7.j7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1226j7 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8536a = b.a.a(EnumC1346s2.NORMAL);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8537b = b.a.a(EnumC1360t2.LINEAR);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final H3.a f8538c = new H3.a(new P4(b.a.a(1L)));

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8539d = b.a.a(0L);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8540e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8541f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final F3.h f8542g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final B4.f f8543h;

    /* compiled from: DivNumberAnimatorJsonParser.kt */
    /* renamed from: N7.j7$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8544g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1346s2);
        }
    }

    /* compiled from: DivNumberAnimatorJsonParser.kt */
    /* renamed from: N7.j7$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f8545g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1360t2);
        }
    }

    /* compiled from: DivNumberAnimatorJsonParser.kt */
    /* renamed from: N7.j7$c */
    public static final class c implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8546a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8546a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v11, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v18, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v4, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C1212i7 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f8546a;
            List listS = k8.F.s(context, data, "cancel_actions", uc.f6766h1);
            l7.i iVar = C1226j7.f8540e;
            p9.l<String, EnumC1346s2> lVar = EnumC1346s2.FROM_STRING;
            b.C0000b c0000b = C1226j7.f8536a;
            j6.l lVar2 = l7.e.f43877a;
            ?? B10 = l7.b.b(context, data, "direction", iVar, lVar, lVar2, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarA = l7.b.a(context, data, "duration", eVar, eVar2, C1226j7.f8542g);
            List listS2 = k8.F.s(context, data, "end_actions", uc.f6766h1);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            A7.b bVarA2 = l7.b.a(context, data, "end_value", dVar, dVar2, lVar2);
            Object objOpt = data.opt(FacebookMediationAdapter.KEY_ID);
            Object obj = JSONObject.NULL;
            if (objOpt == obj) {
                objOpt = null;
            }
            if (objOpt == null) {
                throw z7.e.g(FacebookMediationAdapter.KEY_ID, data);
            }
            String str = (String) objOpt;
            l7.i iVar2 = C1226j7.f8541f;
            p9.l<String, EnumC1360t2> lVar3 = EnumC1360t2.FROM_STRING;
            b.C0000b c0000b3 = C1226j7.f8537b;
            ?? B11 = l7.b.b(context, data, "interpolator", iVar2, lVar3, lVar2, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            H3 h32 = (H3) k8.F.q(context, data, "repeat_count", uc.f6885s2);
            if (h32 == null) {
                h32 = C1226j7.f8538c;
            }
            H3 h33 = h32;
            kotlin.jvm.internal.l.e(h33, "JsonPropertyParser.readO…EPEAT_COUNT_DEFAULT_VALUE");
            B4.f fVar = C1226j7.f8543h;
            b.C0000b c0000b5 = C1226j7.f8539d;
            ?? B12 = l7.b.b(context, data, "start_delay", eVar, eVar2, fVar, c0000b5);
            b.C0000b c0000b6 = B12 == 0 ? c0000b5 : B12;
            A7.b bVarB = l7.b.b(context, data, "start_value", dVar, dVar2, lVar2, null);
            Object objOpt2 = data.opt("variable_name");
            Object obj2 = objOpt2 != obj ? objOpt2 : null;
            if (obj2 != null) {
                return new C1212i7(listS, c0000b2, bVarA, listS2, bVarA2, str, c0000b4, h33, c0000b6, bVarB, (String) obj2);
            }
            throw z7.e.g("variable_name", data);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1212i7 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f8546a;
            k8.F.B(context, jSONObject, "cancel_actions", value.f8406a, uc.f6766h1);
            l7.b.e(context, jSONObject, "direction", value.f8407b, EnumC1346s2.TO_STRING);
            l7.b.d(context, jSONObject, "duration", value.f8408c);
            k8.F.B(context, jSONObject, "end_actions", value.f8409d, uc.f6766h1);
            l7.b.d(context, jSONObject, "end_value", value.f8410e);
            k8.F.y(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f8411f);
            l7.b.e(context, jSONObject, "interpolator", value.f8412g, EnumC1360t2.TO_STRING);
            k8.F.z(context, jSONObject, "repeat_count", value.f8413h, uc.f6885s2);
            l7.b.d(context, jSONObject, "start_delay", value.i);
            l7.b.d(context, jSONObject, "start_value", value.f8414j);
            k8.F.y(context, jSONObject, "type", "number_animator");
            k8.F.y(context, jSONObject, "variable_name", value.f8415k);
            return jSONObject;
        }
    }

    /* compiled from: DivNumberAnimatorJsonParser.kt */
    /* renamed from: N7.j7$d */
    public static final class d implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8547a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8547a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final C1240k7 d(D7.f fVar, C1240k7 c1240k7, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a<List<C1132d2>> abstractC5371a = c1240k7 != null ? c1240k7.f8635a : null;
            Uc uc = this.f8547a;
            AbstractC5371a abstractC5371aK = l7.c.k(fVarW, jSONObject, "cancel_actions", zP, abstractC5371a, uc.f6777i1);
            l7.i iVar = C1226j7.f8540e;
            AbstractC5371a<A7.b<EnumC1346s2>> abstractC5371a2 = c1240k7 != null ? c1240k7.f8636b : null;
            p9.l<String, EnumC1346s2> lVar = EnumC1346s2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "direction", iVar, zP, abstractC5371a2, lVar, lVar2);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a3 = c1240k7 != null ? c1240k7.f8637c : null;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aE = l7.c.e(fVarW, jSONObject, "duration", eVar, zP, abstractC5371a3, eVar2, C1226j7.f8542g);
            AbstractC5371a abstractC5371aK2 = l7.c.k(fVarW, jSONObject, "end_actions", zP, c1240k7 != null ? c1240k7.f8638d : null, uc.f6777i1);
            k.d dVar = l7.k.f43899d;
            AbstractC5371a<A7.b<Double>> abstractC5371a4 = c1240k7 != null ? c1240k7.f8639e : null;
            h.d dVar2 = l7.h.f43885f;
            return new C1240k7(abstractC5371aK, abstractC5371aJ, abstractC5371aE, abstractC5371aK2, l7.c.e(fVarW, jSONObject, "end_value", dVar, zP, abstractC5371a4, dVar2, lVar2), l7.c.a(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, zP, c1240k7 != null ? c1240k7.f8640f : null), l7.c.j(fVarW, jSONObject, "interpolator", C1226j7.f8541f, zP, c1240k7 != null ? c1240k7.f8641g : null, EnumC1360t2.FROM_STRING, lVar2), l7.c.h(fVarW, jSONObject, "repeat_count", zP, c1240k7 != null ? c1240k7.f8642h : null, uc.f6896t2), l7.c.j(fVarW, jSONObject, "start_delay", eVar, zP, c1240k7 != null ? c1240k7.i : null, eVar2, C1226j7.f8543h), l7.c.j(fVarW, jSONObject, "start_value", dVar, zP, c1240k7 != null ? c1240k7.f8643j : null, dVar2, lVar2), l7.c.a(fVarW, jSONObject, "variable_name", zP, c1240k7 != null ? c1240k7.f8644k : null));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1240k7 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f8547a;
            l7.c.v(context, jSONObject, "cancel_actions", value.f8635a, uc.f6777i1);
            l7.c.p(context, "direction", value.f8636b, jSONObject, EnumC1346s2.TO_STRING);
            l7.c.q(context, jSONObject, "duration", value.f8637c);
            l7.c.v(context, jSONObject, "end_actions", value.f8638d, uc.f6777i1);
            l7.c.q(context, jSONObject, "end_value", value.f8639e);
            l7.c.t(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f8640f);
            l7.c.p(context, "interpolator", value.f8641g, jSONObject, EnumC1360t2.TO_STRING);
            l7.c.u(context, jSONObject, "repeat_count", value.f8642h, uc.f6896t2);
            l7.c.q(context, jSONObject, "start_delay", value.i);
            l7.c.q(context, jSONObject, "start_value", value.f8643j);
            k8.F.y(context, jSONObject, "type", "number_animator");
            l7.c.t(context, jSONObject, "variable_name", value.f8644k);
            return jSONObject;
        }
    }

    /* compiled from: DivNumberAnimatorJsonParser.kt */
    /* renamed from: N7.j7$e */
    public static final class e implements D7.j<JSONObject, C1240k7, C1212i7> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8548a;

        public e(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8548a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v16, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v9, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1212i7 a(D7.f context, C1240k7 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f8548a;
            List listQ = l7.d.q(context, template.f8635a, data, "cancel_actions", uc.f6789j1, uc.f6766h1);
            l7.i iVar = C1226j7.f8540e;
            p9.l<String, EnumC1346s2> lVar = EnumC1346s2.FROM_STRING;
            b.C0000b c0000b = C1226j7.f8536a;
            ?? L7 = l7.d.l(context, template.f8636b, data, "direction", iVar, lVar, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarE = l7.d.e(context, template.f8637c, data, "duration", eVar, eVar2, C1226j7.f8542g);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex…_INT, DURATION_VALIDATOR)");
            List listQ2 = l7.d.q(context, template.f8638d, data, "end_actions", uc.f6789j1, uc.f6766h1);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            A7.b bVarD = l7.d.d(context, template.f8639e, data, "end_value", dVar, dVar2);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…DOUBLE, NUMBER_TO_DOUBLE)");
            AbstractC5371a<String> abstractC5371a = template.f8640f;
            A8.d dVar3 = l7.e.f43878b;
            j6.l lVar2 = l7.e.f43877a;
            Object objB = l7.d.b(abstractC5371a, data, FacebookMediationAdapter.KEY_ID, dVar3, lVar2);
            kotlin.jvm.internal.l.e(objB, "resolve(context, template.id, data, \"id\")");
            String str = (String) objB;
            l7.i iVar2 = C1226j7.f8541f;
            p9.l<String, EnumC1360t2> lVar3 = EnumC1360t2.FROM_STRING;
            b.C0000b c0000b3 = C1226j7.f8537b;
            ?? L8 = l7.d.l(context, template.f8641g, data, "interpolator", iVar2, lVar3, c0000b3);
            b.C0000b c0000b4 = L8 == 0 ? c0000b3 : L8;
            H3 h32 = (H3) l7.d.h(context, template.f8642h, data, "repeat_count", uc.f6907u2, uc.f6885s2);
            if (h32 == null) {
                h32 = C1226j7.f8538c;
            }
            H3 h33 = h32;
            kotlin.jvm.internal.l.e(h33, "JsonFieldResolver.resolv…EPEAT_COUNT_DEFAULT_VALUE");
            B4.f fVar = C1226j7.f8543h;
            b.C0000b c0000b5 = C1226j7.f8539d;
            ?? N8 = l7.d.n(context, template.i, data, "start_delay", eVar, eVar2, fVar, c0000b5);
            if (N8 != 0) {
                c0000b5 = N8;
            }
            A7.b bVarK = l7.d.k(context, template.f8643j, data, "start_value", dVar, dVar2);
            Object objB2 = l7.d.b(template.f8644k, data, "variable_name", dVar3, lVar2);
            kotlin.jvm.internal.l.e(objB2, "resolve(context, templat…e, data, \"variable_name\")");
            return new C1212i7(listQ, c0000b2, bVarE, listQ2, bVarD, str, c0000b4, h33, c0000b5, bVarK, (String) objB2);
        }
    }

    static {
        Object objM = C2091l.m(EnumC1346s2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f8544g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f8540e = new l7.i(objM, validator);
        Object objM2 = C2091l.m(EnumC1360t2.values());
        kotlin.jvm.internal.l.f(objM2, "default");
        b validator2 = b.f8545g;
        kotlin.jvm.internal.l.f(validator2, "validator");
        f8541f = new l7.i(objM2, validator2);
        f8542g = new F3.h(26);
        f8543h = new B4.f(26);
    }
}
