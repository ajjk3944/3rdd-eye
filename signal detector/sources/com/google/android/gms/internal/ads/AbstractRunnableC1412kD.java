package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.kD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1412kD extends AbstractC2167yD implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f15074j = 0;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceFutureC2326a f15075h;
    public Object i;

    public AbstractRunnableC1412kD(InterfaceFutureC2326a interfaceFutureC2326a, Object obj) {
        interfaceFutureC2326a.getClass();
        this.f15075h = interfaceFutureC2326a;
        this.i = obj;
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final void f() {
        n(this.f15075h);
        this.f15075h = null;
        this.i = null;
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final String g() {
        String strN;
        InterfaceFutureC2326a interfaceFutureC2326a = this.f15075h;
        Object obj = this.i;
        String strG = super.g();
        if (interfaceFutureC2326a != null) {
            String string = interfaceFutureC2326a.toString();
            strN = AbstractC1135f5.n(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strN = "";
        }
        if (obj == null) {
            if (strG != null) {
                return strN.concat(strG);
            }
            return null;
        }
        int length = strN.length();
        String string2 = obj.toString();
        return AbstractC1135f5.o(new StringBuilder(string2.length() + length + 10 + 1), strN, "function=[", string2, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC2326a interfaceFutureC2326a = this.f15075h;
        Object obj = this.i;
        if (((this.f14234a instanceof RC) | (interfaceFutureC2326a == null)) || (obj == null)) {
            return;
        }
        this.f15075h = null;
        if (interfaceFutureC2326a.isCancelled()) {
            m(interfaceFutureC2326a);
            return;
        }
        try {
            try {
                Object objT = t(obj, AbstractC1984ut.H(interfaceFutureC2326a));
                this.i = null;
                s(objT);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    e(th);
                } finally {
                    this.i = null;
                }
            }
        } catch (Error e6) {
            e(e6);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e7) {
            e(e7.getCause());
        } catch (Exception e8) {
            e(e8);
        }
    }

    public abstract void s(Object obj);

    public abstract Object t(Object obj, Object obj2);
}
