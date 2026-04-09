package u1;

import N7.G8;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: ProfileTranscoder.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f46524a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f46525b = {112, 114, 109, 0};

    public static byte[] a(C5619b[] c5619bArr, byte[] bArr) throws IOException {
        int length = 0;
        for (C5619b c5619b : c5619bArr) {
            length += ((((c5619b.f46521g * 2) + 7) & (-8)) / 8) + (c5619b.f46519e * 2) + b(c5619b.f46515a, bArr, c5619b.f46516b).getBytes(StandardCharsets.UTF_8).length + 16 + c5619b.f46520f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, g.f46528c)) {
            for (C5619b c5619b2 : c5619bArr) {
                j(byteArrayOutputStream, c5619b2, b(c5619b2.f46515a, bArr, c5619b2.f46516b));
                l(byteArrayOutputStream, c5619b2);
                int[] iArr = c5619b2.f46522h;
                int length2 = iArr.length;
                int i = 0;
                int i10 = 0;
                while (i < length2) {
                    int i11 = iArr[i];
                    C5620c.f(byteArrayOutputStream, i11 - i10);
                    i++;
                    i10 = i11;
                }
                k(byteArrayOutputStream, c5619b2);
            }
        } else {
            for (C5619b c5619b3 : c5619bArr) {
                j(byteArrayOutputStream, c5619b3, b(c5619b3.f46515a, bArr, c5619b3.f46516b));
            }
            for (C5619b c5619b4 : c5619bArr) {
                l(byteArrayOutputStream, c5619b4);
                int[] iArr2 = c5619b4.f46522h;
                int length3 = iArr2.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length3) {
                    int i14 = iArr2[i12];
                    C5620c.f(byteArrayOutputStream, i14 - i13);
                    i12++;
                    i13 = i14;
                }
                k(byteArrayOutputStream, c5619b4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String b(String str, byte[] bArr, String str2) {
        byte[] bArr2 = g.f46530e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g.f46529d;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!");
            }
            if (StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj)) {
                return str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                if ("!".equals(obj)) {
                    return str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!");
                }
                if (StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj)) {
                    return str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
            } else if (!str2.endsWith(".apk")) {
                return B4.f.c(G8.u(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!", str2);
            }
        }
        return str2;
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int iD = 0;
        for (int i10 = 0; i10 < i; i10++) {
            iD += (int) C5620c.d(byteArrayInputStream, 2);
            iArr[i10] = iD;
        }
        return iArr;
    }

    public static C5619b[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C5619b[] c5619bArr) throws IOException {
        byte[] bArr3 = g.f46531f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, g.f46532g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iD = (int) C5620c.d(fileInputStream, 2);
            byte[] bArrC = C5620c.c(fileInputStream, (int) C5620c.d(fileInputStream, 4), (int) C5620c.d(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
            try {
                C5619b[] c5619bArrF = f(byteArrayInputStream, bArr2, iD, c5619bArr);
                byteArrayInputStream.close();
                return c5619bArrF;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(g.f46526a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iD2 = (int) C5620c.d(fileInputStream, 1);
        byte[] bArrC2 = C5620c.c(fileInputStream, (int) C5620c.d(fileInputStream, 4), (int) C5620c.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrC2);
        try {
            C5619b[] c5619bArrE = e(byteArrayInputStream2, iD2, c5619bArr);
            byteArrayInputStream2.close();
            return c5619bArrE;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C5619b[] e(ByteArrayInputStream byteArrayInputStream, int i, C5619b[] c5619bArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C5619b[0];
        }
        if (i != c5619bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i10 = 0; i10 < i; i10++) {
            int iD = (int) C5620c.d(byteArrayInputStream, 2);
            iArr[i10] = (int) C5620c.d(byteArrayInputStream, 2);
            strArr[i10] = new String(C5620c.b(byteArrayInputStream, iD), StandardCharsets.UTF_8);
        }
        for (int i11 = 0; i11 < i; i11++) {
            C5619b c5619b = c5619bArr[i11];
            if (!c5619b.f46516b.equals(strArr[i11])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i12 = iArr[i11];
            c5619b.f46519e = i12;
            c5619b.f46522h = c(byteArrayInputStream, i12);
        }
        return c5619bArr;
    }

    public static C5619b[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C5619b[] c5619bArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C5619b[0];
        }
        if (i != c5619bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i10 = 0; i10 < i; i10++) {
            C5620c.d(byteArrayInputStream, 2);
            String str = new String(C5620c.b(byteArrayInputStream, (int) C5620c.d(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jD = C5620c.d(byteArrayInputStream, 4);
            int iD = (int) C5620c.d(byteArrayInputStream, 2);
            C5619b c5619b = null;
            if (c5619bArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i11 = 0;
                while (true) {
                    if (i11 >= c5619bArr.length) {
                        break;
                    }
                    if (c5619bArr[i11].f46516b.equals(strSubstring)) {
                        c5619b = c5619bArr[i11];
                        break;
                    }
                    i11++;
                }
            }
            if (c5619b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c5619b.f46518d = jD;
            int[] iArrC = c(byteArrayInputStream, iD);
            if (Arrays.equals(bArr, g.f46530e)) {
                c5619b.f46519e = iD;
                c5619b.f46522h = iArrC;
            }
        }
        return c5619bArr;
    }

    public static C5619b[] g(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, g.f46527b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iD = (int) C5620c.d(fileInputStream, 1);
        byte[] bArrC = C5620c.c(fileInputStream, (int) C5620c.d(fileInputStream, 4), (int) C5620c.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
        try {
            C5619b[] c5619bArrH = h(byteArrayInputStream, str, iD);
            byteArrayInputStream.close();
            return c5619bArrH;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C5619b[] h(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C5619b[0];
        }
        C5619b[] c5619bArr = new C5619b[i];
        for (int i10 = 0; i10 < i; i10++) {
            int iD = (int) C5620c.d(byteArrayInputStream, 2);
            int iD2 = (int) C5620c.d(byteArrayInputStream, 2);
            c5619bArr[i10] = new C5619b(str, new String(C5620c.b(byteArrayInputStream, iD), StandardCharsets.UTF_8), C5620c.d(byteArrayInputStream, 4), iD2, (int) C5620c.d(byteArrayInputStream, 4), (int) C5620c.d(byteArrayInputStream, 4), new int[iD2], new TreeMap());
        }
        for (int i11 = 0; i11 < i; i11++) {
            C5619b c5619b = c5619bArr[i11];
            int iAvailable = byteArrayInputStream.available() - c5619b.f46520f;
            int iD3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c5619b.i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iD3 += (int) C5620c.d(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iD3), 1);
                for (int iD4 = (int) C5620c.d(byteArrayInputStream, 2); iD4 > 0; iD4--) {
                    C5620c.d(byteArrayInputStream, 2);
                    int iD5 = (int) C5620c.d(byteArrayInputStream, 1);
                    if (iD5 != 6 && iD5 != 7) {
                        while (iD5 > 0) {
                            C5620c.d(byteArrayInputStream, 1);
                            for (int iD6 = (int) C5620c.d(byteArrayInputStream, 1); iD6 > 0; iD6--) {
                                C5620c.d(byteArrayInputStream, 2);
                            }
                            iD5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c5619b.f46522h = c(byteArrayInputStream, c5619b.f46519e);
            int i12 = c5619b.f46521g;
            BitSet bitSetValueOf = BitSet.valueOf(C5620c.b(byteArrayInputStream, (((i12 * 2) + 7) & (-8)) / 8));
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : 0;
                if (bitSetValueOf.get(i13 + i12)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
        }
        return c5619bArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C5619b[] c5619bArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = g.f46526a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = g.f46527b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(c5619bArr, bArr3);
                C5620c.e(byteArrayOutputStream, c5619bArr.length, 1);
                C5620c.e(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrA2 = C5620c.a(bArrA);
                C5620c.e(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr4 = g.f46529d;
            if (Arrays.equals(bArr, bArr4)) {
                C5620c.e(byteArrayOutputStream, c5619bArr.length, 1);
                for (C5619b c5619b : c5619bArr) {
                    int size = c5619b.i.size() * 4;
                    String strB = b(c5619b.f46515a, bArr4, c5619b.f46516b);
                    Charset charset = StandardCharsets.UTF_8;
                    C5620c.f(byteArrayOutputStream, strB.getBytes(charset).length);
                    C5620c.f(byteArrayOutputStream, c5619b.f46522h.length);
                    C5620c.e(byteArrayOutputStream, size, 4);
                    C5620c.e(byteArrayOutputStream, c5619b.f46517c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator<Integer> it = c5619b.i.keySet().iterator();
                    while (it.hasNext()) {
                        C5620c.f(byteArrayOutputStream, it.next().intValue());
                        C5620c.f(byteArrayOutputStream, 0);
                    }
                    for (int i10 : c5619b.f46522h) {
                        C5620c.f(byteArrayOutputStream, i10);
                    }
                }
                return true;
            }
            byte[] bArr5 = g.f46528c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA3 = a(c5619bArr, bArr5);
                C5620c.e(byteArrayOutputStream, c5619bArr.length, 1);
                C5620c.e(byteArrayOutputStream, bArrA3.length, 4);
                byte[] bArrA4 = C5620c.a(bArrA3);
                C5620c.e(byteArrayOutputStream, bArrA4.length, 4);
                byteArrayOutputStream.write(bArrA4);
                return true;
            }
            byte[] bArr6 = g.f46530e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            C5620c.f(byteArrayOutputStream, c5619bArr.length);
            for (C5619b c5619b2 : c5619bArr) {
                String strB2 = b(c5619b2.f46515a, bArr6, c5619b2.f46516b);
                Charset charset2 = StandardCharsets.UTF_8;
                C5620c.f(byteArrayOutputStream, strB2.getBytes(charset2).length);
                TreeMap<Integer, Integer> treeMap = c5619b2.i;
                C5620c.f(byteArrayOutputStream, treeMap.size());
                C5620c.f(byteArrayOutputStream, c5619b2.f46522h.length);
                C5620c.e(byteArrayOutputStream, c5619b2.f46517c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    C5620c.f(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i11 : c5619b2.f46522h) {
                    C5620c.f(byteArrayOutputStream, i11);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            C5620c.f(byteArrayOutputStream2, c5619bArr.length);
            int i12 = 2;
            int i13 = 2;
            for (C5619b c5619b3 : c5619bArr) {
                C5620c.e(byteArrayOutputStream2, c5619b3.f46517c, 4);
                C5620c.e(byteArrayOutputStream2, c5619b3.f46518d, 4);
                C5620c.e(byteArrayOutputStream2, c5619b3.f46521g, 4);
                String strB3 = b(c5619b3.f46515a, bArr2, c5619b3.f46516b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                C5620c.f(byteArrayOutputStream2, length2);
                i13 = i13 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i13 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray.length);
            }
            h hVar = new h(EnumC5621d.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(hVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            for (int i15 = 0; i15 < c5619bArr.length; i15++) {
                try {
                    C5619b c5619b4 = c5619bArr[i15];
                    C5620c.f(byteArrayOutputStream3, i15);
                    C5620c.f(byteArrayOutputStream3, c5619b4.f46519e);
                    i14 = i14 + 4 + (c5619b4.f46519e * i12);
                    int[] iArr = c5619b4.f46522h;
                    int length3 = iArr.length;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length3) {
                        int i18 = iArr[i16];
                        C5620c.f(byteArrayOutputStream3, i18 - i17);
                        i16++;
                        i12 = i12;
                        i17 = i18;
                    }
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i14 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray2.length);
            }
            h hVar2 = new h(EnumC5621d.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(hVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i19 = 0;
            int i20 = 0;
            while (i19 < c5619bArr.length) {
                try {
                    C5619b c5619b5 = c5619bArr[i19];
                    Iterator<Map.Entry<Integer, Integer>> it3 = c5619b5.i.entrySet().iterator();
                    int iIntValue = i;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        k(byteArrayOutputStream4, c5619b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            l(byteArrayOutputStream4, c5619b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            C5620c.f(byteArrayOutputStream3, i19);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i21 = i20 + 6;
                            ArrayList arrayList4 = arrayList3;
                            C5620c.e(byteArrayOutputStream3, length4, 4);
                            C5620c.f(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i20 = i21 + length4;
                            i19++;
                            arrayList3 = arrayList4;
                            i = 0;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i20 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i20 + ", does not match actual size " + byteArray5.length);
            }
            h hVar3 = new h(EnumC5621d.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(hVar3);
            long j4 = 4;
            long size2 = j4 + j4 + 4 + (arrayList2.size() * 16);
            C5620c.e(byteArrayOutputStream, arrayList2.size(), 4);
            int i22 = 0;
            while (i22 < arrayList2.size()) {
                h hVar4 = (h) arrayList2.get(i22);
                C5620c.e(byteArrayOutputStream, hVar4.f46533a.getValue(), 4);
                C5620c.e(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = hVar4.f46534b;
                if (hVar4.f46535c) {
                    long length5 = bArr7.length;
                    byte[] bArrA5 = C5620c.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA5);
                    C5620c.e(byteArrayOutputStream, bArrA5.length, 4);
                    C5620c.e(byteArrayOutputStream, length5, 4);
                    length = bArrA5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    C5620c.e(byteArrayOutputStream, bArr7.length, 4);
                    C5620c.e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i22++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i23));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, C5619b c5619b, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        C5620c.f(byteArrayOutputStream, str.getBytes(charset).length);
        C5620c.f(byteArrayOutputStream, c5619b.f46519e);
        C5620c.e(byteArrayOutputStream, c5619b.f46520f, 4);
        C5620c.e(byteArrayOutputStream, c5619b.f46517c, 4);
        C5620c.e(byteArrayOutputStream, c5619b.f46521g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, C5619b c5619b) throws IOException {
        byte[] bArr = new byte[(((c5619b.f46521g * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : c5619b.i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i10 = iIntValue + c5619b.f46521g;
                int i11 = i10 / 8;
                bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, C5619b c5619b) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : c5619b.i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C5620c.f(byteArrayOutputStream, iIntValue - i);
                C5620c.f(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
