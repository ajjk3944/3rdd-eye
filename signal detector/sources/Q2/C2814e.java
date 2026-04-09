package q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractBinderC2240zf;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.C2186yf;
import com.google.android.gms.internal.ads.InterfaceC0419Af;
import j$.util.Objects;

/* renamed from: q2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2814e extends AbstractC2838q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC0569Jc f23202c;

    public C2814e(C2834o c2834o, Context context, BinderC0569Jc binderC0569Jc) {
        this.f23201b = context;
        this.f23202c = binderC0569Jc;
        Objects.requireNonNull(c2834o);
    }

    @Override // q2.AbstractC2838q
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // q2.AbstractC2838q
    public final Object b() throws u2.l {
        InterfaceC0419Af c2186yf;
        Context context = this.f23201b;
        S2.b bVar = new S2.b(context);
        try {
            try {
                IBinder iBinderB = u2.k.b(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl");
                int i = AbstractBinderC2240zf.f17888a;
                if (iBinderB == null) {
                    c2186yf = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    c2186yf = iInterfaceQueryLocalInterface instanceof InterfaceC0419Af ? (InterfaceC0419Af) iInterfaceQueryLocalInterface : new C2186yf(iBinderB, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator", 2);
                }
                return ((C2186yf) c2186yf).n1(bVar, this.f23202c);
            } catch (Exception e6) {
                throw new u2.l(e6);
            }
        } catch (RemoteException | NullPointerException | u2.l unused) {
            return null;
        }
    }

    @Override // q2.AbstractC2838q
    public final Object c(Y y3) {
        return y3.Z2(new S2.b(this.f23201b), this.f23202c, ModuleDescriptor.MODULE_VERSION);
    }
}
