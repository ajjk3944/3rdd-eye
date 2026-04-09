package c8;

import com.google.android.gms.internal.measurement.b4;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class s extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final cv.w f3358a;

    /* renamed from: d, reason: collision with root package name */
    public final cv.l f3359d;

    /* renamed from: g, reason: collision with root package name */
    public final String f3360g;

    /* renamed from: r, reason: collision with root package name */
    public final Closeable f3361r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3362x;

    /* renamed from: y, reason: collision with root package name */
    public cv.z f3363y;

    public s(cv.w wVar, cv.l lVar, String str, Closeable closeable) {
        this.f3358a = wVar;
        this.f3359d = lVar;
        this.f3360g = str;
        this.f3361r = closeable;
    }

    @Override // c8.d0
    public final synchronized cv.w b() {
        if (this.f3362x) {
            throw new IllegalStateException("closed");
        }
        return this.f3358a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f3362x = true;
            cv.z zVar = this.f3363y;
            if (zVar != null) {
                q8.i.a(zVar);
            }
            Closeable closeable = this.f3361r;
            if (closeable != null) {
                q8.i.a(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // c8.d0
    public final cv.w f() {
        return b();
    }

    @Override // c8.d0
    public final b4 h() {
        return null;
    }

    @Override // c8.d0
    public final synchronized cv.i i() {
        if (this.f3362x) {
            throw new IllegalStateException("closed");
        }
        cv.z zVar = this.f3363y;
        if (zVar != null) {
            return zVar;
        }
        cv.z zVarE = a.a.e(this.f3359d.l(this.f3358a));
        this.f3363y = zVarE;
        return zVarE;
    }
}
