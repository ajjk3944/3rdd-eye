package kd;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;
import p.b2;
import p.k0;
import p.z2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28230b;

    public /* synthetic */ t(int i4, Object obj) {
        this.f28229a = i4;
        this.f28230b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
        switch (this.f28229a) {
            case 0:
                v vVar = (v) this.f28230b;
                b2 b2Var = vVar.f28234e;
                vVar.setText(vVar.convertSelectionToString(i4 < 0 ? !b2Var.f30654z.isShowing() ? null : b2Var.f30633c.getSelectedItem() : vVar.getAdapter().getItem(i4)), false);
                AdapterView.OnItemClickListener onItemClickListener = vVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i4 < 0) {
                        view = !b2Var.f30654z.isShowing() ? null : b2Var.f30633c.getSelectedView();
                        i4 = !b2Var.f30654z.isShowing() ? -1 : b2Var.f30633c.getSelectedItemPosition();
                        j = !b2Var.f30654z.isShowing() ? Long.MIN_VALUE : b2Var.f30633c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(b2Var.f30633c, view, i4, j);
                }
                b2Var.dismiss();
                break;
            case 1:
                k0 k0Var = (k0) this.f28230b;
                AppCompatSpinner appCompatSpinner = k0Var.H;
                appCompatSpinner.setSelection(i4);
                if (appCompatSpinner.getOnItemClickListener() != null) {
                    appCompatSpinner.performItemClick(view, i4, k0Var.E.getItemId(i4));
                }
                k0Var.dismiss();
                break;
            default:
                ((z2) this.f28230b).n(i4);
                break;
        }
    }
}
