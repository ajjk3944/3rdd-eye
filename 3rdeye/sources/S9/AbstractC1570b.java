package S9;

import N7.C1154e9;
import O9.k;
import O9.l;
import Q9.AbstractC1525d0;
import R9.AbstractC1564a;
import R9.C1565b;
import c9.C2097r;
import com.singular.sdk.internal.Constants;
import java.util.NoSuchElementException;
import t4.C5606d;

/* compiled from: TreeJsonDecoder.kt */
/* renamed from: S9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1570b extends AbstractC1525d0 implements R9.h {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1564a f12070d;

    /* renamed from: e, reason: collision with root package name */
    public final R9.g f12071e;

    public AbstractC1570b(AbstractC1564a abstractC1564a, R9.i iVar) {
        this.f12070d = abstractC1564a;
        this.f12071e = abstractC1564a.f11781a;
    }

    public static R9.u T(R9.C c10, String str) {
        R9.u uVar = c10 instanceof R9.u ? (R9.u) c10 : null;
        if (uVar != null) {
            return uVar;
        }
        throw E.u.h(-1, "Unexpected 'null' when " + str + " was expected");
    }

    @Override // Q9.D0, P9.d
    public final P9.d A(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        if (C2097r.w0(this.f11406b) != null) {
            return super.A(descriptor);
        }
        return new A(this.f12070d, X()).A(descriptor);
    }

    @Override // Q9.D0, P9.d
    public final <T> T B(M9.b deserializer) {
        kotlin.jvm.internal.l.f(deserializer, "deserializer");
        return (T) C5606d.r(this, deserializer);
    }

    @Override // Q9.D0
    public final int D(String str, O9.e enumDescriptor) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        kotlin.jvm.internal.l.f(enumDescriptor, "enumDescriptor");
        return y.b(enumDescriptor, this.f12070d, W(tag).c(), "");
    }

    @Override // Q9.D0
    public final float K(String str) throws NumberFormatException {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        R9.C cW = W(tag);
        try {
            Q9.M m10 = R9.j.f11806a;
            float f10 = Float.parseFloat(cW.c());
            R9.g gVar = this.f12070d.f11781a;
            if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                return f10;
            }
            Float fValueOf = Float.valueOf(f10);
            String output = V().toString();
            kotlin.jvm.internal.l.f(output, "output");
            throw E.u.h(-1, E.u.R(fValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            Y("float");
            throw null;
        }
    }

    @Override // Q9.D0
    public final P9.d L(String str, O9.e inlineDescriptor) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        kotlin.jvm.internal.l.f(inlineDescriptor, "inlineDescriptor");
        if (P.a(inlineDescriptor)) {
            return new C1587t(new Q(W(tag).c()), this.f12070d);
        }
        this.f11406b.add(tag);
        return this;
    }

    @Override // Q9.D0
    public final int M(String str) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        R9.C cW = W(tag);
        try {
            Q9.M m10 = R9.j.f11806a;
            return Integer.parseInt(cW.c());
        } catch (IllegalArgumentException unused) {
            Y("int");
            throw null;
        }
    }

    @Override // Q9.D0
    public final long N(String str) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        R9.C cW = W(tag);
        try {
            Q9.M m10 = R9.j.f11806a;
            return Long.parseLong(cW.c());
        } catch (IllegalArgumentException unused) {
            Y(Constants.LONG);
            throw null;
        }
    }

    @Override // Q9.D0
    public final short O(String str) throws NumberFormatException {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        R9.C cW = W(tag);
        try {
            Q9.M m10 = R9.j.f11806a;
            int i = Integer.parseInt(cW.c());
            Short shValueOf = (-32768 > i || i > 32767) ? null : Short.valueOf((short) i);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            Y("short");
            throw null;
        } catch (IllegalArgumentException unused) {
            Y("short");
            throw null;
        }
    }

    @Override // Q9.D0
    public final String P(String str) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        R9.C cW = W(tag);
        R9.g gVar = this.f12070d.f11781a;
        if (!T(cW, "string").f11816b) {
            throw E.u.i(-1, C1154e9.i("String literal for key '", tag, "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), V().toString());
        }
        if (cW instanceof R9.x) {
            throw E.u.i(-1, "Unexpected 'null' value instead of string literal", V().toString());
        }
        return cW.c();
    }

    public abstract R9.i U(String str);

    public final R9.i V() {
        R9.i iVarU;
        String str = (String) C2097r.w0(this.f11406b);
        return (str == null || (iVarU = U(str)) == null) ? X() : iVarU;
    }

    public final R9.C W(String tag) {
        kotlin.jvm.internal.l.f(tag, "tag");
        R9.i iVarU = U(tag);
        R9.C c10 = iVarU instanceof R9.C ? (R9.C) iVarU : null;
        if (c10 != null) {
            return c10;
        }
        throw E.u.i(-1, "Expected JsonPrimitive at " + tag + ", found " + iVarU, V().toString());
    }

    public abstract R9.i X();

    public final void Y(String str) {
        throw E.u.i(-1, androidx.work.s.e("Failed to parse '", str, '\''), V().toString());
    }

    @Override // P9.d, P9.b
    public final I9.g a() {
        return this.f12070d.f11782b;
    }

    public void b(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
    }

    @Override // R9.h
    public final AbstractC1564a c() {
        return this.f12070d;
    }

    @Override // P9.d
    public P9.b d(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        R9.i iVarV = V();
        O9.k kVarE = descriptor.e();
        boolean z10 = kotlin.jvm.internal.l.b(kVarE, l.b.f10524a) ? true : kVarE instanceof O9.c;
        AbstractC1564a abstractC1564a = this.f12070d;
        if (z10) {
            if (iVarV instanceof C1565b) {
                return new G(abstractC1564a, (C1565b) iVarV);
            }
            throw E.u.h(-1, "Expected " + kotlin.jvm.internal.x.a(C1565b.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.x.a(iVarV.getClass()));
        }
        if (!kotlin.jvm.internal.l.b(kVarE, l.c.f10525a)) {
            if (iVarV instanceof R9.z) {
                return new E(abstractC1564a, (R9.z) iVarV, null, null);
            }
            throw E.u.h(-1, "Expected " + kotlin.jvm.internal.x.a(R9.z.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.x.a(iVarV.getClass()));
        }
        O9.e eVarA = U.a(descriptor.i(0), abstractC1564a.f11782b);
        O9.k kVarE2 = eVarA.e();
        if ((kVarE2 instanceof O9.d) || kotlin.jvm.internal.l.b(kVarE2, k.b.f10522a)) {
            if (iVarV instanceof R9.z) {
                return new H(abstractC1564a, (R9.z) iVarV);
            }
            throw E.u.h(-1, "Expected " + kotlin.jvm.internal.x.a(R9.z.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.x.a(iVarV.getClass()));
        }
        if (!abstractC1564a.f11781a.f11801c) {
            throw E.u.g(eVarA);
        }
        if (iVarV instanceof C1565b) {
            return new G(abstractC1564a, (C1565b) iVarV);
        }
        throw E.u.h(-1, "Expected " + kotlin.jvm.internal.x.a(C1565b.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.x.a(iVarV.getClass()));
    }

    @Override // Q9.D0
    public final boolean e(String str) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        R9.C cW = W(tag);
        R9.g gVar = this.f12070d.f11781a;
        if (T(cW, "boolean").f11816b) {
            throw E.u.i(-1, C1154e9.i("Boolean literal for key '", tag, "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), V().toString());
        }
        try {
            Boolean boolD = R9.j.d(cW);
            if (boolD != null) {
                return boolD.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            Y("boolean");
            throw null;
        }
    }

    @Override // R9.h
    public final R9.i j() {
        return V();
    }

    @Override // Q9.D0, P9.d
    public boolean p() {
        return !(V() instanceof R9.x);
    }

    @Override // Q9.D0
    public final byte q(String str) throws NumberFormatException {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        R9.C cW = W(tag);
        try {
            Q9.M m10 = R9.j.f11806a;
            int i = Integer.parseInt(cW.c());
            Byte bValueOf = (-128 > i || i > 127) ? null : Byte.valueOf((byte) i);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            Y("byte");
            throw null;
        } catch (IllegalArgumentException unused) {
            Y("byte");
            throw null;
        }
    }

    @Override // Q9.D0
    public final char t(String str) {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        try {
            String strC = W(tag).c();
            kotlin.jvm.internal.l.f(strC, "<this>");
            int length = strC.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strC.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            Y("char");
            throw null;
        }
    }

    @Override // Q9.D0
    public final double u(String str) throws NumberFormatException {
        String tag = str;
        kotlin.jvm.internal.l.f(tag, "tag");
        R9.C cW = W(tag);
        try {
            Q9.M m10 = R9.j.f11806a;
            double d10 = Double.parseDouble(cW.c());
            R9.g gVar = this.f12070d.f11781a;
            if (!Double.isInfinite(d10) && !Double.isNaN(d10)) {
                return d10;
            }
            Double dValueOf = Double.valueOf(d10);
            String output = V().toString();
            kotlin.jvm.internal.l.f(output, "output");
            throw E.u.h(-1, E.u.R(dValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            Y("double");
            throw null;
        }
    }
}
