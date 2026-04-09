package kf;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class i extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f14315a;

    /* renamed from: d, reason: collision with root package name */
    public int f14316d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f14317g;

    public i(k kVar, h hVar) {
        this.f14317g = kVar;
        this.f14315a = kVar.V(hVar.f14313a + 4);
        this.f14316d = hVar.f14314b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f14316d;
        if (i12 <= 0) {
            return -1;
        }
        if (i11 > i12) {
            i11 = i12;
        }
        int i13 = this.f14315a;
        k kVar = this.f14317g;
        kVar.G(i13, i10, i11, bArr);
        this.f14315a = kVar.V(this.f14315a + i11);
        this.f14316d -= i11;
        return i11;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f14316d == 0) {
            return -1;
        }
        k kVar = this.f14317g;
        kVar.f14318a.seek(this.f14315a);
        int i10 = kVar.f14318a.read();
        this.f14315a = kVar.V(this.f14315a + 1);
        this.f14316d--;
        return i10;
    }
}
