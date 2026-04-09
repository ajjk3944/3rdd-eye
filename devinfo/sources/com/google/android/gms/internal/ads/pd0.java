package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt f14979b;

    public /* synthetic */ pd0(rt rtVar, int i4) {
        this.f14978a = i4;
        this.f14979b = rtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14978a) {
            case 0:
                rt rtVar = this.f14979b;
                ud0 ud0Var = ((qd0) rtVar.f15754c).f15315a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) rtVar.f15753b;
                ud0Var.getClass();
                if (!concurrentHashMap.isEmpty()) {
                    ud0Var.b(concurrentHashMap);
                    String strA = ud0Var.f17179f.a(concurrentHashMap);
                    ya.a0.m(strA);
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.ve)).booleanValue() || ud0Var.f17178e) {
                        ud0Var.f17176c.execute(new vd0(ud0Var, strA, 1));
                        break;
                    }
                } else {
                    za.i.c("Empty paramMap.");
                    break;
                }
                break;
            case 1:
                rt rtVar2 = this.f14979b;
                ((qd0) rtVar2.f15754c).f15315a.a((ConcurrentHashMap) rtVar2.f15753b, true);
                break;
            default:
                rt rtVar3 = this.f14979b;
                ((qd0) rtVar3.f15754c).f15315a.a((ConcurrentHashMap) rtVar3.f15753b, false);
                break;
        }
    }
}
