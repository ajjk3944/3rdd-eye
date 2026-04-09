package kotlin.jvm.internal;

import c9.C2097r;
import java.util.List;
import w9.InterfaceC5748c;

/* compiled from: TypeReference.kt */
/* loaded from: classes3.dex */
public final class A implements w9.j {

    /* renamed from: b, reason: collision with root package name */
    public final e f43637b;

    /* renamed from: c, reason: collision with root package name */
    public final List<w9.k> f43638c;

    /* renamed from: d, reason: collision with root package name */
    public final int f43639d;

    /* compiled from: TypeReference.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43640a;

        static {
            int[] iArr = new int[w9.l.values().length];
            try {
                iArr[w9.l.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w9.l.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w9.l.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43640a = iArr;
        }
    }

    public A() {
        throw null;
    }

    public A(e eVar, List arguments, boolean z10) {
        l.f(arguments, "arguments");
        this.f43637b = eVar;
        this.f43638c = arguments;
        this.f43639d = z10 ? 1 : 0;
    }

    @Override // w9.j
    public final boolean b() {
        return (this.f43639d & 1) != 0;
    }

    @Override // w9.j
    public final List<w9.k> e() {
        return this.f43638c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return l.b(this.f43637b, a10.f43637b) && l.b(this.f43638c, a10.f43638c) && this.f43639d == a10.f43639d;
    }

    @Override // w9.j
    public final InterfaceC5748c f() {
        return this.f43637b;
    }

    public final int hashCode() {
        return ((this.f43638c.hashCode() + (this.f43637b.hashCode() * 31)) * 31) + this.f43639d;
    }

    public final String i(boolean z10) {
        String name;
        e eVar = this.f43637b;
        e eVar2 = androidx.work.s.n(eVar) ? eVar : null;
        Class clsC = eVar2 != null ? E.u.C(eVar2) : null;
        if (clsC == null) {
            name = eVar.toString();
        } else if (clsC.isArray()) {
            name = clsC.equals(boolean[].class) ? "kotlin.BooleanArray" : clsC.equals(char[].class) ? "kotlin.CharArray" : clsC.equals(byte[].class) ? "kotlin.ByteArray" : clsC.equals(short[].class) ? "kotlin.ShortArray" : clsC.equals(int[].class) ? "kotlin.IntArray" : clsC.equals(float[].class) ? "kotlin.FloatArray" : clsC.equals(long[].class) ? "kotlin.LongArray" : clsC.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        } else if (z10 && clsC.isPrimitive()) {
            l.d(eVar, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = E.u.D(eVar).getName();
        } else {
            name = clsC.getName();
        }
        List<w9.k> list = this.f43638c;
        return B4.g.o(name, list.isEmpty() ? "" : C2097r.u0(list, ", ", "<", ">", new A2.c(this, 3), 24), b() ? "?" : "");
    }

    public final String toString() {
        return i(false) + " (Kotlin reflection is not available)";
    }
}
