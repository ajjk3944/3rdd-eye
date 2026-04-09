package rg;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ScrollView;
import com.liuzh.deviceinfo.R;
import km.n;
import t7.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends hg.c {
    @Override // i.y, b5.s
    public final Dialog e0(Bundle bundle) {
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        View viewInflate = q().inflate(R.layout.dialog_double_battery, (ViewGroup) null, false);
        int i4 = R.id.checkbox_battery_current;
        CheckBox checkBox = (CheckBox) wb.e.s(R.id.checkbox_battery_current, viewInflate);
        if (checkBox != null) {
            i4 = R.id.checkbox_battery_power;
            CheckBox checkBox2 = (CheckBox) wb.e.s(R.id.checkbox_battery_power, viewInflate);
            if (checkBox2 != null) {
                ScrollView scrollView = (ScrollView) viewInflate;
                n nVar = new n(scrollView, checkBox, checkBox2);
                ColorStateList colorStateListB = dj.b.b(com.liuzh.deviceinfo.utilities.f.d(), W());
                checkBox2.setButtonTintList(colorStateListB);
                checkBox.setButtonTintList(colorStateListB);
                SharedPreferences sharedPreferences = com.liuzh.deviceinfo.utilities.f.f21257c;
                checkBox.setChecked(sharedPreferences.getBoolean("double_battery_current", false));
                checkBox2.setChecked(sharedPreferences.getBoolean("half_battery_voltage", false));
                m mVar = new m(W());
                mVar.y(R.string.double_battery_device);
                mVar.z(scrollView);
                mVar.x(R.string.confirm, new eg.d(nVar));
                i.e eVarF = mVar.f();
                eVarF.setCanceledOnTouchOutside(false);
                eVarF.setOnShowListener(new eg.e(eVarF));
                return eVarF;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
