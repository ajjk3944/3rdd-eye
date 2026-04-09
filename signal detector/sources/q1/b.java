package q1;

import T2.f;
import f1.i;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final a f23080a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23081b;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23083d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f23084e = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    public final c f23082c = c.f23085a;

    public b(a aVar, String str, boolean z6) {
        this.f23080a = aVar;
        this.f23081b = str;
        this.f23083d = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        i iVar = new i(this, 5, runnable);
        this.f23080a.getClass();
        f fVar = new f(iVar);
        fVar.setName("glide-" + this.f23081b + "-thread-" + this.f23084e.getAndIncrement());
        return fVar;
    }
}
