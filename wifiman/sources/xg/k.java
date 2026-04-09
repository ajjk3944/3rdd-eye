package xg;

import gg.l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import yg.EnumC8672g;
import zg.AbstractC8756i;
import zg.C8750c;

/* loaded from: classes4.dex */
public class k extends AtomicInteger implements l, Dj.c {

    /* renamed from: a, reason: collision with root package name */
    final Dj.b f66093a;

    /* renamed from: b, reason: collision with root package name */
    final C8750c f66094b = new C8750c();

    /* renamed from: c, reason: collision with root package name */
    final AtomicLong f66095c = new AtomicLong();

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference f66096d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f66097e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f66098f;

    public k(Dj.b bVar) {
        this.f66093a = bVar;
    }

    @Override // Dj.b
    public void a() {
        this.f66098f = true;
        AbstractC8756i.a(this.f66093a, this, this.f66094b);
    }

    @Override // Dj.c
    public void cancel() {
        if (this.f66098f) {
            return;
        }
        EnumC8672g.cancel(this.f66096d);
    }

    @Override // Dj.b
    public void h(Object obj) {
        AbstractC8756i.f(this.f66093a, obj, this, this.f66094b);
    }

    @Override // gg.l
    public void j(Dj.c cVar) {
        if (this.f66097e.compareAndSet(false, true)) {
            this.f66093a.j(this);
            EnumC8672g.deferredSetOnce(this.f66096d, this.f66095c, cVar);
        } else {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // Dj.b
    public void onError(Throwable th2) {
        this.f66098f = true;
        AbstractC8756i.c(this.f66093a, th2, this, this.f66094b);
    }

    @Override // Dj.c
    public void request(long j10) {
        if (j10 > 0) {
            EnumC8672g.deferredRequest(this.f66096d, this.f66095c, j10);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j10));
    }
}
