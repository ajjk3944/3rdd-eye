package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.eg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4589eg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final File f40811a;

    /* renamed from: b, reason: collision with root package name */
    public final Function f40812b;

    /* renamed from: c, reason: collision with root package name */
    public final Consumer f40813c;

    /* renamed from: d, reason: collision with root package name */
    public final Consumer f40814d;

    /* renamed from: e, reason: collision with root package name */
    public final C4945sa f40815e;

    /* renamed from: f, reason: collision with root package name */
    public final Xk f40816f;

    public RunnableC4589eg(File file, Function function, Consumer consumer, Consumer consumer2, C4945sa c4945sa, Xk xk) {
        this.f40811a = file;
        this.f40812b = function;
        this.f40813c = consumer;
        this.f40814d = consumer2;
        this.f40815e = c4945sa;
        this.f40816f = xk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f40811a.exists()) {
            P9 p9B = this.f40815e.b(this.f40811a.getName());
            Consumer qo = this.f40813c;
            try {
                p9B.f39967a.lock();
                p9B.f39968b.a();
            } catch (Throwable unused) {
            }
            if (!this.f40811a.exists()) {
                qo.consume(this.f40811a);
                p9B.c();
                C4945sa c4945sa = this.f40815e;
                String name = this.f40811a.getName();
                synchronized (c4945sa) {
                    c4945sa.f41634b.remove(name);
                }
                return;
            }
            Object objApply = this.f40812b.apply(this.f40811a);
            if (objApply != null) {
                if (this.f40816f.a(objApply)) {
                    this.f40814d.consume(objApply);
                } else {
                    qo = new Qo();
                }
            }
            qo.consume(this.f40811a);
            p9B.c();
            this.f40815e.a(this.f40811a.getName());
        }
    }

    public static final void a(File file) {
    }
}
