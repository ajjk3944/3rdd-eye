package Z0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class c implements Z0.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f25077c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f25078d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final float[] f25079a;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f25080b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(float f10, float[] fArr, float[] fArr2) {
            float f11;
            float f12;
            float f13;
            float fA;
            float fAbs = Math.abs(f10);
            float fSignum = Math.signum(f10);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fA = fArr2[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                int i11 = i10 - 1;
                float f14 = 0.0f;
                if (i11 >= fArr.length - 1) {
                    float f15 = fArr[fArr.length - 1];
                    float f16 = fArr2[fArr.length - 1];
                    if (f15 == 0.0f) {
                        return 0.0f;
                    }
                    return f10 * (f16 / f15);
                }
                if (i11 == -1) {
                    float f17 = fArr[0];
                    f13 = fArr2[0];
                    f12 = f17;
                    f11 = 0.0f;
                } else {
                    float f18 = fArr[i11];
                    float f19 = fArr[i10];
                    f11 = fArr2[i11];
                    f14 = f18;
                    f12 = f19;
                    f13 = fArr2[i10];
                }
                fA = d.f25081a.a(f11, f13, f14, f12, fAbs);
            }
            return fSignum * fA;
        }

        private a() {
        }
    }

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f25079a = fArr;
        this.f25080b = fArr2;
    }

    @Override // Z0.a
    public float a(float f10) {
        return f25077c.b(f10, this.f25080b, this.f25079a);
    }

    @Override // Z0.a
    public float b(float f10) {
        return f25077c.b(f10, this.f25079a, this.f25080b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f25079a, cVar.f25079a) && Arrays.equals(this.f25080b, cVar.f25080b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f25079a) * 31) + Arrays.hashCode(this.f25080b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f25079a);
        AbstractC6492s.h(string, "toString(this)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f25080b);
        AbstractC6492s.h(string2, "toString(this)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
