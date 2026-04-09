package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final kg.r f4959a;

    /* renamed from: b, reason: collision with root package name */
    public kg.r f4960b;

    /* renamed from: c, reason: collision with root package name */
    public final bm.d f4961c;

    /* renamed from: d, reason: collision with root package name */
    public final t f4962d;

    public e0() {
        kg.r rVar = new kg.r(9);
        this.f4959a = rVar;
        this.f4960b = ((kg.r) rVar.f14396d).E();
        this.f4961c = new bm.d();
        this.f4962d = new t(3);
        final int i10 = 1;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f4903b;

            {
                this.f4903b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i10) {
                    case 0:
                        return new j4(this.f4903b.f4961c);
                    default:
                        return new j4(this.f4903b.f4962d);
                }
            }
        };
        w5 w5Var = (w5) rVar.f14398r;
        ((HashMap) w5Var.f5247a).put("internal.registerCallback", callable);
        final int i11 = 0;
        ((HashMap) w5Var.f5247a).put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f4903b;

            {
                this.f4903b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i11) {
                    case 0:
                        return new j4(this.f4903b.f4961c);
                    default:
                        return new j4(this.f4903b.f4962d);
                }
            }
        });
    }

    public final boolean a(b bVar) throws q0 {
        bm.d dVar = this.f4961c;
        try {
            dVar.f2826d = bVar;
            dVar.f2827g = bVar.clone();
            ((ArrayList) dVar.f2828r).clear();
            ((kg.r) this.f4959a.f14397g).G("runtime.counter", new g(Double.valueOf(0.0d)));
            this.f4962d.d(this.f4960b.E(), dVar);
            if (((b) dVar.f2827g).equals((b) dVar.f2826d)) {
                return !((ArrayList) dVar.f2828r).isEmpty();
            }
            return true;
        } catch (Throwable th2) {
            throw new q0(th2);
        }
    }

    public final void b(u3 u3Var) {
        h hVar;
        try {
            kg.r rVar = this.f4959a;
            this.f4960b = ((kg.r) rVar.f14396d).E();
            if (rVar.C(this.f4960b, (v3[]) u3Var.p().toArray(new v3[0])) instanceof f) {
                throw new IllegalStateException("Program loading failed");
            }
            for (t3 t3Var : u3Var.q().p()) {
                List listQ = t3Var.q();
                String strP = t3Var.p();
                Iterator it = listQ.iterator();
                while (it.hasNext()) {
                    n nVarC = rVar.C(this.f4960b, (v3) it.next());
                    if (!(nVarC instanceof k)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    kg.r rVar2 = this.f4960b;
                    if (rVar2.F(strP)) {
                        n nVarI = rVar2.I(strP);
                        if (!(nVarI instanceof h)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strP)));
                        }
                        hVar = (h) nVarI;
                    } else {
                        hVar = null;
                    }
                    if (hVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strP)));
                    }
                    hVar.f(this.f4960b, Collections.singletonList(nVarC));
                }
            }
        } catch (Throwable th2) {
            throw new q0(th2);
        }
    }
}
