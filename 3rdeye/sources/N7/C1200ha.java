package N7;

import A7.b;
import N7.AbstractC1215ia;
import c9.C2091l;
import l7.h;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivStrokeJsonParser.kt */
/* renamed from: N7.ha, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1200ha {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final AbstractC1215ia.b f8356a = new AbstractC1215ia.b(new C1340ra());

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8357b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8358c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final l7.i f8359d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final C1154e9 f8360e;

    /* compiled from: DivStrokeJsonParser.kt */
    /* renamed from: N7.ha$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f8361g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object it) {
            kotlin.jvm.internal.l.f(it, "it");
            return Boolean.valueOf(it instanceof H9);
        }
    }

    /* compiled from: DivStrokeJsonParser.kt */
    /* renamed from: N7.ha$b */
    public static final class b implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8362a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8362a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v10, types: [A7.b] */
        @Override // D7.b
        public final Object a(D7.f context, JSONObject data) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.b bVar = l7.k.f43901f;
            h.f fVar = l7.h.f43881b;
            j6.l lVar = l7.e.f43877a;
            A7.b bVarA = l7.b.a(context, data, "color", bVar, fVar, lVar);
            AbstractC1215ia abstractC1215ia = (AbstractC1215ia) k8.F.q(context, data, "style", this.f8362a.f6966z7);
            if (abstractC1215ia == null) {
                abstractC1215ia = C1200ha.f8356a;
            }
            AbstractC1215ia abstractC1215ia2 = abstractC1215ia;
            kotlin.jvm.internal.l.e(abstractC1215ia2, "JsonPropertyParser.readO…r) ?: STYLE_DEFAULT_VALUE");
            l7.i iVar = C1200ha.f8359d;
            p9.l<String, H9> lVar2 = H9.FROM_STRING;
            b.C0000b c0000b = C1200ha.f8357b;
            ?? B10 = l7.b.b(context, data, "unit", iVar, lVar2, lVar, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            C1154e9 c1154e9 = C1200ha.f8360e;
            b.C0000b c0000b3 = C1200ha.f8358c;
            ?? B11 = l7.b.b(context, data, "width", dVar, dVar2, c1154e9, c0000b3);
            if (B11 != 0) {
                c0000b3 = B11;
            }
            return new C1185ga(bVarA, abstractC1215ia2, c0000b2, c0000b3);
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1185ga value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.e(context, jSONObject, "color", value.f8299a, l7.h.f43880a);
            k8.F.z(context, jSONObject, "style", value.f8300b, this.f8362a.f6966z7);
            l7.b.e(context, jSONObject, "unit", value.f8301c, H9.TO_STRING);
            l7.b.d(context, jSONObject, "width", value.f8302d);
            return jSONObject;
        }
    }

    /* compiled from: DivStrokeJsonParser.kt */
    /* renamed from: N7.ha$c */
    public static final class c implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8363a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8363a = component;
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
            k.b bVar = l7.k.f43901f;
            h.f fVar2 = l7.h.f43881b;
            j6.l lVar = l7.e.f43877a;
            return new C1424xa(l7.c.e(fVarW, jSONObject, "color", bVar, zP, null, fVar2, lVar), l7.c.h(fVarW, jSONObject, "style", zP, null, this.f8363a.f6413A7), l7.c.j(fVarW, jSONObject, "unit", C1200ha.f8359d, zP, null, H9.FROM_STRING, lVar), l7.c.j(fVarW, jSONObject, "width", l7.k.f43899d, zP, null, l7.h.f43885f, C1200ha.f8360e));
        }

        @Override // D7.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1424xa value) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.p(context, "color", value.f9789a, jSONObject, l7.h.f43880a);
            l7.c.u(context, jSONObject, "style", value.f9790b, this.f8363a.f6413A7);
            l7.c.p(context, "unit", value.f9791c, jSONObject, H9.TO_STRING);
            l7.c.q(context, jSONObject, "width", value.f9792d);
            return jSONObject;
        }
    }

    /* compiled from: DivStrokeJsonParser.kt */
    /* renamed from: N7.ha$d */
    public static final class d implements D7.j<JSONObject, C1424xa, C1185ga> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8364a;

        public d(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8364a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v2, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v4, types: [A7.b] */
        @Override // D7.j
        public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
            C1424xa template = (C1424xa) bVar;
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarD = l7.d.d(context, template.f9789a, data, "color", l7.k.f43901f, l7.h.f43881b);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
            Uc uc = this.f8364a;
            AbstractC1215ia abstractC1215ia = (AbstractC1215ia) l7.d.h(context, template.f9790b, data, "style", uc.f6424B7, uc.f6966z7);
            if (abstractC1215ia == null) {
                abstractC1215ia = C1200ha.f8356a;
            }
            kotlin.jvm.internal.l.e(abstractC1215ia, "JsonFieldResolver.resolv…r) ?: STYLE_DEFAULT_VALUE");
            l7.i iVar = C1200ha.f8359d;
            p9.l<String, H9> lVar = H9.FROM_STRING;
            b.C0000b c0000b = C1200ha.f8357b;
            ?? L7 = l7.d.l(context, template.f9791c, data, "unit", iVar, lVar, c0000b);
            b.C0000b c0000b2 = L7 == 0 ? c0000b : L7;
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            C1154e9 c1154e9 = C1200ha.f8360e;
            b.C0000b c0000b3 = C1200ha.f8358c;
            ?? N8 = l7.d.n(context, template.f9792d, data, "width", dVar, dVar2, c1154e9, c0000b3);
            if (N8 != 0) {
                c0000b3 = N8;
            }
            return new C1185ga(bVarD, abstractC1215ia, c0000b2, c0000b3);
        }
    }

    static {
        H9 value = H9.DP;
        kotlin.jvm.internal.l.f(value, "value");
        f8357b = new b.C0000b(value);
        f8358c = new b.C0000b(Double.valueOf(1.0d));
        Object objM = C2091l.m(H9.values());
        kotlin.jvm.internal.l.f(objM, "default");
        a validator = a.f8361g;
        kotlin.jvm.internal.l.f(validator, "validator");
        f8359d = new l7.i(objM, validator);
        f8360e = new C1154e9(5);
    }
}
