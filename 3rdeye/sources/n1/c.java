package n1;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.preference.ListPreference;

/* compiled from: ListPreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public class c extends androidx.preference.a {

    /* renamed from: j, reason: collision with root package name */
    public int f44200j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence[] f44201k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence[] f44202l;

    /* compiled from: ListPreferenceDialogFragmentCompat.java */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            c cVar = c.this;
            cVar.f44200j = i;
            cVar.i = -1;
            dialogInterface.dismiss();
        }
    }

    @Override // androidx.preference.a
    public final void e(boolean z10) {
        int i;
        if (!z10 || (i = this.f44200j) < 0) {
            return;
        }
        String string = this.f44202l[i].toString();
        ListPreference listPreference = (ListPreference) c();
        if (listPreference.a(string)) {
            listPreference.C(string);
        }
    }

    @Override // androidx.preference.a
    public final void f(d.a aVar) {
        CharSequence[] charSequenceArr = this.f44201k;
        int i = this.f44200j;
        a aVar2 = new a();
        AlertController.b bVar = aVar.f14344a;
        bVar.f14324l = charSequenceArr;
        bVar.f14326n = aVar2;
        bVar.f14331s = i;
        bVar.f14330r = true;
        aVar.b(null, null);
    }

    @Override // androidx.preference.a, androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, androidx.fragment.app.ComponentCallbacksC1759l
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f44200j = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f44201k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f44202l = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) c();
        if (listPreference.B() == null || (charSequenceArr = listPreference.f16225U) == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f44200j = listPreference.A(listPreference.f16226V);
        this.f44201k = listPreference.B();
        this.f44202l = charSequenceArr;
    }

    @Override // androidx.preference.a, androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, androidx.fragment.app.ComponentCallbacksC1759l
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f44200j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f44201k);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f44202l);
    }
}
