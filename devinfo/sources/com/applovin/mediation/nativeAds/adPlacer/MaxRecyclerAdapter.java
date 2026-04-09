package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f1;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.v0;
import androidx.recyclerview.widget.x1;
import com.applovin.impl.e5;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxRecyclerAdapter extends t0 implements MaxAdPlacer.Listener {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdPlacer f6420a;

    /* renamed from: b, reason: collision with root package name */
    private final t0 f6421b;

    /* renamed from: c, reason: collision with root package name */
    private final b f6422c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f6423d;

    /* renamed from: e, reason: collision with root package name */
    private e5 f6424e;

    /* renamed from: f, reason: collision with root package name */
    private MaxAdPlacer.Listener f6425f;
    private int g;

    /* renamed from: h, reason: collision with root package name */
    private AdPositionBehavior f6426h;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class MaxAdRecyclerViewHolder extends x1 {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f6428a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f6428a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f6428a;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements e5.a {
        public a() {
        }

        @Override // com.applovin.impl.e5.a
        public void a(int i4, int i10) {
            MaxRecyclerAdapter.this.f6420a.updateFillablePositions(i4, Math.min(MaxRecyclerAdapter.this.g + i10, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, t0 t0Var, Activity activity) {
        b bVar = new b(this, null);
        this.f6422c = bVar;
        this.g = 8;
        this.f6426h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f6420a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(t0Var.hasStableIds());
        this.f6421b = t0Var;
        t0Var.registerAdapterDataObserver(bVar);
    }

    public void destroy() {
        try {
            this.f6421b.unregisterAdapterDataObserver(this.f6422c);
        } catch (Exception unused) {
        }
        this.f6420a.destroy();
        e5 e5Var = this.f6424e;
        if (e5Var != null) {
            e5Var.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f6420a;
    }

    public int getAdjustedPosition(int i4) {
        return this.f6420a.getAdjustedPosition(i4);
    }

    @Override // androidx.recyclerview.widget.t0
    public int getItemCount() {
        return this.f6420a.getAdjustedCount(this.f6421b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.t0
    public long getItemId(int i4) {
        if (this.f6421b.hasStableIds()) {
            return this.f6420a.isFilledPosition(i4) ? this.f6420a.getAdItemId(i4) : this.f6421b.getItemId(this.f6420a.getOriginalPosition(i4));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.t0
    public int getItemViewType(int i4) {
        if (this.f6420a.isAdPosition(i4)) {
            return -42;
        }
        return this.f6421b.getItemViewType(this.f6420a.getOriginalPosition(i4));
    }

    public int getOriginalPosition(int i4) {
        return this.f6420a.getOriginalPosition(i4);
    }

    public void loadAds() {
        this.f6420a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f6425f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i4) {
        notifyItemChanged(i4);
        MaxAdPlacer.Listener listener = this.f6425f;
        if (listener != null) {
            listener.onAdLoaded(i4);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i4) {
        MaxAdPlacer.Listener listener = this.f6425f;
        if (listener != null) {
            listener.onAdRemoved(i4);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f6425f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.t0
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f6423d = recyclerView;
        e5 e5Var = new e5(recyclerView);
        this.f6424e = e5Var;
        e5Var.a(new a());
    }

    @Override // androidx.recyclerview.widget.t0
    public void onBindViewHolder(x1 x1Var, int i4) {
        this.f6424e.a(x1Var.itemView, i4);
        if (!this.f6420a.isAdPosition(i4)) {
            this.f6421b.onBindViewHolder(x1Var, this.f6420a.getOriginalPosition(i4));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f6420a.getAdSize(i4);
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) x1Var).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.f6420a.renderAd(i4, containerView);
        }
    }

    @Override // androidx.recyclerview.widget.t0
    public x1 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        if (i4 != -42) {
            return this.f6421b.onCreateViewHolder(viewGroup, i4);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        f1 layoutManager = this.f6423d.getLayoutManager();
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

    @Override // androidx.recyclerview.widget.t0
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f6423d = null;
        e5 e5Var = this.f6424e;
        if (e5Var != null) {
            e5Var.a();
            this.f6424e = null;
        }
    }

    @Override // androidx.recyclerview.widget.t0
    public boolean onFailedToRecycleView(x1 x1Var) {
        return x1Var instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(x1Var) : this.f6421b.onFailedToRecycleView(x1Var);
    }

    @Override // androidx.recyclerview.widget.t0
    public void onViewAttachedToWindow(x1 x1Var) {
        if (x1Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(x1Var);
        } else {
            this.f6421b.onViewAttachedToWindow(x1Var);
        }
    }

    @Override // androidx.recyclerview.widget.t0
    public void onViewDetachedFromWindow(x1 x1Var) {
        if (x1Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(x1Var);
        } else {
            this.f6421b.onViewDetachedFromWindow(x1Var);
        }
    }

    @Override // androidx.recyclerview.widget.t0
    public void onViewRecycled(x1 x1Var) {
        e5 e5Var = this.f6424e;
        if (e5Var != null) {
            e5Var.b(x1Var.itemView);
        }
        if (!(x1Var instanceof MaxAdRecyclerViewHolder)) {
            this.f6421b.onViewRecycled(x1Var);
            return;
        }
        if (this.f6420a.isFilledPosition(x1Var.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) x1Var).getContainerView().removeAllViews();
        }
        super.onViewRecycled(x1Var);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f6426h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.t0
    public void setHasStableIds(boolean z3) {
        super.setHasStableIds(z3);
        this.f6421b.unregisterAdapterDataObserver(this.f6422c);
        this.f6421b.setHasStableIds(z3);
        this.f6421b.registerAdapterDataObserver(this.f6422c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f6425f = listener;
    }

    public void setLookAhead(int i4) {
        this.g = i4;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b extends v0 {
        private b() {
        }

        @Override // androidx.recyclerview.widget.v0
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.v0
        public void onItemRangeChanged(int i4, int i10) {
            int adjustedPosition = MaxRecyclerAdapter.this.f6420a.getAdjustedPosition(i4);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f6420a.getAdjustedPosition((i4 + i10) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.v0
        public void onItemRangeInserted(int i4, int i10) {
            boolean z3 = i4 + i10 >= MaxRecyclerAdapter.this.f6421b.getItemCount();
            if (MaxRecyclerAdapter.this.f6426h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f6426h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z3)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f6420a.getAdjustedPosition(i4);
            for (int i11 = 0; i11 < i10; i11++) {
                MaxRecyclerAdapter.this.f6420a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i10);
        }

        @Override // androidx.recyclerview.widget.v0
        public void onItemRangeMoved(int i4, int i10, int i11) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.v0
        public void onItemRangeRemoved(int i4, int i10) {
            int itemCount = MaxRecyclerAdapter.this.f6421b.getItemCount();
            boolean z3 = i4 + i10 >= itemCount;
            if (MaxRecyclerAdapter.this.f6426h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f6426h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z3)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f6420a.getAdjustedPosition(i4);
            int adjustedCount = MaxRecyclerAdapter.this.f6420a.getAdjustedCount(itemCount + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                MaxRecyclerAdapter.this.f6420a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f6420a.getAdjustedCount(itemCount);
            int size = adjustedCount - adjustedCount2;
            Collection<Integer> collectionClearTrailingAds = MaxRecyclerAdapter.this.f6420a.clearTrailingAds(adjustedCount2 - 1);
            if (!collectionClearTrailingAds.isEmpty()) {
                size += collectionClearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (size - i10), size);
        }

        public /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }
    }
}
