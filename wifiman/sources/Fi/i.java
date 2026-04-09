package Fi;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.V;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public class i implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private Object f6711a;

    /* renamed from: b, reason: collision with root package name */
    private final d f6712b;

    /* renamed from: c, reason: collision with root package name */
    private Object f6713c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6714d;

    /* renamed from: e, reason: collision with root package name */
    private int f6715e;

    /* renamed from: f, reason: collision with root package name */
    private int f6716f;

    public i(Object obj, d builder) {
        AbstractC6492s.i(builder, "builder");
        this.f6711a = obj;
        this.f6712b = builder;
        this.f6713c = Hi.c.f7979a;
        this.f6715e = builder.h().i();
    }

    private final void d() {
        if (this.f6712b.h().i() != this.f6715e) {
            throw new ConcurrentModificationException();
        }
    }

    private final void e() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void f() {
        if (!this.f6714d) {
            throw new IllegalStateException();
        }
    }

    public final d g() {
        return this.f6712b;
    }

    public final Object h() {
        return this.f6713c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6716f < this.f6712b.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a next() {
        d();
        e();
        this.f6713c = this.f6711a;
        this.f6714d = true;
        this.f6716f++;
        V v10 = this.f6712b.h().get(this.f6711a);
        if (v10 != 0) {
            a aVar = (a) v10;
            this.f6711a = aVar.c();
            return aVar;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f6711a + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public void remove() {
        f();
        V.d(this.f6712b).remove(this.f6713c);
        this.f6713c = null;
        this.f6714d = false;
        this.f6715e = this.f6712b.h().i();
        this.f6716f--;
    }
}
