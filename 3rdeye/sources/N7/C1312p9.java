package N7;

import A7.b;
import l7.h;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivShadowJsonParser.kt */
/* renamed from: N7.p9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1312p9 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8903a = b.a.a(Double.valueOf(0.19d));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8904b = b.a.a(2L);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8905c = b.a.a(0);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final B8 f8906d = new B8(4);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final C1154e9 f8907e = new C1154e9(2);

    /* compiled from: DivShadowJsonParser.kt */
    /* renamed from: N7.p9$a */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8908a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8908a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v5, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v7, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B8 b82 = C1312p9.f8906d;
            b.C0000b c0000b = C1312p9.f8903a;
            ?? B10 = l7.b.b(context, data, "alpha", dVar, dVar2, b82, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            C1154e9 c1154e9 = C1312p9.f8907e;
            b.C0000b c0000b3 = C1312p9.f8904b;
            ?? B11 = l7.b.b(context, data, "blur", eVar, eVar2, c1154e9, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            k.b bVar = l7.k.f43901f;
            h.f fVar = l7.h.f43881b;
            b.C0000b c0000b5 = C1312p9.f8905c;
            ?? B12 = l7.b.b(context, data, "color", bVar, fVar, l7.e.f43877a, c0000b5);
            if (B12 != 0) {
                c0000b5 = B12;
            }
            return new C1298o9(c0000b2, c0000b4, c0000b5, (C1325q8) k8.F.l(context, data, "offset", this.f8908a.f6612T5));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1298o9 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "alpha", value.f8862a);
            l7.b.d(context, jSONObject, "blur", value.f8863b);
            l7.b.e(context, jSONObject, "color", value.f8864c, l7.h.f43880a);
            k8.F.z(context, jSONObject, "offset", value.f8865d, this.f8908a.f6612T5);
            return jSONObject;
        }
    }

    /* compiled from: DivShadowJsonParser.kt */
    /* renamed from: N7.p9$b */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8909a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8909a = component;
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
            return new C1326q9(l7.c.j(fVarW, jSONObject, "alpha", l7.k.f43899d, zP, null, l7.h.f43885f, C1312p9.f8906d), l7.c.j(fVarW, jSONObject, "blur", l7.k.f43897b, zP, null, l7.h.f43886g, C1312p9.f8907e), l7.c.j(fVarW, jSONObject, "color", l7.k.f43901f, zP, null, l7.h.f43881b, l7.e.f43877a), l7.c.b(fVarW, jSONObject, "offset", zP, null, this.f8909a.f6623U5));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1326q9 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "alpha", value.f8995a);
            l7.c.q(context, jSONObject, "blur", value.f8996b);
            l7.c.p(context, "color", value.f8997c, jSONObject, l7.h.f43880a);
            l7.c.u(context, jSONObject, "offset", value.f8998d, this.f8909a.f6623U5);
            return jSONObject;
        }
    }

    /* compiled from: DivShadowJsonParser.kt */
    /* renamed from: N7.p9$c */
    public static final class c implements D7.j<JSONObject, C1326q9, C1298o9> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8910a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8910a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v5, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1326q9 template = (C1326q9) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            B8 b82 = C1312p9.f8906d;
            b.C0000b c0000b = C1312p9.f8903a;
            ?? N8 = l7.d.n(context, template.f8995a, data, "alpha", dVar, dVar2, b82, c0000b);
            b.C0000b c0000b2 = N8 == 0 ? c0000b : N8;
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            C1154e9 c1154e9 = C1312p9.f8907e;
            b.C0000b c0000b3 = C1312p9.f8904b;
            ?? N10 = l7.d.n(context, template.f8996b, data, "blur", eVar, eVar2, c1154e9, c0000b3);
            if (N10 != 0) {
                c0000b3 = N10;
            }
            k.b bVar2 = l7.k.f43901f;
            h.f fVar = l7.h.f43881b;
            b.C0000b c0000b4 = C1312p9.f8905c;
            ?? L7 = l7.d.l(context, template.f8997c, data, "color", bVar2, fVar, c0000b4);
            if (L7 != 0) {
                c0000b4 = L7;
            }
            Uc uc = this.f8910a;
            return new C1298o9(c0000b2, c0000b3, c0000b4, (C1325q8) l7.d.a(context, template.f8998d, data, "offset", uc.f6633V5, uc.f6612T5));
        }
    }
}
