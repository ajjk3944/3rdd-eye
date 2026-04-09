package a5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141a;

    /* renamed from: b, reason: collision with root package name */
    public int f142b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f143c;

    public n(int i10) {
        this.f141a = i10;
        switch (i10) {
            case 1:
                this.f143c = new long[32];
                break;
            case 2:
                break;
            default:
                this.f143c = new long[32];
                break;
        }
    }

    public final void a(long j) {
        switch (this.f141a) {
            case 0:
                int i10 = this.f142b;
                long[] jArr = this.f143c;
                if (i10 == jArr.length) {
                    this.f143c = Arrays.copyOf(jArr, i10 * 2);
                }
                long[] jArr2 = this.f143c;
                int i11 = this.f142b;
                this.f142b = i11 + 1;
                jArr2[i11] = j;
                break;
            case 1:
                int i12 = this.f142b;
                long[] jArr3 = this.f143c;
                if (i12 == jArr3.length) {
                    this.f143c = Arrays.copyOf(jArr3, i12 * 2);
                }
                long[] jArr4 = this.f143c;
                int i13 = this.f142b;
                this.f142b = i13 + 1;
                jArr4[i13] = j;
                break;
            default:
                if (!b(j)) {
                    int i14 = this.f142b;
                    long[] jArrCopyOf = this.f143c;
                    if (i14 >= jArrCopyOf.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i14 + 1, jArrCopyOf.length * 2));
                        br.l.d(jArrCopyOf, "copyOf(...)");
                        this.f143c = jArrCopyOf;
                    }
                    jArrCopyOf[i14] = j;
                    if (i14 >= this.f142b) {
                        this.f142b = i14 + 1;
                        break;
                    }
                }
                break;
        }
    }

    public boolean b(long j) {
        int i10 = this.f142b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f143c[i11] == j) {
                return true;
            }
        }
        return false;
    }

    public long c(int i10) {
        switch (this.f141a) {
            case 0:
                if (i10 >= 0 && i10 < this.f142b) {
                    return this.f143c[i10];
                }
                StringBuilder sbU = h0.b.u("Invalid index ", i10, ", size is ");
                sbU.append(this.f142b);
                throw new IndexOutOfBoundsException(sbU.toString());
            default:
                if (i10 >= 0 && i10 < this.f142b) {
                    return this.f143c[i10];
                }
                int i11 = this.f142b;
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("Invalid index ");
                sb2.append(i10);
                sb2.append(", size is ");
                sb2.append(i11);
                throw new IndexOutOfBoundsException(sb2.toString());
        }
    }

    public void d(long j) {
        int i10 = this.f142b;
        int i11 = 0;
        while (i11 < i10) {
            if (j == this.f143c[i11]) {
                int i12 = this.f142b - 1;
                while (i11 < i12) {
                    long[] jArr = this.f143c;
                    int i13 = i11 + 1;
                    jArr[i11] = jArr[i13];
                    i11 = i13;
                }
                this.f142b--;
                return;
            }
            i11++;
        }
    }
}
