package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class t0 {
    private final u0 mObservable = new u0();
    private boolean mHasStableIds = false;
    private s0 mStateRestorationPolicy = s0.f1499a;

    public final void bindViewHolder(x1 x1Var, int i4) {
        boolean z3 = x1Var.mBindingAdapter == null;
        if (z3) {
            x1Var.mPosition = i4;
            if (hasStableIds()) {
                x1Var.mItemId = getItemId(i4);
            }
            x1Var.setFlags(1, 519);
            if (a4.m.a()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(x1Var.mItemViewType)));
            }
        }
        x1Var.mBindingAdapter = this;
        if (RecyclerView.C0) {
            if (x1Var.itemView.getParent() == null && x1Var.itemView.isAttachedToWindow() != x1Var.isTmpDetached()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + x1Var.isTmpDetached() + ", attached to window: " + x1Var.itemView.isAttachedToWindow() + ", holder: " + x1Var);
            }
            if (x1Var.itemView.getParent() == null && x1Var.itemView.isAttachedToWindow()) {
                throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + x1Var);
            }
        }
        onBindViewHolder(x1Var, i4, x1Var.getUnmodifiedPayloads());
        if (z3) {
            x1Var.clearPayload();
            ViewGroup.LayoutParams layoutParams = x1Var.itemView.getLayoutParams();
            if (layoutParams instanceof g1) {
                ((g1) layoutParams).f1376c = true;
            }
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int iOrdinal = this.mStateRestorationPolicy.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
        } else if (getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    public final x1 createViewHolder(ViewGroup viewGroup, int i4) {
        try {
            if (a4.m.a()) {
                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i4)));
            }
            x1 x1VarOnCreateViewHolder = onCreateViewHolder(viewGroup, i4);
            if (x1VarOnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            x1VarOnCreateViewHolder.mItemViewType = i4;
            Trace.endSection();
            return x1VarOnCreateViewHolder;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public int findRelativeAdapterPositionIn(t0 t0Var, x1 x1Var, int i4) {
        if (t0Var == this) {
            return i4;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i4) {
        return -1L;
    }

    public int getItemViewType(int i4) {
        return 0;
    }

    public final s0 getStateRestorationPolicy() {
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

    public final void notifyItemChanged(int i4) {
        this.mObservable.d(i4, 1, null);
    }

    public final void notifyItemInserted(int i4) {
        this.mObservable.e(i4, 1);
    }

    public final void notifyItemMoved(int i4, int i10) {
        this.mObservable.c(i4, i10);
    }

    public final void notifyItemRangeChanged(int i4, int i10) {
        this.mObservable.d(i4, i10, null);
    }

    public final void notifyItemRangeInserted(int i4, int i10) {
        this.mObservable.e(i4, i10);
    }

    public final void notifyItemRangeRemoved(int i4, int i10) {
        this.mObservable.f(i4, i10);
    }

    public final void notifyItemRemoved(int i4) {
        this.mObservable.f(i4, 1);
    }

    public abstract void onBindViewHolder(x1 x1Var, int i4);

    public void onBindViewHolder(x1 x1Var, int i4, List<Object> list) {
        onBindViewHolder(x1Var, i4);
    }

    public abstract x1 onCreateViewHolder(ViewGroup viewGroup, int i4);

    public boolean onFailedToRecycleView(x1 x1Var) {
        return false;
    }

    public void registerAdapterDataObserver(v0 v0Var) {
        this.mObservable.registerObserver(v0Var);
    }

    public void setHasStableIds(boolean z3) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z3;
    }

    public void setStateRestorationPolicy(s0 s0Var) {
        this.mStateRestorationPolicy = s0Var;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(v0 v0Var) {
        this.mObservable.unregisterObserver(v0Var);
    }

    public final void notifyItemChanged(int i4, Object obj) {
        this.mObservable.d(i4, 1, obj);
    }

    public final void notifyItemRangeChanged(int i4, int i10, Object obj) {
        this.mObservable.d(i4, i10, obj);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public void onViewAttachedToWindow(x1 x1Var) {
    }

    public void onViewDetachedFromWindow(x1 x1Var) {
    }

    public void onViewRecycled(x1 x1Var) {
    }
}
