package y9;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f25912c = new d(new int[]{2}, 8);

    /* renamed from: d, reason: collision with root package name */
    public static final d f25913d = new d(new int[]{2, 5, 6}, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f25914e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a, reason: collision with root package name */
    public final int[] f25915a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25916b;

    public d(int[] iArr, int i10) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f25915a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f25915a = new int[0];
        }
        this.f25916b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Arrays.equals(this.f25915a, dVar.f25915a) && this.f25916b == dVar.f25916b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f25915a) * 31) + this.f25916b;
    }

    public final String toString() {
        String string = Arrays.toString(this.f25915a);
        StringBuilder sb2 = new StringBuilder(c7.a.d(67, string));
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(this.f25916b);
        sb2.append(", supportedEncodings=");
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }
}
