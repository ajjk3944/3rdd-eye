package Q4;

import A2.C0115c;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.C0314k;
import androidx.recyclerview.widget.RecyclerView;
import com.apm.insight.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class c extends k3.f {

    /* renamed from: A0, reason: collision with root package name */
    public K4.m f3193A0;

    /* renamed from: B0, reason: collision with root package name */
    public final C0115c f3194B0 = new C0115c(q5.p.a(v.class), new b(this, 0), new b(this, 2), new b(this, 1));

    /* renamed from: C0, reason: collision with root package name */
    public boolean f3195C0 = true;

    /* renamed from: D0, reason: collision with root package name */
    public final D4.a f3196D0 = new D4.a(6, (byte) 0);

    /* renamed from: E0, reason: collision with root package name */
    public String f3197E0;

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_more_bluetooth, viewGroup, false);
        int i = R.id.bluetooth_list_recycler;
        RecyclerView recyclerView = (RecyclerView) a4.p.e(R.id.bluetooth_list_recycler, viewInflate);
        if (recyclerView != null) {
            i = R.id.cancel;
            MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.cancel, viewInflate);
            if (materialButton != null) {
                i = R.id.refresh_switch;
                SwitchCompat switchCompat = (SwitchCompat) a4.p.e(R.id.refresh_switch, viewInflate);
                if (switchCompat != null) {
                    this.f3193A0 = new K4.m((LinearLayout) viewInflate, recyclerView, materialButton, switchCompat);
                    recyclerView.g(new C0314k(m()));
                    D4.a aVar = this.f3196D0;
                    recyclerView.setAdapter(aVar);
                    K4.m mVar = this.f3193A0;
                    q5.i.b(mVar);
                    SwitchCompat switchCompat2 = mVar.f2344d;
                    Context contextM = m();
                    boolean zK = contextM != null ? com.bumptech.glide.e.k(contextM, "bluetooth_list_dialog_refresh", true) : true;
                    this.f3195C0 = zK;
                    switchCompat2.setChecked(zK);
                    aVar.n(R.layout.empty_no_data);
                    switchCompat2.setOnClickListener(new B4.r(this, 7, switchCompat2));
                    aVar.f4672f = new F4.c(5, this);
                    K4.m mVar2 = this.f3193A0;
                    q5.i.b(mVar2);
                    mVar2.f2343c.setOnClickListener(new B4.g(11, this));
                    q5.l lVar = new q5.l();
                    ((v) this.f3194B0.getValue()).f3246e.e(this, new N4.b(new H4.c(this, 2, lVar), 1));
                    recyclerView.h(new a(0, lVar));
                    K4.m mVar3 = this.f3193A0;
                    q5.i.b(mVar3);
                    LinearLayout linearLayout = mVar3.f2342b;
                    q5.i.d(linearLayout, "getRoot(...)");
                    return linearLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void D() {
        super.D();
        this.f3193A0 = null;
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
        bottomSheetBehaviorH.I(3);
        bottomSheetBehaviorH.f18134X = true;
    }
}
