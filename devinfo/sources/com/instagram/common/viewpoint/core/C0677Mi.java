package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
/* renamed from: com.facebook.ads.redexgen.X.Mi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0677Mi {
    public static byte[] A06;
    public static String[] A07 = {"1eaMPdLcC8DbZCkn0iIyVPFCZSdDAanS", "Exaxr4PlErBkBzdiwoicKn", "2BC", "jQaYCx7PV0mXn8Zj7H8rC7xxlui6spsC", "wp2nCKHDQcjkZqDMhhhKbFGW7G", "lMJ", "SjVm96go47njO9ADG8uLls", "QdN"};
    public InterfaceC0676Mh A00;
    public InterfaceC0676Mh A01;
    public final SparseArray<String> A02;
    public final SparseBooleanArray A03;
    public final SparseBooleanArray A04;
    public final HashMap<String, C0675Mg> A05;

    public static String A04(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A06 = new byte[]{20, 16, 6, 122, 22, 23, 22, 122, 5, 30, 22, 6, 96, 5, 20, 17, 17, 28, 27, 18, 32, 33, 66, 101, 125, 106, 103, 98, 111, 43, 125, 106, 103, 126, 110, 43, 120, 98, 113, 110, 49, 43, 127, 125, 127, 116, 121, 120, 67, 127, 115, 114, 104, 121, 114, 104, 67, 117, 114, 120, 121, 100, 50, 121, 100, 117};
    }

    static {
        A07();
    }

    public C0677Mi(C5O c5o, File file, byte[] bArr, boolean z3, boolean z10) {
        AbstractC02203y.A08((c5o == null && file == null) ? false : true);
        this.A05 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A04 = new SparseBooleanArray();
        this.A03 = new SparseBooleanArray();
        C1649kQ c1649kQ = c5o != null ? new C1649kQ(c5o) : null;
        InterfaceC0676Mh databaseStorage = file != null ? new C1648kP(new File(file, A04(42, 24, 47)), bArr, z3) : null;
        if (c1649kQ == null || (databaseStorage != null && z10)) {
            InterfaceC0676Mh legacyStorage = (InterfaceC0676Mh) C5C.A0f(databaseStorage);
            this.A01 = legacyStorage;
            this.A00 = c1649kQ;
        } else {
            this.A01 = c1649kQ;
            this.A00 = databaseStorage;
        }
    }

    public static int A00(SparseArray<String> idToKey) {
        int id2;
        int size = idToKey.size();
        if (size == 0) {
            id2 = 0;
        } else {
            int size2 = size - 1;
            id2 = idToKey.keyAt(size2) + 1;
        }
        if (id2 < 0) {
            id2 = 0;
            while (id2 < size) {
                int size3 = idToKey.keyAt(id2);
                if (id2 != size3) {
                    break;
                }
                id2++;
            }
        }
        return id2;
    }

    private C0675Mg A01(String str) {
        int iA00 = A00(this.A02);
        C0675Mg c0675Mg = new C0675Mg(iA00, str);
        this.A05.put(str, c0675Mg);
        this.A02.put(iA00, str);
        this.A03.put(iA00, true);
        this.A01.AGK(c0675Mg);
        return c0675Mg;
    }

    public static C1646kN A02(DataInputStream dataInputStream) throws IOException {
        int i4 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int nextBytesToRead = 0; nextBytesToRead < i4; nextBytesToRead++) {
            String utf = dataInputStream.readUTF();
            int bytesRead = dataInputStream.readInt();
            if (bytesRead >= 0) {
                int valueSize = 0;
                int i10 = Math.min(bytesRead, 10485760);
                byte[] bArrCopyOf = C5C.A07;
                while (valueSize != bytesRead) {
                    int size = valueSize + i10;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    dataInputStream.readFully(bArrCopyOf, valueSize, i10);
                    valueSize += i10;
                    int size2 = bytesRead - valueSize;
                    i10 = Math.min(size2, 10485760);
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException(A04(22, 20, 56) + bytesRead);
            }
        }
        return new C1646kN(map);
    }

    public static Cipher A05() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i4 = C5C.A02;
        String strA04 = A04(0, 20, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH);
        if (i4 == 18) {
            try {
                return Cipher.getInstance(strA04, A04(20, 2, 81));
            } catch (Throwable unused) {
            }
        }
        Cipher cipher = Cipher.getInstance(strA04);
        String[] strArr = A07;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "EBBbD5OLh9DYDBrMigQNtJ";
        strArr2[1] = "xQSZ94mu2vygjBv0Ab9r12";
        return cipher;
    }

    public static void A08(C1646kN c1646kN, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setA06 = c1646kN.A06();
        dataOutputStream.writeInt(setA06.size());
        for (Map.Entry<String, byte[]> entry : setA06) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public static boolean A0A(String str) {
        return str.startsWith(A04(42, 24, 47));
    }

    public final int A0B(String str) {
        return A0D(str).A01;
    }

    public final C0675Mg A0C(String str) {
        return this.A05.get(str);
    }

    public final C0675Mg A0D(String str) {
        C0675Mg cachedContent = this.A05.get(str);
        return cachedContent == null ? A01(str) : cachedContent;
    }

    public final C1646kN A0E(String str) {
        C0675Mg cachedContent = A0C(str);
        return cachedContent != null ? cachedContent.A03() : C1646kN.A03;
    }

    public final String A0F(int i4) {
        return this.A02.get(i4);
    }

    public final Collection<C0675Mg> A0G() {
        return Collections.unmodifiableCollection(this.A05.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0H() {
        C4C c4cA0N = BO.A07(this.A05.keySet()).A0N();
        while (true) {
            boolean zHasNext = c4cA0N.hasNext();
            String[] strArr = A07;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "jpVmrDDiLa6KSoRZ9DaLqT";
            strArr2[1] = "R0FMfILNqJLoUgBryCIaQS";
            if (zHasNext) {
                A0K((String) c4cA0N.next());
            } else {
                return;
            }
        }
    }

    public final void A0I() throws IOException {
        this.A01.AKJ(this.A05);
        int size = this.A04.size();
        for (int i4 = 0; i4 < size; i4++) {
            SparseArray<String> sparseArray = this.A02;
            int removedIdCount = this.A04.keyAt(i4);
            sparseArray.remove(removedIdCount);
        }
        this.A04.clear();
        this.A03.clear();
    }

    public final void A0J(long j) throws IOException {
        this.A01.AAF(j);
        if (this.A00 != null) {
            this.A00.AAF(j);
        }
        if (!this.A01.A6S() && this.A00 != null && this.A00.A6S()) {
            this.A00.AAs(this.A05, this.A02);
            this.A01.AKI(this.A05);
        } else {
            this.A01.AAs(this.A05, this.A02);
        }
        if (this.A00 != null) {
            InterfaceC0676Mh interfaceC0676Mh = this.A00;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "sHyLaDKMqWdH53QwNCQNuy";
            strArr2[1] = "kZIq1iKkwSA0yGMJ22HAvZ";
            interfaceC0676Mh.A5p();
            this.A00 = null;
        }
    }

    public final void A0K(String str) {
        C0675Mg c0675Mg = this.A05.get(str);
        if (c0675Mg != null && c0675Mg.A09() && c0675Mg.A0A()) {
            this.A05.remove(str);
            int i4 = c0675Mg.A01;
            boolean z3 = this.A03.get(i4);
            this.A01.AFd(c0675Mg, z3);
            if (z3) {
                this.A02.remove(i4);
                this.A03.delete(i4);
            } else {
                this.A02.put(i4, null);
                this.A04.put(i4, true);
            }
        }
    }

    public final void A0L(String str, C0680Ml c0680Ml) {
        C0675Mg c0675MgA0D = A0D(str);
        if (c0675MgA0D.A0E(c0680Ml)) {
            this.A01.AGK(c0675MgA0D);
        }
    }
}
