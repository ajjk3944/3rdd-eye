package va;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.av;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.gv;
import com.google.android.gms.internal.ads.yq;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f36031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36032c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq f36033d;

    public b(o oVar, Context context, String str, yq yqVar) {
        this.f36031b = context;
        this.f36032c = str;
        this.f36033d = yqVar;
    }

    @Override // va.q
    public final Object a() {
        o.t(this.f36031b, "rewarded");
        return new r2();
    }

    @Override // va.q
    public final Object b() throws za.j {
        gv gvVar;
        String str = this.f36032c;
        yq yqVar = this.f36033d;
        Context context = this.f36031b;
        vb.b bVar = new vb.b(context);
        try {
            try {
                IBinder iBinderB = za.i.b(context).b("com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl");
                if (iBinderB == null) {
                    gvVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    gvVar = iInterfaceQueryLocalInterface instanceof gv ? (gv) iInterfaceQueryLocalInterface : new gv(iBinderB, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator", 1);
                }
                IBinder iBinderK2 = gvVar.k2(bVar, str, yqVar);
                if (iBinderK2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinderK2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
                return iInterfaceQueryLocalInterface2 instanceof cv ? (cv) iInterfaceQueryLocalInterface2 : new av(iBinderK2);
            } catch (Exception e2) {
                throw new za.j(e2);
            }
        } catch (RemoteException e10) {
            e = e10;
            za.i.k("#007 Could not call remote method.", e);
            return null;
        } catch (za.j e11) {
            e = e11;
            za.i.k("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // va.q
    public final Object c(x0 x0Var) {
        return x0Var.h2(new vb.b(this.f36031b), this.f36032c, this.f36033d, ModuleDescriptor.MODULE_VERSION);
    }
}
