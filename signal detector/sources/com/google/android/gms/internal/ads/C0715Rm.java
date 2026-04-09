package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;

/* renamed from: com.google.android.gms.internal.ads.Rm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0715Rm implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1306iD f11038b;

    public /* synthetic */ C0715Rm(C1306iD c1306iD, int i) {
        this.f11037a = i;
        this.f11038b = c1306iD;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) throws C0736Sq {
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
        switch (this.f11037a) {
            case 0:
                if (interfaceC0828Yg != null) {
                    return this.f11038b;
                }
                throw new C0736Sq(1, "Retrieve Web View from image ad response failed.");
            default:
                if (interfaceC0828Yg == null || interfaceC0828Yg.g() == null) {
                    throw new C0736Sq(1, "Retrieve video view in html5 ad response failed.");
                }
                return this.f11038b;
        }
    }
}
