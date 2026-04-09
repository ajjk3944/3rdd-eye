package Q4;

import A2.C0115c;
import android.app.Dialog;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C0314k;
import androidx.recyclerview.widget.RecyclerView;
import com.apm.insight.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import h0.C2351a;

/* loaded from: classes.dex */
public final class x extends k3.f {

    /* renamed from: A0, reason: collision with root package name */
    public C2351a f3253A0;

    /* renamed from: B0, reason: collision with root package name */
    public final C0115c f3254B0 = new C0115c(q5.p.a(v.class), new w(this, 0), new w(this, 2), new w(this, 1));

    /* renamed from: C0, reason: collision with root package name */
    public final D4.a f3255C0 = new D4.a(5, (byte) 0);

    /* renamed from: D0, reason: collision with root package name */
    public String f3256D0;

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_more_pair, viewGroup, false);
        int i = R.id.bluetooth_list_recycler;
        RecyclerView recyclerView = (RecyclerView) a4.p.e(R.id.bluetooth_list_recycler, viewInflate);
        if (recyclerView != null) {
            i = R.id.cancel;
            MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.cancel, viewInflate);
            if (materialButton != null) {
                this.f3253A0 = new C2351a((LinearLayout) viewInflate, recyclerView, materialButton);
                D4.a aVar = this.f3255C0;
                recyclerView.setAdapter(aVar);
                recyclerView.g(new C0314k(m()));
                aVar.n(R.layout.empty_no_data);
                ((v) this.f3254B0.getValue()).f3244c.e(this, new N4.b(new e(2, this), 2));
                aVar.f4672f = new F4.c(8, this);
                C2351a c2351a = this.f3253A0;
                q5.i.b(c2351a);
                ((MaterialButton) c2351a.f20442c).setOnClickListener(new B4.g(13, this));
                C2351a c2351a2 = this.f3253A0;
                q5.i.b(c2351a2);
                LinearLayout linearLayout = (LinearLayout) c2351a2.f20441b;
                q5.i.d(linearLayout, "getRoot(...)");
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void D() {
        super.D();
        this.f3253A0 = null;
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

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.bottomDialog;
    }
}
