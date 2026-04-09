package L3;

import A2.C0117e;
import R.H;
import R.O;
import a4.t;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.tabs.TabLayout;
import d5.y;
import g3.C2332a;
import java.util.WeakHashMap;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public final class i extends LinearLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f2587l = 0;

    /* renamed from: a, reason: collision with root package name */
    public g f2588a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f2589b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f2590c;

    /* renamed from: d, reason: collision with root package name */
    public View f2591d;

    /* renamed from: e, reason: collision with root package name */
    public C2332a f2592e;

    /* renamed from: f, reason: collision with root package name */
    public View f2593f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f2594g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f2595h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public int f2596j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TabLayout f2597k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TabLayout tabLayout, Context context) {
        super(context);
        this.f2597k = tabLayout;
        this.f2596j = 2;
        e(context);
        setPaddingRelative(tabLayout.f18478e, tabLayout.f18480f, tabLayout.f18482g, tabLayout.f18483h);
        setGravity(17);
        setOrientation(!tabLayout.f18465R ? 1 : 0);
        setClickable(true);
        Context context2 = getContext();
        int i = Build.VERSION.SDK_INT;
        int i3 = 9;
        U0.j jVar = i >= 24 ? new U0.j(i3, N.e.h(context2)) : new U0.j(i3, (Object) null);
        WeakHashMap weakHashMap = O.f3270a;
        if (i >= 24) {
            H.a(this, A0.a.i((PointerIcon) jVar.f3677b));
        }
    }

    private C2332a getBadge() {
        return this.f2592e;
    }

    private C2332a getOrCreateBadge() {
        if (this.f2592e == null) {
            this.f2592e = new C2332a(getContext(), null);
        }
        b();
        C2332a c2332a = this.f2592e;
        if (c2332a != null) {
            return c2332a;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a() {
        if (this.f2592e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f2591d;
            if (view != null) {
                C2332a c2332a = this.f2592e;
                if (c2332a != null) {
                    if (c2332a.e() != null) {
                        c2332a.e().setForeground(null);
                    } else {
                        view.getOverlay().remove(c2332a);
                    }
                }
                this.f2591d = null;
            }
        }
    }

    public final void b() {
        if (this.f2592e != null) {
            if (this.f2593f != null) {
                a();
                return;
            }
            TextView textView = this.f2589b;
            if (textView == null || this.f2588a == null) {
                a();
                return;
            }
            if (this.f2591d == textView) {
                c(textView);
                return;
            }
            a();
            TextView textView2 = this.f2589b;
            if (this.f2592e == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            C2332a c2332a = this.f2592e;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            c2332a.setBounds(rect);
            c2332a.j(textView2, null);
            if (c2332a.e() != null) {
                c2332a.e().setForeground(c2332a);
            } else {
                textView2.getOverlay().add(c2332a);
            }
            this.f2591d = textView2;
        }
    }

    public final void c(View view) {
        C2332a c2332a = this.f2592e;
        if (c2332a == null || view != this.f2591d) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c2332a.setBounds(rect);
        c2332a.j(view, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r3 = this;
            r3.f()
            L3.g r0 = r3.f2588a
            if (r0 == 0) goto L20
            com.google.android.material.tabs.TabLayout r1 = r0.f2583d
            if (r1 == 0) goto L18
            int r1 = r1.getSelectedTabPosition()
            r2 = -1
            if (r1 == r2) goto L20
            int r0 = r0.f2581b
            if (r1 != r0) goto L20
            r0 = 1
            goto L21
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Tab not attached to a TabLayout"
            r0.<init>(r1)
            throw r0
        L20:
            r0 = 0
        L21:
            r3.setSelected(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.i.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i;
        if ((drawable == null || !drawable.isStateful()) ? false : this.i.setState(drawableState)) {
            invalidate();
            this.f2597k.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [L3.i, android.view.View] */
    public final void e(Context context) {
        TabLayout tabLayout = this.f2597k;
        int i = tabLayout.f18456H;
        if (i != 0) {
            Drawable drawableI = t.i(context, i);
            this.i = drawableI;
            if (drawableI != null && drawableI.isStateful()) {
                this.i.setState(getDrawableState());
            }
        } else {
            this.i = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.f18488n != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateListA = E3.a.a(tabLayout.f18488n);
            boolean z6 = tabLayout.f18469V;
            if (z6) {
                gradientDrawable = null;
            }
            gradientDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z6 ? null : gradientDrawable2);
        }
        setBackground(gradientDrawable);
        tabLayout.invalidate();
    }

    public final void f() {
        int i;
        ViewParent parent;
        g gVar = this.f2588a;
        View view = gVar != null ? gVar.f2582c : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f2593f;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f2593f);
                }
                addView(view);
            }
            this.f2593f = view;
            TextView textView = this.f2589b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f2590c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f2590c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f2594g = textView2;
            if (textView2 != null) {
                this.f2596j = textView2.getMaxLines();
            }
            this.f2595h = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f2593f;
            if (view3 != null) {
                removeView(view3);
                this.f2593f = null;
            }
            this.f2594g = null;
            this.f2595h = null;
        }
        if (this.f2593f == null) {
            if (this.f2590c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.apm.insight.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f2590c = imageView2;
                addView(imageView2, 0);
            }
            if (this.f2589b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.apm.insight.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f2589b = textView3;
                addView(textView3);
                this.f2596j = this.f2589b.getMaxLines();
            }
            TextView textView4 = this.f2589b;
            TabLayout tabLayout = this.f2597k;
            textView4.setTextAppearance(tabLayout.i);
            if (!isSelected() || (i = tabLayout.f18485k) == -1) {
                this.f2589b.setTextAppearance(tabLayout.f18484j);
            } else {
                this.f2589b.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.f18486l;
            if (colorStateList != null) {
                this.f2589b.setTextColor(colorStateList);
            }
            g(this.f2589b, this.f2590c, true);
            b();
            ImageView imageView3 = this.f2590c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new h(this, imageView3));
            }
            TextView textView5 = this.f2589b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new h(this, textView5));
            }
        } else {
            TextView textView6 = this.f2594g;
            if (textView6 != null || this.f2595h != null) {
                g(textView6, this.f2595h, false);
            }
        }
        if (gVar == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    public final void g(TextView textView, ImageView imageView, boolean z6) {
        boolean z7;
        g gVar = this.f2588a;
        String str = gVar != null ? gVar.f2580a : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (textView != null) {
            if (zIsEmpty) {
                z7 = false;
            } else {
                this.f2588a.getClass();
                z7 = true;
            }
            textView.setText(!zIsEmpty ? str : null);
            textView.setVisibility(z7 ? 0 : 8);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z7 = false;
        }
        if (z6 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iE = (z7 && imageView.getVisibility() == 0) ? (int) AbstractC2993B.e(getContext(), 8) : 0;
            if (this.f2597k.f18465R) {
                if (iE != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iE);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iE != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iE;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        if (Build.VERSION.SDK_INT > 23) {
            y.r(this, zIsEmpty ? null : str);
        }
    }

    public int getContentHeight() {
        View[] viewArr = {this.f2589b, this.f2590c, this.f2593f};
        int iMax = 0;
        int iMin = 0;
        boolean z6 = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z6 ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z6 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z6 = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f2589b, this.f2590c, this.f2593f};
        int iMax = 0;
        int iMin = 0;
        boolean z6 = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z6 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z6 ? Math.max(iMax, view.getRight()) : view.getRight();
                z6 = true;
            }
        }
        return iMax - iMin;
    }

    public g getTab() {
        return this.f2588a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) throws Resources.NotFoundException {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C2332a c2332a = this.f2592e;
        if (c2332a != null && c2332a.isVisible()) {
            accessibilityNodeInfo.setContentDescription(this.f2592e.d());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0117e.w(false, isSelected(), 0, 1, this.f2588a.f2581b, 1).f245b);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) S.c.f3433g.f3441a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.apm.insight.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.f2597k;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.f18457I, LinearLayoutManager.INVALID_OFFSET);
        }
        super.onMeasure(i, i3);
        if (this.f2589b != null) {
            float f2 = tabLayout.f18453E;
            if (isSelected() && tabLayout.f18485k != -1) {
                f2 = tabLayout.f18454F;
            }
            int i6 = this.f2596j;
            ImageView imageView = this.f2590c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f2589b;
                if (textView != null && textView.getLineCount() > 1) {
                    f2 = tabLayout.f18455G;
                }
            } else {
                i6 = 1;
            }
            float textSize = this.f2589b.getTextSize();
            int lineCount = this.f2589b.getLineCount();
            int maxLines = this.f2589b.getMaxLines();
            if (f2 != textSize || (maxLines >= 0 && i6 != maxLines)) {
                if (tabLayout.f18464Q == 1 && f2 > textSize && lineCount == 1) {
                    Layout layout = this.f2589b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f2 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f2589b.setTextSize(0, f2);
                this.f2589b.setMaxLines(i6);
                super.onMeasure(i, i3);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f2588a == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        g gVar = this.f2588a;
        TabLayout tabLayout = gVar.f2583d;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.g(gVar, true);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z6) {
        isSelected();
        super.setSelected(z6);
        TextView textView = this.f2589b;
        if (textView != null) {
            textView.setSelected(z6);
        }
        ImageView imageView = this.f2590c;
        if (imageView != null) {
            imageView.setSelected(z6);
        }
        View view = this.f2593f;
        if (view != null) {
            view.setSelected(z6);
        }
    }

    public void setTab(g gVar) {
        if (gVar != this.f2588a) {
            this.f2588a = gVar;
            d();
        }
    }
}
