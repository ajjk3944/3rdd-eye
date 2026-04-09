package p;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class n1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1 f20119a;

    public n1(t1 t1Var) {
        this.f20119a = t1Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j) {
        i1 i1Var;
        if (i10 == -1 || (i1Var = this.f20119a.f20173g) == null) {
            return;
        }
        i1Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
