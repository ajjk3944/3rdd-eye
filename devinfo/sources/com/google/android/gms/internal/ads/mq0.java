package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.applovin.shadow.okio.Segment;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Future;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class mq0 {
    public static boolean A(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                file.setReadOnly();
            }
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            tb.b.d(fileOutputStream);
            return true;
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            tb.b.d(fileOutputStream2);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            tb.b.d(fileOutputStream2);
            throw th;
        }
    }

    public static boolean B(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static final byte[] C(byte[] bArr, int i4, byte[] bArr2) {
        if (bArr.length - 16 < i4) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int i10 = 0; i10 < 16; i10++) {
            bArr3[i10] = (byte) (bArr[i10 + i4] ^ bArr2[i10]);
        }
        return bArr3;
    }

    public static File D(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        N(file2, false);
        return file2;
    }

    public static String E(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i4 = 0; i4 < attributeCount; i4++) {
            if (xmlPullParser.getAttributeName(i4).equals(str)) {
                return xmlPullParser.getAttributeValue(i4);
            }
        }
        return null;
    }

    public static AbstractList F(List list, z21 z21Var) {
        return a0.g.C(list) ? new m51(list, z21Var) : new n51(list, z21Var);
    }

    public static LinkedHashMap G(int i4) {
        return new LinkedHashMap(i4 < 3 ? i4 + 1 : i4 < 1073741824 ? (int) ((i4 / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static void H(int i4, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i4] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i4] = (short) i10;
        } else {
            ((int[]) obj)[i4] = i10;
        }
    }

    public static void I(Bundle bundle, String str, int i4, boolean z3) {
        if (z3) {
            bundle.putInt(str, i4);
        }
    }

    public static void J(File file, File file2) throws IOException {
        file.getClass();
        file2.getClass();
        if (file.equals(file2)) {
            throw new IllegalArgumentException(al0.H("Source %s and destination %s must be different", file, file2));
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file.equals(file2)) {
            throw new IllegalArgumentException(al0.H("Source %s and destination %s must be different", file, file2));
        }
        e51 e51VarO = e51.o(new s61[0]);
        r61 r61Var = new r61();
        ArrayDeque arrayDeque = r61Var.f15554a;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            arrayDeque.addFirst(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(file2, e51VarO.contains(s61.f15880a));
            arrayDeque.addFirst(fileOutputStream);
            int i4 = p61.f14904a;
            byte[] bArr = new byte[Segment.SIZE];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, i10);
                }
            }
            r61Var.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th2) {
            try {
                r61Var.f15555b = th2;
                Object obj = o31.f14530a;
                if (IOException.class.isInstance(th2)) {
                    throw ((Throwable) IOException.class.cast(th2));
                }
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                if (!(th2 instanceof Error)) {
                    throw new RuntimeException(th2);
                }
                throw ((Error) th2);
            } catch (Throwable th3) {
                r61Var.close();
                throw th3;
            }
        }
    }

    public static final void K(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i4) {
        if (i4 < 0 || byteBuffer2.remaining() < i4 || byteBuffer3.remaining() < i4 || byteBuffer.remaining() < i4) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i10 = 0; i10 < i4; i10++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static void M(Bundle bundle, String str, boolean z3, boolean z10) {
        if (z10) {
            bundle.putBoolean(str, z3);
        }
    }

    public static void N(File file, boolean z3) {
        if (z3 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void O(boolean z3, int i4, String str) {
        if (!z3) {
            throw new IllegalArgumentException(al0.H(str, Integer.valueOf(i4)));
        }
    }

    public static void P(byte[] bArr, long j, int i4) {
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i4 + i10] = (byte) (255 & j);
            j >>= 8;
        }
    }

    public static boolean Q(char c9) {
        return c9 >= 'A' && c9 <= 'Z';
    }

    public static int S(Object obj, Object obj2, int i4, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i10;
        int i11;
        int iR = yo0.r(obj);
        int i12 = iR & i4;
        int iR2 = r(i12, obj3);
        if (iR2 != 0) {
            int i13 = ~i4;
            int i14 = iR & i13;
            int i15 = -1;
            while (true) {
                i10 = iR2 - 1;
                int i16 = iArr[i10];
                i11 = i16 & i4;
                if ((i16 & i13) != i14 || !Objects.equals(obj, objArr[i10]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i10]))) {
                    if (i11 == 0) {
                        break;
                    }
                    i15 = i10;
                    iR2 = i11;
                } else {
                    break;
                }
            }
            if (i15 == -1) {
                H(i12, i11, obj3);
                return i10;
            }
            iArr[i15] = (iArr[i15] & i13) | (i11 & i4);
            return i10;
        }
        return -1;
    }

    public static void U(String str, long j, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(al0.H(str, Long.valueOf(j)));
        }
    }

    public static void V(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static boolean W(File file) {
        boolean z3;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z3 = true;
            for (int i4 = 0; i4 < fileArrListFiles.length; i4++) {
                File file2 = fileArrListFiles[i4];
                z3 = file2 != null && W(file2) && z3;
            }
        } else {
            z3 = true;
        }
        return file.delete() && z3;
    }

    public static boolean X(String str, CharSequence charSequence) {
        char c9;
        int length = str.length();
        if (str == charSequence) {
            return true;
        }
        if (length == charSequence.length()) {
            for (int i4 = 0; i4 < length; i4++) {
                if (str.charAt(i4) == charSequence.charAt(i4) || ((c9 = (char) ((r3 | ' ') - 97)) < 26 && c9 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static void Z(boolean z3, String str, Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(al0.H(str, obj));
        }
    }

    public static Bundle a(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void a0(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static File b(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(D(file, str), str2);
    }

    public static Object c(int i4) {
        if (i4 < 2 || i4 > 1073741824 || Integer.highestOneBit(i4) != i4) {
            throw new IllegalArgumentException(d.h.q(i4, "must be power of 2 between 2^1 and 2^30: ", new StringBuilder(String.valueOf(i4).length() + 41)));
        }
        return i4 <= 256 ? new byte[i4] : i4 <= 65536 ? new short[i4] : new int[i4];
    }

    public static void c0(boolean z3) {
        if (!z3) {
            throw new IllegalStateException();
        }
    }

    public static Object d(Future future) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th2) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void d0(String str, boolean z3) {
        if (!z3) {
            throw new IllegalStateException(str);
        }
    }

    public static /* synthetic */ String e(int i4) {
        switch (i4) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static void e0(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static String f(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static void f0(int i4, int i10) {
        String strH;
        if (i4 < 0 || i4 >= i10) {
            if (i4 < 0) {
                strH = al0.H("%s (%s) must not be negative", "index", Integer.valueOf(i4));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(d.h.q(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
                }
                strH = al0.H("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    public static String g(bn1 bn1Var) {
        StringBuilder sb2 = new StringBuilder(bn1Var.i());
        for (int i4 = 0; i4 < bn1Var.i(); i4++) {
            byte bF = bn1Var.f(i4);
            if (bF == 34) {
                sb2.append("\\\"");
            } else if (bF == 39) {
                sb2.append("\\'");
            } else if (bF != 92) {
                switch (bF) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bF < 32 || bF > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bF >>> 6) & 3) + 48));
                            sb2.append((char) (((bF >>> 3) & 7) + 48));
                            sb2.append((char) ((bF & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bF);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static void g0(int i4, int i10) {
        if (i4 < 0 || i4 > i10) {
            throw new IndexOutOfBoundsException(i0(i4, i10, "index"));
        }
    }

    public static String h(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            if (Q(str.charAt(i4))) {
                char[] charArray = str.toCharArray();
                while (i4 < length) {
                    char c9 = charArray[i4];
                    if (Q(c9)) {
                        charArray[i4] = (char) (c9 ^ ' ');
                    }
                    i4++;
                }
                return String.valueOf(charArray);
            }
            i4++;
        }
        return str;
    }

    public static void h0(int i4, int i10, int i11) {
        if (i4 < 0 || i10 < i4 || i10 > i11) {
            throw new IndexOutOfBoundsException((i4 < 0 || i4 > i11) ? i0(i4, i11, "start index") : (i10 < 0 || i10 > i11) ? i0(i10, i11, "end index") : al0.H("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i4)));
        }
    }

    public static ArrayList i(h61 h61Var) {
        ArrayList arrayList = new ArrayList();
        h61Var.getClass();
        while (h61Var.hasNext()) {
            arrayList.add(h61Var.next());
        }
        return arrayList;
    }

    public static String i0(int i4, int i10, String str) {
        if (i4 < 0) {
            return al0.H("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i10 >= 0) {
            return al0.H("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(d.h.q(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
    }

    public static void j(long j, String str) {
        if (j >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 17);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void l(File file, byte[] bArr) throws IOException {
        file.getClass();
        e51 e51VarO = e51.o(new s61[0]);
        bArr.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, e51VarO.contains(s61.f15880a));
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void m(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void n(long[] jArr, long[] jArr2, int i4) {
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = (int) jArr[i10];
            jArr[i10] = ((-i4) & (((int) jArr2[i10]) ^ i11)) ^ i11;
        }
    }

    public static boolean o(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static byte[] p(byte[] bArr, byte[] bArr2) {
        long jS = s(0, bArr) & 67108863;
        int i4 = 3;
        long jS2 = (s(3, bArr) >> 2) & 67108611;
        long jS3 = (s(6, bArr) >> 4) & 67092735;
        long jS4 = (s(9, bArr) >> 6) & 66076671;
        long jS5 = (s(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        while (true) {
            int length = bArr2.length;
            if (i10 >= length) {
                long j12 = j + (j8 >> 26);
                long j13 = j12 & 67108863;
                long j14 = j9 + (j12 >> 26);
                long j15 = j14 & 67108863;
                long j16 = j10 + (j14 >> 26);
                long j17 = j16 & 67108863;
                long j18 = ((j16 >> 26) * 5) + j11;
                long j19 = j18 >> 26;
                long j20 = j18 & 67108863;
                long j21 = j20 + 5;
                long j22 = (j8 & 67108863) + j19;
                long j23 = j22 + (j21 >> 26);
                long j24 = j13 + (j23 >> 26);
                long j25 = j15 + (j24 >> 26);
                long j26 = (j17 + (j25 >> 26)) - 67108864;
                long j27 = j26 >> 63;
                long j28 = ~j27;
                long j29 = (j22 & j27) | (j23 & 67108863 & j28);
                long j30 = (j13 & j27) | (j24 & 67108863 & j28);
                long j31 = (j15 & j27) | (j25 & 67108863 & j28);
                long j32 = (j17 & j27) | (j26 & j28);
                long jS6 = s(16, bArr) + (((j21 & 67108863 & j28) | (j20 & j27) | (j29 << 26)) & 4294967295L);
                long jS7 = s(20, bArr) + (((j29 >> 6) | (j30 << 20)) & 4294967295L);
                long jS8 = s(24, bArr);
                long jS9 = s(28, bArr) + (((j31 >> 18) | (j32 << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                P(bArr4, jS6 & 4294967295L, 0);
                long j33 = jS7 + (jS6 >> 32);
                P(bArr4, j33 & 4294967295L, 4);
                long j34 = jS8 + (((j31 << 14) | (j30 >> 12)) & 4294967295L) + (j33 >> 32);
                P(bArr4, j34 & 4294967295L, 8);
                P(bArr4, (jS9 + (j34 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i10);
            System.arraycopy(bArr2, i10, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long j35 = jS5 * 5;
            long j36 = jS4 * 5;
            long j37 = jS3 * 5;
            long jS10 = j11 + (s(0, bArr3) & 67108863);
            long jS11 = j8 + ((s(i4, bArr3) >> 2) & 67108863);
            long jS12 = j + ((s(6, bArr3) >> 4) & 67108863);
            long jS13 = j9 + ((s(9, bArr3) >> 6) & 67108863);
            long j38 = jS2;
            long jS14 = j10 + (((s(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j39 = jS11 * jS;
            long j40 = jS11 * j38;
            long j41 = jS12 * jS;
            long j42 = jS11 * jS3;
            long j43 = jS12 * j38;
            long j44 = jS13 * jS;
            long j45 = jS11 * jS4;
            long j46 = jS12 * jS3;
            long j47 = jS13 * j38;
            long j48 = jS14 * jS;
            long j49 = (jS2 * 5 * jS14) + (jS13 * j37) + (jS12 * j36) + (jS11 * j35) + (jS10 * jS);
            long j50 = j49 & 67108863;
            long j51 = jS13 * j36;
            long j52 = j37 * jS14;
            long j53 = j52 + j51 + (jS12 * j35) + (jS10 * j38) + j39 + (j49 >> 26);
            long j54 = j36 * jS14;
            long j55 = j54 + (jS13 * j35) + (jS10 * jS3) + j40 + j41 + (j53 >> 26);
            long j56 = (jS14 * j35) + (jS10 * jS4) + j42 + j43 + j44 + (j55 >> 26);
            long j57 = (jS10 * jS5) + j45 + j46 + j47 + j48 + (j56 >> 26);
            long j58 = ((j57 >> 26) * 5) + j50;
            j8 = (j53 & 67108863) + (j58 >> 26);
            i10 += 16;
            j = j55 & 67108863;
            j9 = j56 & 67108863;
            j10 = j57 & 67108863;
            j11 = j58 & 67108863;
            jS2 = j38;
            i4 = 3;
        }
    }

    public static byte[] q(byte[]... bArr) throws GeneralSecurityException {
        int i4 = 0;
        int i10 = 0;
        while (true) {
            if (i4 >= bArr.length) {
                byte[] bArr2 = new byte[i10];
                int i11 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i11, length);
                    i11 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i4].length;
            if (i10 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i10 += length2;
            i4++;
        }
    }

    public static int r(int i4, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i4] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i4] : ((int[]) obj)[i4];
    }

    public static long s(int i4, byte[] bArr) {
        int i10 = bArr[i4] & 255;
        int i11 = bArr[i4 + 1] & 255;
        int i12 = bArr[i4 + 2] & 255;
        return (((bArr[i4 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16)) & 4294967295L;
    }

    public static String t(ol1 ol1Var) throws GeneralSecurityException {
        int iOrdinal = ol1Var.ordinal();
        if (iOrdinal == 0) {
            return "SHA-1";
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(ol1Var.toString()));
    }

    public static String u(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            char cCharAt = str.charAt(i4);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i4 < length) {
                    char c9 = charArray[i4];
                    if (c9 >= 'a' && c9 <= 'z') {
                        charArray[i4] = (char) (c9 ^ ' ');
                    }
                    i4++;
                }
                return String.valueOf(charArray);
            }
            i4++;
        }
        return str;
    }

    public static void v(Bundle bundle, String str, String str2, boolean z3) {
        if (!z3 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void x(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void y(String str, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void z(boolean z3) {
        if (!z3) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public abstract boolean L(u71 u71Var, t71 t71Var, t71 t71Var2);

    public abstract boolean R(m71 m71Var, j71 j71Var, j71 j71Var2);

    public abstract t71 T(m71 m71Var);

    public abstract j71 Y(m71 m71Var);

    public abstract boolean b0(u71 u71Var, Object obj, Object obj2);

    public abstract void k(t71 t71Var, Thread thread);

    public abstract void w(t71 t71Var, t71 t71Var2);
}
