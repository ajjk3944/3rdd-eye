package za;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f26800a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri[] f26801b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f26802c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f26803d;

    public a(int i10, int[] iArr, Uri[] uriArr, long[] jArr) {
        qb.b.g(iArr.length == uriArr.length);
        this.f26800a = i10;
        this.f26802c = iArr;
        this.f26801b = uriArr;
        this.f26803d = jArr;
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f26802c;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f26800a == aVar.f26800a && Arrays.equals(this.f26801b, aVar.f26801b) && Arrays.equals(this.f26802c, aVar.f26802c) && Arrays.equals(this.f26803d, aVar.f26803d);
    }

    public final int hashCode() {
        int i10 = (int) 0;
        return (((Arrays.hashCode(this.f26803d) + ((Arrays.hashCode(this.f26802c) + (((((this.f26800a * 31) + i10) * 31) + Arrays.hashCode(this.f26801b)) * 31)) * 31)) * 31) + i10) * 31;
    }
}
