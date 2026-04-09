package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21646b;

    public /* synthetic */ a(int i4) {
        this.f21646b = i4;
    }

    @Override // d0.c
    public final float a(float f10, float f11, float f12) {
        switch (this.f21646b) {
            case 0:
                c.f21679a.getClass();
                float f13 = f11 + f10;
                if ((f10 >= 0.0f && f13 <= f12) || (f10 < 0.0f && f13 > f12)) {
                    return 0.0f;
                }
                float f14 = f13 - f12;
                return Math.abs(f10) < Math.abs(f14) ? f10 : f14;
            default:
                float fAbs = Math.abs((f11 + f10) - f10);
                float f15 = (0.3f * f12) - (0.0f * fAbs);
                float f16 = f12 - f15;
                if ((fAbs <= f12) && f16 < fAbs) {
                    f15 = f12 - fAbs;
                }
                return f10 - f15;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // d0.c
    public final a0.l0 b() {
        switch (this.f21646b) {
        }
        c.f21679a.getClass();
        return b.f21671b;
    }
}
