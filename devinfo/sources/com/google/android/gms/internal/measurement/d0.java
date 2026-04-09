package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0.x0 f19654a;

    /* renamed from: b, reason: collision with root package name */
    public a0.x0 f19655b;

    /* renamed from: c, reason: collision with root package name */
    public final yb.e f19656c;

    /* renamed from: d, reason: collision with root package name */
    public final t f19657d;

    public d0() {
        a0.x0 x0Var = new a0.x0(10);
        this.f19654a = x0Var;
        this.f19655b = ((a0.x0) x0Var.f145b).T();
        this.f19656c = new yb.e(9);
        this.f19657d = new t(3);
        final int i4 = 1;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f19603b;

            {
                this.f19603b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i4) {
                    case 0:
                        return new k4(this.f19603b.f19656c);
                    default:
                        return new k4(this.f19603b.f19657d);
                }
            }
        };
        v5 v5Var = (v5) x0Var.f147d;
        ((HashMap) v5Var.f19970a).put("internal.registerCallback", callable);
        final int i10 = 0;
        ((HashMap) v5Var.f19970a).put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f19603b;

            {
                this.f19603b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i10) {
                    case 0:
                        return new k4(this.f19603b.f19656c);
                    default:
                        return new k4(this.f19603b.f19657d);
                }
            }
        });
    }

    public final boolean a(b bVar) throws p0 {
        yb.e eVar = this.f19656c;
        try {
            eVar.f37509b = bVar;
            eVar.f37510c = bVar.clone();
            ((ArrayList) eVar.f37511d).clear();
            ((a0.x0) this.f19654a.f146c).V("runtime.counter", new g(Double.valueOf(0.0d)));
            this.f19657d.d(this.f19655b.T(), eVar);
            if (((b) eVar.f37510c).equals((b) eVar.f37509b)) {
                return !((ArrayList) eVar.f37511d).isEmpty();
            }
            return true;
        } catch (Throwable th2) {
            throw new p0(th2);
        }
    }

    public final void b(v3 v3Var) {
        h hVar;
        try {
            a0.x0 x0Var = this.f19654a;
            this.f19655b = ((a0.x0) x0Var.f145b).T();
            if (x0Var.O(this.f19655b, (w3[]) v3Var.p().toArray(new w3[0])) instanceof f) {
                throw new IllegalStateException("Program loading failed");
            }
            for (u3 u3Var : v3Var.q().p()) {
                List listQ = u3Var.q();
                String strP = u3Var.p();
                Iterator it = listQ.iterator();
                while (it.hasNext()) {
                    n nVarO = x0Var.O(this.f19655b, (w3) it.next());
                    if (!(nVarO instanceof k)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    a0.x0 x0Var2 = this.f19655b;
                    if (x0Var2.U(strP)) {
                        n nVarX = x0Var2.X(strP);
                        if (!(nVarX instanceof h)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strP)));
                        }
                        hVar = (h) nVarX;
                    } else {
                        hVar = null;
                    }
                    if (hVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strP)));
                    }
                    hVar.b(this.f19655b, Collections.singletonList(nVarO));
                }
            }
        } catch (Throwable th2) {
            throw new p0(th2);
        }
    }
}
