package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class v21 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0 f17439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f17440c;

    public /* synthetic */ v21(xi0 xi0Var, Runnable runnable, int i4) {
        this.f17438a = i4;
        this.f17439b = xi0Var;
        this.f17440c = runnable;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f17438a) {
            case 0:
                xi0 xi0Var = this.f17439b;
                Runnable runnable = this.f17440c;
                if (((k21) xi0Var.j) != null || xi0Var.f18393b) {
                    if (!xi0Var.f18393b) {
                        runnable.run();
                        return;
                    }
                    ((ka1) xi0Var.f18395d).a("Waiting to bind to the service.", new Object[0]);
                    ArrayList arrayList = (ArrayList) xi0Var.f18397f;
                    synchronized (arrayList) {
                        arrayList.add(runnable);
                    }
                    return;
                }
                ((ka1) xi0Var.f18395d).a("Initiate binding to the service.", new Object[0]);
                ArrayList arrayList2 = (ArrayList) xi0Var.f18397f;
                synchronized (arrayList2) {
                    arrayList2.add(runnable);
                }
                t21 t21Var = new t21(xi0Var);
                xi0Var.f18399i = t21Var;
                xi0Var.f18393b = true;
                if (((Context) xi0Var.f18392a).bindService((Intent) xi0Var.g, t21Var, 1)) {
                    return;
                }
                ((ka1) xi0Var.f18395d).a("Failed to bind to the service.", new Object[0]);
                xi0Var.f18393b = false;
                ArrayList arrayList3 = (ArrayList) xi0Var.f18397f;
                synchronized (arrayList3) {
                    arrayList3.clear();
                }
                return;
            default:
                xi0 xi0Var2 = this.f17439b;
                try {
                    this.f17440c.run();
                    return;
                } catch (RuntimeException e2) {
                    ((ka1) xi0Var2.f18395d).d("error caused by ", e2);
                    return;
                }
        }
    }
}
