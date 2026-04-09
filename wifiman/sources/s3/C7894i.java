package s3;

import android.util.Log;

/* renamed from: s3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7894i {

    /* renamed from: a, reason: collision with root package name */
    private final String f61299a;

    /* renamed from: b, reason: collision with root package name */
    private final String f61300b;

    public C7894i(String str, String str2) {
        AbstractC7901p.m(str, "log tag cannot be null");
        AbstractC7901p.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f61299a = str;
        this.f61300b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    private final String g(String str) {
        String str2 = this.f61300b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f61299a, i10);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, g(str2));
        }
    }

    public void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, g(str2));
        }
    }

    public void d(String str, String str2, Throwable th2) {
        if (a(6)) {
            Log.e(str, g(str2), th2);
        }
    }

    public void e(String str, String str2) {
        if (a(2)) {
            Log.v(str, g(str2));
        }
    }

    public void f(String str, String str2) {
        if (a(5)) {
            Log.w(str, g(str2));
        }
    }
}
