package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb0 implements xg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qz f15285b;

    public /* synthetic */ qb0(qz qzVar, int i4) {
        this.f15284a = i4;
        this.f15285b = qzVar;
    }

    @Override // com.google.android.gms.internal.ads.xg
    public final /* synthetic */ void w(wg wgVar) {
        switch (this.f15284a) {
            case 0:
                HashMap map = new HashMap();
                map.put("isVisible", true != wgVar.j ? "0" : "1");
                this.f15285b.a("onAdVisibilityChanged", map);
                break;
            case 1:
                Rect rect = wgVar.f18014d;
                this.f15285b.X().h(rect.left, rect.top);
                break;
            default:
                Rect rect2 = wgVar.f18014d;
                this.f15285b.X().h(rect2.left, rect2.top);
                break;
        }
    }
}
