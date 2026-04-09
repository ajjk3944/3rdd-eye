package qb;

import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.e0;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f20758a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f20759b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f20760c = {0, 0, 0, 1};

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f20761d = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: e, reason: collision with root package name */
    public static final Object f20762e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static int[] f20763f = new int[10];

    /* renamed from: g, reason: collision with root package name */
    public static final Object f20764g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f20765h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static boolean f20766i;
    public static long j;

    public static void A(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static qb.o B(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.b.B(byte[], int, int):qb.o");
    }

    public static long C(int i10, byte[] bArr) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    public static long D(int i10, byte[] bArr) {
        long jC = C(i10, bArr);
        long jC2 = C(i10 + 4, bArr);
        if (jC == 0 && jC2 == 0) {
            return 0L;
        }
        return ((jC2 * 1000) / 4294967296L) + ((jC - 2208988800L) * 1000);
    }

    public static String E(StringBuilder sb2, int i10, int i11) {
        int i12;
        int iLastIndexOf;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i13 = i10;
        int i14 = i13;
        while (i13 <= i11) {
            if (i13 == i11) {
                i12 = i13;
            } else if (sb2.charAt(i13) == '/') {
                i12 = i13 + 1;
            } else {
                i13++;
            }
            int i15 = i14 + 1;
            if (i13 == i15 && sb2.charAt(i14) == '.') {
                sb2.delete(i14, i12);
                i11 -= i12 - i14;
            } else {
                if (i13 == i14 + 2 && sb2.charAt(i14) == '.' && sb2.charAt(i15) == '.') {
                    iLastIndexOf = sb2.lastIndexOf("/", i14 - 2) + 1;
                    int i16 = iLastIndexOf > i10 ? iLastIndexOf : i10;
                    sb2.delete(i16, i12);
                    i11 -= i12 - i16;
                } else {
                    iLastIndexOf = i13 + 1;
                }
                i14 = iLastIndexOf;
            }
            i13 = i14;
        }
        return sb2.toString();
    }

    public static String F(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrV = v(str2);
        if (iArrV[0] != -1) {
            sb2.append(str2);
            E(sb2, iArrV[1], iArrV[2]);
            return sb2.toString();
        }
        int[] iArrV2 = v(str);
        if (iArrV[3] == 0) {
            sb2.append((CharSequence) str, 0, iArrV2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (iArrV[2] == 0) {
            sb2.append((CharSequence) str, 0, iArrV2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i10 = iArrV[1];
        if (i10 != 0) {
            int i11 = iArrV2[0] + 1;
            sb2.append((CharSequence) str, 0, i11);
            sb2.append(str2);
            return E(sb2, iArrV[1] + i11, i11 + iArrV[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb2.append((CharSequence) str, 0, iArrV2[1]);
            sb2.append(str2);
            int i12 = iArrV2[1];
            return E(sb2, i12, iArrV[2] + i12);
        }
        int i13 = iArrV2[0] + 2;
        int i14 = iArrV2[1];
        if (i13 >= i14 || i14 != iArrV2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrV2[2] - 1);
            int i15 = iLastIndexOf == -1 ? iArrV2[1] : iLastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i15);
            sb2.append(str2);
            return E(sb2, iArrV2[1], i15 + iArrV[2]);
        }
        sb2.append((CharSequence) str, 0, i14);
        sb2.append('/');
        sb2.append(str2);
        int i16 = iArrV2[1];
        return E(sb2, i16, iArrV[2] + i16 + 1);
    }

    public static Uri G(String str, String str2) {
        return Uri.parse(F(str, str2));
    }

    public static void H(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(w.g.e("csd-", 15, i10), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static int I(int i10, byte[] bArr) {
        int i11;
        synchronized (f20762e) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f20763f;
                    if (iArr.length <= i13) {
                        f20763f = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f20763f[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f20763f[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }

    public static void J(String str, String str2, Exception exc) {
        e0.p(str, c(str2, exc));
    }

    public static long a() throws UnknownHostException {
        char c4;
        long j7;
        synchronized (f20765h) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                c4 = 0;
                j7 = jCurrentTimeMillis;
            } else {
                long j10 = jCurrentTimeMillis / 1000;
                long j11 = jCurrentTimeMillis - (j10 * 1000);
                c4 = 0;
                j7 = jCurrentTimeMillis;
                bArr[40] = (byte) (r14 >> 24);
                bArr[41] = (byte) (r14 >> 16);
                bArr[42] = (byte) (r14 >> 8);
                bArr[43] = (byte) (j10 + 2208988800L);
                long j12 = (j11 * 4294967296L) / 1000;
                bArr[44] = (byte) (j12 >> 24);
                bArr[45] = (byte) (j12 >> 16);
                bArr[46] = (byte) (j12 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j13 = (jElapsedRealtime2 - jElapsedRealtime) + j7;
            byte b2 = bArr[c4];
            int i10 = bArr[1] & 255;
            long jD = D(24, bArr);
            long jD2 = D(32, bArr);
            long jD3 = D(40, bArr);
            m((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i10, jD3);
            long j14 = (j13 + (((jD3 - j13) + (jD2 - jD)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j14;
        } finally {
        }
    }

    public static void b(String str, int i10, int i11) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
            StringBuilder sb2 = new StringBuilder(c7.a.d(c7.a.d(10, strGlGetShaderInfoLog), str));
            sb2.append(strGlGetShaderInfoLog);
            sb2.append(", source: ");
            sb2.append(str);
            e0.d("GlUtil", sb2.toString());
        }
        GLES20.glAttachShader(i11, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        h();
    }

    public static String c(String str, Throwable th2) {
        String strU = u(th2);
        if (TextUtils.isEmpty(strU)) {
            return str;
        }
        String strValueOf = String.valueOf(str);
        String strReplace = strU.replace("\n", "\n  ");
        StringBuilder sb2 = new StringBuilder(c7.a.d(strValueOf.length() + 4, strReplace));
        sb2.append(strValueOf);
        sb2.append("\n  ");
        sb2.append(strReplace);
        sb2.append('\n');
        return sb2.toString();
    }

    public static void d(String str) {
        if (v.f20828a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static String e(a5.u uVar) {
        uVar.s(24);
        int i10 = uVar.i(2);
        boolean zH = uVar.h();
        int i11 = uVar.i(5);
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            if (uVar.h()) {
                i12 |= 1 << i13;
            }
        }
        int i14 = 6;
        int[] iArr = new int[6];
        for (int i15 = 0; i15 < 6; i15++) {
            iArr[i15] = uVar.i(8);
        }
        Object[] objArr = {f20759b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(zH ? 'H' : 'L'), Integer.valueOf(uVar.i(8))};
        int i16 = v.f20828a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        while (i14 > 0 && iArr[i14 - 1] == 0) {
            i14--;
        }
        for (int i17 = 0; i17 < i14; i17++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i17])));
        }
        return sb2.toString();
    }

    public static void f(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void g(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void h() {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            String strValueOf = String.valueOf(GLU.gluErrorString(iGlGetError));
            e0.d("GlUtil", strValueOf.length() != 0 ? "glError ".concat(strValueOf) : new String("glError "));
        }
    }

    public static void i(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void j(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void k(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static void m(byte b2, byte b10, int i10, long j7) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b10 != 4 && b10 != 5) {
            throw new IOException(w.g.e("SNTP: Untrusted mode: ", 26, b10));
        }
        if (i10 == 0 || i10 > 15) {
            throw new IOException(w.g.e("SNTP: Untrusted stratum: ", 36, i10));
        }
        if (j7 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static void n(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int o(String str, String str2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        h();
        b(str, 35633, iGlCreateProgram);
        b(str2, 35632, iGlCreateProgram);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String strValueOf = String.valueOf(GLES20.glGetProgramInfoLog(iGlCreateProgram));
            e0.d("GlUtil", strValueOf.length() != 0 ? "Unable to link shader program: \n".concat(strValueOf) : new String("Unable to link shader program: \n"));
        }
        h();
        return iGlCreateProgram;
    }

    public static FloatBuffer p(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void q(String str, String str2, Throwable th2) {
        e0.d(str, c(str2, th2));
    }

    public static void r() {
        if (v.f20828a >= 18) {
            Trace.endSection();
        }
    }

    public static int s(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        j(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            n(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            n(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            n(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b2 = bArr[i14];
            if ((b2 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b2 == 1) {
                    n(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static String t(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static String u(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
            if (cause instanceof UnknownHostException) {
                return "UnknownHostException (no network)";
            }
        }
        return Log.getStackTraceString(th2).trim().replace("\t", "    ");
    }

    public static int[] v(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i10 = iIndexOf5 + 2;
        if (i10 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i10) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.b.w(java.lang.String):int");
    }

    public static int x(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }

    public static boolean y(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean z(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }
}
