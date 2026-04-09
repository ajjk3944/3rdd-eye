package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class c60 implements zq1 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f25543a;

    public class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f25544a;

        public a(Handler handler) {
            this.f25544a = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f25544a.post(runnable);
        }
    }

    public static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final op1 f25545b;

        /* renamed from: c, reason: collision with root package name */
        private final rq1 f25546c;

        /* renamed from: d, reason: collision with root package name */
        private final Runnable f25547d;

        public b(op1 op1Var, rq1 rq1Var, Runnable runnable) {
            this.f25545b = op1Var;
            this.f25546c = rq1Var;
            this.f25547d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f25545b.n()) {
                this.f25545b.c("canceled-at-delivery");
                return;
            }
            rq1 rq1Var = this.f25546c;
            fi2 fi2Var = rq1Var.f32765c;
            if (fi2Var == null) {
                this.f25545b.a((op1) rq1Var.f32763a);
            } else {
                this.f25545b.a(fi2Var);
            }
            if (this.f25546c.f32766d) {
                this.f25545b.a("intermediate-response");
            } else {
                this.f25545b.c("done");
            }
            Runnable runnable = this.f25547d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public c60(Handler handler) {
        this.f25543a = new a(handler);
    }

    public final void a(op1<?> op1Var, fi2 fi2Var) {
        op1Var.a("post-error");
        rq1 rq1VarA = rq1.a(fi2Var);
        Executor executor = this.f25543a;
        ((a) executor).f25544a.post(new b(op1Var, rq1VarA, null));
    }

    public final void a(op1<?> op1Var, rq1<?> rq1Var, Runnable runnable) {
        op1Var.o();
        op1Var.a("post-response");
        Executor executor = this.f25543a;
        ((a) executor).f25544a.post(new b(op1Var, rq1Var, runnable));
    }
}
