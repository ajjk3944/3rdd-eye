package U4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.D;
import androidx.recyclerview.widget.RecyclerView;
import com.apm.insight.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u extends k3.f {

    /* renamed from: A0, reason: collision with root package name */
    public K4.l f3768A0;

    /* renamed from: B0, reason: collision with root package name */
    public v f3769B0;

    /* renamed from: C0, reason: collision with root package name */
    public final D4.a f3770C0 = new D4.a(R.layout.item_wifi_info, 11);

    /* renamed from: D0, reason: collision with root package name */
    public final ArrayList f3771D0 = new ArrayList();

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) {
        super.B(bundle);
        if (this.f3769B0 == null) {
            Y();
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        D d6;
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_phone_signal, viewGroup, false);
        int i = R.id.phone_signal_cancel;
        MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.phone_signal_cancel, viewInflate);
        if (materialButton != null) {
            i = R.id.phone_signal_recycler;
            RecyclerView recyclerView = (RecyclerView) a4.p.e(R.id.phone_signal_recycler, viewInflate);
            if (recyclerView != null) {
                this.f3768A0 = new K4.l((LinearLayout) viewInflate, materialButton, recyclerView, 1);
                D4.a aVar = this.f3770C0;
                recyclerView.setAdapter(aVar);
                aVar.n(R.layout.empty_empty_min_height_no_bg);
                v vVar = this.f3769B0;
                if (vVar != null && (d6 = vVar.f3773c) != null) {
                    d6.e(this, new N4.b(new Q4.e(3, this), 3));
                }
                K4.l lVar = this.f3768A0;
                q5.i.b(lVar);
                lVar.f2340c.setOnClickListener(new B4.g(17, this));
                aVar.f4672f = new F4.c(12, this);
                K4.l lVar2 = this.f3768A0;
                q5.i.b(lVar2);
                LinearLayout linearLayout = lVar2.f2339b;
                q5.i.d(linearLayout, "getRoot(...)");
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void D() {
        super.D();
        this.f3768A0 = null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void K() {
        BottomSheetBehavior bottomSheetBehaviorH;
        super.K();
        k3.e eVar = (k3.e) this.v0;
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
