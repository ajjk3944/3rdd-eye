package b4;

import O3.i;
import O3.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C3896v;
import androidx.core.widget.c;
import com.google.android.material.internal.k;
import i4.AbstractC6074a;

/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4070a extends C3896v {

    /* renamed from: g, reason: collision with root package name */
    private static final int f32927g = i.f17149k;

    /* renamed from: h, reason: collision with root package name */
    private static final int[][] f32928h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f32929e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f32930f;

    public C4070a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, O3.a.f16954H);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f32929e == null) {
            int iD = V3.a.d(this, O3.a.f16966e);
            int iD2 = V3.a.d(this, O3.a.f16969h);
            int iD3 = V3.a.d(this, O3.a.f16972k);
            int[][] iArr = f32928h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = V3.a.j(iD3, iD, 1.0f);
            iArr2[1] = V3.a.j(iD3, iD2, 0.54f);
            iArr2[2] = V3.a.j(iD3, iD2, 0.38f);
            iArr2[3] = V3.a.j(iD3, iD2, 0.38f);
            this.f32929e = new ColorStateList(iArr, iArr2);
        }
        return this.f32929e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32930f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f32930f = z10;
        if (z10) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4070a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f32927g;
        super(AbstractC6074a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = k.i(context2, attributeSet, j.f17432j3, i10, i11, new int[0]);
        int i12 = j.f17440k3;
        if (typedArrayI.hasValue(i12)) {
            c.d(this, c4.c.a(context2, typedArrayI, i12));
        }
        this.f32930f = typedArrayI.getBoolean(j.f17448l3, false);
        typedArrayI.recycle();
    }
}
