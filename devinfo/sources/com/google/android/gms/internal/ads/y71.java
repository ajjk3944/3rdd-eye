package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class y71 extends m81 implements Runnable {
    public static final /* synthetic */ int j = 0;

    /* renamed from: h, reason: collision with root package name */
    public vd.b f18666h;

    /* renamed from: i, reason: collision with root package name */
    public Object f18667i;

    public y71(Object obj, vd.b bVar) {
        bVar.getClass();
        this.f18666h = bVar;
        this.f18667i = obj;
    }

    @Override // com.google.android.gms.internal.ads.m71
    public final void g() {
        o(this.f18666h);
        this.f18666h = null;
        this.f18667i = null;
    }

    @Override // com.google.android.gms.internal.ads.m71
    public final String h() {
        String strM;
        vd.b bVar = this.f18666h;
        Object obj = this.f18667i;
        String strH = super.h();
        if (bVar != null) {
            String string = bVar.toString();
            strM = r5.c.m(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strM = "";
        }
        if (obj == null) {
            if (strH != null) {
                return strM.concat(strH);
            }
            return null;
        }
        int length = strM.length();
        String string2 = obj.toString();
        return a0.g.p(new StringBuilder(string2.length() + length + 10 + 1), strM, "function=[", string2, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        vd.b bVar = this.f18666h;
        Object obj = this.f18667i;
        if (((this.f17113a instanceof f71) | (bVar == null)) || (obj == null)) {
            return;
        }
        this.f18666h = null;
        if (bVar.isCancelled()) {
            n(bVar);
            return;
        }
        try {
            try {
                Object objU = u(obj, yo0.H(bVar));
                this.f18667i = null;
                t(objU);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    f(th2);
                } finally {
                    this.f18667i = null;
                }
            }
        } catch (Error e2) {
            f(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e10) {
            f(e10.getCause());
        } catch (Exception e11) {
            f(e11);
        }
    }

    public abstract void t(Object obj);

    public abstract Object u(Object obj, Object obj2);
}
