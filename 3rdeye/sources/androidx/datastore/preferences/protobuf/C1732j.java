package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;

/* compiled from: CodedInputStreamReader.java */
/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1732j implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1731i f15645a;

    /* renamed from: b, reason: collision with root package name */
    public int f15646b;

    /* renamed from: c, reason: collision with root package name */
    public int f15647c;

    /* renamed from: d, reason: collision with root package name */
    public int f15648d = 0;

    /* compiled from: CodedInputStreamReader.java */
    /* renamed from: androidx.datastore.preferences.protobuf.j$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15649a;

        static {
            int[] iArr = new int[r0.values().length];
            f15649a = iArr;
            try {
                iArr[r0.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15649a[r0.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15649a[r0.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15649a[r0.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15649a[r0.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15649a[r0.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15649a[r0.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15649a[r0.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15649a[r0.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15649a[r0.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15649a[r0.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15649a[r0.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15649a[r0.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15649a[r0.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15649a[r0.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15649a[r0.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15649a[r0.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C1732j(AbstractC1731i abstractC1731i) {
        C1746y.a(abstractC1731i, "input");
        this.f15645a = abstractC1731i;
        abstractC1731i.f15610d = this;
    }

    public static void l(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C1747z.e();
        }
    }

    public static void m(int i) throws IOException {
        if ((i & 7) != 0) {
            throw C1747z.e();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final <T> T a(f0<T> f0Var, C1737o c1737o) throws IOException {
        k(2);
        return (T) h(f0Var, c1737o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r1.e(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void b(java.util.Map<K, V> r10, androidx.datastore.preferences.protobuf.I.a<K, V> r11, androidx.datastore.preferences.protobuf.C1737o r12) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 2
            r9.k(r0)
            androidx.datastore.preferences.protobuf.i r1 = r9.f15645a
            int r2 = r1.w()
            int r2 = r1.f(r2)
            r11.getClass()
            java.lang.String r3 = ""
            Z0.f r4 = r11.f15553c
            r5 = r4
        L16:
            int r6 = r9.getFieldNumber()     // Catch: java.lang.Throwable -> L3a
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L5c
            boolean r7 = r1.d()     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L26
            goto L5c
        L26:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L47
            if (r6 == r0) goto L3c
            boolean r6 = r9.skipField()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1747z.a -> L4f
            if (r6 == 0) goto L34
            goto L16
        L34:
            androidx.datastore.preferences.protobuf.z r6 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1747z.a -> L4f
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1747z.a -> L4f
            throw r6     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1747z.a -> L4f
        L3a:
            r10 = move-exception
            goto L63
        L3c:
            androidx.datastore.preferences.protobuf.r0 r6 = r11.f15552b     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1747z.a -> L4f
            java.lang.Class r7 = r4.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1747z.a -> L4f
            java.lang.Object r5 = r9.f(r6, r7, r12)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1747z.a -> L4f
            goto L16
        L47:
            androidx.datastore.preferences.protobuf.r0 r6 = r11.f15551a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1747z.a -> L4f
            r7 = 0
            java.lang.Object r3 = r9.f(r6, r7, r7)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C1747z.a -> L4f
            goto L16
        L4f:
            boolean r6 = r9.skipField()     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L56
            goto L16
        L56:
            androidx.datastore.preferences.protobuf.z r10 = new androidx.datastore.preferences.protobuf.z     // Catch: java.lang.Throwable -> L3a
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L3a
            throw r10     // Catch: java.lang.Throwable -> L3a
        L5c:
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L3a
            r1.e(r2)
            return
        L63:
            r1.e(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1732j.b(java.util.Map, androidx.datastore.preferences.protobuf.I$a, androidx.datastore.preferences.protobuf.o):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.e0
    public final <T> void c(List<T> list, f0<T> f0Var, C1737o c1737o) throws IOException {
        int iV;
        int i = this.f15646b;
        if ((i & 7) != 3) {
            throw C1747z.b();
        }
        do {
            list.add(g(f0Var, c1737o));
            AbstractC1731i abstractC1731i = this.f15645a;
            if (abstractC1731i.d() || this.f15648d != 0) {
                return;
            } else {
                iV = abstractC1731i.v();
            }
        } while (iV == i);
        this.f15648d = iV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.e0
    public final <T> void d(List<T> list, f0<T> f0Var, C1737o c1737o) throws IOException {
        int iV;
        int i = this.f15646b;
        if ((i & 7) != 2) {
            throw C1747z.b();
        }
        do {
            list.add(h(f0Var, c1737o));
            AbstractC1731i abstractC1731i = this.f15645a;
            if (abstractC1731i.d() || this.f15648d != 0) {
                return;
            } else {
                iV = abstractC1731i.v();
            }
        } while (iV == i);
        this.f15648d = iV;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final <T> T e(f0<T> f0Var, C1737o c1737o) throws IOException {
        k(3);
        return (T) g(f0Var, c1737o);
    }

    public final Object f(r0 r0Var, Class<?> cls, C1737o c1737o) throws IOException {
        switch (a.f15649a[r0Var.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                k(2);
                return h(b0.f15581c.a(cls), c1737o);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public final <T> T g(f0<T> f0Var, C1737o c1737o) throws IOException {
        int i = this.f15647c;
        this.f15647c = ((this.f15646b >>> 3) << 3) | 4;
        try {
            T tNewInstance = f0Var.newInstance();
            f0Var.a(tNewInstance, this, c1737o);
            f0Var.makeImmutable(tNewInstance);
            if (this.f15646b == this.f15647c) {
                return tNewInstance;
            }
            throw C1747z.e();
        } finally {
            this.f15647c = i;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final int getFieldNumber() throws IOException {
        int i = this.f15648d;
        if (i != 0) {
            this.f15646b = i;
            this.f15648d = 0;
        } else {
            this.f15646b = this.f15645a.v();
        }
        int i10 = this.f15646b;
        if (i10 == 0 || i10 == this.f15647c) {
            return Integer.MAX_VALUE;
        }
        return i10 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final int getTag() {
        return this.f15646b;
    }

    public final <T> T h(f0<T> f0Var, C1737o c1737o) throws IOException {
        AbstractC1731i abstractC1731i = this.f15645a;
        int iW = abstractC1731i.w();
        if (abstractC1731i.f15607a >= abstractC1731i.f15608b) {
            throw new C1747z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iF = abstractC1731i.f(iW);
        T tNewInstance = f0Var.newInstance();
        abstractC1731i.f15607a++;
        f0Var.a(tNewInstance, this, c1737o);
        f0Var.makeImmutable(tNewInstance);
        abstractC1731i.a(0);
        abstractC1731i.f15607a--;
        abstractC1731i.e(iF);
        return tNewInstance;
    }

    public final void i(List<String> list, boolean z10) throws IOException {
        int iV;
        int iV2;
        if ((this.f15646b & 7) != 2) {
            throw C1747z.b();
        }
        boolean z11 = list instanceof E;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z11 || z10) {
            do {
                list.add(z10 ? readStringRequireUtf8() : readString());
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV = abstractC1731i.v();
                }
            } while (iV == this.f15646b);
            this.f15648d = iV;
            return;
        }
        E e4 = (E) list;
        do {
            e4.a(readBytes());
            if (abstractC1731i.d()) {
                return;
            } else {
                iV2 = abstractC1731i.v();
            }
        } while (iV2 == this.f15646b);
        this.f15648d = iV2;
    }

    public final void j(int i) throws IOException {
        if (this.f15645a.c() != i) {
            throw C1747z.f();
        }
    }

    public final void k(int i) throws IOException {
        if ((this.f15646b & 7) != i) {
            throw C1747z.b();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final boolean readBool() throws IOException {
        k(0);
        return this.f15645a.g();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readBoolList(List<Boolean> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1727e;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z10) {
            int i = this.f15646b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC1731i.g()));
                    if (abstractC1731i.d()) {
                        return;
                    } else {
                        iV = abstractC1731i.v();
                    }
                } while (iV == this.f15646b);
                this.f15648d = iV;
                return;
            }
            if (i != 2) {
                throw C1747z.b();
            }
            int iC = abstractC1731i.c() + abstractC1731i.w();
            do {
                list.add(Boolean.valueOf(abstractC1731i.g()));
            } while (abstractC1731i.c() < iC);
            j(iC);
            return;
        }
        C1727e c1727e = (C1727e) list;
        int i10 = this.f15646b & 7;
        if (i10 == 0) {
            do {
                c1727e.addBoolean(abstractC1731i.g());
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV2 = abstractC1731i.v();
                }
            } while (iV2 == this.f15646b);
            this.f15648d = iV2;
            return;
        }
        if (i10 != 2) {
            throw C1747z.b();
        }
        int iC2 = abstractC1731i.c() + abstractC1731i.w();
        do {
            c1727e.addBoolean(abstractC1731i.g());
        } while (abstractC1731i.c() < iC2);
        j(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final AbstractC1730h readBytes() throws IOException {
        k(2);
        return this.f15645a.h();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readBytesList(List<AbstractC1730h> list) throws IOException {
        int iV;
        if ((this.f15646b & 7) != 2) {
            throw C1747z.b();
        }
        do {
            list.add(readBytes());
            AbstractC1731i abstractC1731i = this.f15645a;
            if (abstractC1731i.d()) {
                return;
            } else {
                iV = abstractC1731i.v();
            }
        } while (iV == this.f15646b);
        this.f15648d = iV;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final double readDouble() throws IOException {
        k(1);
        return this.f15645a.i();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readDoubleList(List<Double> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1735m;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z10) {
            int i = this.f15646b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(abstractC1731i.i()));
                    if (abstractC1731i.d()) {
                        return;
                    } else {
                        iV = abstractC1731i.v();
                    }
                } while (iV == this.f15646b);
                this.f15648d = iV;
                return;
            }
            if (i != 2) {
                throw C1747z.b();
            }
            int iW = abstractC1731i.w();
            m(iW);
            int iC = abstractC1731i.c() + iW;
            do {
                list.add(Double.valueOf(abstractC1731i.i()));
            } while (abstractC1731i.c() < iC);
            return;
        }
        C1735m c1735m = (C1735m) list;
        int i10 = this.f15646b & 7;
        if (i10 == 1) {
            do {
                c1735m.addDouble(abstractC1731i.i());
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV2 = abstractC1731i.v();
                }
            } while (iV2 == this.f15646b);
            this.f15648d = iV2;
            return;
        }
        if (i10 != 2) {
            throw C1747z.b();
        }
        int iW2 = abstractC1731i.w();
        m(iW2);
        int iC2 = abstractC1731i.c() + iW2;
        do {
            c1735m.addDouble(abstractC1731i.i());
        } while (abstractC1731i.c() < iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final int readEnum() throws IOException {
        k(0);
        return this.f15645a.j();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readEnumList(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1745x;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z10) {
            int i = this.f15646b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1731i.j()));
                    if (abstractC1731i.d()) {
                        return;
                    } else {
                        iV = abstractC1731i.v();
                    }
                } while (iV == this.f15646b);
                this.f15648d = iV;
                return;
            }
            if (i != 2) {
                throw C1747z.b();
            }
            int iC = abstractC1731i.c() + abstractC1731i.w();
            do {
                list.add(Integer.valueOf(abstractC1731i.j()));
            } while (abstractC1731i.c() < iC);
            j(iC);
            return;
        }
        C1745x c1745x = (C1745x) list;
        int i10 = this.f15646b & 7;
        if (i10 == 0) {
            do {
                c1745x.addInt(abstractC1731i.j());
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV2 = abstractC1731i.v();
                }
            } while (iV2 == this.f15646b);
            this.f15648d = iV2;
            return;
        }
        if (i10 != 2) {
            throw C1747z.b();
        }
        int iC2 = abstractC1731i.c() + abstractC1731i.w();
        do {
            c1745x.addInt(abstractC1731i.j());
        } while (abstractC1731i.c() < iC2);
        j(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final int readFixed32() throws IOException {
        k(5);
        return this.f15645a.k();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readFixed32List(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1745x;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z10) {
            int i = this.f15646b & 7;
            if (i == 2) {
                int iW = abstractC1731i.w();
                l(iW);
                int iC = abstractC1731i.c() + iW;
                do {
                    list.add(Integer.valueOf(abstractC1731i.k()));
                } while (abstractC1731i.c() < iC);
                return;
            }
            if (i != 5) {
                throw C1747z.b();
            }
            do {
                list.add(Integer.valueOf(abstractC1731i.k()));
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV = abstractC1731i.v();
                }
            } while (iV == this.f15646b);
            this.f15648d = iV;
            return;
        }
        C1745x c1745x = (C1745x) list;
        int i10 = this.f15646b & 7;
        if (i10 == 2) {
            int iW2 = abstractC1731i.w();
            l(iW2);
            int iC2 = abstractC1731i.c() + iW2;
            do {
                c1745x.addInt(abstractC1731i.k());
            } while (abstractC1731i.c() < iC2);
            return;
        }
        if (i10 != 5) {
            throw C1747z.b();
        }
        do {
            c1745x.addInt(abstractC1731i.k());
            if (abstractC1731i.d()) {
                return;
            } else {
                iV2 = abstractC1731i.v();
            }
        } while (iV2 == this.f15646b);
        this.f15648d = iV2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final long readFixed64() throws IOException {
        k(1);
        return this.f15645a.l();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readFixed64List(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof G;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z10) {
            int i = this.f15646b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC1731i.l()));
                    if (abstractC1731i.d()) {
                        return;
                    } else {
                        iV = abstractC1731i.v();
                    }
                } while (iV == this.f15646b);
                this.f15648d = iV;
                return;
            }
            if (i != 2) {
                throw C1747z.b();
            }
            int iW = abstractC1731i.w();
            m(iW);
            int iC = abstractC1731i.c() + iW;
            do {
                list.add(Long.valueOf(abstractC1731i.l()));
            } while (abstractC1731i.c() < iC);
            return;
        }
        G g10 = (G) list;
        int i10 = this.f15646b & 7;
        if (i10 == 1) {
            do {
                g10.addLong(abstractC1731i.l());
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV2 = abstractC1731i.v();
                }
            } while (iV2 == this.f15646b);
            this.f15648d = iV2;
            return;
        }
        if (i10 != 2) {
            throw C1747z.b();
        }
        int iW2 = abstractC1731i.w();
        m(iW2);
        int iC2 = abstractC1731i.c() + iW2;
        do {
            g10.addLong(abstractC1731i.l());
        } while (abstractC1731i.c() < iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final float readFloat() throws IOException {
        k(5);
        return this.f15645a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readFloatList(List<Float> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1742u;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z10) {
            int i = this.f15646b & 7;
            if (i == 2) {
                int iW = abstractC1731i.w();
                l(iW);
                int iC = abstractC1731i.c() + iW;
                do {
                    list.add(Float.valueOf(abstractC1731i.m()));
                } while (abstractC1731i.c() < iC);
                return;
            }
            if (i != 5) {
                throw C1747z.b();
            }
            do {
                list.add(Float.valueOf(abstractC1731i.m()));
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV = abstractC1731i.v();
                }
            } while (iV == this.f15646b);
            this.f15648d = iV;
            return;
        }
        C1742u c1742u = (C1742u) list;
        int i10 = this.f15646b & 7;
        if (i10 == 2) {
            int iW2 = abstractC1731i.w();
            l(iW2);
            int iC2 = abstractC1731i.c() + iW2;
            do {
                c1742u.addFloat(abstractC1731i.m());
            } while (abstractC1731i.c() < iC2);
            return;
        }
        if (i10 != 5) {
            throw C1747z.b();
        }
        do {
            c1742u.addFloat(abstractC1731i.m());
            if (abstractC1731i.d()) {
                return;
            } else {
                iV2 = abstractC1731i.v();
            }
        } while (iV2 == this.f15646b);
        this.f15648d = iV2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final int readInt32() throws IOException {
        k(0);
        return this.f15645a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readInt32List(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1745x;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z10) {
            int i = this.f15646b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1731i.n()));
                    if (abstractC1731i.d()) {
                        return;
                    } else {
                        iV = abstractC1731i.v();
                    }
                } while (iV == this.f15646b);
                this.f15648d = iV;
                return;
            }
            if (i != 2) {
                throw C1747z.b();
            }
            int iC = abstractC1731i.c() + abstractC1731i.w();
            do {
                list.add(Integer.valueOf(abstractC1731i.n()));
            } while (abstractC1731i.c() < iC);
            j(iC);
            return;
        }
        C1745x c1745x = (C1745x) list;
        int i10 = this.f15646b & 7;
        if (i10 == 0) {
            do {
                c1745x.addInt(abstractC1731i.n());
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV2 = abstractC1731i.v();
                }
            } while (iV2 == this.f15646b);
            this.f15648d = iV2;
            return;
        }
        if (i10 != 2) {
            throw C1747z.b();
        }
        int iC2 = abstractC1731i.c() + abstractC1731i.w();
        do {
            c1745x.addInt(abstractC1731i.n());
        } while (abstractC1731i.c() < iC2);
        j(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final long readInt64() throws IOException {
        k(0);
        return this.f15645a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readInt64List(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof G;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z10) {
            int i = this.f15646b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC1731i.o()));
                    if (abstractC1731i.d()) {
                        return;
                    } else {
                        iV = abstractC1731i.v();
                    }
                } while (iV == this.f15646b);
                this.f15648d = iV;
                return;
            }
            if (i != 2) {
                throw C1747z.b();
            }
            int iC = abstractC1731i.c() + abstractC1731i.w();
            do {
                list.add(Long.valueOf(abstractC1731i.o()));
            } while (abstractC1731i.c() < iC);
            j(iC);
            return;
        }
        G g10 = (G) list;
        int i10 = this.f15646b & 7;
        if (i10 == 0) {
            do {
                g10.addLong(abstractC1731i.o());
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV2 = abstractC1731i.v();
                }
            } while (iV2 == this.f15646b);
            this.f15648d = iV2;
            return;
        }
        if (i10 != 2) {
            throw C1747z.b();
        }
        int iC2 = abstractC1731i.c() + abstractC1731i.w();
        do {
            g10.addLong(abstractC1731i.o());
        } while (abstractC1731i.c() < iC2);
        j(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final int readSFixed32() throws IOException {
        k(5);
        return this.f15645a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readSFixed32List(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1745x;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z10) {
            int i = this.f15646b & 7;
            if (i == 2) {
                int iW = abstractC1731i.w();
                l(iW);
                int iC = abstractC1731i.c() + iW;
                do {
                    list.add(Integer.valueOf(abstractC1731i.p()));
                } while (abstractC1731i.c() < iC);
                return;
            }
            if (i != 5) {
                throw C1747z.b();
            }
            do {
                list.add(Integer.valueOf(abstractC1731i.p()));
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV = abstractC1731i.v();
                }
            } while (iV == this.f15646b);
            this.f15648d = iV;
            return;
        }
        C1745x c1745x = (C1745x) list;
        int i10 = this.f15646b & 7;
        if (i10 == 2) {
            int iW2 = abstractC1731i.w();
            l(iW2);
            int iC2 = abstractC1731i.c() + iW2;
            do {
                c1745x.addInt(abstractC1731i.p());
            } while (abstractC1731i.c() < iC2);
            return;
        }
        if (i10 != 5) {
            throw C1747z.b();
        }
        do {
            c1745x.addInt(abstractC1731i.p());
            if (abstractC1731i.d()) {
                return;
            } else {
                iV2 = abstractC1731i.v();
            }
        } while (iV2 == this.f15646b);
        this.f15648d = iV2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final long readSFixed64() throws IOException {
        k(1);
        return this.f15645a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readSFixed64List(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof G;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z10) {
            int i = this.f15646b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC1731i.q()));
                    if (abstractC1731i.d()) {
                        return;
                    } else {
                        iV = abstractC1731i.v();
                    }
                } while (iV == this.f15646b);
                this.f15648d = iV;
                return;
            }
            if (i != 2) {
                throw C1747z.b();
            }
            int iW = abstractC1731i.w();
            m(iW);
            int iC = abstractC1731i.c() + iW;
            do {
                list.add(Long.valueOf(abstractC1731i.q()));
            } while (abstractC1731i.c() < iC);
            return;
        }
        G g10 = (G) list;
        int i10 = this.f15646b & 7;
        if (i10 == 1) {
            do {
                g10.addLong(abstractC1731i.q());
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV2 = abstractC1731i.v();
                }
            } while (iV2 == this.f15646b);
            this.f15648d = iV2;
            return;
        }
        if (i10 != 2) {
            throw C1747z.b();
        }
        int iW2 = abstractC1731i.w();
        m(iW2);
        int iC2 = abstractC1731i.c() + iW2;
        do {
            g10.addLong(abstractC1731i.q());
        } while (abstractC1731i.c() < iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final int readSInt32() throws IOException {
        k(0);
        return this.f15645a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readSInt32List(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1745x;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z10) {
            int i = this.f15646b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1731i.r()));
                    if (abstractC1731i.d()) {
                        return;
                    } else {
                        iV = abstractC1731i.v();
                    }
                } while (iV == this.f15646b);
                this.f15648d = iV;
                return;
            }
            if (i != 2) {
                throw C1747z.b();
            }
            int iC = abstractC1731i.c() + abstractC1731i.w();
            do {
                list.add(Integer.valueOf(abstractC1731i.r()));
            } while (abstractC1731i.c() < iC);
            j(iC);
            return;
        }
        C1745x c1745x = (C1745x) list;
        int i10 = this.f15646b & 7;
        if (i10 == 0) {
            do {
                c1745x.addInt(abstractC1731i.r());
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV2 = abstractC1731i.v();
                }
            } while (iV2 == this.f15646b);
            this.f15648d = iV2;
            return;
        }
        if (i10 != 2) {
            throw C1747z.b();
        }
        int iC2 = abstractC1731i.c() + abstractC1731i.w();
        do {
            c1745x.addInt(abstractC1731i.r());
        } while (abstractC1731i.c() < iC2);
        j(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final long readSInt64() throws IOException {
        k(0);
        return this.f15645a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readSInt64List(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof G;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z10) {
            int i = this.f15646b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC1731i.s()));
                    if (abstractC1731i.d()) {
                        return;
                    } else {
                        iV = abstractC1731i.v();
                    }
                } while (iV == this.f15646b);
                this.f15648d = iV;
                return;
            }
            if (i != 2) {
                throw C1747z.b();
            }
            int iC = abstractC1731i.c() + abstractC1731i.w();
            do {
                list.add(Long.valueOf(abstractC1731i.s()));
            } while (abstractC1731i.c() < iC);
            j(iC);
            return;
        }
        G g10 = (G) list;
        int i10 = this.f15646b & 7;
        if (i10 == 0) {
            do {
                g10.addLong(abstractC1731i.s());
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV2 = abstractC1731i.v();
                }
            } while (iV2 == this.f15646b);
            this.f15648d = iV2;
            return;
        }
        if (i10 != 2) {
            throw C1747z.b();
        }
        int iC2 = abstractC1731i.c() + abstractC1731i.w();
        do {
            g10.addLong(abstractC1731i.s());
        } while (abstractC1731i.c() < iC2);
        j(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final String readString() throws IOException {
        k(2);
        return this.f15645a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readStringList(List<String> list) throws IOException {
        i(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readStringListRequireUtf8(List<String> list) throws IOException {
        i(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final String readStringRequireUtf8() throws IOException {
        k(2);
        return this.f15645a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final int readUInt32() throws IOException {
        k(0);
        return this.f15645a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readUInt32List(List<Integer> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof C1745x;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z10) {
            int i = this.f15646b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC1731i.w()));
                    if (abstractC1731i.d()) {
                        return;
                    } else {
                        iV = abstractC1731i.v();
                    }
                } while (iV == this.f15646b);
                this.f15648d = iV;
                return;
            }
            if (i != 2) {
                throw C1747z.b();
            }
            int iC = abstractC1731i.c() + abstractC1731i.w();
            do {
                list.add(Integer.valueOf(abstractC1731i.w()));
            } while (abstractC1731i.c() < iC);
            j(iC);
            return;
        }
        C1745x c1745x = (C1745x) list;
        int i10 = this.f15646b & 7;
        if (i10 == 0) {
            do {
                c1745x.addInt(abstractC1731i.w());
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV2 = abstractC1731i.v();
                }
            } while (iV2 == this.f15646b);
            this.f15648d = iV2;
            return;
        }
        if (i10 != 2) {
            throw C1747z.b();
        }
        int iC2 = abstractC1731i.c() + abstractC1731i.w();
        do {
            c1745x.addInt(abstractC1731i.w());
        } while (abstractC1731i.c() < iC2);
        j(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final long readUInt64() throws IOException {
        k(0);
        return this.f15645a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void readUInt64List(List<Long> list) throws IOException {
        int iV;
        int iV2;
        boolean z10 = list instanceof G;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (!z10) {
            int i = this.f15646b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC1731i.x()));
                    if (abstractC1731i.d()) {
                        return;
                    } else {
                        iV = abstractC1731i.v();
                    }
                } while (iV == this.f15646b);
                this.f15648d = iV;
                return;
            }
            if (i != 2) {
                throw C1747z.b();
            }
            int iC = abstractC1731i.c() + abstractC1731i.w();
            do {
                list.add(Long.valueOf(abstractC1731i.x()));
            } while (abstractC1731i.c() < iC);
            j(iC);
            return;
        }
        G g10 = (G) list;
        int i10 = this.f15646b & 7;
        if (i10 == 0) {
            do {
                g10.addLong(abstractC1731i.x());
                if (abstractC1731i.d()) {
                    return;
                } else {
                    iV2 = abstractC1731i.v();
                }
            } while (iV2 == this.f15646b);
            this.f15648d = iV2;
            return;
        }
        if (i10 != 2) {
            throw C1747z.b();
        }
        int iC2 = abstractC1731i.c() + abstractC1731i.w();
        do {
            g10.addLong(abstractC1731i.x());
        } while (abstractC1731i.c() < iC2);
        j(iC2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final boolean skipField() throws IOException {
        int i;
        AbstractC1731i abstractC1731i = this.f15645a;
        if (abstractC1731i.d() || (i = this.f15646b) == this.f15647c) {
            return false;
        }
        return abstractC1731i.y(i);
    }
}
