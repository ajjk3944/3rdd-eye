package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class po0 {
    public final /* synthetic */ RecyclerView a;

    public po0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a() {
        int[] iArr = RecyclerView.D0;
        RecyclerView recyclerView = this.a;
        if (!recyclerView.x || !recyclerView.w) {
            recyclerView.E = true;
            recyclerView.requestLayout();
        } else {
            yn0 yn0Var = recyclerView.m;
            WeakHashMap weakHashMap = e61.a;
            recyclerView.postOnAnimation(yn0Var);
        }
    }
}
