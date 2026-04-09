package I;

import E.u;
import I.m;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import o0.b;
import r.InterfaceC5503a;

/* compiled from: Futures.java */
/* loaded from: classes.dex */
public final class j {

    /* compiled from: Futures.java */
    public static final class b<V> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final A4.a f2361b;

        /* renamed from: c, reason: collision with root package name */
        public final c<? super V> f2362c;

        public b(A4.a aVar, c cVar) {
            this.f2361b = aVar;
            this.f2362c = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c<? super V> cVar = this.f2362c;
            try {
                cVar.onSuccess((Object) j.c(this.f2361b));
            } catch (Error e4) {
                e = e4;
                cVar.onFailure(e);
            } catch (RuntimeException e10) {
                e = e10;
                cVar.onFailure(e);
            } catch (ExecutionException e11) {
                Throwable cause = e11.getCause();
                if (cause == null) {
                    cVar.onFailure(e11);
                } else {
                    cVar.onFailure(cause);
                }
            }
        }

        public final String toString() {
            return b.class.getSimpleName() + StringUtils.COMMA + this.f2362c;
        }
    }

    public static <V> void a(A4.a<V> aVar, c<? super V> cVar, Executor executor) {
        cVar.getClass();
        aVar.addListener(new b(aVar, cVar), executor);
    }

    public static q b(List list) {
        return new q(new ArrayList(list), true, u.y());
    }

    public static Object c(A4.a aVar) throws ExecutionException {
        A2.l.q("Future was expected to be done, " + aVar, aVar.isDone());
        return d(aVar);
    }

    public static <V> V d(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public static m.c e(Object obj) {
        return obj == null ? m.c.f2366c : new m.c(obj);
    }

    public static <V> A4.a<V> f(A4.a<V> aVar) {
        aVar.getClass();
        return aVar.isDone() ? aVar : o0.b.a(new h(1, aVar));
    }

    public static <V> void g(A4.a<V> aVar, b.a<V> aVar2) {
        h(true, aVar, aVar2, u.y());
    }

    public static void h(boolean z10, A4.a aVar, b.a aVar2, H.b bVar) {
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        a(aVar, new k(aVar2), bVar);
        if (z10) {
            aVar2.a(new l(aVar), u.y());
        }
    }

    public static q i(ArrayList arrayList) {
        return new q(new ArrayList(arrayList), false, u.y());
    }

    public static I.b j(A4.a aVar, I.a aVar2, Executor executor) {
        I.b bVar = new I.b(aVar2, aVar);
        aVar.addListener(bVar, executor);
        return bVar;
    }

    /* compiled from: Futures.java */
    public class a implements InterfaceC5503a<Object, Object> {
        @Override // r.InterfaceC5503a
        public final Object apply(Object obj) {
            return obj;
        }
    }
}
