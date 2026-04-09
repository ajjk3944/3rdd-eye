package yg;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: yg.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8670e extends AtomicInteger implements Dg.d {

    /* renamed from: a, reason: collision with root package name */
    final Object f66768a;

    /* renamed from: b, reason: collision with root package name */
    final Dj.b f66769b;

    public C8670e(Dj.b bVar, Object obj) {
        this.f66769b = bVar;
        this.f66768a = obj;
    }

    @Override // Dj.c
    public void cancel() {
        lazySet(2);
    }

    @Override // Dg.g
    public void clear() {
        lazySet(1);
    }

    @Override // Dg.g
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // Dg.g
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Dg.g
    public Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f66768a;
    }

    @Override // Dj.c
    public void request(long j10) {
        if (EnumC8672g.validate(j10) && compareAndSet(0, 1)) {
            Dj.b bVar = this.f66769b;
            bVar.h(this.f66768a);
            if (get() != 2) {
                bVar.a();
            }
        }
    }

    @Override // Dg.c
    public int requestFusion(int i10) {
        return i10 & 1;
    }
}
