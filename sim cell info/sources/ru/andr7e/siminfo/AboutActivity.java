package ru.andr7e.siminfo;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;
import java.util.Calendar;
import n0.h;
import ru.andr7e.simcellinfo.R;

/* loaded from: classes.dex */
public class AboutActivity extends androidx.appcompat.app.c {
    @Override // androidx.appcompat.app.c
    public boolean C() {
        finish();
        return true;
    }

    public void G() {
        String str = getResources().getString(R.string.about_version) + " 1.3.2";
        ((TextView) findViewById(R.id.appNameTextView)).setText(R.string.app_name);
        ((TextView) findViewById(R.id.versionTextView)).setText(str);
        ((TextView) findViewById(R.id.authorTextView)).setText(R.string.about_author);
        ((TextView) findViewById(R.id.aboutBottomTextView)).setText(getString(R.string.about_bottom, new Object[]{Integer.valueOf(Calendar.getInstance().get(1))}));
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.c, androidx.activity.ComponentActivity, q.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        int iA = h.a(PreferenceManager.getDefaultSharedPreferences(this), this);
        if (iA > 0) {
            if (iA == 1) {
                i2 = R.style.AppTheme_Dark;
            } else if (iA == 2) {
                i2 = R.style.AppTheme_Black;
            }
            setTheme(i2);
        }
        setContentView(R.layout.activity_about);
        G();
    }
}
