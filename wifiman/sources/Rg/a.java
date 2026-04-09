package Rg;

import Ug.e;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static Properties f19840a = new Properties();

    /* renamed from: b, reason: collision with root package name */
    private static e f19841b = e.a();

    /* renamed from: c, reason: collision with root package name */
    public static String f19842c;

    static {
        f19842c = "Cp850";
        try {
            String property = System.getProperty("jcifs_smb1.properties");
            FileInputStream fileInputStream = (property == null || property.length() <= 1) ? null : new FileInputStream(property);
            i(fileInputStream);
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (IOException e10) {
            if (e.f22464b > 0) {
                e10.printStackTrace(f19841b);
            }
        }
        int iD = d("jcifs.smb1.util.loglevel", -1);
        if (iD != -1) {
            e.h(iD);
        }
        try {
            "".getBytes(f19842c);
        } catch (UnsupportedEncodingException unused) {
            if (e.f22464b >= 2) {
                f19841b.println("WARNING: The default OEM encoding " + f19842c + " does not appear to be supported by this JRE. The default encoding will be US-ASCII.");
            }
            f19842c = "US-ASCII";
        }
        if (e.f22464b >= 4) {
            try {
                f19840a.store(f19841b, "JCIFS PROPERTIES");
            } catch (IOException unused2) {
            }
        }
    }

    public static boolean a(String str, boolean z10) {
        String strG = g(str);
        return strG != null ? strG.toLowerCase().equals("true") : z10;
    }

    public static InetAddress b(String str, InetAddress inetAddress) {
        String property = f19840a.getProperty(str);
        if (property == null) {
            return inetAddress;
        }
        try {
            return InetAddress.getByName(property);
        } catch (UnknownHostException e10) {
            if (e.f22464b <= 0) {
                return inetAddress;
            }
            f19841b.println(property);
            e10.printStackTrace(f19841b);
            return inetAddress;
        }
    }

    public static InetAddress[] c(String str, String str2, InetAddress[] inetAddressArr) {
        String strG = g(str);
        if (strG == null) {
            return inetAddressArr;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(strG, str2);
        int iCountTokens = stringTokenizer.countTokens();
        InetAddress[] inetAddressArr2 = new InetAddress[iCountTokens];
        for (int i10 = 0; i10 < iCountTokens; i10++) {
            String strNextToken = stringTokenizer.nextToken();
            try {
                inetAddressArr2[i10] = InetAddress.getByName(strNextToken);
            } catch (UnknownHostException e10) {
                if (e.f22464b > 0) {
                    f19841b.println(strNextToken);
                    e10.printStackTrace(f19841b);
                }
                return inetAddressArr;
            }
        }
        return inetAddressArr2;
    }

    public static int d(String str, int i10) {
        String property = f19840a.getProperty(str);
        if (property == null) {
            return i10;
        }
        try {
            return Integer.parseInt(property);
        } catch (NumberFormatException e10) {
            if (e.f22464b <= 0) {
                return i10;
            }
            e10.printStackTrace(f19841b);
            return i10;
        }
    }

    public static InetAddress e() {
        String property = f19840a.getProperty("jcifs.smb1.smb.client.laddr");
        if (property == null) {
            return null;
        }
        try {
            return InetAddress.getByName(property);
        } catch (UnknownHostException e10) {
            if (e.f22464b <= 0) {
                return null;
            }
            f19841b.println("Ignoring jcifs.smb1.smb.client.laddr address: " + property);
            e10.printStackTrace(f19841b);
            return null;
        }
    }

    public static long f(String str, long j10) {
        String property = f19840a.getProperty(str);
        if (property == null) {
            return j10;
        }
        try {
            return Long.parseLong(property);
        } catch (NumberFormatException e10) {
            if (e.f22464b <= 0) {
                return j10;
            }
            e10.printStackTrace(f19841b);
            return j10;
        }
    }

    public static String g(String str) {
        return f19840a.getProperty(str);
    }

    public static String h(String str, String str2) {
        return f19840a.getProperty(str, str2);
    }

    public static void i(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            f19840a.load(inputStream);
        }
        try {
            f19840a.putAll((Map) System.getProperties().clone());
        } catch (SecurityException unused) {
            if (e.f22464b > 1) {
                f19841b.println("SecurityException: jcifs.smb1 will ignore System properties");
            }
        }
    }
}
