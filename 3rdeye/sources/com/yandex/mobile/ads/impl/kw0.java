package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.jw0;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public interface kw0 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f29797a;

        /* renamed from: b, reason: collision with root package name */
        public final jw0.b f29798b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0411a> f29799c;

        /* renamed from: d, reason: collision with root package name */
        private final long f29800d;

        /* renamed from: com.yandex.mobile.ads.impl.kw0$a$a, reason: collision with other inner class name */
        public static final class C0411a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f29801a;

            /* renamed from: b, reason: collision with root package name */
            public kw0 f29802b;

            public C0411a(Handler handler, kw0 kw0Var) {
                this.f29801a = handler;
                this.f29802b = kw0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i, jw0.b bVar) {
            this.f29799c = copyOnWriteArrayList;
            this.f29797a = i;
            this.f29798b = bVar;
            this.f29800d = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(kw0 kw0Var, rr0 rr0Var, zv0 zv0Var) {
            kw0Var.b(this.f29797a, this.f29798b, rr0Var, zv0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(kw0 kw0Var, rr0 rr0Var, zv0 zv0Var) {
            kw0Var.c(this.f29797a, this.f29798b, rr0Var, zv0Var);
        }

        public final void a(Handler handler, kw0 kw0Var) {
            kw0Var.getClass();
            this.f29799c.add(new C0411a(handler, kw0Var));
        }

        public final void b(rr0 rr0Var, zv0 zv0Var) {
            Iterator<C0411a> it = this.f29799c.iterator();
            while (it.hasNext()) {
                C0411a next = it.next();
                s82.a(next.f29801a, (Runnable) new D3.a(this, next.f29802b, rr0Var, zv0Var, 7));
            }
        }

        public final void c(rr0 rr0Var, zv0 zv0Var) {
            Iterator<C0411a> it = this.f29799c.iterator();
            while (it.hasNext()) {
                C0411a next = it.next();
                s82.a(next.f29801a, (Runnable) new O.e(this, next.f29802b, rr0Var, zv0Var, 3));
            }
        }

        private long a(long j4) {
            long jB = s82.b(j4);
            if (jB == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f29800d + jB;
        }

        public final void a(int i, dc0 dc0Var, long j4) {
            a(new zv0(1, i, dc0Var, 0, null, a(j4), -9223372036854775807L));
        }

        public final void b(rr0 rr0Var, dc0 dc0Var, long j4, long j10) {
            c(rr0Var, new zv0(1, -1, dc0Var, 0, null, a(j4), a(j10)));
        }

        public final void a(zv0 zv0Var) {
            Iterator<C0411a> it = this.f29799c.iterator();
            while (it.hasNext()) {
                C0411a next = it.next();
                s82.a(next.f29801a, (Runnable) new Z.e(this, next.f29802b, zv0Var, 10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(kw0 kw0Var, zv0 zv0Var) {
            kw0Var.a(this.f29797a, this.f29798b, zv0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(kw0 kw0Var, rr0 rr0Var, zv0 zv0Var) {
            kw0Var.a(this.f29797a, this.f29798b, rr0Var, zv0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(kw0 kw0Var, rr0 rr0Var, zv0 zv0Var, IOException iOException, boolean z10) {
            kw0Var.a(this.f29797a, this.f29798b, rr0Var, zv0Var, iOException, z10);
        }

        public final void a(rr0 rr0Var, long j4, long j10) {
            a(rr0Var, new zv0(1, -1, null, 0, null, a(j4), a(j10)));
        }

        public final void a(rr0 rr0Var, zv0 zv0Var) {
            Iterator<C0411a> it = this.f29799c.iterator();
            while (it.hasNext()) {
                C0411a next = it.next();
                s82.a(next.f29801a, (Runnable) new T1.p(this, next.f29802b, rr0Var, zv0Var, 7));
            }
        }

        public final void a(rr0 rr0Var, dc0 dc0Var, long j4, long j10) {
            b(rr0Var, new zv0(1, -1, dc0Var, 0, null, a(j4), a(j10)));
        }

        public final void a(rr0 rr0Var, int i, dc0 dc0Var, long j4, long j10, IOException iOException, boolean z10) {
            a(rr0Var, new zv0(i, -1, dc0Var, 0, null, a(j4), a(j10)), iOException, z10);
        }

        public final void a(final rr0 rr0Var, final zv0 zv0Var, final IOException iOException, final boolean z10) {
            Iterator<C0411a> it = this.f29799c.iterator();
            while (it.hasNext()) {
                C0411a next = it.next();
                final kw0 kw0Var = next.f29802b;
                s82.a(next.f29801a, new Runnable() { // from class: com.yandex.mobile.ads.impl.G1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24116b.a(kw0Var, rr0Var, zv0Var, iOException, z10);
                    }
                });
            }
        }

        public final void a(kw0 kw0Var) {
            Iterator<C0411a> it = this.f29799c.iterator();
            while (it.hasNext()) {
                C0411a next = it.next();
                if (next.f29802b == kw0Var) {
                    this.f29799c.remove(next);
                }
            }
        }

        public final a a(int i, jw0.b bVar) {
            return new a(this.f29799c, i, bVar);
        }
    }

    void a(int i, jw0.b bVar, rr0 rr0Var, zv0 zv0Var);

    void a(int i, jw0.b bVar, rr0 rr0Var, zv0 zv0Var, IOException iOException, boolean z10);

    void a(int i, jw0.b bVar, zv0 zv0Var);

    void b(int i, jw0.b bVar, rr0 rr0Var, zv0 zv0Var);

    void c(int i, jw0.b bVar, rr0 rr0Var, zv0 zv0Var);
}
