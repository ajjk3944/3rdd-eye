package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.e5;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* loaded from: classes.dex */
public class MaxRecyclerAdapter extends RecyclerView.Adapter implements MaxAdPlacer.Listener {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdPlacer f8902a;

    /* renamed from: b, reason: collision with root package name */
    private final RecyclerView.Adapter f8903b;

    /* renamed from: c, reason: collision with root package name */
    private final b f8904c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f8905d;

    /* renamed from: e, reason: collision with root package name */
    private e5 f8906e;

    /* renamed from: f, reason: collision with root package name */
    private MaxAdPlacer.Listener f8907f;

    /* renamed from: g, reason: collision with root package name */
    private int f8908g;

    /* renamed from: h, reason: collision with root package name */
    private AdPositionBehavior f8909h;

    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    public static class MaxAdRecyclerViewHolder extends RecyclerView.c0 {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f8911a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f8911a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f8911a;
        }
    }

    public class a implements e5.a {
        public a() {
        }

        @Override // com.applovin.impl.e5.a
        public void a(int i10, int i11) {
            MaxRecyclerAdapter.this.f8902a.updateFillablePositions(i10, Math.min(i11 + MaxRecyclerAdapter.this.f8908g, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    public class b extends RecyclerView.i {
        private b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i10, int i11) {
            int adjustedPosition = MaxRecyclerAdapter.this.f8902a.getAdjustedPosition(i10);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f8902a.getAdjustedPosition((i10 + i11) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int i10, int i11) {
            boolean z10 = i10 + i11 >= MaxRecyclerAdapter.this.f8903b.getItemCount();
            if (MaxRecyclerAdapter.this.f8909h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f8909h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f8902a.getAdjustedPosition(i10);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f8902a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeMoved(int i10, int i11, int i12) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeRemoved(int i10, int i11) {
            int itemCount = MaxRecyclerAdapter.this.f8903b.getItemCount();
            boolean z10 = i10 + i11 >= itemCount;
            if (MaxRecyclerAdapter.this.f8909h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f8909h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f8902a.getAdjustedPosition(i10);
            int adjustedCount = MaxRecyclerAdapter.this.f8902a.getAdjustedCount(itemCount + i11);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f8902a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f8902a.getAdjustedCount(itemCount);
            int size = adjustedCount - adjustedCount2;
            Collection<Integer> collectionClearTrailingAds = MaxRecyclerAdapter.this.f8902a.clearTrailingAds(adjustedCount2 - 1);
            if (!collectionClearTrailingAds.isEmpty()) {
                size += collectionClearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (size - i11), size);
        }

        public /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.Adapter adapter, Activity activity) {
        b bVar = new b(this, null);
        this.f8904c = bVar;
        this.f8908g = 8;
        this.f8909h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f8902a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(adapter.hasStableIds());
        this.f8903b = adapter;
        adapter.registerAdapterDataObserver(bVar);
    }

    public void destroy() {
        try {
            this.f8903b.unregisterAdapterDataObserver(this.f8904c);
        } catch (Exception unused) {
        }
        this.f8902a.destroy();
        e5 e5Var = this.f8906e;
        if (e5Var != null) {
            e5Var.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f8902a;
    }

    public int getAdjustedPosition(int i10) {
        return this.f8902a.getAdjustedPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8902a.getAdjustedCount(this.f8903b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        if (this.f8903b.hasStableIds()) {
            return this.f8902a.isFilledPosition(i10) ? this.f8902a.getAdItemId(i10) : this.f8903b.getItemId(this.f8902a.getOriginalPosition(i10));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        if (this.f8902a.isAdPosition(i10)) {
            return -42;
        }
        return this.f8903b.getItemViewType(this.f8902a.getOriginalPosition(i10));
    }

    public int getOriginalPosition(int i10) {
        return this.f8902a.getOriginalPosition(i10);
    }

    public void loadAds() {
        this.f8902a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f8907f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i10) {
        notifyItemChanged(i10);
        MaxAdPlacer.Listener listener = this.f8907f;
        if (listener != null) {
            listener.onAdLoaded(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i10) {
        MaxAdPlacer.Listener listener = this.f8907f;
        if (listener != null) {
            listener.onAdRemoved(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f8907f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f8905d = recyclerView;
        e5 e5Var = new e5(recyclerView);
        this.f8906e = e5Var;
        e5Var.a(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.c0 c0Var, int i10) {
        this.f8906e.a(c0Var.itemView, i10);
        if (!this.f8902a.isAdPosition(i10)) {
            this.f8903b.onBindViewHolder(c0Var, this.f8902a.getOriginalPosition(i10));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f8902a.getAdSize(i10);
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) c0Var).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.f8902a.renderAd(i10, containerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.c0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        if (i10 != -42) {
            return this.f8903b.onCreateViewHolder(viewGroup, i10);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        RecyclerView.n layoutManager = this.f8905d.getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        viewInflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f8905d = null;
        e5 e5Var = this.f8906e;
        if (e5Var != null) {
            e5Var.a();
            this.f8906e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@NonNull RecyclerView.c0 c0Var) {
        return c0Var instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(c0Var) : this.f8903b.onFailedToRecycleView(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.c0 c0Var) {
        if (c0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(c0Var);
        } else {
            this.f8903b.onViewAttachedToWindow(c0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.c0 c0Var) {
        if (c0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(c0Var);
        } else {
            this.f8903b.onViewDetachedFromWindow(c0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NonNull RecyclerView.c0 c0Var) {
        e5 e5Var = this.f8906e;
        if (e5Var != null) {
            e5Var.b(c0Var.itemView);
        }
        if (!(c0Var instanceof MaxAdRecyclerViewHolder)) {
            this.f8903b.onViewRecycled(c0Var);
            return;
        }
        if (this.f8902a.isFilledPosition(c0Var.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) c0Var).getContainerView().removeAllViews();
        }
        super.onViewRecycled(c0Var);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f8909h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z10) {
        super.setHasStableIds(z10);
        this.f8903b.unregisterAdapterDataObserver(this.f8904c);
        this.f8903b.setHasStableIds(z10);
        this.f8903b.registerAdapterDataObserver(this.f8904c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f8907f = listener;
    }

    public void setLookAhead(int i10) {
        this.f8908g = i10;
    }
}
