package g5;

/* loaded from: classes2.dex */
public class j extends e {

    /* renamed from: a, reason: collision with root package name */
    public float f21195a = -1.0f;

    @Override // g5.e
    public void a(com.google.android.material.shape.c cVar, float f10, float f11, float f12) {
        float f13 = f12 * f11;
        cVar.o(0.0f, f13, 180.0f, 180.0f - f10);
        float f14 = f13 * 2.0f;
        cVar.a(0.0f, 0.0f, f14, f14, 180.0f, f10);
    }
}
