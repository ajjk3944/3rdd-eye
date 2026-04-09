package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f20205a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.d f20206b;

    public p0(r0 r0Var, l7.d dVar) {
        this.f20205a = r0Var;
        this.f20206b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thB;
        r0 r0Var = this.f20205a;
        boolean z3 = r0Var instanceof u0;
        l7.d dVar = this.f20206b;
        if (z3 && (thB = ((u0) r0Var).b()) != null) {
            dVar.g(thB);
            return;
        }
        try {
            boolean zIsDone = r0Var.isDone();
            boolean z10 = false;
            Future future = r0Var;
            if (!zIsDone) {
                throw new IllegalStateException(jm.a.C("Future was expected to be done: %s", r0Var));
            }
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    future = future;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            Integer num = (Integer) obj;
            int iIntValue = num.intValue();
            t7.o oVar = (t7.o) dVar.f28606d;
            if (iIntValue <= 0) {
                ((Runnable) dVar.f28605c).run();
                return;
            }
            int i4 = dVar.f28603a;
            int iIntValue2 = num.intValue();
            oVar.getClass();
            t7.c cVarA = t7.r.a(iIntValue2, "Billing override value was set by a license tester.");
            oVar.I(93, i4, cVarA);
            ((d4.a) dVar.f28604b).accept(cVarA);
        } catch (ExecutionException e2) {
            dVar.g(e2.getCause());
        } catch (Throwable th3) {
            dVar.g(th3);
        }
    }

    public final String toString() {
        yb.e eVar = new yb.e(p0.class.getSimpleName());
        k kVar = new k();
        ((k) eVar.f37511d).f20165b = kVar;
        eVar.f37511d = kVar;
        kVar.f20164a = this.f20206b;
        return eVar.toString();
    }
}
