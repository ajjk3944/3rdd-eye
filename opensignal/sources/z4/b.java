package z4;

import a5.d0;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.media3.common.i;
import java.util.Arrays;
import y1.f1;

/* loaded from: classes.dex */
public final class b implements i {
    public static final b N = new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final String f26640a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final String f26641b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final String f26642c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final String f26643d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final String f26644e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final f1 f26645f0;
    public final int B;
    public final float D;
    public final int E;
    public final float F;
    public final float G;
    public final boolean H;
    public final int I;
    public final int J;
    public final float K;
    public final int L;
    public final float M;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f26646a;

    /* renamed from: d, reason: collision with root package name */
    public final Layout.Alignment f26647d;

    /* renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f26648g;

    /* renamed from: r, reason: collision with root package name */
    public final Bitmap f26649r;

    /* renamed from: x, reason: collision with root package name */
    public final float f26650x;

    /* renamed from: y, reason: collision with root package name */
    public final int f26651y;

    static {
        int i10 = d0.f105a;
        O = Integer.toString(0, 36);
        P = Integer.toString(1, 36);
        Q = Integer.toString(2, 36);
        R = Integer.toString(3, 36);
        S = Integer.toString(4, 36);
        T = Integer.toString(5, 36);
        U = Integer.toString(6, 36);
        V = Integer.toString(7, 36);
        W = Integer.toString(8, 36);
        X = Integer.toString(9, 36);
        Y = Integer.toString(10, 36);
        Z = Integer.toString(11, 36);
        f26640a0 = Integer.toString(12, 36);
        f26641b0 = Integer.toString(13, 36);
        f26642c0 = Integer.toString(14, 36);
        f26643d0 = Integer.toString(15, 36);
        f26644e0 = Integer.toString(16, 36);
        f26645f0 = new f1();
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            a5.a.e(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f26646a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f26646a = charSequence.toString();
        } else {
            this.f26646a = null;
        }
        this.f26647d = alignment;
        this.f26648g = alignment2;
        this.f26649r = bitmap;
        this.f26650x = f10;
        this.f26651y = i10;
        this.B = i11;
        this.D = f11;
        this.E = i12;
        this.F = f13;
        this.G = f14;
        this.H = z10;
        this.I = i14;
        this.J = i13;
        this.K = f12;
        this.L = i15;
        this.M = f15;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            Bitmap bitmap2 = bVar.f26649r;
            if (TextUtils.equals(this.f26646a, bVar.f26646a) && this.f26647d == bVar.f26647d && this.f26648g == bVar.f26648g && ((bitmap = this.f26649r) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f26650x == bVar.f26650x && this.f26651y == bVar.f26651y && this.B == bVar.B && this.D == bVar.D && this.E == bVar.E && this.F == bVar.F && this.G == bVar.G && this.H == bVar.H && this.I == bVar.I && this.J == bVar.J && this.K == bVar.K && this.L == bVar.L && this.M == bVar.M) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26646a, this.f26647d, this.f26648g, this.f26649r, Float.valueOf(this.f26650x), Integer.valueOf(this.f26651y), Integer.valueOf(this.B), Float.valueOf(this.D), Integer.valueOf(this.E), Float.valueOf(this.F), Float.valueOf(this.G), Boolean.valueOf(this.H), Integer.valueOf(this.I), Integer.valueOf(this.J), Float.valueOf(this.K), Integer.valueOf(this.L), Float.valueOf(this.M)});
    }
}
