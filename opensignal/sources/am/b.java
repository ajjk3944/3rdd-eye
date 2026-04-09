package am;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.datepicker.o;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.activities.SettingsActivity;
import com.staircase3.opensignal.activities.SpeedTestActivity;
import com.staircase3.opensignal.goldstar.speedtest.result.SpeedResultActivity;
import com.staircase3.opensignal.goldstar.testshistory.TestHistoryActivity;
import com.staircase3.opensignal.goldstar.videotest.result.VideoResultActivity;
import com.staircase3.opensignal.goldstar.videotest.test.VideoTestActivity;
import com.staircase3.opensignal.viewcontrollers.Tab_Overview;
import com.survicate.surveys.presentation.date.micro.MicroSurveyPointDateContentView;
import com.survicate.surveys.presentation.widget.MicroDisclaimerView;
import com.survicate.surveys.presentation.widget.MicroSurveyFooter;
import je.u;
import mq.x;
import oh.p;
import p.l2;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f854a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f855d;

    public /* synthetic */ b(int i10, Object obj) {
        this.f854a = i10;
        this.f855d = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v56, types: [java.lang.Object, lq.h] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i.j jVarL;
        int i10 = this.f854a;
        Object obj = this.f855d;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                fVar.g0().d(fVar);
                return;
            case 1:
                f fVar2 = ((l) obj).f881v;
                if (fVar2 != null) {
                    fVar2.g0().d(fVar2);
                    return;
                }
                return;
            case 2:
                MicroDisclaimerView microDisclaimerView = (MicroDisclaimerView) obj;
                int i11 = MicroDisclaimerView.H;
                microDisclaimerView.f6544r.setChecked(!r7.isChecked());
                ar.a aVar = microDisclaimerView.onCheckboxToggle;
                if (aVar != null) {
                    aVar.c();
                    return;
                }
                return;
            case 3:
                MicroSurveyFooter microSurveyFooter = (MicroSurveyFooter) obj;
                int i12 = MicroSurveyFooter.f6569x;
                br.l.e(microSurveyFooter, "this$0");
                ar.a aVar2 = microSurveyFooter.onPoweredByClick;
                if (aVar2 != null) {
                    aVar2.c();
                    return;
                }
                return;
            case 4:
                ((o) obj).k0();
                throw null;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                ((dn.i) obj).g0(false, false);
                return;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                int i13 = MicroSurveyPointDateContentView.J;
                ar.a aVar3 = ((MicroSurveyPointDateContentView) obj).f6395a;
                if (aVar3 != null) {
                    aVar3.c();
                    return;
                }
                return;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                int i14 = SpeedResultActivity.f6092c0;
                ((SpeedResultActivity) obj).finish();
                return;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                bm.d dVar = (bm.d) obj;
                ((i.g) dVar.f2828r).dismiss();
                com.staircase3.opensignal.utils.a aVar4 = (com.staircase3.opensignal.utils.a) ((MainActivity) ((q3.a) ((l2) dVar.f2827g).f20100d).f20680g).f6013n0.getValue();
                aVar4.getClass();
                com.staircase3.opensignal.utils.a.e(aVar4, "rating", "skipped", null, 12);
                return;
            case 9:
                ((AlertDialog) ((io.sentry.internal.debugmeta.c) obj).f12354g).dismiss();
                return;
            case 10:
                ((ip.a) obj).c();
                return;
            case 11:
                je.c cVar = (je.c) obj;
                EditText editText = cVar.f13616i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                cVar.p();
                return;
            case 12:
                ((je.j) obj).t();
                return;
            case 13:
                u uVar = (u) obj;
                EditText editText2 = uVar.f13690f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = uVar.f13690f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    uVar.f13690f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    uVar.f13690f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    uVar.f13690f.setSelection(selectionEnd);
                }
                uVar.p();
                return;
            case 14:
                int i15 = TestHistoryActivity.W;
                ((TestHistoryActivity) obj).finish();
                return;
            case 15:
                ((kp.a) obj).c();
                return;
            case 16:
                VideoResultActivity videoResultActivity = (VideoResultActivity) obj;
                int i16 = VideoResultActivity.f6101d0;
                boolean z10 = MainActivity.f5997x0;
                Intent intent = new Intent(videoResultActivity, (Class<?>) MainActivity.class);
                intent.addFlags(67108864);
                videoResultActivity.startActivity(intent);
                return;
            case 17:
                Tab_Overview tab_Overview = (Tab_Overview) obj;
                bn.d dVar2 = ((bn.e) tab_Overview.Y0.getValue()).f2839a;
                if (dVar2 instanceof bn.b) {
                    tab_Overview.g0(xu.l.i(dVar2, ((ll.c) tab_Overview.Z0.getValue()).a()));
                    return;
                }
                return;
            case 18:
                VideoTestActivity videoTestActivity = (VideoTestActivity) obj;
                int i17 = VideoTestActivity.f6105h0;
                boolean z11 = MainActivity.f5997x0;
                Intent intent2 = new Intent(videoTestActivity, (Class<?>) MainActivity.class);
                intent2.addFlags(67108864);
                videoTestActivity.startActivity(intent2);
                return;
            case 19:
                mn.a aVar5 = (mn.a) ((p) obj).f19481d;
                if (aVar5 == null || (jVarL = aVar5.f16887a.l()) == null) {
                    return;
                }
                Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + jVarL.getPackageName()));
                intent3.addCategory("android.intent.category.DEFAULT");
                intent3.setFlags(268435456);
                jVarL.startActivity(intent3);
                return;
            case 20:
                om.e eVar = (om.e) ((om.f) obj).f19555g;
                if (eVar != null) {
                    eVar.p();
                    return;
                }
                return;
            case 21:
                ql.c cVar2 = (ql.c) obj;
                cVar2.g0(false, false);
                SharedPreferences.Editor editorEdit = ((nl.a) cVar2.N0.getValue()).f18456a.edit();
                editorEdit.putBoolean("taken_consent_decision", true);
                editorEdit.apply();
                ((cm.a) cVar2.O0.getValue()).b(true);
                ((com.staircase3.opensignal.utils.a) cVar2.M0.getValue()).d("settings_gdpr_dialog", "ok", x.f16946a);
                ql.a aVar6 = cVar2.P0;
                if (aVar6 != null) {
                    SettingsActivity settingsActivity = (SettingsActivity) aVar6;
                    ((jn.b) settingsActivity.f6032i0.getValue()).a(true);
                    settingsActivity.z(true);
                    if (settingsActivity.f6028e0) {
                        settingsActivity.finish();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                int i18 = SpeedTestActivity.W;
                ((SpeedTestActivity) obj).finish();
                return;
            case 23:
                ((sl.a) obj).g0(false, false);
                return;
            default:
                ((vp.a) obj).c();
                return;
        }
    }
}
