package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Gr implements Ms {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8454a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8455b;

    public /* synthetic */ Gr(int i, Object obj) {
        this.f8454a = i;
        this.f8455b = obj;
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final InterfaceFutureC2326a a() {
        int i = this.f8454a;
        int i3 = 0;
        int i6 = 2;
        Object obj = this.f8455b;
        switch (i) {
            case 0:
                return AbstractC1984ut.e(new Hr(0, G.c.a((Context) obj, "com.google.android.gms.permission.AD_ID") == 0));
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return AbstractC1984ut.e(new Tr(0, arrayList));
            case 2:
                return AbstractC1984ut.e(new Hr(1, ((C0960bu) obj).f13494q));
            case 3:
                C1822rt c1822rt = (C1822rt) obj;
                String str = null;
                if (c1822rt == null) {
                    return AbstractC1984ut.e(new Or(str, i6));
                }
                String str2 = c1822rt.f16635a;
                int i7 = Q2.c.f3178a;
                return (str2 == null || str2.trim().isEmpty()) ? AbstractC1984ut.e(new Or(str, i6)) : AbstractC1984ut.e(new Or(str2, i6));
            case 4:
                return AbstractC1984ut.e(new C2145xs(i3, (Pt) obj));
            case 5:
                return AbstractC1984ut.e(new Ur(2, (Bundle) obj));
            default:
                return AbstractC1984ut.G(AbstractC1984ut.E(AbstractC1984ut.e(new Bundle()), ((Long) C2841s.f23267e.f23270c.a(H9.f8681U4)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj), C1563n2.f15722o, AbstractC0640Nf.f10005a);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        switch (this.f8454a) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 58;
            case 3:
                return 15;
            case 4:
                return 25;
            case 5:
                return 30;
            default:
                return 49;
        }
    }
}
