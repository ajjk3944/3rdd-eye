package com.bykv.vk.openvk.preload.a;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private static AtomicLong f6590d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    d f6591a;

    /* renamed from: b, reason: collision with root package name */
    IN f6592b;

    /* renamed from: c, reason: collision with root package name */
    OUT f6593c;

    /* renamed from: e, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f6594e;

    /* renamed from: f, reason: collision with root package name */
    private b f6595f;
    private long g;

    public abstract Object a(b<OUT> bVar, IN in) throws Throwable;

    public void a(Object... objArr) {
    }

    public final long b() {
        return this.g;
    }

    public final void c() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f6594e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f6595f, this);
    }

    public final void d() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f6594e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f6595f, this);
    }

    public final void e() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f6594e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f6595f, this);
    }

    public final OUT f() {
        return this.f6593c;
    }

    public final void a(b bVar, d dVar, IN in, com.bykv.vk.openvk.preload.a.b.a aVar, Object[] objArr) {
        this.f6595f = new m(bVar);
        this.f6591a = dVar;
        this.f6592b = in;
        this.f6594e = aVar;
        if (dVar != null) {
            this.g = dVar.g;
        } else {
            long andIncrement = f6590d.getAndIncrement();
            this.g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    public final void b(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f6594e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f6595f, this, th2);
    }

    public final void c(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f6594e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f6595f, this, th2);
    }

    public final void d(Throwable th2) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f6594e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f6595f, this, th2);
    }
}
