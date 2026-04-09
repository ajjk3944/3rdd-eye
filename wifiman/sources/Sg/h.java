package Sg;

/* loaded from: classes4.dex */
class h extends f {
    h(b bVar) {
        this.f20658q = bVar;
        this.f20660s = 33;
        this.f20655n = false;
        this.f20657p = false;
    }

    @Override // Sg.f
    int a(byte[] bArr, int i10) {
        return 0;
    }

    @Override // Sg.f
    int g(byte[] bArr, int i10) {
        return 0;
    }

    @Override // Sg.f
    int j(byte[] bArr, int i10) {
        b bVar = this.f20658q;
        int i11 = bVar.f20617c;
        bVar.f20617c = 0;
        int iM = m(bArr, i10);
        this.f20658q.f20617c = i11;
        return iM;
    }

    @Override // Sg.f
    public String toString() {
        return new String("NodeStatusRequest[" + super.toString() + "]");
    }
}
