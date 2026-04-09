package N4;

import B4.r;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.D;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.ui.other.OtherFragment;
import h0.C2351a;
import k0.DialogInterfaceOnCancelListenerC2610n;
import q2.C2834o;

/* loaded from: classes.dex */
public final class c extends DialogInterfaceOnCancelListenerC2610n {

    /* renamed from: A0, reason: collision with root package name */
    public C2834o f2988A0;

    /* renamed from: B0, reason: collision with root package name */
    public T4.l f2989B0;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f2990C0 = true;

    /* renamed from: D0, reason: collision with root package name */
    public C2351a f2991D0;

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        D d6;
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.altitude_dialog, viewGroup, false);
        int i = R.id.alt_unit;
        SwitchCompat switchCompat = (SwitchCompat) a4.p.e(R.id.alt_unit, viewInflate);
        if (switchCompat != null) {
            i = R.id.alt_val;
            TextView textView = (TextView) a4.p.e(R.id.alt_val, viewInflate);
            if (textView != null) {
                i = R.id.altitude_title;
                TextView textView2 = (TextView) a4.p.e(R.id.altitude_title, viewInflate);
                if (textView2 != null) {
                    i = R.id.negative_btn;
                    MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.negative_btn, viewInflate);
                    if (materialButton != null) {
                        i = R.id.positive_btn;
                        MaterialButton materialButton2 = (MaterialButton) a4.p.e(R.id.positive_btn, viewInflate);
                        if (materialButton2 != null) {
                            this.f2988A0 = new C2834o((LinearLayout) viewInflate, switchCompat, textView, textView2, materialButton, materialButton2, 3);
                            if (this.f2989B0 == null || this.f2991D0 == null) {
                                Z(false, false);
                            }
                            C2834o c2834o = this.f2988A0;
                            q5.i.b(c2834o);
                            TextView textView3 = (TextView) c2834o.f23254d;
                            C2834o c2834o2 = this.f2988A0;
                            q5.i.b(c2834o2);
                            SwitchCompat switchCompat2 = (SwitchCompat) c2834o2.f23253c;
                            Context contextM = m();
                            boolean zK = contextM != null ? com.bumptech.glide.e.k(contextM, "altitude_unit", true) : true;
                            this.f2990C0 = zK;
                            if (zK) {
                                C2834o c2834o3 = this.f2988A0;
                                q5.i.b(c2834o3);
                                ((TextView) c2834o3.f23255e).setText(r(R.string.altitude) + "(m)");
                            } else {
                                C2834o c2834o4 = this.f2988A0;
                                q5.i.b(c2834o4);
                                ((TextView) c2834o4.f23255e).setText(r(R.string.altitude) + "(ft)");
                            }
                            switchCompat2.setChecked(!this.f2990C0);
                            switchCompat2.setOnCheckedChangeListener(new a(0, this));
                            T4.l lVar = this.f2989B0;
                            if (lVar != null && (d6 = lVar.f3623d) != null) {
                                d6.e(s(), new b(new H4.c(this, 1, textView3), 0));
                            }
                            C2834o c2834o5 = this.f2988A0;
                            q5.i.b(c2834o5);
                            ((MaterialButton) c2834o5.f23256f).setOnClickListener(new B4.g(10, this));
                            C2834o c2834o6 = this.f2988A0;
                            q5.i.b(c2834o6);
                            ((MaterialButton) c2834o6.f23257g).setOnClickListener(new r(this, 4, textView3));
                            C2834o c2834o7 = this.f2988A0;
                            q5.i.b(c2834o7);
                            LinearLayout linearLayout = (LinearLayout) c2834o7.f23252b;
                            q5.i.d(linearLayout, "getRoot(...)");
                            return linearLayout;
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
        this.f2988A0 = null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.customDialog;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        q5.i.e(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C2351a c2351a = this.f2991D0;
        if (c2351a != null) {
            q5.l lVar = (q5.l) c2351a.f20441b;
            Context contextM = ((OtherFragment) c2351a.f20442c).m();
            lVar.f23296a = contextM != null ? com.bumptech.glide.e.k(contextM, "altitude_unit", true) : true;
        }
    }
}
