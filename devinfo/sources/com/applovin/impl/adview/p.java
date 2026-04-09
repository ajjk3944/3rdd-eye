package com.applovin.impl.adview;

import android.content.res.Resources;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.sdk.i;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.e80;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.DeviceOverviewOtherCard;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;
import com.liuzho.module.app_analyzer.ui.AppsAnalyzeActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3711c;

    public /* synthetic */ p(Object obj, int i4, int i10) {
        this.f3709a = i10;
        this.f3711c = obj;
        this.f3710b = i4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        int i4 = this.f3709a;
        final int i10 = 0;
        final int i11 = this.f3710b;
        Object obj = this.f3711c;
        switch (i4) {
            case 0:
                ((a) obj).a(i11);
                return;
            case 1:
                ((i.a) obj).a(i11);
                return;
            case 2:
                ((MaxAdPlacer) obj).a(i11);
                return;
            case 3:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f20558p.get();
                if (view != null) {
                    sideSheetBehavior.z(view, i11, false);
                    return;
                }
                return;
            case 4:
                final DeviceOverviewOtherCard deviceOverviewOtherCard = (DeviceOverviewOtherCard) obj;
                int i12 = DeviceOverviewOtherCard.f21173i;
                try {
                    final String id2 = AdvertisingIdClient.getAdvertisingIdInfo(deviceOverviewOtherCard.getContext()).getId();
                    if (!TextUtils.isEmpty(id2)) {
                        bi.d.b(new Runnable() { // from class: ig.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i13 = i10;
                                String str = id2;
                                int i14 = i11;
                                DeviceOverviewOtherCard deviceOverviewOtherCard2 = deviceOverviewOtherCard;
                                switch (i13) {
                                    case 0:
                                        int i15 = DeviceOverviewOtherCard.f21173i;
                                        deviceOverviewOtherCard2.findViewById(R.id.gad_id_container).setVisibility(0);
                                        TextView textView = (TextView) deviceOverviewOtherCard2.findViewById(R.id.gad_id);
                                        textView.setTextColor(i14);
                                        textView.setText(str);
                                        break;
                                    case 1:
                                        int i16 = DeviceOverviewOtherCard.f21173i;
                                        deviceOverviewOtherCard2.findViewById(R.id.gsf_id_container).setVisibility(0);
                                        TextView textView2 = (TextView) deviceOverviewOtherCard2.findViewById(R.id.gsf_id);
                                        textView2.setTextColor(i14);
                                        textView2.setText(str);
                                        break;
                                    default:
                                        int i17 = DeviceOverviewOtherCard.f21173i;
                                        TextView textView3 = (TextView) deviceOverviewOtherCard2.findViewById(R.id.android_id);
                                        textView3.setTextColor(i14);
                                        textView3.setText(str);
                                        break;
                                }
                            }
                        });
                    }
                } catch (Exception unused) {
                }
                final String strZ = com.liuzh.deviceinfo.utilities.l.z(deviceOverviewOtherCard.getContext());
                if (!TextUtils.isEmpty(strZ)) {
                    final int i13 = 1;
                    bi.d.b(new Runnable() { // from class: ig.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i132 = i13;
                            String str = strZ;
                            int i14 = i11;
                            DeviceOverviewOtherCard deviceOverviewOtherCard2 = deviceOverviewOtherCard;
                            switch (i132) {
                                case 0:
                                    int i15 = DeviceOverviewOtherCard.f21173i;
                                    deviceOverviewOtherCard2.findViewById(R.id.gad_id_container).setVisibility(0);
                                    TextView textView = (TextView) deviceOverviewOtherCard2.findViewById(R.id.gad_id);
                                    textView.setTextColor(i14);
                                    textView.setText(str);
                                    break;
                                case 1:
                                    int i16 = DeviceOverviewOtherCard.f21173i;
                                    deviceOverviewOtherCard2.findViewById(R.id.gsf_id_container).setVisibility(0);
                                    TextView textView2 = (TextView) deviceOverviewOtherCard2.findViewById(R.id.gsf_id);
                                    textView2.setTextColor(i14);
                                    textView2.setText(str);
                                    break;
                                default:
                                    int i17 = DeviceOverviewOtherCard.f21173i;
                                    TextView textView3 = (TextView) deviceOverviewOtherCard2.findViewById(R.id.android_id);
                                    textView3.setTextColor(i14);
                                    textView3.setText(str);
                                    break;
                            }
                        }
                    });
                }
                final String string = Settings.Secure.getString(deviceOverviewOtherCard.getContext().getContentResolver(), "android_id");
                if (TextUtils.isEmpty(string)) {
                    string = deviceOverviewOtherCard.getResources().getString(R.string.unknown);
                }
                final int i14 = 2;
                bi.d.b(new Runnable() { // from class: ig.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i132 = i14;
                        String str = string;
                        int i142 = i11;
                        DeviceOverviewOtherCard deviceOverviewOtherCard2 = deviceOverviewOtherCard;
                        switch (i132) {
                            case 0:
                                int i15 = DeviceOverviewOtherCard.f21173i;
                                deviceOverviewOtherCard2.findViewById(R.id.gad_id_container).setVisibility(0);
                                TextView textView = (TextView) deviceOverviewOtherCard2.findViewById(R.id.gad_id);
                                textView.setTextColor(i142);
                                textView.setText(str);
                                break;
                            case 1:
                                int i16 = DeviceOverviewOtherCard.f21173i;
                                deviceOverviewOtherCard2.findViewById(R.id.gsf_id_container).setVisibility(0);
                                TextView textView2 = (TextView) deviceOverviewOtherCard2.findViewById(R.id.gsf_id);
                                textView2.setTextColor(i142);
                                textView2.setText(str);
                                break;
                            default:
                                int i17 = DeviceOverviewOtherCard.f21173i;
                                TextView textView3 = (TextView) deviceOverviewOtherCard2.findViewById(R.id.android_id);
                                textView3.setTextColor(i142);
                                textView3.setText(str);
                                break;
                        }
                    }
                });
                return;
            case 5:
                e80 e80Var = ((StorageCleanActivity) obj).E;
                if (e80Var != null) {
                    ((RecyclerView) e80Var.j).n0(i11);
                    return;
                } else {
                    nk.k.k("binding");
                    throw null;
                }
            case 6:
                ((u3.b) obj).i(i11);
                return;
            default:
                AppsAnalyzeActivity appsAnalyzeActivity = (AppsAnalyzeActivity) obj;
                appsAnalyzeActivity.F = null;
                appsAnalyzeActivity.D.notifyDataSetChanged();
                appsAnalyzeActivity.B.setVisibility(0);
                appsAnalyzeActivity.A.setText("0/" + i11);
                return;
        }
    }
}
