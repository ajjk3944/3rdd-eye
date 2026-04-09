package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cq implements oo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10194a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10195b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10196c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10197d;

    public cq(y50 y50Var, zp zpVar, nm.d0 d0Var) {
        this.f10195b = zpVar;
        this.f10196c = d0Var;
        this.f10197d = y50Var;
    }

    @Override // com.google.android.gms.internal.ads.oo
    public final void k(Object obj, Map map) {
        switch (this.f10194a) {
            case 0:
                ya.a0.m("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                y50 y50Var = (y50) this.f10197d;
                synchronized (y50Var.f18643b) {
                    try {
                        ya.a0.m("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        za.i.g("JS Engine is requesting an update");
                        if (y50Var.g == 0) {
                            za.i.g("Starting reload.");
                            y50Var.g = 2;
                            y50Var.a();
                        }
                        ((zp) this.f10195b).b("/requestReload", (cq) ((nm.d0) this.f10196c).f30011b);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ya.a0.m("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
            default:
                String str = (String) map.get("asset");
                try {
                    ((nn) this.f10195b).T1((jn) ((cs1) this.f10197d).a(), str);
                    return;
                } catch (RemoteException e2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40);
                    sb2.append("Failed to call onCustomClick for asset ");
                    sb2.append(str);
                    sb2.append(".");
                    za.i.i(sb2.toString(), e2);
                    return;
                }
        }
    }

    public cq(ka0 ka0Var, ga0 ga0Var, hc0 hc0Var, cs1 cs1Var) {
        this.f10195b = (nn) ka0Var.g.get(ga0Var.q());
        this.f10196c = hc0Var;
        this.f10197d = cs1Var;
    }
}
