package B4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import k0.DialogInterfaceOnCancelListenerC2610n;
import z4.C3024a;

/* loaded from: classes.dex */
public final class A extends DialogInterfaceOnCancelListenerC2610n {

    /* renamed from: A0, reason: collision with root package name */
    public String f687A0;

    /* renamed from: B0, reason: collision with root package name */
    public String f688B0;

    /* renamed from: C0, reason: collision with root package name */
    public C3024a f689C0;

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) {
        super.B(bundle);
        String string = this.f687A0;
        String string2 = null;
        if (string == null) {
            string = bundle != null ? bundle.getString("dialog_copy_message") : null;
        }
        this.f687A0 = string;
        String str = this.f688B0;
        if (str != null) {
            string2 = str;
        } else if (bundle != null) {
            string2 = bundle.getString("dialog_copy_title");
        }
        this.f688B0 = string2;
        if (this.f687A0 == null) {
            Y();
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_share_copy, viewGroup, false);
        int i = R.id.copy_bottom;
        if (((LinearLayout) a4.p.e(R.id.copy_bottom, viewInflate)) != null) {
            i = R.id.dialog_cancel;
            MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.dialog_cancel, viewInflate);
            if (materialButton != null) {
                i = R.id.dialog_copy;
                MaterialButton materialButton2 = (MaterialButton) a4.p.e(R.id.dialog_copy, viewInflate);
                if (materialButton2 != null) {
                    i = R.id.dialog_message;
                    TextView textView = (TextView) a4.p.e(R.id.dialog_message, viewInflate);
                    if (textView != null) {
                        i = R.id.dialog_share;
                        MaterialButton materialButton3 = (MaterialButton) a4.p.e(R.id.dialog_share, viewInflate);
                        if (materialButton3 != null) {
                            i = R.id.dialog_title;
                            TextView textView2 = (TextView) a4.p.e(R.id.dialog_title, viewInflate);
                            if (textView2 != null) {
                                this.f689C0 = new C3024a((LinearLayout) viewInflate, materialButton, materialButton2, textView, materialButton3, textView2);
                                String str = this.f688B0;
                                if (str != null) {
                                    textView2.setText(str);
                                }
                                textView.setText(this.f687A0);
                                C3024a c3024a = this.f689C0;
                                q5.i.b(c3024a);
                                final int i3 = 0;
                                c3024a.f24479b.setOnClickListener(new View.OnClickListener(this) { // from class: B4.z

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ A f765b;

                                    {
                                        this.f765b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i3) {
                                            case 0:
                                                this.f765b.Z(false, false);
                                                break;
                                            case 1:
                                                A a6 = this.f765b;
                                                d5.y.i(a6.m(), a6.f687A0);
                                                a6.Z(false, false);
                                                break;
                                            default:
                                                A a7 = this.f765b;
                                                String str2 = a7.f687A0;
                                                if (str2 != null && str2.length() != 0) {
                                                    Context contextM = a7.m();
                                                    String str3 = a7.f687A0;
                                                    String str4 = a7.f688B0;
                                                    if (contextM != null && str3 != null && str3.length() != 0) {
                                                        Intent intent = new Intent();
                                                        intent.setAction("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", str3);
                                                        Intent intentCreateChooser = Intent.createChooser(intent, str4);
                                                        if (intentCreateChooser.resolveActivity(contextM.getPackageManager()) != null) {
                                                            contextM.startActivity(intentCreateChooser);
                                                        } else {
                                                            F4.d.b(contextM, contextM.getString(R.string.none_share_app));
                                                        }
                                                    }
                                                    a7.Z(false, false);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                C3024a c3024a2 = this.f689C0;
                                q5.i.b(c3024a2);
                                final int i6 = 1;
                                c3024a2.f24480c.setOnClickListener(new View.OnClickListener(this) { // from class: B4.z

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ A f765b;

                                    {
                                        this.f765b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i6) {
                                            case 0:
                                                this.f765b.Z(false, false);
                                                break;
                                            case 1:
                                                A a6 = this.f765b;
                                                d5.y.i(a6.m(), a6.f687A0);
                                                a6.Z(false, false);
                                                break;
                                            default:
                                                A a7 = this.f765b;
                                                String str2 = a7.f687A0;
                                                if (str2 != null && str2.length() != 0) {
                                                    Context contextM = a7.m();
                                                    String str3 = a7.f687A0;
                                                    String str4 = a7.f688B0;
                                                    if (contextM != null && str3 != null && str3.length() != 0) {
                                                        Intent intent = new Intent();
                                                        intent.setAction("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", str3);
                                                        Intent intentCreateChooser = Intent.createChooser(intent, str4);
                                                        if (intentCreateChooser.resolveActivity(contextM.getPackageManager()) != null) {
                                                            contextM.startActivity(intentCreateChooser);
                                                        } else {
                                                            F4.d.b(contextM, contextM.getString(R.string.none_share_app));
                                                        }
                                                    }
                                                    a7.Z(false, false);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                C3024a c3024a3 = this.f689C0;
                                q5.i.b(c3024a3);
                                final int i7 = 2;
                                c3024a3.f24481d.setOnClickListener(new View.OnClickListener(this) { // from class: B4.z

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ A f765b;

                                    {
                                        this.f765b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i7) {
                                            case 0:
                                                this.f765b.Z(false, false);
                                                break;
                                            case 1:
                                                A a6 = this.f765b;
                                                d5.y.i(a6.m(), a6.f687A0);
                                                a6.Z(false, false);
                                                break;
                                            default:
                                                A a7 = this.f765b;
                                                String str2 = a7.f687A0;
                                                if (str2 != null && str2.length() != 0) {
                                                    Context contextM = a7.m();
                                                    String str3 = a7.f687A0;
                                                    String str4 = a7.f688B0;
                                                    if (contextM != null && str3 != null && str3.length() != 0) {
                                                        Intent intent = new Intent();
                                                        intent.setAction("android.intent.action.SEND");
                                                        intent.setType("text/plain");
                                                        intent.putExtra("android.intent.extra.TEXT", str3);
                                                        Intent intentCreateChooser = Intent.createChooser(intent, str4);
                                                        if (intentCreateChooser.resolveActivity(contextM.getPackageManager()) != null) {
                                                            contextM.startActivity(intentCreateChooser);
                                                        } else {
                                                            F4.d.b(contextM, contextM.getString(R.string.none_share_app));
                                                        }
                                                    }
                                                    a7.Z(false, false);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                C3024a c3024a4 = this.f689C0;
                                q5.i.b(c3024a4);
                                return (LinearLayout) c3024a4.f24482e;
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
        this.f689C0 = null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void J(Bundle bundle) {
        super.J(bundle);
        bundle.putString("dialog_copy_message", this.f687A0);
        bundle.putString("dialog_copy_title", this.f688B0);
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.customDialog;
    }
}
