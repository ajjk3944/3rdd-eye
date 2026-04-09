package N7;

import A7.b;
import com.google.android.gms.common.internal.ImagesContract;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivVisibilityActionJsonParser.kt */
/* renamed from: N7.uc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1384uc {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9534a = b.a.a(Boolean.TRUE);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9535b = b.a.a(1L);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9536c = b.a.a(800L);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9537d = b.a.a(50L);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final C1154e9 f9538e = new C1154e9(14);

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final G8 f9539f = new G8(16);

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final C1094a9 f9540g = new C1094a9(16);

    /* compiled from: DivVisibilityActionJsonParser.kt */
    /* renamed from: N7.uc$a */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9541a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9541a = component;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        @Override // D7.b
        public final java.lang.Object a(D7.f r21, org.json.JSONObject r22) {
            /*
                Method dump skipped, instructions count: 210
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N7.C1384uc.a.a(D7.f, org.json.JSONObject):java.lang.Object");
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1370tc value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f9541a;
            k8.F.z(context, jSONObject, "download_callbacks", value.f9339a, uc.f6566P2);
            l7.b.d(context, jSONObject, "is_enabled", value.f9340b);
            l7.b.d(context, jSONObject, "log_id", value.f9341c);
            l7.b.d(context, jSONObject, "log_limit", value.f9342d);
            k8.F.y(context, jSONObject, "payload", value.f9343e);
            h.g gVar = l7.h.f43882c;
            l7.b.e(context, jSONObject, "referer", value.f9344f, gVar);
            k8.F.y(context, jSONObject, "scope_id", value.f9345g);
            k8.F.z(context, jSONObject, "typed", value.f9346h, uc.f6695b1);
            l7.b.e(context, jSONObject, ImagesContract.URL, value.i, gVar);
            l7.b.d(context, jSONObject, "visibility_duration", value.f9347j);
            l7.b.d(context, jSONObject, "visibility_percentage", value.f9348k);
            return jSONObject;
        }
    }

    /* compiled from: DivVisibilityActionJsonParser.kt */
    /* renamed from: N7.uc$b */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9542a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9542a = component;
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
            Uc uc = this.f9542a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "download_callbacks", zP, null, uc.f6577Q2);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            j6.l lVar = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "is_enabled", aVar, zP, null, aVar2, lVar);
            AbstractC5371a abstractC5371aD = l7.c.d(fVarW, jSONObject, "log_id", l7.k.f43898c, zP, null);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "log_limit", eVar, zP, null, eVar2, C1384uc.f9538e);
            A8.d dVar = l7.e.f43878b;
            AbstractC5371a abstractC5371aI = l7.c.i(fVarW, jSONObject, "payload", zP, null, dVar);
            k.h hVar = l7.k.f43900e;
            h.b bVar = l7.h.f43883d;
            return new C1398vc(abstractC5371aH, abstractC5371aJ, abstractC5371aD, abstractC5371aJ2, abstractC5371aI, l7.c.j(fVarW, jSONObject, "referer", hVar, zP, null, bVar, lVar), l7.c.i(fVarW, jSONObject, "scope_id", zP, null, dVar), l7.c.h(fVarW, jSONObject, "typed", zP, null, uc.f6707c1), l7.c.j(fVarW, jSONObject, ImagesContract.URL, hVar, zP, null, bVar, lVar), l7.c.j(fVarW, jSONObject, "visibility_duration", eVar, zP, null, eVar2, C1384uc.f9539f), l7.c.j(fVarW, jSONObject, "visibility_percentage", eVar, zP, null, eVar2, C1384uc.f9540g));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1398vc value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f9542a;
            l7.c.u(context, jSONObject, "download_callbacks", value.f9645a, uc.f6577Q2);
            l7.c.q(context, jSONObject, "is_enabled", value.f9646b);
            l7.c.q(context, jSONObject, "log_id", value.f9647c);
            l7.c.q(context, jSONObject, "log_limit", value.f9648d);
            l7.c.t(context, jSONObject, "payload", value.f9649e);
            h.g gVar = l7.h.f43882c;
            l7.c.p(context, "referer", value.f9650f, jSONObject, gVar);
            l7.c.t(context, jSONObject, "scope_id", value.f9651g);
            l7.c.u(context, jSONObject, "typed", value.f9652h, uc.f6707c1);
            l7.c.p(context, ImagesContract.URL, value.i, jSONObject, gVar);
            l7.c.q(context, jSONObject, "visibility_duration", value.f9653j);
            l7.c.q(context, jSONObject, "visibility_percentage", value.f9654k);
            return jSONObject;
        }
    }

    /* compiled from: DivVisibilityActionJsonParser.kt */
    /* renamed from: N7.uc$c */
    public static final class c implements D7.j<JSONObject, C1398vc, C1370tc> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9543a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9543a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v10, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v20, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v6, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1398vc template = (C1398vc) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f9543a;
            C1223j4 c1223j4 = (C1223j4) l7.d.h(context, template.f9645a, data, "download_callbacks", uc.f6587R2, uc.f6566P2);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1384uc.f9534a;
            ?? L7 = l7.d.l(context, template.f9646b, data, "is_enabled", aVar, aVar2, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            A7.b bVarC = l7.d.c(context, template.f9647c, data, "log_id", l7.k.f43898c);
            kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…_id\", TYPE_HELPER_STRING)");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            C1154e9 c1154e9 = C1384uc.f9538e;
            b.C0000b c0000b3 = C1384uc.f9535b;
            ?? N8 = l7.d.n(context, template.f9648d, data, "log_limit", eVar, eVar2, c1154e9, c0000b3);
            b.C0000b c0000b4 = N8 == 0 ? c0000b3 : N8;
            AbstractC5371a<JSONObject> abstractC5371a = template.f9649e;
            A8.d dVar = l7.e.f43878b;
            JSONObject jSONObject = (JSONObject) l7.d.g(context, "payload", abstractC5371a, data, dVar);
            k.h hVar = l7.k.f43900e;
            h.b bVar2 = l7.h.f43883d;
            A7.b bVarK = l7.d.k(context, template.f9650f, data, "referer", hVar, bVar2);
            String str = (String) l7.d.g(context, "scope_id", template.f9651g, data, dVar);
            AbstractC1192h2 abstractC1192h2 = (AbstractC1192h2) l7.d.h(context, template.f9652h, data, "typed", uc.f6719d1, uc.f6695b1);
            A7.b bVarK2 = l7.d.k(context, template.i, data, ImagesContract.URL, hVar, bVar2);
            G8 g82 = C1384uc.f9539f;
            b.C0000b c0000b5 = C1384uc.f9536c;
            ?? N10 = l7.d.n(context, template.f9653j, data, "visibility_duration", eVar, eVar2, g82, c0000b5);
            b.C0000b c0000b6 = N10 == 0 ? c0000b5 : N10;
            C1094a9 c1094a9 = C1384uc.f9540g;
            b.C0000b c0000b7 = C1384uc.f9537d;
            ?? N11 = l7.d.n(context, template.f9654k, data, "visibility_percentage", eVar, eVar2, c1094a9, c0000b7);
            return new C1370tc(c0000b2, bVarC, c0000b4, bVarK, bVarK2, c0000b6, N11 == 0 ? c0000b7 : N11, abstractC1192h2, c1223j4, str, jSONObject);
        }
    }
}
