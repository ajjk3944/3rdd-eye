package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public final Application f19324b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f19325c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f19326d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19327e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f19328f = new AtomicReference(new ArrayDeque());
    public final AtomicReference g = new AtomicReference(new ArrayDeque());

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f19329h = new AtomicReference(new ArrayDeque());

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f19330i = new AtomicReference(new ArrayDeque());
    public final AtomicReference j = new AtomicReference(new ArrayDeque());

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f19331k = new AtomicReference(new ArrayDeque());

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f19332l = new AtomicReference(new ArrayDeque());

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f19323a = new AtomicReference(null);

    public e0(Application application, Executor executor, d0 d0Var, boolean z3) {
        this.f19327e = z3;
        this.f19324b = application;
        this.f19325c = d0Var;
        this.f19326d = executor;
    }

    public final void a(Queue queue, int i4, int i10, String str) {
        Long l10 = (Long) queue.poll();
        if (l10 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l10.longValue();
            if (str != null) {
                i4 = i10;
            }
            AtomicReference atomicReference = this.f19331k;
            ((Queue) atomicReference.get()).add(this.f19325c.a(i4, jCurrentTimeMillis, str));
            if (this.f19327e) {
                ((ArrayDeque) this.f19332l.get()).addAll((Collection) atomicReference.get());
            }
            this.f19326d.execute(new j(2, this));
        }
    }
}
