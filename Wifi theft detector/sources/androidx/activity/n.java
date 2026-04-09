package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f277a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f278b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public l9.a f279c;

    public n(boolean z10) {
        this.f277a = z10;
    }

    public final void a(b cancellable) {
        kotlin.jvm.internal.p.e(cancellable, "cancellable");
        this.f278b.add(cancellable);
    }

    public final l9.a b() {
        return this.f279c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(BackEventCompat backEvent) {
        kotlin.jvm.internal.p.e(backEvent, "backEvent");
    }

    public void f(BackEventCompat backEvent) {
        kotlin.jvm.internal.p.e(backEvent, "backEvent");
    }

    public final boolean g() {
        return this.f277a;
    }

    public final void h() {
        Iterator it = this.f278b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).cancel();
        }
    }

    public final void i(b cancellable) {
        kotlin.jvm.internal.p.e(cancellable, "cancellable");
        this.f278b.remove(cancellable);
    }

    public final void j(boolean z10) {
        this.f277a = z10;
        l9.a aVar = this.f279c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void k(l9.a aVar) {
        this.f279c = aVar;
    }
}
