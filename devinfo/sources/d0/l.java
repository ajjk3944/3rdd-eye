package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ va.o f21774a;

    public l(va.o oVar) {
        this.f21774a = oVar;
    }

    @Override // d0.f1
    public final float a(float f10) {
        if (Float.isNaN(f10)) {
            return 0.0f;
        }
        va.o oVar = this.f21774a;
        float fFloatValue = ((Number) ((b7.u) oVar.f36146b).invoke(Float.valueOf(f10))).floatValue();
        ((u0.d1) oVar.f36150f).setValue(Boolean.valueOf(fFloatValue > 0.0f));
        ((u0.d1) oVar.g).setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
