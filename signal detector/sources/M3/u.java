package M3;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import o.A0;
import o.C2699J;
import o.M;

/* loaded from: classes.dex */
public final class u implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2933b;

    public /* synthetic */ u(int i, Object obj) {
        this.f2932a = i;
        this.f2933b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        switch (this.f2932a) {
            case 0:
                w wVar = (w) this.f2933b;
                A0 a02 = wVar.f2937e;
                wVar.setText(wVar.convertSelectionToString(i < 0 ? !a02.f22347N.isShowing() ? null : a02.f22350c.getSelectedItem() : wVar.getAdapter().getItem(i)), false);
                AdapterView.OnItemClickListener onItemClickListener = wVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !a02.f22347N.isShowing() ? null : a02.f22350c.getSelectedView();
                        i = !a02.f22347N.isShowing() ? -1 : a02.f22350c.getSelectedItemPosition();
                        j6 = !a02.f22347N.isShowing() ? Long.MIN_VALUE : a02.f22350c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(a02.f22350c, view, i, j6);
                }
                a02.dismiss();
                break;
            case 1:
                C2699J c2699j = (C2699J) this.f2933b;
                M m6 = c2699j.f22397V;
                m6.setSelection(i);
                if (m6.getOnItemClickListener() != null) {
                    m6.performItemClick(view, i, c2699j.f22394S.getItemId(i));
                }
                c2699j.dismiss();
                break;
            default:
                ((SearchView) this.f2933b).n(i);
                break;
        }
    }
}
