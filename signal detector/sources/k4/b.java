package K4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.apm.insight.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.lefan.signal.ui.other.HumidityView2;
import com.lefan.signal.ui.phone.PhoneSignalView;
import com.lefan.signal.ui.phone.PhoneTrendView;
import com.lefan.signal.ui.sensor.TemperatureView;
import com.lefan.signal.view.DiagnosisLevelView;

/* loaded from: classes.dex */
public final class b implements O0.a {

    /* renamed from: C, reason: collision with root package name */
    public final View f2187C;

    /* renamed from: D, reason: collision with root package name */
    public final ViewGroup f2188D;

    /* renamed from: E, reason: collision with root package name */
    public final View f2189E;

    /* renamed from: F, reason: collision with root package name */
    public final View f2190F;

    /* renamed from: G, reason: collision with root package name */
    public final View f2191G;

    /* renamed from: H, reason: collision with root package name */
    public final TextView f2192H;

    /* renamed from: I, reason: collision with root package name */
    public final View f2193I;

    /* renamed from: J, reason: collision with root package name */
    public final View f2194J;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2195a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f2196b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialCardView f2197c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f2198d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f2199e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f2200f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f2201g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f2202h;
    public final ViewGroup i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f2203j;

    /* renamed from: k, reason: collision with root package name */
    public final View f2204k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f2205l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f2206m;

    /* renamed from: n, reason: collision with root package name */
    public final View f2207n;

    public b(NestedScrollView nestedScrollView, RecyclerView recyclerView, RecyclerView recyclerView2, MaterialCardView materialCardView, TextView textView, TextView textView2, TextView textView3, MaterialCardView materialCardView2, TextView textView4, MaterialCardView materialCardView3, TextView textView5, DiagnosisLevelView diagnosisLevelView, TextView textView6, PhoneSignalView phoneSignalView, MaterialCardView materialCardView4, MaterialCardView materialCardView5, AppCompatImageView appCompatImageView, TextView textView7, TextView textView8, TextView textView9, PhoneTrendView phoneTrendView) {
        this.f2198d = nestedScrollView;
        this.f2196b = recyclerView;
        this.f2199e = recyclerView2;
        this.f2197c = materialCardView;
        this.f2200f = textView;
        this.f2201g = textView2;
        this.f2202h = textView3;
        this.i = materialCardView2;
        this.f2203j = textView4;
        this.f2204k = materialCardView3;
        this.f2205l = textView5;
        this.f2206m = diagnosisLevelView;
        this.f2207n = textView6;
        this.f2187C = phoneSignalView;
        this.f2188D = materialCardView4;
        this.f2189E = materialCardView5;
        this.f2190F = appCompatImageView;
        this.f2191G = textView7;
        this.f2192H = textView8;
        this.f2193I = textView9;
        this.f2194J = phoneTrendView;
    }

    public static b a(View view) {
        int i = R.id.cell_near_recycler;
        RecyclerView recyclerView = (RecyclerView) a4.p.e(R.id.cell_near_recycler, view);
        if (recyclerView != null) {
            i = R.id.cell_recycler;
            RecyclerView recyclerView2 = (RecyclerView) a4.p.e(R.id.cell_recycler, view);
            if (recyclerView2 != null) {
                i = R.id.location_perm_tip;
                MaterialCardView materialCardView = (MaterialCardView) a4.p.e(R.id.location_perm_tip, view);
                if (materialCardView != null) {
                    i = R.id.location_perm_tip_text;
                    TextView textView = (TextView) a4.p.e(R.id.location_perm_tip_text, view);
                    if (textView != null) {
                        i = R.id.location_request_btn;
                        TextView textView2 = (TextView) a4.p.e(R.id.location_request_btn, view);
                        if (textView2 != null) {
                            i = R.id.no_sim_tip;
                            TextView textView3 = (TextView) a4.p.e(R.id.no_sim_tip, view);
                            if (textView3 != null) {
                                i = R.id.phone_no_sim;
                                MaterialCardView materialCardView2 = (MaterialCardView) a4.p.e(R.id.phone_no_sim, view);
                                if (materialCardView2 != null) {
                                    i = R.id.phone_no_sim_btn;
                                    TextView textView4 = (TextView) a4.p.e(R.id.phone_no_sim_btn, view);
                                    if (textView4 != null) {
                                        i = R.id.phone_read_tip;
                                        MaterialCardView materialCardView3 = (MaterialCardView) a4.p.e(R.id.phone_read_tip, view);
                                        if (materialCardView3 != null) {
                                            i = R.id.phone_request_btn;
                                            TextView textView5 = (TextView) a4.p.e(R.id.phone_request_btn, view);
                                            if (textView5 != null) {
                                                i = R.id.signal_level_view;
                                                DiagnosisLevelView diagnosisLevelView = (DiagnosisLevelView) a4.p.e(R.id.signal_level_view, view);
                                                if (diagnosisLevelView != null) {
                                                    i = R.id.signal_val;
                                                    TextView textView6 = (TextView) a4.p.e(R.id.signal_val, view);
                                                    if (textView6 != null) {
                                                        i = R.id.signal_view;
                                                        PhoneSignalView phoneSignalView = (PhoneSignalView) a4.p.e(R.id.signal_view, view);
                                                        if (phoneSignalView != null) {
                                                            i = R.id.signal_view_card;
                                                            MaterialCardView materialCardView4 = (MaterialCardView) a4.p.e(R.id.signal_view_card, view);
                                                            if (materialCardView4 != null) {
                                                                i = R.id.sim_info_card;
                                                                MaterialCardView materialCardView5 = (MaterialCardView) a4.p.e(R.id.sim_info_card, view);
                                                                if (materialCardView5 != null) {
                                                                    i = R.id.sim_logo;
                                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) a4.p.e(R.id.sim_logo, view);
                                                                    if (appCompatImageView != null) {
                                                                        i = R.id.sim_name;
                                                                        TextView textView7 = (TextView) a4.p.e(R.id.sim_name, view);
                                                                        if (textView7 != null) {
                                                                            i = R.id.sim_network;
                                                                            TextView textView8 = (TextView) a4.p.e(R.id.sim_network, view);
                                                                            if (textView8 != null) {
                                                                                i = R.id.sim_sate;
                                                                                TextView textView9 = (TextView) a4.p.e(R.id.sim_sate, view);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.trend_view;
                                                                                    PhoneTrendView phoneTrendView = (PhoneTrendView) a4.p.e(R.id.trend_view, view);
                                                                                    if (phoneTrendView != null) {
                                                                                        return new b((NestedScrollView) view, recyclerView, recyclerView2, materialCardView, textView, textView2, textView3, materialCardView2, textView4, materialCardView3, textView5, diagnosisLevelView, textView6, phoneSignalView, materialCardView4, materialCardView5, appCompatImageView, textView7, textView8, textView9, phoneTrendView);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // O0.a
    public final View getRoot() {
        switch (this.f2195a) {
            case 0:
                return (LinearLayoutCompat) this.f2198d;
            default:
                return (NestedScrollView) this.f2198d;
        }
    }

    public b(LinearLayoutCompat linearLayoutCompat, AppBarLayout appBarLayout, SwitchMaterial switchMaterial, RelativeLayout relativeLayout, RecyclerView recyclerView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, AppCompatTextView appCompatTextView, SwitchMaterial switchMaterial2, HumidityView2 humidityView2, MaterialCardView materialCardView, AppCompatTextView appCompatTextView2, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, TextInputLayout textInputLayout3, TextInputEditText textInputEditText3, TextInputLayout textInputLayout4, SwitchMaterial switchMaterial3, TemperatureView temperatureView, Toolbar toolbar) {
        this.f2198d = linearLayoutCompat;
        this.f2199e = appBarLayout;
        this.f2200f = switchMaterial;
        this.i = relativeLayout;
        this.f2196b = recyclerView;
        this.f2203j = textInputEditText;
        this.f2206m = textInputLayout;
        this.f2189E = appCompatTextView;
        this.f2201g = switchMaterial2;
        this.f2191G = humidityView2;
        this.f2197c = materialCardView;
        this.f2190F = appCompatTextView2;
        this.f2204k = textInputEditText2;
        this.f2207n = textInputLayout2;
        this.f2192H = appCompatAutoCompleteTextView;
        this.f2187C = textInputLayout3;
        this.f2205l = textInputEditText3;
        this.f2188D = textInputLayout4;
        this.f2202h = switchMaterial3;
        this.f2193I = temperatureView;
        this.f2194J = toolbar;
    }
}
