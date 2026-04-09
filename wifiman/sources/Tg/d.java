package Tg;

import Sg.g;
import Ug.f;
import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import jcifs.smb1.smb1.C6277k;

/* loaded from: classes4.dex */
public class d extends a {

    /* renamed from: k, reason: collision with root package name */
    private static final int f21975k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f21976l;

    /* renamed from: m, reason: collision with root package name */
    private static final String f21977m;

    /* renamed from: n, reason: collision with root package name */
    private static final String f21978n;

    /* renamed from: o, reason: collision with root package name */
    private static final String f21979o;

    /* renamed from: p, reason: collision with root package name */
    private static final int f21980p;

    /* renamed from: q, reason: collision with root package name */
    private static final SecureRandom f21981q = new SecureRandom();

    /* renamed from: d, reason: collision with root package name */
    private byte[] f21982d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f21983e;

    /* renamed from: f, reason: collision with root package name */
    private String f21984f;

    /* renamed from: g, reason: collision with root package name */
    private String f21985g;

    /* renamed from: h, reason: collision with root package name */
    private String f21986h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f21987i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f21988j = null;

    static {
        f21975k = (Rg.a.a("jcifs.smb1.smb.client.useUnicode", true) ? 1 : 2) | 512;
        String strK = null;
        f21976l = Rg.a.h("jcifs.smb1.smb.client.domain", null);
        f21977m = Rg.a.h("jcifs.smb1.smb.client.username", null);
        f21978n = Rg.a.h("jcifs.smb1.smb.client.password", null);
        try {
            strK = g.m().k();
        } catch (UnknownHostException unused) {
        }
        f21979o = strK;
        f21980p = Rg.a.d("jcifs.smb1.smb.lmCompatibility", 3);
    }

    public d(c cVar, String str, String str2, String str3, String str4, int i10) throws NoSuchAlgorithmException {
        this.f21987i = null;
        f(i10 | j(cVar));
        B(str4 == null ? k() : str4);
        w(str2);
        A(str3);
        int i11 = f21980p;
        if (i11 == 0 || i11 == 1) {
            if ((a() & ImageMetadata.LENS_APERTURE) == 0) {
                x(n(cVar, str));
                y(s(cVar, str));
                return;
            }
            byte[] bArr = new byte[24];
            SecureRandom secureRandom = f21981q;
            secureRandom.nextBytes(bArr);
            Arrays.fill(bArr, 8, 24, (byte) 0);
            byte[] bArrY = C6277k.y(str);
            byte[] bArrJ = C6277k.j(bArrY, cVar.j(), bArr);
            x(bArr);
            y(bArrJ);
            if ((a() & 16) == 16) {
                byte[] bArr2 = new byte[16];
                System.arraycopy(cVar.j(), 0, bArr2, 0, 8);
                System.arraycopy(bArr, 0, bArr2, 8, 8);
                f fVar = new f();
                fVar.update(bArrY);
                Ug.c cVar2 = new Ug.c(fVar.digest());
                cVar2.update(bArr2);
                byte[] bArrDigest = cVar2.digest();
                if ((a() & 1073741824) == 0) {
                    this.f21987i = bArrDigest;
                    z(bArrDigest);
                    return;
                }
                byte[] bArr3 = new byte[16];
                this.f21987i = bArr3;
                secureRandom.nextBytes(bArr3);
                byte[] bArr4 = new byte[16];
                new Ug.g(bArrDigest).b(this.f21987i, 0, 16, bArr4, 0);
                z(bArr4);
                return;
            }
            return;
        }
        if (i11 == 2) {
            byte[] bArrS = s(cVar, str);
            x(bArrS);
            y(bArrS);
            return;
        }
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            x(n(cVar, str));
            y(s(cVar, str));
            return;
        }
        byte[] bArrB = C6277k.B(str2, str3, str);
        byte[] bArr5 = new byte[8];
        SecureRandom secureRandom2 = f21981q;
        secureRandom2.nextBytes(bArr5);
        x(o(cVar, str2, str3, str, bArr5));
        byte[] bArr6 = new byte[8];
        secureRandom2.nextBytes(bArr6);
        y(q(cVar, bArrB, bArr6));
        if ((a() & 16) == 16) {
            Ug.c cVar3 = new Ug.c(bArrB);
            cVar3.update(this.f21983e, 0, 16);
            byte[] bArrDigest2 = cVar3.digest();
            if ((a() & 1073741824) == 0) {
                this.f21987i = bArrDigest2;
                z(bArrDigest2);
                return;
            }
            byte[] bArr7 = new byte[16];
            this.f21987i = bArr7;
            secureRandom2.nextBytes(bArr7);
            byte[] bArr8 = new byte[16];
            new Ug.g(bArrDigest2).b(this.f21987i, 0, 16, bArr8, 0);
            z(bArr8);
        }
    }

    public static int j(c cVar) {
        if (cVar == null) {
            return f21975k;
        }
        return ((cVar.a() & 1) == 0 ? 2 : 1) | 512;
    }

    public static String k() {
        return f21979o;
    }

    public static byte[] n(c cVar, String str) {
        if (cVar == null || str == null) {
            return null;
        }
        return C6277k.o(str, cVar.j());
    }

    public static byte[] o(c cVar, String str, String str2, String str3, byte[] bArr) {
        if (cVar == null || str == null || str2 == null || str3 == null || bArr == null) {
            return null;
        }
        return C6277k.h(str, str2, str3, cVar.j(), bArr);
    }

    public static byte[] q(c cVar, byte[] bArr, byte[] bArr2) {
        if (cVar == null || bArr == null || bArr2 == null) {
            return null;
        }
        return C6277k.m(bArr, cVar.j(), bArr2, (System.currentTimeMillis() + 11644473600000L) * 10000, cVar.m());
    }

    public static byte[] s(c cVar, String str) {
        if (cVar == null || str == null) {
            return null;
        }
        return C6277k.l(str, cVar.j());
    }

    public void A(String str) {
        this.f21985g = str;
    }

    public void B(String str) {
        this.f21986h = str;
    }

    public byte[] C() {
        try {
            int iA = a();
            boolean z10 = (iA & 1) != 0;
            byte[] bytes = null;
            String strB = z10 ? null : a.b();
            String strL = l();
            byte[] bytes2 = (strL == null || strL.length() == 0) ? null : z10 ? strL.getBytes("UTF-16LE") : strL.getBytes(strB);
            int length = bytes2 != null ? bytes2.length : 0;
            String strU = u();
            byte[] bytes3 = (strU == null || strU.length() == 0) ? null : z10 ? strU.getBytes("UTF-16LE") : strU.toUpperCase().getBytes(strB);
            int length2 = bytes3 != null ? bytes3.length : 0;
            String strV = v();
            if (strV != null && strV.length() != 0) {
                bytes = z10 ? strV.getBytes("UTF-16LE") : strV.toUpperCase().getBytes(strB);
            }
            int length3 = bytes != null ? bytes.length : 0;
            byte[] bArrM = m();
            int length4 = bArrM != null ? bArrM.length : 0;
            byte[] bArrR = r();
            int length5 = bArrR != null ? bArrR.length : 0;
            byte[] bArrT = t();
            byte[] bArr = new byte[length + 64 + length2 + length3 + length4 + length5 + (bArrT != null ? bArrT.length : 0)];
            System.arraycopy(a.f21960b, 0, bArr, 0, 8);
            a.h(bArr, 8, 3);
            a.g(bArr, 12, 64, bArrM);
            int i10 = length4 + 64;
            a.g(bArr, 20, i10, bArrR);
            int i11 = i10 + length5;
            a.g(bArr, 28, i11, bytes2);
            int i12 = i11 + length;
            a.g(bArr, 36, i12, bytes3);
            int i13 = i12 + length2;
            a.g(bArr, 44, i13, bytes);
            a.g(bArr, 52, i13 + length3, bArrT);
            a.h(bArr, 60, iA);
            return bArr;
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }

    public String l() {
        return this.f21984f;
    }

    public byte[] m() {
        return this.f21982d;
    }

    public byte[] p() {
        return this.f21987i;
    }

    public byte[] r() {
        return this.f21983e;
    }

    public byte[] t() {
        return this.f21988j;
    }

    public String toString() {
        String str;
        String str2;
        String strU = u();
        String strL = l();
        String strV = v();
        byte[] bArrM = m();
        byte[] bArrR = r();
        byte[] bArrT = t();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Type3Message[domain=");
        sb2.append(strL);
        sb2.append(",user=");
        sb2.append(strU);
        sb2.append(",workstation=");
        sb2.append(strV);
        sb2.append(",lmResponse=");
        String str3 = "null";
        if (bArrM == null) {
            str = "null";
        } else {
            str = "<" + bArrM.length + " bytes>";
        }
        sb2.append(str);
        sb2.append(",ntResponse=");
        if (bArrR == null) {
            str2 = "null";
        } else {
            str2 = "<" + bArrR.length + " bytes>";
        }
        sb2.append(str2);
        sb2.append(",sessionKey=");
        if (bArrT != null) {
            str3 = "<" + bArrT.length + " bytes>";
        }
        sb2.append(str3);
        sb2.append(",flags=0x");
        sb2.append(Ug.d.c(a(), 8));
        sb2.append("]");
        return sb2.toString();
    }

    public String u() {
        return this.f21985g;
    }

    public String v() {
        return this.f21986h;
    }

    public void w(String str) {
        this.f21984f = str;
    }

    public void x(byte[] bArr) {
        this.f21982d = bArr;
    }

    public void y(byte[] bArr) {
        this.f21983e = bArr;
    }

    public void z(byte[] bArr) {
        this.f21988j = bArr;
    }
}
