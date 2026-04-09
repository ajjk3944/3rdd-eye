package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.C1053de;
import com.google.android.gms.internal.ads.H9;
import j$.util.Objects;

/* renamed from: q2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2812d extends AbstractC2838q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutOfContextTestingActivity f23185b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC0569Jc f23186c;

    public C2812d(C2834o c2834o, OutOfContextTestingActivity outOfContextTestingActivity, BinderC0569Jc binderC0569Jc) {
        this.f23185b = outOfContextTestingActivity;
        this.f23186c = binderC0569Jc;
        Objects.requireNonNull(c2834o);
    }

    @Override // q2.AbstractC2838q
    public final /* bridge */ /* synthetic */ Object a() {
        C2834o.h(this.f23185b, "out_of_context_tester");
        return null;
    }

    @Override // q2.AbstractC2838q
    public final Object b() throws u2.l {
        C2848v0 c2848v0;
        OutOfContextTestingActivity outOfContextTestingActivity = this.f23185b;
        S2.b bVar = new S2.b(outOfContextTestingActivity);
        H9.a(outOfContextTestingActivity);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Ea)).booleanValue()) {
            try {
                try {
                    IBinder iBinderB = u2.k.b(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                    if (iBinderB == null) {
                        c2848v0 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        c2848v0 = iInterfaceQueryLocalInterface instanceof C2848v0 ? (C2848v0) iInterfaceQueryLocalInterface : new C2848v0(iBinderB, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator", 2);
                    }
                    return c2848v0.n1(bVar, this.f23186c);
                } catch (Exception e6) {
                    throw new u2.l(e6);
                }
            } catch (RemoteException e7) {
                e = e7;
                C1053de.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (NullPointerException e8) {
                e = e8;
                C1053de.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (u2.l e9) {
                e = e9;
                C1053de.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            }
        }
        return null;
    }

    @Override // q2.AbstractC2838q
    public final Object c(Y y3) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f23185b;
        S2.b bVar = new S2.b(outOfContextTestingActivity);
        H9.a(outOfContextTestingActivity);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Ea)).booleanValue()) {
            return y3.P0(bVar, this.f23186c, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}
