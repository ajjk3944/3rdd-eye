package bj;

import Vi.InterfaceC3627a;
import Xi.m;
import Xi.n;
import Zi.AbstractC3696b;
import Zi.AbstractC3723o0;
import aj.AbstractC3866G;
import aj.AbstractC3868b;
import aj.C3861B;
import aj.C3864E;
import aj.C3869c;
import aj.C3873g;
import aj.InterfaceC3875i;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlinx.serialization.SerializationException;

/* renamed from: bj.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC4120c extends AbstractC3723o0 implements InterfaceC3875i {

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3868b f33435d;

    /* renamed from: e, reason: collision with root package name */
    private final aj.j f33436e;

    /* renamed from: f, reason: collision with root package name */
    private final String f33437f;

    /* renamed from: g, reason: collision with root package name */
    protected final C3873g f33438g;

    public /* synthetic */ AbstractC4120c(AbstractC3868b abstractC3868b, aj.j jVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3868b, jVar, str);
    }

    private final Void C0(AbstractC3866G abstractC3866G, String str, String str2) {
        StringBuilder sb2;
        String str3;
        if (kotlin.text.t.P(str, "i", false, 2, null)) {
            sb2 = new StringBuilder();
            str3 = "an ";
        } else {
            sb2 = new StringBuilder();
            str3 = "a ";
        }
        sb2.append(str3);
        sb2.append(str);
        throw r.e(-1, "Failed to parse literal '" + abstractC3866G + "' as " + sb2.toString() + " value at element: " + B0(str2), n0().toString());
    }

    public abstract aj.j A0();

    public final String B0(String currentTag) {
        AbstractC6492s.i(currentTag, "currentTag");
        return j0() + '.' + currentTag;
    }

    @Override // Yi.c
    public cj.e a() {
        return d().a();
    }

    public void b(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
    }

    @Override // Yi.e
    public Yi.c c(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        aj.j jVarN0 = n0();
        Xi.m mVarH = descriptor.h();
        if (AbstractC6492s.d(mVarH, n.b.f24471a) || (mVarH instanceof Xi.d)) {
            AbstractC3868b abstractC3868bD = d();
            String strA = descriptor.a();
            if (jVarN0 instanceof C3869c) {
                return new C4117A(abstractC3868bD, (C3869c) jVarN0);
            }
            throw r.e(-1, "Expected " + O.b(C3869c.class).v() + ", but had " + O.b(jVarN0.getClass()).v() + " as the serialized body of " + strA + " at element: " + j0(), jVarN0.toString());
        }
        if (!AbstractC6492s.d(mVarH, n.c.f24472a)) {
            AbstractC3868b abstractC3868bD2 = d();
            String strA2 = descriptor.a();
            if (jVarN0 instanceof C3864E) {
                return new z(abstractC3868bD2, (C3864E) jVarN0, this.f33437f, null, 8, null);
            }
            throw r.e(-1, "Expected " + O.b(C3864E.class).v() + ", but had " + O.b(jVarN0.getClass()).v() + " as the serialized body of " + strA2 + " at element: " + j0(), jVarN0.toString());
        }
        AbstractC3868b abstractC3868bD3 = d();
        Xi.f fVarA = N.a(descriptor.i(0), abstractC3868bD3.a());
        Xi.m mVarH2 = fVarA.h();
        if ((mVarH2 instanceof Xi.e) || AbstractC6492s.d(mVarH2, m.b.f24469a)) {
            AbstractC3868b abstractC3868bD4 = d();
            String strA3 = descriptor.a();
            if (jVarN0 instanceof C3864E) {
                return new B(abstractC3868bD4, (C3864E) jVarN0);
            }
            throw r.e(-1, "Expected " + O.b(C3864E.class).v() + ", but had " + O.b(jVarN0.getClass()).v() + " as the serialized body of " + strA3 + " at element: " + j0(), jVarN0.toString());
        }
        if (!abstractC3868bD3.e().c()) {
            throw r.c(fVarA);
        }
        AbstractC3868b abstractC3868bD5 = d();
        String strA4 = descriptor.a();
        if (jVarN0 instanceof C3869c) {
            return new C4117A(abstractC3868bD5, (C3869c) jVarN0);
        }
        throw r.e(-1, "Expected " + O.b(C3869c.class).v() + ", but had " + O.b(jVarN0.getClass()).v() + " as the serialized body of " + strA4 + " at element: " + j0(), jVarN0.toString());
    }

    @Override // aj.InterfaceC3875i
    public AbstractC3868b d() {
        return this.f33435d;
    }

    @Override // Zi.AbstractC3723o0
    protected String f0(String parentName, String childName) {
        AbstractC6492s.i(parentName, "parentName");
        AbstractC6492s.i(childName, "childName");
        return childName;
    }

    @Override // Zi.Z0, Yi.e
    public Yi.e l(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        return Z() != null ? super.l(descriptor) : new v(d(), A0(), this.f33437f).l(descriptor);
    }

    @Override // aj.InterfaceC3875i
    public aj.j m() {
        return n0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract aj.j m0(String str);

    protected final aj.j n0() {
        aj.j jVarM0;
        String str = (String) Z();
        return (str == null || (jVarM0 = m0(str)) == null) ? A0() : jVarM0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z0
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public boolean O(String tag) {
        AbstractC6492s.i(tag, "tag");
        aj.j jVarM0 = m0(tag);
        if (jVarM0 instanceof AbstractC3866G) {
            AbstractC3866G abstractC3866G = (AbstractC3866G) jVarM0;
            try {
                Boolean boolD = aj.k.d(abstractC3866G);
                if (boolD != null) {
                    return boolD.booleanValue();
                }
                C0(abstractC3866G, "boolean", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                C0(abstractC3866G, "boolean", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw r.e(-1, "Expected " + O.b(AbstractC3866G.class).v() + ", but had " + O.b(jVarM0.getClass()).v() + " as the serialized body of boolean at element: " + B0(tag), jVarM0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z0
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public byte P(String tag) {
        AbstractC6492s.i(tag, "tag");
        aj.j jVarM0 = m0(tag);
        if (jVarM0 instanceof AbstractC3866G) {
            AbstractC3866G abstractC3866G = (AbstractC3866G) jVarM0;
            try {
                long jK = aj.k.k(abstractC3866G);
                Byte bValueOf = (-128 > jK || jK > 127) ? null : Byte.valueOf((byte) jK);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                C0(abstractC3866G, "byte", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                C0(abstractC3866G, "byte", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw r.e(-1, "Expected " + O.b(AbstractC3866G.class).v() + ", but had " + O.b(jVarM0.getClass()).v() + " as the serialized body of byte at element: " + B0(tag), jVarM0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z0
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public char Q(String tag) {
        AbstractC6492s.i(tag, "tag");
        aj.j jVarM0 = m0(tag);
        if (jVarM0 instanceof AbstractC3866G) {
            AbstractC3866G abstractC3866G = (AbstractC3866G) jVarM0;
            try {
                return kotlin.text.t.w1(abstractC3866G.b());
            } catch (IllegalArgumentException unused) {
                C0(abstractC3866G, "char", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw r.e(-1, "Expected " + O.b(AbstractC3866G.class).v() + ", but had " + O.b(jVarM0.getClass()).v() + " as the serialized body of char at element: " + B0(tag), jVarM0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z0
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public double R(String tag) {
        AbstractC6492s.i(tag, "tag");
        aj.j jVarM0 = m0(tag);
        if (jVarM0 instanceof AbstractC3866G) {
            AbstractC3866G abstractC3866G = (AbstractC3866G) jVarM0;
            try {
                double dF = aj.k.f(abstractC3866G);
                if (d().e().b() || !(Double.isInfinite(dF) || Double.isNaN(dF))) {
                    return dF;
                }
                throw r.a(Double.valueOf(dF), tag, n0().toString());
            } catch (IllegalArgumentException unused) {
                C0(abstractC3866G, "double", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw r.e(-1, "Expected " + O.b(AbstractC3866G.class).v() + ", but had " + O.b(jVarM0.getClass()).v() + " as the serialized body of double at element: " + B0(tag), jVarM0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z0
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public int S(String tag, Xi.f enumDescriptor) {
        AbstractC6492s.i(tag, "tag");
        AbstractC6492s.i(enumDescriptor, "enumDescriptor");
        AbstractC3868b abstractC3868bD = d();
        aj.j jVarM0 = m0(tag);
        String strA = enumDescriptor.a();
        if (jVarM0 instanceof AbstractC3866G) {
            return t.k(enumDescriptor, abstractC3868bD, ((AbstractC3866G) jVarM0).b(), null, 4, null);
        }
        throw r.e(-1, "Expected " + O.b(AbstractC3866G.class).v() + ", but had " + O.b(jVarM0.getClass()).v() + " as the serialized body of " + strA + " at element: " + B0(tag), jVarM0.toString());
    }

    @Override // Yi.e
    public Object t(InterfaceC3627a deserializer) {
        AbstractC3866G abstractC3866GI;
        AbstractC6492s.i(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractC3696b) || d().e().p()) {
            return deserializer.c(this);
        }
        AbstractC3696b abstractC3696b = (AbstractC3696b) deserializer;
        String strC = D.c(abstractC3696b.a(), d());
        aj.j jVarM = m();
        String strA = abstractC3696b.a().a();
        if (jVarM instanceof C3864E) {
            C3864E c3864e = (C3864E) jVarM;
            aj.j jVar = (aj.j) c3864e.get(strC);
            try {
                InterfaceC3627a interfaceC3627aA = Vi.g.a((AbstractC3696b) deserializer, this, (jVar == null || (abstractC3866GI = aj.k.i(jVar)) == null) ? null : aj.k.e(abstractC3866GI));
                AbstractC6492s.g(interfaceC3627aA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return L.b(d(), strC, c3864e, interfaceC3627aA);
            } catch (SerializationException e10) {
                String message = e10.getMessage();
                AbstractC6492s.f(message);
                throw r.e(-1, message, c3864e.toString());
            }
        }
        throw r.e(-1, "Expected " + O.b(C3864E.class).v() + ", but had " + O.b(jVarM.getClass()).v() + " as the serialized body of " + strA + " at element: " + j0(), jVarM.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z0
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public float T(String tag) {
        AbstractC6492s.i(tag, "tag");
        aj.j jVarM0 = m0(tag);
        if (jVarM0 instanceof AbstractC3866G) {
            AbstractC3866G abstractC3866G = (AbstractC3866G) jVarM0;
            try {
                float fG = aj.k.g(abstractC3866G);
                if (d().e().b() || !(Float.isInfinite(fG) || Float.isNaN(fG))) {
                    return fG;
                }
                throw r.a(Float.valueOf(fG), tag, n0().toString());
            } catch (IllegalArgumentException unused) {
                C0(abstractC3866G, "float", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw r.e(-1, "Expected " + O.b(AbstractC3866G.class).v() + ", but had " + O.b(jVarM0.getClass()).v() + " as the serialized body of float at element: " + B0(tag), jVarM0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z0
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public Yi.e U(String tag, Xi.f inlineDescriptor) {
        AbstractC6492s.i(tag, "tag");
        AbstractC6492s.i(inlineDescriptor, "inlineDescriptor");
        if (!G.b(inlineDescriptor)) {
            return super.U(tag, inlineDescriptor);
        }
        AbstractC3868b abstractC3868bD = d();
        aj.j jVarM0 = m0(tag);
        String strA = inlineDescriptor.a();
        if (jVarM0 instanceof AbstractC3866G) {
            return new p(I.a(abstractC3868bD, ((AbstractC3866G) jVarM0).b()), d());
        }
        throw r.e(-1, "Expected " + O.b(AbstractC3866G.class).v() + ", but had " + O.b(jVarM0.getClass()).v() + " as the serialized body of " + strA + " at element: " + B0(tag), jVarM0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z0
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public int V(String tag) {
        AbstractC6492s.i(tag, "tag");
        aj.j jVarM0 = m0(tag);
        if (jVarM0 instanceof AbstractC3866G) {
            AbstractC3866G abstractC3866G = (AbstractC3866G) jVarM0;
            try {
                long jK = aj.k.k(abstractC3866G);
                Integer numValueOf = (-2147483648L > jK || jK > 2147483647L) ? null : Integer.valueOf((int) jK);
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                C0(abstractC3866G, "int", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                C0(abstractC3866G, "int", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw r.e(-1, "Expected " + O.b(AbstractC3866G.class).v() + ", but had " + O.b(jVarM0.getClass()).v() + " as the serialized body of int at element: " + B0(tag), jVarM0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z0
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public long W(String tag) {
        AbstractC6492s.i(tag, "tag");
        aj.j jVarM0 = m0(tag);
        if (jVarM0 instanceof AbstractC3866G) {
            AbstractC3866G abstractC3866G = (AbstractC3866G) jVarM0;
            try {
                return aj.k.k(abstractC3866G);
            } catch (IllegalArgumentException unused) {
                C0(abstractC3866G, "long", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw r.e(-1, "Expected " + O.b(AbstractC3866G.class).v() + ", but had " + O.b(jVarM0.getClass()).v() + " as the serialized body of long at element: " + B0(tag), jVarM0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z0
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public short X(String tag) {
        AbstractC6492s.i(tag, "tag");
        aj.j jVarM0 = m0(tag);
        if (jVarM0 instanceof AbstractC3866G) {
            AbstractC3866G abstractC3866G = (AbstractC3866G) jVarM0;
            try {
                long jK = aj.k.k(abstractC3866G);
                Short shValueOf = (-32768 > jK || jK > 32767) ? null : Short.valueOf((short) jK);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                C0(abstractC3866G, "short", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                C0(abstractC3866G, "short", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw r.e(-1, "Expected " + O.b(AbstractC3866G.class).v() + ", but had " + O.b(jVarM0.getClass()).v() + " as the serialized body of short at element: " + B0(tag), jVarM0.toString());
    }

    @Override // Yi.e
    public boolean y() {
        return !(n0() instanceof C3861B);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.Z0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public String Y(String tag) {
        AbstractC6492s.i(tag, "tag");
        aj.j jVarM0 = m0(tag);
        if (!(jVarM0 instanceof AbstractC3866G)) {
            throw r.e(-1, "Expected " + O.b(AbstractC3866G.class).v() + ", but had " + O.b(jVarM0.getClass()).v() + " as the serialized body of string at element: " + B0(tag), jVarM0.toString());
        }
        AbstractC3866G abstractC3866G = (AbstractC3866G) jVarM0;
        if (!(abstractC3866G instanceof aj.x)) {
            throw r.e(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + B0(tag), n0().toString());
        }
        aj.x xVar = (aj.x) abstractC3866G;
        if (xVar.f() || d().e().q()) {
            return xVar.b();
        }
        throw r.e(-1, "String literal for key '" + tag + "' should be quoted at element: " + B0(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", n0().toString());
    }

    protected final String z0() {
        return this.f33437f;
    }

    public /* synthetic */ AbstractC4120c(AbstractC3868b abstractC3868b, aj.j jVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3868b, jVar, (i10 & 4) != 0 ? null : str, null);
    }

    private AbstractC4120c(AbstractC3868b abstractC3868b, aj.j jVar, String str) {
        this.f33435d = abstractC3868b;
        this.f33436e = jVar;
        this.f33437f = str;
        this.f33438g = d().e();
    }
}
