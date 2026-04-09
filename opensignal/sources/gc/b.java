package gc;

import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import cc.s;
import io.sentry.android.core.e0;
import io.sentry.instrumentation.file.g;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import zb.f;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f9480a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f9481b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f9482c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f9483d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f9484e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f9485f;

    /* renamed from: g, reason: collision with root package name */
    public static String f9486g;

    /* renamed from: h, reason: collision with root package name */
    public static int f9487h;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f9488i;

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = (bArr[i10] & 240) >>> 4;
            char[] cArr = f9480a;
            sb2.append(cArr[i11]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }

    public static void b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String c() throws Throwable {
        BufferedReader bufferedReader;
        String string;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        if (f9486g == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f9486g = Application.getProcessName();
            } else {
                int iMyPid = f9487h;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f9487h = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(iMyPid);
                        sb2.append("/cmdline");
                        string = sb2.toString();
                        threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        bufferedReader = new BufferedReader(new g(new io.sentry.instrumentation.file.e(io.sentry.instrumentation.file.e.b(string != null ? new File(string) : null, null))));
                        try {
                            String line = bufferedReader.readLine();
                            s.h(line);
                            strTrim = line.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader2 = bufferedReader;
                            b(bufferedReader2);
                            throw th;
                        }
                        b(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
                f9486g = strTrim;
            }
        }
        return f9486g;
    }

    public static byte[] d(Context context, String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        PackageInfo packageInfoC = ic.c.a(context).c(64, str);
        Signature[] signatureArr = packageInfoC.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i10++;
            }
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoC.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean f(Context context, int i10) throws PackageManager.NameNotFoundException {
        if (h(i10, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                zb.g gVarA = zb.g.a(context);
                gVarA.getClass();
                if (packageInfo != null) {
                    if (!zb.g.e(packageInfo, false)) {
                        if (zb.g.e(packageInfo, true)) {
                            if (!f.a((Context) gVarA.f26825a)) {
                                e0.p("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.isLoggable("UidVerifier", 3);
                return false;
            }
        }
        return false;
    }

    public static boolean g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f9482c == null) {
            f9482c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f9482c.booleanValue();
        if (f9483d == null) {
            f9483d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f9483d.booleanValue()) {
            return !e() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static boolean h(int i10, Context context, String str) {
        ic.b bVarA = ic.c.a(context);
        bVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) bVarA.f11323a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
