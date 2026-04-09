package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import q2.C2841s;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.Un, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0767Un implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0697Ql f11787b;

    public /* synthetic */ RunnableC0767Un(C0697Ql c0697Ql, int i) {
        this.f11786a = i;
        this.f11787b = c0697Ql;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11786a) {
            case 0:
                C0697Ql c0697Ql = this.f11787b;
                C0852Zn c0852Zn = ((C0784Vn) c0697Ql.f10692c).f12083a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0697Ql.f10691b;
                c0852Zn.getClass();
                if (!concurrentHashMap.isEmpty()) {
                    c0852Zn.b(concurrentHashMap);
                    String strA = c0852Zn.f12963f.a(concurrentHashMap);
                    AbstractC2907C.m(strA);
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.te)).booleanValue() || c0852Zn.f12962e) {
                        c0852Zn.f12960c.execute(new RunnableC0899ao(c0852Zn, strA, 1));
                        break;
                    }
                } else {
                    u2.k.c("Empty paramMap.");
                    break;
                }
                break;
            case 1:
                C0697Ql c0697Ql2 = this.f11787b;
                ((C0784Vn) c0697Ql2.f10692c).f12083a.a((ConcurrentHashMap) c0697Ql2.f10691b, true);
                break;
            default:
                C0697Ql c0697Ql3 = this.f11787b;
                ((C0784Vn) c0697Ql3.f10692c).f12083a.a((ConcurrentHashMap) c0697Ql3.f10691b, false);
                break;
        }
    }
}
