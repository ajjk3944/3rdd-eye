package N7;

import A7.b;
import N7.C1331r1;
import c9.C2091l;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionScrollByJsonParser.kt */
/* renamed from: N7.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1345s1 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9130a = b.a.a(Boolean.TRUE);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9131b = b.a.a(0L);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9132c = b.a.a(0L);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f9133d = b.a.a(C1331r1.a.CLAMP);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final l7.i f9134e;

    /* compiled from: DivActionScrollByJsonParser.kt */
    /* renamed from: N7.s1$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f9135g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof C1331r1.a);
        }
    }

    /* compiled from: DivActionScrollByJsonParser.kt */
    /* renamed from: N7.s1$b */
    public static final class b implements D7.h, D7.b {
        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public static N7.C1331r1 d(D7.f r12, org.json.JSONObject r13) throws z7.d {
            /*
                java.lang.String r0 = "context"
                kotlin.jvm.internal.l.f(r12, r0)
                java.lang.String r0 = "data"
                kotlin.jvm.internal.l.f(r13, r0)
                N7.r1 r0 = new N7.r1
                l7.k$a r4 = l7.k.f43896a
                l7.h$a r5 = l7.h.f43884e
                A7.b$b r7 = N7.C1345s1.f9130a
                j6.l r6 = l7.e.f43877a
                java.lang.String r3 = "animated"
                r1 = r12
                r2 = r13
                A7.b r3 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L20
                r8 = r7
                goto L21
            L20:
                r8 = r3
            L21:
                l7.k$g r4 = l7.k.f43898c
                A8.d r5 = l7.e.f43878b
                java.lang.String r3 = "id"
                r1 = r12
                r2 = r13
                A7.b r9 = l7.b.a(r1, r2, r3, r4, r5, r6)
                l7.k$e r4 = l7.k.f43897b
                l7.h$e r5 = l7.h.f43886g
                A7.b$b r7 = N7.C1345s1.f9131b
                java.lang.String r3 = "item_count"
                r1 = r12
                r2 = r13
                A7.b r3 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L3f
                r10 = r7
                goto L40
            L3f:
                r10 = r3
            L40:
                A7.b$b r7 = N7.C1345s1.f9132c
                java.lang.String r3 = "offset"
                r1 = r12
                r2 = r13
                A7.b r3 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != 0) goto L4e
                r11 = r7
                goto L4f
            L4e:
                r11 = r3
            L4f:
                l7.i r4 = N7.C1345s1.f9134e
                p9.l<java.lang.String, N7.r1$a> r5 = N7.C1331r1.a.FROM_STRING
                A7.b$b r7 = N7.C1345s1.f9133d
                java.lang.String r3 = "overflow"
                r1 = r12
                r2 = r13
                A7.b r1 = l7.b.b(r1, r2, r3, r4, r5, r6, r7)
                if (r1 != 0) goto L66
                r6 = r7
                r1 = r0
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                goto L6c
            L66:
                r6 = r1
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r1 = r0
            L6c:
                r1.<init>(r2, r3, r4, r5, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: N7.C1345s1.b.d(D7.f, org.json.JSONObject):N7.r1");
        }

        public static JSONObject e(D7.f context, C1331r1 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "animated", value.f9010a);
            l7.b.d(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f9011b);
            l7.b.d(context, jSONObject, "item_count", value.f9012c);
            l7.b.d(context, jSONObject, "offset", value.f9013d);
            l7.b.e(context, jSONObject, "overflow", value.f9014e, C1331r1.a.TO_STRING);
            k8.F.y(context, jSONObject, "type", "scroll_by");
            return jSONObject;
        }

        @Override // D7.b
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return d(fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C1331r1) obj);
        }
    }

    /* compiled from: DivActionScrollByJsonParser.kt */
    /* renamed from: N7.s1$c */
    public static final class c implements D7.h, D7.i {
        public static C1359t1 d(D7.f fVar, C1359t1 c1359t1, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.a aVar = l7.k.f43896a;
            AbstractC5371a<A7.b<Boolean>> abstractC5371a = c1359t1 != null ? c1359t1.f9201a : null;
            h.a aVar2 = l7.h.f43884e;
            j6.l lVar = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "animated", aVar, zP, abstractC5371a, aVar2, lVar);
            AbstractC5371a abstractC5371aD = l7.c.d(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, l7.k.f43898c, zP, c1359t1 != null ? c1359t1.f9202b : null);
            k.e eVar = l7.k.f43897b;
            AbstractC5371a<A7.b<Long>> abstractC5371a2 = c1359t1 != null ? c1359t1.f9203c : null;
            h.e eVar2 = l7.h.f43886g;
            return new C1359t1(abstractC5371aJ, abstractC5371aD, l7.c.j(fVarW, jSONObject, "item_count", eVar, zP, abstractC5371a2, eVar2, lVar), l7.c.j(fVarW, jSONObject, "offset", eVar, zP, c1359t1 != null ? c1359t1.f9204d : null, eVar2, lVar), l7.c.j(fVarW, jSONObject, "overflow", C1345s1.f9134e, zP, c1359t1 != null ? c1359t1.f9205e : null, C1331r1.a.FROM_STRING, lVar));
        }

        public static JSONObject e(D7.f context, C1359t1 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "animated", value.f9201a);
            l7.c.q(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f9202b);
            l7.c.q(context, jSONObject, "item_count", value.f9203c);
            l7.c.q(context, jSONObject, "offset", value.f9204d);
            l7.c.p(context, "overflow", value.f9205e, jSONObject, C1331r1.a.TO_STRING);
            k8.F.y(context, jSONObject, "type", "scroll_by");
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return e(fVar, (C1359t1) obj);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }
    }

    /* compiled from: DivActionScrollByJsonParser.kt */
    /* renamed from: N7.s1$d */
    public static final class d implements D7.j<JSONObject, C1359t1, C1331r1> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v10, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v4, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v8, types: [A7.b] */
        public static C1331r1 b(D7.f context, C1359t1 template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b = C1345s1.f9130a;
            ?? L7 = l7.d.l(context, template.f9201a, data, "animated", aVar, aVar2, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            A7.b bVarC = l7.d.c(context, template.f9202b, data, FacebookMediationAdapter.KEY_ID, l7.k.f43898c);
            kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…\"id\", TYPE_HELPER_STRING)");
            k.e eVar = l7.k.f43897b;
            h.e eVar2 = l7.h.f43886g;
            b.C0000b c0000b3 = C1345s1.f9131b;
            ?? L8 = l7.d.l(context, template.f9203c, data, "item_count", eVar, eVar2, c0000b3);
            b.C0000b c0000b4 = L8 == 0 ? c0000b3 : L8;
            b.C0000b c0000b5 = C1345s1.f9132c;
            ?? L10 = l7.d.l(context, template.f9204d, data, "offset", eVar, eVar2, c0000b5);
            b.C0000b c0000b6 = L10 == 0 ? c0000b5 : L10;
            l7.i iVar = C1345s1.f9134e;
            p9.l<String, C1331r1.a> lVar = C1331r1.a.FROM_STRING;
            b.C0000b c0000b7 = C1345s1.f9133d;
            ?? L11 = l7.d.l(context, template.f9205e, data, "overflow", iVar, lVar, c0000b7);
            return new C1331r1(c0000b2, bVarC, c0000b4, c0000b6, L11 == 0 ? c0000b7 : L11);
        }

        @Override // D7.j
        public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
            return b(fVar, (C1359t1) bVar, jSONObject);
        }
    }

    static {
        Object objM = C2091l.m(C1331r1.a.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f9135g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f9134e = new l7.i(objM, validator);
    }
}
