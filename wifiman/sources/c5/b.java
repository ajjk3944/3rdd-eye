package c5;

import java.io.OutputStream;

/* loaded from: classes3.dex */
final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f33865a = 0;

    b() {
    }

    long a() {
        return this.f33865a;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f33865a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f33865a += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f33865a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
