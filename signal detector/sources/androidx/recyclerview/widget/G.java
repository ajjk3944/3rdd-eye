package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes.dex */
public abstract class G {
    private final H mObservable = new H();
    private boolean mHasStableIds = false;
    private F mStateRestorationPolicy = F.f5282a;

    public final void bindViewHolder(g0 g0Var, int i) {
        boolean z6 = g0Var.mBindingAdapter == null;
        if (z6) {
            g0Var.mPosition = i;
            if (hasStableIds()) {
                g0Var.mItemId = getItemId(i);
            }
            g0Var.setFlags(1, 519);
            int i3 = N.l.f2971a;
            Trace.beginSection("RV OnBindView");
        }
        g0Var.mBindingAdapter = this;
        onBindViewHolder(g0Var, i, g0Var.getUnmodifiedPayloads());
        if (z6) {
            g0Var.clearPayload();
            ViewGroup.LayoutParams layoutParams = g0Var.itemView.getLayoutParams();
            if (layoutParams instanceof S) {
                ((S) layoutParams).f5379c = true;
            }
            int i6 = N.l.f2971a;
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int iOrdinal = this.mStateRestorationPolicy.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 : getItemCount() > 0;
    }

    public final g0 createViewHolder(ViewGroup viewGroup, int i) {
        try {
            int i3 = N.l.f2971a;
            Trace.beginSection("RV CreateView");
            g0 g0VarOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (g0VarOnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            g0VarOnCreateViewHolder.mItemViewType = i;
            Trace.endSection();
            return g0VarOnCreateViewHolder;
        } catch (Throwable th) {
            int i6 = N.l.f2971a;
            Trace.endSection();
            throw th;
        }
    }

    public int findRelativeAdapterPositionIn(G g2, g0 g0Var, int i) {
        if (g2 == this) {
            return i;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i) {
        return -1L;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public final F getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i) {
        this.mObservable.d(i, 1, null);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.e(i, 1);
    }

    public final void notifyItemMoved(int i, int i3) {
        this.mObservable.c(i, i3);
    }

    public final void notifyItemRangeChanged(int i, int i3) {
        this.mObservable.d(i, i3, null);
    }

    public final void notifyItemRangeInserted(int i, int i3) {
        this.mObservable.e(i, i3);
    }

    public final void notifyItemRangeRemoved(int i, int i3) {
        this.mObservable.f(i, i3);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.f(i, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(g0 g0Var, int i);

    public void onBindViewHolder(g0 g0Var, int i, List<Object> list) {
        onBindViewHolder(g0Var, i);
    }

    public abstract g0 onCreateViewHolder(ViewGroup viewGroup, int i);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(g0 g0Var) {
        return false;
    }

    public void onViewAttachedToWindow(g0 g0Var) {
    }

    public void onViewDetachedFromWindow(g0 g0Var) {
    }

    public void onViewRecycled(g0 g0Var) {
    }

    public void registerAdapterDataObserver(I i) {
        this.mObservable.registerObserver(i);
    }

    public void setHasStableIds(boolean z6) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z6;
    }

    public void setStateRestorationPolicy(F f2) {
        this.mStateRestorationPolicy = f2;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(I i) {
        this.mObservable.unregisterObserver(i);
    }

    public final void notifyItemChanged(int i, Object obj) {
        this.mObservable.d(i, 1, obj);
    }

    public final void notifyItemRangeChanged(int i, int i3, Object obj) {
        this.mObservable.d(i, i3, obj);
    }
}
