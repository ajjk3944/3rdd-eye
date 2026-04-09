package o;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: o.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2741u0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22644b;

    public /* synthetic */ C2741u0(int i, Object obj) {
        this.f22643a = i;
        this.f22644b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j6) {
        C2732p0 c2732p0;
        switch (this.f22643a) {
            case 0:
                if (i != -1 && (c2732p0 = ((A0) this.f22644b).f22350c) != null) {
                    c2732p0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f22644b).o(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f22643a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
