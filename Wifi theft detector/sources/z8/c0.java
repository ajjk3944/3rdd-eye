package z8;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class c0 implements Iterable, m9.a {

    /* renamed from: a, reason: collision with root package name */
    public final l9.a f25397a;

    public c0(l9.a iteratorFactory) {
        kotlin.jvm.internal.p.e(iteratorFactory, "iteratorFactory");
        this.f25397a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new d0((Iterator) this.f25397a.invoke());
    }
}
