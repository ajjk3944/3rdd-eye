package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class JA implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0447Bq f9263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f9264c;

    public /* synthetic */ JA(C0447Bq c0447Bq, Runnable runnable, int i) {
        this.f9262a = i;
        this.f9263b = c0447Bq;
        this.f9264c = runnable;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f9262a) {
            case 0:
                C0447Bq c0447Bq = this.f9263b;
                Runnable runnable = this.f9264c;
                if (((InterfaceC2164yA) c0447Bq.f7453j) != null || c0447Bq.f7445a) {
                    if (!c0447Bq.f7445a) {
                        runnable.run();
                        return;
                    }
                    ((YD) c0447Bq.f7448d).c("Waiting to bind to the service.", new Object[0]);
                    ArrayList arrayList = (ArrayList) c0447Bq.f7450f;
                    synchronized (arrayList) {
                        arrayList.add(runnable);
                    }
                    return;
                }
                ((YD) c0447Bq.f7448d).c("Initiate binding to the service.", new Object[0]);
                ArrayList arrayList2 = (ArrayList) c0447Bq.f7450f;
                synchronized (arrayList2) {
                    arrayList2.add(runnable);
                }
                HA ha = new HA(c0447Bq);
                c0447Bq.i = ha;
                c0447Bq.f7445a = true;
                if (((Context) c0447Bq.f7446b).bindService((Intent) c0447Bq.f7451g, ha, 1)) {
                    return;
                }
                ((YD) c0447Bq.f7448d).c("Failed to bind to the service.", new Object[0]);
                c0447Bq.f7445a = false;
                ArrayList arrayList3 = (ArrayList) c0447Bq.f7450f;
                synchronized (arrayList3) {
                    arrayList3.clear();
                }
                return;
            default:
                C0447Bq c0447Bq2 = this.f9263b;
                try {
                    this.f9264c.run();
                    return;
                } catch (RuntimeException e6) {
                    ((YD) c0447Bq2.f7448d).f("error caused by ", e6);
                    return;
                }
        }
    }
}
