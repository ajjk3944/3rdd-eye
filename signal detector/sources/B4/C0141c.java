package B4;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import k0.DialogInterfaceOnCancelListenerC2610n;
import q2.C2834o;

/* renamed from: B4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141c extends DialogInterfaceOnCancelListenerC2610n {

    /* renamed from: A0, reason: collision with root package name */
    public C2834o f702A0;

    /* renamed from: B0, reason: collision with root package name */
    public InterfaceC0140b f703B0;

    /* renamed from: C0, reason: collision with root package name */
    public c1.g f704C0;

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) {
        super.B(bundle);
        if (this.f703B0 == null) {
            Y();
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Integer num;
        String str;
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_custom_layout, viewGroup, false);
        int i = R.id.dialog_message;
        TextView textView = (TextView) a4.p.e(R.id.dialog_message, viewInflate);
        if (textView != null) {
            i = R.id.dialog_message_info;
            TextView textView2 = (TextView) a4.p.e(R.id.dialog_message_info, viewInflate);
            if (textView2 != null) {
                i = R.id.dialog_negative;
                MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.dialog_negative, viewInflate);
                if (materialButton != null) {
                    i = R.id.dialog_positive;
                    MaterialButton materialButton2 = (MaterialButton) a4.p.e(R.id.dialog_positive, viewInflate);
                    if (materialButton2 != null) {
                        i = R.id.dialog_title;
                        TextView textView3 = (TextView) a4.p.e(R.id.dialog_title, viewInflate);
                        if (textView3 != null) {
                            this.f702A0 = new C2834o((LinearLayoutCompat) viewInflate, textView, textView2, materialButton, materialButton2, textView3, 9);
                            final int i3 = 0;
                            materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: B4.a

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ C0141c f701b;

                                {
                                    this.f701b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i3) {
                                        case 0:
                                            C0141c c0141c = this.f701b;
                                            InterfaceC0140b interfaceC0140b = c0141c.f703B0;
                                            if (interfaceC0140b != null) {
                                                interfaceC0140b.i(c0141c.v0);
                                                break;
                                            }
                                            break;
                                        default:
                                            C0141c c0141c2 = this.f701b;
                                            InterfaceC0140b interfaceC0140b2 = c0141c2.f703B0;
                                            if (interfaceC0140b2 != null) {
                                                interfaceC0140b2.m(c0141c2.v0);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            C2834o c2834o = this.f702A0;
                            q5.i.b(c2834o);
                            final int i6 = 1;
                            ((MaterialButton) c2834o.f23255e).setOnClickListener(new View.OnClickListener(this) { // from class: B4.a

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ C0141c f701b;

                                {
                                    this.f701b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i6) {
                                        case 0:
                                            C0141c c0141c = this.f701b;
                                            InterfaceC0140b interfaceC0140b = c0141c.f703B0;
                                            if (interfaceC0140b != null) {
                                                interfaceC0140b.i(c0141c.v0);
                                                break;
                                            }
                                            break;
                                        default:
                                            C0141c c0141c2 = this.f701b;
                                            InterfaceC0140b interfaceC0140b2 = c0141c2.f703B0;
                                            if (interfaceC0140b2 != null) {
                                                interfaceC0140b2.m(c0141c2.v0);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            C2834o c2834o2 = this.f702A0;
                            q5.i.b(c2834o2);
                            TextView textView4 = (TextView) c2834o2.f23257g;
                            c1.g gVar = this.f704C0;
                            textView4.setText(gVar != null ? (String) gVar.f5897c : null);
                            c1.g gVar2 = this.f704C0;
                            String str2 = gVar2 != null ? (String) gVar2.f5897c : null;
                            if (str2 == null || str2.length() == 0) {
                                C2834o c2834o3 = this.f702A0;
                                q5.i.b(c2834o3);
                                ((TextView) c2834o3.f23257g).setVisibility(8);
                            }
                            C2834o c2834o4 = this.f702A0;
                            q5.i.b(c2834o4);
                            TextView textView5 = (TextView) c2834o4.f23253c;
                            c1.g gVar3 = this.f704C0;
                            textView5.setText(gVar3 != null ? (String) gVar3.f5896b : null);
                            C2834o c2834o5 = this.f702A0;
                            q5.i.b(c2834o5);
                            ((TextView) c2834o5.f23254d).setText((CharSequence) null);
                            c1.g gVar4 = this.f704C0;
                            if (gVar4 != null && (str = (String) gVar4.f5898d) != null) {
                                C2834o c2834o6 = this.f702A0;
                                q5.i.b(c2834o6);
                                ((MaterialButton) c2834o6.f23256f).setText(str);
                            }
                            c1.g gVar5 = this.f704C0;
                            if (gVar5 != null && (num = (Integer) gVar5.f5899e) != null) {
                                int iIntValue = num.intValue();
                                C2834o c2834o7 = this.f702A0;
                                q5.i.b(c2834o7);
                                ((MaterialButton) c2834o7.f23256f).setTextColor(iIntValue);
                            }
                            this.f21652q0 = true;
                            Dialog dialog = this.v0;
                            if (dialog != null) {
                                dialog.setCancelable(true);
                            }
                            C2834o c2834o8 = this.f702A0;
                            q5.i.b(c2834o8);
                            return (LinearLayoutCompat) c2834o8.f23252b;
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
        this.f702A0 = null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.customDialog;
    }
}
