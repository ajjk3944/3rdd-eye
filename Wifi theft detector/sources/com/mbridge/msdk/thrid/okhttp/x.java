package com.mbridge.msdk.thrid.okhttp;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class x implements d {

    /* renamed from: a, reason: collision with root package name */
    final v f18118a;

    /* renamed from: b, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.http.j f18119b;

    /* renamed from: c, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okio.a f18120c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private o f18121d;

    /* renamed from: e, reason: collision with root package name */
    final y f18122e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f18123f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18124g;

    public class a extends com.mbridge.msdk.thrid.okio.a {
        public a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() throws IOException {
            x.this.cancel();
        }
    }

    public final class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ boolean f18126d = true;

        /* renamed from: b, reason: collision with root package name */
        private final e f18127b;

        public b(e eVar) {
            super("OkHttp %s", x.this.e());
            this.f18127b = eVar;
        }

        public void a(ExecutorService executorService) {
            if (!f18126d && Thread.holdsLock(x.this.f18118a.j())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    x.this.f18121d.callFailed(x.this, interruptedIOException);
                    this.f18127b.a(x.this, interruptedIOException);
                    x.this.f18118a.j().b(this);
                }
            } catch (Throwable th) {
                x.this.f18118a.j().b(this);
                throw th;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            x.this.f18120c.h();
            boolean z10 = false;
            try {
                try {
                } catch (IOException e10) {
                    e = e10;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    this.f18127b.a(x.this, x.this.c());
                    x.this.f18118a.j().b(this);
                } catch (IOException e11) {
                    e = e11;
                    z10 = true;
                    IOException iOExceptionA = x.this.a(e);
                    if (z10) {
                        com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Callback failure for " + x.this.f(), iOExceptionA);
                    } else {
                        x.this.f18121d.callFailed(x.this, iOExceptionA);
                        this.f18127b.a(x.this, iOExceptionA);
                    }
                    x.this.f18118a.j().b(this);
                } catch (Throwable th2) {
                    th = th2;
                    z10 = true;
                    x.this.cancel();
                    if (!z10) {
                        this.f18127b.a(x.this, new IOException("canceled due to " + th));
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                x.this.f18118a.j().b(this);
                throw th3;
            }
        }

        public x c() {
            return x.this;
        }

        public String d() {
            return x.this.f18122e.g().g();
        }
    }

    private x(v vVar, y yVar, boolean z10) {
        this.f18118a = vVar;
        this.f18122e = yVar;
        this.f18123f = z10;
        this.f18119b = new com.mbridge.msdk.thrid.okhttp.internal.http.j(vVar, z10);
        a aVar = new a();
        this.f18120c = aVar;
        aVar.a(vVar.b(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x clone() {
        return a(this.f18118a, this.f18122e, this.f18123f);
    }

    public a0 c() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f18118a.p());
        arrayList.add(this.f18119b);
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.a(this.f18118a.i()));
        this.f18118a.q();
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.cache.a(null));
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.connection.a(this.f18118a));
        if (!this.f18123f) {
            arrayList.addAll(this.f18118a.r());
        }
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.b(this.f18123f));
        a0 a0VarA = new com.mbridge.msdk.thrid.okhttp.internal.http.g(arrayList, null, null, null, 0, this.f18122e, this, this.f18121d, this.f18118a.e(), this.f18118a.y(), this.f18118a.C()).a(this.f18122e);
        if (!this.f18119b.b()) {
            return a0VarA;
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(a0VarA);
        throw new IOException("Canceled");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void cancel() throws IOException {
        this.f18119b.a();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public a0 d() throws IOException {
        synchronized (this) {
            if (this.f18124g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f18124g = true;
        }
        a();
        this.f18120c.h();
        this.f18121d.callStart(this);
        try {
            try {
                this.f18118a.j().a(this);
                a0 a0VarC = c();
                if (a0VarC != null) {
                    return a0VarC;
                }
                throw new IOException("Canceled");
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                this.f18121d.callFailed(this, iOExceptionA);
                throw iOExceptionA;
            }
        } finally {
            this.f18118a.j().b(this);
        }
    }

    public String e() {
        return this.f18122e.g().l();
    }

    public String f() {
        StringBuilder sb = new StringBuilder();
        sb.append(h() ? "canceled " : "");
        sb.append(this.f18123f ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(e());
        return sb.toString();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public boolean h() {
        return this.f18119b.b();
    }

    public static x a(v vVar, y yVar, boolean z10) {
        x xVar = new x(vVar, yVar, z10);
        xVar.f18121d = vVar.l().a(xVar);
        return xVar;
    }

    @Nullable
    public IOException a(@Nullable IOException iOException) {
        if (!this.f18120c.i()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private void a() {
        this.f18119b.a(com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("response.body().close()"));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void a(e eVar) {
        synchronized (this) {
            if (!this.f18124g) {
                this.f18124g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        a();
        this.f18121d.callStart(this);
        this.f18118a.j().a(new b(eVar));
    }
}
