package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes3.dex */
public abstract class H5 implements InterfaceC4825nj {

    /* renamed from: a, reason: collision with root package name */
    public BaseRequestConfig f39560a;

    /* renamed from: b, reason: collision with root package name */
    public final BaseRequestConfig.RequestConfigLoader f39561b;

    /* renamed from: c, reason: collision with root package name */
    public C4579e6 f39562c;

    public H5(BaseRequestConfig.RequestConfigLoader<Object, C4579e6> requestConfigLoader, C4544cm c4544cm, ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f39561b = requestConfigLoader;
        Ga.j().u().a(this);
        a(new C4579e6(c4544cm, Ga.j().u(), Ga.j().r(), argumentsMerger));
    }

    public final synchronized void a(C4579e6 c4579e6) {
        this.f39562c = c4579e6;
    }

    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.f39562c.componentArguments;
    }

    public final synchronized C4544cm c() {
        return this.f39562c.f40791a;
    }

    public final void d() {
        synchronized (this) {
            this.f39560a = null;
        }
    }

    public final synchronized void e() {
        this.f39560a = null;
    }

    public synchronized void a(Object obj) {
        if (!((ArgumentsMerger) this.f39562c.componentArguments).compareWithOtherArguments(obj)) {
            a(new C4579e6(c(), Ga.f39501F.u(), Ga.f39501F.r(), (ArgumentsMerger) ((ArgumentsMerger) this.f39562c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(C4544cm c4544cm) {
        a(new C4579e6(c4544cm, Ga.f39501F.u(), Ga.f39501F.r(), b()));
        e();
    }

    public final synchronized BaseRequestConfig a() {
        try {
            if (this.f39560a == null) {
                this.f39560a = this.f39561b.load(this.f39562c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39560a;
    }
}
