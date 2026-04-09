package io.sentry.protocol.profiling;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public List f12608a;

    /* renamed from: d, reason: collision with root package name */
    public List f12609d;

    /* renamed from: g, reason: collision with root package name */
    public List f12610g;

    /* renamed from: r, reason: collision with root package name */
    public Map f12611r;

    /* renamed from: x, reason: collision with root package name */
    public ConcurrentHashMap f12612x;

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("samples");
        bVar.S(u0Var, this.f12608a);
        bVar.I("stacks");
        bVar.S(u0Var, this.f12609d);
        bVar.I("frames");
        bVar.S(u0Var, this.f12610g);
        bVar.I("thread_metadata");
        bVar.S(u0Var, this.f12611r);
        ConcurrentHashMap concurrentHashMap = this.f12612x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.f12612x, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
