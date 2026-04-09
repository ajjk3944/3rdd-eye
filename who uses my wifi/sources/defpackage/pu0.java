package defpackage;

import android.os.Handler;
import androidx.preference.Preference;
import com.phuongpn.whousemywifi.networkscanner.SettingsActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class pu0 implements ul0, mz {
    public final /* synthetic */ int f;
    public final /* synthetic */ SettingsActivity.a g;

    public /* synthetic */ pu0(SettingsActivity.a aVar, int i) {
        this.f = i;
        this.g = aVar;
    }

    @Override // defpackage.mz
    public void a(bw bwVar) {
        if (bwVar != null) {
            i30.m(bwVar.b + ": " + bwVar.a, "msg");
        }
        SettingsActivity.a aVar = this.g;
        f20 f20Var = aVar.h0;
        if (f20Var == null) {
            i30.S("googleMobileAdsConsentManager");
            throw null;
        }
        if (((va4) f20Var.g).b() == 3) {
            Preference preferenceN = aVar.N("key_privacy_settings");
            if (preferenceN != null) {
                f20 f20Var2 = aVar.h0;
                if (f20Var2 == null) {
                    i30.S("googleMobileAdsConsentManager");
                    throw null;
                }
                boolean z = ((va4) f20Var2.g).b() == 3;
                if (preferenceN.B != z) {
                    preferenceN.B = z;
                    em0 em0Var = preferenceN.L;
                    if (em0Var != null) {
                        Handler handler = em0Var.m;
                        a9 a9Var = em0Var.n;
                        handler.removeCallbacks(a9Var);
                        handler.post(a9Var);
                    }
                }
            }
            if (preferenceN != null) {
                preferenceN.k = new pu0(aVar, 5);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x043f  */
    @Override // defpackage.ul0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(androidx.preference.Preference r21) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pu0.b(androidx.preference.Preference):void");
    }
}
