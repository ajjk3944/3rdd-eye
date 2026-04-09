package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ld1 extends zu1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ s62 d;

    public ld1(bu1 bu1Var, Context context, String str, s62 s62Var) {
        this.b = context;
        this.c = str;
        this.d = s62Var;
    }

    @Override // defpackage.zu1
    public final Object a() {
        bu1.F(this.b, "rewarded");
        return new oc3();
    }

    @Override // defpackage.zu1
    public final Object b() throws ze4 {
        cb2 cb2Var;
        String str = this.c;
        s62 s62Var = this.d;
        Context context = this.b;
        oi0 oi0Var = new oi0(context);
        try {
            try {
                IBinder iBinderB = pu1.z(context).b("com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl");
                if (iBinderB == null) {
                    cb2Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    cb2Var = iInterfaceQueryLocalInterface instanceof cb2 ? (cb2) iInterfaceQueryLocalInterface : new cb2(iBinderB, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator", 2);
                }
                IBinder iBinderL1 = cb2Var.l1(oi0Var, str, s62Var);
                if (iBinderL1 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinderL1.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
                return iInterfaceQueryLocalInterface2 instanceof ya2 ? (ya2) iInterfaceQueryLocalInterface2 : new wa2(iBinderL1);
            } catch (Exception e) {
                throw new ze4(e);
            }
        } catch (RemoteException e2) {
            e = e2;
            gi2.p0("#007 Could not call remote method.", e);
            return null;
        } catch (ze4 e3) {
            e = e3;
            gi2.p0("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // defpackage.zu1
    public final Object c(ek2 ek2Var) {
        return ek2Var.s2(new oi0(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }
}
