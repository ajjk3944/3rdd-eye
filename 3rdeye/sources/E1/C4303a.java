package e1;

import B4.i;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import e1.C4304b;
import g0.C4356c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;

/* compiled from: ExifInterface.java */
/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4303a {

    /* renamed from: F, reason: collision with root package name */
    public static final String[] f37641F;

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f37642G;

    /* renamed from: H, reason: collision with root package name */
    public static final byte[] f37643H;

    /* renamed from: I, reason: collision with root package name */
    public static final d f37644I;

    /* renamed from: J, reason: collision with root package name */
    public static final d[][] f37645J;

    /* renamed from: K, reason: collision with root package name */
    public static final d[] f37646K;

    /* renamed from: L, reason: collision with root package name */
    public static final HashMap<Integer, d>[] f37647L;

    /* renamed from: M, reason: collision with root package name */
    public static final HashMap<String, d>[] f37648M;

    /* renamed from: N, reason: collision with root package name */
    public static final HashSet<String> f37649N;

    /* renamed from: O, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f37650O;

    /* renamed from: P, reason: collision with root package name */
    public static final Charset f37651P;

    /* renamed from: Q, reason: collision with root package name */
    public static final byte[] f37652Q;

    /* renamed from: R, reason: collision with root package name */
    public static final byte[] f37653R;

    /* renamed from: S, reason: collision with root package name */
    public static final Pattern f37654S;

    /* renamed from: T, reason: collision with root package name */
    public static final Pattern f37655T;

    /* renamed from: U, reason: collision with root package name */
    public static final Pattern f37656U;

    /* renamed from: a, reason: collision with root package name */
    public final String f37670a;

    /* renamed from: b, reason: collision with root package name */
    public final FileDescriptor f37671b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager.AssetInputStream f37672c;

    /* renamed from: d, reason: collision with root package name */
    public int f37673d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, c>[] f37674e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f37675f;

    /* renamed from: g, reason: collision with root package name */
    public ByteOrder f37676g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f37677h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f37678j;

    /* renamed from: k, reason: collision with root package name */
    public int f37679k;

    /* renamed from: l, reason: collision with root package name */
    public int f37680l;

    /* renamed from: m, reason: collision with root package name */
    public int f37681m;

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f37657n = Log.isLoggable("ExifInterface", 3);

    /* renamed from: o, reason: collision with root package name */
    public static final List<Integer> f37658o = Arrays.asList(1, 6, 3, 8);

    /* renamed from: p, reason: collision with root package name */
    public static final List<Integer> f37659p = Arrays.asList(2, 7, 4, 5);

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f37660q = {8, 8, 8};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f37661r = {8};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f37662s = {-1, -40, -1};

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f37663t = {102, 116, 121, 112};

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f37664u = {109, 105, 102, 49};

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f37665v = {104, 101, 105, 99};

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f37666w = {79, 76, 89, 77, 80, 0};

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f37667x = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f37668y = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f37669z = {101, 88, 73, 102};

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f37636A = {73, 72, 68, 82};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f37637B = {73, 69, 78, 68};

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f37638C = {82, 73, 70, 70};

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f37639D = {87, 69, 66, 80};

    /* renamed from: E, reason: collision with root package name */
    public static final byte[] f37640E = {69, 88, 73, 70};

    /* compiled from: ExifInterface.java */
    /* renamed from: e1.a$b */
    public static class b extends InputStream implements DataInput {

        /* renamed from: f, reason: collision with root package name */
        public static final ByteOrder f37684f = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: g, reason: collision with root package name */
        public static final ByteOrder f37685g = ByteOrder.BIG_ENDIAN;

        /* renamed from: b, reason: collision with root package name */
        public final DataInputStream f37686b;

        /* renamed from: c, reason: collision with root package name */
        public ByteOrder f37687c;

        /* renamed from: d, reason: collision with root package name */
        public int f37688d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f37689e;

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public final void a(int i) throws IOException {
            int i10 = 0;
            while (i10 < i) {
                DataInputStream dataInputStream = this.f37686b;
                int i11 = i - i10;
                int iSkip = (int) dataInputStream.skip(i11);
                if (iSkip <= 0) {
                    if (this.f37689e == null) {
                        this.f37689e = new byte[8192];
                    }
                    iSkip = dataInputStream.read(this.f37689e, 0, Math.min(8192, i11));
                    if (iSkip == -1) {
                        throw new EOFException(C4356c.i(i, "Reached EOF while skipping ", " bytes."));
                    }
                }
                i10 += iSkip;
            }
            this.f37688d += i10;
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.f37686b.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            this.f37688d++;
            return this.f37686b.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() throws IOException {
            this.f37688d++;
            return this.f37686b.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.f37688d++;
            int i = this.f37686b.read();
            if (i >= 0) {
                return (byte) i;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() throws IOException {
            this.f37688d += 2;
            return this.f37686b.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i10) throws IOException {
            this.f37688d += i10;
            this.f37686b.readFully(bArr, i, i10);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.f37688d += 4;
            DataInputStream dataInputStream = this.f37686b;
            int i = dataInputStream.read();
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            int i12 = dataInputStream.read();
            if ((i | i10 | i11 | i12) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f37687c;
            if (byteOrder == f37684f) {
                return (i12 << 24) + (i11 << 16) + (i10 << 8) + i;
            }
            if (byteOrder == f37685g) {
                return (i << 24) + (i10 << 16) + (i11 << 8) + i12;
            }
            throw new IOException("Invalid byte order: " + this.f37687c);
        }

        @Override // java.io.DataInput
        public final String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            long j4;
            long j10;
            this.f37688d += 8;
            DataInputStream dataInputStream = this.f37686b;
            int i = dataInputStream.read();
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            int i12 = dataInputStream.read();
            int i13 = dataInputStream.read();
            int i14 = dataInputStream.read();
            int i15 = dataInputStream.read();
            int i16 = dataInputStream.read();
            if ((i | i10 | i11 | i12 | i13 | i14 | i15 | i16) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f37687c;
            if (byteOrder == f37684f) {
                j4 = (i16 << 56) + (i15 << 48) + (i14 << 40) + (i13 << 32) + (i12 << 24) + (i11 << 16) + (i10 << 8);
                j10 = i;
            } else {
                if (byteOrder != f37685g) {
                    throw new IOException("Invalid byte order: " + this.f37687c);
                }
                j4 = (i << 56) + (i10 << 48) + (i11 << 40) + (i12 << 32) + (i13 << 24) + (i14 << 16) + (i15 << 8);
                j10 = i16;
            }
            return j4 + j10;
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.f37688d += 2;
            DataInputStream dataInputStream = this.f37686b;
            int i = dataInputStream.read();
            int i10 = dataInputStream.read();
            if ((i | i10) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f37687c;
            if (byteOrder == f37684f) {
                return (short) ((i10 << 8) + i);
            }
            if (byteOrder == f37685g) {
                return (short) ((i << 8) + i10);
            }
            throw new IOException("Invalid byte order: " + this.f37687c);
        }

        @Override // java.io.DataInput
        public final String readUTF() throws IOException {
            this.f37688d += 2;
            return this.f37686b.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() throws IOException {
            this.f37688d++;
            return this.f37686b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.f37688d += 2;
            DataInputStream dataInputStream = this.f37686b;
            int i = dataInputStream.read();
            int i10 = dataInputStream.read();
            if ((i | i10) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f37687c;
            if (byteOrder == f37684f) {
                return (i10 << 8) + i;
            }
            if (byteOrder == f37685g) {
                return (i << 8) + i10;
            }
            throw new IOException("Invalid byte order: " + this.f37687c);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f37687c = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f37686b = dataInputStream;
            dataInputStream.mark(0);
            this.f37688d = 0;
            this.f37687c = byteOrder;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i10) throws IOException {
            int i11 = this.f37686b.read(bArr, i, i10);
            this.f37688d += i11;
            return i11;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.f37688d += bArr.length;
            this.f37686b.readFully(bArr);
        }
    }

    /* compiled from: ExifInterface.java */
    /* renamed from: e1.a$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f37690a;

        /* renamed from: b, reason: collision with root package name */
        public final int f37691b;

        /* renamed from: c, reason: collision with root package name */
        public final long f37692c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f37693d;

        public c(int i, int i10, byte[] bArr) {
            this(-1L, bArr, i, i10);
        }

        public static c a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(C4303a.f37651P);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j4, ByteOrder byteOrder) {
            return c(new long[]{j4}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C4303a.f37642G[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j4 : jArr) {
                byteBufferWrap.putInt((int) j4);
            }
            return new c(4, jArr.length, byteBufferWrap.array());
        }

        public static c d(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C4303a.f37642G[5] * eVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (e eVar : eVarArr) {
                byteBufferWrap.putInt((int) eVar.f37698a);
                byteBufferWrap.putInt((int) eVar.f37699b);
            }
            return new c(5, eVarArr.length, byteBufferWrap.array());
        }

        public static c e(ByteOrder byteOrder, int i) {
            return f(new int[]{i}, byteOrder);
        }

        public static c f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C4303a.f37642G[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putShort((short) i);
            }
            return new c(3, iArr.length, byteBufferWrap.array());
        }

        public final double g(ByteOrder byteOrder) {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objJ instanceof String) {
                return Double.parseDouble((String) objJ);
            }
            if (objJ instanceof long[]) {
                if (((long[]) objJ).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objJ instanceof int[]) {
                if (((int[]) objJ).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objJ instanceof double[]) {
                double[] dArr = (double[]) objJ;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objJ instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objJ;
            if (eVarArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            e eVar = eVarArr[0];
            return eVar.f37698a / eVar.f37699b;
        }

        public final int h(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objJ instanceof String) {
                return Integer.parseInt((String) objJ);
            }
            if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objJ instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objJ;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String i(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                return null;
            }
            if (objJ instanceof String) {
                return (String) objJ;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(StringUtils.COMMA);
                    }
                }
                return sb.toString();
            }
            if (objJ instanceof int[]) {
                int[] iArr = (int[]) objJ;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(StringUtils.COMMA);
                    }
                }
                return sb.toString();
            }
            if (objJ instanceof double[]) {
                double[] dArr = (double[]) objJ;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(StringUtils.COMMA);
                    }
                }
                return sb.toString();
            }
            if (!(objJ instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objJ;
            while (i < eVarArr.length) {
                sb.append(eVarArr[i].f37698a);
                sb.append('/');
                sb.append(eVarArr[i].f37699b);
                i++;
                if (i != eVarArr.length) {
                    sb.append(StringUtils.COMMA);
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:16:0x0033 */
        /* JADX WARN: Removed duplicated region for block: B:153:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
        /* JADX WARN: Type inference failed for: r15v24, types: [e1.a$e[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v27, types: [e1.a$e[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.io.Serializable j(java.nio.ByteOrder r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 402
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.C4303a.c.j(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(C4303a.f37641F[this.f37690a]);
            sb.append(", data length:");
            return i.j(sb, this.f37693d.length, ")");
        }

        public c(long j4, byte[] bArr, int i, int i10) {
            this.f37690a = i;
            this.f37691b = i10;
            this.f37692c = j4;
            this.f37693d = bArr;
        }
    }

    /* compiled from: ExifInterface.java */
    /* renamed from: e1.a$e */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final long f37698a;

        /* renamed from: b, reason: collision with root package name */
        public final long f37699b;

        public e(long j4, long j10) {
            if (j10 == 0) {
                this.f37698a = 0L;
                this.f37699b = 1L;
            } else {
                this.f37698a = j4;
                this.f37699b = j10;
            }
        }

        public final String toString() {
            return this.f37698a + "/" + this.f37699b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f37641F = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f37642G = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f37643H = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", Sdk$SDKError.b.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", Sdk$SDKError.b.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        f37644I = new d("StripOffsets", 273, 3);
        f37645J = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f37646K = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f37647L = new HashMap[10];
        f37648M = new HashMap[10];
        f37649N = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f37650O = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f37651P = charsetForName;
        f37652Q = "Exif\u0000\u0000".getBytes(charsetForName);
        f37653R = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            d[][] dVarArr6 = f37645J;
            if (i >= dVarArr6.length) {
                HashMap<Integer, Integer> map = f37650O;
                d[] dVarArr7 = f37646K;
                map.put(Integer.valueOf(dVarArr7[0].f37694a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f37694a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f37694a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f37694a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f37694a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f37694a), 8);
                Pattern.compile(".*[1-9].*");
                f37654S = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f37655T = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f37656U = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f37647L[i] = new HashMap<>();
            f37648M[i] = new HashMap<>();
            for (d dVar : dVarArr6[i]) {
                f37647L[i].put(Integer.valueOf(dVar.f37694a), dVar);
                f37648M[i].put(dVar.f37695b, dVar);
            }
            i++;
        }
    }

    public C4303a(String str) throws Throwable {
        boolean z10;
        d[][] dVarArr = f37645J;
        this.f37674e = new HashMap[dVarArr.length];
        this.f37675f = new HashSet(dVarArr.length);
        this.f37676g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f37672c = null;
        this.f37670a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    C4304b.a.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z10 = true;
                } catch (Exception unused) {
                    if (f37657n) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z10 = false;
                }
                if (z10) {
                    this.f37671b = fileInputStream2.getFD();
                } else {
                    this.f37671b = null;
                }
                r(fileInputStream2);
                C4304b.b(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                C4304b.b(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(StringUtils.COMMA, -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d10 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d11 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d12 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d11 / 60.0d) + d10;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d12;
            }
            return -d12;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static Pair<Integer, Integer> o(String str) throws NumberFormatException {
        if (str.contains(StringUtils.COMMA)) {
            String[] strArrSplit = str.split(StringUtils.COMMA, -1);
            Pair<Integer, Integer> pairO = o(strArrSplit[0]);
            if (((Integer) pairO.first).intValue() == 2) {
                return pairO;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair<Integer, Integer> pairO2 = o(strArrSplit[i]);
                int iIntValue = (((Integer) pairO2.first).equals(pairO.first) || ((Integer) pairO2.second).equals(pairO.first)) ? ((Integer) pairO.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairO.second).intValue() == -1 || !(((Integer) pairO2.first).equals(pairO.second) || ((Integer) pairO2.second).equals(pairO.second))) ? -1 : ((Integer) pairO.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairO = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairO = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairO;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j4 = Long.parseLong(str);
                    return (j4 < 0 || j4 > 65535) ? j4 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair<>(2, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j10 = (long) Double.parseDouble(strArrSplit2[0]);
                long j11 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j10 >= 0 && j11 >= 0) {
                    if (j10 <= 2147483647L && j11 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    public static ByteOrder u(b bVar) throws IOException {
        short s10 = bVar.readShort();
        boolean z10 = f37657n;
        if (s10 == 18761) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    public final void A(int i, int i10) throws Throwable {
        HashMap<String, c>[] mapArr = this.f37674e;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z10 = f37657n;
        if (zIsEmpty || mapArr[i10].isEmpty()) {
            if (z10) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = mapArr[i].get("ImageLength");
        c cVar2 = mapArr[i].get("ImageWidth");
        c cVar3 = mapArr[i10].get("ImageLength");
        c cVar4 = mapArr[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z10) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iH = cVar.h(this.f37676g);
        int iH2 = cVar2.h(this.f37676g);
        int iH3 = cVar3.h(this.f37676g);
        int iH4 = cVar4.h(this.f37676g);
        if (iH >= iH3 || iH2 >= iH4) {
            return;
        }
        HashMap<String, c> map = mapArr[i];
        mapArr[i] = mapArr[i10];
        mapArr[i10] = map;
    }

    public final void B(f fVar, int i) throws Throwable {
        c cVarE;
        c cVarE2;
        HashMap<String, c>[] mapArr = this.f37674e;
        c cVar = mapArr[i].get("DefaultCropSize");
        c cVar2 = mapArr[i].get("SensorTopBorder");
        c cVar3 = mapArr[i].get("SensorLeftBorder");
        c cVar4 = mapArr[i].get("SensorBottomBorder");
        c cVar5 = mapArr[i].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f37690a == 5) {
                e[] eVarArr = (e[]) cVar.j(this.f37676g);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                } else {
                    cVarE = c.d(new e[]{eVarArr[0]}, this.f37676g);
                    cVarE2 = c.d(new e[]{eVarArr[1]}, this.f37676g);
                }
            } else {
                int[] iArr = (int[]) cVar.j(this.f37676g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVarE = c.e(this.f37676g, iArr[0]);
                cVarE2 = c.e(this.f37676g, iArr[1]);
            }
            mapArr[i].put("ImageWidth", cVarE);
            mapArr[i].put("ImageLength", cVarE2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iH = cVar2.h(this.f37676g);
            int iH2 = cVar4.h(this.f37676g);
            int iH3 = cVar5.h(this.f37676g);
            int iH4 = cVar3.h(this.f37676g);
            if (iH2 <= iH || iH3 <= iH4) {
                return;
            }
            c cVarE3 = c.e(this.f37676g, iH2 - iH);
            c cVarE4 = c.e(this.f37676g, iH3 - iH4);
            mapArr[i].put("ImageLength", cVarE3);
            mapArr[i].put("ImageWidth", cVarE4);
            return;
        }
        c cVar6 = mapArr[i].get("ImageLength");
        c cVar7 = mapArr[i].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = mapArr[i].get("JPEGInterchangeFormat");
            c cVar9 = mapArr[i].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iH5 = cVar8.h(this.f37676g);
            int iH6 = cVar8.h(this.f37676g);
            fVar.c(iH5);
            byte[] bArr = new byte[iH6];
            fVar.read(bArr);
            g(new b(bArr), iH5, i);
        }
    }

    public final void C() throws Throwable {
        A(0, 5);
        A(0, 4);
        A(5, 4);
        HashMap<String, c>[] mapArr = this.f37674e;
        c cVar = mapArr[1].get("PixelXDimension");
        c cVar2 = mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && q(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!q(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        x(0, "ThumbnailOrientation", "Orientation");
        x(0, "ThumbnailImageLength", "ImageLength");
        x(0, "ThumbnailImageWidth", "ImageWidth");
        x(5, "ThumbnailOrientation", "Orientation");
        x(5, "ThumbnailImageLength", "ImageLength");
        x(5, "ThumbnailImageWidth", "ImageWidth");
        x(4, "Orientation", "ThumbnailOrientation");
        x(4, "ImageLength", "ThumbnailImageLength");
        x(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void a() {
        String strC = c("DateTimeOriginal");
        HashMap<String, c>[] mapArr = this.f37674e;
        if (strC != null && c("DateTime") == null) {
            mapArr[0].put("DateTime", c.a(strC));
        }
        if (c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.b(0L, this.f37676g));
        }
        if (c("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.b(0L, this.f37676g));
        }
        if (c("Orientation") == null) {
            mapArr[0].put("Orientation", c.b(0L, this.f37676g));
        }
        if (c("LightSource") == null) {
            mapArr[1].put("LightSource", c.b(0L, this.f37676g));
        }
    }

    public final String c(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarE = e(str);
        if (cVarE != null) {
            if (!f37649N.contains(str)) {
                return cVarE.i(this.f37676g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = cVarE.f37690a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                e[] eVarArr = (e[]) cVarE.j(this.f37676g);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f37698a / eVar.f37699b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f37698a / eVar2.f37699b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f37698a / eVar3.f37699b)));
            }
            try {
                return Double.toString(cVarE.g(this.f37676g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int d(int i, String str) {
        c cVarE = e(str);
        if (cVarE == null) {
            return i;
        }
        try {
            return cVarE.h(this.f37676g);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final c e(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f37657n) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f37645J.length; i++) {
            c cVar = this.f37674e[i].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void f(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                C4304b.C0446b.a(mediaMetadataRetriever, new C0445a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap<String, c>[] mapArr = this.f37674e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.e(this.f37676g, Integer.parseInt(strExtractMetadata)));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", c.e(this.f37676g, Integer.parseInt(strExtractMetadata2)));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", c.e(this.f37676g, i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i10 = Integer.parseInt(strExtractMetadata4);
                    int i11 = Integer.parseInt(strExtractMetadata5);
                    if (i11 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.c(i10);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i12 = i10 + 6;
                    int i13 = i11 - 6;
                    if (!Arrays.equals(bArr, f37652Q)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i13];
                    if (fVar.read(bArr2) != i13) {
                        throw new IOException("Can't read exif");
                    }
                    this.f37678j = i12;
                    v(0, bArr2);
                }
                if (f37657n) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0193, code lost:
    
        r23.f37687c = r22.f37676g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0197, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0180 A[LOOP:0: B:10:0x0033->B:82:0x0180, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(e1.C4303a.b r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C4303a.g(e1.a$b, int, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:167|12|162|13|(2:150|14)|(16:17|(2:19|20)(1:28)|23|29|(1:31)|32|(3:152|35|(4:41|(3:44|(1:46)(2:47|(1:49))|(1:179)(3:176|52|53))(2:43|177)|54|36))|34|156|66|160|67|68|(1:74)(1:73)|75|(1:88)(8:158|90|154|91|92|(1:94)(1:95)|96|(1:108)(3:110|(2:111|(2:113|(2:169|115)(1:116))(2:168|117))|(1:119)(4:121|(2:122|(2:124|(1:171)(1:127))(3:170|128|(2:129|(2:131|(1:173)(1:134))(2:172|135))))|126|(1:137)(1:139)))))|16|156|66|160|67|68|(3:70|74|75)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f4, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f8, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fa, code lost:
    
        if (r6 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fc, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ff, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0100, code lost:
    
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0102, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C4303a.h(java.io.BufferedInputStream):int");
    }

    public final void i(f fVar) throws Throwable {
        int i;
        int i10;
        l(fVar);
        HashMap<String, c>[] mapArr = this.f37674e;
        c cVar = mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f37693d);
            fVar2.f37687c = this.f37676g;
            byte[] bArr = f37666w;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.c(0L);
            byte[] bArr3 = f37667x;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.c(12L);
            }
            w(fVar2, 6);
            c cVar2 = mapArr[7].get("PreviewImageStart");
            c cVar3 = mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.j(this.f37676g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i11 = iArr[2];
                int i12 = iArr[0];
                if (i11 <= i12 || (i = iArr[3]) <= (i10 = iArr[1])) {
                    return;
                }
                int i13 = (i11 - i12) + 1;
                int i14 = (i - i10) + 1;
                if (i13 < i14) {
                    int i15 = i13 + i14;
                    i14 = i15 - i14;
                    i13 = i15 - i14;
                }
                c cVarE = c.e(this.f37676g, i13);
                c cVarE2 = c.e(this.f37676g, i14);
                mapArr[0].put("ImageWidth", cVarE);
                mapArr[0].put("ImageLength", cVarE2);
            }
        }
    }

    public final void j(b bVar) throws Throwable {
        if (f37657n) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f37687c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f37668y;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i10 = length + 8;
                if (i10 == 16 && !Arrays.equals(bArr2, f37636A)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f37637B)) {
                    return;
                }
                if (Arrays.equals(bArr2, f37669z)) {
                    byte[] bArr3 = new byte[i];
                    if (bVar.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C4304b.a(bArr2));
                    }
                    int i11 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i11) {
                        this.f37678j = i10;
                        v(0, bArr3);
                        C();
                        z(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i11 + ", calculated CRC value: " + crc32.getValue());
                }
                int i12 = i + 4;
                bVar.a(i12);
                length = i10 + i12;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void k(b bVar) throws Throwable {
        boolean z10 = f37657n;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        bVar.a(i - bVar.f37688d);
        bVar.read(bArr4);
        g(new b(bArr4), i, 5);
        bVar.a(i11 - bVar.f37688d);
        bVar.f37687c = ByteOrder.BIG_ENDIAN;
        int i12 = bVar.readInt();
        if (z10) {
            com.google.android.gms.measurement.internal.a.i(i12, "numberOfDirectoryEntry: ", "ExifInterface");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f37644I.f37694a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                c cVarE = c.e(this.f37676g, s10);
                c cVarE2 = c.e(this.f37676g, s11);
                HashMap<String, c>[] mapArr = this.f37674e;
                mapArr[0].put("ImageLength", cVarE);
                mapArr[0].put("ImageWidth", cVarE2);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void l(f fVar) throws Throwable {
        s(fVar);
        w(fVar, 0);
        B(fVar, 0);
        B(fVar, 5);
        B(fVar, 4);
        C();
        if (this.f37673d == 8) {
            HashMap<String, c>[] mapArr = this.f37674e;
            c cVar = mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f37693d);
                fVar2.f37687c = this.f37676g;
                fVar2.a(6);
                w(fVar2, 9);
                c cVar2 = mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void m(f fVar) throws Throwable {
        if (f37657n) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        l(fVar);
        HashMap<String, c>[] mapArr = this.f37674e;
        c cVar = mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            g(new b(cVar.f37693d), (int) cVar.f37692c, 5);
        }
        c cVar2 = mapArr[0].get("ISO");
        c cVar3 = mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void n(b bVar) throws Throwable {
        if (f37657n) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f37687c = ByteOrder.LITTLE_ENDIAN;
        bVar.a(f37638C.length);
        int i = bVar.readInt() + 8;
        byte[] bArr = f37639D;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i10 = bVar.readInt();
                int i11 = length + 8;
                if (Arrays.equals(f37640E, bArr2)) {
                    byte[] bArr3 = new byte[i10];
                    if (bVar.read(bArr3) == i10) {
                        this.f37678j = i11;
                        v(0, bArr3);
                        z(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C4304b.a(bArr2));
                    }
                }
                if (i10 % 2 == 1) {
                    i10++;
                }
                length = i11 + i10;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i10);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void p(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iH = cVar.h(this.f37676g);
        int iH2 = cVar2.h(this.f37676g);
        if (this.f37673d == 7) {
            iH += this.f37679k;
        }
        if (iH > 0 && iH2 > 0) {
            this.f37677h = true;
            if (this.f37670a == null && this.f37672c == null && this.f37671b == null) {
                bVar.skip(iH);
                bVar.read(new byte[iH2]);
            }
        }
        if (f37657n) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iH + ", length: " + iH2);
        }
    }

    public final boolean q(HashMap map) throws IOException {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.h(this.f37676g) <= 512 && cVar2.h(this.f37676g) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0091 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:5:0x0006, B:7:0x000b, B:14:0x0020, B:20:0x003d, B:22:0x0048, B:30:0x005e, B:25:0x004f, B:28:0x0057, B:29:0x005b, B:31:0x0068, B:33:0x0071, B:35:0x0077, B:37:0x007d, B:39:0x0083, B:45:0x0091), top: B:57:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = e1.C4303a.f37657n
            if (r8 == 0) goto Lab
            r1 = 0
            r2 = r1
        L6:
            e1.a$d[][] r3 = e1.C4303a.f37645J     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r3 = r3.length     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            if (r2 >= r3) goto L20
            java.util.HashMap<java.lang.String, e1.a$c>[] r3 = r7.f37674e     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r4.<init>()     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3[r2] = r4     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r2 = r2 + 1
            goto L6
        L17:
            r8 = move-exception
            goto L99
        L1a:
            r8 = move-exception
            goto L8f
        L1d:
            r8 = move-exception
            goto L8f
        L20:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r8 = r7.h(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r7.f37673d = r8     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L68
            if (r8 == r5) goto L68
            if (r8 == r4) goto L68
            if (r8 != r3) goto L3d
            goto L68
        L3d:
            e1.a$f r8 = new e1.a$f     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r1 = r7.f37673d     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r2 = 12
            if (r1 != r2) goto L4c
            r7.f(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L4c:
            r2 = 7
            if (r1 != r2) goto L53
            r7.i(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L53:
            r2 = 10
            if (r1 != r2) goto L5b
            r7.m(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L5b:
            r7.l(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
        L5e:
            int r1 = r7.f37678j     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.c(r1)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r7.z(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L68:
            e1.a$b r8 = new e1.a$b     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r2 = r7.f37673d     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            if (r2 != r6) goto L75
            r7.g(r8, r1, r1)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L75:
            if (r2 != r4) goto L7b
            r7.j(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L7b:
            if (r2 != r5) goto L81
            r7.k(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L81:
            if (r2 != r3) goto L86
            r7.n(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
        L86:
            r7.a()
            if (r0 == 0) goto Laa
            r7.t()
            return
        L8f:
            if (r0 == 0) goto La2
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r8)     // Catch: java.lang.Throwable -> L17
            goto La2
        L99:
            r7.a()
            if (r0 == 0) goto La1
            r7.t()
        La1:
            throw r8
        La2:
            r7.a()
            if (r0 == 0) goto Laa
            r7.t()
        Laa:
            return
        Lab:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C4303a.r(java.io.InputStream):void");
    }

    public final void s(f fVar) throws IOException {
        ByteOrder byteOrderU = u(fVar);
        this.f37676g = byteOrderU;
        fVar.f37687c = byteOrderU;
        int unsignedShort = fVar.readUnsignedShort();
        int i = this.f37673d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i10 = fVar.readInt();
        if (i10 < 8) {
            throw new IOException(C4356c.h(i10, "Invalid first Ifd offset: "));
        }
        int i11 = i10 - 8;
        if (i11 > 0) {
            fVar.a(i11);
        }
    }

    public final void t() {
        int i = 0;
        while (true) {
            HashMap<String, c>[] mapArr = this.f37674e;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbJ = C4356c.j(i, "The size of tag group[", "]: ");
            sbJ.append(mapArr[i].size());
            Log.d("ExifInterface", sbJ.toString());
            for (Map.Entry<String, c> entry : mapArr[i].entrySet()) {
                c value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.i(this.f37676g) + "'");
            }
            i++;
        }
    }

    public final void v(int i, byte[] bArr) throws IOException {
        f fVar = new f(bArr);
        s(fVar);
        w(fVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(e1.C4303a.f r37, int r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C4303a.w(e1.a$f, int):void");
    }

    public final void x(int i, String str, String str2) {
        HashMap<String, c>[] mapArr = this.f37674e;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap<String, c> map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C4303a.y(java.lang.String, java.lang.String):void");
    }

    public final void z(b bVar) throws Throwable {
        c cVar;
        int iH;
        HashMap<String, c> map = this.f37674e[4];
        c cVar2 = map.get("Compression");
        if (cVar2 == null) {
            p(bVar, map);
            return;
        }
        int iH2 = cVar2.h(this.f37676g);
        if (iH2 != 1) {
            if (iH2 == 6) {
                p(bVar, map);
                return;
            } else if (iH2 != 7) {
                return;
            }
        }
        c cVar3 = map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.j(this.f37676g);
            int[] iArr2 = f37660q;
            if (Arrays.equals(iArr2, iArr) || (this.f37673d == 3 && (cVar = map.get("PhotometricInterpretation")) != null && (((iH = cVar.h(this.f37676g)) == 1 && Arrays.equals(iArr, f37661r)) || (iH == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = map.get("StripOffsets");
                c cVar5 = map.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] jArrC = C4304b.c(cVar4.j(this.f37676g));
                long[] jArrC2 = C4304b.c(cVar5.j(this.f37676g));
                if (jArrC == null || jArrC.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrC2 == null || jArrC2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrC.length != jArrC2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j4 = 0;
                for (long j10 : jArrC2) {
                    j4 += j10;
                }
                byte[] bArr = new byte[(int) j4];
                this.i = true;
                this.f37677h = true;
                int i = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < jArrC.length; i11++) {
                    int i12 = (int) jArrC[i11];
                    int i13 = (int) jArrC2[i11];
                    if (i11 < jArrC.length - 1 && i12 + i13 != jArrC[i11 + 1]) {
                        this.i = false;
                    }
                    int i14 = i12 - i;
                    if (i14 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j11 = i14;
                    if (bVar.skip(j11) != j11) {
                        Log.d("ExifInterface", "Failed to skip " + i14 + " bytes.");
                        return;
                    }
                    int i15 = i + i14;
                    byte[] bArr2 = new byte[i13];
                    if (bVar.read(bArr2) != i13) {
                        Log.d("ExifInterface", "Failed to read " + i13 + " bytes.");
                        return;
                    }
                    i = i15 + i13;
                    System.arraycopy(bArr2, 0, bArr, i10, i13);
                    i10 += i13;
                }
                if (this.i) {
                    long j12 = jArrC[0];
                    return;
                }
                return;
            }
        }
        if (f37657n) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* compiled from: ExifInterface.java */
    /* renamed from: e1.a$f */
    public static class f extends b {
        public f(byte[] bArr) throws IOException {
            super(bArr);
            this.f37686b.mark(Integer.MAX_VALUE);
        }

        public final void c(long j4) throws IOException {
            int i = this.f37688d;
            if (i > j4) {
                this.f37688d = 0;
                this.f37686b.reset();
            } else {
                j4 -= i;
            }
            a((int) j4);
        }

        public f(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f37686b.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* compiled from: ExifInterface.java */
    /* renamed from: e1.a$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f37694a;

        /* renamed from: b, reason: collision with root package name */
        public final String f37695b;

        /* renamed from: c, reason: collision with root package name */
        public final int f37696c;

        /* renamed from: d, reason: collision with root package name */
        public final int f37697d;

        public d(String str, int i, int i10) {
            this.f37695b = str;
            this.f37694a = i;
            this.f37696c = i10;
            this.f37697d = -1;
        }

        public d(int i, int i10, int i11, String str) {
            this.f37695b = str;
            this.f37694a = i;
            this.f37696c = i10;
            this.f37697d = i11;
        }
    }

    public C4303a(InputStream inputStream) throws IOException {
        d[][] dVarArr = f37645J;
        this.f37674e = new HashMap[dVarArr.length];
        this.f37675f = new HashSet(dVarArr.length);
        this.f37676g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f37670a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f37672c = (AssetManager.AssetInputStream) inputStream;
                this.f37671b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    C4304b.a.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f37672c = null;
                    this.f37671b = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (f37657n) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            } else {
                this.f37672c = null;
                this.f37671b = null;
            }
            r(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    /* compiled from: ExifInterface.java */
    /* renamed from: e1.a$a, reason: collision with other inner class name */
    public class C0445a extends MediaDataSource {

        /* renamed from: b, reason: collision with root package name */
        public long f37682b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f37683c;

        public C0445a(f fVar) {
            this.f37683c = fVar;
        }

        @Override // android.media.MediaDataSource
        public final long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j4, byte[] bArr, int i, int i10) throws IOException {
            if (i10 == 0) {
                return 0;
            }
            if (j4 < 0) {
                return -1;
            }
            try {
                long j10 = this.f37682b;
                f fVar = this.f37683c;
                if (j10 != j4) {
                    if (j10 >= 0 && j4 >= j10 + fVar.f37686b.available()) {
                        return -1;
                    }
                    fVar.c(j4);
                    this.f37682b = j4;
                }
                if (i10 > fVar.f37686b.available()) {
                    i10 = fVar.f37686b.available();
                }
                int i11 = fVar.read(bArr, i, i10);
                if (i11 >= 0) {
                    this.f37682b += i11;
                    return i11;
                }
            } catch (IOException unused) {
            }
            this.f37682b = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }
    }
}
