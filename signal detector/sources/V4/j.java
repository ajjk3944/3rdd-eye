package V4;

import android.widget.TextView;
import c5.C0412i;
import com.apm.insight.R;
import com.google.android.material.card.MaterialCardView;
import com.lefan.signal.ui.satellite.SatelliteActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements p5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCardView f3900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextView f3901c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SatelliteActivity f3902d;

    public /* synthetic */ j(MaterialCardView materialCardView, TextView textView, SatelliteActivity satelliteActivity) {
        this.f3899a = 1;
        this.f3900b = materialCardView;
        this.f3901c = textView;
        this.f3902d = satelliteActivity;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        int i = this.f3899a;
        C0412i c0412i = C0412i.f5929a;
        TextView textView = this.f3901c;
        SatelliteActivity satelliteActivity = this.f3902d;
        MaterialCardView materialCardView = this.f3900b;
        Boolean bool = (Boolean) obj;
        switch (i) {
            case 0:
                int i3 = SatelliteActivity.f19187g0;
                if (bool.booleanValue()) {
                    materialCardView.setVisibility(8);
                    satelliteActivity.f19188O.n(R.layout.empty_loading2);
                } else {
                    textView.setText(satelliteActivity.getString(R.string.not_support_gps));
                    K4.h hVar = satelliteActivity.b0;
                    if (hVar == null) {
                        q5.i.g("binding");
                        throw null;
                    }
                    hVar.i.setVisibility(8);
                    materialCardView.setVisibility(0);
                    satelliteActivity.f19188O.n(R.layout.empty_no_data);
                }
                return c0412i;
            case 1:
                int i6 = SatelliteActivity.f19187g0;
                if (bool.booleanValue()) {
                    materialCardView.setVisibility(8);
                } else {
                    textView.setText(satelliteActivity.getString(R.string.satellite_need_gps));
                    materialCardView.setVisibility(0);
                    satelliteActivity.f19188O.n(R.layout.empty_no_data);
                }
                return c0412i;
            default:
                int i7 = SatelliteActivity.f19187g0;
                if (bool.booleanValue()) {
                    materialCardView.setVisibility(8);
                    satelliteActivity.f19188O.n(R.layout.empty_loading2);
                } else {
                    textView.setText(satelliteActivity.getString(R.string.satellite_need_location));
                    materialCardView.setVisibility(0);
                    satelliteActivity.f19188O.n(R.layout.empty_no_data);
                }
                return c0412i;
        }
    }

    public /* synthetic */ j(MaterialCardView materialCardView, SatelliteActivity satelliteActivity, TextView textView, int i) {
        this.f3899a = i;
        this.f3900b = materialCardView;
        this.f3902d = satelliteActivity;
        this.f3901c = textView;
    }
}
