package jcifs.smb1.smb1;

import java.util.Date;

/* renamed from: jcifs.smb1.smb1.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6289x extends AbstractC6278l implements InterfaceC6273g {

    /* renamed from: D, reason: collision with root package name */
    private long f50668D;

    /* renamed from: B, reason: collision with root package name */
    private int f50666B = 0;

    /* renamed from: C, reason: collision with root package name */
    private long f50667C = 0;

    /* renamed from: E, reason: collision with root package name */
    private int f50669E = 0;

    C6289x(long j10) {
        this.f50668D = j10;
        this.f50591c = (byte) 8;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int A(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.InterfaceC6273g
    public long a() {
        return this.f50669E;
    }

    @Override // jcifs.smb1.smb1.InterfaceC6273g
    public int b() {
        return this.f50666B;
    }

    @Override // jcifs.smb1.smb1.InterfaceC6273g
    public long c() {
        return this.f50667C + this.f50668D;
    }

    @Override // jcifs.smb1.smb1.InterfaceC6273g
    public long d() {
        return this.f50667C + this.f50668D;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int h(byte[] bArr, int i10) {
        return 0;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int m(byte[] bArr, int i10) {
        if (this.f50602n == 0) {
            return 0;
        }
        this.f50666B = AbstractC6278l.j(bArr, i10);
        this.f50667C = AbstractC6278l.s(bArr, i10 + 2);
        this.f50669E = AbstractC6278l.k(bArr, i10 + 6);
        return 20;
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    public String toString() {
        return new String("SmbComQueryInformationResponse[" + super.toString() + ",fileAttributes=0x" + Ug.d.c(this.f50666B, 4) + ",lastWriteTime=" + new Date(this.f50667C) + ",fileSize=" + this.f50669E + "]");
    }

    @Override // jcifs.smb1.smb1.AbstractC6278l
    int v(byte[] bArr, int i10) {
        return 0;
    }
}
