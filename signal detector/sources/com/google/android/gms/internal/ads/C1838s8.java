package com.google.android.gms.internal.ads;

import M2.InterfaceC0162b;
import M2.InterfaceC0163c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.s8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1838s8 extends p2.b {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f16684y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1838s8(Context context, Looper looper, int i, InterfaceC0162b interfaceC0162b, InterfaceC0163c interfaceC0163c) {
        super(context, looper, i, interfaceC0162b, interfaceC0163c);
        this.f16684y = 1;
    }

    public boolean A() {
        J2.d[] dVarArrK = k();
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8792n2)).booleanValue()) {
            int length = dVarArrK != null ? dVarArrK.length : 0;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!M2.u.g(dVarArrK[i], j2.u.f21366b)) {
                    i++;
                } else if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // M2.AbstractC0165e, K2.c
    public int j() {
        switch (this.f16684y) {
            case 2:
                return 250934000;
            default:
                return super.j();
        }
    }

    @Override // M2.AbstractC0165e
    public final IInterface o(IBinder iBinder) {
        switch (this.f16684y) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                return iInterfaceQueryLocalInterface instanceof C1946u8 ? (C1946u8) iInterfaceQueryLocalInterface : new C1946u8(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService", 2);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                return iInterfaceQueryLocalInterface2 instanceof C0687Qb ? (C0687Qb) iInterfaceQueryLocalInterface2 : new C0687Qb(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService", 2);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                return iInterfaceQueryLocalInterface3 instanceof InterfaceC1430ke ? (InterfaceC1430ke) iInterfaceQueryLocalInterface3 : new C1376je(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService", 2);
        }
    }

    @Override // M2.AbstractC0165e
    public J2.d[] q() {
        switch (this.f16684y) {
            case 0:
                return j2.u.f21367c;
            default:
                return super.q();
        }
    }

    @Override // M2.AbstractC0165e
    public final String u() {
        switch (this.f16684y) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            case 1:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
            default:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
        }
    }

    @Override // M2.AbstractC0165e
    public final String v() {
        switch (this.f16684y) {
            case 0:
                return "com.google.android.gms.ads.service.CACHE";
            case 1:
                return "com.google.android.gms.ads.service.HTTP";
            default:
                return "com.google.android.gms.ads.service.START";
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1838s8(Context context, Looper looper, InterfaceC0162b interfaceC0162b, InterfaceC0163c interfaceC0163c, int i) {
        this.f16684y = i;
        switch (i) {
            case 2:
                int i3 = AbstractC2239ze.f17887a;
                Context applicationContext = context.getApplicationContext();
                super(applicationContext != null ? applicationContext : context, looper, 8, interfaceC0162b, interfaceC0163c);
                break;
            default:
                int i6 = AbstractC2239ze.f17887a;
                Context applicationContext2 = context.getApplicationContext();
                super(applicationContext2 == null ? context : applicationContext2, looper, 123, interfaceC0162b, interfaceC0163c);
                break;
        }
    }
}
