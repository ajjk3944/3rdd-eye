package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dm0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10522a;

    public dm0(Integer num) {
        this.f10522a = num;
    }

    public static dm0 a(za.a aVar) {
        pk pkVar = sk.f16261ob;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (!((Boolean) rkVar.a(pkVar)).booleanValue()) {
            return new dm0(null);
        }
        ya.f0 f0Var = ua.j.C.f35261c;
        int extensionVersion = 0;
        try {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            } else if (((Boolean) rkVar2.a(sk.f16309rb)).booleanValue() && aVar.f38131c >= ((Integer) rkVar2.a(sk.f16293qb)).intValue() && i4 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                extensionVersion = SdkExtensions.getExtensionVersion(31);
            }
        } catch (Exception e2) {
            ua.j.C.f35265h.f("AdUtil.getAdServicesExtensionVersion", e2);
        }
        return new dm0(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        t50 t50Var = (t50) obj;
        Integer num = this.f10522a;
        if (num != null) {
            t50Var.f16705a.putInt("aos", num.intValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
    }
}
