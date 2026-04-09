package x9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p9.InterfaceC5480a;
import q9.InterfaceC5499a;

/* compiled from: Sequences.kt */
/* loaded from: classes3.dex */
public final class f<T> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5480a<T> f47837a;

    /* renamed from: b, reason: collision with root package name */
    public final p9.l<T, T> f47838b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, InterfaceC5499a {

        /* renamed from: b, reason: collision with root package name */
        public T f47839b;

        /* renamed from: c, reason: collision with root package name */
        public int f47840c = -2;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f<T> f47841d;

        public a(f<T> fVar) {
            this.f47841d = fVar;
        }

        public final void a() {
            T tInvoke;
            int i = this.f47840c;
            f<T> fVar = this.f47841d;
            if (i == -2) {
                tInvoke = fVar.f47837a.invoke();
            } else {
                p9.l<T, T> lVar = fVar.f47838b;
                T t10 = this.f47839b;
                kotlin.jvm.internal.l.c(t10);
                tInvoke = lVar.invoke(t10);
            }
            this.f47839b = tInvoke;
            this.f47840c = tInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f47840c < 0) {
                a();
            }
            return this.f47840c == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f47840c < 0) {
                a();
            }
            if (this.f47840c == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f47839b;
            kotlin.jvm.internal.l.d(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f47840c = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(InterfaceC5480a<? extends T> getInitialValue, p9.l<? super T, ? extends T> getNextValue) {
        kotlin.jvm.internal.l.f(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.l.f(getNextValue, "getNextValue");
        this.f47837a = getInitialValue;
        this.f47838b = getNextValue;
    }

    @Override // x9.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
