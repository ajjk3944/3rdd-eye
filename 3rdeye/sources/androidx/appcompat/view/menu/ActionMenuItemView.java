package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.a;
import g.C4353a;
import n.InterfaceC5344f;
import o.AbstractViewOnTouchListenerC5378F;
import o.a0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {
    public h i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f14346j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f14347k;

    /* renamed from: l, reason: collision with root package name */
    public f.b f14348l;

    /* renamed from: m, reason: collision with root package name */
    public a f14349m;

    /* renamed from: n, reason: collision with root package name */
    public b f14350n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14351o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14352p;

    /* renamed from: q, reason: collision with root package name */
    public final int f14353q;

    /* renamed from: r, reason: collision with root package name */
    public int f14354r;

    /* renamed from: s, reason: collision with root package name */
    public final int f14355s;

    public class a extends AbstractViewOnTouchListenerC5378F {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // o.AbstractViewOnTouchListenerC5378F
        public final InterfaceC5344f b() {
            a.C0228a c0228a;
            b bVar = ActionMenuItemView.this.f14350n;
            if (bVar == null || (c0228a = androidx.appcompat.widget.a.this.f14771u) == null) {
                return null;
            }
            return c0228a.a();
        }

        @Override // o.AbstractViewOnTouchListenerC5378F
        public final boolean c() {
            InterfaceC5344f interfaceC5344fB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.f14348l;
            return bVar != null && bVar.a(actionMenuItemView.i) && (interfaceC5344fB = b()) != null && interfaceC5344fB.a();
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f14351o = o();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4353a.f37878c, 0, 0);
        this.f14353q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f14355s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f14354r = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean f() {
        return !TextUtils.isEmpty(getText()) && this.i.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.i;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void i(h hVar) {
        this.i = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.f14460a);
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f14349m == null) {
            this.f14349m = new a();
        }
    }

    public final boolean o() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i10 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f.b bVar = this.f14348l;
        if (bVar != null) {
            bVar.a(this.i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f14351o = o();
        p();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i11 = this.f14354r) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i10);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f14353q;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i12) : i12;
        if (mode != 1073741824 && i12 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i10);
        }
        if (!zIsEmpty || this.f14347k == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f14347k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.i.hasSubMenu() && (aVar = this.f14349m) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f14346j);
        if (this.f14347k != null && ((this.i.f14483y & 4) != 4 || (!this.f14351o && !this.f14352p))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f14346j : null);
        CharSequence charSequence = this.i.f14475q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z12 ? null : this.i.f14464e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.i.f14476r;
        if (TextUtils.isEmpty(charSequence2)) {
            a0.a(this, z12 ? null : this.i.f14464e);
        } else {
            a0.a(this, charSequence2);
        }
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f14352p != z10) {
            this.f14352p = z10;
            h hVar = this.i;
            if (hVar != null) {
                f fVar = hVar.f14472n;
                fVar.f14440k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f14347k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f14355s;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        p();
    }

    public void setItemInvoker(f.b bVar) {
        this.f14348l = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i10, int i11, int i12) {
        this.f14354r = i;
        super.setPadding(i, i10, i11, i12);
    }

    public void setPopupCallback(b bVar) {
        this.f14350n = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f14346j = charSequence;
        p();
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
