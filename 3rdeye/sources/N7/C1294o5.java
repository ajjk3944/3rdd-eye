package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivFunctionJsonParser.kt */
/* renamed from: N7.o5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1294o5 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final B4.f f8856a = new B4.f(17);

    /* compiled from: DivFunctionJsonParser.kt */
    /* renamed from: N7.o5$a */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8857a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8857a = component;
        }

        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            List listP = k8.F.p(context, data, "arguments", this.f8857a.f6431C3);
            kotlin.jvm.internal.l.e(listP, "readList(context, data, …ArgumentJsonEntityParser)");
            Object objOpt = data.opt("body");
            Object obj = JSONObject.NULL;
            if (objOpt == obj) {
                objOpt = null;
            }
            if (objOpt == null) {
                throw z7.e.g("body", data);
            }
            String str = (String) objOpt;
            Object objOpt2 = data.opt(AppMeasurementSdk.ConditionalUserProperty.NAME);
            Object obj2 = objOpt2 != obj ? objOpt2 : null;
            if (obj2 == null) {
                throw z7.e.g(AppMeasurementSdk.ConditionalUserProperty.NAME, data);
            }
            try {
                if (Pattern.matches("^[a-zA-Z_][a-zA-Z0-9_]*$", (String) obj2)) {
                    return new C1210i5(listP, str, (String) obj2, (EnumC1404w4) k8.F.m(data, "return_type", EnumC1404w4.FROM_STRING));
                }
                throw z7.e.e(data, AppMeasurementSdk.ConditionalUserProperty.NAME, obj2);
            } catch (ClassCastException unused) {
                throw z7.e.l(data, AppMeasurementSdk.ConditionalUserProperty.NAME, obj2);
            }
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1210i5 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.B(context, jSONObject, "arguments", value.f8399a, this.f8857a.f6431C3);
            k8.F.y(context, jSONObject, "body", value.f8400b);
            k8.F.y(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f8401c);
            k8.F.A(context, jSONObject, "return_type", value.f8402d, EnumC1404w4.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivFunctionJsonParser.kt */
    /* renamed from: N7.o5$b */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8858a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8858a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            AbstractC5371a abstractC5371aO;
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            try {
                abstractC5371aO = new AbstractC5371a.d(k8.F.p(fVarW, jSONObject, "arguments", this.f8858a.f6442D3), zP);
            } catch (z7.d e4) {
                if (e4.f48476b != z7.f.MISSING_VALUE || (abstractC5371aO = l7.c.o(zP, l7.c.n(fVarW, jSONObject, "arguments"), null)) == null) {
                    throw e4;
                }
            }
            return new C1308p5(abstractC5371aO, l7.c.a(fVarW, jSONObject, "body", zP, null), l7.c.c(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, zP, null, l7.e.f43878b, C1294o5.f8856a), l7.c.c(fVarW, jSONObject, "return_type", zP, null, EnumC1404w4.FROM_STRING, l7.e.f43877a));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1308p5 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.v(context, jSONObject, "arguments", value.f8894a, this.f8858a.f6442D3);
            l7.c.t(context, jSONObject, "body", value.f8895b);
            l7.c.t(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f8896c);
            l7.c.s(context, "return_type", value.f8897d, jSONObject, EnumC1404w4.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivFunctionJsonParser.kt */
    /* renamed from: N7.o5$c */
    public static final class c implements D7.j<JSONObject, C1308p5, C1210i5> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8859a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8859a = component;
        }

        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            List listP;
            C1308p5 template = (C1308p5) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f8859a;
            b9.p pVar = uc.f6453E3;
            AbstractC5371a<List<C1280n5>> abstractC5371a = template.f8894a;
            b9.p pVar2 = uc.f6431C3;
            if (abstractC5371a.f44399b && data.has("arguments")) {
                listP = k8.F.p(context, data, "arguments", pVar2);
            } else {
                int i = abstractC5371a.f44398a;
                if (i == 2) {
                    List list = (List) ((AbstractC5371a.d) abstractC5371a).f44403c;
                    int size = list.size();
                    ArrayList arrayList = new ArrayList(size);
                    D7.j jVar = (D7.j) pVar.getValue();
                    for (int i10 = 0; i10 < size; i10++) {
                        Object objI = l7.d.i(context, (Z6.b) list.get(i10), data, jVar);
                        if (objI != null) {
                            arrayList.add(objI);
                        }
                    }
                    listP = arrayList;
                } else {
                    if (i != 3) {
                        throw z7.e.g("arguments", data);
                    }
                    listP = k8.F.p(context, data, ((AbstractC5371a.c) abstractC5371a).f44402c, pVar2);
                }
            }
            kotlin.jvm.internal.l.e(listP, "resolveList(context, tem…ArgumentJsonEntityParser)");
            AbstractC5371a<String> abstractC5371a2 = template.f8895b;
            A8.d dVar = l7.e.f43878b;
            j6.l lVar = l7.e.f43877a;
            Object objB = l7.d.b(abstractC5371a2, data, "body", dVar, lVar);
            kotlin.jvm.internal.l.e(objB, "resolve(context, template.body, data, \"body\")");
            Object objB2 = l7.d.b(template.f8896c, data, AppMeasurementSdk.ConditionalUserProperty.NAME, dVar, C1294o5.f8856a);
            kotlin.jvm.internal.l.e(objB2, "resolve(context, templat…, \"name\", NAME_VALIDATOR)");
            Object objB3 = l7.d.b(template.f8897d, data, "return_type", EnumC1404w4.FROM_STRING, lVar);
            kotlin.jvm.internal.l.e(objB3, "resolve(context, templat…valuableType.FROM_STRING)");
            return new C1210i5(listP, (String) objB, (String) objB2, (EnumC1404w4) objB3);
        }
    }
}
