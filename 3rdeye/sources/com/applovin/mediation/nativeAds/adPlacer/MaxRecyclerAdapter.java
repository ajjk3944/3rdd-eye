package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.applovin.impl.s4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* loaded from: classes.dex */
public class MaxRecyclerAdapter extends RecyclerView.h<RecyclerView.F> implements MaxAdPlacer.Listener {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdPlacer f21991a;

    /* renamed from: b, reason: collision with root package name */
    private final RecyclerView.h f21992b;

    /* renamed from: c, reason: collision with root package name */
    private final b f21993c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f21994d;

    /* renamed from: e, reason: collision with root package name */
    private s4 f21995e;

    /* renamed from: f, reason: collision with root package name */
    private MaxAdPlacer.Listener f21996f;

    /* renamed from: g, reason: collision with root package name */
    private int f21997g;

    /* renamed from: h, reason: collision with root package name */
    private AdPositionBehavior f21998h;

    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    public static class MaxAdRecyclerViewHolder extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f22000a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f22000a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f22000a;
        }
    }

    public class a implements s4.a {
        public a() {
        }

        @Override // com.applovin.impl.s4.a
        public void a(int i, int i10) {
            MaxRecyclerAdapter.this.f21991a.updateFillablePositions(i, Math.min(MaxRecyclerAdapter.this.f21997g + i10, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    public class b extends RecyclerView.j {
        private b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeChanged(int i, int i10) {
            int adjustedPosition = MaxRecyclerAdapter.this.f21991a.getAdjustedPosition(i);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f21991a.getAdjustedPosition((i + i10) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeInserted(int i, int i10) {
            boolean z10 = i + i10 >= MaxRecyclerAdapter.this.f21992b.getItemCount();
            if (MaxRecyclerAdapter.this.f21998h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f21998h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f21991a.getAdjustedPosition(i);
            for (int i11 = 0; i11 < i10; i11++) {
                MaxRecyclerAdapter.this.f21991a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeMoved(int i, int i10, int i11) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeRemoved(int i, int i10) {
            int itemCount = MaxRecyclerAdapter.this.f21992b.getItemCount();
            boolean z10 = i + i10 >= itemCount;
            if (MaxRecyclerAdapter.this.f21998h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f21998h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f21991a.getAdjustedPosition(i);
            int adjustedCount = MaxRecyclerAdapter.this.f21991a.getAdjustedCount(itemCount + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                MaxRecyclerAdapter.this.f21991a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f21991a.getAdjustedCount(itemCount);
            int size = adjustedCount - adjustedCount2;
            Collection<Integer> collectionClearTrailingAds = MaxRecyclerAdapter.this.f21991a.clearTrailingAds(adjustedCount2 - 1);
            if (!collectionClearTrailingAds.isEmpty()) {
                size += collectionClearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (size - i10), size);
        }

        public /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.h hVar, Activity activity) {
        b bVar = new b(this, null);
        this.f21993c = bVar;
        this.f21997g = 8;
        this.f21998h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f21991a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(hVar.hasStableIds());
        this.f21992b = hVar;
        hVar.registerAdapterDataObserver(bVar);
    }

    public void destroy() {
        try {
            this.f21992b.unregisterAdapterDataObserver(this.f21993c);
        } catch (Exception unused) {
        }
        this.f21991a.destroy();
        s4 s4Var = this.f21995e;
        if (s4Var != null) {
            s4Var.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f21991a;
    }

    public int getAdjustedPosition(int i) {
        return this.f21991a.getAdjustedPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f21991a.getAdjustedCount(this.f21992b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i) {
        if (this.f21992b.hasStableIds()) {
            return this.f21991a.isFilledPosition(i) ? this.f21991a.getAdItemId(i) : this.f21992b.getItemId(this.f21991a.getOriginalPosition(i));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i) {
        if (this.f21991a.isAdPosition(i)) {
            return -42;
        }
        return this.f21992b.getItemViewType(this.f21991a.getOriginalPosition(i));
    }

    public int getOriginalPosition(int i) {
        return this.f21991a.getOriginalPosition(i);
    }

    public void loadAds() {
        this.f21991a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f21996f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i) {
        notifyItemChanged(i);
        MaxAdPlacer.Listener listener = this.f21996f;
        if (listener != null) {
            listener.onAdLoaded(i);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i) {
        MaxAdPlacer.Listener listener = this.f21996f;
        if (listener != null) {
            listener.onAdRemoved(i);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f21996f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f21994d = recyclerView;
        s4 s4Var = new s4(recyclerView);
        this.f21995e = s4Var;
        s4Var.a(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.F f10, int i) {
        this.f21995e.a(f10.itemView, i);
        if (!this.f21991a.isAdPosition(i)) {
            this.f21992b.onBindViewHolder(f10, this.f21991a.getOriginalPosition(i));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f21991a.getAdSize(i, a(i));
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) f10).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.f21991a.renderAd(i, containerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != -42) {
            return this.f21992b.onCreateViewHolder(viewGroup, i);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        RecyclerView.p layoutManager = this.f21994d.getLayoutManager();
        if (layoutManager == null || !layoutManager.v()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        viewInflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f21994d = null;
        s4 s4Var = this.f21995e;
        if (s4Var != null) {
            s4Var.a();
            this.f21995e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean onFailedToRecycleView(RecyclerView.F f10) {
        return f10 instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(f10) : this.f21992b.onFailedToRecycleView(f10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(RecyclerView.F f10) {
        if (f10 instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(f10);
        } else {
            this.f21992b.onViewAttachedToWindow(f10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(RecyclerView.F f10) {
        if (f10 instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(f10);
        } else {
            this.f21992b.onViewDetachedFromWindow(f10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.F f10) {
        s4 s4Var = this.f21995e;
        if (s4Var != null) {
            s4Var.b(f10.itemView);
        }
        if (!(f10 instanceof MaxAdRecyclerViewHolder)) {
            this.f21992b.onViewRecycled(f10);
            return;
        }
        if (this.f21991a.isFilledPosition(f10.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) f10).getContainerView().removeAllViews();
        }
        super.onViewRecycled(f10);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f21998h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setHasStableIds(boolean z10) {
        super.setHasStableIds(z10);
        this.f21992b.unregisterAdapterDataObserver(this.f21993c);
        this.f21992b.setHasStableIds(z10);
        this.f21992b.registerAdapterDataObserver(this.f21993c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f21996f = listener;
    }

    public void setLookAhead(int i) {
        this.f21997g = i;
    }

    private int a(int i) {
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f21994d.getContext(), this.f21994d.getWidth());
        RecyclerView.p layoutManager = this.f21994d.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            return layoutManager instanceof StaggeredGridLayoutManager ? iPxToDp / ((StaggeredGridLayoutManager) layoutManager).f16550p : iPxToDp;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int i10 = gridLayoutManager.f16386F;
        gridLayoutManager.f16391K.getClass();
        return iPxToDp / i10;
    }
}
