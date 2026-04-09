package com.monetization.ads.nativeads.view.pager;

import Q1.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.i50;
import com.yandex.mobile.ads.impl.q30;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class MultiBannerControlsContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final q30 f23775a;

    /* renamed from: b, reason: collision with root package name */
    private final i50 f23776b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23777c;

    public static final class a extends f.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f23778a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MultiBannerControlsContainer f23779b;

        public a(f fVar, MultiBannerControlsContainer multiBannerControlsContainer) {
            this.f23778a = fVar;
            this.f23779b = multiBannerControlsContainer;
        }

        @Override // Q1.f.e
        public final void onPageSelected(int i) {
            RecyclerView.h adapter = this.f23778a.getAdapter();
            this.f23779b.a(i, adapter != null ? adapter.getItemCount() : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context) {
        super(context);
        l.f(context, "context");
        this.f23775a = new q30();
        this.f23776b = new i50();
        this.f23777c = true;
    }

    public final void setOnClickLeftButtonListener(View.OnClickListener listener) {
        l.f(listener, "listener");
        View viewFindViewById = findViewById(R.id.left_scroll_control_button);
        ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setOnClickRightButtonListener(View.OnClickListener listener) {
        l.f(listener, "listener");
        View viewFindViewById = findViewById(R.id.right_scroll_control_button);
        ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void a(f viewPager) {
        l.f(viewPager, "viewPager");
        viewPager.a(new a(viewPager, this));
        viewPager.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.monetization.ads.nativeads.view.pager.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                MultiBannerControlsContainer.a(this.f23780b, view, i, i10, i11, i12, i13, i14, i15, i16);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.f23775a = new q30();
        this.f23776b = new i50();
        this.f23777c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MultiBannerControlsContainer this$0, View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        l.f(this$0, "this$0");
        if (view instanceof f) {
            boolean z10 = this$0.f23777c;
            boolean zA = this$0.f23776b.a(view, i, i10, i11, i12);
            this$0.f23777c = zA;
            if (zA != z10) {
                f fVar = (f) view;
                int currentItem = fVar.getCurrentItem();
                RecyclerView.h adapter = fVar.getAdapter();
                this$0.a(currentItem, adapter != null ? adapter.getItemCount() : 0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.f23775a = new q30();
        this.f23776b = new i50();
        this.f23777c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, int i10) {
        int i11 = R.id.left_scroll_control_button;
        View viewFindViewById = findViewById(i11);
        ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
        int i12 = R.id.right_scroll_control_button;
        View viewFindViewById2 = findViewById(i12);
        ImageView imageView2 = viewFindViewById2 instanceof ImageView ? (ImageView) viewFindViewById2 : null;
        int i13 = R.id.dot_indicator;
        View viewFindViewById3 = findViewById(i13);
        ImageView imageView3 = viewFindViewById3 instanceof ImageView ? (ImageView) viewFindViewById3 : null;
        if (!this.f23777c) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(8);
            return;
        }
        View viewFindViewById4 = findViewById(i13);
        ImageView imageView4 = viewFindViewById4 instanceof ImageView ? (ImageView) viewFindViewById4 : null;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
            q30 q30Var = this.f23775a;
            Context context = getContext();
            l.e(context, "getContext(...)");
            imageView4.setImageDrawable(q30Var.a(context, i, i10));
        }
        View viewFindViewById5 = findViewById(i11);
        ImageView imageView5 = viewFindViewById5 instanceof ImageView ? (ImageView) viewFindViewById5 : null;
        View viewFindViewById6 = findViewById(i12);
        ImageView imageView6 = viewFindViewById6 instanceof ImageView ? (ImageView) viewFindViewById6 : null;
        if (imageView5 == null || imageView6 == null) {
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (imageView6 == null) {
                return;
            }
            imageView6.setVisibility(8);
            return;
        }
        if (i == 0) {
            imageView5.setVisibility(8);
            imageView6.setVisibility(0);
        } else if (i == i10 - 1) {
            imageView5.setVisibility(0);
            imageView6.setVisibility(8);
        } else {
            imageView5.setVisibility(0);
            imageView6.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet, int i, int i10) {
        super(context, attributeSet, i, i10);
        l.f(context, "context");
        this.f23775a = new q30();
        this.f23776b = new i50();
        this.f23777c = true;
    }
}
