package V4;

import A2.C0115c;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.C0314k;
import androidx.recyclerview.widget.RecyclerView;
import com.apm.insight.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class q extends k3.f {

    /* renamed from: A0, reason: collision with root package name */
    public K4.m f3925A0;

    /* renamed from: B0, reason: collision with root package name */
    public final D4.a f3926B0 = new D4.a(13);

    /* renamed from: C0, reason: collision with root package name */
    public final C0115c f3927C0 = new C0115c(q5.p.a(u.class), new p(this, 0), new p(this, 2), new p(this, 1));

    /* renamed from: D0, reason: collision with root package name */
    public boolean f3928D0 = true;

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.satellite_list_dialog, viewGroup, false);
        int i = R.id.sate_info_liner;
        if (((LinearLayout) a4.p.e(R.id.sate_info_liner, viewInflate)) != null) {
            i = R.id.satellite_list_cancel;
            MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.satellite_list_cancel, viewInflate);
            if (materialButton != null) {
                i = R.id.satellite_list_recycler;
                RecyclerView recyclerView = (RecyclerView) a4.p.e(R.id.satellite_list_recycler, viewInflate);
                if (recyclerView != null) {
                    i = R.id.satellite_refresh;
                    SwitchCompat switchCompat = (SwitchCompat) a4.p.e(R.id.satellite_refresh, viewInflate);
                    if (switchCompat != null) {
                        i = R.id.tip_available;
                        if (((TextView) a4.p.e(R.id.tip_available, viewInflate)) != null) {
                            i = R.id.tip_azimuth;
                            if (((TextView) a4.p.e(R.id.tip_azimuth, viewInflate)) != null) {
                                i = R.id.tip_carrierFrequencyHz;
                                if (((TextView) a4.p.e(R.id.tip_carrierFrequencyHz, viewInflate)) != null) {
                                    i = R.id.tip_country;
                                    if (((TextView) a4.p.e(R.id.tip_country, viewInflate)) != null) {
                                        i = R.id.tip_elevation;
                                        if (((TextView) a4.p.e(R.id.tip_elevation, viewInflate)) != null) {
                                            i = R.id.tip_id;
                                            if (((TextView) a4.p.e(R.id.tip_id, viewInflate)) != null) {
                                                i = R.id.tip_signal;
                                                if (((TextView) a4.p.e(R.id.tip_signal, viewInflate)) != null) {
                                                    this.f3925A0 = new K4.m((LinearLayout) viewInflate, materialButton, recyclerView, switchCompat);
                                                    recyclerView.g(new C0314k(m()));
                                                    D4.a aVar = this.f3926B0;
                                                    recyclerView.setAdapter(aVar);
                                                    K4.m mVar = this.f3925A0;
                                                    q5.i.b(mVar);
                                                    SwitchCompat switchCompat2 = mVar.f2344d;
                                                    Context contextM = m();
                                                    boolean zK = contextM != null ? com.bumptech.glide.e.k(contextM, "satellite_list_dialog_refresh", true) : true;
                                                    this.f3928D0 = zK;
                                                    switchCompat2.setChecked(zK);
                                                    aVar.n(R.layout.empty_no_data);
                                                    q5.l lVar = new q5.l();
                                                    ((u) this.f3927C0.getValue()).f3947h.e(this, new N4.b(new H4.c(this, 7, lVar), 4));
                                                    aVar.f4672f = new F4.c(14, this);
                                                    K4.m mVar2 = this.f3925A0;
                                                    q5.i.b(mVar2);
                                                    mVar2.f2343c.setOnClickListener(new B4.g(20, this));
                                                    switchCompat2.setOnClickListener(new B4.r(this, 10, switchCompat2));
                                                    recyclerView.h(new Q4.a(1, lVar));
                                                    K4.m mVar3 = this.f3925A0;
                                                    q5.i.b(mVar3);
                                                    LinearLayout linearLayout = mVar3.f2342b;
                                                    q5.i.d(linearLayout, "getRoot(...)");
                                                    return linearLayout;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void D() {
        super.D();
        this.f3925A0 = null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void K() throws Resources.NotFoundException {
        BottomSheetBehavior bottomSheetBehaviorH;
        super.K();
        Dialog dialog = this.v0;
        k3.e eVar = dialog instanceof k3.e ? (k3.e) dialog : null;
        if (eVar == null || (bottomSheetBehaviorH = eVar.h()) == null) {
            return;
        }
        DisplayMetrics displayMetrics = q().getDisplayMetrics();
        q5.i.d(displayMetrics, "getDisplayMetrics(...)");
        int i = displayMetrics.heightPixels;
        bottomSheetBehaviorH.f18157l = i > displayMetrics.widthPixels ? (i * 2) / 3 : (i * 4) / 5;
        bottomSheetBehaviorH.G(false);
        bottomSheetBehaviorH.f18134X = true;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.bottomDialog;
    }
}
