package r3;

import android.util.Log;

/* loaded from: classes.dex */
class H {

    /* renamed from: e, reason: collision with root package name */
    private static final H f60063e = new H(true, 3, 1, null, null);

    /* renamed from: a, reason: collision with root package name */
    final boolean f60064a;

    /* renamed from: b, reason: collision with root package name */
    final String f60065b;

    /* renamed from: c, reason: collision with root package name */
    final Throwable f60066c;

    /* renamed from: d, reason: collision with root package name */
    final int f60067d;

    private H(boolean z10, int i10, int i11, String str, Throwable th2) {
        this.f60064a = z10;
        this.f60067d = i10;
        this.f60065b = str;
        this.f60066c = th2;
    }

    static H b() {
        return f60063e;
    }

    static H c(String str) {
        return new H(false, 1, 5, str, null);
    }

    static H d(String str, Throwable th2) {
        return new H(false, 1, 5, str, th2);
    }

    static H f(int i10) {
        return new H(true, i10, 1, null, null);
    }

    static H g(int i10, int i11, String str, Throwable th2) {
        return new H(false, i10, i11, str, th2);
    }

    String a() {
        return this.f60065b;
    }

    final void e() {
        if (this.f60064a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f60066c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f60066c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
