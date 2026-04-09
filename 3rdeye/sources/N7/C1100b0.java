package N7;

import A7.b;
import l7.h;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
/* renamed from: N7.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1100b0 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7906a = b.a.a(0L);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7907b = b.a.a(0L);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7908c = b.a.a(0L);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7909d = b.a.a(0L);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final B4.h f7910e = new B4.h(7);

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final B4.i f7911f = new B4.i(7);

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final F3.h f7912g = new F3.h(8);

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final B4.f f7913h = new B4.f(8);

    /* compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    /* renamed from: N7.b0$a */
    public static final class a implements D7.h, D7.b {
        public static JSONObject d(D7.f context, C1085a0 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "bottom", value.f7880a);
            l7.b.d(context, jSONObject, "left", value.f7881b);
            l7.b.d(context, jSONObject, "right", value.f7882c);
            l7.b.d(context, jSONObject, "top", value.f7883d);
            return jSONObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v3, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            B4.h hVar = C1100b0.f7910e;
            b.C0000b c0000b = C1100b0.f7906a;
            A7.b bVarB = l7.b.b(context, data, "bottom", eVar, eVar2, hVar, c0000b);
            if (bVarB == null) {
                bVarB = c0000b;
            }
            B4.i iVar = C1100b0.f7911f;
            b.C0000b c0000b2 = C1100b0.f7907b;
            A7.b bVarB2 = l7.b.b(context, data, "left", eVar, eVar2, iVar, c0000b2);
            if (bVarB2 == null) {
                bVarB2 = c0000b2;
            }
            F3.h hVar2 = C1100b0.f7912g;
            b.C0000b c0000b3 = C1100b0.f7908c;
            ?? B10 = l7.b.b(context, data, "right", eVar, eVar2, hVar2, c0000b3);
            b.C0000b c0000b4 = B10 == 0 ? c0000b3 : B10;
            B4.f fVar = C1100b0.f7913h;
            b.C0000b c0000b5 = C1100b0.f7909d;
            ?? B11 = l7.b.b(context, data, "top", eVar, eVar2, fVar, c0000b5);
            if (B11 != 0) {
                c0000b5 = B11;
            }
            return new C1085a0(bVarB, bVarB2, c0000b4, c0000b5);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1085a0) obj);
        }
    }

    /* compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    /* renamed from: N7.b0$b */
    public static final class b implements D7.h, D7.i {
        public static JSONObject d(D7.f context, C1115c0 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "bottom", value.f7951a);
            l7.c.q(context, jSONObject, "left", value.f7952b);
            l7.c.q(context, jSONObject, "right", value.f7953c);
            l7.c.q(context, jSONObject, "top", value.f7954d);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1115c0) obj);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            return new C1115c0(l7.c.j(fVarW, jSONObject, "bottom", eVar, zP, null, eVar2, C1100b0.f7910e), l7.c.j(fVarW, jSONObject, "left", eVar, zP, null, eVar2, C1100b0.f7911f), l7.c.j(fVarW, jSONObject, "right", eVar, zP, null, eVar2, C1100b0.f7912g), l7.c.j(fVarW, jSONObject, "top", eVar, zP, null, eVar2, C1100b0.f7913h));
        }
    }

    /* compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    /* renamed from: N7.b0$c */
    public static final class c implements D7.j<JSONObject, C1115c0, C1085a0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v2, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v3, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1115c0 template = (C1115c0) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            B4.h hVar = C1100b0.f7910e;
            b.C0000b c0000b = C1100b0.f7906a;
            A7.b bVarN = l7.d.n(context, template.f7951a, data, "bottom", eVar, eVar2, hVar, c0000b);
            if (bVarN == null) {
                bVarN = c0000b;
            }
            B4.i iVar = C1100b0.f7911f;
            b.C0000b c0000b2 = C1100b0.f7907b;
            A7.b bVarN2 = l7.d.n(context, template.f7952b, data, "left", eVar, eVar2, iVar, c0000b2);
            if (bVarN2 == null) {
                bVarN2 = c0000b2;
            }
            F3.h hVar2 = C1100b0.f7912g;
            b.C0000b c0000b3 = C1100b0.f7908c;
            ?? N8 = l7.d.n(context, template.f7953c, data, "right", eVar, eVar2, hVar2, c0000b3);
            b.C0000b c0000b4 = N8 == 0 ? c0000b3 : N8;
            B4.f fVar = C1100b0.f7913h;
            b.C0000b c0000b5 = C1100b0.f7909d;
            ?? N10 = l7.d.n(context, template.f7954d, data, "top", eVar, eVar2, fVar, c0000b5);
            if (N10 != 0) {
                c0000b5 = N10;
            }
            return new C1085a0(bVarN, bVarN2, c0000b4, c0000b5);
        }
    }
}
