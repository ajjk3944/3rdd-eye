package d8;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f22051a;

    /* renamed from: b, reason: collision with root package name */
    public final p6.i f22052b;

    public y(i0.f fVar) {
        b0 b0Var = new b0(fVar);
        this.f22052b = new p6.i(10);
        this.f22051a = b0Var;
    }

    public final synchronized ArrayList a(Class cls) {
        return this.f22051a.d(cls);
    }
}
