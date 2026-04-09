package B4;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import java.util.Arrays;
import k0.DialogInterfaceOnCancelListenerC2610n;

/* loaded from: classes.dex */
public final class v extends DialogInterfaceOnCancelListenerC2610n {

    /* renamed from: A0, reason: collision with root package name */
    public c1.g f756A0;

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) {
        super.B(bundle);
        Y();
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_privacy, viewGroup, false);
        int i = R.id.dialog_negative;
        MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.dialog_negative, viewInflate);
        if (materialButton != null) {
            i = R.id.dialog_positive;
            MaterialButton materialButton2 = (MaterialButton) a4.p.e(R.id.dialog_positive, viewInflate);
            if (materialButton2 != null) {
                i = R.id.dialog_title;
                if (((TextView) a4.p.e(R.id.dialog_title, viewInflate)) != null) {
                    i = R.id.line1;
                    if (((LinearLayout) a4.p.e(R.id.line1, viewInflate)) != null) {
                        i = R.id.privacy_text;
                        TextView textView = (TextView) a4.p.e(R.id.privacy_text, viewInflate);
                        if (textView != null) {
                            this.f756A0 = new c1.g((LinearLayoutCompat) viewInflate, materialButton, materialButton2, textView, 29);
                            this.f21652q0 = false;
                            Dialog dialog = this.v0;
                            if (dialog != null) {
                                dialog.setCancelable(false);
                            }
                            c1.g gVar = this.f756A0;
                            q5.i.b(gVar);
                            ((MaterialButton) gVar.f5897c).setOnClickListener(new t());
                            c1.g gVar2 = this.f756A0;
                            q5.i.b(gVar2);
                            ((MaterialButton) gVar2.f5898d).setOnClickListener(new g(2, this));
                            String strR = r(R.string.privacy_info);
                            q5.i.d(strR, "getString(...)");
                            String str = String.format(strR, Arrays.copyOf(new Object[]{r(R.string.privacy_agreement), r(R.string.privacy_statement)}, 2));
                            c1.g gVar3 = this.f756A0;
                            q5.i.b(gVar3);
                            TextView textView2 = (TextView) gVar3.f5899e;
                            textView2.setMovementMethod(LinkMovementMethod.getInstance());
                            SpannableString spannableString = new SpannableString(str);
                            String strR2 = r(R.string.privacy_agreement);
                            q5.i.d(strR2, "getString(...)");
                            String strR3 = r(R.string.privacy_statement);
                            q5.i.d(strR3, "getString(...)");
                            int iC0 = y5.l.c0(6, str, strR2);
                            int iC02 = y5.l.c0(6, str, strR3);
                            u uVar = new u(this, 0);
                            u uVar2 = new u(this, 1);
                            spannableString.setSpan(uVar, iC0, strR2.length() + iC0, 17);
                            spannableString.setSpan(uVar2, iC02, strR3.length() + iC02, 17);
                            textView2.setText(spannableString);
                            c1.g gVar4 = this.f756A0;
                            q5.i.b(gVar4);
                            return (LinearLayoutCompat) gVar4.f5896b;
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
        this.f756A0 = null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.customDialog;
    }
}
