package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f11341a;

    /* renamed from: b, reason: collision with root package name */
    public final bt1 f11342b;

    public g1(Handler handler, bt1 bt1Var, int i4) {
        switch (i4) {
            case 1:
                this.f11341a = handler;
                this.f11342b = bt1Var;
                break;
            default:
                if (bt1Var != null) {
                    handler.getClass();
                } else {
                    handler = null;
                }
                this.f11341a = handler;
                this.f11342b = bt1Var;
                break;
        }
    }

    public void a(vr vrVar) {
        Handler handler = this.f11341a;
        if (handler != null) {
            handler.post(new q81(1, this, vrVar));
        }
    }

    public void b(os1 os1Var) {
        synchronized (os1Var) {
        }
        Handler handler = this.f11341a;
        if (handler != null) {
            handler.post(new uh0(25, this, os1Var));
        }
    }

    public void c(os1 os1Var) {
        synchronized (os1Var) {
        }
        Handler handler = this.f11341a;
        if (handler != null) {
            handler.post(new q81(2, this, os1Var));
        }
    }
}
