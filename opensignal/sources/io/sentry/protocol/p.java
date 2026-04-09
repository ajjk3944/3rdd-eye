package io.sentry.protocol;

import io.sentry.c2;
import io.sentry.u0;
import io.sentry.y2;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class p implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f12602a;

    /* renamed from: d, reason: collision with root package name */
    public ConcurrentHashMap f12603d;

    /* renamed from: g, reason: collision with root package name */
    public Integer f12604g;

    /* renamed from: r, reason: collision with root package name */
    public Long f12605r;

    /* renamed from: x, reason: collision with root package name */
    public Object f12606x;

    /* renamed from: y, reason: collision with root package name */
    public ConcurrentHashMap f12607y;

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        if (this.f12602a != null) {
            bVar.I("cookies");
            bVar.V(this.f12602a);
        }
        if (this.f12603d != null) {
            bVar.I("headers");
            bVar.S(u0Var, this.f12603d);
        }
        if (this.f12604g != null) {
            bVar.I("status_code");
            bVar.S(u0Var, this.f12604g);
        }
        if (this.f12605r != null) {
            bVar.I("body_size");
            bVar.S(u0Var, this.f12605r);
        }
        if (this.f12606x != null) {
            bVar.I("data");
            bVar.S(u0Var, this.f12606x);
        }
        ConcurrentHashMap concurrentHashMap = this.f12607y;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.f12607y, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
