package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class c0 implements g8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f26518a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26519b;

    /* renamed from: c, reason: collision with root package name */
    public final Predicate f26520c;

    /* renamed from: d, reason: collision with root package name */
    public final Supplier f26521d;

    public c0(boolean z3, b7 b7Var, Object obj, Predicate predicate, Supplier supplier) {
        this.f26518a = (z3 ? 0 : a7.f26490r) | a7.f26493u;
        this.f26519b = obj;
        this.f26520c = predicate;
        this.f26521d = supplier;
    }

    @Override // j$.util.stream.g8
    public final int w() {
        return this.f26518a;
    }

    @Override // j$.util.stream.g8
    public final Object f(a aVar, Spliterator spliterator) {
        h8 h8Var = (h8) this.f26521d.get();
        aVar.w0(spliterator, h8Var);
        Object obj = h8Var.get();
        return obj != null ? obj : this.f26519b;
    }

    @Override // j$.util.stream.g8
    public final Object j(v3 v3Var, Spliterator spliterator) {
        a aVar = (a) v3Var;
        return new j0(this, a7.ORDERED.l(aVar.f26462m), aVar, spliterator).invoke();
    }
}
