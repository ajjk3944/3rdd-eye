package x;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public long[] f36952a;

    /* renamed from: b, reason: collision with root package name */
    public int f36953b;

    public w(int i4) {
        this.f36952a = i4 == 0 ? n.f36917a : new long[i4];
    }

    public final void a(long j) {
        int i4 = this.f36953b + 1;
        long[] jArr = this.f36952a;
        if (jArr.length < i4) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i4, (jArr.length * 3) / 2));
            nk.k.d(jArrCopyOf, "copyOf(...)");
            this.f36952a = jArrCopyOf;
        }
        long[] jArr2 = this.f36952a;
        int i10 = this.f36953b;
        jArr2[i10] = j;
        this.f36953b = i10 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            int i4 = wVar.f36953b;
            int i10 = this.f36953b;
            if (i4 == i10) {
                long[] jArr = this.f36952a;
                long[] jArr2 = wVar.f36952a;
                sk.d dVarE = ci.b.E(0, i10);
                int i11 = dVarE.f33817a;
                int i12 = dVarE.f33818b;
                if (i11 > i12) {
                    return true;
                }
                while (jArr[i11] == jArr2[i11]) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f36952a;
        int i4 = this.f36953b;
        int i10 = 0;
        for (int i11 = 0; i11 < i4; i11++) {
            long j = jArr[i11];
            i10 += ((int) (j ^ (j >>> 32))) * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f36952a;
        int i4 = this.f36953b;
        int i10 = 0;
        while (true) {
            if (i10 >= i4) {
                sb2.append((CharSequence) "]");
                break;
            }
            long j = jArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(j);
            i10++;
        }
        String string = sb2.toString();
        nk.k.d(string, "toString(...)");
        return string;
    }
}
