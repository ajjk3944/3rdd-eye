package N7;

import A7.b;
import N7.C1242k9;
import N7.C1284n9;
import c9.C2091l;
import l7.h;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivSeparatorJsonParser.kt */
/* renamed from: N7.l9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1256l9 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8733a = new b.C0000b(335544320);

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8734b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8735c;

    /* compiled from: DivSeparatorJsonParser.kt */
    /* renamed from: N7.l9$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8736g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof C1242k9.a.EnumC0105a);
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    /* renamed from: N7.l9$b */
    public static final class b implements D7.h, D7.b {
        public static JSONObject d(D7.f context, C1242k9.a value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.e(context, jSONObject, "color", value.f8698a, l7.h.f43880a);
            l7.b.e(context, jSONObject, "orientation", value.f8699b, C1242k9.a.EnumC0105a.TO_STRING);
            return jSONObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v1, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.b bVar = l7.k.f43901f;
            h.f fVar = l7.h.f43881b;
            b.C0000b c0000b = C1256l9.f8733a;
            j6.l lVar = l7.e.f43877a;
            ?? B10 = l7.b.b(context, data, "color", bVar, fVar, lVar, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            l7.i iVar = C1256l9.f8735c;
            p9.l<String, C1242k9.a.EnumC0105a> lVar2 = C1242k9.a.EnumC0105a.FROM_STRING;
            b.C0000b c0000b3 = C1256l9.f8734b;
            ?? B11 = l7.b.b(context, data, "orientation", iVar, lVar2, lVar, c0000b3);
            if (B11 != 0) {
                c0000b3 = B11;
            }
            return new C1242k9.a(c0000b2, c0000b3);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1242k9.a) obj);
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    /* renamed from: N7.l9$c */
    public static final class c implements D7.h, D7.i {
        public static JSONObject d(D7.f context, C1284n9.a value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.p(context, "color", value.f8836a, jSONObject, l7.h.f43880a);
            l7.c.p(context, "orientation", value.f8837b, jSONObject, C1242k9.a.EnumC0105a.TO_STRING);
            return jSONObject;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.h
        public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
            return d(fVar, (C1284n9.a) obj);
        }

        @Override // D7.i
        public final Z6.b c(D7.f fVar, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.b bVar = l7.k.f43901f;
            h.f fVar2 = l7.h.f43881b;
            j6.l lVar = l7.e.f43877a;
            return new C1284n9.a(l7.c.j(fVarW, jSONObject, "color", bVar, zP, null, fVar2, lVar), l7.c.j(fVarW, jSONObject, "orientation", C1256l9.f8735c, zP, null, C1242k9.a.EnumC0105a.FROM_STRING, lVar));
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    /* renamed from: N7.l9$d */
    public static final class d implements D7.j<JSONObject, C1284n9.a, C1242k9.a> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r3v1, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1284n9.a template = (C1284n9.a) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            k.b bVar2 = l7.k.f43901f;
            h.f fVar = l7.h.f43881b;
            b.C0000b c0000b = C1256l9.f8733a;
            ?? L7 = l7.d.l(context, template.f8836a, data, "color", bVar2, fVar, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            l7.i iVar = C1256l9.f8735c;
            p9.l<String, C1242k9.a.EnumC0105a> lVar = C1242k9.a.EnumC0105a.FROM_STRING;
            b.C0000b c0000b3 = C1256l9.f8734b;
            ?? L8 = l7.d.l(context, template.f8837b, data, "orientation", iVar, lVar, c0000b3);
            if (L8 != 0) {
                c0000b3 = L8;
            }
            return new C1242k9.a(c0000b2, c0000b3);
        }
    }

    static {
        C1242k9.a.EnumC0105a value = C1242k9.a.EnumC0105a.HORIZONTAL;
        kotlin.jvm.internal.l.f(value, "value");
        f8734b = new b.C0000b(value);
        Object objM = C2091l.m(C1242k9.a.EnumC0105a.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f8736g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f8735c = new l7.i(objM, validator);
    }
}
