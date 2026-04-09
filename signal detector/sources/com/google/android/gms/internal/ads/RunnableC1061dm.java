package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import f4.InterfaceFutureC2326a;

/* renamed from: com.google.android.gms.internal.ads.dm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1061dm implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1278hm f13802b;

    public /* synthetic */ RunnableC1061dm(C1278hm c1278hm, int i) {
        this.f13801a = i;
        this.f13802b = c1278hm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13801a) {
            case 0:
                C1278hm c1278hm = this.f13802b;
                c1278hm.f14568n.M();
                C1492lm c1492lm = c1278hm.f14567m;
                synchronized (c1492lm) {
                    try {
                        InterfaceC0828Yg interfaceC0828Yg = c1492lm.i;
                        if (interfaceC0828Yg != null) {
                            interfaceC0828Yg.destroy();
                            c1492lm.i = null;
                        }
                        InterfaceC0828Yg interfaceC0828Yg2 = c1492lm.f15443j;
                        if (interfaceC0828Yg2 != null) {
                            interfaceC0828Yg2.destroy();
                            c1492lm.f15443j = null;
                        }
                        InterfaceC0828Yg interfaceC0828Yg3 = c1492lm.f15444k;
                        if (interfaceC0828Yg3 != null) {
                            interfaceC0828Yg3.destroy();
                            c1492lm.f15444k = null;
                        }
                        InterfaceFutureC2326a interfaceFutureC2326a = c1492lm.f15446m;
                        if (interfaceFutureC2326a != null) {
                            interfaceFutureC2326a.cancel(false);
                            c1492lm.f15446m = null;
                        }
                        C0657Of c0657Of = c1492lm.f15447n;
                        if (c0657Of != null) {
                            c0657Of.cancel(false);
                            c1492lm.f15447n = null;
                        }
                        c1492lm.f15445l = null;
                        c1492lm.f15455v.clear();
                        c1492lm.f15456w.clear();
                        c1492lm.f15436b = null;
                        c1492lm.f15437c = null;
                        c1492lm.f15438d = null;
                        c1492lm.f15439e = null;
                        c1492lm.f15442h = null;
                        c1492lm.f15448o = null;
                        c1492lm.f15449p = null;
                        c1492lm.f15450q = null;
                        c1492lm.f15452s = null;
                        c1492lm.f15453t = null;
                        c1492lm.f15454u = null;
                    } finally {
                    }
                }
                return;
            default:
                C1278hm c1278hm2 = this.f13802b;
                C1708pm c1708pm = c1278hm2.f14571q;
                try {
                    C1492lm c1492lm2 = c1278hm2.f14567m;
                    int iW = c1492lm2.W();
                    if (iW == 1) {
                        C0941bb c0941bb = c1708pm.f16216a;
                        if (c0941bb != null) {
                            c1278hm2.q();
                            InterfaceC0805Xa interfaceC0805Xa = (InterfaceC0805Xa) c1278hm2.f14572r.c();
                            Parcel parcelH0 = c0941bb.h0();
                            C7.e(parcelH0, interfaceC0805Xa);
                            c0941bb.I0(parcelH0, 1);
                            return;
                        }
                        return;
                    }
                    if (iW == 2) {
                        C0886ab c0886ab = c1708pm.f16217b;
                        if (c0886ab != null) {
                            c1278hm2.q();
                            InterfaceC0788Wa interfaceC0788Wa = (InterfaceC0788Wa) c1278hm2.f14573s.c();
                            Parcel parcelH02 = c0886ab.h0();
                            C7.e(parcelH02, interfaceC0788Wa);
                            c0886ab.I0(parcelH02, 1);
                            return;
                        }
                        return;
                    }
                    if (iW == 3) {
                        String strQ = c1492lm2.q();
                        InterfaceC1159fb interfaceC1159fb = strQ == null ? null : (InterfaceC1159fb) c1708pm.f16221f.get(strQ);
                        if (interfaceC1159fb != null) {
                            if (c1492lm2.r() != null) {
                                c1278hm2.g("Google", true);
                            }
                            interfaceC1159fb.B3((InterfaceC0839Za) c1278hm2.f14576v.c());
                            return;
                        }
                        return;
                    }
                    if (iW == 6) {
                        InterfaceC1427kb interfaceC1427kb = c1708pm.f16218c;
                        if (interfaceC1427kb != null) {
                            c1278hm2.q();
                            interfaceC1427kb.C1((InterfaceC1589nb) c1278hm2.f14574t.c());
                            return;
                        }
                        return;
                    }
                    if (iW != 7) {
                        u2.k.e("Wrong native template id!");
                        return;
                    }
                    C1160fc c1160fc = c1708pm.f16220e;
                    if (c1160fc != null) {
                        InterfaceC0996cc interfaceC0996cc = (InterfaceC0996cc) c1278hm2.f14575u.c();
                        Parcel parcelH03 = c1160fc.h0();
                        C7.e(parcelH03, interfaceC0996cc);
                        c1160fc.I0(parcelH03, 1);
                        return;
                    }
                    return;
                } catch (RemoteException e6) {
                    u2.k.f("RemoteException when notifyAdLoad is called", e6);
                    return;
                }
        }
    }
}
