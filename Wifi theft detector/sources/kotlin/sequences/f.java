package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final l9.a f22095a;

    /* renamed from: b, reason: collision with root package name */
    public final l9.l f22096b;

    public static final class a implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public Object f22097a;

        /* renamed from: b, reason: collision with root package name */
        public int f22098b = -2;

        public a() {
        }

        private final void a() {
            Object objInvoke;
            if (this.f22098b == -2) {
                objInvoke = f.this.f22095a.invoke();
            } else {
                l9.l lVar = f.this.f22096b;
                Object obj = this.f22097a;
                kotlin.jvm.internal.p.b(obj);
                objInvoke = lVar.invoke(obj);
            }
            this.f22097a = objInvoke;
            this.f22098b = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f22098b < 0) {
                a();
            }
            return this.f22098b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f22098b < 0) {
                a();
            }
            if (this.f22098b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f22097a;
            kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f22098b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(l9.a getInitialValue, l9.l getNextValue) {
        kotlin.jvm.internal.p.e(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.p.e(getNextValue, "getNextValue");
        this.f22095a = getInitialValue;
        this.f22096b = getNextValue;
    }

    @Override // kotlin.sequences.g
    public Iterator iterator() {
        return new a();
    }
}
