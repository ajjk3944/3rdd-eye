package h9;

/* loaded from: classes.dex */
public final class l0 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final float f10399a;

    /* renamed from: d, reason: collision with root package name */
    public final f2 f10400d;

    public l0(float f10, f2 f2Var) {
        this.f10399a = f10;
        this.f10400d = f2Var;
    }

    public final float a(r2 r2Var) {
        float fSqrt;
        if (this.f10400d != f2.percent) {
            return d(r2Var);
        }
        p2 p2Var = (p2) r2Var.f10472g;
        f1.a aVar = p2Var.f10455g;
        if (aVar == null) {
            aVar = p2Var.f10454f;
        }
        float f10 = this.f10399a;
        if (aVar == null) {
            return f10;
        }
        float f11 = aVar.f8400d;
        if (f11 == aVar.f8401e) {
            fSqrt = f10 * f11;
        } else {
            fSqrt = f10 * ((float) (Math.sqrt((r0 * r0) + (f11 * f11)) / 1.414213562373095d));
        }
        return fSqrt / 100.0f;
    }

    public final float b(r2 r2Var, float f10) {
        return this.f10400d == f2.percent ? (this.f10399a * f10) / 100.0f : d(r2Var);
    }

    public final float c() {
        float f10;
        float f11;
        int i10 = y.f10515a[this.f10400d.ordinal()];
        float f12 = this.f10399a;
        if (i10 == 1) {
            return f12;
        }
        switch (i10) {
            case 4:
                return f12 * 96.0f;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                f10 = f12 * 96.0f;
                f11 = 2.54f;
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                f10 = f12 * 96.0f;
                f11 = 25.4f;
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                f10 = f12 * 96.0f;
                f11 = 72.0f;
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                f10 = f12 * 96.0f;
                f11 = 6.0f;
                break;
            default:
                return f12;
        }
        return f10 / f11;
    }

    public final float d(r2 r2Var) {
        float textSize;
        int i10 = y.f10515a[this.f10400d.ordinal()];
        float f10 = this.f10399a;
        switch (i10) {
            case 2:
                textSize = ((p2) r2Var.f10472g).f10452d.getTextSize();
                break;
            case 3:
                textSize = ((p2) r2Var.f10472g).f10452d.getTextSize() / 2.0f;
                break;
            case 4:
                r2Var.getClass();
                return f10 * 96.0f;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                r2Var.getClass();
                return (f10 * 96.0f) / 2.54f;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                r2Var.getClass();
                return (f10 * 96.0f) / 25.4f;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                r2Var.getClass();
                return (f10 * 96.0f) / 72.0f;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                r2Var.getClass();
                return (f10 * 96.0f) / 6.0f;
            case 9:
                p2 p2Var = (p2) r2Var.f10472g;
                f1.a aVar = p2Var.f10455g;
                if (aVar == null) {
                    aVar = p2Var.f10454f;
                }
                if (aVar != null) {
                    return (f10 * aVar.f8400d) / 100.0f;
                }
            default:
                return f10;
        }
        return textSize * f10;
    }

    public final float e(r2 r2Var) {
        if (this.f10400d != f2.percent) {
            return d(r2Var);
        }
        p2 p2Var = (p2) r2Var.f10472g;
        f1.a aVar = p2Var.f10455g;
        if (aVar == null) {
            aVar = p2Var.f10454f;
        }
        float f10 = this.f10399a;
        return aVar == null ? f10 : (f10 * aVar.f8401e) / 100.0f;
    }

    public final boolean f() {
        return this.f10399a < 0.0f;
    }

    public final boolean g() {
        return this.f10399a == 0.0f;
    }

    public final String toString() {
        return String.valueOf(this.f10399a) + this.f10400d;
    }

    public l0(float f10) {
        this.f10399a = f10;
        this.f10400d = f2.px;
    }
}
