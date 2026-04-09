package c8;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final b f2811a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2812b;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2814d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f2815e = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    public final d f2813c = d.f2816a;

    public c(b bVar, String str, boolean z3) {
        this.f2811a = bVar;
        this.f2812b = str;
        this.f2814d = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        vd.a aVar = new vd.a(this, false, runnable, 5);
        this.f2811a.getClass();
        a aVar2 = new a(aVar);
        aVar2.setName("glide-" + this.f2812b + "-thread-" + this.f2815e.getAndIncrement());
        return aVar2;
    }
}
