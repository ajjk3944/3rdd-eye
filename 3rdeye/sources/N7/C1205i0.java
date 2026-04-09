package N7;

import c9.C2091l;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionAnimatorStartJsonParser.kt */
/* renamed from: N7.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1205i0 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8376a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8377b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final B4.g f8378c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final B4.h f8379d;

    /* compiled from: DivActionAnimatorStartJsonParser.kt */
    /* renamed from: N7.i0$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8380g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1346s2);
        }
    }

    /* compiled from: DivActionAnimatorStartJsonParser.kt */
    /* renamed from: N7.i0$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f8381g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1360t2);
        }
    }

    /* compiled from: DivActionAnimatorStartJsonParser.kt */
    /* renamed from: N7.i0$c */
    public static final class c implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8382a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8382a = component;
        }

        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C1190h0 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Object objOpt = data.opt("animator_id");
            if (objOpt == JSONObject.NULL) {
                objOpt = null;
            }
            if (objOpt == null) {
                throw z7.e.g("animator_id", data);
            }
            String str = (String) objOpt;
            l7.i iVar = C1205i0.f8376a;
            p9.l<String, EnumC1346s2> lVar = EnumC1346s2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "direction", iVar, lVar, lVar2, null);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarB2 = l7.b.b(context, data, "duration", eVar, eVar2, C1205i0.f8378c, null);
            Uc uc = this.f8382a;
            return new C1190h0(str, bVarB, bVarB2, (Yb) k8.F.q(context, data, "end_value", uc.f6668Y8), l7.b.b(context, data, "interpolator", C1205i0.f8377b, EnumC1360t2.FROM_STRING, lVar2, null), (H3) k8.F.q(context, data, "repeat_count", uc.f6885s2), l7.b.b(context, data, "start_delay", eVar, eVar2, C1205i0.f8379d, null), (Yb) k8.F.q(context, data, "start_value", uc.f6668Y8));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1190h0 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.y(context, jSONObject, "animator_id", value.f8309a);
            l7.b.e(context, jSONObject, "direction", value.f8310b, EnumC1346s2.TO_STRING);
            l7.b.d(context, jSONObject, "duration", value.f8311c);
            Uc uc = this.f8382a;
            k8.F.z(context, jSONObject, "end_value", value.f8312d, uc.f6668Y8);
            l7.b.e(context, jSONObject, "interpolator", value.f8313e, EnumC1360t2.TO_STRING);
            k8.F.z(context, jSONObject, "repeat_count", value.f8314f, uc.f6885s2);
            l7.b.d(context, jSONObject, "start_delay", value.f8315g);
            k8.F.z(context, jSONObject, "start_value", value.f8316h, uc.f6668Y8);
            k8.F.y(context, jSONObject, "type", "animator_start");
            return jSONObject;
        }
    }

    /* compiled from: DivActionAnimatorStartJsonParser.kt */
    /* renamed from: N7.i0$d */
    public static final class d implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8383a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8383a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final C1219j0 d(D7.f fVar, C1219j0 c1219j0, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a abstractC5371aA = l7.c.a(fVarW, jSONObject, "animator_id", zP, c1219j0 != null ? c1219j0.f8472a : null);
            l7.i iVar = C1205i0.f8376a;
            AbstractC5371a<A7.b<EnumC1346s2>> abstractC5371a = c1219j0 != null ? c1219j0.f8473b : null;
            p9.l<String, EnumC1346s2> lVar = EnumC1346s2.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "direction", iVar, zP, abstractC5371a, lVar, lVar2);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a2 = c1219j0 != null ? c1219j0.f8474c : null;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "duration", eVar, zP, abstractC5371a2, eVar2, C1205i0.f8378c);
            AbstractC5371a<AbstractC1127cc> abstractC5371a3 = c1219j0 != null ? c1219j0.f8475d : null;
            Uc uc = this.f8383a;
            return new C1219j0(abstractC5371aA, abstractC5371aJ, abstractC5371aJ2, l7.c.h(fVarW, jSONObject, "end_value", zP, abstractC5371a3, uc.f6679Z8), l7.c.j(fVarW, jSONObject, "interpolator", C1205i0.f8377b, zP, c1219j0 != null ? c1219j0.f8476e : null, EnumC1360t2.FROM_STRING, lVar2), l7.c.h(fVarW, jSONObject, "repeat_count", zP, c1219j0 != null ? c1219j0.f8477f : null, uc.f6896t2), l7.c.j(fVarW, jSONObject, "start_delay", eVar, zP, c1219j0 != null ? c1219j0.f8478g : null, eVar2, C1205i0.f8379d), l7.c.h(fVarW, jSONObject, "start_value", zP, c1219j0 != null ? c1219j0.f8479h : null, uc.f6679Z8));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1219j0 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.t(context, jSONObject, "animator_id", value.f8472a);
            l7.c.p(context, "direction", value.f8473b, jSONObject, EnumC1346s2.TO_STRING);
            l7.c.q(context, jSONObject, "duration", value.f8474c);
            Uc uc = this.f8383a;
            l7.c.u(context, jSONObject, "end_value", value.f8475d, uc.f6679Z8);
            l7.c.p(context, "interpolator", value.f8476e, jSONObject, EnumC1360t2.TO_STRING);
            l7.c.u(context, jSONObject, "repeat_count", value.f8477f, uc.f6896t2);
            l7.c.q(context, jSONObject, "start_delay", value.f8478g);
            l7.c.u(context, jSONObject, "start_value", value.f8479h, uc.f6679Z8);
            k8.F.y(context, jSONObject, "type", "animator_start");
            return jSONObject;
        }
    }

    /* compiled from: DivActionAnimatorStartJsonParser.kt */
    /* renamed from: N7.i0$e */
    public static final class e implements D7.j<JSONObject, C1219j0, C1190h0> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8384a;

        public e(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8384a = component;
        }

        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1190h0 a(D7.f context, C1219j0 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Object objB = l7.d.b(template.f8472a, data, "animator_id", l7.e.f43878b, l7.e.f43877a);
            kotlin.jvm.internal.l.e(objB, "resolve(context, templat…rId, data, \"animator_id\")");
            A7.b bVarK = l7.d.k(context, template.f8473b, data, "direction", C1205i0.f8376a, EnumC1346s2.FROM_STRING);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            A7.b bVarM = l7.d.m(context, template.f8474c, data, "duration", eVar, eVar2, C1205i0.f8378c);
            Uc uc = this.f8384a;
            return new C1190h0((String) objB, bVarK, bVarM, (Yb) l7.d.h(context, template.f8475d, data, "end_value", uc.f6691a9, uc.f6668Y8), l7.d.k(context, template.f8476e, data, "interpolator", C1205i0.f8377b, EnumC1360t2.FROM_STRING), (H3) l7.d.h(context, template.f8477f, data, "repeat_count", uc.f6907u2, uc.f6885s2), l7.d.m(context, template.f8478g, data, "start_delay", eVar, eVar2, C1205i0.f8379d), (Yb) l7.d.h(context, template.f8479h, data, "start_value", uc.f6691a9, uc.f6668Y8));
        }
    }

    static {
        Object objM = C2091l.m(EnumC1346s2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f8380g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f8376a = new l7.i(objM, validator);
        Object objM2 = C2091l.m(EnumC1360t2.values());
        kotlin.jvm.internal.l.f(objM2, "default");
        b validator2 = b.f8381g;
        kotlin.jvm.internal.l.f(validator2, "validator");
        f8377b = new l7.i(objM2, validator2);
        f8378c = new B4.g(9);
        f8379d = new B4.h(8);
    }
}
