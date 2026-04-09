package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0783Vm implements M7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0828Yg f12082b;

    public /* synthetic */ C0783Vm(InterfaceC0828Yg interfaceC0828Yg, int i) {
        this.f12081a = i;
        this.f12082b = interfaceC0828Yg;
    }

    @Override // com.google.android.gms.internal.ads.M7
    public final /* synthetic */ void K(L7 l7) {
        switch (this.f12081a) {
            case 0:
                HashMap map = new HashMap();
                map.put("isVisible", true != l7.f9629j ? "0" : "1");
                this.f12082b.a("onAdVisibilityChanged", map);
                break;
            case 1:
                Rect rect = l7.f9624d;
                this.f12082b.l0().s(rect.left, rect.top);
                break;
            default:
                Rect rect2 = l7.f9624d;
                this.f12082b.l0().s(rect2.left, rect2.top);
                break;
        }
    }
}
