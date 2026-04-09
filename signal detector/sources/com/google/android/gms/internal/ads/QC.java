package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public abstract class QC extends AbstractC2167yD implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10587k = 0;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceFutureC2326a f10588h;
    public Class i;

    /* renamed from: j, reason: collision with root package name */
    public Object f10589j;

    public QC(InterfaceFutureC2326a interfaceFutureC2326a, Class cls, Object obj) {
        interfaceFutureC2326a.getClass();
        this.f10588h = interfaceFutureC2326a;
        this.i = cls;
        this.f10589j = obj;
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final void f() {
        n(this.f10588h);
        this.f10588h = null;
        this.i = null;
        this.f10589j = null;
    }

    @Override // com.google.android.gms.internal.ads.YC
    public final String g() {
        String strN;
        InterfaceFutureC2326a interfaceFutureC2326a = this.f10588h;
        Class cls = this.i;
        Object obj = this.f10589j;
        String strG = super.g();
        if (interfaceFutureC2326a != null) {
            String string = interfaceFutureC2326a.toString();
            strN = AbstractC1135f5.n(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strN = "";
        }
        if (cls == null || obj == null) {
            if (strG != null) {
                return strN.concat(strG);
            }
            return null;
        }
        int length = strN.length();
        String string2 = cls.toString();
        int length2 = string2.length();
        String string3 = obj.toString();
        StringBuilder sb = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
        A.f.w(sb, strN, "exceptionType=[", string2, "], fallback=[");
        return A.f.p(sb, string3, "]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC2326a interfaceFutureC2326a = this.f10588h;
        Class cls = this.i;
        Object obj = this.f10589j;
        if (((obj == null) || ((interfaceFutureC2326a == 0) | (cls == null))) || (this.f14234a instanceof RC)) {
            return;
        }
        this.f10588h = null;
        try {
            th = interfaceFutureC2326a instanceof UD ? ((UD) interfaceFutureC2326a).b() : null;
        } catch (ExecutionException e6) {
            Throwable cause = e6.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(interfaceFutureC2326a.getClass());
                String strValueOf2 = String.valueOf(e6.getClass());
                StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
                A.f.w(sb, "Future type ", strValueOf, " threw ", strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objH = th == null ? AbstractC1984ut.H(interfaceFutureC2326a) : null;
        if (th == null) {
            d(objH);
            return;
        }
        if (!cls.isInstance(th)) {
            m(interfaceFutureC2326a);
            return;
        }
        try {
            Object objT = t(obj, th);
            this.i = null;
            this.f10589j = null;
            s(objT);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                e(th2);
            } finally {
                this.i = null;
                this.f10589j = null;
            }
        }
    }

    public abstract void s(Object obj);

    public abstract Object t(Object obj, Throwable th);
}
