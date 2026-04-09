package N7;

import A7.b;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskParticlesJsonParser.kt */
/* renamed from: N7.ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1300ob {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8868a = b.a.a(Double.valueOf(0.8d));

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8869b = b.a.a(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final b.C0000b f8870c = b.a.a(Boolean.TRUE);

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final W4 f8871d = new W4(b.a.a(1L));

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final H7 f8872e = new H7(14);

    /* compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    /* renamed from: N7.ob$a */
    public static final class a implements D7.h, D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8873a;

        public a(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8873a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v6, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r2v8, types: [A7.b] */
        @Override // D7.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final C1286nb a(D7.f context, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(data, "data");
            k.b bVar = l7.k.f43901f;
            h.f fVar = l7.h.f43881b;
            j6.l lVar = l7.e.f43877a;
            A7.b bVarA = l7.b.a(context, data, "color", bVar, fVar, lVar);
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            H7 h72 = C1300ob.f8872e;
            b.C0000b c0000b = C1300ob.f8868a;
            ?? B10 = l7.b.b(context, data, "density", dVar, dVar2, h72, c0000b);
            b.C0000b c0000b2 = B10 == 0 ? c0000b : B10;
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b3 = C1300ob.f8869b;
            ?? B11 = l7.b.b(context, data, "is_animated", aVar, aVar2, lVar, c0000b3);
            b.C0000b c0000b4 = B11 == 0 ? c0000b3 : B11;
            b.C0000b c0000b5 = C1300ob.f8870c;
            ?? B12 = l7.b.b(context, data, "is_enabled", aVar, aVar2, lVar, c0000b5);
            if (B12 != 0) {
                c0000b5 = B12;
            }
            W4 w42 = (W4) k8.F.q(context, data, "particle_size", this.f8873a.f6897t3);
            if (w42 == null) {
                w42 = C1300ob.f8871d;
            }
            kotlin.jvm.internal.l.e(w42, "JsonPropertyParser.readO…RTICLE_SIZE_DEFAULT_VALUE");
            return new C1286nb(bVarA, c0000b2, c0000b4, c0000b5, w42);
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1286nb value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.b.e(context, jSONObject, "color", value.f8838a, l7.h.f43880a);
            l7.b.d(context, jSONObject, "density", value.f8839b);
            l7.b.d(context, jSONObject, "is_animated", value.f8840c);
            l7.b.d(context, jSONObject, "is_enabled", value.f8841d);
            k8.F.z(context, jSONObject, "particle_size", value.f8842e, this.f8873a.f6897t3);
            k8.F.y(context, jSONObject, "type", "particles");
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    /* renamed from: N7.ob$b */
    public static final class b implements D7.h, D7.i {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8874a;

        public b(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8874a = component;
        }

        @Override // D7.b
        public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
            return B4.h.c(this, fVar, jSONObject);
        }

        @Override // D7.i
        public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
            return d(fVar, null, (JSONObject) obj);
        }

        public final C1314pb d(D7.f fVar, C1314pb c1314pb, JSONObject jSONObject) throws z7.d {
            boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
            D7.f fVarW = T1.B.w(fVar);
            k.b bVar = l7.k.f43901f;
            AbstractC5371a<A7.b<Integer>> abstractC5371a = c1314pb != null ? c1314pb.f8912a : null;
            h.f fVar2 = l7.h.f43881b;
            j6.l lVar = l7.e.f43877a;
            AbstractC5371a abstractC5371aE = l7.c.e(fVarW, jSONObject, "color", bVar, zP, abstractC5371a, fVar2, lVar);
            AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "density", l7.k.f43899d, zP, c1314pb != null ? c1314pb.f8913b : null, l7.h.f43885f, C1300ob.f8872e);
            k.a aVar = l7.k.f43896a;
            AbstractC5371a<A7.b<Boolean>> abstractC5371a2 = c1314pb != null ? c1314pb.f8914c : null;
            h.a aVar2 = l7.h.f43884e;
            return new C1314pb(abstractC5371aE, abstractC5371aJ, l7.c.j(fVarW, jSONObject, "is_animated", aVar, zP, abstractC5371a2, aVar2, lVar), l7.c.j(fVarW, jSONObject, "is_enabled", aVar, zP, c1314pb != null ? c1314pb.f8915d : null, aVar2, lVar), l7.c.h(fVarW, jSONObject, "particle_size", zP, c1314pb != null ? c1314pb.f8916e : null, this.f8874a.f6908u3));
        }

        @Override // D7.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final JSONObject b(D7.f context, C1314pb value) throws JSONException, z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(value, "value");
            JSONObject jSONObject = new JSONObject();
            l7.c.p(context, "color", value.f8912a, jSONObject, l7.h.f43880a);
            l7.c.q(context, jSONObject, "density", value.f8913b);
            l7.c.q(context, jSONObject, "is_animated", value.f8914c);
            l7.c.q(context, jSONObject, "is_enabled", value.f8915d);
            l7.c.u(context, jSONObject, "particle_size", value.f8916e, this.f8874a.f6908u3);
            k8.F.y(context, jSONObject, "type", "particles");
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    /* renamed from: N7.ob$c */
    public static final class c implements D7.j<JSONObject, C1314pb, C1286nb> {

        /* renamed from: a, reason: collision with root package name */
        public final Uc f8875a;

        public c(Uc component) {
            kotlin.jvm.internal.l.f(component, "component");
            this.f8875a = component;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [A7.b] */
        /* JADX WARN: Type inference failed for: r13v2, types: [A7.b] */
        @Override // D7.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1286nb a(D7.f context, C1314pb template, JSONObject data) throws z7.d {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(data, "data");
            A7.b bVarD = l7.d.d(context, template.f8912a, data, "color", l7.k.f43901f, l7.h.f43881b);
            kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
            k.d dVar = l7.k.f43899d;
            h.d dVar2 = l7.h.f43885f;
            H7 h72 = C1300ob.f8872e;
            b.C0000b c0000b = C1300ob.f8868a;
            ?? N8 = l7.d.n(context, template.f8913b, data, "density", dVar, dVar2, h72, c0000b);
            if (N8 != 0) {
                c0000b = N8;
            }
            k.a aVar = l7.k.f43896a;
            h.a aVar2 = l7.h.f43884e;
            b.C0000b c0000b2 = C1300ob.f8869b;
            A7.b bVarL = l7.d.l(context, template.f8914c, data, "is_animated", aVar, aVar2, c0000b2);
            if (bVarL == null) {
                bVarL = c0000b2;
            }
            b.C0000b c0000b3 = C1300ob.f8870c;
            ?? L7 = l7.d.l(context, template.f8915d, data, "is_enabled", aVar, aVar2, c0000b3);
            if (L7 != 0) {
                c0000b3 = L7;
            }
            Uc uc = this.f8875a;
            W4 w42 = (W4) l7.d.h(context, template.f8916e, data, "particle_size", uc.f6918v3, uc.f6897t3);
            if (w42 == null) {
                w42 = C1300ob.f8871d;
            }
            W4 w43 = w42;
            kotlin.jvm.internal.l.e(w43, "JsonFieldResolver.resolv…RTICLE_SIZE_DEFAULT_VALUE");
            return new C1286nb(bVarD, c0000b, bVarL, c0000b3, w43);
        }
    }
}
