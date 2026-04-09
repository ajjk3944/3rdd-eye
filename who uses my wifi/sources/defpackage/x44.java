package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x44 extends y44 {
    public final int i;
    public final int j;

    public x44(byte[] bArr, int i, int i2) {
        super(bArr);
        a54.a(i, i + i2, bArr.length);
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.y44, defpackage.a54
    public final byte b(int i) {
        a54.q(i, this.j);
        return this.h[this.i + i];
    }

    @Override // defpackage.y44, defpackage.a54
    public final byte c(int i) {
        return this.h[this.i + i];
    }

    @Override // defpackage.y44, defpackage.a54
    public final int d() {
        return this.j;
    }

    @Override // defpackage.y44, defpackage.a54
    public final void f(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.h, this.i + i, bArr, i2, i3);
    }

    @Override // defpackage.y44
    public final int r() {
        return this.i;
    }
}
