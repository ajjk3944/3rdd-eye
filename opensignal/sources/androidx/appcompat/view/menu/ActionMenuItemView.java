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
import com.google.android.gms.internal.measurement.y3;
import o.b;
import o.c;
import o.l;
import o.m;
import o.o;
import o.z;
import p.j;
import p.q0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends q0 implements z, View.OnClickListener, j {
    public o D;
    public CharSequence E;
    public Drawable F;
    public l G;
    public b H;
    public c I;
    public boolean J;
    public boolean K;
    public final int L;
    public int M;
    public final int N;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.J = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.ActionMenuItemView, 0, 0);
        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.j.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.N = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.M = -1;
        setSaveEnabled(false);
    }

    @Override // o.z
    public final void a(o oVar) {
        this.D = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f18638a);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.H == null) {
            this.H = new b(this);
        }
    }

    @Override // p.j
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.j
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.D.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // o.z
    public o getItemData() {
        return this.D;
    }

    public final void h() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.E);
        if (this.F != null && ((this.D.f18660y & 4) != 4 || (!this.J && !this.K))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.E : null);
        CharSequence charSequence = this.D.f18652q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z12 ? null : this.D.f18642e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.D.f18653r;
        if (TextUtils.isEmpty(charSequence2)) {
            y3.N(this, z12 ? null : this.D.f18642e);
        } else {
            y3.N(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.G;
        if (lVar != null) {
            lVar.c(this.D);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.J = g();
        h();
    }

    @Override // p.q0, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i12 = this.M) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.L;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (!zIsEmpty || this.F == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.F.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.D.hasSubMenu() && (bVar = this.H) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            o oVar = this.D;
            if (oVar != null) {
                m mVar = oVar.f18649n;
                mVar.k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.F = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.N;
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
        h();
    }

    public void setItemInvoker(l lVar) {
        this.G = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.M = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(c cVar) {
        this.I = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.E = charSequence;
        h();
    }
}
