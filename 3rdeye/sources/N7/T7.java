package N7;

import A7.b;
import N7.P7;
import c9.C2091l;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivPatchJsonParser.kt */
/* loaded from: classes.dex */
public final class T7 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f6339a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final l7.i f6340b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final F3.h f6341c;

    /* compiled from: DivPatchJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f6342g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof P7.b);
        }
    }

    /* compiled from: DivPatchJsonParser.kt */
    public static final class b implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6343a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6343a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v1, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f6343a;
            List listO = k8.F.o(context, data, "changes", uc.f6422B5, T7.f6341c);
            kotlin.jvm.internal.l.e(listO, "readList(context, data, …arser, CHANGES_VALIDATOR)");
            l7.i iVar = T7.f6340b;
            p9.l<String, P7.b> lVar = P7.b.FROM_STRING;
            b.C0000b c0000b = T7.f6339a;
            ?? B10 = l7.b.b(context, data, "mode", iVar, lVar, l7.e.f43877a, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            b9.p pVar = uc.f6766h1;
            return new P7(c0000b, listO, k8.F.s(context, data, "on_applied_actions", pVar), k8.F.s(context, data, "on_failed_actions", pVar));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, P7 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f6343a;
            k8.F.B(context, jSONObject, "changes", value.f6008a, uc.f6422B5);
            l7.b.e(context, jSONObject, "mode", value.f6009b, P7.b.TO_STRING);
            List<C1175g0> list = value.f6010c;
            b9.p pVar = uc.f6766h1;
            k8.F.B(context, jSONObject, "on_applied_actions", list, pVar);
            k8.F.B(context, jSONObject, "on_failed_actions", value.f6011d, pVar);
            return jSONObject;
        }
    }

    /* compiled from: DivPatchJsonParser.kt */
    public static final class c implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6344a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6344a = component;
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
            Uc uc = this.f6344a;
            b9.p pVar = uc.f6433C5;
            F3.h hVar = T7.f6341c;
            kotlin.jvm.internal.l.d(hVar, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            AbstractC5371a abstractC5371aF = l7.c.f(fVarW, jSONObject, "changes", zP, null, pVar, hVar);
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "mode", T7.f6340b, zP, null, P7.b.FROM_STRING, l7.e.f43877a);
            b9.p pVar2 = uc.f6777i1;
            return new U7(abstractC5371aF, abstractC5371aJ, l7.c.k(fVarW, jSONObject, "on_applied_actions", zP, null, pVar2), l7.c.k(fVarW, jSONObject, "on_failed_actions", zP, null, pVar2));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, U7 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f6344a;
            l7.c.v(context, jSONObject, "changes", value.f6395a, uc.f6433C5);
            l7.c.p(context, "mode", value.f6396b, jSONObject, P7.b.TO_STRING);
            AbstractC5371a<List<C1132d2>> abstractC5371a = value.f6397c;
            b9.p pVar = uc.f6777i1;
            l7.c.v(context, jSONObject, "on_applied_actions", abstractC5371a, pVar);
            l7.c.v(context, jSONObject, "on_failed_actions", value.f6398d, pVar);
            return jSONObject;
        }
    }

    /* compiled from: DivPatchJsonParser.kt */
    public static final class d implements D7.j<JSONObject, U7, P7> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6345a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6345a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v2, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            U7 template = (U7) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f6345a;
            List listF = l7.d.f(context, template.f6395a, data, "changes", uc.f6444D5, uc.f6422B5, T7.f6341c);
            kotlin.jvm.internal.l.e(listF, "resolveList(context, tem…arser, CHANGES_VALIDATOR)");
            l7.i iVar = T7.f6340b;
            p9.l<String, P7.b> lVar = P7.b.FROM_STRING;
            b.C0000b c0000b = T7.f6339a;
            ?? L7 = l7.d.l(context, template.f6396b, data, "mode", iVar, lVar, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            AbstractC5371a<List<C1132d2>> abstractC5371a = template.f6397c;
            b9.p pVar = uc.f6789j1;
            b9.p pVar2 = uc.f6766h1;
            return new P7(c0000b, listF, l7.d.q(context, abstractC5371a, data, "on_applied_actions", pVar, pVar2), l7.d.q(context, template.f6398d, data, "on_failed_actions", pVar, pVar2));
        }
    }

    static {
        P7.b value = P7.b.PARTIAL;
        kotlin.jvm.internal.l.f(value, "value");
        f6339a = new b.C0000b(value);
        Object objM = C2091l.m(P7.b.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f6342g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f6340b = new l7.i(objM, validator);
        f6341c = new F3.h(29);
    }
}
