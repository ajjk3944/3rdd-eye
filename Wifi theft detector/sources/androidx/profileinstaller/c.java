package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p1.j;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3617a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3618b = {112, 114, 109, 0};

    public static void A(InputStream inputStream) {
        p1.d.h(inputStream);
        int iJ = p1.d.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            p1.d.j(inputStream);
            for (int iJ2 = p1.d.j(inputStream); iJ2 > 0; iJ2--) {
                p1.d.h(inputStream);
            }
            iJ--;
        }
    }

    public static boolean B(OutputStream outputStream, byte[] bArr, p1.c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, j.f23875a)) {
            N(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, j.f23876b)) {
            M(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, j.f23878d)) {
            K(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, j.f23877c)) {
            L(outputStream, cVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, j.f23879e)) {
            return false;
        }
        J(outputStream, cVarArr);
        return true;
    }

    public static void C(OutputStream outputStream, p1.c cVar) throws IOException {
        int[] iArr = cVar.f23865h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            p1.d.p(outputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
    }

    public static d D(p1.c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            p1.d.p(byteArrayOutputStream, cVarArr.length);
            int i10 = 2;
            for (p1.c cVar : cVarArr) {
                p1.d.q(byteArrayOutputStream, cVar.f23860c);
                p1.d.q(byteArrayOutputStream, cVar.f23861d);
                p1.d.q(byteArrayOutputStream, cVar.f23864g);
                String strJ = j(cVar.f23858a, cVar.f23859b, j.f23875a);
                int iK = p1.d.k(strJ);
                p1.d.p(byteArrayOutputStream, iK);
                i10 = i10 + 14 + iK;
                p1.d.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                d dVar = new d(FileSectionType.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return dVar;
            }
            throw p1.d.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f3617a);
        outputStream.write(bArr);
    }

    public static void F(OutputStream outputStream, p1.c cVar) throws IOException {
        I(outputStream, cVar);
        C(outputStream, cVar);
        H(outputStream, cVar);
    }

    public static void G(OutputStream outputStream, p1.c cVar, String str) throws IOException {
        p1.d.p(outputStream, p1.d.k(str));
        p1.d.p(outputStream, cVar.f23862e);
        p1.d.q(outputStream, cVar.f23863f);
        p1.d.q(outputStream, cVar.f23860c);
        p1.d.q(outputStream, cVar.f23864g);
        p1.d.n(outputStream, str);
    }

    public static void H(OutputStream outputStream, p1.c cVar) throws IOException {
        byte[] bArr = new byte[k(cVar.f23864g)];
        for (Map.Entry entry : cVar.f23866i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                z(bArr, 2, iIntValue, cVar);
            }
            if ((iIntValue2 & 4) != 0) {
                z(bArr, 4, iIntValue, cVar);
            }
        }
        outputStream.write(bArr);
    }

    public static void I(OutputStream outputStream, p1.c cVar) throws IOException {
        int i10 = 0;
        for (Map.Entry entry : cVar.f23866i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                p1.d.p(outputStream, iIntValue - i10);
                p1.d.p(outputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    public static void J(OutputStream outputStream, p1.c[] cVarArr) throws IOException {
        p1.d.p(outputStream, cVarArr.length);
        for (p1.c cVar : cVarArr) {
            String strJ = j(cVar.f23858a, cVar.f23859b, j.f23879e);
            p1.d.p(outputStream, p1.d.k(strJ));
            p1.d.p(outputStream, cVar.f23866i.size());
            p1.d.p(outputStream, cVar.f23865h.length);
            p1.d.q(outputStream, cVar.f23860c);
            p1.d.n(outputStream, strJ);
            Iterator it = cVar.f23866i.keySet().iterator();
            while (it.hasNext()) {
                p1.d.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i10 : cVar.f23865h) {
                p1.d.p(outputStream, i10);
            }
        }
    }

    public static void K(OutputStream outputStream, p1.c[] cVarArr) throws IOException {
        p1.d.r(outputStream, cVarArr.length);
        for (p1.c cVar : cVarArr) {
            int size = cVar.f23866i.size() * 4;
            String strJ = j(cVar.f23858a, cVar.f23859b, j.f23878d);
            p1.d.p(outputStream, p1.d.k(strJ));
            p1.d.p(outputStream, cVar.f23865h.length);
            p1.d.q(outputStream, size);
            p1.d.q(outputStream, cVar.f23860c);
            p1.d.n(outputStream, strJ);
            Iterator it = cVar.f23866i.keySet().iterator();
            while (it.hasNext()) {
                p1.d.p(outputStream, ((Integer) it.next()).intValue());
                p1.d.p(outputStream, 0);
            }
            for (int i10 : cVar.f23865h) {
                p1.d.p(outputStream, i10);
            }
        }
    }

    public static void L(OutputStream outputStream, p1.c[] cVarArr) throws IOException {
        byte[] bArrB = b(cVarArr, j.f23877c);
        p1.d.r(outputStream, cVarArr.length);
        p1.d.m(outputStream, bArrB);
    }

    public static void M(OutputStream outputStream, p1.c[] cVarArr) throws IOException {
        byte[] bArrB = b(cVarArr, j.f23876b);
        p1.d.r(outputStream, cVarArr.length);
        p1.d.m(outputStream, bArrB);
    }

    public static void N(OutputStream outputStream, p1.c[] cVarArr) throws IOException {
        O(outputStream, cVarArr);
    }

    public static void O(OutputStream outputStream, p1.c[] cVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(cVarArr));
        arrayList.add(c(cVarArr));
        arrayList.add(d(cVarArr));
        long length2 = j.f23875a.length + f3617a.length + 4 + (arrayList.size() * 16);
        p1.d.q(outputStream, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d dVar = (d) arrayList.get(i10);
            p1.d.q(outputStream, dVar.f3619a.g());
            p1.d.q(outputStream, length2);
            if (dVar.f3622d) {
                byte[] bArr = dVar.f3621c;
                long length3 = bArr.length;
                byte[] bArrB = p1.d.b(bArr);
                arrayList2.add(bArrB);
                p1.d.q(outputStream, bArrB.length);
                p1.d.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(dVar.f3621c);
                p1.d.q(outputStream, dVar.f3621c.length);
                p1.d.q(outputStream, 0L);
                length = dVar.f3621c.length;
            }
            length2 += length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    public static int a(p1.c cVar) {
        Iterator it = cVar.f23866i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    public static byte[] b(p1.c[] cVarArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int iK = 0;
        for (p1.c cVar : cVarArr) {
            iK += p1.d.k(j(cVar.f23858a, cVar.f23859b, bArr)) + 16 + (cVar.f23862e * 2) + cVar.f23863f + k(cVar.f23864g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, j.f23877c)) {
            int length = cVarArr.length;
            while (i10 < length) {
                p1.c cVar2 = cVarArr[i10];
                G(byteArrayOutputStream, cVar2, j(cVar2.f23858a, cVar2.f23859b, bArr));
                F(byteArrayOutputStream, cVar2);
                i10++;
            }
        } else {
            for (p1.c cVar3 : cVarArr) {
                G(byteArrayOutputStream, cVar3, j(cVar3.f23858a, cVar3.f23859b, bArr));
            }
            int length2 = cVarArr.length;
            while (i10 < length2) {
                F(byteArrayOutputStream, cVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw p1.d.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    public static d c(p1.c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            try {
                p1.c cVar = cVarArr[i11];
                p1.d.p(byteArrayOutputStream, i11);
                p1.d.p(byteArrayOutputStream, cVar.f23862e);
                i10 = i10 + 4 + (cVar.f23862e * 2);
                C(byteArrayOutputStream, cVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            d dVar = new d(FileSectionType.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return dVar;
        }
        throw p1.d.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    public static d d(p1.c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            try {
                p1.c cVar = cVarArr[i11];
                int iA = a(cVar);
                byte[] bArrE = e(cVar);
                byte[] bArrF = f(cVar);
                p1.d.p(byteArrayOutputStream, i11);
                int length = bArrE.length + 2 + bArrF.length;
                p1.d.q(byteArrayOutputStream, length);
                p1.d.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i10 = i10 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            d dVar = new d(FileSectionType.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return dVar;
        }
        throw p1.d.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(p1.c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] f(p1.c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    public static String h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    public static p1.c i(p1.c[] cVarArr, String str) {
        if (cVarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            if (cVarArr[i10].f23859b.equals(strH)) {
                return cVarArr[i10];
            }
        }
        return null;
    }

    public static String j(String str, String str2, byte[] bArr) {
        String strA = j.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + j.a(bArr) + str2;
    }

    public static int k(int i10) {
        return y(i10 * 2) / 8;
    }

    public static int l(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw p1.d.c("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw p1.d.c("Unexpected flag: " + i10);
    }

    public static int[] m(InputStream inputStream, int i10) {
        int[] iArr = new int[i10];
        int iH = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iH += p1.d.h(inputStream);
            iArr[i11] = iH;
        }
        return iArr;
    }

    public static int n(BitSet bitSet, int i10, int i11) {
        int i12 = bitSet.get(l(2, i10, i11)) ? 2 : 0;
        return bitSet.get(l(4, i10, i11)) ? i12 | 4 : i12;
    }

    public static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, p1.d.d(inputStream, bArr.length))) {
            return p1.d.d(inputStream, j.f23876b.length);
        }
        throw p1.d.c("Invalid magic");
    }

    public static void p(InputStream inputStream, p1.c cVar) {
        int iAvailable = inputStream.available() - cVar.f23863f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += p1.d.h(inputStream);
            cVar.f23866i.put(Integer.valueOf(iH), 1);
            for (int iH2 = p1.d.h(inputStream); iH2 > 0; iH2--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw p1.d.c("Read too much data during profile line parse");
        }
    }

    public static p1.c[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, p1.c[] cVarArr) {
        if (Arrays.equals(bArr, j.f23880f)) {
            if (Arrays.equals(j.f23875a, bArr2)) {
                throw p1.d.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, cVarArr);
        }
        if (Arrays.equals(bArr, j.f23881g)) {
            return t(inputStream, bArr2, cVarArr);
        }
        throw p1.d.c("Unsupported meta version");
    }

    public static p1.c[] r(InputStream inputStream, byte[] bArr, p1.c[] cVarArr) throws IOException {
        if (!Arrays.equals(bArr, j.f23880f)) {
            throw p1.d.c("Unsupported meta version");
        }
        int iJ = p1.d.j(inputStream);
        byte[] bArrE = p1.d.e(inputStream, (int) p1.d.i(inputStream), (int) p1.d.i(inputStream));
        if (inputStream.read() > 0) {
            throw p1.d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            p1.c[] cVarArrS = s(byteArrayInputStream, iJ, cVarArr);
            byteArrayInputStream.close();
            return cVarArrS;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static p1.c[] s(InputStream inputStream, int i10, p1.c[] cVarArr) {
        if (inputStream.available() == 0) {
            return new p1.c[0];
        }
        if (i10 != cVarArr.length) {
            throw p1.d.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iH = p1.d.h(inputStream);
            iArr[i11] = p1.d.h(inputStream);
            strArr[i11] = p1.d.f(inputStream, iH);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            p1.c cVar = cVarArr[i12];
            if (!cVar.f23859b.equals(strArr[i12])) {
                throw p1.d.c("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            cVar.f23862e = i13;
            cVar.f23865h = m(inputStream, i13);
        }
        return cVarArr;
    }

    public static p1.c[] t(InputStream inputStream, byte[] bArr, p1.c[] cVarArr) throws IOException {
        int iH = p1.d.h(inputStream);
        byte[] bArrE = p1.d.e(inputStream, (int) p1.d.i(inputStream), (int) p1.d.i(inputStream));
        if (inputStream.read() > 0) {
            throw p1.d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            p1.c[] cVarArrU = u(byteArrayInputStream, bArr, iH, cVarArr);
            byteArrayInputStream.close();
            return cVarArrU;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static p1.c[] u(InputStream inputStream, byte[] bArr, int i10, p1.c[] cVarArr) {
        if (inputStream.available() == 0) {
            return new p1.c[0];
        }
        if (i10 != cVarArr.length) {
            throw p1.d.c("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            p1.d.h(inputStream);
            String strF = p1.d.f(inputStream, p1.d.h(inputStream));
            long jI = p1.d.i(inputStream);
            int iH = p1.d.h(inputStream);
            p1.c cVarI = i(cVarArr, strF);
            if (cVarI == null) {
                throw p1.d.c("Missing profile key: " + strF);
            }
            cVarI.f23861d = jI;
            int[] iArrM = m(inputStream, iH);
            if (Arrays.equals(bArr, j.f23879e)) {
                cVarI.f23862e = iH;
                cVarI.f23865h = iArrM;
            }
        }
        return cVarArr;
    }

    public static void v(InputStream inputStream, p1.c cVar) {
        BitSet bitSetValueOf = BitSet.valueOf(p1.d.d(inputStream, p1.d.a(cVar.f23864g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = cVar.f23864g;
            if (i10 >= i11) {
                return;
            }
            int iN = n(bitSetValueOf, i10, i11);
            if (iN != 0) {
                Integer num = (Integer) cVar.f23866i.get(Integer.valueOf(i10));
                if (num == null) {
                    num = 0;
                }
                cVar.f23866i.put(Integer.valueOf(i10), Integer.valueOf(iN | num.intValue()));
            }
            i10++;
        }
    }

    public static p1.c[] w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, j.f23876b)) {
            throw p1.d.c("Unsupported version");
        }
        int iJ = p1.d.j(inputStream);
        byte[] bArrE = p1.d.e(inputStream, (int) p1.d.i(inputStream), (int) p1.d.i(inputStream));
        if (inputStream.read() > 0) {
            throw p1.d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            p1.c[] cVarArrX = x(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return cVarArrX;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static p1.c[] x(InputStream inputStream, String str, int i10) {
        if (inputStream.available() == 0) {
            return new p1.c[0];
        }
        p1.c[] cVarArr = new p1.c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iH = p1.d.h(inputStream);
            int iH2 = p1.d.h(inputStream);
            cVarArr[i11] = new p1.c(str, p1.d.f(inputStream, iH), p1.d.i(inputStream), 0L, iH2, (int) p1.d.i(inputStream), (int) p1.d.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            p1.c cVar = cVarArr[i12];
            p(inputStream, cVar);
            cVar.f23865h = m(inputStream, cVar.f23862e);
            v(inputStream, cVar);
        }
        return cVarArr;
    }

    public static int y(int i10) {
        return (i10 + 7) & (-8);
    }

    public static void z(byte[] bArr, int i10, int i11, p1.c cVar) {
        int iL = l(i10, i11, cVar.f23864g);
        int i12 = iL / 8;
        bArr[i12] = (byte) ((1 << (iL % 8)) | bArr[i12]);
    }
}
