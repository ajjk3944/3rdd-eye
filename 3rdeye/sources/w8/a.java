package W8;

import B.d;
import D8.g;
import P8.b;
import T1.B;
import V8.a;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ConsumerSingleObserver.java */
/* loaded from: classes3.dex */
public final class a<T> extends AtomicReference<R8.a> implements b<T>, R8.a {

    /* renamed from: b, reason: collision with root package name */
    public final d f13358b;

    /* renamed from: c, reason: collision with root package name */
    public final a.C0186a f13359c;

    public a(d dVar) {
        a.C0186a c0186a = V8.a.f13050a;
        this.f13358b = dVar;
        this.f13359c = c0186a;
    }

    @Override // P8.b
    public final void a(R8.a aVar) {
        U8.b.setOnce(this, aVar);
    }

    @Override // R8.a
    public final void dispose() {
        U8.b.dispose(this);
    }

    @Override // P8.b
    public final void onError(Throwable th) {
        lazySet(U8.b.DISPOSED);
        try {
            this.f13359c.getClass();
            Z8.a.a(new S8.b("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th, th != null ? th : new NullPointerException()));
        } catch (Throwable th2) {
            B.A(th2);
            Z8.a.a(new S8.a(th, th2));
        }
    }

    @Override // P8.b
    public final void onSuccess(T t10) {
        lazySet(U8.b.DISPOSED);
        try {
            ((g) this.f13358b.f312c).invoke(t10);
        } catch (Throwable th) {
            B.A(th);
            Z8.a.a(th);
        }
    }
}
