package Ei;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public abstract class u implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f4803a = t.f4797e.a().m();

    /* renamed from: b, reason: collision with root package name */
    private int f4804b;

    /* renamed from: c, reason: collision with root package name */
    private int f4805c;

    public final Object d() {
        Hi.a.a(h());
        return this.f4803a[this.f4805c];
    }

    public final t e() {
        Hi.a.a(i());
        Object obj = this.f4803a[this.f4805c];
        AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    protected final Object[] f() {
        return this.f4803a;
    }

    protected final int g() {
        return this.f4805c;
    }

    public final boolean h() {
        return this.f4805c < this.f4804b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return h();
    }

    public final boolean i() {
        Hi.a.a(this.f4805c >= this.f4804b);
        return this.f4805c < this.f4803a.length;
    }

    public final void j() {
        Hi.a.a(h());
        this.f4805c += 2;
    }

    public final void k() {
        Hi.a.a(i());
        this.f4805c++;
    }

    public final void n(Object[] buffer, int i10) {
        AbstractC6492s.i(buffer, "buffer");
        p(buffer, i10, 0);
    }

    public final void p(Object[] buffer, int i10, int i11) {
        AbstractC6492s.i(buffer, "buffer");
        this.f4803a = buffer;
        this.f4804b = i10;
        this.f4805c = i11;
    }

    protected final void q(int i10) {
        this.f4805c = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
