package androidx.media3.common;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements i {
    public static final a B;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final ab.c H;

    /* renamed from: y, reason: collision with root package name */
    public static final b f1565y = new b(new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1566a;

    /* renamed from: d, reason: collision with root package name */
    public final long f1567d;

    /* renamed from: g, reason: collision with root package name */
    public final long f1568g;

    /* renamed from: r, reason: collision with root package name */
    public final int f1569r;

    /* renamed from: x, reason: collision with root package name */
    public final a[] f1570x;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = aVar.f1558x;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f1559y;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        B = new a(aVar.f1554a, 0, aVar.f1556g, iArrCopyOf, (Uri[]) Arrays.copyOf(aVar.f1557r, 0), jArrCopyOf, aVar.B, aVar.D);
        int i10 = a5.d0.f105a;
        D = Integer.toString(1, 36);
        E = Integer.toString(2, 36);
        F = Integer.toString(3, 36);
        G = Integer.toString(4, 36);
        H = new ab.c(1);
    }

    public b(a[] aVarArr, long j, long j7, int i10) {
        this.f1567d = j;
        this.f1568g = j7;
        this.f1566a = aVarArr.length + i10;
        this.f1570x = aVarArr;
        this.f1569r = i10;
    }

    public final a a(int i10) {
        int i11 = this.f1569r;
        return i10 < i11 ? B : this.f1570x[i10 - i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        int i10 = a5.d0.f105a;
        return this.f1566a == bVar.f1566a && this.f1567d == bVar.f1567d && this.f1568g == bVar.f1568g && this.f1569r == bVar.f1569r && Arrays.equals(this.f1570x, bVar.f1570x);
    }

    public final int hashCode() {
        return (((((((this.f1566a * 961) + ((int) this.f1567d)) * 31) + ((int) this.f1568g)) * 31) + this.f1569r) * 31) + Arrays.hashCode(this.f1570x);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb2.append(this.f1567d);
        sb2.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f1570x;
            if (i10 >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=");
            sb2.append(aVarArr[i10].f1554a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < aVarArr[i10].f1558x.length; i11++) {
                sb2.append("ad(state=");
                int i12 = aVarArr[i10].f1558x[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(aVarArr[i10].f1559y[i11]);
                sb2.append(')');
                if (i11 < aVarArr[i10].f1558x.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < aVarArr.length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }
}
