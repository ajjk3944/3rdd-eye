package u5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f23359a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f23360b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23361c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23362d;

    public z(int i10, int i11, int i12, byte[] bArr) {
        this.f23359a = i10;
        this.f23360b = bArr;
        this.f23361c = i11;
        this.f23362d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.f23359a == zVar.f23359a && this.f23361c == zVar.f23361c && this.f23362d == zVar.f23362d && Arrays.equals(this.f23360b, zVar.f23360b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f23360b) + (this.f23359a * 31)) * 31) + this.f23361c) * 31) + this.f23362d;
    }
}
