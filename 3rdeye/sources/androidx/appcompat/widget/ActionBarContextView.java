package androidx.appcompat.widget;

import A9.I;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.a;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import g.C4353a;
import m.AbstractC5304a;
import o.AbstractC5383a;
import o.f0;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC5383a {

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f14528j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f14529k;

    /* renamed from: l, reason: collision with root package name */
    public View f14530l;

    /* renamed from: m, reason: collision with root package name */
    public View f14531m;

    /* renamed from: n, reason: collision with root package name */
    public View f14532n;

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f14533o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f14534p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f14535q;

    /* renamed from: r, reason: collision with root package name */
    public final int f14536r;

    /* renamed from: s, reason: collision with root package name */
    public final int f14537s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14538t;

    /* renamed from: u, reason: collision with root package name */
    public final int f14539u;

    public class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC5304a f14540b;

        public a(AbstractC5304a abstractC5304a) {
            this.f14540b = abstractC5304a;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f14540b.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4353a.f37879d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : I.w(context, resourceId));
        this.f14536r = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f14537s = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f44617f = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f14539u = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void f(AbstractC5304a abstractC5304a) {
        View view = this.f14530l;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f14539u, (ViewGroup) this, false);
            this.f14530l = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f14530l);
        }
        View viewFindViewById = this.f14530l.findViewById(R.id.action_mode_close_button);
        this.f14531m = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(abstractC5304a));
        f fVarE = abstractC5304a.e();
        androidx.appcompat.widget.a aVar = this.f44616e;
        if (aVar != null) {
            aVar.h();
            a.C0228a c0228a = aVar.f14771u;
            if (c0228a != null && c0228a.b()) {
                c0228a.i.dismiss();
            }
        }
        androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(getContext());
        this.f44616e = aVar2;
        aVar2.f14763m = true;
        aVar2.f14764n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        fVarE.b(this.f44616e, this.f44614c);
        androidx.appcompat.widget.a aVar3 = this.f44616e;
        k kVar = aVar3.i;
        if (kVar == null) {
            k kVar2 = (k) aVar3.f14378e.inflate(aVar3.f14380g, (ViewGroup) this, false);
            aVar3.i = kVar2;
            kVar2.f(aVar3.f14377d);
            aVar3.g();
        }
        k kVar3 = aVar3.i;
        if (kVar != kVar3) {
            ((ActionMenuView) kVar3).setPresenter(aVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kVar3;
        this.f44615d = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f44615d, layoutParams);
    }

    public final void g() {
        if (this.f14533o == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f14533o = linearLayout;
            this.f14534p = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f14535q = (TextView) this.f14533o.findViewById(R.id.action_bar_subtitle);
            int i = this.f14536r;
            if (i != 0) {
                this.f14534p.setTextAppearance(getContext(), i);
            }
            int i10 = this.f14537s;
            if (i10 != 0) {
                this.f14535q.setTextAppearance(getContext(), i10);
            }
        }
        this.f14534p.setText(this.f14528j);
        this.f14535q.setText(this.f14529k);
        boolean zIsEmpty = TextUtils.isEmpty(this.f14528j);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f14529k);
        this.f14535q.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f14533o.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f14533o.getParent() == null) {
            addView(this.f14533o);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // o.AbstractC5383a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // o.AbstractC5383a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f14529k;
    }

    public CharSequence getTitle() {
        return this.f14528j;
    }

    public final void h() {
        removeAllViews();
        this.f14532n = null;
        this.f44615d = null;
        this.f44616e = null;
        View view = this.f14531m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f44616e;
        if (aVar != null) {
            aVar.h();
            a.C0228a c0228a = this.f44616e.f14771u;
            if (c0228a == null || !c0228a.b()) {
                return;
            }
            c0228a.i.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        boolean z11 = f0.f44665a;
        boolean z12 = getLayoutDirection() == 1;
        int paddingRight = z12 ? (i11 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.f14530l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f14530l.getLayoutParams();
            int i13 = z12 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = z12 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = z12 ? paddingRight - i13 : paddingRight + i13;
            int iD = AbstractC5383a.d(this.f14530l, z12, i15, paddingTop, paddingTop2) + i15;
            paddingRight = z12 ? iD - i14 : iD + i14;
        }
        LinearLayout linearLayout = this.f14533o;
        if (linearLayout != null && this.f14532n == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbstractC5383a.d(this.f14533o, z12, paddingRight, paddingTop, paddingTop2);
        }
        View view2 = this.f14532n;
        if (view2 != null) {
            AbstractC5383a.d(view2, z12, paddingRight, paddingTop, paddingTop2);
        }
        int paddingLeft = z12 ? getPaddingLeft() : (i11 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f44615d;
        if (actionMenuView != null) {
            AbstractC5383a.d(actionMenuView, !z12, paddingLeft, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f44617f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i10);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, RecyclerView.UNDEFINED_DURATION);
        View view = this.f14530l;
        if (view != null) {
            int iC = AbstractC5383a.c(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f14530l.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f44615d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = AbstractC5383a.c(this.f44615d, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f14533o;
        if (linearLayout != null && this.f14532n == null) {
            if (this.f14538t) {
                this.f14533o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f14533o.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f14533o.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = AbstractC5383a.c(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f14532n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                iMin = Math.min(i13, iMin);
            }
            this.f14532n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(iMin, i14));
        }
        if (this.f44617f > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // o.AbstractC5383a
    public void setContentHeight(int i) {
        this.f44617f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f14532n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f14532n = view;
        if (view != null && (linearLayout = this.f14533o) != null) {
            removeView(linearLayout);
            this.f14533o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f14529k = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f14528j = charSequence;
        g();
        L0.I.p(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f14538t) {
            requestLayout();
        }
        this.f14538t = z10;
    }

    @Override // o.AbstractC5383a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
