package t6;

import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f34398b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile v f34399c;

    /* renamed from: a, reason: collision with root package name */
    public final int f34400a;

    public v(int i4) {
        this.f34400a = i4;
    }

    public static v e() {
        v vVar;
        synchronized (f34398b) {
            try {
                if (f34399c == null) {
                    f34399c = new v(3);
                }
                vVar = f34399c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final void a(String str, String str2) {
        if (this.f34400a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2, Throwable th2) {
        if (this.f34400a <= 3) {
            Log.d(str, str2, th2);
        }
    }

    public final void c(String str, String str2) {
        if (this.f34400a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void d(String str, String str2, Throwable th2) {
        if (this.f34400a <= 6) {
            Log.e(str, str2, th2);
        }
    }

    public final void f(String str, String str2) {
        if (this.f34400a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void h(String str, String str2) {
        if (this.f34400a <= 5) {
            Log.w(str, str2);
        }
    }
}
