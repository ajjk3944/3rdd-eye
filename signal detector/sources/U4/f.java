package U4;

import android.content.Intent;
import android.view.View;
import com.apm.insight.R;
import com.lefan.signal.MyApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f3711b;

    public /* synthetic */ f(l lVar, int i) {
        this.f3710a = i;
        this.f3711b = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3710a) {
            case 0:
                l lVar = this.f3711b;
                try {
                    lVar.f3731L0 = System.currentTimeMillis();
                    lVar.f3732M0.a(lVar.f3735l0);
                    return;
                } catch (Throwable th) {
                    R2.a.d(th);
                    return;
                }
            case 1:
                l lVar2 = this.f3711b;
                Intent intentX = com.bumptech.glide.d.x(lVar2.m(), "android.settings.LOCATION_SOURCE_SETTINGS");
                if (intentX != null) {
                    MyApplication.f18812d = true;
                    lVar2.W(intentX);
                    return;
                }
                return;
            case 2:
                l lVar3 = this.f3711b;
                try {
                    lVar3.f3731L0 = System.currentTimeMillis();
                    lVar3.f3732M0.a(lVar3.f3735l0);
                    return;
                } catch (Throwable th2) {
                    R2.a.d(th2);
                    return;
                }
            case 3:
                B4.h hVar = new B4.h();
                l lVar4 = this.f3711b;
                hVar.g0(R.string.phone_signal_tip, lVar4.r(R.string.phone_signal_level));
                hVar.e0(lVar4.l(), "mobile_signal_help");
                return;
            case 4:
                u uVar = new u();
                l lVar5 = this.f3711b;
                v vVar = lVar5.f3740q0;
                if (vVar == null) {
                    q5.i.g("phoneViewModel");
                    throw null;
                }
                uVar.f3769B0 = vVar;
                uVar.f0(lVar5.l(), "phone_signal_dialog");
                return;
            case 5:
                B4.h hVar2 = new B4.h();
                l lVar6 = this.f3711b;
                hVar2.g0(R.string.no_station_tip, lVar6.r(R.string.mobile_station));
                hVar2.e0(lVar6.l(), "mobile_station_help");
                return;
            default:
                z zVar = new z();
                l lVar7 = this.f3711b;
                zVar.f3784F0 = lVar7.f3738o0;
                zVar.f3785G0 = lVar7.f3739p0;
                zVar.f0(lVar7.l(), "sim_info");
                return;
        }
    }
}
