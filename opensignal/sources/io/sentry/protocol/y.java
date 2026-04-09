package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class y implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public List f12657a;

    /* renamed from: d, reason: collision with root package name */
    public ConcurrentHashMap f12658d;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f12659g;

    /* renamed from: r, reason: collision with root package name */
    public ConcurrentHashMap f12660r;

    public y(List list) {
        this.f12657a = list;
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12657a != null) {
            bVar.I("frames");
            bVar.S(u0Var, this.f12657a);
        }
        if (this.f12658d != null) {
            bVar.I("registers");
            bVar.S(u0Var, this.f12658d);
        }
        if (this.f12659g != null) {
            bVar.I("snapshot");
            bVar.T(this.f12659g);
        }
        ConcurrentHashMap concurrentHashMap = this.f12660r;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.f12660r, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
