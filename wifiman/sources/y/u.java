package Y;

import a0.AbstractC3748a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
public abstract class u implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f24512a = t.f24503e.a().p();

    /* renamed from: b, reason: collision with root package name */
    private int f24513b;

    /* renamed from: c, reason: collision with root package name */
    private int f24514c;

    public final Object d() {
        AbstractC3748a.a(h());
        return this.f24512a[this.f24514c];
    }

    public final t e() {
        AbstractC3748a.a(i());
        Object obj = this.f24512a[this.f24514c];
        AbstractC6492s.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    protected final Object[] f() {
        return this.f24512a;
    }

    protected final int g() {
        return this.f24514c;
    }

    public final boolean h() {
        return this.f24514c < this.f24513b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return h();
    }

    public final boolean i() {
        AbstractC3748a.a(this.f24514c >= this.f24513b);
        return this.f24514c < this.f24512a.length;
    }

    public final void j() {
        AbstractC3748a.a(h());
        this.f24514c += 2;
    }

    public final void k() {
        AbstractC3748a.a(i());
        this.f24514c++;
    }

    public final void n(Object[] objArr, int i10) {
        p(objArr, i10, 0);
    }

    public final void p(Object[] objArr, int i10, int i11) {
        this.f24512a = objArr;
        this.f24513b = i10;
        this.f24514c = i11;
    }

    protected final void q(int i10) {
        this.f24514c = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
