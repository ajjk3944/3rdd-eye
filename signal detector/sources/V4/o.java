package V4;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.apm.insight.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.ui.satellite.SatelliteCloudChart;
import d5.AbstractC2283k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends k3.f {

    /* renamed from: A0, reason: collision with root package name */
    public c1.g f3919A0;

    /* renamed from: B0, reason: collision with root package name */
    public l f3920B0;

    /* renamed from: C0, reason: collision with root package name */
    public final D4.a f3921C0 = new D4.a(R.layout.item_wifi_info, 15);

    /* renamed from: D0, reason: collision with root package name */
    public final ArrayList f3922D0 = new ArrayList();

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) {
        super.B(bundle);
        if (this.f3920B0 == null) {
            Y();
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String strR;
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_satellite_info, viewGroup, false);
        int i = R.id.sate_switch;
        SwitchCompat switchCompat = (SwitchCompat) a4.p.e(R.id.sate_switch, viewInflate);
        if (switchCompat != null) {
            i = R.id.satellite_cloud_chart;
            SatelliteCloudChart satelliteCloudChart = (SatelliteCloudChart) a4.p.e(R.id.satellite_cloud_chart, viewInflate);
            if (satelliteCloudChart != null) {
                i = R.id.satellite_info_cancel;
                MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.satellite_info_cancel, viewInflate);
                if (materialButton != null) {
                    i = R.id.satellite_info_recycler;
                    RecyclerView recyclerView = (RecyclerView) a4.p.e(R.id.satellite_info_recycler, viewInflate);
                    if (recyclerView != null) {
                        this.f3919A0 = new c1.g((LinearLayout) viewInflate, switchCompat, satelliteCloudChart, materialButton, recyclerView);
                        materialButton.setOnClickListener(new B4.g(19, this));
                        c1.g gVar = this.f3919A0;
                        q5.i.b(gVar);
                        RecyclerView recyclerView2 = (RecyclerView) gVar.f5899e;
                        D4.a aVar = this.f3921C0;
                        recyclerView2.setAdapter(aVar);
                        aVar.f4672f = new F4.c(13, this);
                        if (this.f3920B0 != null) {
                            int i3 = Build.VERSION.SDK_INT;
                            String strR2 = i3 >= 24 ? r(R.string.satellite_noise) : r(R.string.satellite_noise_n);
                            q5.i.b(strR2);
                            l lVar = this.f3920B0;
                            q5.i.b(lVar);
                            n nVar = new n(strR2, R2.a.k(Float.valueOf(lVar.f3908d), "%.1f"), Integer.valueOf(i3 >= 24 ? R.string.tip_satellite_signal_n : R.string.tip_satellite_signal));
                            ArrayList arrayList = this.f3922D0;
                            arrayList.add(nVar);
                            String strR3 = r(R.string.string_country);
                            q5.i.d(strR3, "getString(...)");
                            l lVar2 = this.f3920B0;
                            q5.i.b(lVar2);
                            switch (lVar2.f3909e) {
                                case 1:
                                    strR = r(R.string.grs_country_us);
                                    break;
                                case 2:
                                    strR = r(R.string.grs_country_sbas);
                                    break;
                                case 3:
                                    strR = r(R.string.country_russia);
                                    break;
                                case 4:
                                    strR = r(R.string.grs_country_jp);
                                    break;
                                case 5:
                                    strR = r(R.string.grs_country_cn);
                                    break;
                                case 6:
                                    strR = r(R.string.grs_country_eu);
                                    break;
                                case 7:
                                    strR = r(R.string.grs_country_in);
                                    break;
                                default:
                                    strR = r(R.string.string_unknown);
                                    break;
                            }
                            q5.i.b(strR);
                            arrayList.add(new n(strR3, strR, Integer.valueOf(R.string.tip_satellite_country)));
                            l lVar3 = this.f3920B0;
                            q5.i.b(lVar3);
                            arrayList.add(new n("Svid", R2.a.k(lVar3.f3910f, "%d"), Integer.valueOf(R.string.tip_satellite_id)));
                            String strR4 = r(R.string.string_azimuth);
                            q5.i.d(strR4, "getString(...)");
                            l lVar4 = this.f3920B0;
                            q5.i.b(lVar4);
                            arrayList.add(new n(strR4, R2.a.k(Float.valueOf(lVar4.f3906b), "%.1f"), Integer.valueOf(R.string.tip_satellite_azimuth)));
                            String strR5 = r(R.string.string_elevation);
                            q5.i.d(strR5, "getString(...)");
                            l lVar5 = this.f3920B0;
                            q5.i.b(lVar5);
                            arrayList.add(new n(strR5, R2.a.k(Float.valueOf(lVar5.f3907c), "%.1f"), Integer.valueOf(R.string.tip_satellite_elevation)));
                            String strR6 = r(R.string.ephemeris_data);
                            q5.i.d(strR6, "getString(...)");
                            l lVar6 = this.f3920B0;
                            q5.i.b(lVar6);
                            arrayList.add(new n(strR6, R2.a.k(Boolean.valueOf(lVar6.f3911g), "%b"), Integer.valueOf(R.string.tip_ephemeris_data)));
                            String strR7 = r(R.string.almanac_data);
                            q5.i.d(strR7, "getString(...)");
                            l lVar7 = this.f3920B0;
                            q5.i.b(lVar7);
                            arrayList.add(new n(strR7, R2.a.k(Boolean.valueOf(lVar7.f3912h), "%b"), Integer.valueOf(R.string.tip_almanac_data)));
                            String strR8 = r(R.string.frequency);
                            q5.i.d(strR8, "getString(...)");
                            l lVar8 = this.f3920B0;
                            q5.i.b(lVar8);
                            arrayList.add(new n(strR8, R2.a.k(lVar8.i, "%.0f"), Integer.valueOf(R.string.tip_satellite_carrier_frequency_hz)));
                            aVar.p(arrayList);
                            c1.g gVar2 = this.f3919A0;
                            q5.i.b(gVar2);
                            SwitchCompat switchCompat2 = (SwitchCompat) gVar2.f5897c;
                            c1.g gVar3 = this.f3919A0;
                            q5.i.b(gVar3);
                            SatelliteCloudChart satelliteCloudChart2 = (SatelliteCloudChart) gVar3.f5898d;
                            switchCompat2.setChecked(com.bumptech.glide.e.k(R(), "sate_compass", true));
                            satelliteCloudChart2.setUseCompass(switchCompat2.isChecked());
                            switchCompat2.setOnCheckedChangeListener(new N4.a(1, satelliteCloudChart2));
                            l lVar9 = this.f3920B0;
                            q5.i.b(lVar9);
                            satelliteCloudChart2.setSatellites(AbstractC2283k.K(lVar9));
                        } else {
                            X();
                        }
                        c1.g gVar4 = this.f3919A0;
                        q5.i.b(gVar4);
                        LinearLayout linearLayout = (LinearLayout) gVar4.f5896b;
                        q5.i.d(linearLayout, "getRoot(...)");
                        return linearLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void D() {
        super.D();
        this.f3919A0 = null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void K() {
        BottomSheetBehavior bottomSheetBehaviorH;
        super.K();
        Dialog dialog = this.v0;
        k3.e eVar = dialog instanceof k3.e ? (k3.e) dialog : null;
        if (eVar == null || (bottomSheetBehaviorH = eVar.h()) == null) {
            return;
        }
        bottomSheetBehaviorH.I(3);
        bottomSheetBehaviorH.f18134X = true;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.bottomDialog;
    }
}
