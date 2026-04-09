package bg;

import ag.AbstractC3846d;
import inet.ipaddr.AddressValueException;
import inet.ipaddr.NetworkMismatchException;
import inet.ipaddr.c;
import inet.ipaddr.k;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes4.dex */
public abstract class d extends AbstractC3846d {

    class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        Zf.c f33281a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Zf.c f33282b;

        a(Zf.c cVar) {
            this.f33282b = cVar;
            this.f33281a = cVar;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Zf.c next() {
            Zf.c cVar = this.f33281a;
            if (cVar == null) {
                throw new NoSuchElementException();
            }
            this.f33281a = null;
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33281a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f33283a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC4108a f33284b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f33285c;

        b(Iterator it, AbstractC4108a abstractC4108a, Integer num) {
            this.f33283a = it;
            this.f33284b = abstractC4108a;
            this.f33285c = num;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Zf.c next() {
            if (this.f33283a.hasNext()) {
                return d.k1((Zf.d[]) this.f33283a.next(), this.f33284b, this.f33285c);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33283a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        Zf.d[] f33286a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Supplier f33287b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Predicate f33288c;

        c(Supplier supplier, Predicate predicate) {
            this.f33287b = supplier;
            this.f33288c = predicate;
            Zf.d[] dVarArr = (Zf.d[]) supplier.get();
            this.f33286a = dVarArr;
            if (predicate == null || !predicate.test(dVarArr)) {
                return;
            }
            this.f33286a = null;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Zf.d[] next() {
            Zf.d[] dVarArr = this.f33286a;
            if (dVarArr == null) {
                throw new NoSuchElementException();
            }
            this.f33286a = null;
            return dVarArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33286a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: bg.d$d, reason: collision with other inner class name */
    class C1165d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private boolean f33289a;

        /* renamed from: b, reason: collision with root package name */
        private final Iterator[] f33290b;

        /* renamed from: c, reason: collision with root package name */
        private Zf.d[] f33291c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f33292d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c.a f33293e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f33294f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ IntFunction f33295g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Predicate f33296h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f33297i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ IntFunction f33298j;

        C1165d(int i10, c.a aVar, int i11, IntFunction intFunction, Predicate predicate, int i12, IntFunction intFunction2) {
            this.f33292d = i10;
            this.f33293e = aVar;
            this.f33294f = i11;
            this.f33295g = intFunction;
            this.f33296h = predicate;
            this.f33297i = i12;
            this.f33298j = intFunction2;
            this.f33290b = new Iterator[i10];
            this.f33291c = aVar.d(i10);
            d(0);
            while (true) {
                i11++;
                if (i11 >= this.f33292d) {
                    break;
                }
                this.f33290b[i11] = (Iterator) this.f33295g.apply(i11);
                this.f33291c[i11] = (Zf.d) this.f33290b[i11].next();
            }
            Predicate predicate2 = this.f33296h;
            if (predicate2 == null || !predicate2.test(this.f33291c)) {
                return;
            }
            a();
        }

        private Zf.d[] a() {
            int i10 = this.f33294f;
            Zf.d[] dVarArr = null;
            while (i10 >= 0) {
                while (this.f33290b[i10].hasNext()) {
                    if (dVarArr == null) {
                        dVarArr = (Zf.d[]) this.f33291c.clone();
                    }
                    this.f33291c[i10] = (Zf.d) this.f33290b[i10].next();
                    d(i10 + 1);
                    Predicate predicate = this.f33296h;
                    if (predicate == null || !predicate.test(this.f33291c)) {
                        return dVarArr;
                    }
                    i10 = this.f33294f;
                }
                i10--;
            }
            this.f33289a = true;
            return dVarArr == null ? this.f33291c : dVarArr;
        }

        private void d(int i10) {
            while (i10 < this.f33297i) {
                this.f33290b[i10] = (Iterator) this.f33298j.apply(i10);
                this.f33291c[i10] = (Zf.d) this.f33290b[i10].next();
                i10++;
            }
            if (i10 == this.f33294f) {
                this.f33290b[i10] = (Iterator) this.f33295g.apply(i10);
                this.f33291c[i10] = (Zf.d) this.f33290b[i10].next();
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Zf.d[] next() {
            if (this.f33289a) {
                throw new NoSuchElementException();
            }
            return a();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f33289a;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class e implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        inet.ipaddr.a f33299a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ inet.ipaddr.a f33300b;

        e(inet.ipaddr.a aVar) {
            this.f33300b = aVar;
            this.f33299a = aVar;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public inet.ipaddr.a next() {
            inet.ipaddr.a aVar = this.f33299a;
            if (aVar == null) {
                throw new NoSuchElementException();
            }
            this.f33299a = null;
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33299a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f33301a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC4108a f33302b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f33303c;

        f(Iterator it, AbstractC4108a abstractC4108a, Integer num) {
            this.f33301a = it;
            this.f33302b = abstractC4108a;
            this.f33303c = num;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public inet.ipaddr.a next() {
            if (hasNext()) {
                return d.j1((Zf.d[]) this.f33301a.next(), this.f33302b, this.f33303c);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33301a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public Zf.e f33304a;

        /* renamed from: b, reason: collision with root package name */
        public Zf.e f33305b;

        /* renamed from: c, reason: collision with root package name */
        public Zf.e f33306c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f33307d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public String f33308a;

        protected h() {
        }
    }

    public static class i extends AbstractC3846d.f {

        /* renamed from: b, reason: collision with root package name */
        public final b f33309b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f33310c;

        /* renamed from: d, reason: collision with root package name */
        public final int f33311d;

        /* renamed from: e, reason: collision with root package name */
        public final String f33312e;

        /* renamed from: f, reason: collision with root package name */
        public final Character f33313f;

        /* renamed from: g, reason: collision with root package name */
        public final String f33314g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f33315h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f33316i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f33317j;

        public static class a {

            /* renamed from: j, reason: collision with root package name */
            public static final b f33318j = new b();

            /* renamed from: b, reason: collision with root package name */
            protected boolean f33320b;

            /* renamed from: c, reason: collision with root package name */
            protected int f33321c;

            /* renamed from: e, reason: collision with root package name */
            protected Character f33323e;

            /* renamed from: g, reason: collision with root package name */
            protected boolean f33325g;

            /* renamed from: h, reason: collision with root package name */
            protected boolean f33326h;

            /* renamed from: i, reason: collision with root package name */
            protected boolean f33327i;

            /* renamed from: a, reason: collision with root package name */
            protected b f33319a = f33318j;

            /* renamed from: d, reason: collision with root package name */
            protected String f33322d = "";

            /* renamed from: f, reason: collision with root package name */
            protected String f33324f = "";

            public a(int i10, char c10) {
                this.f33321c = i10;
                this.f33323e = Character.valueOf(c10);
            }

            public a a(String str) {
                this.f33324f = str;
                return this;
            }

            public a b(boolean z10) {
                this.f33320b = z10;
                return this;
            }

            public a c(int i10) {
                this.f33321c = i10;
                return this;
            }

            public a d(boolean z10) {
                this.f33325g = z10;
                return this;
            }

            public a e(String str) {
                this.f33322d = str;
                return this;
            }

            public a f(Character ch2) {
                this.f33323e = ch2;
                return this;
            }

            public a g(boolean z10) {
                this.f33326h = z10;
                return this;
            }

            public a h(b bVar) {
                this.f33319a = bVar;
                return this;
            }
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public final String f33328a;

            /* renamed from: b, reason: collision with root package name */
            public final String f33329b;

            /* renamed from: c, reason: collision with root package name */
            public final String f33330c;

            public b() {
                this(inet.ipaddr.a.f49277c, inet.ipaddr.a.f49279e, null);
            }

            public String toString() {
                return "range separator: " + this.f33328a + "\nwildcard: " + this.f33329b + "\nsingle wildcard: " + this.f33330c;
            }

            public b(String str, String str2) {
                this(inet.ipaddr.a.f49277c, str, str2);
            }

            public b(String str) {
                this(str, null, null);
            }

            public b(String str, String str2, String str3) {
                this.f33328a = str == null ? inet.ipaddr.a.f49277c : str;
                this.f33329b = str2;
                this.f33330c = str3;
            }
        }

        protected i(int i10, boolean z10, b bVar, String str, Character ch2, String str2, boolean z11, boolean z12, boolean z13) {
            this.f33310c = z10;
            this.f33309b = bVar;
            this.f33311d = i10;
            if (str == null) {
                throw new NullPointerException("segment str");
            }
            this.f33312e = str;
            this.f33313f = ch2;
            if (str2 == null) {
                throw new NullPointerException("label");
            }
            this.f33314g = str2;
            this.f33315h = z11;
            this.f33316i = z12;
            this.f33317j = z13;
        }
    }

    public d(AbstractC4109b[] abstractC4109bArr) {
        super(abstractC4109bArr);
    }

    protected static void A1(int i10, k[] kVarArr, int i11, int i12, Function function) {
        int iP1 = p1(i10, i12, i11);
        if (iP1 >= 0) {
            k kVar = kVarArr[iP1];
            if (kVar.i()) {
                return;
            }
            kVarArr[iP1] = (k) function.apply(kVar);
        }
    }

    protected static Iterator B1(int i10, c.a aVar, Supplier supplier, IntFunction intFunction, Predicate predicate) {
        return C1(i10, aVar, supplier, intFunction, predicate, i10 - 1, i10, null);
    }

    protected static Iterator C1(int i10, c.a aVar, Supplier supplier, IntFunction intFunction, Predicate predicate, int i11, int i12, IntFunction intFunction2) {
        return supplier != null ? new c(supplier, predicate) : new C1165d(i10, aVar, i11, intFunction2, predicate, i12, intFunction);
    }

    protected static Zf.d[] D1(inet.ipaddr.c cVar, int i10, Zf.d[] dVarArr, int i11, int i12, c.a aVar, BiFunction biFunction) {
        boolean zAllPrefixedAddressesAreSubnets = cVar.d().allPrefixedAddressesAreSubnets();
        int iP1 = i10 == 0 ? 0 : p1(i10, i12, i11);
        while (iP1 < dVarArr.length) {
            Integer numQ1 = q1(i11, i10, iP1);
            if (numQ1 != null) {
                dVarArr[iP1] = (Zf.d) biFunction.apply(dVarArr[iP1], numQ1);
                if (zAllPrefixedAddressesAreSubnets && (iP1 = iP1 + 1) < dVarArr.length) {
                    Arrays.fill(dVarArr, iP1, dVarArr.length, aVar.g(0, s(0)));
                }
            }
            iP1++;
        }
        return dVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static boolean E1(ag.AbstractC3846d.e r9, java.util.function.Function r10, inet.ipaddr.c.a r11, Zf.d[] r12, int r13, int r14, java.lang.Integer r15) {
        /*
            r0 = 0
            r1 = r0
        L2:
            r2 = 1
            if (r1 >= r14) goto L2f
            r3 = r12[r1]
            boolean r4 = r3.A0()
            if (r4 == 0) goto L2c
            int r14 = r3.Q()
            int r4 = r3.w0()
            int r5 = r4 - r14
            int r5 = r5 >>> r2
            int r5 = r5 + r14
            int r3 = r3.f()
            java.lang.Integer r3 = s1(r3, r15, r1)
            Zf.d r14 = r11.c(r14, r5, r3)
            int r5 = r5 + r2
            Zf.d r3 = r11.c(r5, r4, r3)
            r4 = r2
            goto L32
        L2c:
            int r1 = r1 + 1
            goto L2
        L2f:
            r14 = 0
            r3 = r14
            r4 = r0
        L32:
            if (r1 != r13) goto L6b
            if (r4 != 0) goto L6b
            r13 = r12[r1]
            int r5 = r13.f()
            java.lang.Integer r15 = s1(r5, r15, r1)
            int r6 = r15.intValue()
            int r5 = r5 - r6
            int r6 = r13.Q()
            int r13 = r13.w0()
            int r7 = r6 >>> r5
            int r8 = r13 >>> r5
            if (r7 == r8) goto L6b
            int r8 = r8 - r7
            int r14 = r8 >>> 1
            int r7 = r7 + r14
            int r14 = r7 + 1
            int r3 = r7 << r5
            r4 = -1
            int r4 = r4 << r5
            int r4 = ~r4
            r3 = r3 | r4
            int r14 = r14 << r5
            Zf.d r3 = r11.c(r6, r3, r15)
            Zf.d r13 = r11.c(r14, r13, r15)
            r14 = r3
            r3 = r13
            goto L6c
        L6b:
            r2 = r4
        L6c:
            if (r2 == 0) goto L99
            int r13 = r12.length
            Zf.d[] r15 = r11.d(r13)
            Zf.d[] r11 = r11.d(r13)
            java.lang.System.arraycopy(r12, r0, r15, r0, r1)
            java.lang.System.arraycopy(r12, r0, r11, r0, r1)
            int r0 = r1 + 1
            r15[r1] = r14
            r11[r1] = r3
            int r13 = r13 - r0
            java.lang.System.arraycopy(r12, r0, r15, r0, r13)
            java.lang.System.arraycopy(r12, r0, r11, r0, r13)
            java.lang.Object r12 = r10.apply(r15)
            Zf.e r12 = (Zf.e) r12
            java.lang.Object r10 = r10.apply(r11)
            Zf.e r10 = (Zf.e) r10
            r9.b(r12, r10)
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.d.E1(ag.d$e, java.util.function.Function, inet.ipaddr.c$a, Zf.d[], int, int, java.lang.Integer):boolean");
    }

    protected static Zf.d[] F1(Zf.d[] dVarArr, byte[] bArr, int i10, int i11, int i12, int i13, inet.ipaddr.c cVar, Integer num) {
        boolean z10;
        int i14 = i10;
        if (i11 < 0 || i11 > bArr.length) {
            throw new AddressValueException(i11);
        }
        if (i14 < 0 || i14 > i11) {
            throw new AddressValueException(i14);
        }
        AbstractC4108a abstractC4108aA = cVar.m();
        int length = dVarArr.length;
        int i15 = length * i12;
        int i16 = (i15 + i14) - i11;
        int i17 = 0;
        if (i16 < 0) {
            int i18 = i11 - i15;
            int i19 = i18 - 1;
            byte b10 = bArr[i19];
            if (b10 != 0) {
                if ((bArr[i18] >>> 7) == 0) {
                    throw new AddressValueException(b10);
                }
                if (b10 != -1) {
                    throw new AddressValueException(b10);
                }
            }
            while (i14 < i19) {
                i19--;
                if (bArr[i19] != b10) {
                    throw new AddressValueException(b10);
                }
            }
            i14 = i18;
            i16 = 0;
        }
        boolean zAllPrefixedAddressesAreSubnets = cVar.d().allPrefixedAddressesAreSubnets();
        int i20 = 0;
        int i21 = 0;
        while (true) {
            if (i20 >= i15) {
                break;
            }
            Integer numS1 = s1(i13, num, i21);
            if (zAllPrefixedAddressesAreSubnets && numS1 != null && numS1.intValue() == 0) {
                Zf.d dVarG = abstractC4108aA.g(i17, s(i17));
                if (!u1(cVar, dVarG.e())) {
                    throw new NetworkMismatchException(dVarG);
                }
                Arrays.fill(dVarArr, i21, length, dVarG);
            } else {
                int i22 = i12 + i20;
                if (i20 >= i16) {
                    z10 = zAllPrefixedAddressesAreSubnets;
                    i17 = 0;
                } else if ((bArr[i14] >>> 7) == 0) {
                    z10 = zAllPrefixedAddressesAreSubnets;
                    i20 = i16;
                } else {
                    int i23 = 0;
                    while (i20 < Math.min(i16, i22)) {
                        i20++;
                        i23 = (i23 << 8) | 255;
                        zAllPrefixedAddressesAreSubnets = zAllPrefixedAddressesAreSubnets;
                    }
                    z10 = zAllPrefixedAddressesAreSubnets;
                    i17 = i23;
                }
                while (i20 < i22) {
                    i17 = (i17 << 8) | (bArr[(i14 + i20) - i16] & 255);
                    i20++;
                }
                Zf.d dVarG2 = abstractC4108aA.g(i17, numS1);
                if (!u1(cVar, dVarG2.e())) {
                    throw new NetworkMismatchException(dVarG2);
                }
                dVarArr[i21] = dVarG2;
                i21++;
                zAllPrefixedAddressesAreSubnets = z10;
                i20 = i22;
                i17 = 0;
            }
        }
        return dVarArr;
    }

    protected static BigInteger i1(IntUnaryOperator intUnaryOperator, int i10, int i11, long j10) {
        BigInteger bigIntegerZ1 = BigInteger.ONE;
        if (i10 == 0) {
            return bigIntegerZ1;
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            long jApplyAsInt = intUnaryOperator.applyAsInt(i12);
            if (i13 == i10) {
                return z1(bigIntegerZ1, jApplyAsInt);
            }
            int i14 = i13 + i11;
            if (i10 <= i14) {
                while (i13 < i10) {
                    jApplyAsInt *= intUnaryOperator.applyAsInt(i13);
                    i13++;
                }
                return z1(bigIntegerZ1, jApplyAsInt);
            }
            while (i13 < i14) {
                jApplyAsInt *= intUnaryOperator.applyAsInt(i13);
                i13++;
            }
            do {
                i12 = i13;
                if (jApplyAsInt <= j10) {
                    i13 = i12 + 1;
                    jApplyAsInt *= intUnaryOperator.applyAsInt(i12);
                }
            } while (i13 != i10);
            return z1(bigIntegerZ1, jApplyAsInt);
            bigIntegerZ1 = z1(bigIntegerZ1, jApplyAsInt);
        }
    }

    protected static inet.ipaddr.a j1(Zf.d[] dVarArr, AbstractC4108a abstractC4108a, Integer num) {
        return abstractC4108a.B(dVarArr, num, true);
    }

    protected static Zf.c k1(Zf.d[] dVarArr, AbstractC4108a abstractC4108a, Integer num) {
        return abstractC4108a.r(dVarArr, num, true);
    }

    protected static Zf.d[] l1(Zf.c cVar, c.a aVar, IntFunction intFunction) {
        int iZ = cVar.Z();
        Zf.d[] dVarArrD = aVar.d(iZ);
        for (int i10 = 0; i10 < iZ; i10++) {
            dVarArrD[i10] = (Zf.d) intFunction.apply(i10);
        }
        return dVarArrD;
    }

    protected static long n1(IntUnaryOperator intUnaryOperator, int i10) {
        if (i10 == 0) {
            return 1L;
        }
        long jApplyAsInt = intUnaryOperator.applyAsInt(0);
        for (int i11 = 1; i11 < i10; i11++) {
            jApplyAsInt *= intUnaryOperator.applyAsInt(i11);
        }
        return jApplyAsInt;
    }

    protected static int o1(int i10, int i11, int i12) {
        return inet.ipaddr.format.validate.g.d(i10, i11, i12).intValue();
    }

    protected static int p1(int i10, int i11, int i12) {
        return inet.ipaddr.format.validate.g.e(i10, i11, i12);
    }

    protected static Integer q1(int i10, int i11, int i12) {
        return inet.ipaddr.format.validate.g.f(i10, i11, i12);
    }

    protected static Integer r1(int i10, int i11) {
        return inet.ipaddr.format.validate.g.b(i10, i11);
    }

    protected static Integer s(int i10) {
        return inet.ipaddr.format.validate.g.a(i10);
    }

    protected static Integer s1(int i10, Integer num, int i11) {
        return inet.ipaddr.format.validate.g.g(i10, num, i11);
    }

    protected static Zf.e t1(Zf.e eVar) {
        if (eVar.A0()) {
            return null;
        }
        if (eVar.i() && eVar.e().d().allPrefixedAddressesAreSubnets()) {
            return null;
        }
        return eVar;
    }

    protected static boolean u1(inet.ipaddr.c cVar, inet.ipaddr.c cVar2) {
        return cVar.d().equals(cVar2.d());
    }

    protected static Iterator v1(boolean z10, Zf.c cVar, AbstractC4108a abstractC4108a, Iterator it, Integer num) {
        return z10 ? new a(cVar) : new b(it, abstractC4108a, num);
    }

    protected static Iterator w1(boolean z10, inet.ipaddr.a aVar, AbstractC4108a abstractC4108a, Iterator it, Integer num) {
        return z10 ? new e(aVar) : new f(it, abstractC4108a, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int x1(Zf.c cVar, int i10) {
        Zf.d dVarQ = cVar.q(i10);
        return (dVarQ.w0() - dVarQ.Q()) + 1;
    }

    protected static long y1(final Zf.c cVar, int i10) {
        return n1(new IntUnaryOperator() { // from class: bg.c
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i11) {
                return d.x1(cVar, i11);
            }
        }, i10);
    }

    private static BigInteger z1(BigInteger bigInteger, long j10) {
        if (j10 == 1) {
            return bigInteger;
        }
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j10);
        return bigInteger == BigInteger.ONE ? bigIntegerValueOf : bigInteger.multiply(bigIntegerValueOf);
    }

    @Override // ag.AbstractC3846d
    protected byte[] b0(boolean z10) {
        int iF = (f() + 7) >> 3;
        byte[] bArr = new byte[iF];
        int i10 = iF - 1;
        int i11 = 8;
        for (int iH = H() - 1; iH >= 0; iH--) {
            AbstractC4109b abstractC4109bM1 = m1(iH);
            long jW1 = z10 ? abstractC4109bM1.W1() : abstractC4109bM1.a2();
            int iF2 = abstractC4109bM1.f();
            while (true) {
                if (iF2 > 0) {
                    bArr[i10] = (byte) (bArr[i10] | (jW1 << (8 - i11)));
                    jW1 >>>= i11;
                    if (iF2 < i11) {
                        i11 -= iF2;
                        break;
                    }
                    iF2 -= i11;
                    i10--;
                    i11 = 8;
                }
            }
        }
        return bArr;
    }

    @Override // ag.AbstractC3846d
    protected boolean c1(AbstractC3846d abstractC3846d) {
        return (abstractC3846d instanceof d) && super.c1(abstractC3846d);
    }

    public int hashCode() {
        int i10 = this.f26220f;
        if (i10 != 0) {
            return i10;
        }
        int iH = H();
        int iJ = 1;
        for (int i11 = 0; i11 < iH; i11++) {
            AbstractC4109b abstractC4109bM1 = m1(i11);
            iJ = AbstractC3846d.j(iJ, abstractC4109bM1.W1(), abstractC4109bM1.a2());
        }
        this.f26220f = iJ;
        return iJ;
    }

    public AbstractC4109b m1(int i10) {
        return (AbstractC4109b) super.m1(i10);
    }

    public d(AbstractC4109b[] abstractC4109bArr, boolean z10) {
        super(abstractC4109bArr, z10);
    }
}
