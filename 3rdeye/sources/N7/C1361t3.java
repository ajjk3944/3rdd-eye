package N7;

import A7.b;
import N7.C1333r3;
import N7.C1375u3;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivCollectionItemBuilderJsonParser.kt */
/* renamed from: N7.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1361t3 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9208a = new b.C0000b(Boolean.TRUE);

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    /* renamed from: N7.t3$a */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9209a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9209a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            Z z10 = (Z) k8.F.l(context, data, "div", this.f9209a.f6935w9);
            k.g gVar = l7.k.f43898c;
            A8.d dVar = l7.e.f43878b;
            j6.l lVar = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, FacebookMediationAdapter.KEY_ID, gVar, dVar, lVar, null);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1361t3.f9208a;
            ?? B10 = l7.b.b(context, data, "selector", aVar, aVar2, lVar, c0000b);
            if (B10 != 0) {
                c0000b = B10;
            }
            return new C1333r3.a(z10, bVarB, c0000b);
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1333r3.a value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.z(context, jSONObject, "div", value.f9036a, this.f9209a.f6935w9);
            l7.b.d(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f9037b);
            l7.b.d(context, jSONObject, "selector", value.f9038c);
            return jSONObject;
        }
    }

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    /* renamed from: N7.t3$b */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9210a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9210a = component;
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
            AbstractC5371a abstractC5371aB = l7.c.b(fVarW, jSONObject, "div", zP, null, this.f9210a.f6946x9);
            k.g gVar = l7.k.f43898c;
            A8.d dVar = l7.e.f43878b;
            j6.l lVar = l7.e.f43877a;
            return new C1375u3.a(abstractC5371aB, l7.c.j(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, gVar, zP, null, dVar, lVar), l7.c.j(fVarW, jSONObject, "selector", l7.k.f43896a, zP, null, l7.h.f43884e, lVar));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1375u3.a value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.u(context, jSONObject, "div", value.f9379a, this.f9210a.f6946x9);
            l7.c.q(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f9380b);
            l7.c.q(context, jSONObject, "selector", value.f9381c);
            return jSONObject;
        }
    }

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    /* renamed from: N7.t3$c */
    public static final class c implements D7.j<JSONObject, C1375u3.a, C1333r3.a> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f9211a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f9211a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v2, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1375u3.a template = (C1375u3.a) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f9211a;
            Z z10 = (Z) l7.d.a(context, template.f9379a, data, "div", uc.f6957y9, uc.f6935w9);
            A7.b bVarJ = l7.d.j(context, template.f9380b, data, FacebookMediationAdapter.KEY_ID, l7.k.f43898c);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1361t3.f9208a;
            ?? L7 = l7.d.l(context, template.f9381c, data, "selector", aVar, aVar2, c0000b);
            if (L7 != 0) {
                c0000b = L7;
            }
            return new C1333r3.a(z10, bVarJ, c0000b);
        }
    }
}
