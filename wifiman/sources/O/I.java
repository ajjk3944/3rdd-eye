package o;

import Zg.AbstractC3682n;
import dh.InterfaceC5380e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import nh.InterfaceC6944a;
import nh.InterfaceC6949f;
import o.T;
import org.snmp4j.asn1.BER;
import p.AbstractC7176d;
import zi.AbstractC8782l;
import zi.AbstractC8783m;

/* loaded from: classes.dex */
public final class I extends T {

    /* renamed from: e, reason: collision with root package name */
    private int f54882e;

    private final class a extends T.a implements Set, InterfaceC6949f {

        /* renamed from: o.I$a$a, reason: collision with other inner class name */
        public static final class C1993a implements Iterator, InterfaceC6944a {

            /* renamed from: a, reason: collision with root package name */
            private int f54884a = -1;

            /* renamed from: b, reason: collision with root package name */
            private final Iterator f54885b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ I f54886c;

            /* renamed from: o.I$a$a$a, reason: collision with other inner class name */
            static final class C1994a extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

                /* renamed from: b, reason: collision with root package name */
                Object f54887b;

                /* renamed from: c, reason: collision with root package name */
                Object f54888c;

                /* renamed from: d, reason: collision with root package name */
                Object f54889d;

                /* renamed from: e, reason: collision with root package name */
                int f54890e;

                /* renamed from: f, reason: collision with root package name */
                int f54891f;

                /* renamed from: g, reason: collision with root package name */
                int f54892g;

                /* renamed from: h, reason: collision with root package name */
                int f54893h;

                /* renamed from: i, reason: collision with root package name */
                long f54894i;

                /* renamed from: j, reason: collision with root package name */
                int f54895j;

                /* renamed from: k, reason: collision with root package name */
                private /* synthetic */ Object f54896k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ I f54897l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ C1993a f54898m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1994a(I i10, C1993a c1993a, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f54897l = i10;
                    this.f54898m = c1993a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    C1994a c1994a = new C1994a(this.f54897l, this.f54898m, interfaceC5380e);
                    c1994a.f54896k = obj;
                    return c1994a;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0057 -> B:23:0x00ad). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:14:0x006f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0078 -> B:20:0x009f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009c -> B:20:0x009f). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                    /*
                        r22 = this;
                        r0 = r22
                        java.lang.Object r1 = eh.AbstractC5467b.g()
                        int r2 = r0.f54895j
                        r4 = 8
                        r5 = 1
                        if (r2 == 0) goto L36
                        if (r2 != r5) goto L2e
                        int r2 = r0.f54893h
                        int r6 = r0.f54892g
                        long r7 = r0.f54894i
                        int r9 = r0.f54891f
                        int r10 = r0.f54890e
                        java.lang.Object r11 = r0.f54889d
                        long[] r11 = (long[]) r11
                        java.lang.Object r12 = r0.f54888c
                        o.I r12 = (o.I) r12
                        java.lang.Object r13 = r0.f54887b
                        o.I$a$a r13 = (o.I.a.C1993a) r13
                        java.lang.Object r14 = r0.f54896k
                        zi.l r14 = (zi.AbstractC8782l) r14
                        Yg.v.b(r23)
                        goto L9f
                    L2e:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L36:
                        Yg.v.b(r23)
                        java.lang.Object r2 = r0.f54896k
                        zi.l r2 = (zi.AbstractC8782l) r2
                        o.I r6 = r0.f54897l
                        o.I$a$a r7 = r0.f54898m
                        long[] r8 = r6.f54928a
                        int r9 = r8.length
                        int r9 = r9 + (-2)
                        if (r9 < 0) goto Lb2
                        r10 = 0
                    L49:
                        r11 = r8[r10]
                        long r13 = ~r11
                        r15 = 7
                        long r13 = r13 << r15
                        long r13 = r13 & r11
                        r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                        long r13 = r13 & r15
                        int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                        if (r13 == 0) goto Lad
                        int r13 = r10 - r9
                        int r13 = ~r13
                        int r13 = r13 >>> 31
                        int r13 = 8 - r13
                        r14 = r2
                        r2 = 0
                        r19 = r11
                        r12 = r6
                        r11 = r8
                        r6 = r13
                        r13 = r7
                        r7 = r19
                        r21 = r10
                        r10 = r9
                        r9 = r21
                    L6f:
                        if (r2 >= r6) goto La2
                        r15 = 255(0xff, double:1.26E-321)
                        long r15 = r15 & r7
                        r17 = 128(0x80, double:6.3E-322)
                        int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                        if (r15 >= 0) goto L9f
                        int r15 = r9 << 3
                        int r15 = r15 + r2
                        r13.d(r15)
                        java.lang.Object[] r3 = r12.f54929b
                        r3 = r3[r15]
                        r0.f54896k = r14
                        r0.f54887b = r13
                        r0.f54888c = r12
                        r0.f54889d = r11
                        r0.f54890e = r10
                        r0.f54891f = r9
                        r0.f54894i = r7
                        r0.f54892g = r6
                        r0.f54893h = r2
                        r0.f54895j = r5
                        java.lang.Object r3 = r14.d(r3, r0)
                        if (r3 != r1) goto L9f
                        return r1
                    L9f:
                        long r7 = r7 >> r4
                        int r2 = r2 + r5
                        goto L6f
                    La2:
                        if (r6 != r4) goto Lb2
                        r8 = r11
                        r6 = r12
                        r7 = r13
                        r2 = r14
                        r19 = r10
                        r10 = r9
                        r9 = r19
                    Lad:
                        if (r10 == r9) goto Lb2
                        int r10 = r10 + 1
                        goto L49
                    Lb2:
                        Yg.J r1 = Yg.J.f24997a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.I.a.C1993a.C1994a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AbstractC8782l abstractC8782l, InterfaceC5380e interfaceC5380e) {
                    return ((C1994a) create(abstractC8782l, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            C1993a(I i10) {
                this.f54886c = i10;
                this.f54885b = AbstractC8783m.a(new C1994a(i10, this, null));
            }

            public final void d(int i10) {
                this.f54884a = i10;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f54885b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                return this.f54885b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                int i10 = this.f54884a;
                if (i10 != -1) {
                    this.f54886c.y(i10);
                    this.f54884a = -1;
                }
            }
        }

        public a() {
            super();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            return I.this.h(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection elements) {
            AbstractC6492s.i(elements, "elements");
            return I.this.i(elements);
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            I.this.m();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C1993a(I.this);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return I.this.x(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection elements) {
            AbstractC6492s.i(elements, "elements");
            int iC = I.this.c();
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                I.this.t(it.next());
            }
            return iC != I.this.c();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection elements) {
            AbstractC6492s.i(elements, "elements");
            I i10 = I.this;
            long[] jArr = i10.f54928a;
            int length = jArr.length - 2;
            boolean z10 = false;
            if (length >= 0) {
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    long j10 = jArr[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j10) < 128) {
                                int i14 = (i11 << 3) + i13;
                                if (!elements.contains(i10.f54929b[i14])) {
                                    i10.y(i14);
                                    z11 = true;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i12 != 8) {
                            return z11;
                        }
                    }
                    if (i11 == length) {
                        z10 = z11;
                        break;
                    }
                    i11++;
                }
            }
            return z10;
        }
    }

    public I(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC7176d.a("Capacity must be a positive value.");
        }
        s(S.g(i10));
    }

    private final int o(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & BER.MAX_OID_LENGTH;
        int i13 = this.f54930c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f54928a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (AbstractC6492s.d(this.f54929b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iP = p(i11);
                if (this.f54882e == 0 && ((this.f54928a[iP >> 3] >> ((iP & 7) << 3)) & 255) != 254) {
                    k();
                    iP = p(i11);
                }
                this.f54931d++;
                int i19 = this.f54882e;
                long[] jArr2 = this.f54928a;
                int i20 = iP >> 3;
                long j14 = jArr2[i20];
                int i21 = (iP & 7) << 3;
                this.f54882e = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f54930c;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iP - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iP;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int p(int i10) {
        int i11 = this.f54930c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f54928a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void q() {
        this.f54882e = S.c(b()) - this.f54931d;
    }

    private final void r(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = S.f54926a;
        } else {
            jArr = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC3682n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f54928a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        q();
    }

    private final void s(int i10) {
        int iMax = i10 > 0 ? Math.max(7, S.f(i10)) : 0;
        this.f54930c = iMax;
        r(iMax);
        this.f54929b = new Object[iMax];
    }

    public final boolean h(Object obj) {
        int iC = c();
        this.f54929b[o(obj)] = obj;
        return c() != iC;
    }

    public final boolean i(Iterable elements) {
        AbstractC6492s.i(elements, "elements");
        int iC = c();
        u(elements);
        return iC != c();
    }

    public final boolean j(T elements) {
        AbstractC6492s.i(elements, "elements");
        int iC = c();
        w(elements);
        return iC != c();
    }

    public final void k() {
        if (this.f54930c <= 8 || Long.compareUnsigned(Yg.E.b(Yg.E.b(this.f54931d) * 32), Yg.E.b(Yg.E.b(this.f54930c) * 25)) > 0) {
            z(S.e(this.f54930c));
        } else {
            n();
        }
    }

    public final Set l() {
        return new a();
    }

    public final void m() {
        this.f54931d = 0;
        long[] jArr = this.f54928a;
        if (jArr != S.f54926a) {
            AbstractC3682n.x(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f54928a;
            int i10 = this.f54930c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC3682n.v(this.f54929b, null, 0, this.f54930c);
        q();
    }

    public final void n() {
        int i10;
        long[] jArr = this.f54928a;
        int i11 = this.f54930c;
        Object[] objArr = this.f54929b;
        S.a(jArr, i11);
        int i12 = 0;
        int i13 = 0;
        int iB = -1;
        while (i13 != i11) {
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j10 = (jArr[i14] >> i15) & 255;
            if (j10 == 128) {
                iB = i13;
                i13++;
            } else {
                if (j10 == 254) {
                    Object obj = objArr[i13];
                    int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                    int i16 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                    int iP = p(i16);
                    int i17 = i16 & i11;
                    if (((iP - i17) & i11) / 8 == ((i13 - i17) & i11) / 8) {
                        jArr[i14] = ((r9 & BER.MAX_OID_LENGTH) << i15) | ((~(255 << i15)) & jArr[i14]);
                        jArr[AbstractC3682n.f0(jArr)] = (jArr[i12] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i18 = iP >> 3;
                        long j11 = jArr[i18];
                        int i19 = (iP & 7) << 3;
                        if (((j11 >> i19) & 255) == 128) {
                            int i20 = i13;
                            jArr[i18] = ((r9 & BER.MAX_OID_LENGTH) << i19) | (j11 & (~(255 << i19)));
                            jArr[i14] = (jArr[i14] & (~(255 << i15))) | (128 << i15);
                            objArr[iP] = objArr[i20];
                            objArr[i20] = null;
                            i10 = i20;
                            iB = i10;
                        } else {
                            int i21 = i13;
                            jArr[i18] = ((r9 & BER.MAX_OID_LENGTH) << i19) | (j11 & (~(255 << i19)));
                            if (iB == -1) {
                                iB = S.b(jArr, i21 + 1, i11);
                            }
                            objArr[iB] = objArr[iP];
                            objArr[iP] = objArr[i21];
                            objArr[i21] = objArr[iB];
                            i10 = i21 - 1;
                        }
                        jArr[AbstractC3682n.f0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i13 = i10 + 1;
                        i12 = 0;
                    }
                }
                i13++;
            }
        }
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f54930c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f54928a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f54929b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.AbstractC6492s.d(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.y(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.I.t(java.lang.Object):void");
    }

    public final void u(Iterable elements) {
        AbstractC6492s.i(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
    }

    public final void v(Object obj) {
        this.f54929b[o(obj)] = obj;
    }

    public final void w(T elements) {
        AbstractC6492s.i(elements, "elements");
        Object[] objArr = elements.f54929b;
        long[] jArr = elements.f54928a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        v(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f54930c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f54928a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f54929b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.AbstractC6492s.d(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.y(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.I.x(java.lang.Object):boolean");
    }

    public final void y(int i10) {
        this.f54931d--;
        long[] jArr = this.f54928a;
        int i11 = this.f54930c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f54929b[i10] = null;
    }

    public final void z(int i10) {
        long[] jArr = this.f54928a;
        Object[] objArr = this.f54929b;
        int i11 = this.f54930c;
        s(i10);
        long[] jArr2 = this.f54928a;
        Object[] objArr2 = this.f54929b;
        int i12 = this.f54930c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iP = p(i14 >>> 7);
                long j10 = i14 & BER.MAX_OID_LENGTH;
                int i15 = iP >> 3;
                int i16 = (iP & 7) << 3;
                long j11 = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                jArr2[i15] = j11;
                jArr2[(((iP - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr2[iP] = obj;
            }
        }
    }

    public /* synthetic */ I(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
