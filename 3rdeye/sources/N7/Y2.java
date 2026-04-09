package N7;

import A7.b;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivBorderJsonParser.kt */
/* loaded from: classes.dex */
public final class Y2 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7763a = new b.C0000b(Boolean.FALSE);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final F3.h f7764b = new F3.h(10);

    /* compiled from: DivBorderJsonParser.kt */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7765a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7765a = component;
        }

        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarB = l7.b.b(context, data, "corner_radius", l7.k.f43897b, l7.h.f43886g, Y2.f7764b, null);
            Uc uc = this.f7765a;
            E3 e32 = (E3) k8.F.q(context, data, "corners_radius", uc.f6853p2);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = Y2.f7763a;
            A7.b bVarB2 = l7.b.b(context, data, "has_shadow", aVar, aVar2, l7.e.f43877a, c0000b);
            if (bVarB2 == null) {
                bVarB2 = c0000b;
            }
            return new X2(bVarB, e32, bVarB2, (C1298o9) k8.F.q(context, data, "shadow", uc.f6508J6), (C1185ga) k8.F.q(context, data, "stroke", uc.f6435C7));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, X2 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "corner_radius", value.f7687a);
            Uc uc = this.f7765a;
            k8.F.z(context, jSONObject, "corners_radius", value.f7688b, uc.f6853p2);
            l7.b.d(context, jSONObject, "has_shadow", value.f7689c);
            k8.F.z(context, jSONObject, "shadow", value.f7690d, uc.f6508J6);
            k8.F.z(context, jSONObject, "stroke", value.f7691e, uc.f6435C7);
            return jSONObject;
        }
    }

    /* compiled from: DivBorderJsonParser.kt */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7766a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7766a = component;
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
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "corner_radius", l7.k.f43897b, zP, null, l7.h.f43886g, Y2.f7764b);
            Uc uc = this.f7766a;
            return new Z2(abstractC5371aJ, l7.c.h(fVarW, jSONObject, "corners_radius", zP, null, uc.f6864q2), l7.c.j(fVarW, jSONObject, "has_shadow", l7.k.f43896a, zP, null, l7.h.f43884e, l7.e.f43877a), l7.c.h(fVarW, jSONObject, "shadow", zP, null, uc.f6519K6), l7.c.h(fVarW, jSONObject, "stroke", zP, null, uc.f6446D7));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, Z2 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "corner_radius", value.f7831a);
            Uc uc = this.f7766a;
            l7.c.u(context, jSONObject, "corners_radius", value.f7832b, uc.f6864q2);
            l7.c.q(context, jSONObject, "has_shadow", value.f7833c);
            l7.c.u(context, jSONObject, "shadow", value.f7834d, uc.f6519K6);
            l7.c.u(context, jSONObject, "stroke", value.f7835e, uc.f6446D7);
            return jSONObject;
        }
    }

    /* compiled from: DivBorderJsonParser.kt */
    public static final class c implements D7.j<JSONObject, Z2, X2> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f7767a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f7767a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v3, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            Z2 template = (Z2) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarM = l7.d.m(context, template.f7831a, data, "corner_radius", l7.k.f43897b, l7.h.f43886g, Y2.f7764b);
            Uc uc = this.f7767a;
            E3 e32 = (E3) l7.d.h(context, template.f7832b, data, "corners_radius", uc.f6875r2, uc.f6853p2);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = Y2.f7763a;
            ?? L7 = l7.d.l(context, template.f7833c, data, "has_shadow", aVar, aVar2, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            return new X2(bVarM, e32, c0000b, (C1298o9) l7.d.h(context, template.f7834d, data, "shadow", uc.f6530L6, uc.f6508J6), (C1185ga) l7.d.h(context, template.f7835e, data, "stroke", uc.f6457E7, uc.f6435C7));
        }
    }
}
