package f4;

/* renamed from: f4.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5525e extends AbstractC5524d {

    /* renamed from: a, reason: collision with root package name */
    float f46992a = -1.0f;

    @Override // f4.AbstractC5524d
    public void a(C5533m c5533m, float f10, float f11, float f12) {
        c5533m.o(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        double d10 = f12;
        double d11 = f11;
        c5533m.m((float) (Math.sin(Math.toRadians(f10)) * d10 * d11), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10 * d11));
    }
}
