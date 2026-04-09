package com.bykv.vk.openvk.preload.a;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class d<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private static AtomicLong f6598d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    d f6599a;

    /* renamed from: b, reason: collision with root package name */
    IN f6600b;

    /* renamed from: c, reason: collision with root package name */
    OUT f6601c;

    /* renamed from: e, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f6602e;

    /* renamed from: f, reason: collision with root package name */
    private b f6603f;

    /* renamed from: g, reason: collision with root package name */
    private long f6604g;

    public abstract Object a(b<OUT> bVar, IN in);

    public void a(Object... objArr) {
    }

    public final long b() {
        return this.f6604g;
    }

    public final void c() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f6602e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f6603f, this);
    }

    public final void d() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f6602e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f6603f, this);
    }

    public final void e() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f6602e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f6603f, this);
    }

    public final OUT f() {
        return this.f6601c;
    }

    public final void a(b bVar, d dVar, IN in, com.bykv.vk.openvk.preload.a.b.a aVar, Object[] objArr) {
        this.f6603f = new m(bVar);
        this.f6599a = dVar;
        this.f6600b = in;
        this.f6602e = aVar;
        if (dVar != null) {
            this.f6604g = dVar.f6604g;
        } else {
            long andIncrement = f6598d.getAndIncrement();
            this.f6604g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    public final void b(Throwable th) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f6602e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f6603f, this, th);
    }

    public final void c(Throwable th) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f6602e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f6603f, this, th);
    }

    public final void d(Throwable th) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f6602e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f6603f, this, th);
    }
}
