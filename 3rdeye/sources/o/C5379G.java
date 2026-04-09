package o;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: ListPopupWindow.java */
/* renamed from: o.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5379G implements AdapterView.OnItemSelectedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5380H f44527b;

    public C5379G(C5380H c5380h) {
        this.f44527b = c5380h;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j4) {
        C5376D c5376d;
        if (i == -1 || (c5376d = this.f44527b.f44534d) == null) {
            return;
        }
        c5376d.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
