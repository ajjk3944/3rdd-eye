package c;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* renamed from: c.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4137F {

    /* renamed from: a, reason: collision with root package name */
    private boolean f33484a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f33485b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6824a f33486c;

    public AbstractC4137F(boolean z10) {
        this.f33484a = z10;
    }

    public final void a(InterfaceC4148c cancellable) {
        AbstractC6492s.i(cancellable, "cancellable");
        this.f33485b.add(cancellable);
    }

    public final InterfaceC6824a b() {
        return this.f33486c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(C4147b backEvent) {
        AbstractC6492s.i(backEvent, "backEvent");
    }

    public void f(C4147b backEvent) {
        AbstractC6492s.i(backEvent, "backEvent");
    }

    public final boolean g() {
        return this.f33484a;
    }

    public final void h() {
        Iterator it = this.f33485b.iterator();
        while (it.hasNext()) {
            ((InterfaceC4148c) it.next()).cancel();
        }
    }

    public final void i(InterfaceC4148c cancellable) {
        AbstractC6492s.i(cancellable, "cancellable");
        this.f33485b.remove(cancellable);
    }

    public final void j(boolean z10) {
        this.f33484a = z10;
        InterfaceC6824a interfaceC6824a = this.f33486c;
        if (interfaceC6824a != null) {
            interfaceC6824a.invoke();
        }
    }

    public final void k(InterfaceC6824a interfaceC6824a) {
        this.f33486c = interfaceC6824a;
    }
}
