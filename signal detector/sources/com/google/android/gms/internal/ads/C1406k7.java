package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.k7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1406k7 extends AbstractCallableC1676p7 {

    /* renamed from: h, reason: collision with root package name */
    public final Map f15067h;
    public final View i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f15068j;

    public C1406k7(X6 x6, S5 s5, int i, HashMap map, View view, Context context) {
        super(x6, "mWKvHkCTlhia7UFG1tX8rmkp9AizD6H5C2Y+fxk0U+Y2fZze528QNyV6FTMftwOj", "NhSpQvE4PaXaFqOsSIcuQESqMAyvT+VdhFhpwrR61iU=", s5, i, 85);
        this.f15067h = map;
        this.i = view;
        this.f15068j = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1676p7
    public final void a() {
        Map map = this.f15067h;
        long jLongValue = map.containsKey(1) ? ((Long) map.get(1)).longValue() : Long.MIN_VALUE;
        Map map2 = this.f15067h;
        long[] jArr = {jLongValue, map2.containsKey(2) ? ((Long) map2.get(2)).longValue() : Long.MIN_VALUE};
        Context context = this.f15068j;
        if (context == null) {
            context = this.f16130a.f12375a;
        }
        long[] jArr2 = (long[]) this.f16134e.invoke(null, jArr, context, this.i);
        long j6 = jArr2[0];
        Map map3 = this.f15067h;
        map3.put(1, Long.valueOf(jArr2[1]));
        long j7 = jArr2[2];
        map3.put(2, Long.valueOf(jArr2[3]));
        S5 s5 = this.f16133d;
        synchronized (s5) {
            s5.b();
            ((C1136f6) s5.f13551b).j0(j6);
            s5.b();
            ((C1136f6) s5.f13551b).k0(j7);
        }
    }
}
