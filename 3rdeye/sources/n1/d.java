package n1;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public class d extends androidx.preference.a {

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f44204j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    public boolean f44205k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence[] f44206l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence[] f44207m;

    /* compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public final void onClick(DialogInterface dialogInterface, int i, boolean z10) {
            d dVar = d.this;
            if (z10) {
                dVar.f44205k = dVar.f44204j.add(dVar.f44207m[i].toString()) | dVar.f44205k;
            } else {
                dVar.f44205k = dVar.f44204j.remove(dVar.f44207m[i].toString()) | dVar.f44205k;
            }
        }
    }

    @Override // androidx.preference.a
    public final void e(boolean z10) {
        if (z10 && this.f44205k) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) c();
            multiSelectListPreference.getClass();
            multiSelectListPreference.A(this.f44204j);
        }
        this.f44205k = false;
    }

    @Override // androidx.preference.a
    public final void f(d.a aVar) {
        int length = this.f44207m.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f44204j.contains(this.f44207m[i].toString());
        }
        CharSequence[] charSequenceArr = this.f44206l;
        a aVar2 = new a();
        AlertController.b bVar = aVar.f14344a;
        bVar.f14324l = charSequenceArr;
        bVar.f14332t = aVar2;
        bVar.f14328p = zArr;
        bVar.f14329q = true;
    }

    @Override // androidx.preference.a, androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, androidx.fragment.app.ComponentCallbacksC1759l
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.onCreate(bundle);
        HashSet hashSet = this.f44204j;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f44205k = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f44206l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f44207m = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) c();
        if (multiSelectListPreference.f16231T == null || (charSequenceArr = multiSelectListPreference.f16232U) == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.f16233V);
        this.f44205k = false;
        this.f44206l = multiSelectListPreference.f16231T;
        this.f44207m = charSequenceArr;
    }

    @Override // androidx.preference.a, androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, androidx.fragment.app.ComponentCallbacksC1759l
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f44204j));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f44205k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f44206l);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f44207m);
    }
}
