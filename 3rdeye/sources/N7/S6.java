package N7;

import N7.R6;
import N7.U6;
import org.json.JSONObject;

/* compiled from: DivLinearGradientJsonParser.kt */
/* loaded from: classes.dex */
public final class S6 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final F3.h f6205a = new F3.h(25);

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class a implements D7.h, D7.b {
        public static JSONObject d(D7.f context, R6.a value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.e(context, jSONObject, "color", value.f6155a, l7.h.f43880a);
            l7.b.d(context, jSONObject, "position", value.f6156b);
            return jSONObject;
        }

        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            return new R6.a(l7.b.a(context, data, "color", l7.k.f43901f, l7.h.f43881b, l7.e.f43877a), l7.b.a(context, data, "position", l7.k.f43899d, l7.h.f43885f, S6.f6205a));
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (R6.a) obj);
        }
    }

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class b implements D7.h, D7.i {
        public static JSONObject d(D7.f context, U6.a value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.p(context, "color", value.f6393a, jSONObject, l7.h.f43880a);
            l7.c.q(context, jSONObject, "position", value.f6394b);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (U6.a) obj);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            return new U6.a(l7.c.e(fVarW, jSONObject, "color", l7.k.f43901f, zP, null, l7.h.f43881b, l7.e.f43877a), l7.c.e(fVarW, jSONObject, "position", l7.k.f43899d, zP, null, l7.h.f43885f, S6.f6205a));
        }
    }

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class c implements D7.j<JSONObject, U6.a, R6.a> {
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            U6.a template = (U6.a) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarD = l7.d.d(context, template.f6393a, data, "color", l7.k.f43901f, l7.h.f43881b);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
            A7.b bVarE = l7.d.e(context, template.f6394b, data, "position", l7.k.f43899d, l7.h.f43885f, S6.f6205a);
            kotlin.jvm.internal.l.e(bVarE, "resolveExpression(contex…UBLE, POSITION_VALIDATOR)");
            return new R6.a(bVarD, bVarE);
        }
    }
}
