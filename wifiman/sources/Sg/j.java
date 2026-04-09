package Sg;

/* loaded from: classes4.dex */
public class j extends k {

    /* renamed from: c, reason: collision with root package name */
    private b f20696c;

    /* renamed from: d, reason: collision with root package name */
    private b f20697d;

    public j(b bVar, b bVar2) {
        this.f20698a = 129;
        this.f20696c = bVar;
        this.f20697d = bVar2;
    }

    @Override // Sg.k
    int c(byte[] bArr, int i10) {
        int iD = this.f20696c.d(bArr, i10) + i10;
        return (iD + this.f20697d.d(bArr, iD)) - i10;
    }
}
