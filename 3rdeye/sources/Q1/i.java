package Q1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class i implements RecyclerView.r {
    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(View view) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) qVar).width != -1 || ((ViewGroup.MarginLayoutParams) qVar).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
