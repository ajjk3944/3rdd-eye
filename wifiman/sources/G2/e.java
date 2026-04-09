package G2;

import A2.a;
import G2.a;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: b, reason: collision with root package name */
    private final File f6831b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6832c;

    /* renamed from: e, reason: collision with root package name */
    private A2.a f6834e;

    /* renamed from: d, reason: collision with root package name */
    private final c f6833d = new c();

    /* renamed from: a, reason: collision with root package name */
    private final j f6830a = new j();

    protected e(File file, long j10) {
        this.f6831b = file;
        this.f6832c = j10;
    }

    public static a c(File file, long j10) {
        return new e(file, j10);
    }

    private synchronized A2.a d() {
        try {
            if (this.f6834e == null) {
                this.f6834e = A2.a.n0(this.f6831b, 1, 1, this.f6832c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f6834e;
    }

    @Override // G2.a
    public void a(C2.e eVar, a.b bVar) {
        A2.a aVarD;
        String strB = this.f6830a.b(eVar);
        this.f6833d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strB + " for for Key: " + eVar);
            }
            try {
                aVarD = d();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            if (aVarD.f0(strB) != null) {
                return;
            }
            a.c cVarY = aVarD.Y(strB);
            if (cVarY == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + strB);
            }
            try {
                if (bVar.a(cVarY.f(0))) {
                    cVarY.e();
                }
                cVarY.b();
            } catch (Throwable th2) {
                cVarY.b();
                throw th2;
            }
        } finally {
            this.f6833d.b(strB);
        }
    }

    @Override // G2.a
    public File b(C2.e eVar) {
        String strB = this.f6830a.b(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strB + " for for Key: " + eVar);
        }
        try {
            a.e eVarF0 = d().f0(strB);
            if (eVarF0 != null) {
                return eVarF0.a(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }
}
