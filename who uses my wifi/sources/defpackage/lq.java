package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.preference.DropDownPreference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lq implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ lq(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        kq kqVar;
        switch (this.f) {
            case 0:
                DropDownPreference dropDownPreference = (DropDownPreference) this.g;
                if (i >= 0) {
                    String string = dropDownPreference.Z[i].toString();
                    if (!string.equals(dropDownPreference.a0)) {
                        dropDownPreference.a(string);
                        dropDownPreference.z(string);
                        break;
                    }
                }
                break;
            case 1:
                if (i != -1 && (kqVar = ((i70) this.g).h) != null) {
                    kqVar.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.g).o(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }
}
