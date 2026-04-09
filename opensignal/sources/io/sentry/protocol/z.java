package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class z implements c2 {
    public Boolean B;
    public Boolean D;
    public y E;
    public Map F;
    public ConcurrentHashMap G;

    /* renamed from: a, reason: collision with root package name */
    public Long f12661a;

    /* renamed from: d, reason: collision with root package name */
    public Integer f12662d;

    /* renamed from: g, reason: collision with root package name */
    public String f12663g;

    /* renamed from: r, reason: collision with root package name */
    public String f12664r;

    /* renamed from: x, reason: collision with root package name */
    public Boolean f12665x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f12666y;

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12661a != null) {
            bVar.I("id");
            bVar.U(this.f12661a);
        }
        if (this.f12662d != null) {
            bVar.I("priority");
            bVar.U(this.f12662d);
        }
        if (this.f12663g != null) {
            bVar.I("name");
            bVar.V(this.f12663g);
        }
        if (this.f12664r != null) {
            bVar.I("state");
            bVar.V(this.f12664r);
        }
        if (this.f12665x != null) {
            bVar.I("crashed");
            bVar.T(this.f12665x);
        }
        if (this.f12666y != null) {
            bVar.I("current");
            bVar.T(this.f12666y);
        }
        if (this.B != null) {
            bVar.I("daemon");
            bVar.T(this.B);
        }
        if (this.D != null) {
            bVar.I("main");
            bVar.T(this.D);
        }
        if (this.E != null) {
            bVar.I("stacktrace");
            bVar.S(u0Var, this.E);
        }
        if (this.F != null) {
            bVar.I("held_locks");
            bVar.S(u0Var, this.F);
        }
        ConcurrentHashMap concurrentHashMap = this.G;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.G, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
