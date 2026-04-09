package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f15458b;

    public /* synthetic */ qv1(g1 g1Var, int i4, long j, long j8) {
        this.f15457a = 3;
        this.f15458b = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f15457a;
        int i10 = 2;
        g1 g1Var = this.f15458b;
        g1Var.getClass();
        switch (i4) {
            case 0:
                String str = bq0.f9768a;
                wu1 wu1Var = g1Var.f11342b.f9804a.f12465s;
                wu1Var.l(wu1Var.p(), 1008, new uu1(i10));
                break;
            case 1:
                String str2 = bq0.f9768a;
                wu1 wu1Var2 = g1Var.f11342b.f9804a.f12465s;
                wu1Var2.l(wu1Var2.p(), 1032, new su1(3));
                break;
            case 2:
                String str3 = bq0.f9768a;
                wu1 wu1Var3 = g1Var.f11342b.f9804a.f12465s;
                wu1Var3.l(wu1Var3.p(), TTAdConstant.IMAGE_MODE_1010, new uu1(4));
                break;
            case 3:
                String str4 = bq0.f9768a;
                wu1 wu1Var4 = g1Var.f11342b.f9804a.f12465s;
                wu1Var4.l(wu1Var4.p(), TTAdConstant.IMAGE_MODE_1011, new uu1(5));
                break;
            case 4:
                String str5 = bq0.f9768a;
                wu1 wu1Var5 = g1Var.f11342b.f9804a.f12465s;
                wu1Var5.l(wu1Var5.p(), TTAdConstant.IMAGE_MODE_1012, new uu1(6));
                break;
            case 5:
                String str6 = bq0.f9768a;
                wu1 wu1Var6 = g1Var.f11342b.f9804a.f12465s;
                wu1Var6.l(wu1Var6.p(), 1014, new su1(0));
                break;
            case 6:
                String str7 = bq0.f9768a;
                wu1 wu1Var7 = g1Var.f11342b.f9804a.f12465s;
                wu1Var7.l(wu1Var7.p(), 1029, new su1(1));
                break;
            case 7:
                String str8 = bq0.f9768a;
                wu1 wu1Var8 = g1Var.f11342b.f9804a.f12465s;
                wu1Var8.l(wu1Var8.p(), 1031, new su1(2));
                break;
            default:
                String str9 = bq0.f9768a;
                wu1 wu1Var9 = g1Var.f11342b.f9804a.f12465s;
                wu1Var9.l(wu1Var9.p(), 1007, new su1(25));
                break;
        }
    }

    public /* synthetic */ qv1(g1 g1Var, long j) {
        this.f15457a = 2;
        this.f15458b = g1Var;
    }

    public /* synthetic */ qv1(g1 g1Var, Object obj, int i4) {
        this.f15457a = i4;
        this.f15458b = g1Var;
    }

    public /* synthetic */ qv1(g1 g1Var, String str, long j, long j8) {
        this.f15457a = 0;
        this.f15458b = g1Var;
    }
}
