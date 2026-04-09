package f1;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5493b extends androidx.constraintlayout.core.parser.b {

    /* renamed from: f, reason: collision with root package name */
    float f46665f;

    public C5493b(float f10) {
        super(null);
        this.f46665f = f10;
    }

    @Override // androidx.constraintlayout.core.parser.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5493b)) {
            return false;
        }
        float f10 = f();
        float f11 = ((C5493b) obj).f();
        return (Float.isNaN(f10) && Float.isNaN(f11)) || f10 == f11;
    }

    @Override // androidx.constraintlayout.core.parser.b
    public float f() {
        if (Float.isNaN(this.f46665f) && o()) {
            this.f46665f = Float.parseFloat(e());
        }
        return this.f46665f;
    }

    @Override // androidx.constraintlayout.core.parser.b
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f10 = this.f46665f;
        return iHashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }

    @Override // androidx.constraintlayout.core.parser.b
    public int i() {
        if (Float.isNaN(this.f46665f) && o()) {
            this.f46665f = Integer.parseInt(e());
        }
        return (int) this.f46665f;
    }
}
