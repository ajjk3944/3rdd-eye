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
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.m0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements i.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: h, reason: collision with root package name */
    public f f617h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f618i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f619j;

    /* renamed from: k, reason: collision with root package name */
    public d.b f620k;

    /* renamed from: l, reason: collision with root package name */
    public m0 f621l;

    /* renamed from: m, reason: collision with root package name */
    public b f622m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f623n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f624o;

    /* renamed from: p, reason: collision with root package name */
    public int f625p;

    /* renamed from: q, reason: collision with root package name */
    public int f626q;

    /* renamed from: r, reason: collision with root package name */
    public int f627r;

    public class a extends m0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.m0
        public i.f b() {
            b bVar = ActionMenuItemView.this.f622m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0
        public boolean c() {
            i.f fVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            d.b bVar = actionMenuItemView.f620k;
            return bVar != null && bVar.b(actionMenuItemView.f617h) && (fVarB = b()) != null && fVarB.a();
        }
    }

    public static abstract class b {
        public abstract i.f a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return s() && this.f617h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void c(f fVar, int i10) {
        this.f617h = fVar;
        setIcon(fVar.getIcon());
        setTitle(fVar.i(this));
        setId(fVar.getItemId());
        setVisibility(fVar.isVisible() ? 0 : 8);
        setEnabled(fVar.isEnabled());
        if (fVar.hasSubMenu() && this.f621l == null) {
            this.f621l = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean d() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.i.a
    public f getItemData() {
        return this.f617h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d.b bVar = this.f620k;
        if (bVar != null) {
            bVar.b(this.f617h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f623n = t();
        u();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean zS = s();
        if (zS && (i12 = this.f626q) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f625p) : this.f625p;
        if (mode != 1073741824 && this.f625p > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zS || this.f619j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f619j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m0 m0Var;
        if (this.f617h.hasSubMenu() && (m0Var = this.f621l) != null && m0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f624o != z10) {
            this.f624o = z10;
            f fVar = this.f617h;
            if (fVar != null) {
                fVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f619j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f627r;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        u();
    }

    public void setItemInvoker(d.b bVar) {
        this.f620k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f626q = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f622m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f618i = charSequence;
        u();
    }

    public final boolean t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void u() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f618i);
        if (this.f619j != null && (!this.f617h.B() || (!this.f623n && !this.f624o))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f618i : null);
        CharSequence contentDescription = this.f617h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f617h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f617h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            e1.a(this, z12 ? null : this.f617h.getTitle());
        } else {
            e1.a(this, tooltipText);
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f623n = t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.j.ActionMenuItemView, i10, 0);
        this.f625p = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.j.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f627r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f626q = -1;
        setSaveEnabled(false);
    }
}
