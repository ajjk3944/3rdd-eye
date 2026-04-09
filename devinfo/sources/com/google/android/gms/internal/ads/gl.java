package com.google.android.gms.internal.ads;

import android.content.Context;
import j$.util.function.Function$CC;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gl implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11542a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f11543b;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f11544c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f11545d;

    public /* synthetic */ gl(int i4, es1 es1Var, es1 es1Var2, Object obj) {
        this.f11542a = i4;
        this.f11544c = es1Var;
        this.f11543b = (js1) obj;
        this.f11545d = es1Var2;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f11542a) {
            case 0:
                ((a10) this.f11543b).b();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11545d.a();
                return new fl(scheduledExecutorService);
            case 1:
                Context context = (Context) this.f11543b.a();
                return new w01(context, context.getSharedPreferences("pcvmspf2", 0), es1.c(this.f11544c), (g21) this.f11545d.a());
            case 2:
                File file = (File) this.f11544c.a();
                ly0 ly0Var = (ly0) this.f11543b.a();
                final g21 g21Var = (g21) this.f11545d.a();
                zy0 zy0VarF = zy0.F();
                final int i4 = 0;
                Function function = new Function() { // from class: com.google.android.gms.internal.ads.n11
                    public /* synthetic */ Function andThen(Function function2) {
                        int i10 = i4;
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i4) {
                            case 0:
                                g21Var.d(15308, th2);
                                return zy0.F();
                            case 1:
                                g21Var.d(15310, th2);
                                return new byte[0];
                            case 2:
                                g21Var.d(15310, th2);
                                return new byte[0];
                            case 3:
                                g21Var.d(15309, th2);
                                return new byte[0];
                            case 4:
                                g21Var.d(15309, th2);
                                return new byte[0];
                            case 5:
                                g21Var.d(15308, th2);
                                return zy0.F();
                            case 6:
                                g21Var.d(20310, th2);
                                return new byte[0];
                            case 7:
                                g21Var.d(20309, th2);
                                return new byte[0];
                            default:
                                g21Var.d(20308, th2);
                                return zy0.F();
                        }
                    }

                    public /* synthetic */ Function compose(Function function2) {
                        int i10 = i4;
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                ly0Var.getClass();
                return new ky0(file, ly0Var.f13680a, new rg0(16, zy0VarF), function);
            case 3:
                File file2 = (File) this.f11544c.a();
                ly0 ly0Var2 = (ly0) this.f11543b.a();
                final g21 g21Var2 = (g21) this.f11545d.a();
                final int i10 = 2;
                return ly0Var2.a(file2, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.n11
                    public /* synthetic */ Function andThen(Function function2) {
                        int i102 = i10;
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i10) {
                            case 0:
                                g21Var2.d(15308, th2);
                                return zy0.F();
                            case 1:
                                g21Var2.d(15310, th2);
                                return new byte[0];
                            case 2:
                                g21Var2.d(15310, th2);
                                return new byte[0];
                            case 3:
                                g21Var2.d(15309, th2);
                                return new byte[0];
                            case 4:
                                g21Var2.d(15309, th2);
                                return new byte[0];
                            case 5:
                                g21Var2.d(15308, th2);
                                return zy0.F();
                            case 6:
                                g21Var2.d(20310, th2);
                                return new byte[0];
                            case 7:
                                g21Var2.d(20309, th2);
                                return new byte[0];
                            default:
                                g21Var2.d(20308, th2);
                                return zy0.F();
                        }
                    }

                    public /* synthetic */ Function compose(Function function2) {
                        int i102 = i10;
                        return Function$CC.$default$compose(this, function2);
                    }
                });
            case 4:
                File file3 = (File) this.f11544c.a();
                ly0 ly0Var3 = (ly0) this.f11543b.a();
                final g21 g21Var3 = (g21) this.f11545d.a();
                final int i11 = 4;
                return ly0Var3.a(file3, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.n11
                    public /* synthetic */ Function andThen(Function function2) {
                        int i102 = i11;
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i11) {
                            case 0:
                                g21Var3.d(15308, th2);
                                return zy0.F();
                            case 1:
                                g21Var3.d(15310, th2);
                                return new byte[0];
                            case 2:
                                g21Var3.d(15310, th2);
                                return new byte[0];
                            case 3:
                                g21Var3.d(15309, th2);
                                return new byte[0];
                            case 4:
                                g21Var3.d(15309, th2);
                                return new byte[0];
                            case 5:
                                g21Var3.d(15308, th2);
                                return zy0.F();
                            case 6:
                                g21Var3.d(20310, th2);
                                return new byte[0];
                            case 7:
                                g21Var3.d(20309, th2);
                                return new byte[0];
                            default:
                                g21Var3.d(20308, th2);
                                return zy0.F();
                        }
                    }

                    public /* synthetic */ Function compose(Function function2) {
                        int i102 = i11;
                        return Function$CC.$default$compose(this, function2);
                    }
                });
            case 5:
                File file4 = (File) this.f11544c.a();
                ly0 ly0Var4 = (ly0) this.f11543b.a();
                final g21 g21Var4 = (g21) this.f11545d.a();
                zy0 zy0VarF2 = zy0.F();
                final int i12 = 5;
                Function function2 = new Function() { // from class: com.google.android.gms.internal.ads.n11
                    public /* synthetic */ Function andThen(Function function22) {
                        int i102 = i12;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i12) {
                            case 0:
                                g21Var4.d(15308, th2);
                                return zy0.F();
                            case 1:
                                g21Var4.d(15310, th2);
                                return new byte[0];
                            case 2:
                                g21Var4.d(15310, th2);
                                return new byte[0];
                            case 3:
                                g21Var4.d(15309, th2);
                                return new byte[0];
                            case 4:
                                g21Var4.d(15309, th2);
                                return new byte[0];
                            case 5:
                                g21Var4.d(15308, th2);
                                return zy0.F();
                            case 6:
                                g21Var4.d(20310, th2);
                                return new byte[0];
                            case 7:
                                g21Var4.d(20309, th2);
                                return new byte[0];
                            default:
                                g21Var4.d(20308, th2);
                                return zy0.F();
                        }
                    }

                    public /* synthetic */ Function compose(Function function22) {
                        int i102 = i12;
                        return Function$CC.$default$compose(this, function22);
                    }
                };
                ly0Var4.getClass();
                return new ky0(file4, ly0Var4.f13680a, new rg0(16, zy0VarF2), function2);
            case 6:
                File file5 = (File) this.f11544c.a();
                ly0 ly0Var5 = (ly0) this.f11543b.a();
                final g21 g21Var5 = (g21) this.f11545d.a();
                final int i13 = 1;
                return ly0Var5.a(file5, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.n11
                    public /* synthetic */ Function andThen(Function function22) {
                        int i102 = i13;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i13) {
                            case 0:
                                g21Var5.d(15308, th2);
                                return zy0.F();
                            case 1:
                                g21Var5.d(15310, th2);
                                return new byte[0];
                            case 2:
                                g21Var5.d(15310, th2);
                                return new byte[0];
                            case 3:
                                g21Var5.d(15309, th2);
                                return new byte[0];
                            case 4:
                                g21Var5.d(15309, th2);
                                return new byte[0];
                            case 5:
                                g21Var5.d(15308, th2);
                                return zy0.F();
                            case 6:
                                g21Var5.d(20310, th2);
                                return new byte[0];
                            case 7:
                                g21Var5.d(20309, th2);
                                return new byte[0];
                            default:
                                g21Var5.d(20308, th2);
                                return zy0.F();
                        }
                    }

                    public /* synthetic */ Function compose(Function function22) {
                        int i102 = i13;
                        return Function$CC.$default$compose(this, function22);
                    }
                });
            case 7:
                File file6 = (File) this.f11544c.a();
                ly0 ly0Var6 = (ly0) this.f11543b.a();
                final g21 g21Var6 = (g21) this.f11545d.a();
                final int i14 = 3;
                return ly0Var6.a(file6, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.n11
                    public /* synthetic */ Function andThen(Function function22) {
                        int i102 = i14;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i14) {
                            case 0:
                                g21Var6.d(15308, th2);
                                return zy0.F();
                            case 1:
                                g21Var6.d(15310, th2);
                                return new byte[0];
                            case 2:
                                g21Var6.d(15310, th2);
                                return new byte[0];
                            case 3:
                                g21Var6.d(15309, th2);
                                return new byte[0];
                            case 4:
                                g21Var6.d(15309, th2);
                                return new byte[0];
                            case 5:
                                g21Var6.d(15308, th2);
                                return zy0.F();
                            case 6:
                                g21Var6.d(20310, th2);
                                return new byte[0];
                            case 7:
                                g21Var6.d(20309, th2);
                                return new byte[0];
                            default:
                                g21Var6.d(20308, th2);
                                return zy0.F();
                        }
                    }

                    public /* synthetic */ Function compose(Function function22) {
                        int i102 = i14;
                        return Function$CC.$default$compose(this, function22);
                    }
                });
            case 8:
                return new p11((w01) this.f11544c.a(), (ExecutorService) this.f11543b.a(), (g21) this.f11545d.a());
            case 9:
                File file7 = (File) this.f11544c.a();
                ly0 ly0Var7 = (ly0) this.f11543b.a();
                final g21 g21Var7 = (g21) this.f11545d.a();
                zy0 zy0VarF3 = zy0.F();
                final int i15 = 8;
                Function function3 = new Function() { // from class: com.google.android.gms.internal.ads.n11
                    public /* synthetic */ Function andThen(Function function22) {
                        int i102 = i15;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i15) {
                            case 0:
                                g21Var7.d(15308, th2);
                                return zy0.F();
                            case 1:
                                g21Var7.d(15310, th2);
                                return new byte[0];
                            case 2:
                                g21Var7.d(15310, th2);
                                return new byte[0];
                            case 3:
                                g21Var7.d(15309, th2);
                                return new byte[0];
                            case 4:
                                g21Var7.d(15309, th2);
                                return new byte[0];
                            case 5:
                                g21Var7.d(15308, th2);
                                return zy0.F();
                            case 6:
                                g21Var7.d(20310, th2);
                                return new byte[0];
                            case 7:
                                g21Var7.d(20309, th2);
                                return new byte[0];
                            default:
                                g21Var7.d(20308, th2);
                                return zy0.F();
                        }
                    }

                    public /* synthetic */ Function compose(Function function22) {
                        int i102 = i15;
                        return Function$CC.$default$compose(this, function22);
                    }
                };
                ly0Var7.getClass();
                return new ky0(file7, ly0Var7.f13680a, new rg0(16, zy0VarF3), function3);
            case 10:
                File file8 = (File) this.f11544c.a();
                ly0 ly0Var8 = (ly0) this.f11543b.a();
                final g21 g21Var8 = (g21) this.f11545d.a();
                final int i16 = 6;
                return ly0Var8.a(file8, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.n11
                    public /* synthetic */ Function andThen(Function function22) {
                        int i102 = i16;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i16) {
                            case 0:
                                g21Var8.d(15308, th2);
                                return zy0.F();
                            case 1:
                                g21Var8.d(15310, th2);
                                return new byte[0];
                            case 2:
                                g21Var8.d(15310, th2);
                                return new byte[0];
                            case 3:
                                g21Var8.d(15309, th2);
                                return new byte[0];
                            case 4:
                                g21Var8.d(15309, th2);
                                return new byte[0];
                            case 5:
                                g21Var8.d(15308, th2);
                                return zy0.F();
                            case 6:
                                g21Var8.d(20310, th2);
                                return new byte[0];
                            case 7:
                                g21Var8.d(20309, th2);
                                return new byte[0];
                            default:
                                g21Var8.d(20308, th2);
                                return zy0.F();
                        }
                    }

                    public /* synthetic */ Function compose(Function function22) {
                        int i102 = i16;
                        return Function$CC.$default$compose(this, function22);
                    }
                });
            default:
                File file9 = (File) this.f11544c.a();
                ly0 ly0Var9 = (ly0) this.f11543b.a();
                final g21 g21Var9 = (g21) this.f11545d.a();
                final int i17 = 7;
                return ly0Var9.a(file9, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.n11
                    public /* synthetic */ Function andThen(Function function22) {
                        int i102 = i17;
                        return Function$CC.$default$andThen(this, function22);
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i17) {
                            case 0:
                                g21Var9.d(15308, th2);
                                return zy0.F();
                            case 1:
                                g21Var9.d(15310, th2);
                                return new byte[0];
                            case 2:
                                g21Var9.d(15310, th2);
                                return new byte[0];
                            case 3:
                                g21Var9.d(15309, th2);
                                return new byte[0];
                            case 4:
                                g21Var9.d(15309, th2);
                                return new byte[0];
                            case 5:
                                g21Var9.d(15308, th2);
                                return zy0.F();
                            case 6:
                                g21Var9.d(20310, th2);
                                return new byte[0];
                            case 7:
                                g21Var9.d(20309, th2);
                                return new byte[0];
                            default:
                                g21Var9.d(20308, th2);
                                return zy0.F();
                        }
                    }

                    public /* synthetic */ Function compose(Function function22) {
                        int i102 = i17;
                        return Function$CC.$default$compose(this, function22);
                    }
                });
        }
    }

    public gl(gs1 gs1Var, es1 es1Var, es1 es1Var2) {
        this.f11542a = 1;
        this.f11543b = gs1Var;
        this.f11544c = es1Var;
        this.f11545d = es1Var2;
    }

    public gl(js1 js1Var, js1 js1Var2, es1 es1Var) {
        this.f11542a = 0;
        this.f11543b = js1Var;
        this.f11545d = js1Var2;
        this.f11544c = es1Var;
    }
}
