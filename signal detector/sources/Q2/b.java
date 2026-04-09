package Q2;

import M2.u;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f3170a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f3171b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f3172c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f3173d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f3174e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f3175f;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f3176g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f3177h;

    public static void a(Context context, Throwable th) {
        try {
            u.e(context);
        } catch (Exception e6) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e6);
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b5 : bArr) {
            char[] cArr2 = f3170a;
            cArr[i] = cArr2[(b5 & 255) >>> 4];
            cArr[i + 1] = cArr2[b5 & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public static void c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long d(InputStream inputStream, OutputStream outputStream, boolean z6) throws IOException {
        byte[] bArr = new byte[1024];
        long j6 = 0;
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    break;
                }
                j6 += i;
                outputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                if (z6) {
                    c(inputStream);
                    c(outputStream);
                }
                throw th;
            }
        }
        if (z6) {
            c(inputStream);
            c(outputStream);
        }
        return j6;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean g(Context context) {
        if (f3173d == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z6 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z6 = true;
            }
            f3173d = Boolean.valueOf(z6);
        }
        return f3173d.booleanValue();
    }

    public static boolean h(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f3171b == null) {
            f3171b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f3171b.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (j(context)) {
            return !e() || f();
        }
        return false;
    }

    public static byte[] i(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i = 0;
        while (i < length) {
            int i3 = i + 2;
            bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i3), 16);
            i = i3;
        }
        return bArr;
    }

    public static boolean j(Context context) {
        if (f3172c == null) {
            f3172c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f3172c.booleanValue();
    }
}
