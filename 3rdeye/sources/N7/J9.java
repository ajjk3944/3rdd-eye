package N7;

import A7.b;
import N7.I9;
import c9.C2091l;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivSlideTransitionJsonParser.kt */
/* loaded from: classes.dex */
public final class J9 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5577a = b.a.a(200L);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5578b = b.a.a(I9.a.BOTTOM);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5579c = b.a.a(EnumC1360t2.EASE_IN_OUT);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f5580d = b.a.a(0L);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final l7.i f5581e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final l7.i f5582f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final G8 f5583g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final C1094a9 f5584h;

    /* compiled from: DivSlideTransitionJsonParser.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f5585g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof I9.a);
        }
    }

    /* compiled from: DivSlideTransitionJsonParser.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f5586g = new b(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1360t2);
        }
    }

    /* compiled from: DivSlideTransitionJsonParser.kt */
    public static final class c implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5587a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5587a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v2, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v4, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v6, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final I9 a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            C1134d4 c1134d4 = (C1134d4) k8.F.q(context, data, "distance", this.f5587a.f6504J2);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            G8 g82 = J9.f5583g;
            b.C0000b c0000b = J9.f5577a;
            ?? B10 = l7.b.b(context, data, "duration", eVar, eVar2, g82, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            l7.i iVar = J9.f5581e;
            p9.l<String, I9.a> lVar = I9.a.FROM_STRING;
            b.C0000b c0000b3 = J9.f5578b;
            j6.l lVar2 = l7.e.f43877a;
            ?? B11 = l7.b.b(context, data, "edge", iVar, lVar, lVar2, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            l7.i iVar2 = J9.f5582f;
            p9.l<String, EnumC1360t2> lVar3 = EnumC1360t2.FROM_STRING;
            b.C0000b c0000b5 = J9.f5579c;
            ?? B12 = l7.b.b(context, data, "interpolator", iVar2, lVar3, lVar2, c0000b5);
            b.C0000b c0000b6 = B12 == 0 ? c0000b5 : B12;
            C1094a9 c1094a9 = J9.f5584h;
            b.C0000b c0000b7 = J9.f5580d;
            ?? B13 = l7.b.b(context, data, "start_delay", eVar, eVar2, c1094a9, c0000b7);
            if (B13 != 0) {
                c0000b7 = B13;
            }
            return new I9(c1134d4, c0000b2, c0000b4, c0000b6, c0000b7);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, I9 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            k8.F.z(context, jSONObject, "distance", value.f5481a, this.f5587a.f6504J2);
            l7.b.d(context, jSONObject, "duration", value.f5482b);
            l7.b.e(context, jSONObject, "edge", value.f5483c, I9.a.TO_STRING);
            l7.b.e(context, jSONObject, "interpolator", value.f5484d, EnumC1360t2.TO_STRING);
            l7.b.d(context, jSONObject, "start_delay", value.f5485e);
            k8.F.y(context, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    /* compiled from: DivSlideTransitionJsonParser.kt */
    public static final class d implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5588a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5588a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final K9 d(D7.f fVar, K9 k92, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "distance", zP, k92 != null ? k92.f5622a : null, this.f5588a.f6515K2);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a = k92 != null ? k92.f5623b : null;
            h.e eVar2 = l7.h.f43886g;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "duration", eVar, zP, abstractC5371a, eVar2, J9.f5583g);
            l7.i iVar = J9.f5581e;
            AbstractC5371a<A7.b<I9.a>> abstractC5371a2 = k92 != null ? k92.f5624c : null;
            p9.l<String, I9.a> lVar = I9.a.FROM_STRING;
            j6.l lVar2 = l7.e.f43877a;
            return new K9(abstractC5371aH, abstractC5371aJ, l7.c.j(fVarW, jSONObject, "edge", iVar, zP, abstractC5371a2, lVar, lVar2), l7.c.j(fVarW, jSONObject, "interpolator", J9.f5582f, zP, k92 != null ? k92.f5625d : null, EnumC1360t2.FROM_STRING, lVar2), l7.c.j(fVarW, jSONObject, "start_delay", eVar, zP, k92 != null ? k92.f5626e : null, eVar2, J9.f5584h));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, K9 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.u(context, jSONObject, "distance", value.f5622a, this.f5588a.f6515K2);
            l7.c.q(context, jSONObject, "duration", value.f5623b);
            l7.c.p(context, "edge", value.f5624c, jSONObject, I9.a.TO_STRING);
            l7.c.p(context, "interpolator", value.f5625d, jSONObject, EnumC1360t2.TO_STRING);
            l7.c.q(context, jSONObject, "start_delay", value.f5626e);
            k8.F.y(context, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    /* compiled from: DivSlideTransitionJsonParser.kt */
    public static final class e implements D7.j<JSONObject, K9, I9> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f5589a;

        public e(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f5589a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v5, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v7, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v9, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I9 a(D7.f context, K9 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            Uc uc = this.f5589a;
            C1134d4 c1134d4 = (C1134d4) l7.d.h(context, template.f5622a, data, "distance", uc.f6526L2, uc.f6504J2);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            G8 g82 = J9.f5583g;
            b.C0000b c0000b = J9.f5577a;
            ?? N8 = l7.d.n(context, template.f5623b, data, "duration", eVar, eVar2, g82, c0000b);
            b.C0000b c0000b2 = N8 == 0 ? c0000b : N8;
            l7.i iVar = J9.f5581e;
            p9.l<String, I9.a> lVar = I9.a.FROM_STRING;
            b.C0000b c0000b3 = J9.f5578b;
            ?? L7 = l7.d.l(context, template.f5624c, data, "edge", iVar, lVar, c0000b3);
            b.C0000b c0000b4 = L7 == 0 ? c0000b3 : L7;
            l7.i iVar2 = J9.f5582f;
            p9.l<String, EnumC1360t2> lVar2 = EnumC1360t2.FROM_STRING;
            b.C0000b c0000b5 = J9.f5579c;
            ?? L8 = l7.d.l(context, template.f5625d, data, "interpolator", iVar2, lVar2, c0000b5);
            b.C0000b c0000b6 = L8 == 0 ? c0000b5 : L8;
            C1094a9 c1094a9 = J9.f5584h;
            b.C0000b c0000b7 = J9.f5580d;
            ?? N10 = l7.d.n(context, template.f5626e, data, "start_delay", eVar, eVar2, c1094a9, c0000b7);
            return new I9(c1134d4, c0000b2, c0000b4, c0000b6, N10 == 0 ? c0000b7 : N10);
        }
    }

    static {
        Object objM = C2091l.m(I9.a.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f5585g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f5581e = new l7.i(objM, validator);
        Object objM2 = C2091l.m(EnumC1360t2.values());
        kotlin.jvm.internal.l.f(objM2, "default");
        b validator2 = b.f5586g;
        kotlin.jvm.internal.l.f(validator2, "validator");
        f5582f = new l7.i(objM2, validator2);
        f5583g = new G8(4);
        f5584h = new C1094a9(4);
    }
}
