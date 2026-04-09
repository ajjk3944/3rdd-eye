package B2;

import A9.C0575f;
import A9.U;
import android.content.Intent;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.lifecycle.c0;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.CameraDetectorActivity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.DetectInfraredActivity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.TricksActivity;
import com.vungle.ads.L;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.settings.secret.PhSecretSettingsActivity;
import p4.C5465o;
import t4.C5606d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f433c;

    public /* synthetic */ r(Object obj, int i) {
        this.f432b = i;
        this.f433c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 6;
        Object obj = this.f433c;
        switch (this.f432b) {
            case 0:
                v vVar = (v) obj;
                vVar.f454s.dismiss();
                vVar.f455t.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) vVar.f454s.findViewById(vVar.f455t.getCheckedRadioButtonId());
                vVar.f448m.setText(radioButton.getText().toString());
                if (!radioButton.getText().equals(vVar.getResources().getString(R.string.unlimited))) {
                    if (!radioButton.getText().equals(vVar.getResources().getString(R.string._30_seconds))) {
                        if (!radioButton.getText().equals(vVar.getResources().getString(R.string._1_minutes))) {
                            if (!radioButton.getText().equals(vVar.getResources().getString(R.string._2_minutes))) {
                                if (!radioButton.getText().equals(vVar.getResources().getString(R.string._5_minutes))) {
                                    if (!radioButton.getText().equals(vVar.getResources().getString(R.string._15_minutes))) {
                                        if (radioButton.getText().equals(vVar.getResources().getString(R.string._30_minutes))) {
                                            vVar.f438b.e(6);
                                            break;
                                        }
                                    } else {
                                        vVar.f438b.e(5);
                                        break;
                                    }
                                } else {
                                    vVar.f438b.e(4);
                                    break;
                                }
                            } else {
                                vVar.f438b.e(3);
                                break;
                            }
                        } else {
                            vVar.f438b.e(2);
                            break;
                        }
                    } else {
                        vVar.f438b.e(1);
                        break;
                    }
                } else {
                    vVar.f438b.e(0);
                    break;
                }
                break;
            case 1:
                int i10 = PhSecretSettingsActivity.f37161f;
                D8.i iVar = (D8.i) ((PhSecretSettingsActivity) obj).f37162c.getValue();
                C0575f.e(c0.a(iVar), U.f212b, null, new D8.k(iVar, null), 2);
                break;
            case 2:
                Q6.a this$0 = (Q6.a) obj;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                this$0.f11312c.invoke();
                break;
            case 3:
                ((com.applovin.impl.mediation.debugger.ui.testmode.a) obj).b(view);
                break;
            case 4:
                L.m16registerViewForInteraction$lambda4$lambda3((L) obj, view);
                break;
            case 5:
                C5465o c5465o = (C5465o) obj;
                EditText editText = c5465o.f45197f;
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    EditText editText2 = c5465o.f45197f;
                    if (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        c5465o.f45197f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        c5465o.f45197f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        c5465o.f45197f.setSelection(selectionEnd);
                    }
                    c5465o.q();
                    break;
                }
                break;
            case 6:
                int i11 = CameraDetectorActivity.f22050n;
                CameraDetectorActivity cameraDetectorActivity = (CameraDetectorActivity) obj;
                cameraDetectorActivity.getClass();
                cameraDetectorActivity.startActivity(new Intent(cameraDetectorActivity, (Class<?>) TricksActivity.class));
                break;
            case 7:
                int i12 = TricksActivity.f22117m;
                TricksActivity tricksActivity = (TricksActivity) obj;
                if (!e8.f.a(tricksActivity, "android.permission.CAMERA")) {
                    C5606d.B(tricksActivity, tricksActivity.f22124l, new G2.j(tricksActivity, i));
                    break;
                } else {
                    tricksActivity.startActivity(new Intent(tricksActivity, (Class<?>) DetectInfraredActivity.class));
                    tricksActivity.f22123k.dismiss();
                    break;
                }
            default:
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                e.a.a().i.m("negative");
                ((com.zipoapps.premiumhelper.ui.rate.e) obj).dismissAllowingStateLoss();
                break;
        }
    }
}
