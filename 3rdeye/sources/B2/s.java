package B2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import androidx.fragment.app.ActivityC1762o;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import com.zipoapps.premium.start_like_pro.StartLikeProActivity;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.rate.RateBarDialog;
import com.zipoapps.premiumhelper.ui.settings.secret.PhSecretSettingsActivity;
import i8.C4461a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f435c;

    public /* synthetic */ s(Object obj, int i) {
        this.f434b = i;
        this.f435c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f435c;
        switch (this.f434b) {
            case 0:
                v vVar = (v) obj;
                vVar.f440d.dismiss();
                vVar.f443g.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) vVar.f440d.findViewById(vVar.f443g.getCheckedRadioButtonId());
                vVar.f446k.setText(radioButton.getText().toString());
                if (!radioButton.getText().equals(vVar.getResources().getString(R.string.highest))) {
                    if (!radioButton.getText().equals(vVar.getResources().getString(R.string.uhd_2160p))) {
                        if (!radioButton.getText().equals(vVar.getResources().getString(R.string.fhd_1080p))) {
                            if (!radioButton.getText().equals(vVar.getResources().getString(R.string.hd_720p))) {
                                if (!radioButton.getText().equals(vVar.getResources().getString(R.string.sd_480p))) {
                                    if (radioButton.getText().equals(vVar.getResources().getString(R.string.lowest))) {
                                        vVar.f438b.g(5);
                                        break;
                                    }
                                } else {
                                    vVar.f438b.g(4);
                                    break;
                                }
                            } else {
                                vVar.f438b.g(3);
                                break;
                            }
                        } else {
                            vVar.f438b.g(2);
                            break;
                        }
                    } else {
                        vVar.f438b.g(1);
                        break;
                    }
                } else {
                    vVar.f438b.g(0);
                    break;
                }
                break;
            case 1:
                int i = PhSecretSettingsActivity.f37161f;
                PhSecretSettingsActivity phSecretSettingsActivity = (PhSecretSettingsActivity) obj;
                phSecretSettingsActivity.startActivity(new Intent(phSecretSettingsActivity, (Class<?>) StartLikeProActivity.class));
                break;
            case 2:
                ((com.applovin.impl.mediation.debugger.ui.testmode.a) obj).c(view);
                break;
            case 3:
                IntegrationInspectorActivity.a((IntegrationInspectorActivity) obj, view);
                break;
            case 4:
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                com.zipoapps.premiumhelper.e eVarA = e.a.a();
                RateBarDialog rateBarDialog = (RateBarDialog) obj;
                ActivityC1762o activityC1762oRequireActivity = rateBarDialog.requireActivity();
                kotlin.jvm.internal.l.e(activityC1762oRequireActivity, "requireActivity(...)");
                Bundle arguments = rateBarDialog.getArguments();
                eVarA.f37015d.g(activityC1762oRequireActivity, arguments != null ? arguments.getBoolean("rate_source", false) : false);
                e.a.a().i.m("positive");
                rateBarDialog.c(5, "rate");
                e.a.a().f37021k.s("Rate_us_positive", new Bundle[0]);
                C4461a c4461a = e.a.a().f37021k;
                kotlin.jvm.internal.l.f(c4461a, "<this>");
                c4461a.u("First_rate_review_done", new Bundle[0]);
                rateBarDialog.f37085c = true;
                rateBarDialog.dismissAllowingStateLoss();
                break;
            default:
                ((com.zipoapps.premiumhelper.ui.rate.e) obj).dismissAllowingStateLoss();
                break;
        }
    }
}
