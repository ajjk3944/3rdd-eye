package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC1781n;

/* compiled from: ServiceLifecycleDispatcher.kt */
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final C1791y f16117a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f16118b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    public a f16119c;

    /* compiled from: ServiceLifecycleDispatcher.kt */
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final C1791y f16120b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC1781n.a f16121c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16122d;

        public a(C1791y registry, AbstractC1781n.a event) {
            kotlin.jvm.internal.l.f(registry, "registry");
            kotlin.jvm.internal.l.f(event, "event");
            this.f16120b = registry;
            this.f16121c = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f16122d) {
                return;
            }
            this.f16120b.d(this.f16121c);
            this.f16122d = true;
        }
    }

    public Z(A a10) {
        this.f16117a = new C1791y(a10);
    }

    public final void a(AbstractC1781n.a aVar) {
        a aVar2 = this.f16119c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f16117a, aVar);
        this.f16119c = aVar3;
        this.f16118b.postAtFrontOfQueue(aVar3);
    }
}
