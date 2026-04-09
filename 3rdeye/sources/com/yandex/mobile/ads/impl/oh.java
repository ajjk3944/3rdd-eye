package com.yandex.mobile.ads.impl;

import android.os.Handler;

/* loaded from: classes3.dex */
public interface oh {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f31365a;

        /* renamed from: b, reason: collision with root package name */
        private final oh f31366b;

        public a(Handler handler, oh ohVar) {
            this.f31365a = (Handler) zf.a(handler);
            this.f31366b = ohVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Exception exc) {
            oh ohVar = this.f31366b;
            int i = s82.f32899a;
            ohVar.b(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Exception exc) {
            oh ohVar = this.f31366b;
            int i = s82.f32899a;
            ohVar.a(exc);
        }

        public final void a(Exception exc) {
            Handler handler = this.f31365a;
            if (handler != null) {
                handler.post(new L4(16, this, exc));
            }
        }

        public final void b(Exception exc) {
            Handler handler = this.f31365a;
            if (handler != null) {
                handler.post(new A3(0, this, exc));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(ky kyVar) {
            synchronized (kyVar) {
            }
            oh ohVar = this.f31366b;
            int i = s82.f32899a;
            ohVar.a(kyVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(ky kyVar) {
            oh ohVar = this.f31366b;
            int i = s82.f32899a;
            ohVar.b(kyVar);
        }

        public final void a(String str, long j4, long j10) {
            Handler handler = this.f31365a;
            if (handler != null) {
                handler.post(new Y0(this, str, j4, j10, 1));
            }
        }

        public final void b(ky kyVar) {
            Handler handler = this.f31365a;
            if (handler != null) {
                handler.post(new V1(12, this, kyVar));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, long j4, long j10) {
            oh ohVar = this.f31366b;
            int i = s82.f32899a;
            ohVar.b(str, j4, j10);
        }

        public final void a(String str) {
            Handler handler = this.f31365a;
            if (handler != null) {
                handler.post(new L(11, this, str));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
            oh ohVar = this.f31366b;
            int i = s82.f32899a;
            ohVar.b(str);
        }

        public final void a(ky kyVar) {
            synchronized (kyVar) {
            }
            Handler handler = this.f31365a;
            if (handler != null) {
                handler.post(new L(10, this, kyVar));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(dc0 dc0Var, oy oyVar) {
            oh ohVar = this.f31366b;
            int i = s82.f32899a;
            ohVar.getClass();
            this.f31366b.a(dc0Var, oyVar);
        }

        public final void a(dc0 dc0Var, oy oyVar) {
            Handler handler = this.f31365a;
            if (handler != null) {
                handler.post(new J4.e(this, dc0Var, oyVar, 16));
            }
        }

        public final void b(long j4) {
            Handler handler = this.f31365a;
            if (handler != null) {
                handler.post(new Y2(this, j4, 0));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j4) {
            oh ohVar = this.f31366b;
            int i = s82.f32899a;
            ohVar.a(j4);
        }

        public final void b(boolean z10) {
            Handler handler = this.f31365a;
            if (handler != null) {
                handler.post(new Z.b(this, z10, 2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z10) {
            oh ohVar = this.f31366b;
            int i = s82.f32899a;
            ohVar.onSkipSilenceEnabledChanged(z10);
        }

        public final void b(final int i, final long j4, final long j10) {
            Handler handler = this.f31365a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Z2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24340b.a(i, j4, j10);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, long j4, long j10) {
            oh ohVar = this.f31366b;
            int i10 = s82.f32899a;
            ohVar.a(i, j4, j10);
        }
    }

    void a(int i, long j4, long j10);

    void a(long j4);

    void a(dc0 dc0Var, oy oyVar);

    void a(ky kyVar);

    void a(Exception exc);

    void b(ky kyVar);

    void b(Exception exc);

    void b(String str);

    void b(String str, long j4, long j10);

    void onSkipSilenceEnabledChanged(boolean z10);
}
