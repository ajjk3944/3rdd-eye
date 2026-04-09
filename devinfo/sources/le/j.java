package le;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f28722a;

    /* renamed from: b, reason: collision with root package name */
    public int f28723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f28724c;

    public j(l lVar, i iVar) {
        this.f28724c = lVar;
        this.f28722a = lVar.G(iVar.f28720a + 4);
        this.f28723b = iVar.f28721b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i10) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i4 | i10) < 0 || i10 > bArr.length - i4) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f28723b;
        if (i11 <= 0) {
            return -1;
        }
        if (i10 > i11) {
            i10 = i11;
        }
        int i12 = this.f28722a;
        l lVar = this.f28724c;
        lVar.A(i12, bArr, i4, i10);
        this.f28722a = lVar.G(this.f28722a + i10);
        this.f28723b -= i10;
        return i10;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f28723b == 0) {
            return -1;
        }
        l lVar = this.f28724c;
        lVar.f28725a.seek(this.f28722a);
        int i4 = lVar.f28725a.read();
        this.f28722a = lVar.G(this.f28722a + 1);
        this.f28723b--;
        return i4;
    }
}
