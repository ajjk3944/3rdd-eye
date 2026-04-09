package je;

import android.view.View;
import android.widget.AdapterView;
import p.f0;
import p.t1;

/* loaded from: classes.dex */
public final class r implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13682a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13683d;

    public /* synthetic */ r(int i10, Object obj) {
        this.f13682a = i10;
        this.f13683d = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        switch (this.f13682a) {
            case 0:
                t tVar = (t) this.f13683d;
                t1 t1Var = tVar.f13687x;
                tVar.setText(tVar.convertSelectionToString(i10 < 0 ? !t1Var.V.isShowing() ? null : t1Var.f20173g.getSelectedItem() : tVar.getAdapter().getItem(i10)), false);
                AdapterView.OnItemClickListener onItemClickListener = tVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i10 < 0) {
                        view = !t1Var.V.isShowing() ? null : t1Var.f20173g.getSelectedView();
                        i10 = !t1Var.V.isShowing() ? -1 : t1Var.f20173g.getSelectedItemPosition();
                        j = !t1Var.V.isShowing() ? Long.MIN_VALUE : t1Var.f20173g.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(t1Var.f20173g, view, i10, j);
                }
                t1Var.dismiss();
                break;
            default:
                f0 f0Var = (f0) this.f13683d;
                androidx.appcompat.widget.c cVar = f0Var.f20057c0;
                cVar.setSelection(i10);
                if (cVar.getOnItemClickListener() != null) {
                    cVar.performItemClick(view, i10, f0Var.Z.getItemId(i10));
                }
                f0Var.dismiss();
                break;
        }
    }
}
