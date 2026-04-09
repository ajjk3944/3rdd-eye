package Tg;

import Sg.g;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;

/* loaded from: classes4.dex */
public class b extends a {

    /* renamed from: f, reason: collision with root package name */
    private static final int f21963f;

    /* renamed from: g, reason: collision with root package name */
    private static final String f21964g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f21965h;

    /* renamed from: d, reason: collision with root package name */
    private String f21966d;

    /* renamed from: e, reason: collision with root package name */
    private String f21967e;

    static {
        f21963f = (Rg.a.a("jcifs.smb1.smb.client.useUnicode", true) ? 1 : 2) | 512;
        String strK = null;
        f21964g = Rg.a.h("jcifs.smb1.smb.client.domain", null);
        try {
            strK = g.m().k();
        } catch (UnknownHostException unused) {
        }
        f21965h = strK;
    }

    public b(int i10, String str, String str2) {
        f(i10 | j());
        n(str);
        o(str2 == null ? k() : str2);
    }

    public static int j() {
        return f21963f;
    }

    public static String k() {
        return f21965h;
    }

    public String l() {
        return this.f21966d;
    }

    public String m() {
        return this.f21967e;
    }

    public void n(String str) {
        this.f21966d = str;
    }

    public void o(String str) {
        this.f21967e = str;
    }

    public byte[] p() throws UnsupportedEncodingException {
        int i10;
        boolean z10;
        int i11;
        try {
            String strL = l();
            String strM = m();
            int iA = a();
            byte[] bytes = new byte[0];
            if (strL == null || strL.length() == 0) {
                i10 = iA & (-4097);
                z10 = false;
            } else {
                i10 = iA | 4096;
                bytes = strL.toUpperCase().getBytes(a.b());
                z10 = true;
            }
            byte[] bytes2 = new byte[0];
            if (strM == null || strM.length() == 0) {
                i11 = i10 & (-8193);
            } else {
                bytes2 = strM.toUpperCase().getBytes(a.b());
                i11 = i10 | 8192;
                z10 = true;
            }
            byte[] bArr = new byte[z10 ? bytes.length + 32 + bytes2.length : 16];
            System.arraycopy(a.f21960b, 0, bArr, 0, 8);
            a.h(bArr, 8, 1);
            a.h(bArr, 12, i11);
            if (z10) {
                a.g(bArr, 16, 32, bytes);
                a.g(bArr, 24, bytes.length + 32, bytes2);
            }
            return bArr;
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }

    public String toString() {
        String strL = l();
        String strM = m();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Type1Message[suppliedDomain=");
        if (strL == null) {
            strL = "null";
        }
        sb2.append(strL);
        sb2.append(",suppliedWorkstation=");
        if (strM == null) {
            strM = "null";
        }
        sb2.append(strM);
        sb2.append(",flags=0x");
        sb2.append(Ug.d.c(a(), 8));
        sb2.append("]");
        return sb2.toString();
    }
}
