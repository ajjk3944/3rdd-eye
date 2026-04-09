package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import m4.AbstractC6765d;
import m4.AbstractC6769h;

/* loaded from: classes3.dex */
public abstract class b extends c {

    private static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Future f38421a;

        /* renamed from: b, reason: collision with root package name */
        final com.google.common.util.concurrent.a f38422b;

        a(Future future, com.google.common.util.concurrent.a aVar) {
            this.f38421a = future;
            this.f38422b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f38422b.onSuccess(b.b(this.f38421a));
            } catch (Error e10) {
                e = e10;
                this.f38422b.a(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f38422b.a(e);
            } catch (ExecutionException e12) {
                this.f38422b.a(e12.getCause());
            }
        }

        public String toString() {
            return AbstractC6765d.a(this).c(this.f38422b).toString();
        }
    }

    public static void a(d dVar, com.google.common.util.concurrent.a aVar, Executor executor) {
        AbstractC6769h.i(aVar);
        dVar.a(new a(dVar, aVar), executor);
    }

    public static Object b(Future future) {
        AbstractC6769h.p(future.isDone(), "Future was expected to be done: %s", future);
        return e.a(future);
    }
}
