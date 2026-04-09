package org.kodein.di;

import kotlin.jvm.internal.AbstractC6492s;
import rj.AbstractC7726l2;

/* loaded from: classes4.dex */
final class i implements DI {

    /* renamed from: a, reason: collision with root package name */
    private final DI f56940a;

    /* renamed from: b, reason: collision with root package name */
    private final f f56941b;

    public i(DI _base, f diContext, AbstractC7726l2 abstractC7726l2) {
        AbstractC6492s.i(_base, "_base");
        AbstractC6492s.i(diContext, "diContext");
        this.f56940a = _base;
        this.f56941b = diContext;
    }

    @Override // org.kodein.di.c
    public f I() {
        return this.f56941b;
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this;
    }

    @Override // org.kodein.di.c
    public AbstractC7726l2 i() {
        return null;
    }

    @Override // org.kodein.di.DI
    public e y() {
        return this.f56940a.y();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(c base, f diContext, AbstractC7726l2 abstractC7726l2) {
        this(base.d(), diContext, abstractC7726l2);
        AbstractC6492s.i(base, "base");
        AbstractC6492s.i(diContext, "diContext");
    }
}
