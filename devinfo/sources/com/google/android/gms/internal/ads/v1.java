package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v1 implements b2 {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f17416c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: d, reason: collision with root package name */
    public static final ce1 f17417d = new ce1(w5.f17900n);

    /* renamed from: e, reason: collision with root package name */
    public static final ce1 f17418e = new ce1(w5.f17899m);

    /* renamed from: a, reason: collision with root package name */
    public u51 f17419a;

    /* renamed from: b, reason: collision with root package name */
    public final w5 f17420b = new w5(19);

    /* JADX WARN: Removed duplicated region for block: B:118:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d6 A[PHI: r18
  0x01d6: PHI (r18v2 int) = (r18v0 int), (r18v1 int), (r18v1 int) binds: [B:125:0x01d4, B:128:0x01e2, B:131:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    @Override // com.google.android.gms.internal.ads.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.x1[] a(android.net.Uri r26, java.util.Map r27) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v1.a(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.x1[]");
    }

    public final void b(int i4, ArrayList arrayList) {
        w5 w5Var = this.f17420b;
        switch (i4) {
            case 0:
                arrayList.add(new h6(1));
                break;
            case 1:
                arrayList.add(new h6(2));
                break;
            case 2:
                arrayList.add(new e8());
                break;
            case 3:
                arrayList.add(new x2());
                break;
            case 4:
                x1 x1VarA = f17417d.a(0);
                if (x1VarA == null) {
                    arrayList.add(new j3());
                    break;
                } else {
                    arrayList.add(x1VarA);
                    break;
                }
            case 5:
                arrayList.add(new l3());
                break;
            case 6:
                arrayList.add(new v4(new c2.f(1), 0, w5Var));
                break;
            case 7:
                arrayList.add(new z4());
                break;
            case 8:
                arrayList.add(new r5(w5Var, 0, u51.f17096e));
                arrayList.add(new v5(w5Var, 0));
                break;
            case 9:
                arrayList.add(new h6(0));
                break;
            case 10:
                arrayList.add(new b9());
                break;
            case 11:
                if (this.f17419a == null) {
                    v41 v41Var = x41.f18307b;
                    this.f17419a = u51.f17096e;
                }
                zo0 zo0Var = new zo0();
                u51 u51Var = this.f17419a;
                g8 g8Var = new g8();
                g8Var.f11399a = u51Var;
                arrayList.add(new f9(w5Var, zo0Var, g8Var));
                break;
            case 12:
                m9 m9Var = new m9();
                m9Var.f13802c = 0;
                m9Var.f13803d = -1L;
                m9Var.f13805f = -1;
                m9Var.g = -1L;
                arrayList.add(m9Var);
                break;
            case 14:
                arrayList.add(new q3(1));
                break;
            case 15:
                x1 x1VarA2 = f17418e.a(new Object[0]);
                if (x1VarA2 != null) {
                    arrayList.add(x1VarA2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new z2(w5Var));
                break;
            case 17:
                arrayList.add(new h3(1));
                break;
            case 18:
                arrayList.add(new g3(1));
                break;
            case 19:
                arrayList.add(new h3(0));
                break;
            case 20:
                arrayList.add(new q3(0));
                break;
            case 21:
                arrayList.add(new g3(0));
                break;
        }
    }
}
