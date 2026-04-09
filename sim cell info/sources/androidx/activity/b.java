package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f274a;

    /* renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f275b = new CopyOnWriteArrayList<>();

    public b(boolean z2) {
        this.f274a = z2;
    }

    void a(a aVar) {
        this.f275b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f274a;
    }

    public final void d() {
        Iterator<a> it = this.f275b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    void e(a aVar) {
        this.f275b.remove(aVar);
    }

    public final void f(boolean z2) {
        this.f274a = z2;
    }
}
