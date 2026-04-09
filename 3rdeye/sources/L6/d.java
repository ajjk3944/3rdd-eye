package L6;

import O6.v;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: View.kt */
/* loaded from: classes.dex */
public final class d implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f4083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.m f4084c;

    public d(v vVar, RecyclerView.m mVar) {
        this.f4083b = vVar;
        this.f4084c = mVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        view.removeOnLayoutChangeListener(this);
        v vVar = this.f4083b;
        if (vVar.getItemAnimator() == null) {
            vVar.setItemAnimator(this.f4084c);
        }
    }
}
