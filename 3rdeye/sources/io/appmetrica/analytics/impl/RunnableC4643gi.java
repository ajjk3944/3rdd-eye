package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.gi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4643gi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f40947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4927ri f40948b;

    public RunnableC4643gi(C4927ri c4927ri, ModuleEvent moduleEvent) {
        this.f40948b = c4927ri;
        this.f40947a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f40948b;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).reportEvent(this.f40947a);
    }
}
