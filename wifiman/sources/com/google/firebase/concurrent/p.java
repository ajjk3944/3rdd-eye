package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class p extends androidx.concurrent.futures.a implements ScheduledFuture {

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledFuture f38681h;

    class a implements b {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th2) {
            p.this.z(th2);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(Object obj) {
            p.this.y(obj);
        }
    }

    interface b {
        void a(Throwable th2);

        void set(Object obj);
    }

    interface c {
        ScheduledFuture a(b bVar);
    }

    p(c cVar) {
        this.f38681h = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f38681h.compareTo(delayed);
    }

    @Override // androidx.concurrent.futures.a
    protected void c() {
        this.f38681h.cancel(C());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f38681h.getDelay(timeUnit);
    }
}
