package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zb2 {
    public static final zb2 b = new zb2(new cd1[0]);
    public static final cd1 c;
    public final cd1[] a;

    static {
        cd1 cd1Var = new cd1(-1, new int[0], new fk1[0], new long[0], new String[0], new qu1[0]);
        int[] iArr = cd1Var.d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = cd1Var.e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        fk1[] fk1VarArr = (fk1[]) Arrays.copyOf(cd1Var.c, 0);
        String[] strArr = (String[]) Arrays.copyOf(cd1Var.f, 0);
        qu1[] qu1VarArr = cd1Var.g;
        c = new cd1(0, iArrCopyOf, fk1VarArr, jArrCopyOf, strArr, (qu1[]) Arrays.copyOf(qu1VarArr, Math.max(0, qu1VarArr.length)));
        String str = v23.a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zb2(cd1[] cd1VarArr) {
        this.a = cd1VarArr;
    }

    public final cd1 a(int i) {
        return i < 0 ? c : this.a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zb2.class == obj.getClass() && Arrays.equals(this.a, ((zb2) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[])";
    }
}
