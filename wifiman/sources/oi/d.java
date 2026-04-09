package oi;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public class d implements k {

    /* renamed from: b, reason: collision with root package name */
    private final Lock f55713b;

    public d(Lock lock) {
        AbstractC6492s.i(lock, "lock");
        this.f55713b = lock;
    }

    protected final Lock a() {
        return this.f55713b;
    }

    @Override // oi.k
    public void lock() {
        this.f55713b.lock();
    }

    @Override // oi.k
    public void unlock() {
        this.f55713b.unlock();
    }

    public /* synthetic */ d(Lock lock, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
