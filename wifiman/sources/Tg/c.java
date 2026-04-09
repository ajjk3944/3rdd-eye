package Tg;

import Sg.g;
import java.io.IOException;
import java.net.UnknownHostException;

/* loaded from: classes4.dex */
public class c extends a {

    /* renamed from: h, reason: collision with root package name */
    private static final int f21968h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f21969i;

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f21970j;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f21971d;

    /* renamed from: e, reason: collision with root package name */
    private String f21972e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f21973f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f21974g;

    static {
        int i10;
        f21968h = (Rg.a.a("jcifs.smb1.smb.client.useUnicode", true) ? 1 : 2) | 512;
        String strH = Rg.a.h("jcifs.smb1.smb.client.domain", null);
        f21969i = strH;
        byte[] bytes = new byte[0];
        if (strH != null) {
            try {
                bytes = strH.getBytes("UTF-16LE");
            } catch (IOException unused) {
            }
        }
        int length = bytes.length;
        byte[] bytes2 = new byte[0];
        try {
            String strK = g.m().k();
            if (strK != null) {
                bytes2 = strK.getBytes("UTF-16LE");
            }
        } catch (UnknownHostException | IOException unused2) {
        }
        int length2 = bytes2.length;
        byte[] bArr = new byte[(length > 0 ? length + 4 : 0) + (length2 > 0 ? length2 + 4 : 0) + 4];
        if (length > 0) {
            a.i(bArr, 0, 2);
            a.i(bArr, 2, length);
            System.arraycopy(bytes, 0, bArr, 4, length);
            i10 = length + 4;
        } else {
            i10 = 0;
        }
        if (length2 > 0) {
            a.i(bArr, i10, 1);
            a.i(bArr, i10 + 2, length2);
            System.arraycopy(bytes2, 0, bArr, i10 + 4, length2);
        }
        f21970j = bArr;
    }

    public c(byte[] bArr) throws IOException {
        n(bArr);
    }

    private void n(byte[] bArr) throws IOException {
        for (int i10 = 0; i10 < 8; i10++) {
            if (bArr[i10] != a.f21960b[i10]) {
                throw new IOException("Not an NTLMSSP message.");
            }
        }
        if (a.d(bArr, 8) != 2) {
            throw new IOException("Not a Type 2 message.");
        }
        int iD = a.d(bArr, 20);
        f(iD);
        byte[] bArrC = a.c(bArr, 12);
        q(bArrC.length != 0 ? new String(bArrC, (iD & 1) != 0 ? "UTF-16LE" : a.b()) : null);
        int i11 = 24;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            if (bArr[i11] != 0) {
                byte[] bArr2 = new byte[8];
                System.arraycopy(bArr, 24, bArr2, 0, 8);
                o(bArr2);
                break;
            }
            i11++;
        }
        int iD2 = a.d(bArr, 16);
        if (iD2 == 32 || bArr.length == 32) {
            return;
        }
        int i12 = 32;
        while (true) {
            if (i12 >= 40) {
                break;
            }
            if (bArr[i12] != 0) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArr, 32, bArr3, 0, 8);
                p(bArr3);
                break;
            }
            i12++;
        }
        if (iD2 == 40 || bArr.length == 40) {
            return;
        }
        byte[] bArrC2 = a.c(bArr, 40);
        if (bArrC2.length != 0) {
            r(bArrC2);
        }
    }

    public byte[] j() {
        return this.f21971d;
    }

    public byte[] k() {
        return this.f21973f;
    }

    public String l() {
        return this.f21972e;
    }

    public byte[] m() {
        return this.f21974g;
    }

    public void o(byte[] bArr) {
        this.f21971d = bArr;
    }

    public void p(byte[] bArr) {
        this.f21973f = bArr;
    }

    public void q(String str) {
        this.f21972e = str;
    }

    public void r(byte[] bArr) {
        this.f21974g = bArr;
    }

    public String toString() {
        String str;
        String str2;
        String strL = l();
        byte[] bArrJ = j();
        byte[] bArrK = k();
        byte[] bArrM = m();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Type2Message[target=");
        sb2.append(strL);
        sb2.append(",challenge=");
        String str3 = "null";
        if (bArrJ == null) {
            str = "null";
        } else {
            str = "<" + bArrJ.length + " bytes>";
        }
        sb2.append(str);
        sb2.append(",context=");
        if (bArrK == null) {
            str2 = "null";
        } else {
            str2 = "<" + bArrK.length + " bytes>";
        }
        sb2.append(str2);
        sb2.append(",targetInformation=");
        if (bArrM != null) {
            str3 = "<" + bArrM.length + " bytes>";
        }
        sb2.append(str3);
        sb2.append(",flags=0x");
        sb2.append(Ug.d.c(a(), 8));
        sb2.append("]");
        return sb2.toString();
    }
}
