package c8;

import com.google.android.gms.internal.measurement.b4;
import java.io.File;

/* loaded from: classes.dex */
public final class g0 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final b4 f3340a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3341d;

    /* renamed from: g, reason: collision with root package name */
    public cv.i f3342g;

    /* renamed from: r, reason: collision with root package name */
    public ar.a f3343r;

    /* renamed from: x, reason: collision with root package name */
    public cv.w f3344x;

    public g0(cv.i iVar, ar.a aVar, b4 b4Var) {
        this.f3340a = b4Var;
        this.f3342g = iVar;
        this.f3343r = aVar;
    }

    @Override // c8.d0
    public final synchronized cv.w b() {
        Throwable th2;
        if (this.f3341d) {
            throw new IllegalStateException("closed");
        }
        cv.w wVar = this.f3344x;
        if (wVar != null) {
            return wVar;
        }
        ar.a aVar = this.f3343r;
        br.l.b(aVar);
        File file = (File) aVar.c();
        if (!file.isDirectory()) {
            throw new IllegalStateException("cacheDirectory must be a directory.");
        }
        String str = cv.w.f6742d;
        cv.w wVarR = cg.e.r(File.createTempFile("tmp", null, file));
        cv.y yVarD = a.a.d(cv.l.f6722a.k(wVarR));
        try {
            cv.i iVar = this.f3342g;
            br.l.b(iVar);
            while (iVar.u(yVarD.f6751d, 8192L) != -1) {
                yVarD.b();
            }
            try {
                yVarD.close();
                th2 = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            try {
                yVarD.close();
            } catch (Throwable th5) {
                ir.f0.c(th4, th5);
            }
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        this.f3342g = null;
        this.f3344x = wVarR;
        this.f3343r = null;
        return wVarR;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f3341d = true;
            cv.i iVar = this.f3342g;
            if (iVar != null) {
                q8.i.a(iVar);
            }
            cv.w wVar = this.f3344x;
            if (wVar != null) {
                cv.s sVar = cv.l.f6722a;
                sVar.getClass();
                sVar.d(wVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // c8.d0
    public final synchronized cv.w f() {
        if (this.f3341d) {
            throw new IllegalStateException("closed");
        }
        return this.f3344x;
    }

    @Override // c8.d0
    public final b4 h() {
        return this.f3340a;
    }

    @Override // c8.d0
    public final synchronized cv.i i() {
        if (this.f3341d) {
            throw new IllegalStateException("closed");
        }
        cv.i iVar = this.f3342g;
        if (iVar != null) {
            return iVar;
        }
        cv.s sVar = cv.l.f6722a;
        cv.w wVar = this.f3344x;
        br.l.b(wVar);
        cv.z zVarE = a.a.e(sVar.l(wVar));
        this.f3342g = zVarE;
        return zVarE;
    }
}
