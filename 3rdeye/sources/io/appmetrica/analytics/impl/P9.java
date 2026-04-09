package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class P9 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f39967a;

    /* renamed from: b, reason: collision with root package name */
    public final C4919ra f39968b;

    public P9(Context context, String str) {
        this(new ReentrantLock(), new C4919ra(context, str));
    }

    public final void a() {
        this.f39967a.lock();
        this.f39968b.a();
    }

    public final void b() {
        this.f39968b.b();
        this.f39967a.unlock();
    }

    public final void c() {
        C4919ra c4919ra = this.f39968b;
        synchronized (c4919ra) {
            c4919ra.b();
            c4919ra.f41566a.delete();
        }
        this.f39967a.unlock();
    }

    public P9(ReentrantLock reentrantLock, C4919ra c4919ra) {
        this.f39967a = reentrantLock;
        this.f39968b = c4919ra;
    }
}
