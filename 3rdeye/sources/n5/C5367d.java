package n5;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: ByteStreams.java */
/* renamed from: n5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5367d {
    public static byte[] a(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] b(a aVar) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < iMin2) {
                int i11 = aVar.read(bArr, i10, iMin2 - i10);
                if (i11 == -1) {
                    return a(arrayDeque, i);
                }
                i10 += i11;
                i += i11;
            }
            long j4 = iMin * (iMin < 4096 ? 4 : 2);
            iMin = j4 > 2147483647L ? Integer.MAX_VALUE : j4 < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j4;
        }
        if (aVar.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* compiled from: ByteStreams.java */
    /* renamed from: n5.d$a */
    public static final class a extends FilterInputStream {

        /* renamed from: b, reason: collision with root package name */
        public long f44335b;

        /* renamed from: c, reason: collision with root package name */
        public long f44336c;

        public a(InputStream inputStream) {
            super(inputStream);
            this.f44336c = -1L;
            this.f44335b = 1048577L;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f44335b);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.f44336c = this.f44335b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            if (this.f44335b == 0) {
                return -1;
            }
            int i = ((FilterInputStream) this).in.read();
            if (i != -1) {
                this.f44335b--;
            }
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f44336c == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f44335b = this.f44336c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j4) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j4, this.f44335b));
            this.f44335b -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i10) throws IOException {
            long j4 = this.f44335b;
            if (j4 == 0) {
                return -1;
            }
            int i11 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i10, j4));
            if (i11 != -1) {
                this.f44335b -= i11;
            }
            return i11;
        }
    }
}
