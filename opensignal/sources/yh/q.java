package yh;

import ak.x;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f26357a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26358b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26359c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26360d;

    /* renamed from: e, reason: collision with root package name */
    public final x f26361e;

    public q(int i10, String str, int i11, boolean z10, x xVar) {
        this.f26357a = i10;
        this.f26358b = str;
        this.f26359c = i11;
        this.f26360d = z10;
        this.f26361e = xVar;
    }

    public static String b(String str, String str2) {
        if (str2 != null && !str2.equals("255.255.255.255")) {
            String[] strArrSplit = str2.split("\\.");
            String[] strArrSplit2 = str.split("\\.");
            if (strArrSplit.length == 4 && strArrSplit2.length == 4) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < 4; i10++) {
                    arrayList.add(String.valueOf(Integer.parseInt(strArrSplit[i10]) & Integer.parseInt(strArrSplit2[i10])));
                }
                String string = "";
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    StringBuilder sbT = c7.a.t(string);
                    sbT.append((String) arrayList.get(i11));
                    string = sbT.toString();
                    if (i11 != arrayList.size() - 1) {
                        string = w.g.f(string, ".");
                    }
                }
                return string;
            }
        }
        return str;
    }

    public static String c(String str, String str2) throws UnknownHostException {
        String str3;
        int i10;
        if (str2 != null && !str2.equals("/128")) {
            String[] strArrSplit = str2.split("/");
            if (strArrSplit.length == 2 && (str3 = strArrSplit[1]) != null && !str3.isEmpty() && (i10 = Integer.parseInt(strArrSplit[1])) > 0 && i10 < 128) {
                try {
                    InetAddress byName = InetAddress.getByName(str);
                    byte[] address = byName.getAddress();
                    int i11 = i10 / 8;
                    int[] iArr = new int[16];
                    for (int i12 = 0; i12 < 16; i12++) {
                        iArr[i12] = 0;
                    }
                    for (int i13 = 0; i13 < i11; i13++) {
                        iArr[i13] = 255;
                    }
                    int i14 = i10 % 8;
                    if (i14 > 0) {
                        iArr[i11] = 255 << (8 - i14);
                    }
                    byte[] bArr = new byte[16];
                    for (int i15 = 0; i15 < 16; i15++) {
                        bArr[i15] = (byte) (address[i15] & iArr[i15]);
                    }
                    String hostAddress = InetAddress.getByAddress(byName.getHostAddress(), bArr).getHostAddress();
                    if (hostAddress != null) {
                        return hostAddress;
                    }
                } catch (UnknownHostException unused) {
                }
            }
        }
        return str;
    }

    public final String a() throws UnknownHostException {
        boolean z10 = this.f26360d;
        String hostAddress = null;
        String str = this.f26358b;
        if (z10) {
            x xVar = this.f26361e;
            int i10 = xVar.f770n;
            if (i10 > 0 && this.f26357a <= i10) {
                try {
                    InetAddress byName = InetAddress.getByName(str);
                    if (byName instanceof Inet4Address) {
                        hostAddress = b(str, xVar.f771o);
                    } else if (byName instanceof Inet6Address) {
                        hostAddress = c(str, xVar.f772p);
                    }
                    if (hostAddress != null) {
                    }
                } catch (Exception e4) {
                    ch.n.d("TUTracerouteNodeInfo", "Error masking address", e4);
                }
            }
            return (str == null || !str.matches(".*[\\[,\\]].*")) ? str : "-32768";
        }
        try {
            InetAddress byName2 = InetAddress.getByName(str);
            if (!byName2.isSiteLocalAddress() && !byName2.isLinkLocalAddress()) {
                hostAddress = byName2.getHostAddress();
            }
        } catch (Exception unused) {
            hostAddress = str;
        }
        str = hostAddress;
        if (str == null) {
            return str;
        }
    }

    public final String toString() throws UnknownHostException {
        String strA = a();
        Locale locale = Locale.ENGLISH;
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f26357a);
        sb2.append(",");
        sb2.append(strA);
        sb2.append(",");
        return h0.b.i(this.f26359c, "]", sb2);
    }
}
