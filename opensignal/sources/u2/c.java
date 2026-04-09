package u2;

import br.l;
import cg.e;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f23142a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f23143b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f23142a = fArr;
        this.f23143b = fArr2;
    }

    @Override // u2.a
    public final float a(float f10) {
        return e.j(f10, this.f23143b, this.f23142a);
    }

    @Override // u2.a
    public final float b(float f10) {
        return e.j(f10, this.f23142a, this.f23143b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f23142a, cVar.f23142a) && Arrays.equals(this.f23143b, cVar.f23143b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23143b) + (Arrays.hashCode(this.f23142a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f23142a);
        l.d(string, "toString(...)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f23143b);
        l.d(string2, "toString(...)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
