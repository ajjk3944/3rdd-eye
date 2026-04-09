package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class l70 extends zl0 {
    public int x0;
    public CharSequence[] y0;
    public CharSequence[] z0;

    @Override // defpackage.zl0
    public final void T(boolean z) {
        int i;
        if (!z || (i = this.x0) < 0) {
            return;
        }
        String string = this.z0[i].toString();
        ListPreference listPreference = (ListPreference) R();
        listPreference.a(string);
        listPreference.z(string);
    }

    @Override // defpackage.zl0
    public final void U(t3 t3Var) {
        CharSequence[] charSequenceArr = this.y0;
        int i = this.x0;
        k70 k70Var = new k70(0, this);
        p3 p3Var = (p3) t3Var.h;
        p3Var.l = charSequenceArr;
        p3Var.n = k70Var;
        p3Var.s = i;
        p3Var.r = true;
        t3Var.g(null, null);
    }

    @Override // defpackage.zl0, defpackage.xo, defpackage.iw
    public final void u(Bundle bundle) {
        super.u(bundle);
        if (bundle != null) {
            this.x0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.y0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.z0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) R();
        CharSequence[] charSequenceArr = listPreference.Y;
        CharSequence[] charSequenceArr2 = listPreference.Z;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.x0 = listPreference.y(listPreference.a0);
        this.y0 = listPreference.Y;
        this.z0 = charSequenceArr2;
    }

    @Override // defpackage.zl0, defpackage.xo, defpackage.iw
    public final void z(Bundle bundle) {
        super.z(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.x0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.y0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.z0);
    }
}
