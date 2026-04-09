package ag;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f347a;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f347a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f347a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f347a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
