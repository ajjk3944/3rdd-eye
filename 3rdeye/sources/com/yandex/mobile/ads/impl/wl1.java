package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qm;
import com.yandex.mobile.ads.impl.sv;
import com.yandex.mobile.ads.impl.t30;
import com.yandex.mobile.ads.impl.w30;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class wl1 implements w30 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f35007a;

    /* renamed from: b, reason: collision with root package name */
    private final sv f35008b;

    /* renamed from: c, reason: collision with root package name */
    private final qm f35009c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f35010d;

    /* renamed from: e, reason: collision with root package name */
    private w30.a f35011e;

    /* renamed from: f, reason: collision with root package name */
    private volatile us1<Void, IOException> f35012f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f35013g;

    public class a extends us1<Void, IOException> {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.us1
        public final void b() {
            wl1.this.f35010d.b();
        }

        @Override // com.yandex.mobile.ads.impl.us1
        public final void c() throws Exception {
            wl1.this.f35010d.a();
        }
    }

    public wl1(xv0 xv0Var, qm.a aVar, Executor executor) {
        this.f35007a = (Executor) zf.a(executor);
        zf.a(xv0Var.f35439c);
        sv svVarA = new sv.a().a(xv0Var.f35439c.f35486a).a(xv0Var.f35439c.f35490e).a(4).a();
        this.f35008b = svVarA;
        qm qmVarB = aVar.b();
        this.f35009c = qmVarB;
        this.f35010d = new bn(qmVarB, svVarA, new X1(this, 6));
    }

    @Override // com.yandex.mobile.ads.impl.w30
    public final void cancel() {
        this.f35013g = true;
        us1<Void, IOException> us1Var = this.f35012f;
        if (us1Var != null) {
            us1Var.cancel(true);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w30
    public final void remove() {
        this.f35009c.f().a(this.f35009c.g().a(this.f35008b));
    }

    @Override // com.yandex.mobile.ads.impl.w30
    public final void a(w30.a aVar) throws InterruptedException, IOException {
        this.f35011e = aVar;
        this.f35012f = new a();
        boolean z10 = false;
        while (!z10) {
            try {
                if (this.f35013g) {
                    break;
                }
                this.f35007a.execute(this.f35012f);
                try {
                    this.f35012f.get();
                    z10 = true;
                } catch (ExecutionException e4) {
                    Throwable cause = e4.getCause();
                    cause.getClass();
                    if (!(cause instanceof xk1)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i = s82.f32899a;
                        throw cause;
                    }
                }
            } finally {
                this.f35012f.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j4, long j10, long j11) {
        w30.a aVar = this.f35011e;
        if (aVar == null) {
            return;
        }
        ((t30.d) aVar).a(j4, j10, (j4 == -1 || j4 == 0) ? -1.0f : (j10 * 100.0f) / j4);
    }
}
