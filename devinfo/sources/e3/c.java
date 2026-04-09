package e3;

import ed.f;
import java.util.Arrays;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f22297a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f22298b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f22297a = fArr;
        this.f22298b = fArr2;
    }

    @Override // e3.a
    public final float a(float f10) {
        return f.k(f10, this.f22298b, this.f22297a);
    }

    @Override // e3.a
    public final float b(float f10) {
        return f.k(f10, this.f22297a, this.f22298b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f22297a, cVar.f22297a) && Arrays.equals(this.f22298b, cVar.f22298b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22298b) + (Arrays.hashCode(this.f22297a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f22297a);
        k.d(string, "toString(...)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f22298b);
        k.d(string2, "toString(...)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
