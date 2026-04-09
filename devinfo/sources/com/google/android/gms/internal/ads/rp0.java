package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rp0 implements jb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ac.a f15727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mg f15728c;

    public /* synthetic */ rp0(mg mgVar, ac.a aVar, int i4) {
        this.f15726a = i4;
        this.f15727b = aVar;
        this.f15728c = mgVar;
    }

    @Override // jb.a
    public final void f() {
        switch (this.f15726a) {
            case 0:
                if (((sp0) this.f15728c).j != null) {
                    try {
                        va.p1 p1Var = (va.p1) this.f15727b;
                        p1Var.g1(p1Var.T(), 1);
                        break;
                    } catch (RemoteException e2) {
                        za.i.k("#007 Could not call remote method.", e2);
                        return;
                    }
                }
                break;
            default:
                if (((tp0) this.f15728c).f16917d != null) {
                    try {
                        va.n0 n0Var = (va.n0) this.f15727b;
                        n0Var.g1(n0Var.T(), 1);
                        break;
                    } catch (RemoteException e10) {
                        za.i.k("#007 Could not call remote method.", e10);
                    }
                }
                break;
        }
    }
}
