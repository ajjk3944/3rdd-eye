package com.google.android.gms.internal.ads;

import android.content.Context;
import j$.util.function.Function$CC;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;
import q2.C2841s;

/* loaded from: classes.dex */
public final class V9 implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11958a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f11959b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f11960c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f11961d;

    public /* synthetic */ V9(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, int i) {
        this.f11958a = i;
        this.f11959b = interfaceC2069wN;
        this.f11960c = interfaceC2069wN2;
        this.f11961d = interfaceC2069wN3;
    }

    public Jr a() {
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        return new Jr(c0623Mf, (C0563In) this.f11959b.c(), (C2087wo) this.f11960c.c(), (Vr) this.f11961d.c(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f11958a) {
            case 0:
                ((C0540Hh) this.f11959b).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11960c.c();
                return new U9(scheduledExecutorService);
            case 1:
                return new C0699Qn((C0750Tn) this.f11959b.c(), (C0852Zn) this.f11960c.c(), ((Integer) this.f11961d.c()).intValue());
            case 2:
                return new C1338iu((C1286hu) this.f11959b.c(), (C0546Hn) this.f11960c.c(), (C0784Vn) this.f11961d.c(), 24, false);
            case 3:
                return a();
            case 4:
                Context contextA = ((C0540Hh) this.f11959b).a();
                C0538Hf c0538Hf = (C0538Hf) this.f11960c.c();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f11961d.c();
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new C0903as(contextA, c0538Hf, scheduledExecutorService2, c0623Mf);
            case 5:
                Ms gr = new Gr(0, ((C0540Hh) ((Ir) this.f11959b).f9171a).a());
                Ms ms = (C1552ms) this.f11960c.c();
                if (true == ((List) this.f11961d.c()).contains("2")) {
                    gr = ms;
                }
                Cr.v(gr);
                return gr;
            case 6:
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf2);
                C1606ns c1606ns = new C1606ns(c0623Mf2, 2);
                C1552ms c1552ms = (C1552ms) this.f11959b.c();
                List list = (List) this.f11960c.c();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.f11961d.c();
                if (list.contains("24")) {
                    return new Lr(c1552ms, ((Integer) C2841s.f23267e.f23270c.a(H9.td)).intValue(), scheduledExecutorService3);
                }
                return new Lr(c1606ns, ((Integer) C2841s.f23267e.f23270c.a(H9.td)).intValue(), scheduledExecutorService3);
            case 7:
                Ms msC = ((Bs) this.f11959b).c();
                Ms ms2 = (C1552ms) this.f11960c.c();
                if (true == ((List) this.f11961d.c()).contains("29")) {
                    msC = ms2;
                }
                Cr.v(msC);
                return msC;
            case 8:
                return new Ot((Lt) this.f11959b.c(), (It) this.f11960c.c(), (Yt) this.f11961d.c());
            case 9:
                return new Iz((Context) this.f11959b.c(), (Xx) this.f11960c.c(), (C1355jA) this.f11961d.c());
            case 10:
                return new Hz((Context) this.f11959b.c(), (ExecutorService) this.f11960c.c(), (InterfaceC2259zy) this.f11961d.c());
            case 11:
                Context context = (Context) this.f11959b.c();
                return new Jz(context, context.getSharedPreferences("pcvmspf2", 0), C1799rN.b(this.f11960c), (C1948uA) this.f11961d.c());
            case 12:
                return new Kz((File) this.f11959b.c(), (Bw) this.f11960c.c(), (C1948uA) this.f11961d.c());
            case 13:
                InterfaceC1692pN interfaceC1692pNB = C1799rN.b(this.f11959b);
                InterfaceC1692pN interfaceC1692pNB2 = C1799rN.b(this.f11960c);
                if (true == ((Xx) this.f11961d.c()).W()) {
                    interfaceC1692pNB = interfaceC1692pNB2;
                }
                Wz wz = (Wz) interfaceC1692pNB.c();
                Cr.v(wz);
                return wz;
            case 14:
                File file = (File) this.f11959b.c();
                C2097wy c2097wy = (C2097wy) this.f11960c.c();
                final C1948uA c1948uA = (C1948uA) this.f11961d.c();
                Ly lyF = Ly.F();
                final int i = 0;
                Function function = new Function() { // from class: com.google.android.gms.internal.ads.aA
                    public final /* synthetic */ Function andThen(Function function2) {
                        int i3 = i;
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i) {
                            case 0:
                                c1948uA.d(15308, th);
                                return Ly.F();
                            case 1:
                                c1948uA.d(15310, th);
                                return new byte[0];
                            case 2:
                                c1948uA.d(15310, th);
                                return new byte[0];
                            case 3:
                                c1948uA.d(15309, th);
                                return new byte[0];
                            case 4:
                                c1948uA.d(15309, th);
                                return new byte[0];
                            case 5:
                                c1948uA.d(15308, th);
                                return Ly.F();
                            case 6:
                                c1948uA.d(20310, th);
                                return new byte[0];
                            case 7:
                                c1948uA.d(20309, th);
                                return new byte[0];
                            default:
                                c1948uA.d(20308, th);
                                return Ly.F();
                        }
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        int i3 = i;
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                c2097wy.getClass();
                return new C2043vy(file, c2097wy.f17523a, new Wu(3, lyF), function);
            case 15:
                File file2 = (File) this.f11959b.c();
                C2097wy c2097wy2 = (C2097wy) this.f11960c.c();
                final C1948uA c1948uA2 = (C1948uA) this.f11961d.c();
                final int i3 = 2;
                return c2097wy2.a(file2, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.aA
                    public final /* synthetic */ Function andThen(Function function2) {
                        int i32 = i3;
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i3) {
                            case 0:
                                c1948uA2.d(15308, th);
                                return Ly.F();
                            case 1:
                                c1948uA2.d(15310, th);
                                return new byte[0];
                            case 2:
                                c1948uA2.d(15310, th);
                                return new byte[0];
                            case 3:
                                c1948uA2.d(15309, th);
                                return new byte[0];
                            case 4:
                                c1948uA2.d(15309, th);
                                return new byte[0];
                            case 5:
                                c1948uA2.d(15308, th);
                                return Ly.F();
                            case 6:
                                c1948uA2.d(20310, th);
                                return new byte[0];
                            case 7:
                                c1948uA2.d(20309, th);
                                return new byte[0];
                            default:
                                c1948uA2.d(20308, th);
                                return Ly.F();
                        }
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        int i32 = i3;
                        return Function$CC.$default$compose(this, function2);
                    }
                });
            case 16:
                File file3 = (File) this.f11959b.c();
                C2097wy c2097wy3 = (C2097wy) this.f11960c.c();
                final C1948uA c1948uA3 = (C1948uA) this.f11961d.c();
                final int i6 = 4;
                return c2097wy3.a(file3, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.aA
                    public final /* synthetic */ Function andThen(Function function2) {
                        int i32 = i6;
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i6) {
                            case 0:
                                c1948uA3.d(15308, th);
                                return Ly.F();
                            case 1:
                                c1948uA3.d(15310, th);
                                return new byte[0];
                            case 2:
                                c1948uA3.d(15310, th);
                                return new byte[0];
                            case 3:
                                c1948uA3.d(15309, th);
                                return new byte[0];
                            case 4:
                                c1948uA3.d(15309, th);
                                return new byte[0];
                            case 5:
                                c1948uA3.d(15308, th);
                                return Ly.F();
                            case 6:
                                c1948uA3.d(20310, th);
                                return new byte[0];
                            case 7:
                                c1948uA3.d(20309, th);
                                return new byte[0];
                            default:
                                c1948uA3.d(20308, th);
                                return Ly.F();
                        }
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        int i32 = i6;
                        return Function$CC.$default$compose(this, function2);
                    }
                });
            case 17:
                File file4 = (File) this.f11959b.c();
                C2097wy c2097wy4 = (C2097wy) this.f11960c.c();
                final C1948uA c1948uA4 = (C1948uA) this.f11961d.c();
                Ly lyF2 = Ly.F();
                final int i7 = 5;
                Function function2 = new Function() { // from class: com.google.android.gms.internal.ads.aA
                    public final /* synthetic */ Function andThen(Function function22) {
                        int i32 = i7;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i7) {
                            case 0:
                                c1948uA4.d(15308, th);
                                return Ly.F();
                            case 1:
                                c1948uA4.d(15310, th);
                                return new byte[0];
                            case 2:
                                c1948uA4.d(15310, th);
                                return new byte[0];
                            case 3:
                                c1948uA4.d(15309, th);
                                return new byte[0];
                            case 4:
                                c1948uA4.d(15309, th);
                                return new byte[0];
                            case 5:
                                c1948uA4.d(15308, th);
                                return Ly.F();
                            case 6:
                                c1948uA4.d(20310, th);
                                return new byte[0];
                            case 7:
                                c1948uA4.d(20309, th);
                                return new byte[0];
                            default:
                                c1948uA4.d(20308, th);
                                return Ly.F();
                        }
                    }

                    public final /* synthetic */ Function compose(Function function22) {
                        int i32 = i7;
                        return Function$CC.$default$compose(this, function22);
                    }
                };
                c2097wy4.getClass();
                return new C2043vy(file4, c2097wy4.f17523a, new Wu(3, lyF2), function2);
            case 18:
                File file5 = (File) this.f11959b.c();
                C2097wy c2097wy5 = (C2097wy) this.f11960c.c();
                final C1948uA c1948uA5 = (C1948uA) this.f11961d.c();
                final int i8 = 1;
                return c2097wy5.a(file5, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.aA
                    public final /* synthetic */ Function andThen(Function function22) {
                        int i32 = i8;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i8) {
                            case 0:
                                c1948uA5.d(15308, th);
                                return Ly.F();
                            case 1:
                                c1948uA5.d(15310, th);
                                return new byte[0];
                            case 2:
                                c1948uA5.d(15310, th);
                                return new byte[0];
                            case 3:
                                c1948uA5.d(15309, th);
                                return new byte[0];
                            case 4:
                                c1948uA5.d(15309, th);
                                return new byte[0];
                            case 5:
                                c1948uA5.d(15308, th);
                                return Ly.F();
                            case 6:
                                c1948uA5.d(20310, th);
                                return new byte[0];
                            case 7:
                                c1948uA5.d(20309, th);
                                return new byte[0];
                            default:
                                c1948uA5.d(20308, th);
                                return Ly.F();
                        }
                    }

                    public final /* synthetic */ Function compose(Function function22) {
                        int i32 = i8;
                        return Function$CC.$default$compose(this, function22);
                    }
                });
            case 19:
                File file6 = (File) this.f11959b.c();
                C2097wy c2097wy6 = (C2097wy) this.f11960c.c();
                final C1948uA c1948uA6 = (C1948uA) this.f11961d.c();
                final int i9 = 3;
                return c2097wy6.a(file6, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.aA
                    public final /* synthetic */ Function andThen(Function function22) {
                        int i32 = i9;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i9) {
                            case 0:
                                c1948uA6.d(15308, th);
                                return Ly.F();
                            case 1:
                                c1948uA6.d(15310, th);
                                return new byte[0];
                            case 2:
                                c1948uA6.d(15310, th);
                                return new byte[0];
                            case 3:
                                c1948uA6.d(15309, th);
                                return new byte[0];
                            case 4:
                                c1948uA6.d(15309, th);
                                return new byte[0];
                            case 5:
                                c1948uA6.d(15308, th);
                                return Ly.F();
                            case 6:
                                c1948uA6.d(20310, th);
                                return new byte[0];
                            case 7:
                                c1948uA6.d(20309, th);
                                return new byte[0];
                            default:
                                c1948uA6.d(20308, th);
                                return Ly.F();
                        }
                    }

                    public final /* synthetic */ Function compose(Function function22) {
                        int i32 = i9;
                        return Function$CC.$default$compose(this, function22);
                    }
                });
            case 20:
                return new C1031dA((Jz) this.f11959b.c(), (ExecutorService) this.f11960c.c(), (C1948uA) this.f11961d.c());
            case 21:
                File file7 = (File) this.f11959b.c();
                C2097wy c2097wy7 = (C2097wy) this.f11960c.c();
                final C1948uA c1948uA7 = (C1948uA) this.f11961d.c();
                Ly lyF3 = Ly.F();
                final int i10 = 8;
                Function function3 = new Function() { // from class: com.google.android.gms.internal.ads.aA
                    public final /* synthetic */ Function andThen(Function function22) {
                        int i32 = i10;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i10) {
                            case 0:
                                c1948uA7.d(15308, th);
                                return Ly.F();
                            case 1:
                                c1948uA7.d(15310, th);
                                return new byte[0];
                            case 2:
                                c1948uA7.d(15310, th);
                                return new byte[0];
                            case 3:
                                c1948uA7.d(15309, th);
                                return new byte[0];
                            case 4:
                                c1948uA7.d(15309, th);
                                return new byte[0];
                            case 5:
                                c1948uA7.d(15308, th);
                                return Ly.F();
                            case 6:
                                c1948uA7.d(20310, th);
                                return new byte[0];
                            case 7:
                                c1948uA7.d(20309, th);
                                return new byte[0];
                            default:
                                c1948uA7.d(20308, th);
                                return Ly.F();
                        }
                    }

                    public final /* synthetic */ Function compose(Function function22) {
                        int i32 = i10;
                        return Function$CC.$default$compose(this, function22);
                    }
                };
                c2097wy7.getClass();
                return new C2043vy(file7, c2097wy7.f17523a, new Wu(3, lyF3), function3);
            case 22:
                File file8 = (File) this.f11959b.c();
                C2097wy c2097wy8 = (C2097wy) this.f11960c.c();
                final C1948uA c1948uA8 = (C1948uA) this.f11961d.c();
                final int i11 = 6;
                return c2097wy8.a(file8, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.aA
                    public final /* synthetic */ Function andThen(Function function22) {
                        int i32 = i11;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i11) {
                            case 0:
                                c1948uA8.d(15308, th);
                                return Ly.F();
                            case 1:
                                c1948uA8.d(15310, th);
                                return new byte[0];
                            case 2:
                                c1948uA8.d(15310, th);
                                return new byte[0];
                            case 3:
                                c1948uA8.d(15309, th);
                                return new byte[0];
                            case 4:
                                c1948uA8.d(15309, th);
                                return new byte[0];
                            case 5:
                                c1948uA8.d(15308, th);
                                return Ly.F();
                            case 6:
                                c1948uA8.d(20310, th);
                                return new byte[0];
                            case 7:
                                c1948uA8.d(20309, th);
                                return new byte[0];
                            default:
                                c1948uA8.d(20308, th);
                                return Ly.F();
                        }
                    }

                    public final /* synthetic */ Function compose(Function function22) {
                        int i32 = i11;
                        return Function$CC.$default$compose(this, function22);
                    }
                });
            case 23:
                File file9 = (File) this.f11959b.c();
                C2097wy c2097wy9 = (C2097wy) this.f11960c.c();
                final C1948uA c1948uA9 = (C1948uA) this.f11961d.c();
                final int i12 = 7;
                return c2097wy9.a(file9, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.aA
                    public final /* synthetic */ Function andThen(Function function22) {
                        int i32 = i12;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i12) {
                            case 0:
                                c1948uA9.d(15308, th);
                                return Ly.F();
                            case 1:
                                c1948uA9.d(15310, th);
                                return new byte[0];
                            case 2:
                                c1948uA9.d(15310, th);
                                return new byte[0];
                            case 3:
                                c1948uA9.d(15309, th);
                                return new byte[0];
                            case 4:
                                c1948uA9.d(15309, th);
                                return new byte[0];
                            case 5:
                                c1948uA9.d(15308, th);
                                return Ly.F();
                            case 6:
                                c1948uA9.d(20310, th);
                                return new byte[0];
                            case 7:
                                c1948uA9.d(20309, th);
                                return new byte[0];
                            default:
                                c1948uA9.d(20308, th);
                                return Ly.F();
                        }
                    }

                    public final /* synthetic */ Function compose(Function function22) {
                        int i32 = i12;
                        return Function$CC.$default$compose(this, function22);
                    }
                });
            default:
                return new C1303iA((C1948uA) this.f11960c.c(), ((Xx) this.f11961d.c()).M().B());
        }
    }
}
