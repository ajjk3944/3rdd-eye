package y9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import q9.InterfaceC5499a;

/* compiled from: Strings.kt */
/* renamed from: y9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5820b implements x9.g<v9.g> {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f48363a;

    /* renamed from: b, reason: collision with root package name */
    public final p9.p<CharSequence, Integer, b9.l<Integer, Integer>> f48364b;

    /* compiled from: Strings.kt */
    /* renamed from: y9.b$a */
    public static final class a implements Iterator<v9.g>, InterfaceC5499a {

        /* renamed from: b, reason: collision with root package name */
        public int f48365b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f48366c;

        /* renamed from: d, reason: collision with root package name */
        public int f48367d;

        /* renamed from: e, reason: collision with root package name */
        public v9.g f48368e;

        public a() {
            C5820b.this.getClass();
            int iL = v9.h.L(0, 0, C5820b.this.f48363a.length());
            this.f48366c = iL;
            this.f48367d = iL;
        }

        public final void a() {
            b9.l<Integer, Integer> lVarInvoke;
            int i = this.f48367d;
            if (i < 0) {
                this.f48365b = 0;
                this.f48368e = null;
                return;
            }
            C5820b c5820b = C5820b.this;
            c5820b.getClass();
            CharSequence charSequence = c5820b.f48363a;
            if (i <= charSequence.length() && (lVarInvoke = c5820b.f48364b.invoke(charSequence, Integer.valueOf(this.f48367d))) != null) {
                int iIntValue = lVarInvoke.f18083b.intValue();
                int iIntValue2 = lVarInvoke.f18084c.intValue();
                this.f48368e = v9.h.O(this.f48366c, iIntValue);
                int i10 = iIntValue + iIntValue2;
                this.f48366c = i10;
                this.f48367d = i10 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f48368e = new v9.g(this.f48366c, q.d0(charSequence), 1);
                this.f48367d = -1;
            }
            this.f48365b = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f48365b == -1) {
                a();
            }
            return this.f48365b == 1;
        }

        @Override // java.util.Iterator
        public final v9.g next() {
            if (this.f48365b == -1) {
                a();
            }
            if (this.f48365b == 0) {
                throw new NoSuchElementException();
            }
            v9.g gVar = this.f48368e;
            kotlin.jvm.internal.l.d(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f48368e = null;
            this.f48365b = -1;
            return gVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5820b(CharSequence input, p9.p pVar) {
        kotlin.jvm.internal.l.f(input, "input");
        this.f48363a = input;
        this.f48364b = pVar;
    }

    @Override // x9.g
    public final Iterator<v9.g> iterator() {
        return new a();
    }
}
