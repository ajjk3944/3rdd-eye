package androidx.appcompat.widget;

import A3.o;
import R.O;
import R.S;
import a4.t;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.apm.insight.R;
import g.AbstractC2327a;
import n.MenuC2677k;
import n.y;
import o.C2701a;
import o.C2713g;
import o.C2723l;
import o.q1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: C, reason: collision with root package name */
    public TextView f4796C;

    /* renamed from: D, reason: collision with root package name */
    public TextView f4797D;

    /* renamed from: E, reason: collision with root package name */
    public final int f4798E;

    /* renamed from: F, reason: collision with root package name */
    public final int f4799F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4800G;

    /* renamed from: H, reason: collision with root package name */
    public final int f4801H;

    /* renamed from: a, reason: collision with root package name */
    public final C2701a f4802a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4803b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f4804c;

    /* renamed from: d, reason: collision with root package name */
    public C2723l f4805d;

    /* renamed from: e, reason: collision with root package name */
    public int f4806e;

    /* renamed from: f, reason: collision with root package name */
    public S f4807f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4808g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4809h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f4810j;

    /* renamed from: k, reason: collision with root package name */
    public View f4811k;

    /* renamed from: l, reason: collision with root package name */
    public View f4812l;

    /* renamed from: m, reason: collision with root package name */
    public View f4813m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f4814n;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f4802a = new C2701a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f4803b = context;
        } else {
            this.f4803b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2327a.f20117d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : t.i(context, resourceId));
        this.f4798E = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f4799F = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f4806e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f4801H = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, LinearLayoutManager.INVALID_OFFSET), i3);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, boolean z6, int i, int i3, int i6) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = ((i6 - measuredHeight) / 2) + i3;
        if (z6) {
            view.layout(i - measuredWidth, i7, i, measuredHeight + i7);
        } else {
            view.layout(i, i7, i + measuredWidth, measuredHeight + i7);
        }
        return z6 ? -measuredWidth : measuredWidth;
    }

    public final void c(m.a aVar) {
        View view = this.f4811k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f4801H, (ViewGroup) this, false);
            this.f4811k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f4811k);
        }
        View viewFindViewById = this.f4811k.findViewById(R.id.action_mode_close_button);
        this.f4812l = viewFindViewById;
        viewFindViewById.setOnClickListener(new o(5, aVar));
        MenuC2677k menuC2677kC = aVar.c();
        C2723l c2723l = this.f4805d;
        if (c2723l != null) {
            c2723l.g();
            C2713g c2713g = c2723l.f22549I;
            if (c2713g != null && c2713g.b()) {
                c2713g.i.dismiss();
            }
        }
        C2723l c2723l2 = new C2723l(getContext());
        this.f4805d = c2723l2;
        c2723l2.f22564m = true;
        c2723l2.f22565n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC2677kC.b(this.f4805d, this.f4803b);
        C2723l c2723l3 = this.f4805d;
        y yVar = c2723l3.f22560h;
        if (yVar == null) {
            y yVar2 = (y) c2723l3.f22556d.inflate(c2723l3.f22558f, (ViewGroup) this, false);
            c2723l3.f22560h = yVar2;
            yVar2.b(c2723l3.f22555c);
            c2723l3.b(true);
        }
        y yVar3 = c2723l3.f22560h;
        if (yVar != yVar3) {
            ((ActionMenuView) yVar3).setPresenter(c2723l3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) yVar3;
        this.f4804c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f4804c, layoutParams);
    }

    public final void d() {
        if (this.f4814n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4814n = linearLayout;
            this.f4796C = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f4797D = (TextView) this.f4814n.findViewById(R.id.action_bar_subtitle);
            int i = this.f4798E;
            if (i != 0) {
                this.f4796C.setTextAppearance(getContext(), i);
            }
            int i3 = this.f4799F;
            if (i3 != 0) {
                this.f4797D.setTextAppearance(getContext(), i3);
            }
        }
        this.f4796C.setText(this.i);
        this.f4797D.setText(this.f4810j);
        boolean zIsEmpty = TextUtils.isEmpty(this.i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f4810j);
        this.f4797D.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f4814n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f4814n.getParent() == null) {
            addView(this.f4814n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f4813m = null;
        this.f4804c = null;
        this.f4805d = null;
        View view = this.f4812l;
        if (view != null) {
            view.setOnClickListener(null);
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

    public int getAnimatedVisibility() {
        return this.f4807f != null ? this.f4802a.f22476b : getVisibility();
    }

    public int getContentHeight() {
        return this.f4806e;
    }

    public CharSequence getSubtitle() {
        return this.f4810j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            S s5 = this.f4807f;
            if (s5 != null) {
                s5.b();
            }
            super.setVisibility(i);
        }
    }

    public final S i(int i, long j6) {
        S s5 = this.f4807f;
        if (s5 != null) {
            s5.b();
        }
        C2701a c2701a = this.f4802a;
        if (i != 0) {
            S sA = O.a(this);
            sA.a(0.0f);
            sA.c(j6);
            ((ActionBarContextView) c2701a.f22477c).f4807f = sA;
            c2701a.f22476b = i;
            sA.d(c2701a);
            return sA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        S sA2 = O.a(this);
        sA2.a(1.0f);
        sA2.c(j6);
        ((ActionBarContextView) c2701a.f22477c).f4807f = sA2;
        c2701a.f22476b = i;
        sA2.d(c2701a);
        return sA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC2327a.f20114a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C2723l c2723l = this.f4805d;
        if (c2723l != null) {
            Configuration configuration2 = c2723l.f22554b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            c2723l.f22545E = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i3 > 720) || (i > 720 && i3 > 960)) ? 5 : (i >= 500 || (i > 640 && i3 > 480) || (i > 480 && i3 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC2677k menuC2677k = c2723l.f22555c;
            if (menuC2677k != null) {
                menuC2677k.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2723l c2723l = this.f4805d;
        if (c2723l != null) {
            c2723l.g();
            C2713g c2713g = this.f4805d.f22549I;
            if (c2713g == null || !c2713g.b()) {
                return;
            }
            c2713g.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4809h = false;
        }
        if (!this.f4809h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f4809h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f4809h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        boolean z7 = q1.f22618a;
        boolean z8 = getLayoutDirection() == 1;
        int paddingRight = z8 ? (i6 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f4811k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4811k.getLayoutParams();
            int i8 = z8 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i9 = z8 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i10 = z8 ? paddingRight - i8 : paddingRight + i8;
            int iG = g(this.f4811k, z8, i10, paddingTop, paddingTop2) + i10;
            paddingRight = z8 ? iG - i9 : iG + i9;
        }
        LinearLayout linearLayout = this.f4814n;
        if (linearLayout != null && this.f4813m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f4814n, z8, paddingRight, paddingTop, paddingTop2);
        }
        View view2 = this.f4813m;
        if (view2 != null) {
            g(view2, z8, paddingRight, paddingTop, paddingTop2);
        }
        int paddingLeft = z8 ? getPaddingLeft() : (i6 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f4804c;
        if (actionMenuView != null) {
            g(actionMenuView, !z8, paddingLeft, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f4806e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, LinearLayoutManager.INVALID_OFFSET);
        View view = this.f4811k;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4811k.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f4804c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f4804c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f4814n;
        if (linearLayout != null && this.f4813m == null) {
            if (this.f4800G) {
                this.f4814n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f4814n.getMeasuredWidth();
                boolean z6 = measuredWidth <= paddingLeft;
                if (z6) {
                    paddingLeft -= measuredWidth;
                }
                this.f4814n.setVisibility(z6 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f4813m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                iMin = Math.min(i8, iMin);
            }
            this.f4813m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(iMin, i9));
        }
        if (this.f4806e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4808g = false;
        }
        if (!this.f4808g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f4808g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f4808g = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f4806e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4813m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4813m = view;
        if (view != null && (linearLayout = this.f4814n) != null) {
            removeView(linearLayout);
            this.f4814n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4810j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        O.n(this, charSequence);
    }

    public void setTitleOptional(boolean z6) {
        if (z6 != this.f4800G) {
            requestLayout();
        }
        this.f4800G = z6;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
