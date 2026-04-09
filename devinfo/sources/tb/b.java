package tb;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import com.applovin.shadow.okio.Segment;
import j1.q;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import nb.i;
import nb.j;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f34529a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f34530b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f34531c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f34532d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f34533e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f34534f;
    public static Boolean g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f34535h;

    public static void a(Context context, Throwable th2) {
        try {
            y.h(context);
        } catch (Exception e2) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i4 = 0;
        for (byte b10 : bArr) {
            char[] cArr2 = f34530b;
            cArr[i4] = cArr2[(b10 & 255) >>> 4];
            cArr[i4 + 1] = cArr2[b10 & 15];
            i4 += 2;
        }
        return new String(cArr);
    }

    public static String c(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i4 = 0; i4 < length; i4++) {
            int i10 = (bArr[i4] & 240) >>> 4;
            char[] cArr = f34529a;
            sb2.append(cArr[i10]);
            sb2.append(cArr[bArr[i4] & 15]);
        }
        return sb2.toString();
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long e(InputStream inputStream, OutputStream outputStream, boolean z3) {
        byte[] bArr = new byte[Segment.SHARE_MINIMUM];
        long j = 0;
        while (true) {
            try {
                int i4 = inputStream.read(bArr, 0, Segment.SHARE_MINIMUM);
                if (i4 == -1) {
                    break;
                }
                j += i4;
                outputStream.write(bArr, 0, i4);
            } catch (Throwable th2) {
                if (z3) {
                    d(inputStream);
                    d(outputStream);
                }
                throw th2;
            }
        }
        if (z3) {
            d(inputStream);
            d(outputStream);
        }
        return j;
    }

    public static byte[] f(Context context, String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        PackageInfo packageInfoE = ub.b.a(context).e(64, str);
        Signature[] signatureArr = packageInfoE.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i4 = 0;
            while (true) {
                if (i4 >= 2) {
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
                i4++;
            }
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoE.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean i(int i4, Context context) throws PackageManager.NameNotFoundException {
        if (m(context, i4, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                j jVarA = j.a(context);
                jVarA.getClass();
                if (packageInfo != null) {
                    if (!j.c(packageInfo, false)) {
                        if (j.c(packageInfo, true)) {
                            if (!i.a(jVarA.f29906a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean j(Context context) {
        if (f34533e == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z3 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z3 = true;
            }
            f34533e = Boolean.valueOf(z3);
        }
        return f34533e.booleanValue();
    }

    public static boolean k(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f34531c == null) {
            f34531c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f34531c.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (n(context)) {
            return !g() || h();
        }
        return false;
    }

    public static byte[] l(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i4 = 0;
        while (i4 < length) {
            int i10 = i4 + 2;
            bArr[i4 / 2] = (byte) Integer.parseInt(str.substring(i4, i10), 16);
            i4 = i10;
        }
        return bArr;
    }

    public static boolean m(Context context, int i4, String str) {
        q qVarA = ub.b.a(context);
        qVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) qVarA.f27058a).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i4, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean n(Context context) {
        if (f34532d == null) {
            f34532d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f34532d.booleanValue();
    }
}
