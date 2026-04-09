package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class aj1 extends zu1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ s62 c;

    public aj1(bu1 bu1Var, Context context, s62 s62Var) {
        this.b = context;
        this.c = s62Var;
    }

    @Override // defpackage.zu1
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.zu1
    public final Object b() throws ze4 {
        z82 x82Var;
        Context context = this.b;
        oi0 oi0Var = new oi0(context);
        try {
            try {
                IBinder iBinderB = pu1.z(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i = y82.f;
                if (iBinderB == null) {
                    x82Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    x82Var = iInterfaceQueryLocalInterface instanceof z82 ? (z82) iInterfaceQueryLocalInterface : new x82(iBinderB, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator", 2);
                }
                return ((x82) x82Var).l1(oi0Var, this.c);
            } catch (Exception e) {
                throw new ze4(e);
            }
        } catch (RemoteException | NullPointerException | ze4 unused) {
            return null;
        }
    }

    @Override // defpackage.zu1
    public final Object c(ek2 ek2Var) {
        return ek2Var.r1(new oi0(this.b), this.c, ModuleDescriptor.MODULE_VERSION);
    }
}
