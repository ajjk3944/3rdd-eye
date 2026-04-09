package N7;

import A7.b;
import N7.C1130d0;
import c9.C2091l;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivAccessibilityJsonParser.kt */
/* renamed from: N7.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1145e0 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8144a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8145b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final C1130d0.b f8146c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8147d;

    /* compiled from: DivAccessibilityJsonParser.kt */
    /* renamed from: N7.e0$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8148g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof C1130d0.a);
        }
    }

    /* compiled from: DivAccessibilityJsonParser.kt */
    /* renamed from: N7.e0$b */
    public static final class b implements D7.h, D7.b {
        public static JSONObject d(D7.f context, C1130d0 value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.d(context, jSONObject, "description", value.f8036a);
            l7.b.d(context, jSONObject, "hint", value.f8037b);
            l7.b.d(context, jSONObject, "is_checked", value.f8038c);
            l7.b.e(context, jSONObject, "mode", value.f8039d, C1130d0.a.TO_STRING);
            l7.b.d(context, jSONObject, "mute_after_action", value.f8040e);
            l7.b.d(context, jSONObject, "state_description", value.f8041f);
            k8.F.A(context, jSONObject, "type", value.f8042g, C1130d0.b.TO_STRING);
            return jSONObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v6, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v8, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.g gVar = l7.k.f43898c;
            A8.d dVar = l7.e.f43878b;
            j6.l lVar = l7.e.f43877a;
            A7.b bVarB = l7.b.b(context, data, "description", gVar, dVar, lVar, null);
            A7.b bVarB2 = l7.b.b(context, data, "hint", gVar, dVar, lVar, null);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            A7.b bVarB3 = l7.b.b(context, data, "is_checked", aVar, aVar2, lVar, null);
            l7.i iVar = C1145e0.f8147d;
            p9.l<String, C1130d0.a> lVar2 = C1130d0.a.FROM_STRING;
            b.C0000b c0000b = C1145e0.f8144a;
            ?? B10 = l7.b.b(context, data, "mode", iVar, lVar2, lVar, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            b.C0000b c0000b3 = C1145e0.f8145b;
            ?? B11 = l7.b.b(context, data, "mute_after_action", aVar, aVar2, lVar, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            A7.b bVarB4 = l7.b.b(context, data, "state_description", gVar, dVar, lVar, null);
            C1130d0.b bVar = (C1130d0.b) k8.F.r(context, data, "type", C1130d0.b.FROM_STRING, lVar);
            if (bVar == null) {
                bVar = C1145e0.f8146c;
            }
            C1130d0.b bVar2 = bVar;
            kotlin.jvm.internal.l.e(bVar2, "JsonPropertyParser.readO…NG) ?: TYPE_DEFAULT_VALUE");
            return new C1130d0(bVarB, bVarB2, bVarB3, c0000b2, c0000b4, bVarB4, bVar2);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1130d0) obj);
        }
    }

    /* compiled from: DivAccessibilityJsonParser.kt */
    /* renamed from: N7.e0$c */
    public static final class c implements D7.h, D7.i {
        public static JSONObject d(D7.f context, C1160f0 value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.q(context, jSONObject, "description", value.f8181a);
            l7.c.q(context, jSONObject, "hint", value.f8182b);
            l7.c.q(context, jSONObject, "is_checked", value.f8183c);
            l7.c.p(context, "mode", value.f8184d, jSONObject, C1130d0.a.TO_STRING);
            l7.c.q(context, jSONObject, "mute_after_action", value.f8185e);
            l7.c.q(context, jSONObject, "state_description", value.f8186f);
            l7.c.s(context, "type", value.f8187g, jSONObject, C1130d0.b.TO_STRING);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1160f0) obj);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.g gVar = l7.k.f43898c;
            A8.d dVar = l7.e.f43878b;
            j6.l lVar = l7.e.f43877a;
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "description", gVar, zP, null, dVar, lVar);
            AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "hint", gVar, zP, null, dVar, lVar);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            return new C1160f0(abstractC5371aJ, abstractC5371aJ2, l7.c.j(fVarW, jSONObject, "is_checked", aVar, zP, null, aVar2, lVar), l7.c.j(fVarW, jSONObject, "mode", C1145e0.f8147d, zP, null, C1130d0.a.FROM_STRING, lVar), l7.c.j(fVarW, jSONObject, "mute_after_action", aVar, zP, null, aVar2, lVar), l7.c.j(fVarW, jSONObject, "state_description", gVar, zP, null, dVar, lVar), l7.c.i(fVarW, jSONObject, "type", zP, null, C1130d0.b.FROM_STRING));
        }
    }

    /* compiled from: DivAccessibilityJsonParser.kt */
    /* renamed from: N7.e0$d */
    public static final class d implements D7.j<JSONObject, C1160f0, C1130d0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v7, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r1v9, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1160f0 template = (C1160f0) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.g gVar = l7.k.f43898c;
            A7.b bVarJ = l7.d.j(context, template.f8181a, data, "description", gVar);
            A7.b bVarJ2 = l7.d.j(context, template.f8182b, data, "hint", gVar);
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            A7.b bVarK = l7.d.k(context, template.f8183c, data, "is_checked", aVar, aVar2);
            l7.i iVar = C1145e0.f8147d;
            p9.l<String, C1130d0.a> lVar = C1130d0.a.FROM_STRING;
            b.C0000b c0000b = C1145e0.f8144a;
            ?? L7 = l7.d.l(context, template.f8184d, data, "mode", iVar, lVar, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            b.C0000b c0000b3 = C1145e0.f8145b;
            ?? L8 = l7.d.l(context, template.f8185e, data, "mute_after_action", aVar, aVar2, c0000b3);
            b.C0000b c0000b4 = L8 == 0 ? c0000b3 : L8;
            A7.b bVarJ3 = l7.d.j(context, template.f8186f, data, "state_description", gVar);
            C1130d0.b bVar2 = (C1130d0.b) l7.d.g(context, "type", template.f8187g, data, C1130d0.b.FROM_STRING);
            if (bVar2 == null) {
                bVar2 = C1145e0.f8146c;
            }
            kotlin.jvm.internal.l.e(bVar2, "JsonFieldResolver.resolv…NG) ?: TYPE_DEFAULT_VALUE");
            return new C1130d0(bVarJ, bVarJ2, bVarK, c0000b2, c0000b4, bVarJ3, bVar2);
        }
    }

    static {
        C1130d0.a value = C1130d0.a.DEFAULT;
        kotlin.jvm.internal.l.f(value, "value");
        f8144a = new b.C0000b(value);
        f8145b = new b.C0000b(Boolean.FALSE);
        f8146c = C1130d0.b.AUTO;
        Object objM = C2091l.m(C1130d0.a.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f8148g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f8147d = new l7.i(objM, validator);
    }
}
