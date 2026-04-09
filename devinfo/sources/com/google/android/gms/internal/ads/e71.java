package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e71 extends m81 implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f10718k = 0;

    /* renamed from: h, reason: collision with root package name */
    public vd.b f10719h;

    /* renamed from: i, reason: collision with root package name */
    public Class f10720i;
    public Object j;

    public e71(vd.b bVar, Class cls, Object obj) {
        bVar.getClass();
        this.f10719h = bVar;
        this.f10720i = cls;
        this.j = obj;
    }

    @Override // com.google.android.gms.internal.ads.m71
    public final void g() {
        o(this.f10719h);
        this.f10719h = null;
        this.f10720i = null;
        this.j = null;
    }

    @Override // com.google.android.gms.internal.ads.m71
    public final String h() {
        String strM;
        vd.b bVar = this.f10719h;
        Class cls = this.f10720i;
        Object obj = this.j;
        String strH = super.h();
        if (bVar != null) {
            String string = bVar.toString();
            strM = r5.c.m(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strM = "";
        }
        if (cls == null || obj == null) {
            if (strH != null) {
                return strM.concat(strH);
            }
            return null;
        }
        int length = strM.length();
        String string2 = cls.toString();
        int length2 = string2.length();
        String string3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
        je.u.B(sb2, strM, "exceptionType=[", string2, "], fallback=[");
        return d.h.w(sb2, string3, "]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        vd.b bVar = this.f10719h;
        Class cls = this.f10720i;
        Object obj = this.j;
        if (((obj == null) || ((bVar == 0) | (cls == null))) || (this.f17113a instanceof f71)) {
            return;
        }
        this.f10719h = null;
        try {
            th = bVar instanceof i91 ? ((i91) bVar).b() : null;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(bVar.getClass());
                String strValueOf2 = String.valueOf(e2.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
                je.u.B(sb2, "Future type ", strValueOf, " threw ", strValueOf2);
                sb2.append(" without a cause");
                cause = new NullPointerException(sb2.toString());
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        Object objH = th == null ? yo0.H(bVar) : null;
        if (th == null) {
            e(objH);
            return;
        }
        if (!cls.isInstance(th)) {
            n(bVar);
            return;
        }
        try {
            Object objU = u(obj, th);
            this.f10720i = null;
            this.j = null;
            t(objU);
        } catch (Throwable th3) {
            try {
                if (th3 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                f(th3);
            } finally {
                this.f10720i = null;
                this.j = null;
            }
        }
    }

    public abstract void t(Object obj);

    public abstract Object u(Object obj, Throwable th2);
}
