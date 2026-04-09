package jcifs.smb1.smb1;

import java.util.Date;

/* loaded from: classes4.dex */
class Y extends D {

    /* renamed from: l1, reason: collision with root package name */
    private int f50525l1;

    /* renamed from: m1, reason: collision with root package name */
    InterfaceC6273g f50526m1;

    class a implements InterfaceC6273g {

        /* renamed from: a, reason: collision with root package name */
        long f50527a;

        /* renamed from: b, reason: collision with root package name */
        long f50528b;

        /* renamed from: c, reason: collision with root package name */
        long f50529c;

        /* renamed from: d, reason: collision with root package name */
        long f50530d;

        /* renamed from: e, reason: collision with root package name */
        int f50531e;

        a() {
        }

        @Override // jcifs.smb1.smb1.InterfaceC6273g
        public long a() {
            return 0L;
        }

        @Override // jcifs.smb1.smb1.InterfaceC6273g
        public int b() {
            return this.f50531e;
        }

        @Override // jcifs.smb1.smb1.InterfaceC6273g
        public long c() {
            return this.f50527a;
        }

        @Override // jcifs.smb1.smb1.InterfaceC6273g
        public long d() {
            return this.f50529c;
        }

        public String toString() {
            return new String("SmbQueryFileBasicInfo[createTime=" + new Date(this.f50527a) + ",lastAccessTime=" + new Date(this.f50528b) + ",lastWriteTime=" + new Date(this.f50529c) + ",changeTime=" + new Date(this.f50530d) + ",attributes=0x" + Ug.d.c(this.f50531e, 4) + "]");
        }
    }

    class b implements InterfaceC6273g {

        /* renamed from: a, reason: collision with root package name */
        long f50533a;

        /* renamed from: b, reason: collision with root package name */
        long f50534b;

        /* renamed from: c, reason: collision with root package name */
        int f50535c;

        /* renamed from: d, reason: collision with root package name */
        boolean f50536d;

        /* renamed from: e, reason: collision with root package name */
        boolean f50537e;

        b() {
        }

        @Override // jcifs.smb1.smb1.InterfaceC6273g
        public long a() {
            return this.f50534b;
        }

        @Override // jcifs.smb1.smb1.InterfaceC6273g
        public int b() {
            return 0;
        }

        @Override // jcifs.smb1.smb1.InterfaceC6273g
        public long c() {
            return 0L;
        }

        @Override // jcifs.smb1.smb1.InterfaceC6273g
        public long d() {
            return 0L;
        }

        public String toString() {
            return new String("SmbQueryInfoStandard[allocationSize=" + this.f50533a + ",endOfFile=" + this.f50534b + ",numberOfLinks=" + this.f50535c + ",deletePending=" + this.f50536d + ",directory=" + this.f50537e + "]");
        }
    }

    Y(int i10) {
        this.f50525l1 = i10;
        this.f50305h1 = (byte) 5;
    }

    @Override // jcifs.smb1.smb1.D
    int E(byte[] bArr, int i10, int i11) {
        int i12 = this.f50525l1;
        if (i12 == 257) {
            return G(bArr, i10);
        }
        if (i12 != 258) {
            return 0;
        }
        return H(bArr, i10);
    }

    @Override // jcifs.smb1.smb1.D
    int F(byte[] bArr, int i10, int i11) {
        return 2;
    }

    int G(byte[] bArr, int i10) {
        a aVar = new a();
        aVar.f50527a = AbstractC6278l.r(bArr, i10);
        aVar.f50528b = AbstractC6278l.r(bArr, i10 + 8);
        aVar.f50529c = AbstractC6278l.r(bArr, i10 + 16);
        aVar.f50530d = AbstractC6278l.r(bArr, i10 + 24);
        aVar.f50531e = AbstractC6278l.j(bArr, i10 + 32);
        this.f50526m1 = aVar;
        return (i10 + 34) - i10;
    }

    int H(byte[] bArr, int i10) {
        b bVar = new b();
        bVar.f50533a = AbstractC6278l.l(bArr, i10);
        bVar.f50534b = AbstractC6278l.l(bArr, i10 + 8);
        bVar.f50535c = AbstractC6278l.k(bArr, i10 + 16);
        int i11 = i10 + 21;
        bVar.f50536d = (bArr[i10 + 20] & 255) > 0;
        int i12 = i10 + 22;
        bVar.f50537e = (bArr[i11] & 255) > 0;
        this.f50526m1 = bVar;
        return i12 - i10;
    }

    @Override // jcifs.smb1.smb1.D, jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("Trans2QueryPathInformationResponse[" + super.toString() + "]");
    }
}
