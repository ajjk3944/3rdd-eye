package com.yandex.mobile.ads.impl;

import N7.B9;
import N7.C1175g0;

/* loaded from: classes3.dex */
public final class px1 extends j6.h {

    /* renamed from: a, reason: collision with root package name */
    private final po f31944a;

    /* renamed from: b, reason: collision with root package name */
    private f20 f31945b;

    public px1() {
        this(0);
    }

    public final oo a(int i) {
        oo ooVar = (oo) this.f31944a.a().get(Integer.valueOf(i));
        if (ooVar != null) {
            return ooVar;
        }
        oo ooVar2 = new oo();
        this.f31944a.a(i, ooVar2);
        return ooVar2;
    }

    @Override // j6.h
    public final boolean handleAction(C1175g0 action, j6.y view, A7.d expressionResolver) {
        kotlin.jvm.internal.l.f(action, "action");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        if (super.handleAction(action, view, expressionResolver)) {
            return true;
        }
        f20 f20Var = this.f31945b;
        return f20Var != null && f20Var.handleAction(action, view, expressionResolver);
    }

    public /* synthetic */ px1(int i) {
        this(new po());
    }

    public final void a(f20 f20Var) {
        f20 f20Var2 = this.f31945b;
        if (f20Var2 != null) {
            f20Var2.a(null);
        }
        if (f20Var != null) {
            f20Var.a(this.f31944a);
        }
        this.f31945b = f20Var;
    }

    public px1(po clickConnectorAggregator) {
        kotlin.jvm.internal.l.f(clickConnectorAggregator, "clickConnectorAggregator");
        this.f31944a = clickConnectorAggregator;
    }

    @Override // j6.h
    public final boolean handleAction(B9 action, j6.y view, A7.d resolver) {
        kotlin.jvm.internal.l.f(action, "action");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (super.handleAction(action, view, resolver)) {
            return true;
        }
        f20 f20Var = this.f31945b;
        return f20Var != null && f20Var.handleAction(action, view, resolver);
    }
}
