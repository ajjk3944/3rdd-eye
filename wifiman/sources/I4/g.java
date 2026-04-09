package I4;

import android.util.Log;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    static final g f8619c = new g("FirebaseCrashlytics");

    /* renamed from: a, reason: collision with root package name */
    private final String f8620a;

    /* renamed from: b, reason: collision with root package name */
    private int f8621b = 4;

    public g(String str) {
        this.f8620a = str;
    }

    private boolean a(int i10) {
        return this.f8621b <= i10 || Log.isLoggable(this.f8620a, i10);
    }

    public static g f() {
        return f8619c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th2) {
        if (a(3)) {
            Log.d(this.f8620a, str, th2);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th2) {
        if (a(6)) {
            Log.e(this.f8620a, str, th2);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th2) {
        if (a(4)) {
            Log.i(this.f8620a, str, th2);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th2) {
        if (a(2)) {
            Log.v(this.f8620a, str, th2);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th2) {
        if (a(5)) {
            Log.w(this.f8620a, str, th2);
        }
    }
}
