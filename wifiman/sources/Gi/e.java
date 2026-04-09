package Gi;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.V;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public final class e extends d implements Iterator, InterfaceC6944a {

    /* renamed from: d, reason: collision with root package name */
    private final c f7521d;

    /* renamed from: e, reason: collision with root package name */
    private Object f7522e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7523f;

    /* renamed from: g, reason: collision with root package name */
    private int f7524g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c builder) {
        super(builder.j(), builder.s());
        AbstractC6492s.i(builder, "builder");
        this.f7521d = builder;
        this.f7524g = builder.s().i();
    }

    private final void g() {
        if (this.f7521d.s().i() != this.f7524g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void h() {
        if (!this.f7523f) {
            throw new IllegalStateException();
        }
    }

    @Override // Gi.d, java.util.Iterator
    public Object next() {
        g();
        Object next = super.next();
        this.f7522e = next;
        this.f7523f = true;
        return next;
    }

    @Override // Gi.d, java.util.Iterator
    public void remove() {
        h();
        V.a(this.f7521d).remove(this.f7522e);
        this.f7522e = null;
        this.f7523f = false;
        this.f7524g = this.f7521d.s().i();
        f(e() - 1);
    }
}
