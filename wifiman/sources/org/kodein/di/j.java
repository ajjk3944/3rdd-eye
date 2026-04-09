package org.kodein.di;

import Yg.m;
import Yg.n;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import org.kodein.di.DI;
import rj.AbstractC7726l2;

/* loaded from: classes4.dex */
public final class j implements DI {

    /* renamed from: a, reason: collision with root package name */
    private final m f56942a;

    public j(InterfaceC6824a f10) {
        AbstractC6492s.i(f10, "f");
        this.f56942a = n.b(f10);
    }

    @Override // org.kodein.di.c
    public f I() {
        return DI.d.b(this);
    }

    public final DI a() {
        return (DI) this.f56942a.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return DI.d.a(this);
    }

    @Override // org.kodein.di.c
    public AbstractC7726l2 i() {
        DI.d.c(this);
        return null;
    }

    @Override // org.kodein.di.DI
    public e y() {
        return a().y();
    }
}
