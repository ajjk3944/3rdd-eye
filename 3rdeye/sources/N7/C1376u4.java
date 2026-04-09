package N7;

import A7.b;
import c9.C2091l;
import l7.h;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivEdgeInsetsJsonParser.kt */
/* renamed from: N7.u4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1376u4 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9382a = b.a.a(0L);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9383b = b.a.a(0L);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9384c = b.a.a(0L);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9385d = b.a.a(0L);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9386e = b.a.a(H9.DP);

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final l7.i f9387f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final F3.h f9388g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final B4.f f9389h;

    @Deprecated
    public static final B4.g i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final B4.h f9390j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final B4.i f9391k;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final F3.h f9392l;

    /* compiled from: DivEdgeInsetsJsonParser.kt */
    /* renamed from: N7.u4$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f9393g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof H9);
        }
    }

    /* compiled from: DivEdgeInsetsJsonParser.kt */
    /* renamed from: N7.u4$b */
    public static final class b implements D7.h, D7.b {
        public static JSONObject d(D7.f context, C1362t4 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "bottom", value.f9216a);
            l7.b.d(context, jSONObject, "end", value.f9217b);
            l7.b.d(context, jSONObject, "left", value.f9218c);
            l7.b.d(context, jSONObject, "right", value.f9219d);
            l7.b.d(context, jSONObject, "start", value.f9220e);
            l7.b.d(context, jSONObject, "top", value.f9221f);
            l7.b.e(context, jSONObject, "unit", value.f9222g, H9.TO_STRING);
            return jSONObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v4, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v6, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v9, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            F3.h hVar = C1376u4.f9388g;
            b.C0000b c0000b = C1376u4.f9382a;
            ?? B10 = l7.b.b(context, data, "bottom", eVar, eVar2, hVar, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            A7.b bVarB = l7.b.b(context, data, "end", eVar, eVar2, C1376u4.f9389h, null);
            B4.g gVar = C1376u4.i;
            b.C0000b c0000b3 = C1376u4.f9383b;
            ?? B11 = l7.b.b(context, data, "left", eVar, eVar2, gVar, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            B4.h hVar2 = C1376u4.f9390j;
            b.C0000b c0000b5 = C1376u4.f9384c;
            ?? B12 = l7.b.b(context, data, "right", eVar, eVar2, hVar2, c0000b5);
            b.C0000b c0000b6 = B12 == 0 ? c0000b5 : B12;
            A7.b bVarB2 = l7.b.b(context, data, "start", eVar, eVar2, C1376u4.f9391k, null);
            F3.h hVar3 = C1376u4.f9392l;
            b.C0000b c0000b7 = C1376u4.f9385d;
            ?? B13 = l7.b.b(context, data, "top", eVar, eVar2, hVar3, c0000b7);
            b.C0000b c0000b8 = B13 == 0 ? c0000b7 : B13;
            l7.i iVar = C1376u4.f9387f;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            b.C0000b c0000b9 = C1376u4.f9386e;
            ?? B14 = l7.b.b(context, data, "unit", iVar, lVar, l7.e.f43877a, c0000b9);
            return new C1362t4(c0000b2, bVarB, c0000b4, c0000b6, bVarB2, c0000b8, B14 == 0 ? c0000b9 : B14);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1362t4) obj);
        }
    }

    /* compiled from: DivEdgeInsetsJsonParser.kt */
    /* renamed from: N7.u4$c */
    public static final class c implements D7.h, D7.i {
        public static JSONObject d(D7.f context, C1390v4 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "bottom", value.f9564a);
            l7.c.q(context, jSONObject, "end", value.f9565b);
            l7.c.q(context, jSONObject, "left", value.f9566c);
            l7.c.q(context, jSONObject, "right", value.f9567d);
            l7.c.q(context, jSONObject, "start", value.f9568e);
            l7.c.q(context, jSONObject, "top", value.f9569f);
            l7.c.p(context, "unit", value.f9570g, jSONObject, H9.TO_STRING);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1390v4) obj);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            return new C1390v4(l7.c.j(fVarW, jSONObject, "bottom", eVar, zP, null, eVar2, C1376u4.f9388g), l7.c.j(fVarW, jSONObject, "end", eVar, zP, null, eVar2, C1376u4.f9389h), l7.c.j(fVarW, jSONObject, "left", eVar, zP, null, eVar2, C1376u4.i), l7.c.j(fVarW, jSONObject, "right", eVar, zP, null, eVar2, C1376u4.f9390j), l7.c.j(fVarW, jSONObject, "start", eVar, zP, null, eVar2, C1376u4.f9391k), l7.c.j(fVarW, jSONObject, "top", eVar, zP, null, eVar2, C1376u4.f9392l), l7.c.j(fVarW, jSONObject, "unit", C1376u4.f9387f, zP, null, H9.FROM_STRING, l7.e.f43877a));
        }
    }

    /* compiled from: DivEdgeInsetsJsonParser.kt */
    /* renamed from: N7.u4$d */
    public static final class d implements D7.j<JSONObject, C1390v4, C1362t4> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v2, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v4, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v7, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1390v4 template = (C1390v4) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            F3.h hVar = C1376u4.f9388g;
            b.C0000b c0000b = C1376u4.f9382a;
            A7.b bVarN = l7.d.n(context, template.f9564a, data, "bottom", eVar, eVar2, hVar, c0000b);
            if (bVarN == null) {
                bVarN = c0000b;
            }
            A7.b bVarM = l7.d.m(context, template.f9565b, data, "end", eVar, eVar2, C1376u4.f9389h);
            B4.g gVar = C1376u4.i;
            b.C0000b c0000b2 = C1376u4.f9383b;
            A7.b bVarN2 = l7.d.n(context, template.f9566c, data, "left", eVar, eVar2, gVar, c0000b2);
            if (bVarN2 == null) {
                bVarN2 = c0000b2;
            }
            B4.h hVar2 = C1376u4.f9390j;
            b.C0000b c0000b3 = C1376u4.f9384c;
            ?? N8 = l7.d.n(context, template.f9567d, data, "right", eVar, eVar2, hVar2, c0000b3);
            b.C0000b c0000b4 = N8 == 0 ? c0000b3 : N8;
            A7.b bVarM2 = l7.d.m(context, template.f9568e, data, "start", eVar, eVar2, C1376u4.f9391k);
            F3.h hVar3 = C1376u4.f9392l;
            b.C0000b c0000b5 = C1376u4.f9385d;
            ?? N10 = l7.d.n(context, template.f9569f, data, "top", eVar, eVar2, hVar3, c0000b5);
            if (N10 != 0) {
                c0000b5 = N10;
            }
            l7.i iVar = C1376u4.f9387f;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            b.C0000b c0000b6 = C1376u4.f9386e;
            ?? L7 = l7.d.l(context, template.f9570g, data, "unit", iVar, lVar, c0000b6);
            if (L7 != 0) {
                c0000b6 = L7;
            }
            return new C1362t4(bVarN, bVarM, bVarN2, c0000b4, bVarM2, c0000b5, c0000b6);
        }
    }

    static {
        Object objM = C2091l.m(H9.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f9393g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f9387f = new l7.i(objM, validator);
        f9388g = new F3.h(15);
        f9389h = new B4.f(15);
        i = new B4.g(16);
        f9390j = new B4.h(15);
        f9391k = new B4.i(14);
        f9392l = new F3.h(16);
    }
}
