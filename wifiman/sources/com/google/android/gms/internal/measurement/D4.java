package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public abstract class D4 extends N3 {
    private static Map<Class<?>, D4> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected K5 zzb = K5.k();

    protected static class a extends Q3 {
        public a(D4 d42) {
        }
    }

    public static abstract class b extends O3 {

        /* renamed from: a, reason: collision with root package name */
        private final D4 f34973a;

        /* renamed from: b, reason: collision with root package name */
        protected D4 f34974b;

        protected b(D4 d42) {
            this.f34973a = d42;
            if (d42.E()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f34974b = d42.w();
        }

        private static void m(Object obj, Object obj2) {
            C4471u5.a().c(obj).c(obj, obj2);
        }

        private final b t(byte[] bArr, int i10, int i11, C4431p4 c4431p4) throws zzkq {
            if (!this.f34974b.E()) {
                r();
            }
            try {
                C4471u5.a().c(this.f34974b).e(this.f34974b, bArr, 0, i11, new U3(c4431p4));
                return this;
            } catch (zzkq e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw zzkq.l();
            }
        }

        @Override // com.google.android.gms.internal.measurement.O3
        public /* synthetic */ Object clone() {
            b bVar = (b) this.f34973a.o(c.f34979e, null, null);
            bVar.f34974b = (D4) C();
            return bVar;
        }

        @Override // com.google.android.gms.internal.measurement.O3
        public final /* synthetic */ O3 f(byte[] bArr, int i10, int i11) {
            return t(bArr, 0, i11, C4431p4.f35429c);
        }

        @Override // com.google.android.gms.internal.measurement.O3
        public final /* synthetic */ O3 h(byte[] bArr, int i10, int i11, C4431p4 c4431p4) {
            return t(bArr, 0, i11, c4431p4);
        }

        public final b l(D4 d42) {
            if (this.f34973a.equals(d42)) {
                return this;
            }
            if (!this.f34974b.E()) {
                r();
            }
            m(this.f34974b, d42);
            return this;
        }

        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final D4 p() {
            D4 d42 = (D4) C();
            if (d42.D()) {
                return d42;
            }
            throw new zzmw(d42);
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC4357g5
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public D4 C() {
            if (!this.f34974b.E()) {
                return this.f34974b;
            }
            this.f34974b.A();
            return this.f34974b;
        }

        protected final void q() {
            if (this.f34974b.E()) {
                return;
            }
            r();
        }

        protected void r() {
            D4 d4W = this.f34973a.w();
            m(d4W, this.f34974b);
            this.f34974b = d4W;
        }
    }

    public enum c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f34975a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f34976b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f34977c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f34978d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f34979e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f34980f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f34981g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f34982h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f34982h.clone();
        }
    }

    public static class d extends AbstractC4439q4 {
    }

    private final int j() {
        return C4471u5.a().c(this).zzb(this);
    }

    static D4 l(Class cls) throws ClassNotFoundException {
        D4 d42 = zzc.get(cls);
        if (d42 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                d42 = zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (d42 == null) {
            d42 = (D4) ((D4) N5.b(cls)).o(c.f34980f, null, null);
            if (d42 == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, d42);
        }
        return d42;
    }

    protected static J4 m(J4 j42) {
        return j42.zza(j42.size() << 1);
    }

    protected static L4 n(L4 l42) {
        return l42.zza(l42.size() << 1);
    }

    protected static Object p(InterfaceC4366h5 interfaceC4366h5, String str, Object[] objArr) {
        return new C4479v5(interfaceC4366h5, str, objArr);
    }

    static Object q(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static void r(Class cls, D4 d42) {
        d42.B();
        zzc.put(cls, d42);
    }

    private final int s(InterfaceC4495x5 interfaceC4495x5) {
        return interfaceC4495x5 == null ? C4471u5.a().c(this).zza(this) : interfaceC4495x5.zza(this);
    }

    private static final boolean t(D4 d42, boolean z10) {
        byte bByteValue = ((Byte) d42.o(c.f34975a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zA = C4471u5.a().c(d42).a(d42);
        if (z10) {
            d42.o(c.f34976b, zA ? d42 : null, null);
        }
        return zA;
    }

    protected static K4 x() {
        return G4.f();
    }

    protected static J4 y() {
        return S4.f();
    }

    protected static L4 z() {
        return C4463t5.g();
    }

    protected final void A() {
        C4471u5.a().c(this).b(this);
        B();
    }

    final void B() {
        this.zzd &= MPv3.MAX_MESSAGE_ID;
    }

    public final boolean D() {
        return t(this, true);
    }

    final boolean E() {
        return (this.zzd & PduHandle.NONE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.N3
    final int a(InterfaceC4495x5 interfaceC4495x5) {
        if (!E()) {
            if (h() != Integer.MAX_VALUE) {
                return h();
            }
            int iS = s(interfaceC4495x5);
            g(iS);
            return iS;
        }
        int iS2 = s(interfaceC4495x5);
        if (iS2 >= 0) {
            return iS2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iS2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4366h5
    public final void b(zzjr zzjrVar) {
        C4471u5.a().c(this).d(this, C4423o4.I(zzjrVar));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4384j5
    public final /* synthetic */ InterfaceC4366h5 c() {
        return (D4) o(c.f34980f, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4366h5
    public final int d() {
        return a(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4366h5
    public final /* synthetic */ InterfaceC4357g5 e() {
        return (b) o(c.f34979e, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C4471u5.a().c(this).f(this, (D4) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.N3
    final void g(int i10) {
        if (i10 >= 0) {
            this.zzd = (i10 & MPv3.MAX_MESSAGE_ID) | (this.zzd & PduHandle.NONE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N3
    final int h() {
        return this.zzd & MPv3.MAX_MESSAGE_ID;
    }

    public int hashCode() {
        if (E()) {
            return j();
        }
        if (this.zza == 0) {
            this.zza = j();
        }
        return this.zza;
    }

    protected final b k(D4 d42) {
        return u().l(d42);
    }

    protected abstract Object o(int i10, Object obj, Object obj2);

    public String toString() {
        return AbstractC4375i5.a(this, super.toString());
    }

    protected final b u() {
        return (b) o(c.f34979e, null, null);
    }

    public final b v() {
        return ((b) o(c.f34979e, null, null)).l(this);
    }

    final D4 w() {
        return (D4) o(c.f34978d, null, null);
    }
}
