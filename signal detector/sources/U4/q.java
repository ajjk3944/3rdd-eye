package U4;

import android.content.Intent;
import android.view.View;
import com.apm.insight.R;
import com.lefan.signal.MyApplication;
import com.lefan.signal.ui.phone.PhoneFragment;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhoneFragment f3762b;

    public /* synthetic */ q(PhoneFragment phoneFragment, int i) {
        this.f3761a = i;
        this.f3762b = phoneFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3761a) {
            case 0:
                PhoneFragment phoneFragment = this.f3762b;
                phoneFragment.f19126P0.a(com.bumptech.glide.d.x(phoneFragment.m(), "android.settings.APPLICATION_DETAILS_SETTINGS"));
                MyApplication.f18812d = true;
                return;
            case 1:
                PhoneFragment phoneFragment2 = this.f3762b;
                try {
                    phoneFragment2.f19124N0 = System.currentTimeMillis();
                    phoneFragment2.f19125O0.a(phoneFragment2.f19131m0);
                    return;
                } catch (Throwable th) {
                    R2.a.d(th);
                    return;
                }
            case 2:
                B4.h hVar = new B4.h();
                PhoneFragment phoneFragment3 = this.f3762b;
                hVar.g0(R.string.no_station_tip, phoneFragment3.r(R.string.mobile_station));
                hVar.e0(phoneFragment3.l(), "phone_station_help");
                return;
            case 3:
                z zVar = new z();
                PhoneFragment phoneFragment4 = this.f3762b;
                zVar.f3784F0 = phoneFragment4.f19137s0;
                zVar.f3785G0 = phoneFragment4.f19138t0;
                zVar.f0(phoneFragment4.l(), "sim_info");
                return;
            case 4:
                B4.h hVar2 = new B4.h();
                PhoneFragment phoneFragment5 = this.f3762b;
                hVar2.g0(R.string.phone_signal_tip, phoneFragment5.r(R.string.phone_signal_level));
                hVar2.e0(phoneFragment5.l(), "phone_signal_level_help");
                return;
            case 5:
                u uVar = new u();
                PhoneFragment phoneFragment6 = this.f3762b;
                v vVar = phoneFragment6.f19135q0;
                if (vVar == null) {
                    q5.i.g("phoneViewModel");
                    throw null;
                }
                uVar.f3769B0 = vVar;
                uVar.f0(phoneFragment6.l(), "phone_signal_dialog");
                return;
            case 6:
                PhoneFragment phoneFragment7 = this.f3762b;
                try {
                    phoneFragment7.f19124N0 = System.currentTimeMillis();
                    phoneFragment7.f19127Q0.a(phoneFragment7.f19132n0);
                    return;
                } catch (Throwable th2) {
                    R2.a.d(th2);
                    return;
                }
            default:
                PhoneFragment phoneFragment8 = this.f3762b;
                Intent intentX = com.bumptech.glide.d.x(phoneFragment8.m(), "android.settings.LOCATION_SOURCE_SETTINGS");
                if (intentX != null) {
                    MyApplication.f18812d = true;
                    phoneFragment8.W(intentX);
                    return;
                }
                return;
        }
    }
}
