package com.google.android.gms.internal.ads;

import a0.InterfaceC0252f;
import android.content.Context;
import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.ar, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902ar implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13233a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f13234b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f13235c;

    public /* synthetic */ C0902ar(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, int i) {
        this.f13233a = i;
        this.f13234b = interfaceC2069wN;
        this.f13235c = interfaceC2069wN2;
    }

    public C0821Xq a() {
        return new C0821Xq((C1497lr) this.f13234b.c(), (C0563In) this.f13235c.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f13233a) {
            case 0:
                return a();
            case 1:
                InterfaceFutureC2326a interfaceFutureC2326a = (InterfaceFutureC2326a) this.f13234b.c();
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new Qr(interfaceFutureC2326a, c0623Mf, (ScheduledExecutorService) this.f13235c.c(), 0);
            case 2:
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf2);
                C1606ns c1606ns = new C1606ns(c0623Mf2, 2);
                Q2.a aVar = (Q2.a) this.f13234b.c();
                Cr.v(c0623Mf2);
                return new C1552ms(c1606ns, ((Long) AbstractC0885aa.f13140f.v()).longValue(), aVar, c0623Mf2, (C0784Vn) this.f13235c.c());
            case 3:
                return new Pt((Q2.a) this.f13234b.c(), (C0784Vn) this.f13235c.c());
            case 4:
                return new Lr((C1552ms) this.f13234b.c(), ((Integer) C2841s.f23267e.f23270c.a(H9.zd)).intValue(), (ScheduledExecutorService) this.f13235c.c());
            case 5:
                return new Lr((C1552ms) this.f13234b.c(), ((Integer) C2841s.f23267e.f23270c.a(H9.md)).intValue(), (ScheduledExecutorService) this.f13235c.c());
            case 6:
                return new Ds((String) this.f13234b.c(), ((Integer) this.f13235c.c()).intValue());
            case 7:
                C1593nf c1593nf = (C1593nf) this.f13234b.c();
                C0623Mf c0623Mf3 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf3);
                return new Qr(c1593nf, c0623Mf3, ((C0540Hh) this.f13235c).a(), 3);
            case 8:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f13234b.c();
                ((C0540Hh) this.f13235c).a();
                return new Gr(6, scheduledExecutorService);
            case 9:
                return new C1500lu(((C0540Hh) this.f13234b).a(), ((C0659Oh) this.f13235c).c());
            case 10:
                return new Pu(((C0540Hh) this.f13234b).a(), (Xu) this.f13235c.c());
            case 11:
                return new Hv((Iv) this.f13234b.c(), (Cv) this.f13235c.c());
            case 12:
                InterfaceC0252f interfaceC0252f = (InterfaceC0252f) this.f13234b.c();
                C0623Mf c0623Mf4 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf4);
                return new C1009cp(interfaceC0252f, new Wu(2, c0623Mf4), (C0512Fn) this.f13235c.c(), new C1285ht(9, (byte) 0));
            case 13:
                Executor executor = (Executor) this.f13234b.c();
                return new C1720py(executor);
            case 14:
                return C1476lN.p((Context) this.f13234b.c(), (Cw) this.f13235c.c());
            default:
                return new C1948uA((Sx) this.f13234b.c(), (InterfaceC2259zy) this.f13235c.c());
        }
    }
}
