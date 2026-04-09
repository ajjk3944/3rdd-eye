package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c7 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ c7(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.f) {
            case 0:
                e7 e7Var = (e7) this.g;
                h7 h7Var = e7Var.L;
                h7Var.setSelection(i);
                if (h7Var.getOnItemClickListener() != null) {
                    h7Var.performItemClick(view, i, e7Var.I.getItemId(i));
                }
                e7Var.dismiss();
                break;
            case 1:
                lb0 lb0Var = (lb0) this.g;
                i70 i70Var = lb0Var.j;
                lb0Var.setText(lb0Var.convertSelectionToString(i < 0 ? !i70Var.E.isShowing() ? null : i70Var.h.getSelectedItem() : lb0Var.getAdapter().getItem(i)), false);
                AdapterView.OnItemClickListener onItemClickListener = lb0Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !i70Var.E.isShowing() ? null : i70Var.h.getSelectedView();
                        i = !i70Var.E.isShowing() ? -1 : i70Var.h.getSelectedItemPosition();
                        j = !i70Var.E.isShowing() ? Long.MIN_VALUE : i70Var.h.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(i70Var.h, view, i, j);
                }
                i70Var.dismiss();
                break;
            default:
                ((SearchView) this.g).n(i);
                break;
        }
    }
}
