package G;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: ExifAttribute.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f1808d = StandardCharsets.US_ASCII;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f1809e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1810f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: a, reason: collision with root package name */
    public final int f1811a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1812b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1813c;

    public g(int i, int i10, byte[] bArr) {
        this.f1811a = i;
        this.f1812b = i10;
        this.f1813c = bArr;
    }

    public static g a(long j4, ByteOrder byteOrder) {
        return b(new long[]{j4}, byteOrder);
    }

    public static g b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f1810f[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j4 : jArr) {
            byteBufferWrap.putInt((int) j4);
        }
        return new g(4, jArr.length, byteBufferWrap.array());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(f1809e[this.f1811a]);
        sb.append(", data length:");
        return B4.i.j(sb, this.f1813c.length, ")");
    }
}
