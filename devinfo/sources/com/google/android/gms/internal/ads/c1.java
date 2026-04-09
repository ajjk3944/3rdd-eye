package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f9912b;

    public /* synthetic */ c1(g1 g1Var, long j, int i4) {
        this.f9911a = 1;
        this.f9912b = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f9911a;
        g1 g1Var = this.f9912b;
        g1Var.getClass();
        switch (i4) {
            case 0:
                String str = bq0.f9768a;
                wu1 wu1Var = g1Var.f11342b.f9804a.f12465s;
                wu1Var.l(wu1Var.p(), 1016, new su1(6));
                break;
            case 1:
                String str2 = bq0.f9768a;
                wu1 wu1Var2 = g1Var.f11342b.f9804a.f12465s;
                wu1Var2.l(wu1Var2.o((jy1) wu1Var2.f18200d.f9334e), 1021, new su1(9));
                break;
            case 2:
                String str3 = bq0.f9768a;
                wu1 wu1Var3 = g1Var.f11342b.f9804a.f12465s;
                wu1Var3.l(wu1Var3.p(), 1019, new su1(7));
                break;
            case 3:
                String str4 = bq0.f9768a;
                wu1 wu1Var4 = g1Var.f11342b.f9804a.f12465s;
                wu1Var4.l(wu1Var4.p(), 1030, new su1(10));
                break;
            default:
                String str5 = bq0.f9768a;
                wu1 wu1Var5 = g1Var.f11342b.f9804a.f12465s;
                wu1Var5.l(wu1Var5.p(), 1015, new su1(5));
                break;
        }
    }

    public /* synthetic */ c1(g1 g1Var, Object obj, int i4) {
        this.f9911a = i4;
        this.f9912b = g1Var;
    }

    public /* synthetic */ c1(g1 g1Var, String str, long j, long j8) {
        this.f9911a = 0;
        this.f9912b = g1Var;
    }
}
