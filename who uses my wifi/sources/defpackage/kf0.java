package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class kf0 extends zl0 {
    public CharSequence[] A0;
    public final HashSet x0 = new HashSet();
    public boolean y0;
    public CharSequence[] z0;

    @Override // defpackage.zl0
    public final void T(boolean z) {
        if (z && this.y0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) R();
            HashSet hashSet = this.x0;
            multiSelectListPreference.a(hashSet);
            multiSelectListPreference.y(hashSet);
        }
        this.y0 = false;
    }

    @Override // defpackage.zl0
    public final void U(t3 t3Var) {
        int length = this.A0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.x0.contains(this.A0[i].toString());
        }
        CharSequence[] charSequenceArr = this.z0;
        jf0 jf0Var = new jf0(this);
        p3 p3Var = (p3) t3Var.h;
        p3Var.l = charSequenceArr;
        p3Var.t = jf0Var;
        p3Var.p = zArr;
        p3Var.q = true;
    }

    @Override // defpackage.zl0, defpackage.xo, defpackage.iw
    public final void u(Bundle bundle) {
        super.u(bundle);
        HashSet hashSet = this.x0;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.y0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.z0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.A0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) R();
        CharSequence[] charSequenceArr = multiSelectListPreference.Y;
        CharSequence[] charSequenceArr2 = multiSelectListPreference.Z;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.a0);
        this.y0 = false;
        this.z0 = multiSelectListPreference.Y;
        this.A0 = charSequenceArr2;
    }

    @Override // defpackage.zl0, defpackage.xo, defpackage.iw
    public final void z(Bundle bundle) {
        super.z(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.x0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.y0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.z0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.A0);
    }
}
