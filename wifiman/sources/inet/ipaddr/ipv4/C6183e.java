package inet.ipaddr.ipv4;

import inet.ipaddr.c;
import inet.ipaddr.g;
import inet.ipaddr.i;
import inet.ipaddr.ipv4.I;
import java.io.Serializable;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.asn1.BER;

/* renamed from: inet.ipaddr.ipv4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6183e extends inet.ipaddr.i {

    /* renamed from: j, reason: collision with root package name */
    private static c.b f49546j = inet.ipaddr.c.c();

    /* renamed from: k, reason: collision with root package name */
    private static boolean f49547k = true;

    /* renamed from: l, reason: collision with root package name */
    private static final M[] f49548l = new M[0];

    /* renamed from: m, reason: collision with root package name */
    private static final I[] f49549m = new I[0];

    /* renamed from: n, reason: collision with root package name */
    private static final C6180b[] f49550n = new C6180b[0];

    /* renamed from: inet.ipaddr.ipv4.e$a */
    public static class a extends i.a {

        /* renamed from: b, reason: collision with root package name */
        C1860a f49551b;

        /* renamed from: c, reason: collision with root package name */
        boolean f49552c;

        /* renamed from: inet.ipaddr.ipv4.e$a$a, reason: collision with other inner class name */
        protected static class C1860a implements Serializable {

            /* renamed from: a, reason: collision with root package name */
            private transient M f49553a;

            /* renamed from: b, reason: collision with root package name */
            private transient M f49554b;

            /* renamed from: c, reason: collision with root package name */
            private transient M[] f49555c;

            /* renamed from: d, reason: collision with root package name */
            private transient M[][] f49556d;

            /* renamed from: e, reason: collision with root package name */
            private transient M[] f49557e;

            protected C1860a() {
            }
        }

        public a(C6183e c6183e) {
            super(c6183e);
            this.f49552c = true;
            this.f49551b = new C1860a();
        }

        @Override // inet.ipaddr.i.a
        protected int M0() {
            return 4;
        }

        @Override // inet.ipaddr.i.a
        /* renamed from: N0, reason: merged with bridge method [inline-methods] */
        public C6180b E(I i10) {
            return new C6180b(i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.i.a
        /* renamed from: P0, reason: merged with bridge method [inline-methods] */
        public C6180b J(I i10, CharSequence charSequence) {
            return E(i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.format.validate.f
        /* renamed from: T0, reason: merged with bridge method [inline-methods] */
        public C6180b l(I i10, CharSequence charSequence, Zf.f fVar, C6180b c6180b, C6180b c6180b2) {
            C6180b c6180b3 = (C6180b) h(i10, fVar);
            c6180b3.v1(c6180b, c6180b2);
            return c6180b3;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.i.a
        /* renamed from: U0, reason: merged with bridge method [inline-methods] */
        public C6180b S(M[] mArr) {
            return (C6180b) super.S(mArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.i.a
        /* renamed from: V0, reason: merged with bridge method [inline-methods] */
        public I d0(inet.ipaddr.j jVar, M[] mArr) {
            return new I.a(jVar, mArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // bg.AbstractC4108a, inet.ipaddr.format.validate.f
        /* renamed from: W0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public I r(M[] mArr, Integer num, boolean z10) {
            return new I(mArr, false, num, z10);
        }

        protected I X0(byte[] bArr, int i10, int i11, int i12, Integer num) {
            return new I(bArr, i10, i11, i12, num);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // bg.AbstractC4108a
        /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
        public I C(byte[] bArr, int i10, Integer num, boolean z10) {
            return new I(bArr, i10, num, false, z10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // inet.ipaddr.format.validate.f
        /* renamed from: Z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public I t(M[] mArr) {
            return new I(mArr, false);
        }

        @Override // inet.ipaddr.c.a
        /* renamed from: a1, reason: merged with bridge method [inline-methods] */
        public M a(int i10) {
            if (!this.f49552c || i10 < 0 || i10 > 255) {
                return new M(i10);
            }
            M[] mArr = this.f49551b.f49555c;
            if (mArr != null) {
                M m10 = mArr[i10];
                if (m10 == null) {
                    m10 = new M(i10);
                    mArr[i10] = m10;
                }
                return m10;
            }
            C1860a c1860a = this.f49551b;
            M[] mArr2 = new M[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            c1860a.f49555c = mArr2;
            M m11 = new M(i10);
            mArr2[i10] = m11;
            return m11;
        }

        @Override // inet.ipaddr.format.validate.f, inet.ipaddr.c.a
        /* renamed from: b1, reason: merged with bridge method [inline-methods] */
        public M c(int i10, int i11, Integer num) {
            if (num == null) {
                if (i10 == i11) {
                    return a(i10);
                }
                if (this.f49552c && i10 == 0 && i11 == 255) {
                    M m10 = this.f49551b.f49554b;
                    if (m10 != null) {
                        return m10;
                    }
                    C1860a c1860a = this.f49551b;
                    M m11 = new M(0, 255, null);
                    c1860a.f49554b = m11;
                    return m11;
                }
            } else {
                if (i10 == i11) {
                    return g(i10, num);
                }
                if (this.f49552c && i10 >= 0 && i10 <= 255 && i11 >= 0 && i11 <= 255 && num.intValue() >= 0 && num.intValue() <= 32) {
                    if (num.intValue() == 0 && e().d().allPrefixedAddressesAreSubnets()) {
                        return g(0, inet.ipaddr.i.h(0));
                    }
                    if (C6183e.f49547k) {
                        if (num.intValue() > 8) {
                            num = 8;
                        }
                        if (e().d().allPrefixedAddressesAreSubnets()) {
                            int iC = e().C(num.intValue());
                            i10 &= iC;
                            if ((i11 & iC) == i10) {
                                return g(i10, num);
                            }
                            if (i10 == 0 && i11 >= iC) {
                                int iIntValue = num.intValue();
                                M[] mArr = this.f49551b.f49557e;
                                if (mArr == null) {
                                    M[] mArr2 = new M[9];
                                    this.f49551b.f49557e = mArr2;
                                    M m12 = new M(0, 255, num);
                                    mArr2[iIntValue] = m12;
                                    return m12;
                                }
                                M m13 = mArr[iIntValue];
                                if (m13 == null) {
                                    m13 = new M(0, 255, num);
                                    mArr[iIntValue] = m13;
                                }
                                return m13;
                            }
                        } else if (i10 == 0 && i11 == 255) {
                            int iIntValue2 = num.intValue();
                            M[] mArr3 = this.f49551b.f49557e;
                            if (mArr3 == null) {
                                M[] mArr4 = new M[9];
                                this.f49551b.f49557e = mArr4;
                                M m14 = new M(0, 255, num);
                                mArr4[iIntValue2] = m14;
                                return m14;
                            }
                            M m15 = mArr3[iIntValue2];
                            if (m15 == null) {
                                m15 = new M(0, 255, num);
                                mArr3[iIntValue2] = m15;
                            }
                            return m15;
                        }
                    }
                }
            }
            return new M(i10, i11, num);
        }

        @Override // inet.ipaddr.c.a
        /* renamed from: c1, reason: merged with bridge method [inline-methods] */
        public M g(int i10, Integer num) {
            int i11;
            if (num == null) {
                return a(i10);
            }
            if (this.f49552c && i10 >= 0 && i10 <= 255 && num.intValue() >= 0 && num.intValue() <= 32) {
                if (num.intValue() == 0 && e().d().allPrefixedAddressesAreSubnets()) {
                    M m10 = this.f49551b.f49553a;
                    if (m10 != null) {
                        return m10;
                    }
                    C1860a c1860a = this.f49551b;
                    M m11 = new M(0, 0);
                    c1860a.f49553a = m11;
                    return m11;
                }
                if (C6183e.f49547k) {
                    int iC = e().C(num.intValue());
                    int iIntValue = num.intValue();
                    boolean zAllPrefixedAddressesAreSubnets = e().d().allPrefixedAddressesAreSubnets();
                    if (zAllPrefixedAddressesAreSubnets) {
                        int i12 = i10 & iC;
                        i11 = i12;
                        i10 = i12 >>> (8 - num.intValue());
                    } else {
                        i11 = i10;
                    }
                    M[][] mArr = this.f49551b.f49556d;
                    int i13 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (mArr == null) {
                        M[][] mArr2 = new M[9][];
                        this.f49551b.f49556d = mArr2;
                        if (zAllPrefixedAddressesAreSubnets) {
                            i13 = 1 << iIntValue;
                        }
                        M[] mArr3 = new M[i13];
                        mArr2[iIntValue] = mArr3;
                        M m12 = new M(i11, num);
                        mArr3[i10] = m12;
                        return m12;
                    }
                    M[] mArr4 = mArr[iIntValue];
                    if (mArr4 != null) {
                        M m13 = mArr4[i10];
                        if (m13 != null) {
                            return m13;
                        }
                        M m14 = new M(i11, num);
                        mArr4[i10] = m14;
                        return m14;
                    }
                    if (zAllPrefixedAddressesAreSubnets) {
                        i13 = 1 << iIntValue;
                    }
                    M[] mArr5 = new M[i13];
                    mArr[iIntValue] = mArr5;
                    M m15 = new M(i11, num);
                    mArr5[i10] = m15;
                    return m15;
                }
            }
            return new M(i10, num);
        }

        @Override // inet.ipaddr.format.validate.f, inet.ipaddr.c.a
        /* renamed from: d1, reason: merged with bridge method [inline-methods] */
        public M[] d(int i10) {
            return i10 == 0 ? C6183e.f49548l : new M[i10];
        }

        @Override // inet.ipaddr.i.a
        /* renamed from: e1, reason: merged with bridge method [inline-methods] */
        public C6183e e() {
            return (C6183e) super.e();
        }

        @Override // inet.ipaddr.format.validate.f
        public int y() {
            return 255;
        }
    }

    public C6183e() {
        super(C6180b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ M q0(C6180b c6180b, Integer num) {
        return c6180b.q(num.intValue());
    }

    @Override // inet.ipaddr.i
    protected BiFunction E() {
        return new BiFunction() { // from class: inet.ipaddr.ipv4.c
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C6183e.q0((C6180b) obj, (Integer) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // inet.ipaddr.i
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public a j() {
        return new a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // inet.ipaddr.i
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public C6180b l() {
        a aVarA = a();
        M mA = aVarA.a(0);
        M[] mArrD = aVarA.d(4);
        mArrD[0] = aVarA.a(BER.MAX_OID_LENGTH);
        mArrD[2] = mA;
        mArrD[1] = mA;
        mArrD[3] = aVarA.a(1);
        return aVarA.S(mArrD);
    }

    @Override // inet.ipaddr.c
    public c.b d() {
        return f49546j;
    }

    @Override // inet.ipaddr.i
    /* renamed from: d0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a m() {
        return (a) super.m();
    }

    protected boolean f0(C6183e c6183e) {
        return super.g(c6183e);
    }

    @Override // inet.ipaddr.i
    public g.a n0() {
        return g.a.IPV4;
    }

    @Override // inet.ipaddr.i
    protected Function y() {
        return new Function() { // from class: inet.ipaddr.ipv4.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((C6180b) obj).b1();
            }
        };
    }
}
