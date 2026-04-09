package N7;

import A7.b;
import N7.Ab;
import N7.C1439yb;
import c9.C2091l;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivTooltipJsonParser.kt */
/* renamed from: N7.zb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1453zb {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f10121a = new b.C0000b(Boolean.TRUE);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f10122b = new b.C0000b(5000L);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Ab.a f10123c = new Ab.a(new Eb());

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final l7.i f10124d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final G8 f10125e;

    /* compiled from: DivTooltipJsonParser.kt */
    /* renamed from: N7.zb$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f10126g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof C1439yb.a);
        }
    }

    /* compiled from: DivTooltipJsonParser.kt */
    /* renamed from: N7.zb$b */
    public static final class b implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f10127a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f10127a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v8, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f10127a;
            C1332r2 c1332r2 = (C1332r2) k8.F.q(context, data, "animation_in", uc.f6831n1);
            C1332r2 c1332r22 = (C1332r2) k8.F.q(context, data, "animation_out", uc.f6831n1);
            k.g gVar = l7.k.f43898c;
            A8.d dVar = l7.e.f43878b;
            j6.l lVar = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "background_accessibility_description", gVar, dVar, lVar, null);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1453zb.f10121a;
            ?? B10 = l7.b.b(context, data, "close_by_tap_outside", aVar, aVar2, lVar, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            Z z10 = (Z) k8.F.l(context, data, "div", uc.f6935w9);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            G8 g82 = C1453zb.f10125e;
            b.C0000b c0000b3 = C1453zb.f10122b;
            ?? B11 = l7.b.b(context, data, "duration", eVar, eVar2, g82, c0000b3);
            if (B11 != 0) {
                c0000b3 = B11;
            }
            Object objOpt = data.opt(FacebookMediationAdapter.KEY_ID);
            if (objOpt == JSONObject.NULL) {
                objOpt = null;
            }
            if (objOpt == null) {
                throw z7.e.g(FacebookMediationAdapter.KEY_ID, data);
            }
            String str = (String) objOpt;
            Ab ab = (Ab) k8.F.q(context, data, "mode", uc.f6541M8);
            if (ab == null) {
                ab = C1453zb.f10123c;
            }
            kotlin.jvm.internal.l.e(ab, "JsonPropertyParser.readO…er) ?: MODE_DEFAULT_VALUE");
            return new C1439yb(c1332r2, c1332r22, bVarB, c0000b2, z10, c0000b3, str, ab, (C1325q8) k8.F.q(context, data, "offset", uc.f6612T5), l7.b.a(context, data, "position", C1453zb.f10124d, C1439yb.a.FROM_STRING, lVar), k8.F.s(context, data, "tap_outside_actions", uc.f6766h1));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1439yb value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f10127a;
            k8.F.z(context, jSONObject, "animation_in", value.f9975a, uc.f6831n1);
            k8.F.z(context, jSONObject, "animation_out", value.f9976b, uc.f6831n1);
            l7.b.d(context, jSONObject, "background_accessibility_description", value.f9977c);
            l7.b.d(context, jSONObject, "close_by_tap_outside", value.f9978d);
            k8.F.z(context, jSONObject, "div", value.f9979e, uc.f6935w9);
            l7.b.d(context, jSONObject, "duration", value.f9980f);
            k8.F.y(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f9981g);
            k8.F.z(context, jSONObject, "mode", value.f9982h, uc.f6541M8);
            k8.F.z(context, jSONObject, "offset", value.i, uc.f6612T5);
            l7.b.e(context, jSONObject, "position", value.f9983j, C1439yb.a.TO_STRING);
            k8.F.B(context, jSONObject, "tap_outside_actions", value.f9984k, uc.f6766h1);
            return jSONObject;
        }
    }

    /* compiled from: DivTooltipJsonParser.kt */
    /* renamed from: N7.zb$c */
    public static final class c implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f10128a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f10128a = component;
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
            Uc uc = this.f10128a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "animation_in", zP, null, uc.f6841o1);
            AbstractC5371a abstractC5371aH2 = l7.c.h(fVarW, jSONObject, "animation_out", zP, null, uc.f6841o1);
            k.g gVar = l7.k.f43898c;
            A8.d dVar = l7.e.f43878b;
            j6.l lVar = l7.e.f43877a;
            return new Pb(abstractC5371aH, abstractC5371aH2, l7.c.j(fVarW, jSONObject, "background_accessibility_description", gVar, zP, null, dVar, lVar), l7.c.j(fVarW, jSONObject, "close_by_tap_outside", l7.k.f43896a, zP, null, l7.h.f43884e, lVar), l7.c.b(fVarW, jSONObject, "div", zP, null, uc.f6946x9), l7.c.j(fVarW, jSONObject, "duration", l7.k.f43897b, zP, null, l7.h.f43886g, C1453zb.f10125e), l7.c.a(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, zP, null), l7.c.h(fVarW, jSONObject, "mode", zP, null, uc.N8), l7.c.h(fVarW, jSONObject, "offset", zP, null, uc.f6623U5), l7.c.e(fVarW, jSONObject, "position", C1453zb.f10124d, zP, null, C1439yb.a.FROM_STRING, lVar), l7.c.k(fVarW, jSONObject, "tap_outside_actions", zP, null, uc.f6777i1));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Pb value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f10128a;
            l7.c.u(context, jSONObject, "animation_in", value.f6020a, uc.f6841o1);
            l7.c.u(context, jSONObject, "animation_out", value.f6021b, uc.f6841o1);
            l7.c.q(context, jSONObject, "background_accessibility_description", value.f6022c);
            l7.c.q(context, jSONObject, "close_by_tap_outside", value.f6023d);
            l7.c.u(context, jSONObject, "div", value.f6024e, uc.f6946x9);
            l7.c.q(context, jSONObject, "duration", value.f6025f);
            l7.c.t(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f6026g);
            l7.c.u(context, jSONObject, "mode", value.f6027h, uc.N8);
            l7.c.u(context, jSONObject, "offset", value.i, uc.f6623U5);
            l7.c.p(context, "position", value.f6028j, jSONObject, C1439yb.a.TO_STRING);
            l7.c.v(context, jSONObject, "tap_outside_actions", value.f6029k, uc.f6777i1);
            return jSONObject;
        }
    }

    /* compiled from: DivTooltipJsonParser.kt */
    /* renamed from: N7.zb$d */
    public static final class d implements D7.j<JSONObject, Pb, C1439yb> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f10129a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f10129a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v13, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v9, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            Pb template = (Pb) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f10129a;
            b9.p pVar = uc.f6852p1;
            AbstractC5371a<C1388v2> abstractC5371a = template.f6020a;
            b9.p pVar2 = uc.f6831n1;
            C1332r2 c1332r2 = (C1332r2) l7.d.h(context, abstractC5371a, data, "animation_in", pVar, pVar2);
            C1332r2 c1332r22 = (C1332r2) l7.d.h(context, template.f6021b, data, "animation_out", uc.f6852p1, pVar2);
            A7.b bVarJ = l7.d.j(context, template.f6022c, data, "background_accessibility_description", l7.k.f43898c);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1453zb.f10121a;
            ?? L7 = l7.d.l(context, template.f6023d, data, "close_by_tap_outside", aVar, aVar2, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            Z z10 = (Z) l7.d.a(context, template.f6024e, data, "div", uc.f6957y9, uc.f6935w9);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            G8 g82 = C1453zb.f10125e;
            b.C0000b c0000b3 = C1453zb.f10122b;
            ?? N8 = l7.d.n(context, template.f6025f, data, "duration", eVar, eVar2, g82, c0000b3);
            if (N8 != 0) {
                c0000b3 = N8;
            }
            Object objB = l7.d.b(template.f6026g, data, FacebookMediationAdapter.KEY_ID, l7.e.f43878b, l7.e.f43877a);
            kotlin.jvm.internal.l.e(objB, "resolve(context, template.id, data, \"id\")");
            String str = (String) objB;
            Ab ab = (Ab) l7.d.h(context, template.f6027h, data, "mode", uc.f6561O8, uc.f6541M8);
            if (ab == null) {
                ab = C1453zb.f10123c;
            }
            Ab ab2 = ab;
            kotlin.jvm.internal.l.e(ab2, "JsonFieldResolver.resolv…er) ?: MODE_DEFAULT_VALUE");
            C1325q8 c1325q8 = (C1325q8) l7.d.h(context, template.i, data, "offset", uc.f6633V5, uc.f6612T5);
            A7.b bVarD = l7.d.d(context, template.f6028j, data, "position", C1453zb.f10124d, C1439yb.a.FROM_STRING);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…tip.Position.FROM_STRING)");
            return new C1439yb(c1332r2, c1332r22, bVarJ, c0000b2, z10, c0000b3, str, ab2, c1325q8, bVarD, l7.d.q(context, template.f6029k, data, "tap_outside_actions", uc.f6789j1, uc.f6766h1));
        }
    }

    static {
        Object objM = C2091l.m(C1439yb.a.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f10126g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f10124d = new l7.i(objM, validator);
        f10125e = new G8(14);
    }
}
