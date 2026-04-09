package i0;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: e, reason: collision with root package name */
    public static final ByteOrder f20489e = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: f, reason: collision with root package name */
    public static final ByteOrder f20490f = ByteOrder.BIG_ENDIAN;

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f20491a;

    /* renamed from: b, reason: collision with root package name */
    public ByteOrder f20492b;

    /* renamed from: c, reason: collision with root package name */
    public int f20493c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f20494d;

    public b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
    }

    public final void a(int i) throws IOException {
        int i3 = 0;
        while (i3 < i) {
            int i6 = i - i3;
            DataInputStream dataInputStream = this.f20491a;
            int iSkip = (int) dataInputStream.skip(i6);
            if (iSkip <= 0) {
                if (this.f20494d == null) {
                    this.f20494d = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f20494d, 0, Math.min(8192, i6));
                if (iSkip == -1) {
                    throw new EOFException(A.f.h(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i3 += iSkip;
        }
        this.f20493c += i3;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f20491a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f20493c++;
        return this.f20491a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f20493c++;
        return this.f20491a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f20493c++;
        int i = this.f20491a.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f20493c += 2;
        return this.f20491a.readChar();
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
    public final void readFully(byte[] bArr, int i, int i3) throws IOException {
        this.f20493c += i3;
        this.f20491a.readFully(bArr, i, i3);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f20493c += 4;
        DataInputStream dataInputStream = this.f20491a;
        int i = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        if ((i | i3 | i6 | i7) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f20492b;
        if (byteOrder == f20489e) {
            return (i7 << 24) + (i6 << 16) + (i3 << 8) + i;
        }
        if (byteOrder == f20490f) {
            return (i << 24) + (i3 << 16) + (i6 << 8) + i7;
        }
        throw new IOException("Invalid byte order: " + this.f20492b);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j6;
        long j7;
        this.f20493c += 8;
        DataInputStream dataInputStream = this.f20491a;
        int i = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i | i3 | i6 | i7 | i8 | i9 | i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f20492b;
        if (byteOrder == f20489e) {
            j6 = (i11 << 56) + (i10 << 48) + (i9 << 40) + (i8 << 32) + (i7 << 24) + (i6 << 16) + (i3 << 8);
            j7 = i;
        } else {
            if (byteOrder != f20490f) {
                throw new IOException("Invalid byte order: " + this.f20492b);
            }
            j6 = (i << 56) + (i3 << 48) + (i6 << 40) + (i7 << 32) + (i8 << 24) + (i9 << 16) + (i10 << 8);
            j7 = i11;
        }
        return j6 + j7;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f20493c += 2;
        DataInputStream dataInputStream = this.f20491a;
        int i = dataInputStream.read();
        int i3 = dataInputStream.read();
        if ((i | i3) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f20492b;
        if (byteOrder == f20489e) {
            return (short) ((i3 << 8) + i);
        }
        if (byteOrder == f20490f) {
            return (short) ((i << 8) + i3);
        }
        throw new IOException("Invalid byte order: " + this.f20492b);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f20493c += 2;
        return this.f20491a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f20493c++;
        return this.f20491a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f20493c += 2;
        DataInputStream dataInputStream = this.f20491a;
        int i = dataInputStream.read();
        int i3 = dataInputStream.read();
        if ((i | i3) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f20492b;
        if (byteOrder == f20489e) {
            return (i3 << 8) + i;
        }
        if (byteOrder == f20490f) {
            return (i << 8) + i3;
        }
        throw new IOException("Invalid byte order: " + this.f20492b);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public b(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f20492b = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f20491a = dataInputStream;
        dataInputStream.mark(0);
        this.f20493c = 0;
        this.f20492b = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i3) throws IOException {
        int i6 = this.f20491a.read(bArr, i, i3);
        this.f20493c += i6;
        return i6;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f20493c += bArr.length;
        this.f20491a.readFully(bArr);
    }
}
