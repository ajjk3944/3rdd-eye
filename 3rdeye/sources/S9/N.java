package S9;

import Q9.AbstractC1520b;
import R9.AbstractC1564a;
import S9.z;
import java.util.Arrays;
import t4.C5606d;

/* compiled from: StreamingJsonDecoder.kt */
/* loaded from: classes3.dex */
public final class N extends I9.g implements R9.h {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1564a f12044b;

    /* renamed from: c, reason: collision with root package name */
    public final T f12045c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1569a f12046d;

    /* renamed from: e, reason: collision with root package name */
    public final T9.a f12047e;

    /* renamed from: f, reason: collision with root package name */
    public int f12048f;

    /* renamed from: g, reason: collision with root package name */
    public final R9.g f12049g;

    /* renamed from: h, reason: collision with root package name */
    public final v f12050h;

    /* compiled from: StreamingJsonDecoder.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f12051a;
    }

    /* compiled from: StreamingJsonDecoder.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12052a;

        static {
            int[] iArr = new int[T.values().length];
            try {
                iArr[T.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[T.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[T.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[T.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f12052a = iArr;
        }
    }

    public N(AbstractC1564a json, T mode, AbstractC1569a abstractC1569a, O9.e descriptor, a aVar) {
        kotlin.jvm.internal.l.f(json, "json");
        kotlin.jvm.internal.l.f(mode, "mode");
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        this.f12044b = json;
        this.f12045c = mode;
        this.f12046d = abstractC1569a;
        this.f12047e = json.f11782b;
        this.f12048f = -1;
        R9.g gVar = json.f11781a;
        this.f12049g = gVar;
        this.f12050h = gVar.f11802d ? null : new v(descriptor);
    }

    @Override // I9.g, P9.d
    public final P9.d A(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return P.a(descriptor) ? new C1587t(this.f12046d, this.f12044b) : this;
    }

    @Override // I9.g, P9.d
    public final <T> T B(M9.b deserializer) {
        AbstractC1569a abstractC1569a = this.f12046d;
        AbstractC1564a abstractC1564a = this.f12044b;
        kotlin.jvm.internal.l.f(deserializer, "deserializer");
        try {
            if (!(deserializer instanceof AbstractC1520b)) {
                return (T) deserializer.deserialize(this);
            }
            R9.g gVar = abstractC1564a.f11781a;
            String strF = abstractC1569a.f(C5606d.m(deserializer.getDescriptor(), abstractC1564a));
            if (strF != null) {
                a().T(strF, ((AbstractC1520b) deserializer).a());
            }
            return (T) C5606d.r(this, deserializer);
        } catch (M9.c e4) {
            String message = e4.getMessage();
            kotlin.jvm.internal.l.c(message);
            if (y9.q.b0(message, "at path", false)) {
                throw e4;
            }
            throw new M9.c(e4.f4346b, e4.getMessage() + " at path: " + abstractC1569a.f12067b.a(), e4);
        }
    }

    @Override // I9.g, P9.d
    public final short E() {
        AbstractC1569a abstractC1569a = this.f12046d;
        long j4 = abstractC1569a.j();
        short s10 = (short) j4;
        if (j4 == s10) {
            return s10;
        }
        AbstractC1569a.s(abstractC1569a, "Failed to parse short for input '" + j4 + '\'', 0, 6);
        throw null;
    }

    @Override // I9.g, P9.d
    public final float F() throws NumberFormatException {
        AbstractC1569a abstractC1569a = this.f12046d;
        String strM = abstractC1569a.m();
        try {
            float f10 = Float.parseFloat(strM);
            R9.g gVar = this.f12044b.f11781a;
            if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                return f10;
            }
            E.u.Q(abstractC1569a, Float.valueOf(f10));
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC1569a.s(abstractC1569a, androidx.work.s.e("Failed to parse type 'float' for input '", strM, '\''), 0, 6);
            throw null;
        }
    }

    @Override // I9.g, P9.d
    public final int H(O9.e enumDescriptor) {
        kotlin.jvm.internal.l.f(enumDescriptor, "enumDescriptor");
        AbstractC1569a abstractC1569a = this.f12046d;
        return y.b(enumDescriptor, this.f12044b, abstractC1569a.k(), " at path ".concat(abstractC1569a.f12067b.a()));
    }

    @Override // I9.g, P9.d
    public final double J() throws NumberFormatException {
        AbstractC1569a abstractC1569a = this.f12046d;
        String strM = abstractC1569a.m();
        try {
            double d10 = Double.parseDouble(strM);
            R9.g gVar = this.f12044b.f11781a;
            if (!Double.isInfinite(d10) && !Double.isNaN(d10)) {
                return d10;
            }
            E.u.Q(abstractC1569a, Double.valueOf(d10));
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC1569a.s(abstractC1569a, androidx.work.s.e("Failed to parse type 'double' for input '", strM, '\''), 0, 6);
            throw null;
        }
    }

    @Override // P9.d, P9.b
    public final I9.g a() {
        return this.f12047e;
    }

    @Override // I9.g, P9.b
    public final void b(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        if (this.f12044b.f11781a.f11800b && descriptor.f() == 0) {
            while (x(descriptor) != -1) {
            }
        }
        char c10 = this.f12045c.end;
        AbstractC1569a abstractC1569a = this.f12046d;
        abstractC1569a.i(c10);
        z zVar = abstractC1569a.f12067b;
        int i = zVar.f12113c;
        int[] iArr = zVar.f12112b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            zVar.f12113c = i - 1;
        }
        int i10 = zVar.f12113c;
        if (i10 != -1) {
            zVar.f12113c = i10 - 1;
        }
    }

    @Override // R9.h
    public final AbstractC1564a c() {
        return this.f12044b;
    }

    @Override // I9.g, P9.d
    public final P9.b d(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        AbstractC1564a abstractC1564a = this.f12044b;
        T tB = U.b(descriptor, abstractC1564a);
        AbstractC1569a abstractC1569a = this.f12046d;
        z zVar = abstractC1569a.f12067b;
        int i = zVar.f12113c + 1;
        zVar.f12113c = i;
        Object[] objArr = zVar.f12111a;
        if (i == objArr.length) {
            int i10 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
            kotlin.jvm.internal.l.e(objArrCopyOf, "copyOf(this, newSize)");
            zVar.f12111a = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(zVar.f12112b, i10);
            kotlin.jvm.internal.l.e(iArrCopyOf, "copyOf(this, newSize)");
            zVar.f12112b = iArrCopyOf;
        }
        zVar.f12111a[i] = descriptor;
        abstractC1569a.i(tB.begin);
        if (abstractC1569a.w() != 4) {
            int i11 = b.f12052a[tB.ordinal()];
            return (i11 == 1 || i11 == 2 || i11 == 3) ? new N(this.f12044b, tB, abstractC1569a, descriptor, null) : (this.f12045c == tB && abstractC1564a.f11781a.f11802d) ? this : new N(this.f12044b, tB, abstractC1569a, descriptor, null);
        }
        AbstractC1569a.s(abstractC1569a, "Unexpected leading comma", 0, 6);
        throw null;
    }

    @Override // I9.g, P9.d
    public final boolean f() {
        AbstractC1569a abstractC1569a = this.f12046d;
        int iX = abstractC1569a.x(abstractC1569a.y());
        if (iX >= abstractC1569a.v().length() || iX == -1) {
            AbstractC1569a.s(abstractC1569a, "EOF", 0, 6);
            throw null;
        }
        int i = iX + 1;
        int iCharAt = abstractC1569a.v().charAt(iX) | ' ';
        if (iCharAt == 102) {
            abstractC1569a.d(i, "alse");
            return false;
        }
        if (iCharAt == 116) {
            abstractC1569a.d(i, "rue");
            return true;
        }
        AbstractC1569a.s(abstractC1569a, "Expected valid boolean literal prefix, but had '" + abstractC1569a.m() + '\'', 0, 6);
        throw null;
    }

    @Override // I9.g, P9.d
    public final char g() {
        AbstractC1569a abstractC1569a = this.f12046d;
        String strM = abstractC1569a.m();
        if (strM.length() == 1) {
            return strM.charAt(0);
        }
        AbstractC1569a.s(abstractC1569a, androidx.work.s.e("Expected single char, but got '", strM, '\''), 0, 6);
        throw null;
    }

    @Override // I9.g, P9.b
    public final <T> T h(O9.e descriptor, int i, M9.b deserializer, T t10) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        kotlin.jvm.internal.l.f(deserializer, "deserializer");
        boolean z10 = this.f12045c == T.MAP && (i & 1) == 0;
        z zVar = this.f12046d.f12067b;
        if (z10) {
            int[] iArr = zVar.f12112b;
            int i10 = zVar.f12113c;
            if (iArr[i10] == -2) {
                zVar.f12111a[i10] = z.a.f12114a;
            }
        }
        T t11 = (T) super.h(descriptor, i, deserializer, t10);
        if (z10) {
            int[] iArr2 = zVar.f12112b;
            int i11 = zVar.f12113c;
            if (iArr2[i11] != -2) {
                int i12 = i11 + 1;
                zVar.f12113c = i12;
                Object[] objArr = zVar.f12111a;
                if (i12 == objArr.length) {
                    int i13 = i12 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
                    kotlin.jvm.internal.l.e(objArrCopyOf, "copyOf(this, newSize)");
                    zVar.f12111a = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf(zVar.f12112b, i13);
                    kotlin.jvm.internal.l.e(iArrCopyOf, "copyOf(this, newSize)");
                    zVar.f12112b = iArrCopyOf;
                }
            }
            Object[] objArr2 = zVar.f12111a;
            int i14 = zVar.f12113c;
            objArr2[i14] = t11;
            zVar.f12112b[i14] = -2;
        }
        return t11;
    }

    @Override // R9.h
    public final R9.i j() {
        return new C1578j(this.f12044b.f11781a, this.f12046d).b();
    }

    @Override // I9.g, P9.d
    public final int k() {
        AbstractC1569a abstractC1569a = this.f12046d;
        long j4 = abstractC1569a.j();
        int i = (int) j4;
        if (j4 == i) {
            return i;
        }
        AbstractC1569a.s(abstractC1569a, "Failed to parse int for input '" + j4 + '\'', 0, 6);
        throw null;
    }

    @Override // I9.g, P9.d
    public final String l() {
        return this.f12046d.k();
    }

    @Override // I9.g, P9.d
    public final long m() {
        return this.f12046d.j();
    }

    @Override // I9.g, P9.d
    public final boolean p() {
        v vVar = this.f12050h;
        if (!(vVar != null ? vVar.f12109b : false)) {
            AbstractC1569a abstractC1569a = this.f12046d;
            int iX = abstractC1569a.x(abstractC1569a.y());
            int length = abstractC1569a.v().length() - iX;
            boolean z10 = false;
            if (length >= 4 && iX != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != abstractC1569a.v().charAt(iX + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || C5606d.h(abstractC1569a.v().charAt(iX + 4)) != 0) {
                        abstractC1569a.f12066a = iX + 4;
                        z10 = true;
                    }
                }
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01de  */
    @Override // P9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int x(O9.e r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S9.N.x(O9.e):int");
    }

    @Override // I9.g, P9.d
    public final byte z() {
        AbstractC1569a abstractC1569a = this.f12046d;
        long j4 = abstractC1569a.j();
        byte b10 = (byte) j4;
        if (j4 == b10) {
            return b10;
        }
        AbstractC1569a.s(abstractC1569a, "Failed to parse byte for input '" + j4 + '\'', 0, 6);
        throw null;
    }
}
