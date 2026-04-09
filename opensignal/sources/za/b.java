package za;

import android.net.Uri;
import java.util.Arrays;
import qb.v;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f26804c = new b(new a[0]);

    /* renamed from: d, reason: collision with root package name */
    public static final a f26805d;

    /* renamed from: a, reason: collision with root package name */
    public final int f26806a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f26807b;

    static {
        int iMax = Math.max(0, 0);
        int[] iArrCopyOf = Arrays.copyOf(new int[0], iMax);
        Arrays.fill(iArrCopyOf, 0, iMax, 0);
        int iMax2 = Math.max(0, 0);
        long[] jArrCopyOf = Arrays.copyOf(new long[0], iMax2);
        Arrays.fill(jArrCopyOf, 0, iMax2, -9223372036854775807L);
        f26805d = new a(0, iArrCopyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), jArrCopyOf);
    }

    public b(a[] aVarArr) {
        this.f26806a = aVarArr.length;
        this.f26807b = aVarArr;
    }

    public final a a(int i10) {
        return i10 < 0 ? f26805d : this.f26807b[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        int i10 = v.f20828a;
        return this.f26806a == bVar.f26806a && Arrays.equals(this.f26807b, bVar.f26807b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26807b) + (((((this.f26806a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        return c7.a.p("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
