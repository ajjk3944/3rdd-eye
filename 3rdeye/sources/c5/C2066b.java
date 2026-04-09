package c5;

import java.io.OutputStream;

/* compiled from: LengthCountingOutputStream.java */
/* renamed from: c5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2066b extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public long f18490b;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f18490b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f18490b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) {
        int i11;
        if (i >= 0 && i <= bArr.length && i10 >= 0 && (i11 = i + i10) <= bArr.length && i11 >= 0) {
            this.f18490b += i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
