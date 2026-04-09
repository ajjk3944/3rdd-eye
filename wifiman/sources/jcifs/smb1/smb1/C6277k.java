package jcifs.smb1.smb1;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.DigestException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.util.Arrays;
import java.util.Random;

/* renamed from: jcifs.smb1.smb1.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6277k implements Principal, Serializable {

    /* renamed from: m, reason: collision with root package name */
    static String f50574m;

    /* renamed from: n, reason: collision with root package name */
    static String f50575n;

    /* renamed from: o, reason: collision with root package name */
    static String f50576o;

    /* renamed from: a, reason: collision with root package name */
    String f50581a;

    /* renamed from: b, reason: collision with root package name */
    String f50582b;

    /* renamed from: c, reason: collision with root package name */
    String f50583c;

    /* renamed from: d, reason: collision with root package name */
    byte[] f50584d;

    /* renamed from: e, reason: collision with root package name */
    byte[] f50585e;

    /* renamed from: f, reason: collision with root package name */
    boolean f50586f = false;

    /* renamed from: g, reason: collision with root package name */
    byte[] f50587g = null;

    /* renamed from: h, reason: collision with root package name */
    byte[] f50588h = null;

    /* renamed from: i, reason: collision with root package name */
    private static final int f50570i = Rg.a.d("jcifs.smb1.smb.lmCompatibility", 3);

    /* renamed from: j, reason: collision with root package name */
    private static final Random f50571j = new Random();

    /* renamed from: k, reason: collision with root package name */
    private static Ug.e f50572k = Ug.e.a();

    /* renamed from: l, reason: collision with root package name */
    private static final byte[] f50573l = {75, 71, 83, 33, 64, 35, 36, 37};

    /* renamed from: p, reason: collision with root package name */
    public static final C6277k f50577p = new C6277k("", "", "");

    /* renamed from: q, reason: collision with root package name */
    static final C6277k f50578q = new C6277k("", "", "");

    /* renamed from: r, reason: collision with root package name */
    static final C6277k f50579r = new C6277k("?", "GUEST", "");

    /* renamed from: s, reason: collision with root package name */
    static final C6277k f50580s = new C6277k(null);

    public C6277k(String str) {
        this.f50583c = null;
        this.f50582b = null;
        this.f50581a = null;
        if (str != null) {
            try {
                str = C(str);
            } catch (UnsupportedEncodingException unused) {
            }
            int length = str.length();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                char cCharAt = str.charAt(i10);
                if (cCharAt == ';') {
                    this.f50581a = str.substring(0, i10);
                    i11 = i10 + 1;
                } else if (cCharAt == ':') {
                    this.f50583c = str.substring(i10 + 1);
                    break;
                }
                i10++;
            }
            this.f50582b = str.substring(i11, i10);
        }
        v();
        if (this.f50581a == null) {
            this.f50581a = f50574m;
        }
        if (this.f50582b == null) {
            this.f50582b = f50575n;
        }
        if (this.f50583c == null) {
            this.f50583c = f50576o;
        }
    }

    public static byte[] B(String str, String str2, String str3) {
        try {
            Ug.f fVar = new Ug.f();
            fVar.update(str3.getBytes("UTF-16LE"));
            Ug.c cVar = new Ug.c(fVar.digest());
            cVar.update(str2.toUpperCase().getBytes("UTF-16LE"));
            cVar.update(str.getBytes("UTF-16LE"));
            return cVar.digest();
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    static String C(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (i10 < length) {
            if (!z10) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '%') {
                    z10 = true;
                } else {
                    cArr[i11] = cCharAt;
                    i11++;
                }
            } else if (z10) {
                cArr[i11] = new String(new byte[]{(byte) (Integer.parseInt(str.substring(i10, i10 + 2), 16) & 255)}, 0, 1, "ASCII").charAt(0);
                i10++;
                i11++;
                z10 = false;
            }
            i10++;
        }
        return new String(cArr, 0, i11);
    }

    private static void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[7];
        byte[] bArr5 = new byte[8];
        for (int i10 = 0; i10 < bArr.length / 7; i10++) {
            System.arraycopy(bArr, i10 * 7, bArr4, 0, 7);
            new Ug.a(bArr4).e(bArr2, bArr5);
            System.arraycopy(bArr5, 0, bArr3, i10 * 8, 8);
        }
    }

    static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11) {
        Ug.c cVar = new Ug.c(bArr);
        cVar.update(bArr2);
        cVar.update(bArr3, i10, i11);
        byte[] bArrDigest = cVar.digest();
        byte[] bArr4 = new byte[bArrDigest.length + bArr3.length];
        System.arraycopy(bArrDigest, 0, bArr4, 0, bArrDigest.length);
        System.arraycopy(bArr3, 0, bArr4, bArrDigest.length, bArr3.length);
        return bArr4;
    }

    public static byte[] h(String str, String str2, String str3, byte[] bArr, byte[] bArr2) throws DigestException {
        try {
            byte[] bArr3 = new byte[24];
            Ug.f fVar = new Ug.f();
            fVar.update(str3.getBytes("UTF-16LE"));
            Ug.c cVar = new Ug.c(fVar.digest());
            cVar.update(str2.toUpperCase().getBytes("UTF-16LE"));
            cVar.update(str.toUpperCase().getBytes("UTF-16LE"));
            Ug.c cVar2 = new Ug.c(cVar.digest());
            cVar2.update(bArr);
            cVar2.update(bArr2);
            cVar2.digest(bArr3, 0, 16);
            System.arraycopy(bArr2, 0, bArr3, 16, 8);
            return bArr3;
        } catch (Exception e10) {
            if (Ug.e.f22464b <= 0) {
                return null;
            }
            e10.printStackTrace(f50572k);
            return null;
        }
    }

    public static byte[] j(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchAlgorithmException {
        byte[] bArr4 = new byte[8];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr2);
            messageDigest.update(bArr3, 0, 8);
            System.arraycopy(messageDigest.digest(), 0, bArr4, 0, 8);
            byte[] bArr5 = new byte[21];
            System.arraycopy(bArr, 0, bArr5, 0, 16);
            byte[] bArr6 = new byte[24];
            a(bArr5, bArr4, bArr6);
            return bArr6;
        } catch (GeneralSecurityException e10) {
            if (Ug.e.f22464b > 0) {
                e10.printStackTrace(f50572k);
            }
            throw new RuntimeException("MD5", e10);
        }
    }

    public static byte[] l(String str, byte[] bArr) throws DigestException, UnsupportedEncodingException {
        byte[] bytes;
        byte[] bArr2 = new byte[21];
        byte[] bArr3 = new byte[24];
        try {
            bytes = str.getBytes("UTF-16LE");
        } catch (UnsupportedEncodingException e10) {
            if (Ug.e.f22464b > 0) {
                e10.printStackTrace(f50572k);
            }
            bytes = null;
        }
        Ug.f fVar = new Ug.f();
        fVar.update(bytes);
        try {
            fVar.digest(bArr2, 0, 16);
        } catch (Exception e11) {
            if (Ug.e.f22464b > 0) {
                e11.printStackTrace(f50572k);
            }
        }
        a(bArr2, bArr, bArr3);
        return bArr3;
    }

    public static byte[] m(byte[] bArr, byte[] bArr2, byte[] bArr3, long j10, byte[] bArr4) {
        int length = bArr4 != null ? bArr4.length : 0;
        int i10 = length + 28;
        int i11 = length + 32;
        byte[] bArr5 = new byte[i11];
        Ug.b.e(257, bArr5, 0);
        Ug.b.e(0, bArr5, 4);
        Ug.b.f(j10, bArr5, 8);
        System.arraycopy(bArr3, 0, bArr5, 16, 8);
        Ug.b.e(0, bArr5, 24);
        if (bArr4 != null) {
            System.arraycopy(bArr4, 0, bArr5, 28, length);
        }
        Ug.b.e(0, bArr5, i10);
        return c(bArr, bArr2, bArr5, 0, i11);
    }

    public static byte[] o(String str, byte[] bArr) throws UnsupportedEncodingException {
        byte[] bArr2 = new byte[14];
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        try {
            byte[] bytes = str.toUpperCase().getBytes(L.f50363M0);
            int length = bytes.length;
            System.arraycopy(bytes, 0, bArr2, 0, length <= 14 ? length : 14);
            a(bArr2, f50573l, bArr3);
            a(bArr3, bArr, bArr4);
            return bArr4;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Try setting jcifs.smb1.encoding=US-ASCII", e10);
        }
    }

    static void v() {
        if (f50574m != null) {
            return;
        }
        f50574m = Rg.a.h("jcifs.smb1.smb.client.domain", "?");
        f50575n = Rg.a.h("jcifs.smb1.smb.client.username", "GUEST");
        f50576o = Rg.a.h("jcifs.smb1.smb.client.password", "");
    }

    public static byte[] y(String str) {
        if (str == null) {
            throw new RuntimeException("Password parameter is required");
        }
        try {
            Ug.f fVar = new Ug.f();
            fVar.update(str.getBytes("UTF-16LE"));
            return fVar.digest();
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    public byte[] d(byte[] bArr) {
        if (this.f50586f) {
            return this.f50584d;
        }
        int i10 = f50570i;
        if (i10 == 0 || i10 == 1) {
            return o(this.f50583c, bArr);
        }
        if (i10 == 2) {
            return l(this.f50583c, bArr);
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return o(this.f50583c, bArr);
        }
        if (this.f50587g == null) {
            byte[] bArr2 = new byte[8];
            this.f50587g = bArr2;
            f50571j.nextBytes(bArr2);
        }
        return h(this.f50581a, this.f50582b, this.f50583c, bArr, this.f50587g);
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (obj instanceof C6277k) {
            C6277k c6277k = (C6277k) obj;
            if (c6277k.f50581a.toUpperCase().equals(this.f50581a.toUpperCase()) && c6277k.f50582b.toUpperCase().equals(this.f50582b.toUpperCase())) {
                boolean z10 = this.f50586f;
                if (z10 && c6277k.f50586f) {
                    return Arrays.equals(this.f50584d, c6277k.f50584d) && Arrays.equals(this.f50585e, c6277k.f50585e);
                }
                if (!z10 && this.f50583c.equals(c6277k.f50583c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String g() {
        return this.f50581a;
    }

    @Override // java.security.Principal
    public String getName() {
        if (this.f50581a.length() <= 0 || this.f50581a.equals("?")) {
            return this.f50582b;
        }
        return this.f50581a + "\\" + this.f50582b;
    }

    @Override // java.security.Principal
    public int hashCode() {
        return getName().toUpperCase().hashCode();
    }

    public String n() {
        return this.f50583c;
    }

    public byte[] p(byte[] bArr) throws SmbException, DigestException {
        int i10 = f50570i;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            byte[] bArr2 = new byte[40];
            s(bArr, bArr2, 0);
            System.arraycopy(r(bArr), 0, bArr2, 16, 24);
            return bArr2;
        }
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            throw new SmbException("NTLMv2 requires extended security (jcifs.smb1.smb1.client.useExtendedSecurity must be true if jcifs.smb1.smb1.lmCompatibility >= 3)");
        }
        return null;
    }

    public byte[] r(byte[] bArr) {
        if (this.f50586f) {
            return this.f50585e;
        }
        int i10 = f50570i;
        return (i10 == 0 || i10 == 1 || i10 == 2) ? l(this.f50583c, bArr) : (i10 == 3 || i10 == 4 || i10 == 5) ? new byte[0] : l(this.f50583c, bArr);
    }

    void s(byte[] bArr, byte[] bArr2, int i10) throws SmbException, DigestException {
        if (this.f50586f) {
            return;
        }
        try {
            Ug.f fVar = new Ug.f();
            fVar.update(this.f50583c.getBytes("UTF-16LE"));
            int i11 = f50570i;
            if (i11 == 0 || i11 == 1 || i11 == 2) {
                fVar.update(fVar.digest());
                fVar.digest(bArr2, i10, 16);
                return;
            }
            if (i11 != 3 && i11 != 4 && i11 != 5) {
                fVar.update(fVar.digest());
                fVar.digest(bArr2, i10, 16);
                return;
            }
            if (this.f50587g == null) {
                byte[] bArr3 = new byte[8];
                this.f50587g = bArr3;
                f50571j.nextBytes(bArr3);
            }
            Ug.c cVar = new Ug.c(fVar.digest());
            cVar.update(this.f50582b.toUpperCase().getBytes("UTF-16LE"));
            cVar.update(this.f50581a.toUpperCase().getBytes("UTF-16LE"));
            byte[] bArrDigest = cVar.digest();
            Ug.c cVar2 = new Ug.c(bArrDigest);
            cVar2.update(bArr);
            cVar2.update(this.f50587g);
            Ug.c cVar3 = new Ug.c(bArrDigest);
            cVar3.update(cVar2.digest());
            cVar3.digest(bArr2, i10, 16);
        } catch (Exception e10) {
            throw new SmbException("", e10);
        }
    }

    public String t() {
        return this.f50582b;
    }

    @Override // java.security.Principal
    public String toString() {
        return getName();
    }

    public C6277k(String str, String str2, String str3) {
        if (str2 != null) {
            int iIndexOf = str2.indexOf(64);
            if (iIndexOf > 0) {
                str = str2.substring(iIndexOf + 1);
                str2 = str2.substring(0, iIndexOf);
            } else {
                int iIndexOf2 = str2.indexOf(92);
                if (iIndexOf2 > 0) {
                    str = str2.substring(0, iIndexOf2);
                    str2 = str2.substring(iIndexOf2 + 1);
                }
            }
        }
        this.f50581a = str;
        this.f50582b = str2;
        this.f50583c = str3;
        v();
        if (str == null) {
            this.f50581a = f50574m;
        }
        if (str2 == null) {
            this.f50582b = f50575n;
        }
        if (str3 == null) {
            this.f50583c = f50576o;
        }
    }
}
