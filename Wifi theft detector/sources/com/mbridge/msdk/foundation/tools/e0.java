package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class e0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private Runnable f15421a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f15422b;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f15423a;

        public a(Runnable runnable) {
            this.f15423a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f15423a.run();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("LimitExecutor", e10.getMessage());
                }
            } finally {
                e0.this.a();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        try {
            if (this.f15421a == null) {
                this.f15421a = a(runnable);
                c0.a().execute(this.f15421a);
            } else if (this.f15422b == null) {
                this.f15422b = a(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private Runnable a(Runnable runnable) {
        return new a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.f15422b;
        this.f15421a = runnable;
        this.f15422b = null;
        if (runnable != null) {
            c0.a().execute(this.f15421a);
        }
    }
}
