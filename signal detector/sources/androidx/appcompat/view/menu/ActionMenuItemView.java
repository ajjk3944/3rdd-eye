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
import androidx.appcompat.widget.AppCompatTextView;
import d5.y;
import g.AbstractC2327a;
import n.AbstractC2669c;
import n.C2668b;
import n.InterfaceC2676j;
import n.MenuC2677k;
import n.m;
import n.x;
import o.InterfaceC2725m;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements x, View.OnClickListener, InterfaceC2725m {

    /* renamed from: C, reason: collision with root package name */
    public boolean f4760C;

    /* renamed from: D, reason: collision with root package name */
    public final int f4761D;

    /* renamed from: E, reason: collision with root package name */
    public int f4762E;

    /* renamed from: F, reason: collision with root package name */
    public final int f4763F;

    /* renamed from: h, reason: collision with root package name */
    public m f4764h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f4765j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC2676j f4766k;

    /* renamed from: l, reason: collision with root package name */
    public C2668b f4767l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC2669c f4768m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4769n;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f4769n = j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2327a.f20116c, 0, 0);
        this.f4761D = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f4763F = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f4762E = -1;
        setSaveEnabled(false);
    }

    @Override // n.x
    public final void a(m mVar) {
        this.f4764h = mVar;
        setIcon(mVar.getIcon());
        setTitle(mVar.getTitleCondensed());
        setId(mVar.f22106a);
        setVisibility(mVar.isVisible() ? 0 : 8);
        setEnabled(mVar.isEnabled());
        if (mVar.hasSubMenu() && this.f4767l == null) {
            this.f4767l = new C2668b(this);
        }
    }

    @Override // o.InterfaceC2725m
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // o.InterfaceC2725m
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f4764h.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // n.x
    public m getItemData() {
        return this.f4764h;
    }

    public final boolean j() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i3 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void m() {
        boolean z6 = true;
        boolean z7 = !TextUtils.isEmpty(this.i);
        if (this.f4765j != null && ((this.f4764h.M & 4) != 4 || (!this.f4769n && !this.f4760C))) {
            z6 = false;
        }
        boolean z8 = z7 & z6;
        setText(z8 ? this.i : null);
        CharSequence charSequence = this.f4764h.f22094E;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z8 ? null : this.f4764h.f22110e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f4764h.f22095F;
        if (TextUtils.isEmpty(charSequence2)) {
            y.r(this, z8 ? null : this.f4764h.f22110e);
        } else {
            y.r(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2676j interfaceC2676j = this.f4766k;
        if (interfaceC2676j != null) {
            interfaceC2676j.c(this.f4764h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4769n = j();
        m();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i3) {
        int i6;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i6 = this.f4762E) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i3);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f4761D;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i7) : i7;
        if (mode != 1073741824 && i7 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (!zIsEmpty || this.f4765j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4765j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2668b c2668b;
        if (this.f4764h.hasSubMenu() && (c2668b = this.f4767l) != null && c2668b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }

    public void setExpandedFormat(boolean z6) {
        if (this.f4760C != z6) {
            this.f4760C = z6;
            m mVar = this.f4764h;
            if (mVar != null) {
                MenuC2677k menuC2677k = mVar.f22118n;
                menuC2677k.f22085k = true;
                menuC2677k.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4765j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f4763F;
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
        m();
    }

    public void setItemInvoker(InterfaceC2676j interfaceC2676j) {
        this.f4766k = interfaceC2676j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i3, int i6, int i7) {
        this.f4762E = i;
        super.setPadding(i, i3, i6, i7);
    }

    public void setPopupCallback(AbstractC2669c abstractC2669c) {
        this.f4768m = abstractC2669c;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        m();
    }
}
