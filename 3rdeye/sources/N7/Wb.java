package N7;

import A7.b;
import N7.Vb;
import c9.C2091l;
import java.util.List;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivTriggerJsonParser.kt */
/* loaded from: classes.dex */
public final class Wb {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7675a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final l7.i f7676b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final C1094a9 f7677c;

    /* compiled from: DivTriggerJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f7678g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof Vb.a);
        }
    }

    /* compiled from: DivTriggerJsonParser.kt */
    public static final class b implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7679a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7679a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            List listO = k8.F.o(context, data, "actions", this.f7679a.f6766h1, Wb.f7677c);
            kotlin.jvm.internal.l.e(listO, "readList(context, data, …arser, ACTIONS_VALIDATOR)");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            j6.l lVar = l7.e.f43877a;
            A7.b bVarA = l7.b.a(context, data, "condition", aVar, aVar2, lVar);
            l7.i iVar = Wb.f7676b;
            p9.l<String, Vb.a> lVar2 = Vb.a.FROM_STRING;
            b.C0000b c0000b = Wb.f7675a;
            ?? B10 = l7.b.b(context, data, "mode", iVar, lVar2, lVar, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            return new Vb(listO, bVarA, c0000b);
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Vb value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.B(context, jSONObject, "actions", value.f7599a, this.f7679a.f6766h1);
            l7.b.d(context, jSONObject, "condition", value.f7600b);
            l7.b.e(context, jSONObject, "mode", value.f7601c, Vb.a.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivTriggerJsonParser.kt */
    public static final class c implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7680a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7680a = component;
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
            b9.p pVar = this.f7680a.f6777i1;
            C1094a9 c1094a9 = Wb.f7677c;
            kotlin.jvm.internal.l.d(c1094a9, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            AbstractC5371a abstractC5371aF = l7.c.f(fVarW, jSONObject, "actions", zP, null, pVar, c1094a9);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            j6.l lVar = l7.e.f43877a;
            return new Xb(abstractC5371aF, l7.c.e(fVarW, jSONObject, "condition", aVar, zP, null, aVar2, lVar), l7.c.j(fVarW, jSONObject, "mode", Wb.f7676b, zP, null, Vb.a.FROM_STRING, lVar));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Xb value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.v(context, jSONObject, "actions", value.f7754a, this.f7680a.f6777i1);
            l7.c.q(context, jSONObject, "condition", value.f7755b);
            l7.c.p(context, "mode", value.f7756c, jSONObject, Vb.a.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivTriggerJsonParser.kt */
    public static final class d implements D7.j<JSONObject, Xb, Vb> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7681a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7681a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v2, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            Xb template = (Xb) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f7681a;
            List listF = l7.d.f(context, template.f7754a, data, "actions", uc.f6789j1, uc.f6766h1, Wb.f7677c);
            kotlin.jvm.internal.l.e(listF, "resolveList(context, tem…arser, ACTIONS_VALIDATOR)");
            A7.b bVarD = l7.d.d(context, template.f7755b, data, "condition", l7.k.f43896a, l7.h.f43884e);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…_BOOLEAN, ANY_TO_BOOLEAN)");
            l7.i iVar = Wb.f7676b;
            p9.l<String, Vb.a> lVar = Vb.a.FROM_STRING;
            b.C0000b c0000b = Wb.f7675a;
            ?? L7 = l7.d.l(context, template.f7756c, data, "mode", iVar, lVar, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            return new Vb(listF, bVarD, c0000b);
        }
    }

    static {
        Vb.a value = Vb.a.ON_CONDITION;
        kotlin.jvm.internal.l.f(value, "value");
        f7675a = new b.C0000b(value);
        Object objM = C2091l.m(Vb.a.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f7678g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f7676b = new l7.i(objM, validator);
        f7677c = new C1094a9(14);
    }
}
