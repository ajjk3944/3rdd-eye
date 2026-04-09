package com.bykv.vk.openvk.preload.a;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class d<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private static AtomicLong f8977d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    d f8978a;

    /* renamed from: b, reason: collision with root package name */
    IN f8979b;

    /* renamed from: c, reason: collision with root package name */
    OUT f8980c;

    /* renamed from: e, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f8981e;

    /* renamed from: f, reason: collision with root package name */
    private b f8982f;

    /* renamed from: g, reason: collision with root package name */
    private long f8983g;

    public abstract Object a(b<OUT> bVar, IN in) throws Throwable;

    public void a(Object... objArr) {
    }

    public final long b() {
        return this.f8983g;
    }

    public final void c() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f8981e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f8982f, this);
    }

    public final void d() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f8981e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f8982f, this);
    }

    public final void e() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f8981e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f8982f, this);
    }

    public final OUT f() {
        return this.f8980c;
    }

    public final void a(b bVar, d dVar, IN in, com.bykv.vk.openvk.preload.a.b.a aVar, Object[] objArr) {
        this.f8982f = new m(bVar);
        this.f8978a = dVar;
        this.f8979b = in;
        this.f8981e = aVar;
        if (dVar != null) {
            this.f8983g = dVar.f8983g;
        } else {
            long andIncrement = f8977d.getAndIncrement();
            this.f8983g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    public final void b(Throwable th) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f8981e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f8982f, this, th);
    }

    public final void c(Throwable th) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f8981e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f8982f, this, th);
    }

    public final void d(Throwable th) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f8981e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f8982f, this, th);
    }
}
