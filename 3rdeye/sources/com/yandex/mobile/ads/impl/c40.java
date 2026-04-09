package com.yandex.mobile.ads.impl;

import C.RunnableC0615b;
import android.os.Handler;
import com.yandex.mobile.ads.impl.jw0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public interface c40 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f25523a;

        /* renamed from: b, reason: collision with root package name */
        public final jw0.b f25524b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0401a> f25525c;

        /* renamed from: com.yandex.mobile.ads.impl.c40$a$a, reason: collision with other inner class name */
        public static final class C0401a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f25526a;

            /* renamed from: b, reason: collision with root package name */
            public c40 f25527b;

            public C0401a(Handler handler, c40 c40Var) {
                this.f25526a = handler;
                this.f25527b = c40Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList<C0401a> copyOnWriteArrayList, int i, jw0.b bVar) {
            this.f25525c = copyOnWriteArrayList;
            this.f25523a = i;
            this.f25524b = bVar;
        }

        public final void a(Handler handler, c40 c40Var) {
            c40Var.getClass();
            this.f25525c.add(new C0401a(handler, c40Var));
        }

        public final void b() {
            Iterator<C0401a> it = this.f25525c.iterator();
            while (it.hasNext()) {
                C0401a next = it.next();
                s82.a(next.f25526a, (Runnable) new L4(1, this, next.f25527b));
            }
        }

        public final void c() {
            Iterator<C0401a> it = this.f25525c.iterator();
            while (it.hasNext()) {
                C0401a next = it.next();
                s82.a(next.f25526a, (Runnable) new V1(3, this, next.f25527b));
            }
        }

        public final void d() {
            Iterator<C0401a> it = this.f25525c.iterator();
            while (it.hasNext()) {
                C0401a next = it.next();
                s82.a(next.f25526a, (Runnable) new RunnableC0615b(21, this, next.f25527b));
            }
        }

        public final void e(c40 c40Var) {
            Iterator<C0401a> it = this.f25525c.iterator();
            while (it.hasNext()) {
                C0401a next = it.next();
                if (next.f25527b == c40Var) {
                    this.f25525c.remove(next);
                }
            }
        }

        public final void a() {
            Iterator<C0401a> it = this.f25525c.iterator();
            while (it.hasNext()) {
                C0401a next = it.next();
                s82.a(next.f25526a, (Runnable) new L(0, this, next.f25527b));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(c40 c40Var) {
            c40Var.d(this.f25523a, this.f25524b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(c40 c40Var) {
            c40Var.a(this.f25523a, this.f25524b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(c40 c40Var) {
            c40Var.b(this.f25523a, this.f25524b);
        }

        public final void a(final int i) {
            Iterator<C0401a> it = this.f25525c.iterator();
            while (it.hasNext()) {
                C0401a next = it.next();
                final c40 c40Var = next.f25527b;
                s82.a(next.f25526a, new Runnable() { // from class: com.yandex.mobile.ads.impl.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24161b.a(c40Var, i);
                    }
                });
            }
        }

        public final void a(Exception exc) {
            Iterator<C0401a> it = this.f25525c.iterator();
            while (it.hasNext()) {
                C0401a next = it.next();
                s82.a(next.f25526a, (Runnable) new Z.e(this, next.f25527b, exc, 9));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c40 c40Var) {
            c40Var.c(this.f25523a, this.f25524b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c40 c40Var, int i) {
            c40Var.getClass();
            c40Var.a(this.f25523a, this.f25524b, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c40 c40Var, Exception exc) {
            c40Var.a(this.f25523a, this.f25524b, exc);
        }

        public final a a(int i, jw0.b bVar) {
            return new a(this.f25525c, i, bVar);
        }
    }

    void a(int i, jw0.b bVar);

    void a(int i, jw0.b bVar, int i10);

    void a(int i, jw0.b bVar, Exception exc);

    void b(int i, jw0.b bVar);

    void c(int i, jw0.b bVar);

    void d(int i, jw0.b bVar);
}
