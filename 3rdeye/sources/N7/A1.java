package N7;

import A7.b;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import l7.h;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionScrollToJsonParser.kt */
/* loaded from: classes.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4753a = new b.C0000b(Boolean.TRUE);

    /* compiled from: DivActionScrollToJsonParser.kt */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f4754a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f4754a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C1443z1 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = A1.f4753a;
            j6.l lVar = l7.e.f43877a;
            ?? B10 = l7.b.b(context, data, "animated", aVar, aVar2, lVar, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            return new C1443z1(c0000b, (AbstractC1373u1) k8.F.l(context, data, "destination", this.f4754a.f6937x0), l7.b.a(context, data, FacebookMediationAdapter.KEY_ID, l7.k.f43898c, l7.e.f43878b, lVar));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1443z1 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "animated", value.f9998a);
            k8.F.z(context, jSONObject, "destination", value.f9999b, this.f4754a.f6937x0);
            l7.b.d(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f10000c);
            k8.F.y(context, jSONObject, "type", "scroll_to");
            return jSONObject;
        }
    }

    /* compiled from: DivActionScrollToJsonParser.kt */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f4755a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f4755a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final B1 d(D7.f fVar, B1 b12, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            return new B1(l7.c.j(fVarW, jSONObject, "animated", l7.k.f43896a, zP, b12 != null ? b12.f4830a : null, l7.h.f43884e, l7.e.f43877a), l7.c.b(fVarW, jSONObject, "destination", zP, b12 != null ? b12.f4831b : null, this.f4755a.f6948y0), l7.c.d(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, l7.k.f43898c, zP, b12 != null ? b12.f4832c : null));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, B1 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "animated", value.f4830a);
            l7.c.u(context, jSONObject, "destination", value.f4831b, this.f4755a.f6948y0);
            l7.c.q(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f4832c);
            k8.F.y(context, jSONObject, "type", "scroll_to");
            return jSONObject;
        }
    }

    /* compiled from: DivActionScrollToJsonParser.kt */
    public static final class c implements D7.j<JSONObject, B1, C1443z1> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f4756a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f4756a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v1, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1443z1 a(D7.f context, B1 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = A1.f4753a;
            ?? L7 = l7.d.l(context, template.f4830a, data, "animated", aVar, aVar2, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            Uc uc = this.f4756a;
            AbstractC1373u1 abstractC1373u1 = (AbstractC1373u1) l7.d.a(context, template.f4831b, data, "destination", uc.f6959z0, uc.f6937x0);
            A7.b bVarC = l7.d.c(context, template.f4832c, data, FacebookMediationAdapter.KEY_ID, l7.k.f43898c);
            kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…\"id\", TYPE_HELPER_STRING)");
            return new C1443z1(c0000b, abstractC1373u1, bVarC);
        }
    }
}
