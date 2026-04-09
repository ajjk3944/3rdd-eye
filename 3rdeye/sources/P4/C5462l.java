package p4;

import android.view.View;
import android.widget.AdapterView;
import o.C5380H;

/* compiled from: MaterialAutoCompleteTextView.java */
/* renamed from: p4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5462l implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5463m f45185b;

    public C5462l(C5463m c5463m) {
        this.f45185b = c5463m;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j4) {
        Object item;
        C5463m c5463m = this.f45185b;
        if (i < 0) {
            C5380H c5380h = c5463m.f45186f;
            item = !c5380h.f44531A.isShowing() ? null : c5380h.f44534d.getSelectedItem();
        } else {
            item = c5463m.getAdapter().getItem(i);
        }
        C5463m.a(c5463m, item);
        AdapterView.OnItemClickListener onItemClickListener = c5463m.getOnItemClickListener();
        C5380H c5380h2 = c5463m.f45186f;
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                view = c5380h2.f44531A.isShowing() ? c5380h2.f44534d.getSelectedView() : null;
                i = !c5380h2.f44531A.isShowing() ? -1 : c5380h2.f44534d.getSelectedItemPosition();
                j4 = !c5380h2.f44531A.isShowing() ? Long.MIN_VALUE : c5380h2.f44534d.getSelectedItemId();
            }
            onItemClickListener.onItemClick(c5380h2.f44534d, view, i, j4);
        }
        c5380h2.dismiss();
    }
}
