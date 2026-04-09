package P2;

import J2.a;
import L2.h;
import P2.b;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: c, reason: collision with root package name */
    public final File f10567c;

    /* renamed from: f, reason: collision with root package name */
    public J2.a f10570f;

    /* renamed from: e, reason: collision with root package name */
    public final b f10569e = new b();

    /* renamed from: d, reason: collision with root package name */
    public final long f10568d = 262144000;

    /* renamed from: b, reason: collision with root package name */
    public final g f10566b = new g();

    @Deprecated
    public c(File file) {
        this.f10567c = file;
    }

    public final synchronized J2.a a() throws IOException {
        try {
            if (this.f10570f == null) {
                this.f10570f = J2.a.A(this.f10567c, this.f10568d);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10570f;
    }

    @Override // P2.a
    public final void f(L2.f fVar, N2.g gVar) {
        b.a aVarA;
        J2.a aVarA2;
        boolean z10;
        String strB = this.f10566b.b(fVar);
        b bVar = this.f10569e;
        synchronized (bVar) {
            try {
                aVarA = (b.a) bVar.f10561a.get(strB);
                if (aVarA == null) {
                    aVarA = bVar.f10562b.a();
                    bVar.f10561a.put(strB, aVarA);
                }
                aVarA.f10564b++;
            } finally {
            }
        }
        aVarA.f10563a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strB + " for for Key: " + fVar);
            }
            try {
                aVarA2 = a();
            } catch (IOException e4) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e4);
                }
            }
            if (aVarA2.l(strB) != null) {
                return;
            }
            a.c cVarE = aVarA2.e(strB);
            if (cVarE == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(strB));
            }
            try {
                if (((L2.d) gVar.f4484b).f(gVar.f4485c, cVarE.b(), (h) gVar.f4486d)) {
                    J2.a.a(J2.a.this, cVarE, true);
                    cVarE.f2734c = true;
                }
                if (!z10) {
                    try {
                        cVarE.a();
                    } catch (IOException unused) {
                    }
                }
            } finally {
                if (!cVarE.f2734c) {
                    try {
                        cVarE.a();
                    } catch (IOException unused2) {
                    }
                }
            }
        } finally {
            this.f10569e.a(strB);
        }
    }

    @Override // P2.a
    public final File h(L2.f fVar) {
        String strB = this.f10566b.b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strB + " for for Key: " + fVar);
        }
        try {
            a.e eVarL = a().l(strB);
            if (eVarL != null) {
                return eVarL.f2743a[0];
            }
            return null;
        } catch (IOException e4) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e4);
            return null;
        }
    }
}
