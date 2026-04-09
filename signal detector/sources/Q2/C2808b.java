package q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.C0571Je;
import com.google.android.gms.internal.ads.C0673Pe;
import com.google.android.gms.internal.ads.InterfaceC0605Le;

/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2808b extends AbstractC2838q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC0569Jc f23180d;

    public C2808b(C2834o c2834o, Context context, String str, BinderC0569Jc binderC0569Jc) {
        this.f23178b = context;
        this.f23179c = str;
        this.f23180d = binderC0569Jc;
    }

    @Override // q2.AbstractC2838q
    public final Object a() {
        C2834o.h(this.f23178b, "rewarded");
        return new S0();
    }

    @Override // q2.AbstractC2838q
    public final Object b() throws u2.l {
        C0673Pe c0673Pe;
        String str = this.f23179c;
        BinderC0569Jc binderC0569Jc = this.f23180d;
        Context context = this.f23178b;
        S2.b bVar = new S2.b(context);
        try {
            try {
                IBinder iBinderB = u2.k.b(context).b("com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl");
                if (iBinderB == null) {
                    c0673Pe = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    c0673Pe = iInterfaceQueryLocalInterface instanceof C0673Pe ? (C0673Pe) iInterfaceQueryLocalInterface : new C0673Pe(iBinderB, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator", 2);
                }
                IBinder iBinderN1 = c0673Pe.n1(bVar, str, binderC0569Jc);
                if (iBinderN1 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinderN1.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
                return iInterfaceQueryLocalInterface2 instanceof InterfaceC0605Le ? (InterfaceC0605Le) iInterfaceQueryLocalInterface2 : new C0571Je(iBinderN1);
            } catch (Exception e6) {
                throw new u2.l(e6);
            }
        } catch (RemoteException e7) {
            e = e7;
            u2.k.k("#007 Could not call remote method.", e);
            return null;
        } catch (u2.l e8) {
            e = e8;
            u2.k.k("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // q2.AbstractC2838q
    public final Object c(Y y3) {
        return y3.j3(new S2.b(this.f23178b), this.f23179c, this.f23180d, ModuleDescriptor.MODULE_VERSION);
    }
}
