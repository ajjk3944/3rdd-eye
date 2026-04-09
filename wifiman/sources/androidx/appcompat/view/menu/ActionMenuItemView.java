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
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.N;
import androidx.appcompat.widget.g0;
import h.AbstractC5936j;
import l.InterfaceC6524e;

/* loaded from: classes.dex */
public class ActionMenuItemView extends D implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: h, reason: collision with root package name */
    g f26745h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f26746i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f26747j;

    /* renamed from: k, reason: collision with root package name */
    e.b f26748k;

    /* renamed from: l, reason: collision with root package name */
    private N f26749l;

    /* renamed from: m, reason: collision with root package name */
    b f26750m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26751n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f26752o;

    /* renamed from: p, reason: collision with root package name */
    private int f26753p;

    /* renamed from: q, reason: collision with root package name */
    private int f26754q;

    /* renamed from: r, reason: collision with root package name */
    private int f26755r;

    private class a extends N {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.N
        public InterfaceC6524e b() {
            b bVar = ActionMenuItemView.this.f26750m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.N
        protected boolean c() {
            InterfaceC6524e interfaceC6524eB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f26748k;
            return bVar != null && bVar.a(actionMenuItemView.f26745h) && (interfaceC6524eB = b()) != null && interfaceC6524eB.a();
        }
    }

    public static abstract class b {
        public abstract InterfaceC6524e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void u() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f26746i);
        if (this.f26747j != null && (!this.f26745h.B() || (!this.f26751n && !this.f26752o))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f26746i : null);
        CharSequence contentDescription = this.f26745h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f26745h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f26745h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            g0.a(this, z12 ? null : this.f26745h.getTitle());
        } else {
            g0.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return s() && this.f26745h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(g gVar, int i10) {
        this.f26745h = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f26749l == null) {
            this.f26749l = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f26745h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f26748k;
        if (bVar != null) {
            bVar.a(this.f26745h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f26751n = t();
        u();
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean zS = s();
        if (zS && (i12 = this.f26754q) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f26753p) : this.f26753p;
        if (mode != 1073741824 && this.f26753p > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zS || this.f26747j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f26747j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        N n10;
        if (this.f26745h.hasSubMenu() && (n10 = this.f26749l) != null && n10.onTouch(this, motionEvent)) {
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
        if (this.f26752o != z10) {
            this.f26752o = z10;
            g gVar = this.f26745h;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f26747j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f26755r;
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

    public void setItemInvoker(e.b bVar) {
        this.f26748k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f26754q = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f26750m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f26746i = charSequence;
        u();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f26751n = t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5936j.f48285v, i10, 0);
        this.f26753p = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5936j.f48289w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f26755r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f26754q = -1;
        setSaveEnabled(false);
    }
}
