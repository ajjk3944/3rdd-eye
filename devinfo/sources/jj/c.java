package jj;

import androidx.lifecycle.l0;
import bh.u;
import ek.j;
import java.util.ArrayList;
import xk.g0;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f27690a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f27691b;

    /* renamed from: c, reason: collision with root package name */
    public final wi.e f27692c;

    /* renamed from: d, reason: collision with root package name */
    public final wi.e f27693d;

    public c() {
        l0 l0Var = new l0(null);
        this.f27690a = l0Var;
        this.f27691b = l0Var;
        wi.e eVar = new wi.e();
        this.f27692c = eVar;
        this.f27693d = eVar;
    }

    public final Object a(ArrayList arrayList, j jVar) {
        int size = arrayList.size();
        this.f27690a.h(new yj.i(new Integer(0), new Integer(size)));
        el.e eVar = g0.f37189a;
        return x.E(el.d.f23561c, new u(arrayList, this, size, null, 3), jVar);
    }
}
