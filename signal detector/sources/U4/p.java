package U4;

import com.lefan.signal.MyApplication;
import com.lefan.signal.ui.phone.PhoneFragment;
import e.C2284a;
import e.InterfaceC2285b;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements InterfaceC2285b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhoneFragment f3760b;

    public /* synthetic */ p(PhoneFragment phoneFragment, int i) {
        this.f3759a = i;
        this.f3760b = phoneFragment;
    }

    @Override // e.InterfaceC2285b
    public void b(Object obj) throws NumberFormatException {
        switch (this.f3759a) {
            case 2:
                Boolean bool = (Boolean) obj;
                q5.i.e(bool, "it");
                boolean zBooleanValue = bool.booleanValue();
                PhoneFragment phoneFragment = this.f3760b;
                if (!zBooleanValue) {
                    if (!phoneFragment.V(phoneFragment.f19131m0) && System.currentTimeMillis() - phoneFragment.f19124N0 < 500) {
                        MyApplication.f18812d = true;
                        phoneFragment.f19126P0.a(com.bumptech.glide.d.x(phoneFragment.m(), "android.settings.APPLICATION_DETAILS_SETTINGS"));
                        break;
                    }
                } else {
                    phoneFragment.Z();
                    break;
                }
                break;
            case 3:
                q5.i.e((C2284a) obj, "it");
                this.f3760b.Z();
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                q5.i.e(bool2, "it");
                if (!bool2.booleanValue()) {
                    PhoneFragment phoneFragment2 = this.f3760b;
                    if (!phoneFragment2.V(phoneFragment2.f19132n0) && System.currentTimeMillis() - phoneFragment2.f19124N0 < 500) {
                        phoneFragment2.f19128R0.a(com.bumptech.glide.d.x(phoneFragment2.m(), "android.settings.APPLICATION_DETAILS_SETTINGS"));
                        MyApplication.f18812d = true;
                        break;
                    }
                }
                break;
        }
    }
}
