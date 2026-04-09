package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.o0;
import f.AbstractC5487d;
import java.util.List;
import org.snmp4j.mp.MPv3;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3973i implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3972h f30891a;

    /* renamed from: b, reason: collision with root package name */
    private int f30892b;

    /* renamed from: c, reason: collision with root package name */
    private int f30893c;

    /* renamed from: d, reason: collision with root package name */
    private int f30894d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30895a;

        static {
            int[] iArr = new int[o0.b.values().length];
            f30895a = iArr;
            try {
                iArr[o0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30895a[o0.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30895a[o0.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30895a[o0.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30895a[o0.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30895a[o0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30895a[o0.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30895a[o0.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30895a[o0.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f30895a[o0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f30895a[o0.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f30895a[o0.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f30895a[o0.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f30895a[o0.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f30895a[o0.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f30895a[o0.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f30895a[o0.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C3973i(AbstractC3972h abstractC3972h) {
        AbstractC3972h abstractC3972h2 = (AbstractC3972h) AbstractC3987x.b(abstractC3972h, "input");
        this.f30891a = abstractC3972h2;
        abstractC3972h2.f30871d = this;
    }

    public static C3973i O(AbstractC3972h abstractC3972h) {
        C3973i c3973i = abstractC3972h.f30871d;
        return c3973i != null ? c3973i : new C3973i(abstractC3972h);
    }

    private Object P(o0.b bVar, Class cls, C3978n c3978n) {
        switch (a.f30895a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(i());
            case 2:
                return z();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(q());
            case 5:
                return Integer.valueOf(h());
            case 6:
                return Long.valueOf(d());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(B());
            case 9:
                return Long.valueOf(G());
            case 10:
                return S(cls, c3978n);
            case 11:
                return Integer.valueOf(D());
            case 12:
                return Long.valueOf(j());
            case 13:
                return Integer.valueOf(s());
            case 14:
                return Long.valueOf(t());
            case 15:
                return H();
            case 16:
                return Integer.valueOf(l());
            case 17:
                return Long.valueOf(c());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private Object Q(c0 c0Var, C3978n c3978n) {
        int i10 = this.f30893c;
        this.f30893c = o0.c(o0.a(this.f30892b), 4);
        try {
            Object objB = c0Var.b();
            c0Var.h(objB, this, c3978n);
            c0Var.c(objB);
            if (this.f30892b == this.f30893c) {
                return objB;
            }
            throw InvalidProtocolBufferException.l();
        } finally {
            this.f30893c = i10;
        }
    }

    private Object R(c0 c0Var, C3978n c3978n) throws InvalidProtocolBufferException {
        int iC = this.f30891a.C();
        AbstractC3972h abstractC3972h = this.f30891a;
        if (abstractC3972h.f30868a >= abstractC3972h.f30869b) {
            throw InvalidProtocolBufferException.m();
        }
        int iL = abstractC3972h.l(iC);
        Object objB = c0Var.b();
        this.f30891a.f30868a++;
        c0Var.h(objB, this, c3978n);
        c0Var.c(objB);
        this.f30891a.a(0);
        r5.f30868a--;
        this.f30891a.k(iL);
        return objB;
    }

    private void U(int i10) throws InvalidProtocolBufferException {
        if (this.f30891a.d() != i10) {
            throw InvalidProtocolBufferException.p();
        }
    }

    private void V(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (o0.b(this.f30892b) != i10) {
            throw InvalidProtocolBufferException.g();
        }
    }

    private void W(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.l();
        }
    }

    private void X(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.l();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void A(List list) throws InvalidProtocolBufferException {
        int iB;
        if (list instanceof AbstractC3983t) {
            AbstractC5487d.a(list);
            int iB2 = o0.b(this.f30892b);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f30891a.s();
                throw null;
            }
            W(this.f30891a.C());
            this.f30891a.d();
            this.f30891a.s();
            throw null;
        }
        int iB3 = o0.b(this.f30892b);
        if (iB3 == 2) {
            int iC = this.f30891a.C();
            W(iC);
            int iD = this.f30891a.d() + iC;
            do {
                list.add(Float.valueOf(this.f30891a.s()));
            } while (this.f30891a.d() < iD);
            return;
        }
        if (iB3 != 5) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            list.add(Float.valueOf(this.f30891a.s()));
            if (this.f30891a.e()) {
                return;
            } else {
                iB = this.f30891a.B();
            }
        } while (iB == this.f30892b);
        this.f30894d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int B() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f30891a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public boolean C() {
        int i10;
        if (this.f30891a.e() || (i10 = this.f30892b) == this.f30893c) {
            return false;
        }
        return this.f30891a.E(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int D() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.f30891a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void E(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        if (o0.b(this.f30892b) != 2) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            list.add(z());
            if (this.f30891a.e()) {
                return;
            } else {
                iB = this.f30891a.B();
            }
        } while (iB == this.f30892b);
        this.f30894d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void F(List list) throws InvalidProtocolBufferException {
        int iB;
        if (list instanceof AbstractC3975k) {
            AbstractC5487d.a(list);
            int iB2 = o0.b(this.f30892b);
            if (iB2 == 1) {
                this.f30891a.o();
                throw null;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            X(this.f30891a.C());
            this.f30891a.d();
            this.f30891a.o();
            throw null;
        }
        int iB3 = o0.b(this.f30892b);
        if (iB3 == 1) {
            do {
                list.add(Double.valueOf(this.f30891a.o()));
                if (this.f30891a.e()) {
                    return;
                } else {
                    iB = this.f30891a.B();
                }
            } while (iB == this.f30892b);
            this.f30894d = iB;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iC = this.f30891a.C();
        X(iC);
        int iD = this.f30891a.d() + iC;
        do {
            list.add(Double.valueOf(this.f30891a.o()));
        } while (this.f30891a.d() < iD);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public long G() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f30891a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public String H() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        return this.f30891a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void I(List list) throws InvalidProtocolBufferException {
        int iB;
        if (list instanceof D) {
            AbstractC5487d.a(list);
            int iB2 = o0.b(this.f30892b);
            if (iB2 == 1) {
                this.f30891a.r();
                throw null;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            X(this.f30891a.C());
            this.f30891a.d();
            this.f30891a.r();
            throw null;
        }
        int iB3 = o0.b(this.f30892b);
        if (iB3 == 1) {
            do {
                list.add(Long.valueOf(this.f30891a.r()));
                if (this.f30891a.e()) {
                    return;
                } else {
                    iB = this.f30891a.B();
                }
            } while (iB == this.f30892b);
            this.f30894d = iB;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iC = this.f30891a.C();
        X(iC);
        int iD = this.f30891a.d() + iC;
        do {
            list.add(Long.valueOf(this.f30891a.r()));
        } while (this.f30891a.d() < iD);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public Object J(c0 c0Var, C3978n c3978n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        return R(c0Var, c3978n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f30891a.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K(java.util.Map r8, androidx.datastore.preferences.protobuf.F.a r9, androidx.datastore.preferences.protobuf.C3978n r10) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r7 = this;
            r0 = 2
            r7.V(r0)
            androidx.datastore.preferences.protobuf.h r1 = r7.f30891a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.h r2 = r7.f30891a
            int r1 = r2.l(r1)
            java.lang.Object r2 = r9.f30785b
            java.lang.Object r3 = r9.f30787d
        L14:
            int r4 = r7.w()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.h r5 = r7.f30891a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.C()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.o0$b r4 = r9.f30786c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r5 = r9.f30787d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.P(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.o0$b r4 = r9.f30784a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.P(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.C()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.h r8 = r7.f30891a
            r8.k(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.h r9 = r7.f30891a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C3973i.K(java.util.Map, androidx.datastore.preferences.protobuf.F$a, androidx.datastore.preferences.protobuf.n):void");
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void L(List list, c0 c0Var, C3978n c3978n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        if (o0.b(this.f30892b) != 3) {
            throw InvalidProtocolBufferException.g();
        }
        int i10 = this.f30892b;
        do {
            list.add(Q(c0Var, c3978n));
            if (this.f30891a.e() || this.f30894d != 0) {
                return;
            } else {
                iB = this.f30891a.B();
            }
        } while (iB == i10);
        this.f30894d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void M(List list, c0 c0Var, C3978n c3978n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        if (o0.b(this.f30892b) != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int i10 = this.f30892b;
        do {
            list.add(R(c0Var, c3978n));
            if (this.f30891a.e() || this.f30894d != 0) {
                return;
            } else {
                iB = this.f30891a.B();
            }
        } while (iB == i10);
        this.f30894d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public Object N(c0 c0Var, C3978n c3978n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(3);
        return Q(c0Var, c3978n);
    }

    public Object S(Class cls, C3978n c3978n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        return R(Y.a().c(cls), c3978n);
    }

    public void T(List list, boolean z10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        int iB2;
        if (o0.b(this.f30892b) != 2) {
            throw InvalidProtocolBufferException.g();
        }
        if (!(list instanceof B) || z10) {
            do {
                list.add(z10 ? H() : v());
                if (this.f30891a.e()) {
                    return;
                } else {
                    iB = this.f30891a.B();
                }
            } while (iB == this.f30892b);
            this.f30894d = iB;
            return;
        }
        B b10 = (B) list;
        do {
            b10.d0(z());
            if (this.f30891a.e()) {
                return;
            } else {
                iB2 = this.f30891a.B();
            }
        } while (iB2 == this.f30892b);
        this.f30894d = iB2;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int a() {
        return this.f30892b;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void b(List list) throws InvalidProtocolBufferException {
        int iB;
        if (list instanceof AbstractC3986w) {
            AbstractC5487d.a(list);
            int iB2 = o0.b(this.f30892b);
            if (iB2 == 0) {
                this.f30891a.x();
                throw null;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            this.f30891a.C();
            this.f30891a.d();
            this.f30891a.x();
            throw null;
        }
        int iB3 = o0.b(this.f30892b);
        if (iB3 == 0) {
            do {
                list.add(Integer.valueOf(this.f30891a.x()));
                if (this.f30891a.e()) {
                    return;
                } else {
                    iB = this.f30891a.B();
                }
            } while (iB == this.f30892b);
            this.f30894d = iB;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iD = this.f30891a.d() + this.f30891a.C();
        do {
            list.add(Integer.valueOf(this.f30891a.x()));
        } while (this.f30891a.d() < iD);
        U(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public long c() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f30891a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public long d() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.f30891a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void e(List list) throws InvalidProtocolBufferException {
        int iB;
        if (list instanceof AbstractC3986w) {
            AbstractC5487d.a(list);
            int iB2 = o0.b(this.f30892b);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f30891a.v();
                throw null;
            }
            W(this.f30891a.C());
            this.f30891a.d();
            this.f30891a.v();
            throw null;
        }
        int iB3 = o0.b(this.f30892b);
        if (iB3 == 2) {
            int iC = this.f30891a.C();
            W(iC);
            int iD = this.f30891a.d() + iC;
            do {
                list.add(Integer.valueOf(this.f30891a.v()));
            } while (this.f30891a.d() < iD);
            return;
        }
        if (iB3 != 5) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            list.add(Integer.valueOf(this.f30891a.v()));
            if (this.f30891a.e()) {
                return;
            } else {
                iB = this.f30891a.B();
            }
        } while (iB == this.f30892b);
        this.f30894d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void f(List list) throws InvalidProtocolBufferException {
        int iB;
        if (list instanceof D) {
            AbstractC5487d.a(list);
            int iB2 = o0.b(this.f30892b);
            if (iB2 == 0) {
                this.f30891a.y();
                throw null;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            this.f30891a.C();
            this.f30891a.d();
            this.f30891a.y();
            throw null;
        }
        int iB3 = o0.b(this.f30892b);
        if (iB3 == 0) {
            do {
                list.add(Long.valueOf(this.f30891a.y()));
                if (this.f30891a.e()) {
                    return;
                } else {
                    iB = this.f30891a.B();
                }
            } while (iB == this.f30892b);
            this.f30894d = iB;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iD = this.f30891a.d() + this.f30891a.C();
        do {
            list.add(Long.valueOf(this.f30891a.y()));
        } while (this.f30891a.d() < iD);
        U(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void g(List list) throws InvalidProtocolBufferException {
        int iB;
        if (list instanceof AbstractC3986w) {
            AbstractC5487d.a(list);
            int iB2 = o0.b(this.f30892b);
            if (iB2 == 0) {
                this.f30891a.C();
                throw null;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            this.f30891a.C();
            this.f30891a.d();
            this.f30891a.C();
            throw null;
        }
        int iB3 = o0.b(this.f30892b);
        if (iB3 == 0) {
            do {
                list.add(Integer.valueOf(this.f30891a.C()));
                if (this.f30891a.e()) {
                    return;
                } else {
                    iB = this.f30891a.B();
                }
            } while (iB == this.f30892b);
            this.f30894d = iB;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iD = this.f30891a.d() + this.f30891a.C();
        do {
            list.add(Integer.valueOf(this.f30891a.C()));
        } while (this.f30891a.d() < iD);
        U(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int h() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.f30891a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public boolean i() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f30891a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public long j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.f30891a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void k(List list) throws InvalidProtocolBufferException {
        int iB;
        if (list instanceof D) {
            AbstractC5487d.a(list);
            int iB2 = o0.b(this.f30892b);
            if (iB2 == 0) {
                this.f30891a.D();
                throw null;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            this.f30891a.C();
            this.f30891a.d();
            this.f30891a.D();
            throw null;
        }
        int iB3 = o0.b(this.f30892b);
        if (iB3 == 0) {
            do {
                list.add(Long.valueOf(this.f30891a.D()));
                if (this.f30891a.e()) {
                    return;
                } else {
                    iB = this.f30891a.B();
                }
            } while (iB == this.f30892b);
            this.f30894d = iB;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iD = this.f30891a.d() + this.f30891a.C();
        do {
            list.add(Long.valueOf(this.f30891a.D()));
        } while (this.f30891a.d() < iD);
        U(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int l() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f30891a.C();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void m(List list) throws InvalidProtocolBufferException {
        int iB;
        if (list instanceof D) {
            AbstractC5487d.a(list);
            int iB2 = o0.b(this.f30892b);
            if (iB2 == 0) {
                this.f30891a.u();
                throw null;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            this.f30891a.C();
            this.f30891a.d();
            this.f30891a.u();
            throw null;
        }
        int iB3 = o0.b(this.f30892b);
        if (iB3 == 0) {
            do {
                list.add(Long.valueOf(this.f30891a.u()));
                if (this.f30891a.e()) {
                    return;
                } else {
                    iB = this.f30891a.B();
                }
            } while (iB == this.f30892b);
            this.f30894d = iB;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iD = this.f30891a.d() + this.f30891a.C();
        do {
            list.add(Long.valueOf(this.f30891a.u()));
        } while (this.f30891a.d() < iD);
        U(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void n(List list) throws InvalidProtocolBufferException {
        int iB;
        if (list instanceof D) {
            AbstractC5487d.a(list);
            int iB2 = o0.b(this.f30892b);
            if (iB2 == 1) {
                this.f30891a.w();
                throw null;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            X(this.f30891a.C());
            this.f30891a.d();
            this.f30891a.w();
            throw null;
        }
        int iB3 = o0.b(this.f30892b);
        if (iB3 == 1) {
            do {
                list.add(Long.valueOf(this.f30891a.w()));
                if (this.f30891a.e()) {
                    return;
                } else {
                    iB = this.f30891a.B();
                }
            } while (iB == this.f30892b);
            this.f30894d = iB;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iC = this.f30891a.C();
        X(iC);
        int iD = this.f30891a.d() + iC;
        do {
            list.add(Long.valueOf(this.f30891a.w()));
        } while (this.f30891a.d() < iD);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void o(List list) throws InvalidProtocolBufferException {
        int iB;
        if (list instanceof AbstractC3986w) {
            AbstractC5487d.a(list);
            int iB2 = o0.b(this.f30892b);
            if (iB2 == 0) {
                this.f30891a.t();
                throw null;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            this.f30891a.C();
            this.f30891a.d();
            this.f30891a.t();
            throw null;
        }
        int iB3 = o0.b(this.f30892b);
        if (iB3 == 0) {
            do {
                list.add(Integer.valueOf(this.f30891a.t()));
                if (this.f30891a.e()) {
                    return;
                } else {
                    iB = this.f30891a.B();
                }
            } while (iB == this.f30892b);
            this.f30894d = iB;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iD = this.f30891a.d() + this.f30891a.C();
        do {
            list.add(Integer.valueOf(this.f30891a.t()));
        } while (this.f30891a.d() < iD);
        U(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void p(List list) throws InvalidProtocolBufferException {
        int iB;
        if (list instanceof AbstractC3986w) {
            AbstractC5487d.a(list);
            int iB2 = o0.b(this.f30892b);
            if (iB2 == 0) {
                this.f30891a.p();
                throw null;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            this.f30891a.C();
            this.f30891a.d();
            this.f30891a.p();
            throw null;
        }
        int iB3 = o0.b(this.f30892b);
        if (iB3 == 0) {
            do {
                list.add(Integer.valueOf(this.f30891a.p()));
                if (this.f30891a.e()) {
                    return;
                } else {
                    iB = this.f30891a.B();
                }
            } while (iB == this.f30892b);
            this.f30894d = iB;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iD = this.f30891a.d() + this.f30891a.C();
        do {
            list.add(Integer.valueOf(this.f30891a.p()));
        } while (this.f30891a.d() < iD);
        U(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int q() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f30891a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void r(List list) throws InvalidProtocolBufferException {
        int iB;
        if (list instanceof AbstractC3986w) {
            AbstractC5487d.a(list);
            int iB2 = o0.b(this.f30892b);
            if (iB2 != 2) {
                if (iB2 != 5) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f30891a.q();
                throw null;
            }
            W(this.f30891a.C());
            this.f30891a.d();
            this.f30891a.q();
            throw null;
        }
        int iB3 = o0.b(this.f30892b);
        if (iB3 == 2) {
            int iC = this.f30891a.C();
            W(iC);
            int iD = this.f30891a.d() + iC;
            do {
                list.add(Integer.valueOf(this.f30891a.q()));
            } while (this.f30891a.d() < iD);
            return;
        }
        if (iB3 != 5) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            list.add(Integer.valueOf(this.f30891a.q()));
            if (this.f30891a.e()) {
                return;
            } else {
                iB = this.f30891a.B();
            }
        } while (iB == this.f30892b);
        this.f30894d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.f30891a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.f30891a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int s() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f30891a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public long t() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f30891a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void u(List list) throws InvalidProtocolBufferException {
        int iB;
        if (list instanceof AbstractC3969e) {
            AbstractC5487d.a(list);
            int iB2 = o0.b(this.f30892b);
            if (iB2 == 0) {
                this.f30891a.m();
                throw null;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            this.f30891a.C();
            this.f30891a.d();
            this.f30891a.m();
            throw null;
        }
        int iB3 = o0.b(this.f30892b);
        if (iB3 == 0) {
            do {
                list.add(Boolean.valueOf(this.f30891a.m()));
                if (this.f30891a.e()) {
                    return;
                } else {
                    iB = this.f30891a.B();
                }
            } while (iB == this.f30892b);
            this.f30894d = iB;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iD = this.f30891a.d() + this.f30891a.C();
        do {
            list.add(Boolean.valueOf(this.f30891a.m()));
        } while (this.f30891a.d() < iD);
        U(iD);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public String v() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        return this.f30891a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int w() {
        int i10 = this.f30894d;
        if (i10 != 0) {
            this.f30892b = i10;
            this.f30894d = 0;
        } else {
            this.f30892b = this.f30891a.B();
        }
        int i11 = this.f30892b;
        return (i11 == 0 || i11 == this.f30893c) ? MPv3.MAX_MESSAGE_ID : o0.a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void x(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void y(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public AbstractC3971g z() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        return this.f30891a.n();
    }
}
