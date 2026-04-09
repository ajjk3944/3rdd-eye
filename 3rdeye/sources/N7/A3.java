package N7;

import A7.b;
import N7.B3;
import N7.C1431y3;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivContainerJsonParser.kt */
/* loaded from: classes.dex */
public final class A3 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4758a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4759b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f4760c;

    /* compiled from: DivContainerJsonParser.kt */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f4761a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f4761a = component;
        }

        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f4761a;
            C1362t4 c1362t4 = (C1362t4) k8.F.q(context, data, "margins", uc.f6630V2);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = A3.f4758a;
            j6.l lVar = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "show_at_end", aVar, aVar2, lVar, c0000b);
            if (bVarB == null) {
                bVarB = c0000b;
            }
            b.C0000b c0000b2 = A3.f4759b;
            A7.b bVarB2 = l7.b.b(context, data, "show_at_start", aVar, aVar2, lVar, c0000b2);
            if (bVarB2 == null) {
                bVarB2 = c0000b2;
            }
            b.C0000b c0000b3 = A3.f4760c;
            A7.b bVarB3 = l7.b.b(context, data, "show_between", aVar, aVar2, lVar, c0000b3);
            if (bVarB3 == null) {
                bVarB3 = c0000b3;
            }
            return new C1431y3.c(c1362t4, bVarB, bVarB2, bVarB3, (AbstractC1293o4) k8.F.l(context, data, "style", uc.f6598S2));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1431y3.c value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f4761a;
            k8.F.z(context, jSONObject, "margins", value.f9881a, uc.f6630V2);
            l7.b.d(context, jSONObject, "show_at_end", value.f9882b);
            l7.b.d(context, jSONObject, "show_at_start", value.f9883c);
            l7.b.d(context, jSONObject, "show_between", value.f9884d);
            k8.F.z(context, jSONObject, "style", value.f9885e, uc.f6598S2);
            return jSONObject;
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f4762a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f4762a = component;
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
            Uc uc = this.f4762a;
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "margins", zP, null, uc.f6641W2);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            j6.l lVar = l7.e.f43877a;
            return new B3.a(abstractC5371aH, l7.c.j(fVarW, jSONObject, "show_at_end", aVar, zP, null, aVar2, lVar), l7.c.j(fVarW, jSONObject, "show_at_start", aVar, zP, null, aVar2, lVar), l7.c.j(fVarW, jSONObject, "show_between", aVar, zP, null, aVar2, lVar), l7.c.b(fVarW, jSONObject, "style", zP, null, uc.f6609T2));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, B3.a value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            Uc uc = this.f4762a;
            l7.c.u(context, jSONObject, "margins", value.f4886a, uc.f6641W2);
            l7.c.q(context, jSONObject, "show_at_end", value.f4887b);
            l7.c.q(context, jSONObject, "show_at_start", value.f4888c);
            l7.c.q(context, jSONObject, "show_between", value.f4889d);
            l7.c.u(context, jSONObject, "style", value.f4890e, uc.f6609T2);
            return jSONObject;
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class c implements D7.j<JSONObject, B3.a, C1431y3.c> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f4763a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f4763a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v5, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            B3.a template = (B3.a) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f4763a;
            C1362t4 c1362t4 = (C1362t4) l7.d.h(context, template.f4886a, data, "margins", uc.f6652X2, uc.f6630V2);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = A3.f4758a;
            A7.b bVarL = l7.d.l(context, template.f4887b, data, "show_at_end", aVar, aVar2, c0000b);
            if (bVarL == null) {
                bVarL = c0000b;
            }
            b.C0000b c0000b2 = A3.f4759b;
            ?? L7 = l7.d.l(context, template.f4888c, data, "show_at_start", aVar, aVar2, c0000b2);
            b.C0000b c0000b3 = L7 == 0 ? c0000b2 : L7;
            b.C0000b c0000b4 = A3.f4760c;
            ?? L8 = l7.d.l(context, template.f4889d, data, "show_between", aVar, aVar2, c0000b4);
            if (L8 != 0) {
                c0000b4 = L8;
            }
            return new C1431y3.c(c1362t4, bVarL, c0000b3, c0000b4, (AbstractC1293o4) l7.d.a(context, template.f4890e, data, "style", uc.f6620U2, uc.f6598S2));
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f4758a = b.a.a(bool);
        f4759b = b.a.a(bool);
        f4760c = b.a.a(Boolean.TRUE);
    }
}
