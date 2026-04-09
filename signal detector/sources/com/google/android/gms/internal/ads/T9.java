package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import q2.C2841s;

/* loaded from: classes.dex */
public final class T9 implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11349a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f11350b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f11351c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f11352d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f11353e;

    public /* synthetic */ T9(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, InterfaceC2069wN interfaceC2069wN4, int i) {
        this.f11349a = i;
        this.f11350b = interfaceC2069wN;
        this.f11351c = interfaceC2069wN2;
        this.f11352d = interfaceC2069wN3;
        this.f11353e = interfaceC2069wN4;
    }

    public K4.c a() {
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        return new K4.c(c0623Mf, (ScheduledExecutorService) this.f11350b.c(), (InterfaceC1920tj) this.f11351c.c(), (C0702Qq) this.f11352d.c(), (C2148xv) this.f11353e.c());
    }

    public S9 b() {
        return new S9((ScheduledExecutorService) this.f11350b.c(), (A2.L) this.f11351c.c(), (A2.G) this.f11352d.c(), (C0852Zn) this.f11353e.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f11349a) {
            case 0:
                return b();
            case 1:
                K7 k7 = (K7) this.f11350b.c();
                return new C0694Qi((Executor) this.f11351c.c(), new C0592Ki((Context) this.f11352d.c(), k7), (Q2.a) this.f11353e.c());
            case 2:
                return a();
            case 3:
                Yr yrA = ((Zr) this.f11350b).c();
                C1552ms c1552ms = (C1552ms) this.f11351c.c();
                List list = (List) this.f11352d.c();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11353e.c();
                if (list.contains("10")) {
                    return new Lr(c1552ms, ((Integer) C2841s.f23267e.f23270c.a(H9.rd)).intValue(), scheduledExecutorService);
                }
                return new Lr(yrA, ((Integer) C2841s.f23267e.f23270c.a(H9.rd)).intValue(), scheduledExecutorService);
            case 4:
                Yr yrA2 = ((C1176fs) this.f11350b).c();
                C1552ms c1552ms2 = (C1552ms) this.f11351c.c();
                List list2 = (List) this.f11352d.c();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f11353e.c();
                if (list2.contains("54")) {
                    return new Lr(c1552ms2, ((Integer) C2841s.f23267e.f23270c.a(H9.Bd)).intValue(), scheduledExecutorService2);
                }
                return new Lr(yrA2, ((Integer) C2841s.f23267e.f23270c.a(H9.Bd)).intValue(), scheduledExecutorService2);
            case 5:
                Wr wrC = ((C1284hs) this.f11350b).c();
                C1552ms c1552ms3 = (C1552ms) this.f11351c.c();
                List list3 = (List) this.f11352d.c();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.f11353e.c();
                if (list3.contains("13")) {
                    return new Lr(c1552ms3, ((Integer) C2841s.f23267e.f23270c.a(H9.Ad)).intValue(), scheduledExecutorService3);
                }
                return new Lr(wrC, ((Integer) C2841s.f23267e.f23270c.a(H9.Ad)).intValue(), scheduledExecutorService3);
            case 6:
                Yr yrC = ((C2037vs) this.f11350b).c();
                C1552ms c1552ms4 = (C1552ms) this.f11351c.c();
                List list4 = (List) this.f11352d.c();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.f11353e.c();
                if (list4.contains("60")) {
                    return new Lr(c1552ms4, ((Integer) C2841s.f23267e.f23270c.a(H9.be)).intValue(), scheduledExecutorService4);
                }
                return new Lr(yrC, ((Integer) C2841s.f23267e.f23270c.a(H9.be)).intValue(), scheduledExecutorService4);
            case 7:
                Jr jrC = ((Js) this.f11350b).c();
                C1552ms c1552ms5 = (C1552ms) this.f11351c.c();
                List list5 = (List) this.f11352d.c();
                ScheduledExecutorService scheduledExecutorService5 = (ScheduledExecutorService) this.f11353e.c();
                if (list5.contains("35")) {
                    return new Lr(c1552ms5, ((Integer) C2841s.f23267e.f23270c.a(H9.od)).intValue(), scheduledExecutorService5);
                }
                return new Lr(jrC, ((Integer) C2841s.f23267e.f23270c.a(H9.od)).intValue(), scheduledExecutorService5);
            case 8:
                Wr wrC2 = ((Ts) this.f11350b).c();
                C1552ms c1552ms6 = (C1552ms) this.f11351c.c();
                List list6 = (List) this.f11352d.c();
                ScheduledExecutorService scheduledExecutorService6 = (ScheduledExecutorService) this.f11353e.c();
                if (list6.contains("39")) {
                    return new Lr(c1552ms6, ((Integer) C2841s.f23267e.f23270c.a(H9.ld)).intValue(), scheduledExecutorService6);
                }
                return new Lr(wrC2, ((Integer) C2841s.f23267e.f23270c.a(H9.ld)).intValue(), scheduledExecutorService6);
            case 9:
                InterfaceC1692pN interfaceC1692pNB = C1799rN.b(this.f11350b);
                InterfaceC1692pN interfaceC1692pNB2 = C1799rN.b(this.f11351c);
                InterfaceC1692pN interfaceC1692pNB3 = C1799rN.b(this.f11352d);
                Xx xx = (Xx) this.f11353e.c();
                return new C2260zz(interfaceC1692pNB, interfaceC1692pNB2, interfaceC1692pNB3, xx.M().A(), xx.M().D());
            case 10:
                return new C1140fA((C2043vy) this.f11350b.c(), (C2043vy) this.f11351c.c(), C1799rN.b(this.f11352d), (C1948uA) this.f11353e.c());
            default:
                InterfaceC1692pN interfaceC1692pNB4 = C1799rN.b(this.f11350b);
                C1948uA c1948uA = (C1948uA) this.f11351c.c();
                return new C1249hA(interfaceC1692pNB4, c1948uA, ((Xx) this.f11353e.c()).M().B());
        }
    }
}
