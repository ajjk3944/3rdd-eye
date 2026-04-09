package X8;

import I9.g;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleObserveOn.java */
/* loaded from: classes3.dex */
public final class b<T> extends g {

    /* renamed from: b, reason: collision with root package name */
    public final X8.a f13662b;

    /* renamed from: c, reason: collision with root package name */
    public final Q8.b f13663c;

    /* compiled from: SingleObserveOn.java */
    public static final class a<T> extends AtomicReference<R8.a> implements P8.b<T>, R8.a, Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference f13664b;

        /* renamed from: c, reason: collision with root package name */
        public final Q8.b f13665c;

        /* renamed from: d, reason: collision with root package name */
        public T f13666d;

        /* renamed from: e, reason: collision with root package name */
        public Throwable f13667e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(P8.b bVar, Q8.b bVar2) {
            this.f13664b = (AtomicReference) bVar;
            this.f13665c = bVar2;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [P8.b, java.util.concurrent.atomic.AtomicReference] */
        @Override // P8.b
        public final void a(R8.a aVar) {
            if (U8.b.setOnce(this, aVar)) {
                this.f13664b.a(this);
            }
        }

        @Override // R8.a
        public final void dispose() {
            U8.b.dispose(this);
        }

        @Override // P8.b
        public final void onError(Throwable th) {
            this.f13667e = th;
            Q8.b bVar = this.f13665c;
            bVar.getClass();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            U8.b.replace(this, bVar.a(this));
        }

        @Override // P8.b
        public final void onSuccess(T t10) {
            this.f13666d = t10;
            Q8.b bVar = this.f13665c;
            bVar.getClass();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            U8.b.replace(this, bVar.a(this));
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [P8.b, java.util.concurrent.atomic.AtomicReference] */
        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f13667e;
            ?? r12 = this.f13664b;
            if (th != null) {
                r12.onError(th);
            } else {
                r12.onSuccess(this.f13666d);
            }
        }
    }

    public b(X8.a aVar, Q8.b bVar) {
        this.f13662b = aVar;
        this.f13663c = bVar;
    }

    @Override // I9.g
    public final void c0(P8.b<? super T> bVar) {
        this.f13662b.b0(new a(bVar, this.f13663c));
    }
}
