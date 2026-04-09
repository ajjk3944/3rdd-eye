package z4;

import android.util.Log;
import com.applovin.shadow.okio.Segment;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: e, reason: collision with root package name */
    public static final ByteOrder f37868e = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: f, reason: collision with root package name */
    public static final ByteOrder f37869f = ByteOrder.BIG_ENDIAN;

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f37870a;

    /* renamed from: b, reason: collision with root package name */
    public ByteOrder f37871b;

    /* renamed from: c, reason: collision with root package name */
    public int f37872c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f37873d;

    public b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f37870a.available();
    }

    public final void c(int i4) throws IOException {
        int i10 = 0;
        while (i10 < i4) {
            int i11 = i4 - i10;
            DataInputStream dataInputStream = this.f37870a;
            int iSkip = (int) dataInputStream.skip(i11);
            if (iSkip <= 0) {
                if (this.f37873d == null) {
                    this.f37873d = new byte[Segment.SIZE];
                }
                iSkip = dataInputStream.read(this.f37873d, 0, Math.min(Segment.SIZE, i11));
                if (iSkip == -1) {
                    throw new EOFException(r5.c.h(i4, "Reached EOF while skipping ", " bytes."));
                }
            }
            i10 += iSkip;
        }
        this.f37872c += i10;
    }

    @Override // java.io.InputStream
    public final void mark(int i4) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f37872c++;
        return this.f37870a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f37872c++;
        return this.f37870a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f37872c++;
        int i4 = this.f37870a.read();
        if (i4 >= 0) {
            return (byte) i4;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f37872c += 2;
        return this.f37870a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i4, int i10) throws IOException {
        this.f37872c += i10;
        this.f37870a.readFully(bArr, i4, i10);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f37872c += 4;
        DataInputStream dataInputStream = this.f37870a;
        int i4 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        if ((i4 | i10 | i11 | i12) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f37871b;
        if (byteOrder == f37868e) {
            return (i12 << 24) + (i11 << 16) + (i10 << 8) + i4;
        }
        if (byteOrder == f37869f) {
            return (i4 << 24) + (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IOException("Invalid byte order: " + this.f37871b);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j;
        long j8;
        this.f37872c += 8;
        DataInputStream dataInputStream = this.f37870a;
        int i4 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        if ((i4 | i10 | i11 | i12 | i13 | i14 | i15 | i16) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f37871b;
        if (byteOrder == f37868e) {
            j = (i16 << 56) + (i15 << 48) + (i14 << 40) + (i13 << 32) + (i12 << 24) + (i11 << 16) + (i10 << 8);
            j8 = i4;
        } else {
            if (byteOrder != f37869f) {
                throw new IOException("Invalid byte order: " + this.f37871b);
            }
            j = (i4 << 56) + (i10 << 48) + (i11 << 40) + (i12 << 32) + (i13 << 24) + (i14 << 16) + (i15 << 8);
            j8 = i16;
        }
        return j + j8;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f37872c += 2;
        DataInputStream dataInputStream = this.f37870a;
        int i4 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i4 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f37871b;
        if (byteOrder == f37868e) {
            return (short) ((i10 << 8) + i4);
        }
        if (byteOrder == f37869f) {
            return (short) ((i4 << 8) + i10);
        }
        throw new IOException("Invalid byte order: " + this.f37871b);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f37872c += 2;
        return this.f37870a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f37872c++;
        return this.f37870a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f37872c += 2;
        DataInputStream dataInputStream = this.f37870a;
        int i4 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i4 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f37871b;
        if (byteOrder == f37868e) {
            return (i10 << 8) + i4;
        }
        if (byteOrder == f37869f) {
            return (i4 << 8) + i10;
        }
        throw new IOException("Invalid byte order: " + this.f37871b);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i4) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public b(InputStream inputStream, int i4) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f37871b = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f37870a = dataInputStream;
        dataInputStream.mark(0);
        this.f37872c = 0;
        this.f37871b = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i10) throws IOException {
        int i11 = this.f37870a.read(bArr, i4, i10);
        this.f37872c += i11;
        return i11;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f37872c += bArr.length;
        this.f37870a.readFully(bArr);
    }
}
