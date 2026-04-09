package T3;

import O3.e;
import O3.h;
import O3.i;
import O3.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C3882g;
import androidx.appcompat.widget.b0;
import androidx.vectordrawable.graphics.drawable.c;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import f.AbstractC5487d;
import i.AbstractC6050a;
import i4.AbstractC6074a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x1.AbstractC8416a;

/* loaded from: classes3.dex */
public class a extends C3882g {

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f21372A;

    /* renamed from: B, reason: collision with root package name */
    private static final int[][] f21373B;

    /* renamed from: C, reason: collision with root package name */
    private static final int f21374C;

    /* renamed from: y, reason: collision with root package name */
    private static final int f21375y = i.f17148j;

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f21376z = {O3.a.f16957K};

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f21377e;

    /* renamed from: f, reason: collision with root package name */
    private final LinkedHashSet f21378f;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f21379g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21380h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21381i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21382j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f21383k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f21384l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f21385m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21386n;

    /* renamed from: o, reason: collision with root package name */
    ColorStateList f21387o;

    /* renamed from: p, reason: collision with root package name */
    ColorStateList f21388p;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f21389q;

    /* renamed from: r, reason: collision with root package name */
    private int f21390r;

    /* renamed from: s, reason: collision with root package name */
    private int[] f21391s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21392t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f21393u;

    /* renamed from: v, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f21394v;

    /* renamed from: w, reason: collision with root package name */
    private final c f21395w;

    /* renamed from: x, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f21396x;

    /* renamed from: T3.a$a, reason: collision with other inner class name */
    class C0775a extends androidx.vectordrawable.graphics.drawable.b {
        C0775a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = a.this.f21387o;
            if (colorStateList != null) {
                AbstractC8416a.o(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            super.c(drawable);
            a aVar = a.this;
            ColorStateList colorStateList = aVar.f21387o;
            if (colorStateList != null) {
                AbstractC8416a.n(drawable, colorStateList.getColorForState(aVar.f21391s, a.this.f21387o.getDefaultColor()));
            }
        }
    }

    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new C0776a();

        /* renamed from: a, reason: collision with root package name */
        int f21398a;

        /* renamed from: T3.a$b$a, reason: collision with other inner class name */
        class C0776a implements Parcelable.Creator {
            C0776a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* synthetic */ b(Parcel parcel, C0775a c0775a) {
            this(parcel);
        }

        private String a() {
            int i10 = this.f21398a;
            return i10 != 1 ? i10 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f21398a));
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f21398a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i10 = O3.a.f16956J;
        f21372A = new int[]{i10};
        f21373B = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f21374C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, O3.a.f16964c);
    }

    private boolean c(b0 b0Var) {
        return b0Var.n(j.f17338X2, 0) == f21374C && b0Var.n(j.f17345Y2, 0) == 0;
    }

    private void e() {
        this.f21384l = d.c(this.f21384l, this.f21387o, androidx.core.widget.c.c(this));
        this.f21385m = d.c(this.f21385m, this.f21388p, this.f21389q);
        g();
        h();
        super.setButtonDrawable(d.a(this.f21384l, this.f21385m));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 30 || this.f21393u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void g() {
        c cVar;
        if (this.f21386n) {
            c cVar2 = this.f21395w;
            if (cVar2 != null) {
                cVar2.f(this.f21396x);
                this.f21395w.b(this.f21396x);
            }
            Drawable drawable = this.f21384l;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f21395w) == null) {
                return;
            }
            int i10 = e.f17072b;
            int i11 = e.f17070P;
            ((AnimatedStateListDrawable) drawable).addTransition(i10, i11, cVar, false);
            ((AnimatedStateListDrawable) this.f21384l).addTransition(e.f17078h, i11, this.f21395w, false);
        }
    }

    private String getButtonStateDescription() {
        int i10 = this.f21390r;
        return i10 == 1 ? getResources().getString(h.f17123h) : i10 == 0 ? getResources().getString(h.f17125j) : getResources().getString(h.f17124i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f21379g == null) {
            int[][] iArr = f21373B;
            int[] iArr2 = new int[iArr.length];
            int iD = V3.a.d(this, O3.a.f16966e);
            int iD2 = V3.a.d(this, O3.a.f16968g);
            int iD3 = V3.a.d(this, O3.a.f16972k);
            int iD4 = V3.a.d(this, O3.a.f16969h);
            iArr2[0] = V3.a.j(iD3, iD2, 1.0f);
            iArr2[1] = V3.a.j(iD3, iD, 1.0f);
            iArr2[2] = V3.a.j(iD3, iD4, 0.54f);
            iArr2[3] = V3.a.j(iD3, iD4, 0.38f);
            iArr2[4] = V3.a.j(iD3, iD4, 0.38f);
            this.f21379g = new ColorStateList(iArr, iArr2);
        }
        return this.f21379g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f21387o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f21384l;
        if (drawable != null && (colorStateList2 = this.f21387o) != null) {
            AbstractC8416a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f21385m;
        if (drawable2 == null || (colorStateList = this.f21388p) == null) {
            return;
        }
        AbstractC8416a.o(drawable2, colorStateList);
    }

    private void i() {
    }

    public boolean d() {
        return this.f21382j;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f21384l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f21385m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f21388p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f21389q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f21387o;
    }

    public int getCheckedState() {
        return this.f21390r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f21383k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f21390r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21380h && this.f21387o == null && this.f21388p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f21376z);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f21372A);
        }
        this.f21391s = d.e(iArrOnCreateDrawableState);
        i();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f21381i || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (n.g(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            AbstractC8416a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f21383k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f21398a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f21398a = getCheckedState();
        return bVar;
    }

    @Override // androidx.appcompat.widget.C3882g, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(AbstractC6050a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f21385m = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(AbstractC6050a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f21388p == colorStateList) {
            return;
        }
        this.f21388p = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f21389q == mode) {
            return;
        }
        this.f21389q = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f21387o == colorStateList) {
            return;
        }
        this.f21387o = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f21381i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f21390r != i10) {
            this.f21390r = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            f();
            if (this.f21392t) {
                return;
            }
            this.f21392t = true;
            LinkedHashSet linkedHashSet = this.f21378f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    AbstractC5487d.a(it.next());
                    throw null;
                }
            }
            if (this.f21390r != 2 && (onCheckedChangeListener = this.f21394v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f21392t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        i();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f21383k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f21382j == z10) {
            return;
        }
        this.f21382j = z10;
        refreshDrawableState();
        Iterator it = this.f21377e.iterator();
        if (it.hasNext()) {
            AbstractC5487d.a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f21394v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f21393u = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f21380h = z10;
        if (z10) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f21375y;
        super(AbstractC6074a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f21377e = new LinkedHashSet();
        this.f21378f = new LinkedHashSet();
        this.f21395w = c.a(getContext(), O3.d.f17049e);
        this.f21396x = new C0775a();
        Context context2 = getContext();
        this.f21384l = androidx.core.widget.c.a(this);
        this.f21387o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        b0 b0VarJ = k.j(context2, attributeSet, j.f17331W2, i10, i11, new int[0]);
        this.f21385m = b0VarJ.g(j.f17352Z2);
        if (this.f21384l != null && k.g(context2) && c(b0VarJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f21384l = AbstractC6050a.b(context2, O3.d.f17048d);
            this.f21386n = true;
            if (this.f21385m == null) {
                this.f21385m = AbstractC6050a.b(context2, O3.d.f17050f);
            }
        }
        this.f21388p = c4.c.b(context2, b0VarJ, j.f17360a3);
        this.f21389q = n.i(b0VarJ.k(j.f17368b3, -1), PorterDuff.Mode.SRC_IN);
        this.f21380h = b0VarJ.a(j.f17408g3, false);
        this.f21381i = b0VarJ.a(j.f17376c3, true);
        this.f21382j = b0VarJ.a(j.f17400f3, false);
        this.f21383k = b0VarJ.p(j.f17392e3);
        int i12 = j.f17384d3;
        if (b0VarJ.s(i12)) {
            setCheckedState(b0VarJ.k(i12, 0));
        }
        b0VarJ.x();
        e();
    }

    @Override // androidx.appcompat.widget.C3882g, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f21384l = drawable;
        this.f21386n = false;
        e();
    }
}
