package B4;

import Y2.C0200b;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import k0.DialogInterfaceOnCancelListenerC2610n;
import z5.AbstractC3046w;

/* loaded from: classes.dex */
public final class y extends DialogInterfaceOnCancelListenerC2610n {

    /* renamed from: A0, reason: collision with root package name */
    public C0200b f762A0;

    /* renamed from: B0, reason: collision with root package name */
    public String f763B0;

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) {
        super.B(bundle);
        String string = this.f763B0;
        if (string == null) {
            string = bundle != null ? bundle.getString("dialog_apk_flavor") : null;
        }
        this.f763B0 = string;
        if (string == null || y5.l.b0(string)) {
            Y();
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_share, viewGroup, false);
        int i = R.id.app_info;
        RelativeLayout relativeLayout = (RelativeLayout) a4.p.e(R.id.app_info, viewInflate);
        if (relativeLayout != null) {
            i = R.id.app_loading;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) a4.p.e(R.id.app_loading, viewInflate);
            if (linearLayoutCompat != null) {
                i = R.id.app_logo;
                AppCompatImageView appCompatImageView = (AppCompatImageView) a4.p.e(R.id.app_logo, viewInflate);
                if (appCompatImageView != null) {
                    i = R.id.app_name;
                    TextView textView = (TextView) a4.p.e(R.id.app_name, viewInflate);
                    if (textView != null) {
                        i = R.id.app_size;
                        TextView textView2 = (TextView) a4.p.e(R.id.app_size, viewInflate);
                        if (textView2 != null) {
                            i = R.id.dialog_title;
                            if (((TextView) a4.p.e(R.id.dialog_title, viewInflate)) != null) {
                                i = R.id.line1;
                                if (((LinearLayout) a4.p.e(R.id.line1, viewInflate)) != null) {
                                    i = R.id.share_apk;
                                    MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.share_apk, viewInflate);
                                    if (materialButton != null) {
                                        i = R.id.share_link;
                                        MaterialButton materialButton2 = (MaterialButton) a4.p.e(R.id.share_link, viewInflate);
                                        if (materialButton2 != null) {
                                            this.f762A0 = new C0200b((LinearLayout) viewInflate, relativeLayout, linearLayoutCompat, appCompatImageView, textView, textView2, materialButton, materialButton2, 5);
                                            q5.o oVar = new q5.o();
                                            AbstractC3046w.l(AbstractC3046w.b(), null, new x(oVar, this, null), 3);
                                            C0200b c0200b = this.f762A0;
                                            q5.i.b(c0200b);
                                            ((MaterialButton) c0200b.f4309h).setOnClickListener(new r(oVar, 1, this));
                                            C0200b c0200b2 = this.f762A0;
                                            q5.i.b(c0200b2);
                                            ((MaterialButton) c0200b2.i).setOnClickListener(new g(3, this));
                                            C0200b c0200b3 = this.f762A0;
                                            q5.i.b(c0200b3);
                                            return (LinearLayout) c0200b3.f4303b;
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
    public final void J(Bundle bundle) {
        super.J(bundle);
        bundle.putString("dialog_apk_flavor", this.f763B0);
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.customDialog;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public final String g0() {
        Context contextM = m();
        String packageName = contextM != null ? contextM.getPackageName() : null;
        if (packageName != null) {
            switch (packageName.hashCode()) {
                case -1941833075:
                    if (packageName.equals("com.lefan.colour")) {
                        return "https://www.wandoujia.com/apps/8337978";
                    }
                    break;
                case -1489458327:
                    if (packageName.equals("com.lefan.signal")) {
                        return "https://www.wandoujia.com/apps/8348738";
                    }
                    break;
                case -430708154:
                    if (packageName.equals("com.lefan.apkanaly")) {
                        return "https://www.wandoujia.com/apps/8339457";
                    }
                    break;
                case 110106840:
                    if (packageName.equals("com.lefan.current")) {
                        return "https://www.wandoujia.com/apps/8334757";
                    }
                    break;
            }
        }
        Context contextM2 = m();
        return A.f.l("https://www.yifanads.com/app?package=", contextM2 != null ? contextM2.getPackageName() : null);
    }
}
