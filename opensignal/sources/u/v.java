package u;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public long[] f23115a;

    /* renamed from: b, reason: collision with root package name */
    public int f23116b;

    public v(int i10) {
        this.f23115a = i10 == 0 ? n.f23090a : new long[i10];
    }

    public final void a(long j) {
        int i10 = this.f23116b + 1;
        long[] jArr = this.f23115a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            br.l.d(jArrCopyOf, "copyOf(...)");
            this.f23115a = jArrCopyOf;
        }
        long[] jArr2 = this.f23115a;
        int i11 = this.f23116b;
        jArr2[i11] = j;
        this.f23116b = i11 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            int i10 = vVar.f23116b;
            int i11 = this.f23116b;
            if (i10 == i11) {
                long[] jArr = this.f23115a;
                long[] jArr2 = vVar.f23115a;
                hr.d dVarT = vc.e.T(0, i11);
                int i12 = dVarT.f10863a;
                int i13 = dVarT.f10864d;
                if (i12 > i13) {
                    return true;
                }
                while (jArr[i12] == jArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f23115a;
        int i10 = this.f23116b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Long.hashCode(jArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f23115a;
        int i10 = this.f23116b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) "]");
                break;
            }
            long j = jArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(j);
            i11++;
        }
        String string = sb2.toString();
        br.l.d(string, "toString(...)");
        return string;
    }
}
