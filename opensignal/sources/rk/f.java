package rk;

import android.R;
import android.content.SharedPreferences;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.staircase3.opensignal.activities.SettingsActivity;
import com.staircase3.opensignal.utils.q;
import com.staircase3.opensignal.utils.t;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21627a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f21628d;

    public /* synthetic */ f(SettingsActivity settingsActivity, int i10) {
        this.f21627a = i10;
        this.f21628d = settingsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f21627a) {
            case 0:
                SettingsActivity settingsActivity = this.f21628d.f6026c0;
                int i10 = qk.l.settings_about_opensignal_title;
                int i11 = qk.l.settings_about_opensignal_text;
                String string = settingsActivity.getString(i10);
                String string2 = settingsActivity.getString(i11);
                i.f fVar = new i.f(settingsActivity, qk.m.CustomAlertDialogTheme);
                fVar.setTitle(string);
                fVar.f11045a.f10995f = Html.fromHtml(string2);
                fVar.setPositiveButton(R.string.ok, new t(0));
                fVar.create().show();
                break;
            case 1:
                SettingsActivity settingsActivity2 = this.f21628d;
                i.f fVar2 = new i.f(settingsActivity2.f6026c0, qk.m.CustomAlertDialogTheme);
                int i12 = qk.l.terms_of_service;
                i.b bVar = fVar2.f11045a;
                bVar.f10993d = bVar.f10990a.getText(i12);
                SpannableString spannableString = new SpannableString(settingsActivity2.getResources().getString(qk.l.terms_of_service_text));
                Linkify.addLinks(spannableString, 15);
                bVar.f10995f = spannableString;
                fVar2.setPositiveButton(R.string.ok, new t(1));
                i.g gVarCreate = fVar2.create();
                gVarCreate.show();
                ((TextView) gVarCreate.findViewById(R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());
                break;
            case 2:
                this.f21628d.finish();
                break;
            default:
                SettingsActivity settingsActivity3 = this.f21628d;
                View viewInflate = LayoutInflater.from(settingsActivity3.f6026c0).inflate(qk.i.dialog_notification_type, (ViewGroup) null);
                i.f fVar3 = new i.f(settingsActivity3.f6026c0, qk.m.CustomAlertDialogTheme);
                int i13 = qk.l.settings_notification_type;
                i.b bVar2 = fVar3.f11045a;
                bVar2.f10993d = bVar2.f10990a.getText(i13);
                fVar3.setView(viewInflate);
                fVar3.setPositiveButton(R.string.ok, new g(settingsActivity3));
                String upperCase = settingsActivity3.getString(qk.l.cancel).toUpperCase();
                t tVar = new t(2);
                bVar2.f10998i = upperCase;
                bVar2.j = tVar;
                fVar3.create().show();
                AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) viewInflate.findViewById(qk.h.rbNotificationStatusbar);
                AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) viewInflate.findViewById(qk.h.rbNotificationVibrate);
                AppCompatRadioButton appCompatRadioButton3 = (AppCompatRadioButton) viewInflate.findViewById(qk.h.rbNotificationSound);
                AppCompatRadioButton appCompatRadioButton4 = (AppCompatRadioButton) viewInflate.findViewById(qk.h.rbNotificationAll);
                appCompatRadioButton.setOnCheckedChangeListener(new e(settingsActivity3, 1));
                appCompatRadioButton2.setOnCheckedChangeListener(new e(settingsActivity3, 2));
                appCompatRadioButton3.setOnCheckedChangeListener(new e(settingsActivity3, 3));
                appCompatRadioButton4.setOnCheckedChangeListener(new e(settingsActivity3, 4));
                SharedPreferences sharedPreferencesC = q.c(settingsActivity3.f6026c0);
                com.staircase3.opensignal.utils.p pVarValueOf = com.staircase3.opensignal.utils.p.STATUSBAR_ONLY;
                try {
                    pVarValueOf = com.staircase3.opensignal.utils.p.valueOf(sharedPreferencesC.getString("settings.notification_type", pVarValueOf.name()));
                } catch (IllegalArgumentException unused) {
                }
                settingsActivity3.f6025b0 = pVarValueOf;
                int i14 = i.f21633a[pVarValueOf.ordinal()];
                if (i14 == 1) {
                    appCompatRadioButton.setChecked(true);
                    break;
                } else if (i14 == 2) {
                    appCompatRadioButton2.setChecked(true);
                    break;
                } else if (i14 == 3) {
                    appCompatRadioButton3.setChecked(true);
                    break;
                } else if (i14 == 4) {
                    appCompatRadioButton4.setChecked(true);
                    break;
                }
                break;
        }
    }
}
