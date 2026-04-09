package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class di extends ua.b {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f10485y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ di(Context context, Looper looper, int i4, pb.b bVar, pb.c cVar) {
        super(context, looper, i4, bVar, cVar);
        this.f10485y = 1;
    }

    public boolean A() {
        nb.d[] dVarArrK = k();
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16237n2)).booleanValue()) {
            int length = dVarArrK != null ? dVarArrK.length : 0;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (!pb.y.l(dVarArrK[i4], pa.u.f31555b)) {
                    i4++;
                } else if (i4 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // pb.e
    public int j() {
        switch (this.f10485y) {
            case 2:
                return 250934000;
            default:
                return super.j();
        }
    }

    @Override // pb.e
    public final IInterface o(IBinder iBinder) {
        switch (this.f10485y) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                return iInterfaceQueryLocalInterface instanceof fi ? (fi) iInterfaceQueryLocalInterface : new fi(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService", 1);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                return iInterfaceQueryLocalInterface2 instanceof cp ? (cp) iInterfaceQueryLocalInterface2 : new cp(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService", 1);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                return iInterfaceQueryLocalInterface3 instanceof bu ? (bu) iInterfaceQueryLocalInterface3 : new au(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService", 1);
        }
    }

    @Override // pb.e
    public nb.d[] q() {
        switch (this.f10485y) {
            case 0:
                return pa.u.f31556c;
            default:
                return super.q();
        }
    }

    @Override // pb.e
    public final String u() {
        switch (this.f10485y) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            case 1:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
            default:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
        }
    }

    @Override // pb.e
    public final String v() {
        switch (this.f10485y) {
            case 0:
                return "com.google.android.gms.ads.service.CACHE";
            case 1:
                return "com.google.android.gms.ads.service.HTTP";
            default:
                return "com.google.android.gms.ads.service.START";
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public di(Context context, Looper looper, pb.b bVar, pb.c cVar, int i4) {
        this.f10485y = i4;
        switch (i4) {
            case 2:
                int i10 = qu.f15446a;
                Context applicationContext = context.getApplicationContext();
                super(applicationContext != null ? applicationContext : context, looper, 8, bVar, cVar);
                break;
            default:
                int i11 = qu.f15446a;
                Context applicationContext2 = context.getApplicationContext();
                super(applicationContext2 == null ? context : applicationContext2, looper, 123, bVar, cVar);
                break;
        }
    }
}
