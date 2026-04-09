package T4;

import B4.A;
import a2.AbstractC0271g;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.lefan.signal.MyApplication;
import com.lefan.signal.device.CpuInfoActivity;
import com.lefan.signal.ui.other.OtherFragment;
import d5.AbstractC2282j;
import e.InterfaceC2285b;
import e2.InterfaceC2302a;
import k0.K;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC2302a, InterfaceC2285b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OtherFragment f3600b;

    public /* synthetic */ f(OtherFragment otherFragment, int i) {
        this.f3599a = i;
        this.f3600b = otherFragment;
    }

    @Override // e2.InterfaceC2302a
    public void a(AbstractC0271g abstractC0271g, View view, int i) {
        switch (this.f3599a) {
            case 0:
                OtherFragment otherFragment = this.f3600b;
                d dVar = (d) AbstractC2282j.V(i, otherFragment.v0);
                if (dVar != null) {
                    if (!q5.i.a(dVar.f3594a, "cpu")) {
                        K kL = otherFragment.l();
                        String str = dVar.f3596c;
                        String str2 = dVar.f3595b;
                        if (kL != null) {
                            A a6 = new A();
                            a6.f687A0 = str;
                            a6.f688B0 = str2;
                            a6.e0(kL, "share_copy_dialog");
                            break;
                        }
                    } else {
                        otherFragment.W(new Intent(otherFragment.m(), (Class<?>) CpuInfoActivity.class));
                        break;
                    }
                }
                break;
            default:
                OtherFragment otherFragment2 = this.f3600b;
                d dVar2 = (d) AbstractC2282j.V(i, otherFragment2.f19108x0);
                if (dVar2 != null) {
                    K kL2 = otherFragment2.l();
                    String str3 = dVar2.f3596c;
                    String str4 = dVar2.f3595b;
                    if (kL2 != null) {
                        A a7 = new A();
                        a7.f687A0 = str3;
                        a7.f688B0 = str4;
                        a7.e0(kL2, "share_copy_dialog");
                        break;
                    }
                }
                break;
        }
    }

    @Override // e.InterfaceC2285b
    public void b(Object obj) {
        Boolean bool = (Boolean) obj;
        q5.i.e(bool, "it");
        boolean zBooleanValue = bool.booleanValue();
        OtherFragment otherFragment = this.f3600b;
        if (zBooleanValue) {
            Context contextM = otherFragment.m();
            if (contextM != null) {
                otherFragment.f19098m0.b(contextM);
            }
        } else if (!otherFragment.V(otherFragment.f19097l0) && System.currentTimeMillis() - otherFragment.f19100o0 < 500) {
            otherFragment.f19095B0.a(com.bumptech.glide.d.x(otherFragment.m(), "android.settings.APPLICATION_DETAILS_SETTINGS"));
            MyApplication.f18812d = true;
        }
        l lVar = otherFragment.f19099n0;
        if (lVar != null) {
            lVar.f3626g.j(bool);
        } else {
            q5.i.g("viewModel");
            throw null;
        }
    }
}
