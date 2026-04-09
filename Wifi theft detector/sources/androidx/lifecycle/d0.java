package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f3499a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3500b;

    /* renamed from: c, reason: collision with root package name */
    public a f3501c;

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final p f3502a;

        /* renamed from: b, reason: collision with root package name */
        public final Lifecycle.Event f3503b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3504c;

        public a(p registry, Lifecycle.Event event) {
            kotlin.jvm.internal.p.e(registry, "registry");
            kotlin.jvm.internal.p.e(event, "event");
            this.f3502a = registry;
            this.f3503b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3504c) {
                return;
            }
            this.f3502a.i(this.f3503b);
            this.f3504c = true;
        }
    }

    public d0(n provider) {
        kotlin.jvm.internal.p.e(provider, "provider");
        this.f3499a = new p(provider);
        this.f3500b = new Handler();
    }

    public Lifecycle a() {
        return this.f3499a;
    }

    public void b() {
        f(Lifecycle.Event.ON_START);
    }

    public void c() {
        f(Lifecycle.Event.ON_CREATE);
    }

    public void d() {
        f(Lifecycle.Event.ON_STOP);
        f(Lifecycle.Event.ON_DESTROY);
    }

    public void e() {
        f(Lifecycle.Event.ON_START);
    }

    public final void f(Lifecycle.Event event) {
        a aVar = this.f3501c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f3499a, event);
        this.f3501c = aVar2;
        Handler handler = this.f3500b;
        kotlin.jvm.internal.p.b(aVar2);
        handler.postAtFrontOfQueue(aVar2);
    }
}
