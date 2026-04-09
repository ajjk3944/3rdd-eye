package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
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

/* renamed from: com.google.android.gms.internal.ads.Jp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0582Jp {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f9372a;

    public static boolean A(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                file.setReadOnly();
            }
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            Q2.b.c(fileOutputStream);
            return true;
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            Q2.b.c(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            Q2.b.c(fileOutputStream2);
            throw th;
        }
    }

    public static boolean B(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static final byte[] C(byte[] bArr, int i, byte[] bArr2) {
        if (bArr.length - 16 < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i3] = (byte) (bArr[i3 + i] ^ bArr2[i3]);
        }
        return bArr3;
    }

    public static int D(SQLiteDatabase sQLiteDatabase, int i) {
        int i3 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor cursorC0 = c0(sQLiteDatabase, i);
        if (cursorC0.getCount() > 0) {
            cursorC0.moveToNext();
            i3 = cursorC0.getInt(cursorC0.getColumnIndexOrThrow("value"));
        }
        cursorC0.close();
        return i3;
    }

    public static File E(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        O(file2, false);
        return file2;
    }

    public static String F(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static AbstractList G(List list, NA na) {
        return A.f.y(list) ? new ZB(list, na) : new C0869aC(list, na);
    }

    public static LinkedHashMap H(int i) {
        return new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static void I(int i, int i3, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i3;
        } else {
            ((int[]) obj)[i] = i3;
        }
    }

    public static void J(Bundle bundle, String str, int i, boolean z6) {
        if (z6) {
            bundle.putInt(str, i);
        }
    }

    public static void K(File file, File file2) throws Throwable {
        file.getClass();
        file2.getClass();
        if (file.equals(file2)) {
            throw new IllegalArgumentException(Cr.E("Source %s and destination %s must be different", file, file2));
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file.equals(file2)) {
            throw new IllegalArgumentException(Cr.E("Source %s and destination %s must be different", file, file2));
        }
        RB rbK = RB.k(new EC[0]);
        DC dc = new DC();
        ArrayDeque arrayDeque = dc.f7734a;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            arrayDeque.addFirst(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(file2, rbK.contains(EC.f7926a));
            arrayDeque.addFirst(fileOutputStream);
            int i = BC.f7318a;
            byte[] bArr = new byte[8192];
            while (true) {
                int i3 = fileInputStream.read(bArr);
                if (i3 == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, i3);
                }
            }
            dc.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th) {
            try {
                dc.f7735b = th;
                Object obj = AbstractC0977cB.f13539a;
                if (IOException.class.isInstance(th)) {
                    throw ((Throwable) IOException.class.cast(th));
                }
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                if (!(th instanceof Error)) {
                    throw new RuntimeException(th);
                }
                throw ((Error) th);
            } catch (Throwable th2) {
                dc.close();
                throw th2;
            }
        }
    }

    public static final void L(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i3 = 0; i3 < i; i3++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static void N(Bundle bundle, String str, boolean z6, boolean z7) {
        if (z7) {
            bundle.putBoolean(str, z6);
        }
    }

    public static void O(File file, boolean z6) {
        if (z6 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void P(String str, int i, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(Cr.E(str, Integer.valueOf(i)));
        }
    }

    public static void Q(byte[] bArr, long j6, int i) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i + i3] = (byte) (255 & j6);
            j6 >>= 8;
        }
    }

    public static boolean R(char c6) {
        return c6 >= 'A' && c6 <= 'Z';
    }

    public static int T(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i6;
        int iR = AbstractC1984ut.r(obj);
        int i7 = iR & i;
        int iR2 = r(i7, obj3);
        if (iR2 != 0) {
            int i8 = ~i;
            int i9 = iR & i8;
            int i10 = -1;
            while (true) {
                i3 = iR2 - 1;
                int i11 = iArr[i3];
                i6 = i11 & i;
                if ((i11 & i8) != i9 || !Objects.equals(obj, objArr[i3]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i3]))) {
                    if (i6 == 0) {
                        break;
                    }
                    i10 = i3;
                    iR2 = i6;
                } else {
                    break;
                }
            }
            if (i10 == -1) {
                I(i7, i6, obj3);
                return i3;
            }
            iArr[i10] = (iArr[i10] & i8) | (i6 & i);
            return i3;
        }
        return -1;
    }

    public static void V(SQLiteDatabase sQLiteDatabase, long j6, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j6));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j6)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void W(String str, long j6, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(Cr.E(str, Long.valueOf(j6)));
        }
    }

    public static void X(String str, Bundle bundle, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static boolean Y(File file) {
        boolean z6;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z6 = true;
            for (int i = 0; i < fileArrListFiles.length; i++) {
                File file2 = fileArrListFiles[i];
                z6 = file2 != null && Y(file2) && z6;
            }
        } else {
            z6 = true;
        }
        return file.delete() && z6;
    }

    public static boolean Z(String str, CharSequence charSequence) {
        char c6;
        int length = str.length();
        if (str == charSequence) {
            return true;
        }
        if (length == charSequence.length()) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == charSequence.charAt(i) || ((c6 = (char) ((r3 | ' ') - 97)) < 26 && c6 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static Bundle a(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static File b(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(E(file, str), str2);
    }

    public static void b0(boolean z6, String str, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(Cr.E(str, obj));
        }
    }

    public static Object c(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(A.f.i(i, "must be power of 2 between 2^1 and 2^30: ", new StringBuilder(String.valueOf(i).length() + 41)));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static Cursor c0(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static Object d(Future future) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void d0(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
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

    public static void f0(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static String g(QK qk) {
        StringBuilder sb = new StringBuilder(qk.f());
        for (int i = 0; i < qk.f(); i++) {
            byte bD = qk.d(i);
            if (bD == 34) {
                sb.append("\\\"");
            } else if (bD == 39) {
                sb.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb.append('\\');
                            sb.append((char) (((bD >>> 6) & 3) + 48));
                            sb.append((char) (((bD >>> 3) & 7) + 48));
                            sb.append((char) ((bD & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bD);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void g0(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static String h(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (R(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c6 = charArray[i];
                    if (R(c6)) {
                        charArray[i] = (char) (c6 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void h0(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    public static ArrayList i(AbstractC1896tC abstractC1896tC) {
        ArrayList arrayList = new ArrayList();
        abstractC1896tC.getClass();
        while (abstractC1896tC.hasNext()) {
            arrayList.add(abstractC1896tC.next());
        }
        return arrayList;
    }

    public static void i0(String str, boolean z6) {
        if (!z6) {
            throw new IllegalStateException(str);
        }
    }

    public static void j(long j6, String str) {
        if (j6 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 17);
        sb.append(str);
        sb.append(" (");
        sb.append(j6);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void j0(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void k0(int i, int i3) {
        String strE;
        if (i < 0 || i >= i3) {
            if (i < 0) {
                strE = Cr.E("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i3 < 0) {
                    throw new IllegalArgumentException(A.f.i(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
                }
                strE = Cr.E("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strE);
        }
    }

    public static void l(File file, byte[] bArr) throws IOException {
        file.getClass();
        RB rbK = RB.k(new EC[0]);
        bArr.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, rbK.contains(EC.f7926a));
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void l0(int i, int i3) {
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(n0(i, i3, "index"));
        }
    }

    public static void m(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    public static void m0(int i, int i3, int i6) {
        if (i < 0 || i3 < i || i3 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? n0(i, i6, "start index") : (i3 < 0 || i3 > i6) ? n0(i3, i6, "end index") : Cr.E("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i)));
        }
    }

    public static void n(long[] jArr, long[] jArr2, int i) {
        for (int i3 = 0; i3 < 10; i3++) {
            int i6 = (int) jArr[i3];
            jArr[i3] = ((-i) & (((int) jArr2[i3]) ^ i6)) ^ i6;
        }
    }

    public static String n0(int i, int i3, String str) {
        if (i < 0) {
            return Cr.E("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i3 >= 0) {
            return Cr.E("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(A.f.i(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
    }

    public static boolean o(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static byte[] p(byte[] bArr, byte[] bArr2) {
        long jS = s(0, bArr) & 67108863;
        int i = 3;
        long jS2 = (s(3, bArr) >> 2) & 67108611;
        long jS3 = (s(6, bArr) >> 4) & 67092735;
        long jS4 = (s(9, bArr) >> 6) & 66076671;
        long jS5 = (s(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        int i3 = 0;
        while (true) {
            int length = bArr2.length;
            if (i3 >= length) {
                long j11 = j6 + (j7 >> 26);
                long j12 = j11 & 67108863;
                long j13 = j8 + (j11 >> 26);
                long j14 = j13 & 67108863;
                long j15 = j9 + (j13 >> 26);
                long j16 = j15 & 67108863;
                long j17 = ((j15 >> 26) * 5) + j10;
                long j18 = j17 >> 26;
                long j19 = j17 & 67108863;
                long j20 = j19 + 5;
                long j21 = (j7 & 67108863) + j18;
                long j22 = j21 + (j20 >> 26);
                long j23 = j12 + (j22 >> 26);
                long j24 = j14 + (j23 >> 26);
                long j25 = (j16 + (j24 >> 26)) - 67108864;
                long j26 = j25 >> 63;
                long j27 = ~j26;
                long j28 = (j21 & j26) | (j22 & 67108863 & j27);
                long j29 = (j12 & j26) | (j23 & 67108863 & j27);
                long j30 = (j14 & j26) | (j24 & 67108863 & j27);
                long j31 = (j16 & j26) | (j25 & j27);
                long jS6 = s(16, bArr) + (((j20 & 67108863 & j27) | (j19 & j26) | (j28 << 26)) & 4294967295L);
                long jS7 = s(20, bArr) + (((j28 >> 6) | (j29 << 20)) & 4294967295L);
                long jS8 = s(24, bArr);
                long jS9 = s(28, bArr) + (((j30 >> 18) | (j31 << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                Q(bArr4, jS6 & 4294967295L, 0);
                long j32 = jS7 + (jS6 >> 32);
                Q(bArr4, j32 & 4294967295L, 4);
                long j33 = jS8 + (((j30 << 14) | (j29 >> 12)) & 4294967295L) + (j32 >> 32);
                Q(bArr4, j33 & 4294967295L, 8);
                Q(bArr4, (jS9 + (j33 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long j34 = jS5 * 5;
            long j35 = jS4 * 5;
            long j36 = jS3 * 5;
            long jS10 = j10 + (s(0, bArr3) & 67108863);
            long jS11 = j7 + ((s(i, bArr3) >> 2) & 67108863);
            long jS12 = j6 + ((s(6, bArr3) >> 4) & 67108863);
            long jS13 = j8 + ((s(9, bArr3) >> 6) & 67108863);
            long j37 = jS2;
            long jS14 = j9 + (((s(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j38 = jS11 * jS;
            long j39 = jS11 * j37;
            long j40 = jS12 * jS;
            long j41 = jS11 * jS3;
            long j42 = jS12 * j37;
            long j43 = jS13 * jS;
            long j44 = jS11 * jS4;
            long j45 = jS12 * jS3;
            long j46 = jS13 * j37;
            long j47 = jS14 * jS;
            long j48 = (jS2 * 5 * jS14) + (jS13 * j36) + (jS12 * j35) + (jS11 * j34) + (jS10 * jS);
            long j49 = j48 & 67108863;
            long j50 = jS13 * j35;
            long j51 = j36 * jS14;
            long j52 = j51 + j50 + (jS12 * j34) + (jS10 * j37) + j38 + (j48 >> 26);
            long j53 = j35 * jS14;
            long j54 = j53 + (jS13 * j34) + (jS10 * jS3) + j39 + j40 + (j52 >> 26);
            long j55 = (jS14 * j34) + (jS10 * jS4) + j41 + j42 + j43 + (j54 >> 26);
            long j56 = (jS10 * jS5) + j44 + j45 + j46 + j47 + (j55 >> 26);
            long j57 = ((j56 >> 26) * 5) + j49;
            j7 = (j52 & 67108863) + (j57 >> 26);
            i3 += 16;
            j6 = j54 & 67108863;
            j8 = j55 & 67108863;
            j9 = j56 & 67108863;
            j10 = j57 & 67108863;
            jS2 = j37;
            i = 3;
        }
    }

    public static byte[] q(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        int i3 = 0;
        while (true) {
            if (i >= bArr.length) {
                byte[] bArr2 = new byte[i3];
                int i6 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i6, length);
                    i6 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i].length;
            if (i3 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i3 += length2;
            i++;
        }
    }

    public static int r(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static long s(int i, byte[] bArr) {
        int i3 = bArr[i] & 255;
        int i6 = bArr[i + 1] & 255;
        int i7 = bArr[i + 2] & 255;
        return (((bArr[i + 3] & 255) << 24) | (i6 << 8) | i3 | (i7 << 16)) & 4294967295L;
    }

    public static String t(EnumC0932bK enumC0932bK) throws GeneralSecurityException {
        int iOrdinal = enumC0932bK.ordinal();
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
        throw new GeneralSecurityException("Unsupported hash ".concat(enumC0932bK.toString()));
    }

    public static String u(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c6 = charArray[i];
                    if (c6 >= 'a' && c6 <= 'z') {
                        charArray[i] = (char) (c6 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void v(Bundle bundle, String str, String str2, boolean z6) {
        if (!z6 || str2 == null) {
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

    public static void y(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void z(boolean z6) {
        if (!z6) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public abstract boolean M(AbstractC1198gD abstractC1198gD, C1143fD c1143fD, C1143fD c1143fD2);

    public abstract boolean S(YC yc, VC vc, VC vc2);

    public abstract C1143fD U(YC yc);

    public abstract VC a0(YC yc);

    public abstract boolean e0(AbstractC1198gD abstractC1198gD, Object obj, Object obj2);

    public abstract void k(C1143fD c1143fD, Thread thread);

    public abstract void w(C1143fD c1143fD, C1143fD c1143fD2);
}
