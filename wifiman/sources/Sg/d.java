package Sg;

/* loaded from: classes4.dex */
class d extends f {
    d() {
        this.f20659r = new b();
    }

    @Override // Sg.f
    int a(byte[] bArr, int i10) {
        return h(bArr, i10);
    }

    @Override // Sg.f
    int g(byte[] bArr, int i10) {
        if (this.f20646e != 0 || this.f20645d != 0) {
            return 0;
        }
        byte b10 = bArr[i10];
        boolean z10 = (b10 & 128) == 128;
        int i11 = (b10 & 96) >> 5;
        int iD = f.d(bArr, i10 + 2);
        if (iD != 0) {
            this.f20643b[this.f20642a] = new g(this.f20659r, iD, z10, i11);
            return 6;
        }
        this.f20643b[this.f20642a] = null;
        return 6;
    }

    @Override // Sg.f
    int j(byte[] bArr, int i10) {
        return 0;
    }

    @Override // Sg.f
    public String toString() {
        return new String("NameQueryResponse[" + super.toString() + ",addrEntry=" + this.f20643b + "]");
    }
}
