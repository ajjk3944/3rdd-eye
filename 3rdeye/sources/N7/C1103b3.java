package N7;

import A7.b;
import c9.C2091l;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivChangeBoundsTransitionJsonParser.kt */
/* renamed from: N7.b3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1103b3 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7921a = b.a.a(200L);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7922b = b.a.a(EnumC1360t2.EASE_IN_OUT);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f7923c = b.a.a(0L);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final l7.i f7924d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final B4.f f7925e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final B4.g f7926f;

    /* compiled from: DivChangeBoundsTransitionJsonParser.kt */
    /* renamed from: N7.b3$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f7927g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof EnumC1360t2);
        }
    }

    /* compiled from: DivChangeBoundsTransitionJsonParser.kt */
    /* renamed from: N7.b3$b */
    public static final class b implements D7.h, D7.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v3, types: [A7.b] */
        public static C1088a3 d(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            B4.f fVar = C1103b3.f7925e;
            b.C0000b c0000b = C1103b3.f7921a;
            ?? B10 = l7.b.b(context, data, "duration", eVar, eVar2, fVar, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            l7.i iVar = C1103b3.f7924d;
            p9.l<String, EnumC1360t2> lVar = EnumC1360t2.FROM_STRING;
            b.C0000b c0000b3 = C1103b3.f7922b;
            ?? B11 = l7.b.b(context, data, "interpolator", iVar, lVar, l7.e.f43877a, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            B4.g gVar = C1103b3.f7926f;
            b.C0000b c0000b5 = C1103b3.f7923c;
            ?? B12 = l7.b.b(context, data, "start_delay", eVar, eVar2, gVar, c0000b5);
            if (B12 != 0) {
                c0000b5 = B12;
            }
            return new C1088a3(c0000b2, c0000b4, c0000b5);
        }

        public static JSONObject e(D7.f context, C1088a3 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "duration", value.f7889a);
            l7.b.e(context, jSONObject, "interpolator", value.f7890b, EnumC1360t2.TO_STRING);
            l7.b.d(context, jSONObject, "start_delay", value.f7891c);
            k8.F.y(context, jSONObject, "type", "change_bounds");
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C1088a3) obj);
        }
    }

    /* compiled from: DivChangeBoundsTransitionJsonParser.kt */
    /* renamed from: N7.b3$c */
    public static final class c implements D7.h, D7.i {
        public static C1118c3 d(D7.f fVar, C1118c3 c1118c3, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a = c1118c3 != null ? c1118c3.f7967a : null;
            h.e eVar2 = l7.h.f43886g;
            return new C1118c3(l7.c.j(fVarW, jSONObject, "duration", eVar, zP, abstractC5371a, eVar2, C1103b3.f7925e), l7.c.j(fVarW, jSONObject, "interpolator", C1103b3.f7924d, zP, c1118c3 != null ? c1118c3.f7968b : null, EnumC1360t2.FROM_STRING, l7.e.f43877a), l7.c.j(fVarW, jSONObject, "start_delay", eVar, zP, c1118c3 != null ? c1118c3.f7969c : null, eVar2, C1103b3.f7926f));
        }

        public static JSONObject e(D7.f context, C1118c3 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "duration", value.f7967a);
            l7.c.p(context, "interpolator", value.f7968b, jSONObject, EnumC1360t2.TO_STRING);
            l7.c.q(context, jSONObject, "start_delay", value.f7969c);
            k8.F.y(context, jSONObject, "type", "change_bounds");
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C1118c3) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivChangeBoundsTransitionJsonParser.kt */
    /* renamed from: N7.b3$d */
    public static final class d implements D7.j<JSONObject, C1118c3, C1088a3> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v1, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v2, types: [A7.b] */
        public static C1088a3 b(D7.f context, C1118c3 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            B4.f fVar = C1103b3.f7925e;
            b.C0000b c0000b = C1103b3.f7921a;
            A7.b bVarN = l7.d.n(context, template.f7967a, data, "duration", eVar, eVar2, fVar, c0000b);
            if (bVarN == null) {
                bVarN = c0000b;
            }
            l7.i iVar = C1103b3.f7924d;
            p9.l<String, EnumC1360t2> lVar = EnumC1360t2.FROM_STRING;
            b.C0000b c0000b2 = C1103b3.f7922b;
            ?? L7 = l7.d.l(context, template.f7968b, data, "interpolator", iVar, lVar, c0000b2);
            b.C0000b c0000b3 = L7 == 0 ? c0000b2 : L7;
            B4.g gVar = C1103b3.f7926f;
            b.C0000b c0000b4 = C1103b3.f7923c;
            ?? N8 = l7.d.n(context, template.f7969c, data, "start_delay", eVar, eVar2, gVar, c0000b4);
            if (N8 != 0) {
                c0000b4 = N8;
            }
            return new C1088a3(bVarN, c0000b3, c0000b4);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (C1118c3) bVar, jSONObject);
        }
    }

    static {
        Object objM = C2091l.m(EnumC1360t2.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f7927g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f7924d = new l7.i(objM, validator);
        f7925e = new B4.f(10);
        f7926f = new B4.g(11);
    }
}
