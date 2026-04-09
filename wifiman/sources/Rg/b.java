package Rg;

import Sg.g;
import Ug.e;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.StringTokenizer;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static int[] f19843c;

    /* renamed from: d, reason: collision with root package name */
    private static InetAddress f19844d;

    /* renamed from: e, reason: collision with root package name */
    private static e f19845e = e.a();

    /* renamed from: a, reason: collision with root package name */
    Object f19846a;

    /* renamed from: b, reason: collision with root package name */
    String f19847b;

    static class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        C0722b f19848a;

        /* renamed from: b, reason: collision with root package name */
        String f19849b;

        /* renamed from: c, reason: collision with root package name */
        String f19850c;

        /* renamed from: d, reason: collision with root package name */
        int f19851d;

        /* renamed from: e, reason: collision with root package name */
        g f19852e;

        /* renamed from: f, reason: collision with root package name */
        InetAddress f19853f;

        /* renamed from: g, reason: collision with root package name */
        UnknownHostException f19854g;

        a(C0722b c0722b, String str, int i10, String str2, InetAddress inetAddress) {
            super("JCIFS-QueryThread: " + str);
            this.f19852e = null;
            this.f19848a = c0722b;
            this.f19849b = str;
            this.f19851d = i10;
            this.f19850c = str2;
            this.f19853f = inetAddress;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        this.f19852e = g.h(this.f19849b, this.f19851d, this.f19850c, this.f19853f);
                        synchronized (this.f19848a) {
                            r1.f19855a--;
                            this.f19848a.notify();
                        }
                    } catch (UnknownHostException e10) {
                        this.f19854g = e10;
                        synchronized (this.f19848a) {
                            r1.f19855a--;
                            this.f19848a.notify();
                        }
                    }
                } catch (Exception e11) {
                    this.f19854g = new UnknownHostException(e11.getMessage());
                    synchronized (this.f19848a) {
                        r1.f19855a--;
                        this.f19848a.notify();
                    }
                }
            } catch (Throwable th2) {
                synchronized (this.f19848a) {
                    r2.f19855a--;
                    this.f19848a.notify();
                    throw th2;
                }
            }
        }
    }

    /* renamed from: Rg.b$b, reason: collision with other inner class name */
    static class C0722b {

        /* renamed from: a, reason: collision with root package name */
        int f19855a;

        C0722b(int i10) {
            this.f19855a = i10;
        }
    }

    static {
        int i10;
        String strG = Rg.a.g("jcifs.smb1.resolveOrder");
        InetAddress inetAddressP = g.p();
        try {
            f19844d = Rg.a.b("jcifs.smb1.netbios.baddr", InetAddress.getByName("255.255.255.255"));
        } catch (UnknownHostException unused) {
        }
        if (strG == null || strG.length() == 0) {
            if (inetAddressP == null) {
                f19843c = new int[]{3, 2, 1};
                return;
            } else {
                f19843c = new int[]{3, 0, 2, 1};
                return;
            }
        }
        int[] iArr = new int[4];
        StringTokenizer stringTokenizer = new StringTokenizer(strG, ",");
        int i11 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if (strTrim.equalsIgnoreCase("LMHOSTS")) {
                i10 = i11 + 1;
                iArr[i11] = 3;
            } else if (strTrim.equalsIgnoreCase("WINS")) {
                if (inetAddressP != null) {
                    i10 = i11 + 1;
                    iArr[i11] = 0;
                } else if (e.f22464b > 1) {
                    f19845e.println("UniAddress resolveOrder specifies WINS however the jcifs.smb1.netbios.wins property has not been set");
                }
            } else if (strTrim.equalsIgnoreCase("BCAST")) {
                i10 = i11 + 1;
                iArr[i11] = 1;
            } else if (strTrim.equalsIgnoreCase("DNS")) {
                i10 = i11 + 1;
                iArr[i11] = 2;
            } else if (e.f22464b > 1) {
                f19845e.println("unknown resolver method: " + strTrim);
            }
            i11 = i10;
        }
        int[] iArr2 = new int[i11];
        f19843c = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, i11);
    }

    public b(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        this.f19846a = obj;
    }

    public static b[] c(String str, boolean z10) throws UnknownHostException {
        int i10;
        g gVarJ;
        if (str == null || str.length() == 0) {
            throw new UnknownHostException();
        }
        if (i(str)) {
            return new b[]{new b(g.f(str))};
        }
        int i11 = 0;
        while (true) {
            int[] iArr = f19843c;
            if (i11 >= iArr.length) {
                throw new UnknownHostException(str);
            }
            try {
                i10 = iArr[i11];
            } catch (IOException unused) {
            }
            if (i10 == 0) {
                if (str != "\u0001\u0002__MSBROWSE__\u0002" && str.length() <= 15) {
                    gVarJ = z10 ? j(str, g.p()) : g.h(str, 32, null, g.p());
                }
                i11++;
            } else if (i10 != 1) {
                if (i10 == 2) {
                    if (h(str)) {
                        throw new UnknownHostException(str);
                    }
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    b[] bVarArr = new b[allByName.length];
                    for (int i12 = 0; i12 < allByName.length; i12++) {
                        bVarArr[i12] = new b(allByName[i12]);
                    }
                    return bVarArr;
                }
                if (i10 != 3) {
                    throw new UnknownHostException(str);
                }
                gVarJ = Sg.a.b(str);
                if (gVarJ != null) {
                    break;
                }
                i11++;
            } else if (str.length() > 15) {
                i11++;
            } else {
                gVarJ = z10 ? j(str, f19844d) : g.h(str, 32, null, f19844d);
            }
        }
        return new b[]{new b(gVarJ)};
    }

    public static b d(String str) {
        return e(str, false);
    }

    public static b e(String str, boolean z10) {
        return c(str, z10)[0];
    }

    static boolean h(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    static boolean i(String str) {
        if (Character.isDigit(str.charAt(0))) {
            int length = str.length();
            char[] charArray = str.toCharArray();
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i10 + 1;
                if (!Character.isDigit(charArray[i10])) {
                    break;
                }
                if (i12 == length && i11 == 3) {
                    return true;
                }
                if (i12 >= length || charArray[i12] != '.') {
                    i10 = i12;
                } else {
                    i11++;
                    i10 += 2;
                }
            }
        }
        return false;
    }

    static g j(String str, InetAddress inetAddress) throws UnknownHostException {
        C0722b c0722b = new C0722b(2);
        a aVar = new a(c0722b, str, g.q(inetAddress) ? 27 : 29, null, inetAddress);
        a aVar2 = new a(c0722b, str, 32, null, inetAddress);
        aVar.setDaemon(true);
        aVar2.setDaemon(true);
        try {
            synchronized (c0722b) {
                try {
                    aVar.start();
                    aVar2.start();
                    while (c0722b.f19855a > 0 && aVar.f19852e == null && aVar2.f19852e == null) {
                        c0722b.wait();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g gVar = aVar.f19852e;
            if (gVar != null) {
                return gVar;
            }
            g gVar2 = aVar2.f19852e;
            if (gVar2 != null) {
                return gVar2;
            }
            throw aVar.f19854g;
        } catch (InterruptedException unused) {
            throw new UnknownHostException(str);
        }
    }

    public String a() {
        Object obj = this.f19846a;
        if (obj instanceof g) {
            return ((g) obj).e();
        }
        String hostName = ((InetAddress) obj).getHostName();
        this.f19847b = hostName;
        if (i(hostName)) {
            this.f19847b = "*SMBSERVER     ";
        } else {
            int iIndexOf = this.f19847b.indexOf(46);
            if (iIndexOf > 1 && iIndexOf < 15) {
                this.f19847b = this.f19847b.substring(0, iIndexOf).toUpperCase();
            } else if (this.f19847b.length() > 15) {
                this.f19847b = "*SMBSERVER     ";
            } else {
                this.f19847b = this.f19847b.toUpperCase();
            }
        }
        return this.f19847b;
    }

    public Object b() {
        return this.f19846a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && this.f19846a.equals(((b) obj).f19846a);
    }

    public String f() {
        Object obj = this.f19846a;
        return obj instanceof g ? ((g) obj).j() : ((InetAddress) obj).getHostAddress();
    }

    public String g() {
        Object obj = this.f19846a;
        return obj instanceof g ? ((g) obj).k() : ((InetAddress) obj).getHostName();
    }

    public int hashCode() {
        return this.f19846a.hashCode();
    }

    public String k() {
        Object obj = this.f19846a;
        if (obj instanceof g) {
            return ((g) obj).r();
        }
        if (this.f19847b == "*SMBSERVER     ") {
            return null;
        }
        this.f19847b = "*SMBSERVER     ";
        return "*SMBSERVER     ";
    }

    public String toString() {
        return this.f19846a.toString();
    }
}
