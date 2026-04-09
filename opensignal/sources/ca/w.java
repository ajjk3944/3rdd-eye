package ca;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f3513a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3514b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3515c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3516d;

    public w(int i10, int i11, int i12, byte[] bArr) {
        this.f3513a = i10;
        this.f3514b = bArr;
        this.f3515c = i11;
        this.f3516d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f3513a == wVar.f3513a && this.f3515c == wVar.f3515c && this.f3516d == wVar.f3516d && Arrays.equals(this.f3514b, wVar.f3514b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f3514b) + (this.f3513a * 31)) * 31) + this.f3515c) * 31) + this.f3516d;
    }
}
