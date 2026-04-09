package jcifs.smb1.smb1;

import org.snmp4j.asn1.BER;

/* loaded from: classes4.dex */
class U extends D {

    /* renamed from: l1, reason: collision with root package name */
    int f50499l1;

    /* renamed from: m1, reason: collision with root package name */
    int f50500m1;

    /* renamed from: n1, reason: collision with root package name */
    int f50501n1;

    /* renamed from: o1, reason: collision with root package name */
    a[] f50502o1;

    class a {

        /* renamed from: a, reason: collision with root package name */
        private int f50503a;

        /* renamed from: b, reason: collision with root package name */
        private int f50504b;

        /* renamed from: c, reason: collision with root package name */
        private int f50505c;

        /* renamed from: d, reason: collision with root package name */
        private int f50506d;

        /* renamed from: e, reason: collision with root package name */
        private int f50507e;

        /* renamed from: f, reason: collision with root package name */
        private int f50508f;

        /* renamed from: g, reason: collision with root package name */
        private int f50509g;

        /* renamed from: h, reason: collision with root package name */
        private int f50510h;

        /* renamed from: i, reason: collision with root package name */
        private String f50511i;

        /* renamed from: j, reason: collision with root package name */
        int f50512j;

        /* renamed from: k, reason: collision with root package name */
        String f50513k = null;

        /* renamed from: l, reason: collision with root package name */
        String f50514l = null;

        a() {
        }

        int a(byte[] bArr, int i10, int i11) {
            int iJ = AbstractC6278l.j(bArr, i10);
            this.f50503a = iJ;
            if (iJ != 3 && iJ != 1) {
                throw new RuntimeException("Version " + this.f50503a + " referral not supported. Please report this to jcifs at samba dot org.");
            }
            this.f50504b = AbstractC6278l.j(bArr, i10 + 2);
            this.f50505c = AbstractC6278l.j(bArr, i10 + 4);
            this.f50506d = AbstractC6278l.j(bArr, i10 + 6);
            int i12 = i10 + 8;
            int i13 = this.f50503a;
            if (i13 == 3) {
                this.f50507e = AbstractC6278l.j(bArr, i12);
                this.f50512j = AbstractC6278l.j(bArr, i10 + 10);
                this.f50508f = AbstractC6278l.j(bArr, i10 + 12);
                this.f50509g = AbstractC6278l.j(bArr, i10 + 14);
                this.f50510h = AbstractC6278l.j(bArr, i10 + 16);
                U u10 = U.this;
                this.f50513k = u10.p(bArr, this.f50508f + i10, i11, (u10.f50597i & 32768) != 0);
                int i14 = this.f50510h;
                if (i14 > 0) {
                    U u11 = U.this;
                    this.f50514l = u11.p(bArr, i10 + i14, i11, (u11.f50597i & 32768) != 0);
                }
            } else if (i13 == 1) {
                U u12 = U.this;
                this.f50514l = u12.p(bArr, i12, i11, (u12.f50597i & 32768) != 0);
            }
            return this.f50504b;
        }

        public String toString() {
            return new String("Referral[version=" + this.f50503a + ",size=" + this.f50504b + ",serverType=" + this.f50505c + ",flags=" + this.f50506d + ",proximity=" + this.f50507e + ",ttl=" + this.f50512j + ",pathOffset=" + this.f50508f + ",altPathOffset=" + this.f50509g + ",nodeOffset=" + this.f50510h + ",path=" + this.f50513k + ",altPath=" + this.f50511i + ",node=" + this.f50514l + "]");
        }
    }

    U() {
        this.f50305h1 = BER.ASN_SEQUENCE;
    }

    @Override // jcifs.smb1.smb1.D
    int E(byte[] bArr, int i10, int i11) {
        int iJ = AbstractC6278l.j(bArr, i10);
        this.f50499l1 = iJ;
        int i12 = i10 + 2;
        if ((this.f50597i & 32768) != 0) {
            this.f50499l1 = iJ / 2;
        }
        this.f50500m1 = AbstractC6278l.j(bArr, i12);
        this.f50501n1 = AbstractC6278l.j(bArr, i10 + 4);
        int iA = i10 + 8;
        this.f50502o1 = new a[this.f50500m1];
        for (int i13 = 0; i13 < this.f50500m1; i13++) {
            this.f50502o1[i13] = new a();
            iA += this.f50502o1[i13].a(bArr, iA, i11);
        }
        return iA - i10;
    }

    @Override // jcifs.smb1.smb1.D
    int F(byte[] bArr, int i10, int i11) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.D, jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("Trans2GetDfsReferralResponse[" + super.toString() + ",pathConsumed=" + this.f50499l1 + ",numReferrals=" + this.f50500m1 + ",flags=" + this.f50501n1 + "]");
    }
}
