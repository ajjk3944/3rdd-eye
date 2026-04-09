package androidx.media3.common;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements i {
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final ab.c M;
    public final long B;
    public final boolean D;

    /* renamed from: a, reason: collision with root package name */
    public final long f1554a;

    /* renamed from: d, reason: collision with root package name */
    public final int f1555d;

    /* renamed from: g, reason: collision with root package name */
    public final int f1556g;

    /* renamed from: r, reason: collision with root package name */
    public final Uri[] f1557r;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f1558x;

    /* renamed from: y, reason: collision with root package name */
    public final long[] f1559y;

    static {
        int i10 = a5.d0.f105a;
        E = Integer.toString(0, 36);
        F = Integer.toString(1, 36);
        G = Integer.toString(2, 36);
        H = Integer.toString(3, 36);
        I = Integer.toString(4, 36);
        J = Integer.toString(5, 36);
        K = Integer.toString(6, 36);
        L = Integer.toString(7, 36);
        M = new ab.c(2);
    }

    public a(long j, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j7, boolean z10) {
        a5.a.e(iArr.length == uriArr.length);
        this.f1554a = j;
        this.f1555d = i10;
        this.f1556g = i11;
        this.f1558x = iArr;
        this.f1557r = uriArr;
        this.f1559y = jArr;
        this.B = j7;
        this.D = z10;
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f1558x;
            if (i12 >= iArr.length || this.D || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f1554a == aVar.f1554a && this.f1555d == aVar.f1555d && this.f1556g == aVar.f1556g && Arrays.equals(this.f1557r, aVar.f1557r) && Arrays.equals(this.f1558x, aVar.f1558x) && Arrays.equals(this.f1559y, aVar.f1559y) && this.B == aVar.B && this.D == aVar.D) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.f1555d * 31) + this.f1556g) * 31;
        long j = this.f1554a;
        int iHashCode = (Arrays.hashCode(this.f1559y) + ((Arrays.hashCode(this.f1558x) + ((((i10 + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f1557r)) * 31)) * 31)) * 31;
        long j7 = this.B;
        return ((iHashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.D ? 1 : 0);
    }
}
