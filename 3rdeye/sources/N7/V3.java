package N7;

import A7.b;
import c9.C2091l;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivDataJsonParser.kt */
/* loaded from: classes.dex */
public final class V3 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7557a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final l7.i f7558b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final F3.h f7559c;

    /* compiled from: DivDataJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f7560g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof Tb);
        }
    }

    /* compiled from: DivDataJsonParser.kt */
    public static final class b implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7561a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7561a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v1, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final U3 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            D7.f dVar = context instanceof D7.d ? context : new D7.d(context);
            Uc uc = this.f7561a;
            List listS = k8.F.s(dVar, data, "functions", uc.f6463F3);
            Object objOpt = data.opt("log_id");
            if (objOpt == JSONObject.NULL) {
                objOpt = null;
            }
            if (objOpt == null) {
                throw z7.e.g("log_id", data);
            }
            String str = (String) objOpt;
            List listO = k8.F.o(dVar, data, "states", uc.f6441D2, V3.f7559c);
            kotlin.jvm.internal.l.e(listO, "readList(context, data, …Parser, STATES_VALIDATOR)");
            List listS2 = k8.F.s(dVar, data, "timers", uc.f6447D8);
            l7.i iVar = V3.f7558b;
            p9.l<String, Tb> lVar = Tb.FROM_STRING;
            b.C0000b c0000b = V3.f7557a;
            ?? B10 = l7.b.b(dVar, data, "transition_animation_selector", iVar, lVar, l7.e.f43877a, c0000b);
            D7.f fVar = dVar;
            if (B10 != 0) {
                c0000b = B10;
            }
            return new U3(listS, str, listO, listS2, c0000b, k8.F.s(fVar, data, "variable_triggers", uc.f6636V8), k8.F.s(fVar, data, "variables", uc.f6703b9), T1.B.h(fVar));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, U3 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f7561a;
            k8.F.B(context, jSONObject, "functions", value.f6374a, uc.f6463F3);
            k8.F.y(context, jSONObject, "log_id", value.f6375b);
            k8.F.B(context, jSONObject, "states", value.f6376c, uc.f6441D2);
            k8.F.B(context, jSONObject, "timers", value.f6377d, uc.f6447D8);
            l7.b.e(context, jSONObject, "transition_animation_selector", value.f6378e, Tb.TO_STRING);
            k8.F.B(context, jSONObject, "variable_triggers", value.f6379f, uc.f6636V8);
            k8.F.B(context, jSONObject, "variables", value.f6380g, uc.f6703b9);
            return jSONObject;
        }
    }

    /* compiled from: DivDataJsonParser.kt */
    public static final class c implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7562a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7562a = component;
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
            Uc uc = this.f7562a;
            AbstractC5371a abstractC5371aK = l7.c.k(fVarW, jSONObject, "functions", zP, null, uc.f6474G3);
            AbstractC5371a abstractC5371aA = l7.c.a(fVarW, jSONObject, "log_id", zP, null);
            F3.h hVar = V3.f7559c;
            kotlin.jvm.internal.l.d(hVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new Z3(abstractC5371aK, abstractC5371aA, l7.c.f(fVarW, jSONObject, "states", zP, null, uc.f6452E2, hVar), l7.c.k(fVarW, jSONObject, "timers", zP, null, uc.f6458E8), l7.c.j(fVarW, jSONObject, "transition_animation_selector", V3.f7558b, zP, null, Tb.FROM_STRING, l7.e.f43877a), l7.c.k(fVarW, jSONObject, "variable_triggers", zP, null, uc.f6647W8), l7.c.k(fVarW, jSONObject, "variables", zP, null, uc.f6715c9));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Z3 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f7562a;
            l7.c.v(context, jSONObject, "functions", value.f7836a, uc.f6474G3);
            l7.c.t(context, jSONObject, "log_id", value.f7837b);
            l7.c.v(context, jSONObject, "states", value.f7838c, uc.f6452E2);
            l7.c.v(context, jSONObject, "timers", value.f7839d, uc.f6458E8);
            l7.c.p(context, "transition_animation_selector", value.f7840e, jSONObject, Tb.TO_STRING);
            l7.c.v(context, jSONObject, "variable_triggers", value.f7841f, uc.f6647W8);
            l7.c.v(context, jSONObject, "variables", value.f7842g, uc.f6715c9);
            return jSONObject;
        }
    }

    /* compiled from: DivDataJsonParser.kt */
    public static final class d implements D7.j<JSONObject, Z3, U3> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7563a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7563a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v7, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            Z3 template = (Z3) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f7563a;
            List listQ = l7.d.q(context, template.f7836a, data, "functions", uc.f6483H3, uc.f6463F3);
            Object objB = l7.d.b(template.f7837b, data, "log_id", l7.e.f43878b, l7.e.f43877a);
            kotlin.jvm.internal.l.e(objB, "resolve(context, template.logId, data, \"log_id\")");
            String str = (String) objB;
            List listF = l7.d.f(context, template.f7838c, data, "states", uc.f6462F2, uc.f6441D2, V3.f7559c);
            kotlin.jvm.internal.l.e(listF, "resolveList(context, tem…Parser, STATES_VALIDATOR)");
            List listQ2 = l7.d.q(context, template.f7839d, data, "timers", uc.f6468F8, uc.f6447D8);
            l7.i iVar = V3.f7558b;
            p9.l<String, Tb> lVar = Tb.FROM_STRING;
            b.C0000b c0000b = V3.f7557a;
            ?? L7 = l7.d.l(context, template.f7840e, data, "transition_animation_selector", iVar, lVar, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            return new U3(listQ, str, listF, listQ2, c0000b, l7.d.q(context, template.f7841f, data, "variable_triggers", uc.f6657X8, uc.f6636V8), l7.d.q(context, template.f7842g, data, "variables", uc.f6727d9, uc.f6703b9), null);
        }
    }

    static {
        Tb value = Tb.NONE;
        kotlin.jvm.internal.l.f(value, "value");
        f7557a = new b.C0000b(value);
        Object objM = C2091l.m(Tb.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f7560g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f7558b = new l7.i(objM, validator);
        f7559c = new F3.h(14);
    }
}
