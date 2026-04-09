package cb;

import java.util.Locale;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f3595a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3596b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3597c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3598d;

    public t(String[] strArr, int[] iArr, String[] strArr2, int i10) {
        this.f3595a = strArr;
        this.f3596b = iArr;
        this.f3597c = strArr2;
        this.f3598d = i10;
    }

    public final String a(int i10, long j, long j7, String str) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            String[] strArr = this.f3595a;
            int i12 = this.f3598d;
            if (i11 >= i12) {
                sb2.append(strArr[i12]);
                return sb2.toString();
            }
            sb2.append(strArr[i11]);
            int i13 = this.f3596b[i11];
            if (i13 == 1) {
                sb2.append(str);
            } else {
                String[] strArr2 = this.f3597c;
                if (i13 == 2) {
                    sb2.append(String.format(Locale.US, strArr2[i11], Long.valueOf(j)));
                } else if (i13 == 3) {
                    sb2.append(String.format(Locale.US, strArr2[i11], Integer.valueOf(i10)));
                } else if (i13 == 4) {
                    sb2.append(String.format(Locale.US, strArr2[i11], Long.valueOf(j7)));
                }
            }
            i11++;
        }
    }
}
