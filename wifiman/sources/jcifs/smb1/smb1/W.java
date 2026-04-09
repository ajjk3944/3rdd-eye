package jcifs.smb1.smb1;

/* loaded from: classes4.dex */
class W extends D {

    /* renamed from: l1, reason: collision with root package name */
    private int f50517l1;

    /* renamed from: m1, reason: collision with root package name */
    InterfaceC6267a f50518m1;

    class a implements InterfaceC6267a {

        /* renamed from: a, reason: collision with root package name */
        long f50519a;

        /* renamed from: b, reason: collision with root package name */
        long f50520b;

        /* renamed from: c, reason: collision with root package name */
        int f50521c;

        /* renamed from: d, reason: collision with root package name */
        int f50522d;

        a() {
        }

        @Override // jcifs.smb1.smb1.InterfaceC6267a
        public long a() {
            return this.f50519a * this.f50521c * this.f50522d;
        }

        public String toString() {
            return new String("SmbInfoAllocation[alloc=" + this.f50519a + ",free=" + this.f50520b + ",sectPerAlloc=" + this.f50521c + ",bytesPerSect=" + this.f50522d + "]");
        }
    }

    W(int i10) {
        this.f50517l1 = i10;
        this.f50591c = (byte) 50;
        this.f50305h1 = (byte) 3;
    }

    @Override // jcifs.smb1.smb1.D
    int E(byte[] bArr, int i10, int i11) {
        int i12 = this.f50517l1;
        if (i12 == 1) {
            return H(bArr, i10);
        }
        if (i12 == 259) {
            return I(bArr, i10);
        }
        if (i12 != 1007) {
            return 0;
        }
        return G(bArr, i10);
    }

    @Override // jcifs.smb1.smb1.D
    int F(byte[] bArr, int i10, int i11) {
        return 0;
    }

    int G(byte[] bArr, int i10) {
        a aVar = new a();
        aVar.f50519a = AbstractC6278l.l(bArr, i10);
        aVar.f50520b = AbstractC6278l.l(bArr, i10 + 8);
        aVar.f50521c = AbstractC6278l.k(bArr, i10 + 24);
        aVar.f50522d = AbstractC6278l.k(bArr, i10 + 28);
        this.f50518m1 = aVar;
        return (i10 + 32) - i10;
    }

    int H(byte[] bArr, int i10) {
        a aVar = new a();
        aVar.f50521c = AbstractC6278l.k(bArr, i10 + 4);
        aVar.f50519a = AbstractC6278l.k(bArr, i10 + 8);
        aVar.f50520b = AbstractC6278l.k(bArr, i10 + 12);
        aVar.f50522d = AbstractC6278l.j(bArr, i10 + 16);
        this.f50518m1 = aVar;
        return (i10 + 20) - i10;
    }

    int I(byte[] bArr, int i10) {
        a aVar = new a();
        aVar.f50519a = AbstractC6278l.l(bArr, i10);
        aVar.f50520b = AbstractC6278l.l(bArr, i10 + 8);
        aVar.f50521c = AbstractC6278l.k(bArr, i10 + 16);
        aVar.f50522d = AbstractC6278l.k(bArr, i10 + 20);
        this.f50518m1 = aVar;
        return (i10 + 24) - i10;
    }

    @Override // jcifs.smb1.smb1.D, jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("Trans2QueryFSInformationResponse[" + super.toString() + "]");
    }
}
