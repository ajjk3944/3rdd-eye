package r5;

import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ja.c f32817a = new ja.c();

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f32818b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f32819c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f32820d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f32821e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f32822f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f32823h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f32824i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) throws IOException {
        int i4 = 0;
        int length = 0;
        for (b bVar : bVarArr) {
            length += ((((bVar.g * 2) + 7) & (-8)) / 8) + (bVar.f32813e * 2) + d(bArr, bVar.f32809a, bVar.f32810b).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f32814f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f32822f)) {
            int length2 = bVarArr.length;
            while (i4 < length2) {
                b bVar2 = bVarArr[i4];
                q(byteArrayOutputStream, bVar2, d(bArr, bVar2.f32809a, bVar2.f32810b));
                p(byteArrayOutputStream, bVar2);
                i4++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                q(byteArrayOutputStream, bVar3, d(bArr, bVar3.f32809a, bVar3.f32810b));
            }
            int length3 = bVarArr.length;
            while (i4 < length3) {
                p(byteArrayOutputStream, bVarArr[i4]);
                i4++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z3 = true;
        for (File file2 : fileArrListFiles) {
            z3 = c(file2) && z3;
        }
        return z3;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f32823h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return d.h.w(d.h.z(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i4) throws IOException {
        byte[] bArr = new byte[i4];
        int i10 = 0;
        while (i10 < i4) {
            int i11 = inputStream.read(bArr, i10, i4 - i10);
            if (i11 < 0) {
                throw new IllegalStateException(u.r(i4, "Not enough bytes to read: "));
            }
            i10 += i11;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i4) {
        int[] iArr = new int[i4];
        int iM = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i10] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i4, int i10) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[2048];
            int i11 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i11 < i4) {
                int i12 = fileInputStream.read(bArr2);
                if (i12 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i4 + " bytes");
                }
                inflater.setInput(bArr2, 0, i12);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i10 - iInflate);
                    i11 += i12;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i11 == i4) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i4 + " actual=" + i11);
        } finally {
            inflater.end();
        }
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) throws IOException {
        byte[] bArr3 = f32824i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                b[] bVarArrK = k(byteArrayInputStream, bArr2, iM, bVarArr);
                byteArrayInputStream.close();
                return bVarArrK;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(f32820d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            b[] bVarArrJ = j(byteArrayInputStream2, iM2, bVarArr);
            byteArrayInputStream2.close();
            return bVarArrJ;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i4, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i4 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i4];
        int[] iArr = new int[i4];
        for (int i10 = 0; i10 < i4; i10++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i10] = (int) m(byteArrayInputStream, 2);
            strArr[i10] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i11 = 0; i11 < i4; i11++) {
            b bVar = bVarArr[i11];
            if (!bVar.f32810b.equals(strArr[i11])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i12 = iArr[i11];
            bVar.f32813e = i12;
            bVar.f32815h = g(byteArrayInputStream, i12);
        }
        return bVarArr;
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i4, b[] bVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i4 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i10 = 0; i10 < i4; i10++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            b bVar = null;
            if (bVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i11].f32810b.equals(strSubstring)) {
                        bVar = bVarArr[i11];
                        break;
                    }
                    i11++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f32812d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f32823h)) {
                bVar.f32813e = iM;
                bVar.f32815h = iArrG;
            }
        }
        return bVarArr;
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f32821e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            b[] bVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return bVarArrN;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long m(InputStream inputStream, int i4) throws IOException {
        byte[] bArrF = f(inputStream, i4);
        long j8 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            j8 += (bArrF[i10] & 255) << (i10 * 8);
        }
        return j8;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i4) throws IOException {
        int i10 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i4];
        for (int i11 = 0; i11 < i4; i11++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            bVarArr[i11] = new b(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        int i12 = 0;
        while (i12 < i4) {
            b bVar = bVarArr[i12];
            int iAvailable = byteArrayInputStream.available();
            int i13 = bVar.f32814f;
            int i14 = bVar.g;
            TreeMap treeMap = bVar.f32816i;
            int i15 = iAvailable - i13;
            int iM3 = i10;
            while (byteArrayInputStream.available() > i15) {
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                int iM4 = (int) m(byteArrayInputStream, 2);
                while (iM4 > 0) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            int i16 = i10;
                            int i17 = i12;
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                            i10 = i16;
                            i12 = i17;
                        }
                    }
                    iM4--;
                    i10 = i10;
                    i12 = i12;
                }
            }
            int i18 = i10;
            int i19 = i12;
            if (byteArrayInputStream.available() != i15) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f32815h = g(byteArrayInputStream, bVar.f32813e);
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i14 * 2) + 7) & (-8)) / 8));
            for (int i20 = i18; i20 < i14; i20++) {
                int i21 = bitSetValueOf.get(i20) ? 2 : i18;
                if (bitSetValueOf.get(i20 + i14)) {
                    i21 |= 4;
                }
                if (i21 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i20));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i18);
                    }
                    treeMap.put(Integer.valueOf(i20), Integer.valueOf(i21 | numValueOf.intValue()));
                }
            }
            i12 = i19 + 1;
            i10 = i18;
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) throws IOException {
        long j8;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f32820d;
        int i4 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f32821e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(bVarArr, bArr3);
                u(byteArrayOutputStream, bVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.f32816i.size() * 4;
                    String strD = d(bArr4, bVar.f32809a, bVar.f32810b);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, bVar.f32815h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, bVar.f32811c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = bVar.f32816i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i10 : bVar.f32815h) {
                        v(byteArrayOutputStream, i10);
                    }
                }
                return true;
            }
            byte[] bArr5 = f32822f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(bVarArr, bArr5);
                u(byteArrayOutputStream, bVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f32823h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String str = bVar2.f32809a;
                TreeMap treeMap = bVar2.f32816i;
                String strD2 = d(bArr6, str, bVar2.f32810b);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, bVar2.f32815h.length);
                u(byteArrayOutputStream, bVar2.f32811c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i11 : bVar2.f32815h) {
                    v(byteArrayOutputStream, i11);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, bVarArr.length);
            int i12 = 2;
            int i13 = 2;
            for (b bVar3 : bVarArr) {
                u(byteArrayOutputStream2, bVar3.f32811c, 4);
                u(byteArrayOutputStream2, bVar3.f32812d, 4);
                u(byteArrayOutputStream2, bVar3.g, 4);
                String strD3 = d(bArr2, bVar3.f32809a, bVar3.f32810b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i13 = i13 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i13 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray.length);
            }
            k kVar = new k(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(kVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < bVarArr.length) {
                try {
                    b bVar4 = bVarArr[i14];
                    v(byteArrayOutputStream3, i14);
                    v(byteArrayOutputStream3, bVar4.f32813e);
                    i15 = i15 + 4 + (bVar4.f32813e * i12);
                    int[] iArr = bVar4.f32815h;
                    int length3 = iArr.length;
                    int i16 = i4;
                    int i17 = i12;
                    int i18 = i16;
                    while (i18 < length3) {
                        int i19 = iArr[i18];
                        v(byteArrayOutputStream3, i19 - i16);
                        i18++;
                        i16 = i19;
                    }
                    i14++;
                    i12 = i17;
                    i4 = 0;
                } catch (Throwable th2) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
            }
            k kVar2 = new k(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i20 = 0;
            int i21 = 0;
            while (i20 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i20];
                    Iterator it3 = bVar5.f32816i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, iIntValue, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i20);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i22 = i21 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i21 = i22 + length4;
                            i20++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i21 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i21 + ", does not match actual size " + byteArray5.length);
            }
            k kVar3 = new k(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar3);
            long j9 = 4;
            long size2 = j9 + j9 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i23 = 0;
            while (i23 < arrayList2.size()) {
                k kVar4 = (k) arrayList2.get(i23);
                int i24 = kVar4.f32834a;
                byte[] bArr7 = kVar4.f32835b;
                if (i24 == 1) {
                    j8 = 0;
                } else if (i24 == 2) {
                    j8 = 1;
                } else if (i24 == 3) {
                    j8 = 2;
                } else if (i24 == 4) {
                    j8 = 3;
                } else {
                    if (i24 != 5) {
                        throw null;
                    }
                    j8 = 4;
                }
                u(byteArrayOutputStream, j8, 4);
                u(byteArrayOutputStream, size2, 4);
                if (kVar4.f32836c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i23++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i25 = 0; i25 < arrayList6.size(); i25++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i25));
            }
            return true;
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream2.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar) throws IOException {
        s(byteArrayOutputStream, bVar);
        int i4 = bVar.g;
        int[] iArr = bVar.f32815h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            v(byteArrayOutputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
        byte[] bArr = new byte[(((i4 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f32816i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i13 = iIntValue / 8;
                bArr[i13] = (byte) (bArr[i13] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i14 = iIntValue + i4;
                int i15 = i14 / 8;
                bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, bVar.f32813e);
        u(byteArrayOutputStream, bVar.f32814f, 4);
        u(byteArrayOutputStream, bVar.f32811c, 4);
        u(byteArrayOutputStream, bVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i4, b bVar) throws IOException {
        int i10 = bVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i4 & (-2)) * i10) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f32816i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i4) != 0) {
                    if ((i12 & iIntValue2) == i12) {
                        int i13 = (i11 * i10) + iIntValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, b bVar) throws IOException {
        int i4 = 0;
        for (Map.Entry entry : bVar.f32816i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i4);
                v(byteArrayOutputStream, 0);
                i4 = iIntValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void t(android.content.Context r18, java.util.concurrent.Executor r19, r5.d r20, boolean r21) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.e.t(android.content.Context, java.util.concurrent.Executor, r5.d, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j8, int i4) throws IOException {
        byte[] bArr = new byte[i4];
        for (int i10 = 0; i10 < i4; i10++) {
            bArr[i10] = (byte) ((j8 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i4) throws IOException {
        u(byteArrayOutputStream, i4, 2);
    }
}
