package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class o0 extends p0 {

    /* renamed from: b, reason: collision with root package name */
    public final Consumer f26691b;

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.g8
    public final Object f(a aVar, Spliterator spliterator) {
        aVar.w0(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.g8
    public final /* bridge */ /* synthetic */ Object j(v3 v3Var, Spliterator spliterator) {
        a(v3Var, spliterator);
        return null;
    }

    public o0(Consumer consumer, boolean z3) {
        super(z3);
        this.f26691b = consumer;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.f26691b.n(obj);
    }
}
