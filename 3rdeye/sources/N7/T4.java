package N7;

import A7.b;
import N7.V4;
import java.util.List;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivFixedLengthInputMaskJsonParser.kt */
/* loaded from: classes.dex */
public final class T4 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f6260a = new b.C0000b(Boolean.FALSE);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final B4.f f6261b = new B4.f(16);

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6262a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6262a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final S4 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = T4.f6260a;
            j6.l lVar = l7.e.f43877a;
            ?? B10 = l7.b.b(context, data, "always_visible", aVar, aVar2, lVar, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            A7.b bVarA = l7.b.a(context, data, "pattern", l7.k.f43898c, l7.e.f43878b, lVar);
            List listO = k8.F.o(context, data, "pattern_elements", this.f6262a.f6865q3, T4.f6261b);
            kotlin.jvm.internal.l.e(listO, "readList(context, data, …TTERN_ELEMENTS_VALIDATOR)");
            Object objOpt = data.opt("raw_text_variable");
            if (objOpt == JSONObject.NULL) {
                objOpt = null;
            }
            if (objOpt != null) {
                return new S4(c0000b, bVarA, listO, (String) objOpt);
            }
            throw z7.e.g("raw_text_variable", data);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, S4 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "always_visible", value.f6196a);
            l7.b.d(context, jSONObject, "pattern", value.f6197b);
            k8.F.B(context, jSONObject, "pattern_elements", value.f6198c, this.f6262a.f6865q3);
            k8.F.y(context, jSONObject, "raw_text_variable", value.f6199d);
            k8.F.y(context, jSONObject, "type", "fixed_length");
            return jSONObject;
        }
    }

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6263a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6263a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final V4 d(D7.f fVar, V4 v42, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "always_visible", l7.k.f43896a, zP, v42 != null ? v42.f7564a : null, l7.h.f43884e, l7.e.f43877a);
            AbstractC5371a abstractC5371aD = l7.c.d(fVarW, jSONObject, "pattern", l7.k.f43898c, zP, v42 != null ? v42.f7565b : null);
            AbstractC5371a<List<V4.a>> abstractC5371a = v42 != null ? v42.f7566c : null;
            b9.p pVar = this.f6263a.f6876r3;
            B4.f fVar2 = T4.f6261b;
            kotlin.jvm.internal.l.d(fVar2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new V4(abstractC5371aJ, abstractC5371aD, l7.c.f(fVarW, jSONObject, "pattern_elements", zP, abstractC5371a, pVar, fVar2), l7.c.a(fVarW, jSONObject, "raw_text_variable", zP, v42 != null ? v42.f7567d : null));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, V4 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "always_visible", value.f7564a);
            l7.c.q(context, jSONObject, "pattern", value.f7565b);
            l7.c.v(context, jSONObject, "pattern_elements", value.f7566c, this.f6263a.f6876r3);
            l7.c.t(context, jSONObject, "raw_text_variable", value.f7567d);
            k8.F.y(context, jSONObject, "type", "fixed_length");
            return jSONObject;
        }
    }

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class c implements D7.j<JSONObject, V4, S4> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f6264a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f6264a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final S4 a(D7.f context, V4 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = T4.f6260a;
            ?? L7 = l7.d.l(context, template.f7564a, data, "always_visible", aVar, aVar2, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            A7.b bVarC = l7.d.c(context, template.f7565b, data, "pattern", l7.k.f43898c);
            kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…ern\", TYPE_HELPER_STRING)");
            Uc uc = this.f6264a;
            List listF = l7.d.f(context, template.f7566c, data, "pattern_elements", uc.f6886s3, uc.f6865q3, T4.f6261b);
            kotlin.jvm.internal.l.e(listF, "resolveList(context, tem…TTERN_ELEMENTS_VALIDATOR)");
            Object objB = l7.d.b(template.f7567d, data, "raw_text_variable", l7.e.f43878b, l7.e.f43877a);
            kotlin.jvm.internal.l.e(objB, "resolve(context, templat…ata, \"raw_text_variable\")");
            return new S4(c0000b2, bVarC, listF, (String) objB);
        }
    }
}
