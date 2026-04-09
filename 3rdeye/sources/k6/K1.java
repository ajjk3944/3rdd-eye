package K6;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import t4.C5606d;

/* compiled from: ReleasingViewPool.kt */
/* loaded from: classes.dex */
public final class K1 extends RecyclerView.v {

    /* renamed from: d, reason: collision with root package name */
    public final O6.I f3261d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f3262e;

    public K1(O6.I releaseViewVisitor) {
        kotlin.jvm.internal.l.f(releaseViewVisitor, "releaseViewVisitor");
        this.f3261d = releaseViewVisitor;
        this.f3262e = new LinkedHashSet();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public final void a() {
        super.a();
        LinkedHashSet linkedHashSet = this.f3262e;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            View view = ((RecyclerView.F) it.next()).itemView;
            kotlin.jvm.internal.l.e(view, "viewHolder.itemView");
            C5606d.I(this.f3261d, view);
        }
        linkedHashSet.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public final RecyclerView.F b(int i) {
        RecyclerView.F fB = super.b(i);
        if (fB == null) {
            return null;
        }
        this.f3262e.remove(fB);
        return fB;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public final void d(RecyclerView.F f10) {
        super.d(f10);
        this.f3262e.add(f10);
    }
}
