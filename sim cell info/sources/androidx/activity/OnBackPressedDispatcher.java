package androidx.activity;

import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f266a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayDeque<b> f267b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements e, androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final d f268a;

        /* renamed from: b, reason: collision with root package name */
        private final b f269b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.activity.a f270c;

        LifecycleOnBackPressedCancellable(d dVar, b bVar) {
            this.f268a = dVar;
            this.f269b = bVar;
            dVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f268a.c(this);
            this.f269b.e(this);
            androidx.activity.a aVar = this.f270c;
            if (aVar != null) {
                aVar.cancel();
                this.f270c = null;
            }
        }

        @Override // androidx.lifecycle.e
        public void g(g gVar, d.a aVar) {
            if (aVar == d.a.ON_START) {
                this.f270c = OnBackPressedDispatcher.this.b(this.f269b);
                return;
            }
            if (aVar != d.a.ON_STOP) {
                if (aVar == d.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar2 = this.f270c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            }
        }
    }

    private class a implements androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f272a;

        a(b bVar) {
            this.f272a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f267b.remove(this.f272a);
            this.f272a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f266a = runnable;
    }

    public void a(g gVar, b bVar) {
        d dVarA = gVar.a();
        if (dVarA.b() == d.b.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(dVarA, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f267b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> itDescendingIterator = this.f267b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            b next = itDescendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f266a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
