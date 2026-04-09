package q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractBinderC0604Ld;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.C0587Kd;
import com.google.android.gms.internal.ads.InterfaceC0621Md;

/* renamed from: q2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2816f extends AbstractC2838q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC0569Jc f23208c;

    public C2816f(C2834o c2834o, Context context, BinderC0569Jc binderC0569Jc) {
        this.f23207b = context;
        this.f23208c = binderC0569Jc;
    }

    @Override // q2.AbstractC2838q
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // q2.AbstractC2838q
    public final Object b() throws u2.l {
        InterfaceC0621Md c0587Kd;
        Context context = this.f23207b;
        S2.b bVar = new S2.b(context);
        try {
            try {
                IBinder iBinderB = u2.k.b(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i = AbstractBinderC0604Ld.f9727a;
                if (iBinderB == null) {
                    c0587Kd = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    c0587Kd = iInterfaceQueryLocalInterface instanceof InterfaceC0621Md ? (InterfaceC0621Md) iInterfaceQueryLocalInterface : new C0587Kd(iBinderB, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator", 2);
                }
                return ((C0587Kd) c0587Kd).n1(bVar, this.f23208c);
            } catch (Exception e6) {
                throw new u2.l(e6);
            }
        } catch (RemoteException | NullPointerException | u2.l unused) {
            return null;
        }
    }

    @Override // q2.AbstractC2838q
    public final Object c(Y y3) {
        return y3.o3(new S2.b(this.f23207b), this.f23208c, ModuleDescriptor.MODULE_VERSION);
    }
}
