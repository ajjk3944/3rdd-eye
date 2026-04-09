package B3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.apm.insight.R;
import d3.AbstractC2266a;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public int f559a;

    /* renamed from: b, reason: collision with root package name */
    public int f560b;

    /* renamed from: c, reason: collision with root package name */
    public float f561c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f562d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f563e;

    /* renamed from: f, reason: collision with root package name */
    public int f564f;

    /* renamed from: g, reason: collision with root package name */
    public int f565g;

    /* renamed from: h, reason: collision with root package name */
    public int f566h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f567j;

    /* renamed from: k, reason: collision with root package name */
    public int f568k;

    /* renamed from: l, reason: collision with root package name */
    public int f569l;

    /* renamed from: m, reason: collision with root package name */
    public int f570m;

    /* renamed from: n, reason: collision with root package name */
    public float f571n;

    public e(Context context, AttributeSet attributeSet, int i, int i3) throws Resources.NotFoundException {
        this.f563e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        AbstractC2993B.a(context, attributeSet, i, i3);
        int[] iArr = AbstractC2266a.f19750d;
        AbstractC2993B.b(context, attributeSet, iArr, i, i3, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i3);
        this.f559a = com.bumptech.glide.c.q(context, typedArrayObtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null) {
            int i6 = typedValuePeekValue.type;
            if (i6 == 5) {
                this.f560b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), this.f559a / 2);
                this.f562d = false;
            } else if (i6 == 6) {
                this.f561c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f562d = true;
            }
        }
        this.f565g = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.f566h = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        int iAbs = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0));
        this.f567j = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(14, iAbs));
        this.f568k = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(15, iAbs));
        this.f569l = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0));
        this.f570m = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        this.f571n = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        if (!typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f563e = new int[]{com.bumptech.glide.e.n(context, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(3).type != 1) {
            this.f563e = new int[]{typedArrayObtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(3, -1));
            this.f563e = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            this.f564f = typedArrayObtainStyledAttributes.getColor(8, -1);
        } else {
            this.f564f = this.f563e[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f2 = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f564f = com.bumptech.glide.e.c(this.f564f, (int) (f2 * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a() {
        return this.f562d ? (int) (this.f559a * this.f561c) : this.f560b;
    }

    public final boolean b(boolean z6) {
        if (this.f569l <= 0) {
            return false;
        }
        if (z6 || this.f568k <= 0) {
            return z6 && this.f567j > 0;
        }
        return true;
    }

    public boolean c() {
        return this.f562d && this.f561c == 0.5f;
    }

    public void d() {
        if (this.i < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
