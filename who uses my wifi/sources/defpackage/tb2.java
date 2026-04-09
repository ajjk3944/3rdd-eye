package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tb2 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Context a;
    public final SharedPreferences b;
    public final ra4 c;
    public String d = "-1";
    public int e = -1;

    public tb2(Context context, ra4 ra4Var) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        this.c = ra4Var;
        this.a = context;
    }

    public final void a(String str, int i) {
        Context context;
        iz1 iz1Var = mz1.H0;
        tw1 tw1Var = tw1.e;
        boolean z = true;
        if (!((Boolean) tw1Var.c.a(iz1Var)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z = false;
        }
        this.c.r(z);
        if (((Boolean) tw1Var.c.a(mz1.C6)).booleanValue() && z && (context = this.a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            iz1 iz1Var = mz1.J0;
            tw1 tw1Var = tw1.e;
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                boolean zEquals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.a;
                ra4 ra4Var = this.c;
                if (zEquals) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    ra4Var.h();
                    if (i != ra4Var.m) {
                        ra4Var.r(true);
                        yc0.q(context);
                    }
                    ra4Var.b(i);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    ra4Var.h();
                    if (!Objects.equals(string, ra4Var.l)) {
                        ra4Var.r(true);
                        yc0.q(context);
                    }
                    ra4Var.a(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode == -2004976699) {
                if (!strValueOf.equals("IABTCF_PurposeConsents") || string2.equals("-1") || this.d.equals(string2)) {
                    return;
                }
                this.d = string2;
                a(string2, i2);
                return;
            }
            if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) tw1Var.c.a(mz1.H0)).booleanValue() || i2 == -1 || this.e == i2) {
                    return;
                }
                this.e = i2;
                a(string2, i2);
            }
        } catch (Throwable th) {
            hg4.C.h.d("AdMobPlusIdlessListener.onSharedPreferenceChanged", th);
            gi2.R();
        }
    }
}
