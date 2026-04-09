package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.pi;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public interface pi {
    ez a();

    void a(Handler handler, xc xcVar);

    void a(xc xcVar);

    public interface a {
        void b(int i, long j4, long j10);

        /* renamed from: com.yandex.mobile.ads.impl.pi$a$a, reason: collision with other inner class name */
        public static final class C0415a {

            /* renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C0416a> f31762a = new CopyOnWriteArrayList<>();

            /* renamed from: com.yandex.mobile.ads.impl.pi$a$a$a, reason: collision with other inner class name */
            public static final class C0416a {

                /* renamed from: a, reason: collision with root package name */
                private final Handler f31763a;

                /* renamed from: b, reason: collision with root package name */
                private final a f31764b;

                /* renamed from: c, reason: collision with root package name */
                private boolean f31765c;

                public C0416a(Handler handler, xc xcVar) {
                    this.f31763a = handler;
                    this.f31764b = xcVar;
                }
            }

            public final void a(Handler handler, xc xcVar) {
                xcVar.getClass();
                a(xcVar);
                this.f31762a.add(new C0416a(handler, xcVar));
            }

            public final void a(final int i, final long j4, final long j10) {
                Iterator<C0416a> it = this.f31762a.iterator();
                while (it.hasNext()) {
                    final C0416a next = it.next();
                    if (!next.f31765c) {
                        next.f31763a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.E3
                            @Override // java.lang.Runnable
                            public final void run() {
                                pi.a.C0415a.a(next, i, j4, j10);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void a(C0416a c0416a, int i, long j4, long j10) {
                c0416a.f31764b.b(i, j4, j10);
            }

            public final void a(xc xcVar) {
                Iterator<C0416a> it = this.f31762a.iterator();
                while (it.hasNext()) {
                    C0416a next = it.next();
                    if (next.f31764b == xcVar) {
                        next.f31765c = true;
                        this.f31762a.remove(next);
                    }
                }
            }
        }
    }
}
