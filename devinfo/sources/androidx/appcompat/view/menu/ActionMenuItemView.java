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
import h.a;
import o.b;
import o.c;
import o.m;
import o.o;
import o.z;
import p.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements z, View.OnClickListener, l {

    /* renamed from: h, reason: collision with root package name */
    public o f668h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f669i;
    public Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public o.l f670k;

    /* renamed from: l, reason: collision with root package name */
    public b f671l;

    /* renamed from: m, reason: collision with root package name */
    public c f672m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f673n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f674o;

    /* renamed from: p, reason: collision with root package name */
    public final int f675p;

    /* renamed from: q, reason: collision with root package name */
    public int f676q;

    /* renamed from: r, reason: collision with root package name */
    public final int f677r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f673n = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f24778c, 0, 0);
        this.f675p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f677r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f676q = -1;
        setSaveEnabled(false);
    }

    @Override // o.z
    public final void a(o oVar) {
        this.f668h = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f30263a);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f671l == null) {
            this.f671l = new b(this);
        }
    }

    @Override // p.l
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.l
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f668h.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i4 < 480) {
            return (i4 >= 640 && i10 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // o.z
    public o getItemData() {
        return this.f668h;
    }

    public final void h() {
        boolean z3 = true;
        boolean z10 = !TextUtils.isEmpty(this.f669i);
        if (this.j != null && ((this.f668h.f30285y & 4) != 4 || (!this.f673n && !this.f674o))) {
            z3 = false;
        }
        boolean z11 = z10 & z3;
        setText(z11 ? this.f669i : null);
        CharSequence charSequence = this.f668h.f30277q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z11 ? null : this.f668h.f30267e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f668h.f30278r;
        if (TextUtils.isEmpty(charSequence2)) {
            pd.b.s(this, z11 ? null : this.f668h.f30267e);
        } else {
            pd.b.s(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o.l lVar = this.f670k;
        if (lVar != null) {
            lVar.c(this.f668h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f673n = g();
        h();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i10) {
        int i11;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i11 = this.f676q) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i10);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f675p;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i12) : i12;
        if (mode != 1073741824 && i12 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i10);
        }
        if (!zIsEmpty || this.j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f668h.hasSubMenu() && (bVar = this.f671l) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f674o != z3) {
            this.f674o = z3;
            o oVar = this.f668h;
            if (oVar != null) {
                m mVar = oVar.f30274n;
                mVar.f30246k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f677r;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (intrinsicHeight * (i4 / intrinsicWidth));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (intrinsicWidth * (i4 / intrinsicHeight));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(o.l lVar) {
        this.f670k = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i4, int i10, int i11, int i12) {
        this.f676q = i4;
        super.setPadding(i4, i10, i11, i12);
    }

    public void setPopupCallback(c cVar) {
        this.f672m = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f669i = charSequence;
        h();
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }
}
