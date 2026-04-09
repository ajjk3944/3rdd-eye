package c5;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.s;
import androidx.core.widget.c;
import com.google.android.material.internal.a0;
import j4.b;
import j4.k;
import j4.l;

/* loaded from: classes2.dex */
public class a extends s {

    /* renamed from: g, reason: collision with root package name */
    public static final int f4742g = k.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: h, reason: collision with root package name */
    public static final int[][] f4743h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f4744e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4745f;

    public a(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4744e == null) {
            int iD = u4.a.d(this, c.a.colorControlActivated);
            int iD2 = u4.a.d(this, b.colorOnSurface);
            int iD3 = u4.a.d(this, b.colorSurface);
            int[][] iArr = f4743h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = u4.a.j(iD3, iD, 1.0f);
            iArr2[1] = u4.a.j(iD3, iD2, 0.54f);
            iArr2[2] = u4.a.j(iD3, iD2, 0.38f);
            iArr2[3] = u4.a.j(iD3, iD2, 0.38f);
            this.f4744e = new ColorStateList(iArr, iArr2);
        }
        return this.f4744e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4745f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f4745f = z10;
        if (z10) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, null);
        }
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, c.a.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f4742g;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = a0.i(context2, attributeSet, l.MaterialRadioButton, i10, i11, new int[0]);
        int i12 = l.MaterialRadioButton_buttonTint;
        if (typedArrayI.hasValue(i12)) {
            c.d(this, d5.c.a(context2, typedArrayI, i12));
        }
        this.f4745f = typedArrayI.getBoolean(l.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayI.recycle();
    }
}
