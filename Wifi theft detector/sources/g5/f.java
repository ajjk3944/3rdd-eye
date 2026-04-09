package g5;

/* loaded from: classes2.dex */
public class f extends e {

    /* renamed from: a, reason: collision with root package name */
    public float f21193a = -1.0f;

    @Override // g5.e
    public void a(com.google.android.material.shape.c cVar, float f10, float f11, float f12) {
        float f13 = f12 * f11;
        cVar.o(0.0f, f13, 180.0f, 180.0f - f10);
        double d10 = f13;
        cVar.m((float) (Math.sin(Math.toRadians(f10)) * d10), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10));
    }
}
