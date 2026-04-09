package inet.ipaddr.ipv6;

import inet.ipaddr.c;
import inet.ipaddr.g;
import inet.ipaddr.i;
import inet.ipaddr.ipv6.C6205b;
import inet.ipaddr.ipv6.Q;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.conscrypt.PSKKeyManager;

/* renamed from: inet.ipaddr.ipv6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6208e extends inet.ipaddr.i {

    /* renamed from: j, reason: collision with root package name */
    private static c.b f49676j = inet.ipaddr.c.c();

    /* renamed from: k, reason: collision with root package name */
    static final V[] f49677k = new V[0];

    /* renamed from: l, reason: collision with root package name */
    private static final Q[] f49678l = new Q[0];

    /* renamed from: m, reason: collision with root package name */
    private static final C6205b[] f49679m = new C6205b[0];

    /* renamed from: n, reason: collision with root package name */
    private static boolean f49680n = true;

    public C6208e() {
        super(C6205b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ V d0(C6205b c6205b, Integer num) {
        return c6205b.q(num.intValue());
    }

    @Override // inet.ipaddr.i
    protected BiFunction E() {
        return new BiFunction() { // from class: inet.ipaddr.ipv6.c
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C6208e.d0((C6205b) obj, (Integer) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // inet.ipaddr.i
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public a j() {
        return new a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // inet.ipaddr.i
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public C6205b l() {
        a aVarM = m();
        V vA = aVarM.a(0);
        V[] vArrD = aVarM.d(8);
        vArrD[6] = vA;
        vArrD[5] = vA;
        vArrD[4] = vA;
        vArrD[3] = vA;
        vArrD[2] = vA;
        vArrD[1] = vA;
        vArrD[0] = vA;
        vArrD[7] = aVarM.a(1);
        return aVarM.S(vArrD);
    }

    @Override // inet.ipaddr.i
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public a m() {
        return (a) super.m();
    }

    protected boolean b0(C6208e c6208e) {
        return super.g(c6208e);
    }

    @Override // inet.ipaddr.c
    public c.b d() {
        return f49676j;
    }

    @Override // inet.ipaddr.i
    public g.a n0() {
        return g.a.IPV6;
    }

    @Override // inet.ipaddr.i
    protected Function y() {
        return new Function() { // from class: inet.ipaddr.ipv6.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((C6205b) obj).v();
            }
        };
    }

    /* renamed from: inet.ipaddr.ipv6.e$a */
    public static class a extends i.a {

        /* renamed from: b, reason: collision with root package name */
        C1862a f49681b;

        /* renamed from: c, reason: collision with root package name */
        boolean f49682c;

        /* renamed from: inet.ipaddr.ipv6.e$a$a, reason: collision with other inner class name */
        protected static class C1862a implements Serializable {

            /* renamed from: a, reason: collision with root package name */
            private transient V f49683a;

            /* renamed from: b, reason: collision with root package name */
            private transient V f49684b;

            /* renamed from: c, reason: collision with root package name */
            private transient V[][] f49685c;

            /* renamed from: d, reason: collision with root package name */
            private transient V[][][] f49686d;

            /* renamed from: e, reason: collision with root package name */
            private transient V[] f49687e;

            /* renamed from: f, reason: collision with root package name */
            private transient LinkedHashMap f49688f = new C1863a(16, 0.75f, true);

            /* renamed from: g, reason: collision with root package name */
            private ReadWriteLock f49689g = new ReentrantReadWriteLock();

            /* renamed from: h, reason: collision with root package name */
            private transient C6205b.c[] f49690h = new C6205b.c[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

            /* renamed from: inet.ipaddr.ipv6.e$a$a$a, reason: collision with other inner class name */
            class C1863a extends LinkedHashMap {
                C1863a(int i10, float f10, boolean z10) {
                    super(i10, f10, z10);
                }

                @Override // java.util.LinkedHashMap
                protected boolean removeEldestEntry(Map.Entry entry) {
                    return size() > 100;
                }
            }

            protected C1862a() {
            }
        }

        public a(C6208e c6208e) {
            super(c6208e);
            this.f49682c = true;
            this.f49681b = new C1862a();
        }

        private C6205b.c i1(String str) {
            C6205b.c cVar;
            int iA = C6205b.c.a(str);
            if (iA >= 0) {
                if (iA < this.f49681b.f49690h.length) {
                    cVar = this.f49681b.f49690h[iA];
                    if (cVar == null) {
                        cVar = new C6205b.c(iA);
                        this.f49681b.f49690h[iA] = cVar;
                    }
                } else {
                    cVar = new C6205b.c(iA);
                }
                cVar.f49672a = str;
                return cVar;
            }
            Lock lock = this.f49681b.f49689g.readLock();
            lock.lock();
            C6205b.c cVar2 = (C6205b.c) this.f49681b.f49688f.get(str);
            lock.unlock();
            if (cVar2 != null) {
                return cVar2;
            }
            C6205b.c cVar3 = new C6205b.c(str);
            Lock lockWriteLock = this.f49681b.f49689g.writeLock();
            lockWriteLock.lock();
            C6205b.c cVar4 = (C6205b.c) this.f49681b.f49688f.get(str);
            if (cVar4 == null) {
                this.f49681b.f49688f.put(str, cVar3);
            } else {
                cVar3 = cVar4;
            }
            lockWriteLock.unlock();
            return cVar3;
        }

        @Override // inet.ipaddr.i.a
        protected int M0() {
            return 8;
        }

        @Override // inet.ipaddr.i.a
        /* renamed from: N0, reason: merged with bridge method [inline-methods] */
        public C6205b E(Q q10) {
            return new C6205b(q10);
        }

        public C6205b P0(Q q10, C6205b.c cVar) {
            return cVar == null ? E(q10) : new C6205b(q10, cVar);
        }

        public C6205b T0(V[] vArr, C6205b.c cVar) {
            return cVar == null ? S(vArr) : P0(t(vArr), cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.i.a
        /* renamed from: U0, reason: merged with bridge method [inline-methods] */
        public C6205b J(Q q10, CharSequence charSequence) {
            if (charSequence == null || charSequence.length() == 0) {
                return E(q10);
            }
            String strTrim = charSequence.toString().trim();
            return strTrim.length() == 0 ? E(q10) : P0(q10, i1(strTrim));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.format.validate.f
        /* renamed from: V0, reason: merged with bridge method [inline-methods] */
        public C6205b l(Q q10, CharSequence charSequence, Zf.f fVar, C6205b c6205b, C6205b c6205b2) {
            C6205b c6205b3 = (C6205b) j(q10, charSequence, fVar);
            c6205b3.w1(c6205b, c6205b2);
            return c6205b3;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.i.a
        /* renamed from: W0, reason: merged with bridge method [inline-methods] */
        public C6205b S(V[] vArr) {
            return (C6205b) super.S(vArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.i.a
        /* renamed from: X0, reason: merged with bridge method [inline-methods] */
        public Q d0(inet.ipaddr.j jVar, V[] vArr) {
            return new Q.d((Q) jVar, vArr, 0);
        }

        protected Q Y0(Q q10, V[] vArr, int i10) {
            return new Q.d(q10, vArr, i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // bg.AbstractC4108a, inet.ipaddr.format.validate.f
        /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
        public Q r(V[] vArr, Integer num, boolean z10) {
            return new Q(vArr, 0, false, num, z10);
        }

        protected Q a1(byte[] bArr, int i10, int i11, int i12, Integer num) {
            return new Q(bArr, i10, i11, i12, num, true, false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // bg.AbstractC4108a
        /* renamed from: b1, reason: merged with bridge method [inline-methods] */
        public Q C(byte[] bArr, int i10, Integer num, boolean z10) {
            return new Q(bArr, i10, num, false, z10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.format.validate.f
        /* renamed from: c1, reason: merged with bridge method [inline-methods] */
        public Q t(V[] vArr) {
            return new Q(vArr, 0, false);
        }

        protected Q d1(V[] vArr, int i10) {
            return new Q(vArr, i10, false);
        }

        @Override // inet.ipaddr.c.a
        /* renamed from: e1, reason: merged with bridge method [inline-methods] */
        public V a(int i10) {
            if (!this.f49682c || i10 < 0 || i10 > 65535) {
                return new V(i10);
            }
            V[][] vArr = this.f49681b.f49685c;
            int i11 = i10 >>> 8;
            int i12 = i10 - (i11 << 8);
            if (vArr == null) {
                V[][] vArr2 = new V[511][];
                this.f49681b.f49685c = vArr2;
                V[] vArr3 = new V[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                vArr2[i11] = vArr3;
                V v10 = new V(i10);
                vArr3[i12] = v10;
                return v10;
            }
            V[] vArr4 = vArr[i11];
            if (vArr4 == null) {
                V[] vArr5 = new V[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                vArr[i11] = vArr5;
                V v11 = new V(i10);
                vArr5[i12] = v11;
                return v11;
            }
            V v12 = vArr4[i12];
            if (v12 != null) {
                return v12;
            }
            V v13 = new V(i10);
            vArr4[i12] = v13;
            return v13;
        }

        @Override // inet.ipaddr.format.validate.f, inet.ipaddr.c.a
        /* renamed from: f1, reason: merged with bridge method [inline-methods] */
        public V c(int i10, int i11, Integer num) {
            if (num == null) {
                if (i10 == i11) {
                    return a(i10);
                }
                if (this.f49682c && i10 == 0 && i11 == 65535) {
                    V v10 = this.f49681b.f49684b;
                    if (v10 != null) {
                        return v10;
                    }
                    C1862a c1862a = this.f49681b;
                    V v11 = new V(0, 65535, null);
                    c1862a.f49684b = v11;
                    return v11;
                }
            } else {
                if (i10 == i11) {
                    return g(i10, num);
                }
                if (this.f49682c && i10 >= 0 && i10 <= 65535 && i11 >= 0 && i11 <= 65535 && num.intValue() >= 0 && num.intValue() <= 128) {
                    if (num.intValue() == 0 && e().d().allPrefixedAddressesAreSubnets()) {
                        return g(0, num);
                    }
                    if (C6208e.f49680n) {
                        if (num.intValue() > 16) {
                            num = 16;
                        }
                        if (e().d().allPrefixedAddressesAreSubnets()) {
                            int iC = e().C(num.intValue());
                            i10 &= iC;
                            if ((iC & i11) == i10) {
                                return g(i10, num);
                            }
                            i11 |= e().B(num.intValue());
                        }
                        if (i10 == 0 && i11 == 65535) {
                            int iIntValue = num.intValue();
                            V[] vArr = this.f49681b.f49687e;
                            if (vArr == null) {
                                V[] vArr2 = new V[17];
                                this.f49681b.f49687e = vArr2;
                                V v12 = new V(0, 65535, num);
                                vArr2[iIntValue] = v12;
                                return v12;
                            }
                            V v13 = vArr[iIntValue];
                            if (v13 == null) {
                                v13 = new V(0, 65535, num);
                                vArr[iIntValue] = v13;
                            }
                            return v13;
                        }
                    }
                }
            }
            return new V(i10, i11, num);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
        @Override // inet.ipaddr.c.a
        /* renamed from: g1, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public inet.ipaddr.ipv6.V g(int r12, java.lang.Integer r13) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.ipv6.C6208e.a.g(int, java.lang.Integer):inet.ipaddr.ipv6.V");
        }

        @Override // inet.ipaddr.format.validate.f, inet.ipaddr.c.a
        /* renamed from: h1, reason: merged with bridge method [inline-methods] */
        public V[] d(int i10) {
            return i10 == 0 ? C6208e.f49677k : new V[i10];
        }

        @Override // inet.ipaddr.i.a
        /* renamed from: j1, reason: merged with bridge method [inline-methods] */
        public C6208e e() {
            return (C6208e) super.e();
        }

        @Override // inet.ipaddr.format.validate.f
        public int y() {
            return 65535;
        }

        protected a(C6208e c6208e, C1862a c1862a) {
            super(c6208e);
            this.f49682c = true;
            this.f49681b = c1862a;
        }
    }
}
