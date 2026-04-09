package wg;

import hg.InterfaceC6043c;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
final class c implements Future {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC6043c f64920a;

    c(InterfaceC6043c interfaceC6043c) {
        this.f64920a = interfaceC6043c;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        this.f64920a.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return null;
    }
}
