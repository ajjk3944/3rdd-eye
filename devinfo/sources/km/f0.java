package km;

import java.io.IOException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f0 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public final Method f28412c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28413d;

    /* renamed from: e, reason: collision with root package name */
    public final m f28414e;

    public f0(Method method, int i4, m mVar) {
        this.f28412c = method;
        this.f28413d = i4;
        this.f28414e = mVar;
    }

    @Override // km.c1
    public final void a(s0 s0Var, Object obj) {
        int i4 = this.f28413d;
        Method method = this.f28412c;
        if (obj == null) {
            throw c1.m(method, i4, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            s0Var.f28468k = (rl.x) this.f28414e.l(obj);
        } catch (IOException e2) {
            throw c1.n(method, e2, i4, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
