package N7;

import A7.b;
import com.google.android.gms.common.internal.ImagesContract;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivDisappearActionJsonParser.kt */
/* renamed from: N7.h4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1194h4 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8340a = b.a.a(800L);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8341b = b.a.a(Boolean.TRUE);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8342c = b.a.a(1L);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8343d = b.a.a(0L);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final B4.f f8344e = new B4.f(14);

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final B4.g f8345f = new B4.g(15);

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final B4.h f8346g = new B4.h(14);

    /* compiled from: DivDisappearActionJsonParser.kt */
    /* renamed from: N7.h4$a */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8347a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8347a = component;
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
        public final java.lang.Object a(D7.f r22, org.json.JSONObject r23) {
            /*
                Method dump skipped, instructions count: 213
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N7.C1194h4.a.a(D7.f, org.json.JSONObject):java.lang.Object");
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1179g4 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "disappear_duration", value.f8275a);
            Uc uc = this.f8347a;
            k8.F.z(context, jSONObject, "download_callbacks", value.f8276b, uc.f6566P2);
            l7.b.d(context, jSONObject, "is_enabled", value.f8277c);
            l7.b.d(context, jSONObject, "log_id", value.f8278d);
            l7.b.d(context, jSONObject, "log_limit", value.f8279e);
            k8.F.y(context, jSONObject, "payload", value.f8280f);
            h.g gVar = l7.h.f43882c;
            l7.b.e(context, jSONObject, "referer", value.f8281g, gVar);
            k8.F.y(context, jSONObject, "scope_id", value.f8282h);
            k8.F.z(context, jSONObject, "typed", value.i, uc.f6695b1);
            l7.b.e(context, jSONObject, ImagesContract.URL, value.f8283j, gVar);
            l7.b.d(context, jSONObject, "visibility_percentage", value.f8284k);
            return jSONObject;
        }
    }

    /* compiled from: DivDisappearActionJsonParser.kt */
    /* renamed from: N7.h4$b */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8348a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8348a = component;
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
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "disappear_duration", eVar, zP, null, eVar2, C1194h4.f8344e);
            Uc uc = this.f8348a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "download_callbacks", zP, null, uc.f6577Q2);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            j6.l lVar = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "is_enabled", aVar, zP, null, aVar2, lVar);
            AbstractC5371a abstractC5371aD = l7.c.d(fVarW, jSONObject, "log_id", l7.k.f43898c, zP, null);
            AbstractC5371a abstractC5371aJ3 = l7.c.j(fVarW, jSONObject, "log_limit", eVar, zP, null, eVar2, C1194h4.f8345f);
            A8.d dVar = l7.e.f43878b;
            AbstractC5371a abstractC5371aI = l7.c.i(fVarW, jSONObject, "payload", zP, null, dVar);
            k.h hVar = l7.k.f43900e;
            h.b bVar = l7.h.f43883d;
            return new C1209i4(abstractC5371aJ, abstractC5371aH, abstractC5371aJ2, abstractC5371aD, abstractC5371aJ3, abstractC5371aI, l7.c.j(fVarW, jSONObject, "referer", hVar, zP, null, bVar, lVar), l7.c.i(fVarW, jSONObject, "scope_id", zP, null, dVar), l7.c.h(fVarW, jSONObject, "typed", zP, null, uc.f6707c1), l7.c.j(fVarW, jSONObject, ImagesContract.URL, hVar, zP, null, bVar, lVar), l7.c.j(fVarW, jSONObject, "visibility_percentage", eVar, zP, null, eVar2, C1194h4.f8346g));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1209i4 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "disappear_duration", value.f8389a);
            Uc uc = this.f8348a;
            l7.c.u(context, jSONObject, "download_callbacks", value.f8390b, uc.f6577Q2);
            l7.c.q(context, jSONObject, "is_enabled", value.f8391c);
            l7.c.q(context, jSONObject, "log_id", value.f8392d);
            l7.c.q(context, jSONObject, "log_limit", value.f8393e);
            l7.c.t(context, jSONObject, "payload", value.f8394f);
            h.g gVar = l7.h.f43882c;
            l7.c.p(context, "referer", value.f8395g, jSONObject, gVar);
            l7.c.t(context, jSONObject, "scope_id", value.f8396h);
            l7.c.u(context, jSONObject, "typed", value.i, uc.f6707c1);
            l7.c.p(context, ImagesContract.URL, value.f8397j, jSONObject, gVar);
            l7.c.q(context, jSONObject, "visibility_percentage", value.f8398k);
            return jSONObject;
        }
    }

    /* compiled from: DivDisappearActionJsonParser.kt */
    /* renamed from: N7.h4$c */
    public static final class c implements D7.j<JSONObject, C1209i4, C1179g4> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8349a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8349a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v12, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v4, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v8, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1209i4 template = (C1209i4) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            B4.f fVar = C1194h4.f8344e;
            b.C0000b c0000b = C1194h4.f8340a;
            ?? N8 = l7.d.n(context, template.f8389a, data, "disappear_duration", eVar, eVar2, fVar, c0000b);
            b.C0000b c0000b2 = N8 == 0 ? c0000b : N8;
            Uc uc = this.f8349a;
            C1223j4 c1223j4 = (C1223j4) l7.d.h(context, template.f8390b, data, "download_callbacks", uc.f6587R2, uc.f6566P2);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b3 = C1194h4.f8341b;
            ?? L7 = l7.d.l(context, template.f8391c, data, "is_enabled", aVar, aVar2, c0000b3);
            b.C0000b c0000b4 = L7 == 0 ? c0000b3 : L7;
            A7.b bVarC = l7.d.c(context, template.f8392d, data, "log_id", l7.k.f43898c);
            kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…_id\", TYPE_HELPER_STRING)");
            B4.g gVar = C1194h4.f8345f;
            b.C0000b c0000b5 = C1194h4.f8342c;
            ?? N10 = l7.d.n(context, template.f8393e, data, "log_limit", eVar, eVar2, gVar, c0000b5);
            b.C0000b c0000b6 = N10 == 0 ? c0000b5 : N10;
            AbstractC5371a<JSONObject> abstractC5371a = template.f8394f;
            A8.d dVar = l7.e.f43878b;
            JSONObject jSONObject = (JSONObject) l7.d.g(context, "payload", abstractC5371a, data, dVar);
            k.h hVar = l7.k.f43900e;
            h.b bVar2 = l7.h.f43883d;
            A7.b bVarK = l7.d.k(context, template.f8395g, data, "referer", hVar, bVar2);
            String str = (String) l7.d.g(context, "scope_id", template.f8396h, data, dVar);
            AbstractC1192h2 abstractC1192h2 = (AbstractC1192h2) l7.d.h(context, template.i, data, "typed", uc.f6719d1, uc.f6695b1);
            A7.b bVarK2 = l7.d.k(context, template.f8397j, data, ImagesContract.URL, hVar, bVar2);
            B4.h hVar2 = C1194h4.f8346g;
            b.C0000b c0000b7 = C1194h4.f8343d;
            ?? N11 = l7.d.n(context, template.f8398k, data, "visibility_percentage", eVar, eVar2, hVar2, c0000b7);
            return new C1179g4(c0000b2, c0000b4, bVarC, c0000b6, bVarK, bVarK2, N11 == 0 ? c0000b7 : N11, abstractC1192h2, c1223j4, str, jSONObject);
        }
    }
}
