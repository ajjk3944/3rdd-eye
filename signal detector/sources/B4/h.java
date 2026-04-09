package B4;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.apm.insight.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import o.a1;

/* loaded from: classes.dex */
public final class h extends k3.f {

    /* renamed from: A0, reason: collision with root package name */
    public a1 f716A0;

    /* renamed from: B0, reason: collision with root package name */
    public Integer f717B0;

    /* renamed from: C0, reason: collision with root package name */
    public String f718C0;

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) {
        super.B(bundle);
        Integer numValueOf = this.f717B0;
        String string = null;
        if (numValueOf == null) {
            numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("help_tip_stringId")) : null;
        }
        this.f717B0 = numValueOf;
        String str = this.f718C0;
        if (str != null) {
            string = str;
        } else if (bundle != null) {
            string = bundle.getString("help_title");
        }
        this.f718C0 = string;
        Integer num = this.f717B0;
        if (num == null || (num != null && num.intValue() == 0)) {
            Y();
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String strR;
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_help, viewGroup, false);
        int i = R.id.help_close;
        MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.help_close, viewInflate);
        if (materialButton != null) {
            i = R.id.help_message;
            AppCompatTextView appCompatTextView = (AppCompatTextView) a4.p.e(R.id.help_message, viewInflate);
            if (appCompatTextView != null) {
                i = R.id.help_title;
                TextView textView = (TextView) a4.p.e(R.id.help_title, viewInflate);
                if (textView != null) {
                    this.f716A0 = new a1((LinearLayoutCompat) viewInflate, materialButton, appCompatTextView, textView);
                    String strR2 = this.f718C0;
                    if (strR2 == null) {
                        strR2 = r(R.string.string_tip);
                        q5.i.d(strR2, "getString(...)");
                    }
                    textView.setText(strR2);
                    a1 a1Var = this.f716A0;
                    q5.i.b(a1Var);
                    ((MaterialButton) a1Var.f22480c).setOnClickListener(new g(0, this));
                    Integer num = this.f717B0;
                    if (num == null || (strR = r(num.intValue())) == null) {
                        strR = "";
                    }
                    a1 a1Var2 = this.f716A0;
                    q5.i.b(a1Var2);
                    ((AppCompatTextView) a1Var2.f22481d).setText(Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(strR, 2) : Html.fromHtml(strR));
                    a1 a1Var3 = this.f716A0;
                    q5.i.b(a1Var3);
                    return (LinearLayoutCompat) a1Var3.f22479b;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void J(Bundle bundle) {
        super.J(bundle);
        Integer num = this.f717B0;
        bundle.putInt("help_tip_stringId", num != null ? num.intValue() : 0);
        bundle.putString("help_title", this.f718C0);
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void K() {
        BottomSheetBehavior bottomSheetBehaviorH;
        super.K();
        k3.e eVar = (k3.e) this.v0;
        if (eVar == null || (bottomSheetBehaviorH = eVar.h()) == null) {
            return;
        }
        DisplayMetrics displayMetrics = q().getDisplayMetrics();
        q5.i.d(displayMetrics, "getDisplayMetrics(...)");
        int i = displayMetrics.heightPixels;
        bottomSheetBehaviorH.f18157l = i > displayMetrics.widthPixels ? (i * 2) / 3 : (i * 4) / 5;
        bottomSheetBehaviorH.I(3);
        bottomSheetBehaviorH.f18134X = true;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.bottomDialog;
    }

    public final void g0(int i, String str) {
        this.f718C0 = str;
        this.f717B0 = Integer.valueOf(i);
    }
}
