package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class f implements w {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18296a;

    public class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f18297a;

        public a(Handler handler) {
            this.f18297a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f18297a.post(runnable);
        }
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final t f18299a;

        /* renamed from: b, reason: collision with root package name */
        private final v f18300b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f18301c;

        public b(t tVar, v vVar, Runnable runnable) {
            this.f18299a = tVar;
            this.f18300b = vVar;
            this.f18301c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f18299a.v()) {
                this.f18299a.c("canceled-at-delivery");
                return;
            }
            if (this.f18300b.a()) {
                this.f18299a.a((t) this.f18300b.f18417a);
            } else {
                this.f18299a.b(this.f18300b.f18419c);
            }
            if (this.f18300b.f18420d) {
                this.f18299a.a("intermediate-response");
            } else {
                this.f18299a.c("done");
            }
            Runnable runnable = this.f18301c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f18296a = new a(handler);
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, v<?> vVar) {
        a(tVar, vVar, null);
    }

    public void a(t<?> tVar, v<?> vVar, Runnable runnable) {
        tVar.w();
        tVar.a("post-response");
        this.f18296a.execute(new b(tVar, vVar, runnable));
    }

    public f(Executor executor) {
        this.f18296a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, b0 b0Var) {
        tVar.a("post-error");
        this.f18296a.execute(new b(tVar, v.a(b0Var), null));
    }
}
