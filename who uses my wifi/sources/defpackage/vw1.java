package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vw1 extends dc2 {
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vw1(Context context, Looper looper, int i, t9 t9Var, u9 u9Var) {
        super(context, looper, i, t9Var, u9Var);
        this.y = 1;
    }

    @Override // defpackage.w9, defpackage.v4
    public int e() {
        switch (this.y) {
            case 2:
                return 244933000;
            default:
                return super.e();
        }
    }

    @Override // defpackage.w9
    public final IInterface o(IBinder iBinder) {
        switch (this.y) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                return iInterfaceQueryLocalInterface instanceof xw1 ? (xw1) iInterfaceQueryLocalInterface : new xw1(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService", 2);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                return iInterfaceQueryLocalInterface2 instanceof s42 ? (s42) iInterfaceQueryLocalInterface2 : new s42(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService", 2);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                return iInterfaceQueryLocalInterface3 instanceof y92 ? (y92) iInterfaceQueryLocalInterface3 : new x92(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService", 2);
        }
    }

    @Override // defpackage.w9
    public ju[] q() {
        switch (this.y) {
            case 0:
                return i41.x;
            default:
                return super.q();
        }
    }

    @Override // defpackage.w9
    public final String u() {
        switch (this.y) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            case 1:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
            default:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
        }
    }

    @Override // defpackage.w9
    public final String v() {
        switch (this.y) {
            case 0:
                return "com.google.android.gms.ads.service.CACHE";
            case 1:
                return "com.google.android.gms.ads.service.HTTP";
            default:
                return "com.google.android.gms.ads.service.START";
        }
    }

    public boolean z() {
        ju[] juVarArrG = g();
        if (((Boolean) tw1.e.c.a(mz1.Y1)).booleanValue()) {
            ju juVar = i41.w;
            int length = juVarArrG != null ? juVarArrG.length : 0;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!a30.c(juVarArrG[i], juVar)) {
                    i++;
                } else if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vw1(Context context, Looper looper, t9 t9Var, u9 u9Var, int i) {
        this.y = i;
        switch (i) {
            case 2:
                int i2 = w11.b;
                Context applicationContext = context.getApplicationContext();
                super(applicationContext != null ? applicationContext : context, looper, 8, t9Var, u9Var);
                break;
            default:
                int i3 = w11.b;
                Context applicationContext2 = context.getApplicationContext();
                super(applicationContext2 == null ? context : applicationContext2, looper, 123, t9Var, u9Var);
                break;
        }
    }
}
