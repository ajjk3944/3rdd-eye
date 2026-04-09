package com.lefan.signal.tracroute;

import A2.B;
import C0.t;
import C0.w;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final TraceDataRoom_Impl f18864a;

    /* renamed from: b, reason: collision with root package name */
    public final L4.b f18865b;

    public e(TraceDataRoom_Impl traceDataRoom_Impl) {
        this.f18864a = traceDataRoom_Impl;
        this.f18865b = new L4.b(traceDataRoom_Impl, 6);
        new L4.c(traceDataRoom_Impl, 5);
    }

    public final w a() {
        t tVarA = t.a(1, "SELECT * FROM trace_history ORDER BY trace_time DESC LIMIT ?");
        tVarA.f(1, 5);
        return this.f18864a.f1090d.a(new String[]{"trace_history"}, new B(this, tVarA));
    }

    public final void b(d dVar) {
        TraceDataRoom_Impl traceDataRoom_Impl = this.f18864a;
        traceDataRoom_Impl.b();
        traceDataRoom_Impl.c();
        try {
            this.f18865b.f(dVar);
            traceDataRoom_Impl.m();
        } finally {
            traceDataRoom_Impl.j();
        }
    }
}
