package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class uf extends zf {

    /* renamed from: h, reason: collision with root package name */
    public final Map f17196h;

    /* renamed from: i, reason: collision with root package name */
    public final View f17197i;
    public final Context j;

    public uf(ff ffVar, zc zcVar, int i4, HashMap map, View view, Context context) {
        super(ffVar, "mWKvHkCTlhia7UFG1tX8rmkp9AizD6H5C2Y+fxk0U+Y2fZze528QNyV6FTMftwOj", "NhSpQvE4PaXaFqOsSIcuQESqMAyvT+VdhFhpwrR61iU=", zcVar, i4, 85);
        this.f17196h = map;
        this.f17197i = view;
        this.j = context;
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void a() {
        Map map = this.f17196h;
        long jLongValue = map.containsKey(1) ? ((Long) map.get(1)).longValue() : Long.MIN_VALUE;
        Map map2 = this.f17196h;
        long[] jArr = {jLongValue, map2.containsKey(2) ? ((Long) map2.get(2)).longValue() : Long.MIN_VALUE};
        Context context = this.j;
        if (context == null) {
            context = this.f19072a.f11116a;
        }
        long[] jArr2 = (long[]) this.f19076e.invoke(null, jArr, context, this.f17197i);
        long j = jArr2[0];
        Map map3 = this.f17196h;
        map3.put(1, Long.valueOf(jArr2[1]));
        long j8 = jArr2[2];
        map3.put(2, Long.valueOf(jArr2[3]));
        zc zcVar = this.f19075d;
        synchronized (zcVar) {
            zcVar.b();
            ((md) zcVar.f14755b).j0(j);
            zcVar.b();
            ((md) zcVar.f14755b).k0(j8);
        }
    }
}
