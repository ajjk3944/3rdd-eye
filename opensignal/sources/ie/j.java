package ie;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
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
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import u3.b0;
import u3.i0;
import xd.l;

/* loaded from: classes.dex */
public final class j extends LinearLayout {
    public static final /* synthetic */ int H = 0;
    public TextView B;
    public ImageView D;
    public Drawable E;
    public int F;
    public final /* synthetic */ TabLayout G;

    /* renamed from: a, reason: collision with root package name */
    public h f11357a;

    /* renamed from: d, reason: collision with root package name */
    public TextView f11358d;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f11359g;

    /* renamed from: r, reason: collision with root package name */
    public View f11360r;

    /* renamed from: x, reason: collision with root package name */
    public hd.a f11361x;

    /* renamed from: y, reason: collision with root package name */
    public View f11362y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TabLayout tabLayout, Context context) {
        super(context);
        this.G = tabLayout;
        this.F = 2;
        e(context);
        setPaddingRelative(tabLayout.f5737x, tabLayout.f5738y, tabLayout.B, tabLayout.D);
        setGravity(17);
        setOrientation(!tabLayout.f5715c0 ? 1 : 0);
        setClickable(true);
        PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        WeakHashMap weakHashMap = i0.f23177a;
        b0.a(this, systemIcon);
    }

    private hd.a getBadge() {
        return this.f11361x;
    }

    private hd.a getOrCreateBadge() {
        if (this.f11361x == null) {
            this.f11361x = new hd.a(getContext(), null);
        }
        b();
        hd.a aVar = this.f11361x;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a() {
        if (this.f11361x != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f11360r;
            if (view != null) {
                hd.a aVar = this.f11361x;
                if (aVar != null) {
                    if (aVar.e() != null) {
                        aVar.e().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.f11360r = null;
            }
        }
    }

    public final void b() {
        if (this.f11361x != null) {
            if (this.f11362y != null) {
                a();
                return;
            }
            TextView textView = this.f11358d;
            if (textView == null || this.f11357a == null) {
                a();
                return;
            }
            if (this.f11360r == textView) {
                c(textView);
                return;
            }
            a();
            TextView textView2 = this.f11358d;
            if (this.f11361x == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            hd.a aVar = this.f11361x;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.j(textView2, null);
            if (aVar.e() != null) {
                aVar.e().setForeground(aVar);
            } else {
                textView2.getOverlay().add(aVar);
            }
            this.f11360r = textView2;
        }
    }

    public final void c(View view) {
        hd.a aVar = this.f11361x;
        if (aVar == null || view != this.f11360r) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.j(view, null);
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
            ie.h r0 = r3.f11357a
            if (r0 == 0) goto L20
            com.google.android.material.tabs.TabLayout r1 = r0.f11352d
            if (r1 == 0) goto L18
            int r1 = r1.getSelectedTabPosition()
            r2 = -1
            if (r1 == r2) goto L20
            int r0 = r0.f11350b
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
        throw new UnsupportedOperationException("Method not decompiled: ie.j.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.E;
        if ((drawable == null || !drawable.isStateful()) ? false : this.E.setState(drawableState)) {
            invalidate();
            this.G.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, ie.j] */
    public final void e(Context context) {
        TabLayout tabLayout = this.G;
        int i10 = tabLayout.P;
        if (i10 != 0) {
            Drawable drawableR = ic.a.r(context, i10);
            this.E = drawableR;
            if (drawableR != null && drawableR.isStateful()) {
                this.E.setState(getDrawableState());
            }
        } else {
            this.E = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.J != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateListA = ce.a.a(tabLayout.J);
            boolean z10 = tabLayout.f5721g0;
            if (z10) {
                gradientDrawable = null;
            }
            gradientDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z10 ? null : gradientDrawable2);
        }
        setBackground(gradientDrawable);
        tabLayout.invalidate();
    }

    public final void f() {
        int i10;
        ViewParent parent;
        h hVar = this.f11357a;
        View view = hVar != null ? hVar.f11351c : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f11362y;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f11362y);
                }
                addView(view);
            }
            this.f11362y = view;
            TextView textView = this.f11358d;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f11359g;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f11359g.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.B = textView2;
            if (textView2 != null) {
                this.F = textView2.getMaxLines();
            }
            this.D = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f11362y;
            if (view3 != null) {
                removeView(view3);
                this.f11362y = null;
            }
            this.B = null;
            this.D = null;
        }
        if (this.f11362y == null) {
            if (this.f11359g == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(ed.h.design_layout_tab_icon, (ViewGroup) this, false);
                this.f11359g = imageView2;
                addView(imageView2, 0);
            }
            if (this.f11358d == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(ed.h.design_layout_tab_text, (ViewGroup) this, false);
                this.f11358d = textView3;
                addView(textView3);
                this.F = this.f11358d.getMaxLines();
            }
            TextView textView4 = this.f11358d;
            TabLayout tabLayout = this.G;
            textView4.setTextAppearance(tabLayout.E);
            if (!isSelected() || (i10 = tabLayout.G) == -1) {
                this.f11358d.setTextAppearance(tabLayout.F);
            } else {
                this.f11358d.setTextAppearance(i10);
            }
            ColorStateList colorStateList = tabLayout.H;
            if (colorStateList != null) {
                this.f11358d.setTextColor(colorStateList);
            }
            g(this.f11358d, this.f11359g, true);
            b();
            ImageView imageView3 = this.f11359g;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new bq.e(this, imageView3));
            }
            TextView textView5 = this.f11358d;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new bq.e(this, textView5));
            }
        } else {
            TextView textView6 = this.B;
            if (textView6 != null || this.D != null) {
                g(textView6, this.D, false);
            }
        }
        if (hVar == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    public final void g(TextView textView, ImageView imageView, boolean z10) {
        boolean z11;
        h hVar = this.f11357a;
        CharSequence charSequence = hVar != null ? hVar.f11349a : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                z11 = false;
            } else {
                this.f11357a.getClass();
                z11 = true;
            }
            textView.setText(!zIsEmpty ? charSequence : null);
            textView.setVisibility(z11 ? 0 : 8);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z11 = false;
        }
        if (z10 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iB = (z11 && imageView.getVisibility() == 0) ? (int) l.b(getContext(), 8) : 0;
            if (this.G.f5715c0) {
                if (iB != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iB);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iB != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iB;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        y3.N(this, zIsEmpty ? null : charSequence);
    }

    public int getContentHeight() {
        View[] viewArr = {this.f11358d, this.f11359g, this.f11362y};
        int iMax = 0;
        int iMin = 0;
        boolean z10 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getVisibility() == 0) {
                iMin = z10 ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z10 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z10 = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f11358d, this.f11359g, this.f11362y};
        int iMax = 0;
        int iMin = 0;
        boolean z10 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getVisibility() == 0) {
                iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                z10 = true;
            }
        }
        return iMax - iMin;
    }

    public h getTab() {
        return this.f11357a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) throws Resources.NotFoundException {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        hd.a aVar = this.f11361x;
        if (aVar != null && aVar.isVisible()) {
            accessibilityNodeInfo.setContentDescription(this.f11361x.d());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) g.a.a(isSelected(), 0, 1, this.f11357a.f11350b, 1).f9121a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) v3.b.f23825e.f23833a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(ed.j.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        TabLayout tabLayout = this.G;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i10 = View.MeasureSpec.makeMeasureSpec(tabLayout.Q, Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f11358d != null) {
            float f10 = tabLayout.M;
            if (isSelected() && tabLayout.G != -1) {
                f10 = tabLayout.N;
            }
            int i12 = this.F;
            ImageView imageView = this.f11359g;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f11358d;
                if (textView != null && textView.getLineCount() > 1) {
                    f10 = tabLayout.O;
                }
            } else {
                i12 = 1;
            }
            float textSize = this.f11358d.getTextSize();
            int lineCount = this.f11358d.getLineCount();
            int maxLines = this.f11358d.getMaxLines();
            if (f10 != textSize || (maxLines >= 0 && i12 != maxLines)) {
                if (tabLayout.f5714b0 == 1 && f10 > textSize && lineCount == 1) {
                    Layout layout = this.f11358d.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f10 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f11358d.setTextSize(0, f10);
                this.f11358d.setMaxLines(i12);
                super.onMeasure(i10, i11);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f11357a == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        h hVar = this.f11357a;
        TabLayout tabLayout = hVar.f11352d;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.f(hVar, true);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        isSelected();
        super.setSelected(z10);
        TextView textView = this.f11358d;
        if (textView != null) {
            textView.setSelected(z10);
        }
        ImageView imageView = this.f11359g;
        if (imageView != null) {
            imageView.setSelected(z10);
        }
        View view = this.f11362y;
        if (view != null) {
            view.setSelected(z10);
        }
    }

    public void setTab(h hVar) {
        if (hVar != this.f11357a) {
            this.f11357a = hVar;
            d();
        }
    }
}
