package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.h;
import kotlinx.serialization.descriptors.i;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public abstract class c extends e1 implements z9.e {

    /* renamed from: c, reason: collision with root package name */
    public final z9.a f22996c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.serialization.json.b f22997d;

    /* renamed from: e, reason: collision with root package name */
    public final z9.d f22998e;

    public /* synthetic */ c(z9.a aVar, kotlinx.serialization.json.b bVar, kotlin.jvm.internal.i iVar) {
        this(aVar, bVar);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, y9.e
    public boolean D() {
        return !(f0() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, y9.e
    public Object G(kotlinx.serialization.a deserializer) {
        kotlin.jvm.internal.p.e(deserializer, "deserializer");
        return e0.d(this, deserializer);
    }

    @Override // kotlinx.serialization.internal.e1
    public String Z(String parentName, String childName) {
        kotlin.jvm.internal.p.e(parentName, "parentName");
        kotlin.jvm.internal.p.e(childName, "childName");
        return childName;
    }

    @Override // y9.e, y9.c
    public aa.c a() {
        return d().a();
    }

    @Override // y9.e
    public y9.c b(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        kotlinx.serialization.json.b bVarF0 = f0();
        kotlinx.serialization.descriptors.h kind = descriptor.getKind();
        if (kotlin.jvm.internal.p.a(kind, i.b.f22787a) ? true : kind instanceof kotlinx.serialization.descriptors.d) {
            z9.a aVarD = d();
            if (bVarF0 instanceof kotlinx.serialization.json.a) {
                return new z(aVarD, (kotlinx.serialization.json.a) bVarF0);
            }
            throw s.e(-1, "Expected " + kotlin.jvm.internal.t.b(kotlinx.serialization.json.a.class) + " as the serialized body of " + descriptor.h() + ", but had " + kotlin.jvm.internal.t.b(bVarF0.getClass()));
        }
        if (!kotlin.jvm.internal.p.a(kind, i.c.f22788a)) {
            z9.a aVarD2 = d();
            if (bVarF0 instanceof JsonObject) {
                return new JsonTreeDecoder(aVarD2, (JsonObject) bVarF0, null, null, 12, null);
            }
            throw s.e(-1, "Expected " + kotlin.jvm.internal.t.b(JsonObject.class) + " as the serialized body of " + descriptor.h() + ", but had " + kotlin.jvm.internal.t.b(bVarF0.getClass()));
        }
        z9.a aVarD3 = d();
        kotlinx.serialization.descriptors.f fVarA = m0.a(descriptor.g(0), aVarD3.a());
        kotlinx.serialization.descriptors.h kind2 = fVarA.getKind();
        if ((kind2 instanceof kotlinx.serialization.descriptors.e) || kotlin.jvm.internal.p.a(kind2, h.b.f22785a)) {
            z9.a aVarD4 = d();
            if (bVarF0 instanceof JsonObject) {
                return new b0(aVarD4, (JsonObject) bVarF0);
            }
            throw s.e(-1, "Expected " + kotlin.jvm.internal.t.b(JsonObject.class) + " as the serialized body of " + descriptor.h() + ", but had " + kotlin.jvm.internal.t.b(bVarF0.getClass()));
        }
        if (!aVarD3.e().b()) {
            throw s.d(fVarA);
        }
        z9.a aVarD5 = d();
        if (bVarF0 instanceof kotlinx.serialization.json.a) {
            return new z(aVarD5, (kotlinx.serialization.json.a) bVarF0);
        }
        throw s.e(-1, "Expected " + kotlin.jvm.internal.t.b(kotlinx.serialization.json.a.class) + " as the serialized body of " + descriptor.h() + ", but had " + kotlin.jvm.internal.t.b(bVarF0.getClass()));
    }

    public void c(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
    }

    @Override // z9.e
    public z9.a d() {
        return this.f22996c;
    }

    public final z9.l d0(kotlinx.serialization.json.c cVar, String str) {
        z9.l lVar = cVar instanceof z9.l ? (z9.l) cVar : null;
        if (lVar != null) {
            return lVar;
        }
        throw s.e(-1, "Unexpected 'null' when " + str + " was expected");
    }

    public abstract kotlinx.serialization.json.b e0(String str);

    public final kotlinx.serialization.json.b f0() {
        kotlinx.serialization.json.b bVarE0;
        String str = (String) U();
        return (str == null || (bVarE0 = e0(str)) == null) ? s0() : bVarE0;
    }

    @Override // z9.e
    public kotlinx.serialization.json.b g() {
        return f0();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public boolean J(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        kotlinx.serialization.json.c cVarR0 = r0(tag);
        if (!d().e().l() && d0(cVarR0, "boolean").d()) {
            throw s.f(-1, "Boolean literal for key '" + tag + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", f0().toString());
        }
        try {
            Boolean boolE = z9.g.e(cVarR0);
            if (boolE != null) {
                return boolE.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            t0("boolean");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public byte K(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        try {
            int iJ = z9.g.j(r0(tag));
            Byte bValueOf = (-128 > iJ || iJ > 127) ? null : Byte.valueOf((byte) iJ);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            t0("byte");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            t0("byte");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public char L(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        try {
            return s9.w.b1(r0(tag).c());
        } catch (IllegalArgumentException unused) {
            t0("char");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public double M(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        try {
            double dG = z9.g.g(r0(tag));
            if (d().e().a()) {
                return dG;
            }
            if (Double.isInfinite(dG) || Double.isNaN(dG)) {
                throw s.a(Double.valueOf(dG), tag, f0().toString());
            }
            return dG;
        } catch (IllegalArgumentException unused) {
            t0("double");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public int N(String tag, kotlinx.serialization.descriptors.f enumDescriptor) {
        kotlin.jvm.internal.p.e(tag, "tag");
        kotlin.jvm.internal.p.e(enumDescriptor, "enumDescriptor");
        return JsonNamesMapKt.f(enumDescriptor, d(), r0(tag).c(), null, 4, null);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public float O(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        try {
            float fI = z9.g.i(r0(tag));
            if (d().e().a()) {
                return fI;
            }
            if (Float.isInfinite(fI) || Float.isNaN(fI)) {
                throw s.a(Float.valueOf(fI), tag, f0().toString());
            }
            return fI;
        } catch (IllegalArgumentException unused) {
            t0("float");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public y9.e P(String tag, kotlinx.serialization.descriptors.f inlineDescriptor) {
        kotlin.jvm.internal.p.e(tag, "tag");
        kotlin.jvm.internal.p.e(inlineDescriptor, "inlineDescriptor");
        return i0.a(inlineDescriptor) ? new r(new j0(r0(tag).c()), d()) : super.P(tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int Q(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        try {
            return z9.g.j(r0(tag));
        } catch (IllegalArgumentException unused) {
            t0("int");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public long R(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        try {
            return z9.g.m(r0(tag));
        } catch (IllegalArgumentException unused) {
            t0("long");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public short S(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        try {
            int iJ = z9.g.j(r0(tag));
            Short shValueOf = (-32768 > iJ || iJ > 32767) ? null : Short.valueOf((short) iJ);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            t0("short");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            t0("short");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public String T(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        kotlinx.serialization.json.c cVarR0 = r0(tag);
        if (d().e().l() || d0(cVarR0, "string").d()) {
            if (cVarR0 instanceof JsonNull) {
                throw s.f(-1, "Unexpected 'null' value instead of string literal", f0().toString());
            }
            return cVarR0.c();
        }
        throw s.f(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", f0().toString());
    }

    public final kotlinx.serialization.json.c r0(String tag) {
        kotlin.jvm.internal.p.e(tag, "tag");
        kotlinx.serialization.json.b bVarE0 = e0(tag);
        kotlinx.serialization.json.c cVar = bVarE0 instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVarE0 : null;
        if (cVar != null) {
            return cVar;
        }
        throw s.f(-1, "Expected JsonPrimitive at " + tag + ", found " + bVarE0, f0().toString());
    }

    public abstract kotlinx.serialization.json.b s0();

    public final Void t0(String str) {
        throw s.f(-1, "Failed to parse '" + str + '\'', f0().toString());
    }

    public c(z9.a aVar, kotlinx.serialization.json.b bVar) {
        this.f22996c = aVar;
        this.f22997d = bVar;
        this.f22998e = d().e();
    }
}
