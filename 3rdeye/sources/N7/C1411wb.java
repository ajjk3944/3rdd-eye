package N7;

import A7.b;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivTimerJsonParser.kt */
/* renamed from: N7.wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1411wb {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9731a = new b.C0000b(0L);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final B8 f9732b = new B8(14);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final C1154e9 f9733c = new C1154e9(12);

    /* compiled from: DivTimerJsonParser.kt */
    /* renamed from: N7.wb$a */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9734a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9734a = component;
        }

        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            B8 b82 = C1411wb.f9732b;
            b.C0000b c0000b = C1411wb.f9731a;
            A7.b bVarB = l7.b.b(context, data, "duration", eVar, eVar2, b82, c0000b);
            if (bVarB == null) {
                bVarB = c0000b;
            }
            Uc uc = this.f9734a;
            List listS = k8.F.s(context, data, "end_actions", uc.f6766h1);
            Object objOpt = data.opt(FacebookMediationAdapter.KEY_ID);
            if (objOpt == JSONObject.NULL) {
                objOpt = null;
            }
            if (objOpt == null) {
                throw z7.e.g(FacebookMediationAdapter.KEY_ID, data);
            }
            return new C1397vb(bVarB, listS, (String) objOpt, k8.F.s(context, data, "tick_actions", uc.f6766h1), l7.b.b(context, data, "tick_interval", eVar, eVar2, C1411wb.f9733c, null), (String) k8.F.r(context, data, "value_variable", l7.e.f43878b, l7.e.f43877a));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1397vb value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "duration", value.f9639a);
            Uc uc = this.f9734a;
            k8.F.B(context, jSONObject, "end_actions", value.f9640b, uc.f6766h1);
            k8.F.y(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f9641c);
            k8.F.B(context, jSONObject, "tick_actions", value.f9642d, uc.f6766h1);
            l7.b.d(context, jSONObject, "tick_interval", value.f9643e);
            k8.F.y(context, jSONObject, "value_variable", value.f9644f);
            return jSONObject;
        }
    }

    /* compiled from: DivTimerJsonParser.kt */
    /* renamed from: N7.wb$b */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9735a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9735a = component;
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
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "duration", eVar, zP, null, eVar2, C1411wb.f9732b);
            Uc uc = this.f9735a;
            return new C1425xb(abstractC5371aJ, l7.c.k(fVarW, jSONObject, "end_actions", zP, null, uc.f6777i1), l7.c.a(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, zP, null), l7.c.k(fVarW, jSONObject, "tick_actions", zP, null, uc.f6777i1), l7.c.j(fVarW, jSONObject, "tick_interval", eVar, zP, null, eVar2, C1411wb.f9733c), l7.c.i(fVarW, jSONObject, "value_variable", zP, null, l7.e.f43878b));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1425xb value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "duration", value.f9793a);
            Uc uc = this.f9735a;
            l7.c.v(context, jSONObject, "end_actions", value.f9794b, uc.f6777i1);
            l7.c.t(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f9795c);
            l7.c.v(context, jSONObject, "tick_actions", value.f9796d, uc.f6777i1);
            l7.c.q(context, jSONObject, "tick_interval", value.f9797e);
            l7.c.t(context, jSONObject, "value_variable", value.f9798f);
            return jSONObject;
        }
    }

    /* compiled from: DivTimerJsonParser.kt */
    /* renamed from: N7.wb$c */
    public static final class c implements D7.j<JSONObject, C1425xb, C1397vb> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9736a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9736a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1425xb template = (C1425xb) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            B8 b82 = C1411wb.f9732b;
            b.C0000b c0000b = C1411wb.f9731a;
            ?? N8 = l7.d.n(context, template.f9793a, data, "duration", eVar, eVar2, b82, c0000b);
            if (N8 != 0) {
                c0000b = N8;
            }
            Uc uc = this.f9736a;
            b9.p pVar = uc.f6789j1;
            AbstractC5371a<List<C1132d2>> abstractC5371a = template.f9794b;
            b9.p pVar2 = uc.f6766h1;
            List listQ = l7.d.q(context, abstractC5371a, data, "end_actions", pVar, pVar2);
            AbstractC5371a<String> abstractC5371a2 = template.f9795c;
            A8.d dVar = l7.e.f43878b;
            Object objB = l7.d.b(abstractC5371a2, data, FacebookMediationAdapter.KEY_ID, dVar, l7.e.f43877a);
            kotlin.jvm.internal.l.e(objB, "resolve(context, template.id, data, \"id\")");
            return new C1397vb(c0000b, listQ, (String) objB, l7.d.q(context, template.f9796d, data, "tick_actions", uc.f6789j1, pVar2), l7.d.m(context, template.f9797e, data, "tick_interval", eVar, eVar2, C1411wb.f9733c), (String) l7.d.g(context, "value_variable", template.f9798f, data, dVar));
        }
    }
}
