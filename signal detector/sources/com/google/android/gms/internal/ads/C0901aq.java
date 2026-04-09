package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.aq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0901aq implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13231a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f13232b;

    public /* synthetic */ C0901aq(InterfaceC2069wN interfaceC2069wN, int i) {
        this.f13231a = i;
        this.f13232b = interfaceC2069wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        Object sb;
        int i = this.f13231a;
        InterfaceC2069wN interfaceC2069wN = this.f13232b;
        switch (i) {
            case 0:
                return new C2083wk(((C0540Hh) interfaceC2069wN).a());
            case 1:
                return new C1497lr((C0563In) interfaceC2069wN.c());
            case 2:
                return new C2090wr((C0784Vn) interfaceC2069wN.c());
            case 3:
                return new Gr(1, (Set) interfaceC2069wN.c());
            case 4:
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new Wr(c0623Mf, ((C0540Hh) interfaceC2069wN).a(), 0);
            case 5:
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf2);
                C1606ns c1606ns = new C1606ns(c0623Mf2, 0);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) interfaceC2069wN.c();
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8647O4)).booleanValue()) {
                    Lr lr = new Lr(c1606ns, ((Integer) r3.f23270c.a(H9.f8653P4)).intValue(), scheduledExecutorService);
                    int i3 = RB.f10866c;
                    sb = new SB(lr);
                } else {
                    int i6 = RB.f10866c;
                    sb = C1519mC.f15594j;
                }
                Cr.v(sb);
                return sb;
            case 6:
                C0623Mf c0623Mf3 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf3);
                return new Lr(new C1606ns(c0623Mf3, 1), ((Integer) C2841s.f23267e.f23270c.a(H9.wd)).intValue(), (ScheduledExecutorService) interfaceC2069wN.c());
            case 7:
                Context contextA = ((C0540Hh) interfaceC2069wN).a();
                C0623Mf c0623Mf4 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf4);
                return new Wr(contextA, c0623Mf4, 3);
            case 8:
                C0623Mf c0623Mf5 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf5);
                return new Wr(c0623Mf5, ((C0540Hh) interfaceC2069wN).a(), 4);
            case 9:
                C0623Mf c0623Mf6 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf6);
                return new Yr(c0623Mf6, 4, (C0581Jo) interfaceC2069wN.c());
            case 10:
                return new Gr(4, (Pt) interfaceC2069wN.c());
            case 11:
                C0623Mf c0623Mf7 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf7);
                return new Wr(c0623Mf7, ((C0540Hh) interfaceC2069wN).a(), 5);
            case 12:
                C0623Mf c0623Mf8 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf8);
                return new Yr(c0623Mf8, 5, (C1280ho) interfaceC2069wN.c());
            case 13:
                C0623Mf c0623Mf9 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf9);
                return new Wr(c0623Mf9, ((C0540Hh) interfaceC2069wN).a(), 6);
            case 14:
                C0623Mf c0623Mf10 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf10);
                ((C0540Hh) interfaceC2069wN).a();
                return new C1606ns(c0623Mf10, 3);
            case 15:
                return new C1391jt((C1554mu) interfaceC2069wN.c());
            case 16:
                return new It((C1554mu) interfaceC2069wN.c());
            case 17:
                return new C1068du((H6) interfaceC2069wN.c());
            case 18:
                return new C1922tl((C1500lu) interfaceC2069wN.c(), AbstractC0640Nf.f10011g);
            case 19:
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) interfaceC2069wN.c()));
                Cr.v(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
                return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
            case 20:
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) interfaceC2069wN.c();
                C0623Mf c0623Mf11 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf11);
                return new Hu(scheduledExecutorService2, c0623Mf11);
            case 21:
                return new Xu((Yu) interfaceC2069wN.c());
            case 22:
                return new Xu((Yu) interfaceC2069wN.c());
            case 23:
                return new C2094wv((C0633Mp) interfaceC2069wN.c());
            case 24:
                return new Yy((C1948uA) interfaceC2069wN.c());
            case 25:
                return new File(new File((File) interfaceC2069wN.c(), "drgd"), "pmtd.d");
            case 26:
                return new File(new File((File) interfaceC2069wN.c(), "drgd"), "pcbc.d");
            case 27:
                return new File(new File((File) interfaceC2069wN.c(), "drgd"), "pcam.jar.d");
            case 28:
                return new File(new File((File) interfaceC2069wN.c(), "drgd"), "pmtd");
            default:
                return new File(new File(new File((File) interfaceC2069wN.c(), "drgd"), "v"), "pcopt");
        }
    }
}
