package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import j$.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mh0 extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13891a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Timer f13892b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13893c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13894d;

    public mh0(qh0 qh0Var, AlertDialog alertDialog, Timer timer, xa.i iVar) {
        this.f13893c = alertDialog;
        this.f13892b = timer;
        this.f13894d = iVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f13891a) {
            case 0:
                ((AlertDialog) this.f13893c).dismiss();
                this.f13892b.cancel();
                xa.i iVar = (xa.i) this.f13894d;
                if (iVar != null) {
                    iVar.m();
                    break;
                }
                break;
            default:
                o6.f.f(((zt0) this.f13894d).f19176b, "omidJsSessionService");
                e00 e00Var = ((b00) ((ix0) this.f13893c).f12502b).f9521a;
                ya.b0 b0Var = ya.f0.f37440l;
                Objects.requireNonNull(e00Var);
                b0Var.post(new a00(e00Var, 0));
                this.f13892b.cancel();
                break;
        }
    }

    public mh0(zt0 zt0Var, ix0 ix0Var, Timer timer) {
        this.f13893c = ix0Var;
        this.f13892b = timer;
        Objects.requireNonNull(zt0Var);
        this.f13894d = zt0Var;
    }
}
