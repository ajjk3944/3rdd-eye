package com.yandex.mobile.ads.impl;

import C.RunnableC0615b;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* loaded from: classes3.dex */
public interface if2 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f28656a;

        /* renamed from: b, reason: collision with root package name */
        private final if2 f28657b;

        public a(Handler handler, if2 if2Var) {
            this.f28656a = (Handler) zf.a(handler);
            this.f28657b = if2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(ky kyVar) {
            synchronized (kyVar) {
            }
            if2 if2Var = this.f28657b;
            int i = s82.f32899a;
            if2Var.c(kyVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(ky kyVar) {
            if2 if2Var = this.f28657b;
            int i = s82.f32899a;
            if2Var.d(kyVar);
        }

        public final void a(String str, long j4, long j10) {
            Handler handler = this.f28656a;
            if (handler != null) {
                handler.post(new Y0(this, str, j4, j10, 0));
            }
        }

        public final void b(ky kyVar) {
            Handler handler = this.f28656a;
            if (handler != null) {
                handler.post(new RunnableC0615b(25, this, kyVar));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, long j4, long j10) {
            if2 if2Var = this.f28657b;
            int i = s82.f32899a;
            if2Var.a(str, j4, j10);
        }

        public final void a(String str) {
            Handler handler = this.f28656a;
            if (handler != null) {
                handler.post(new L(6, this, str));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
            if2 if2Var = this.f28657b;
            int i = s82.f32899a;
            if2Var.a(str);
        }

        public final void a(ky kyVar) {
            synchronized (kyVar) {
            }
            Handler handler = this.f28656a;
            if (handler != null) {
                handler.post(new L4(10, this, kyVar));
            }
        }

        public final void c(final int i, final long j4) {
            Handler handler = this.f28656a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.X0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a(j4, i);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i, long j4) {
            if2 if2Var = this.f28657b;
            int i10 = s82.f32899a;
            if2Var.b(i, j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(dc0 dc0Var, oy oyVar) {
            if2 if2Var = this.f28657b;
            int i = s82.f32899a;
            if2Var.getClass();
            this.f28657b.b(dc0Var, oyVar);
        }

        public final void a(final int i, final long j4) {
            Handler handler = this.f28656a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.b(i, j4);
                    }
                });
            }
        }

        public final void a(dc0 dc0Var, oy oyVar) {
            Handler handler = this.f28656a;
            if (handler != null) {
                handler.post(new J4.e(this, dc0Var, oyVar, 15));
            }
        }

        public final void b(Exception exc) {
            Handler handler = this.f28656a;
            if (handler != null) {
                handler.post(new V1(6, this, exc));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Object obj, long j4) {
            if2 if2Var = this.f28657b;
            int i = s82.f32899a;
            if2Var.a(obj, j4);
        }

        public final void b(pf2 pf2Var) {
            Handler handler = this.f28656a;
            if (handler != null) {
                handler.post(new L4(9, this, pf2Var));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j4, int i) {
            if2 if2Var = this.f28657b;
            int i10 = s82.f32899a;
            if2Var.a(i, j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Exception exc) {
            if2 if2Var = this.f28657b;
            int i = s82.f32899a;
            if2Var.c(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(pf2 pf2Var) {
            if2 if2Var = this.f28657b;
            int i = s82.f32899a;
            if2Var.a(pf2Var);
        }

        public final void a(Surface surface) {
            if (this.f28656a != null) {
                this.f28656a.post(new com.applovin.impl.V0(this, surface, SystemClock.elapsedRealtime(), 1));
            }
        }
    }

    void a(int i, long j4);

    void a(pf2 pf2Var);

    void a(Object obj, long j4);

    void a(String str);

    void a(String str, long j4, long j10);

    void b(int i, long j4);

    void b(dc0 dc0Var, oy oyVar);

    void c(ky kyVar);

    void c(Exception exc);

    void d(ky kyVar);
}
