package m0;

import android.graphics.BlendModeColorFilter;

/* renamed from: m0.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6709j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C6709j0 f52919a = new C6709j0();

    private C6709j0() {
    }

    public final BlendModeColorFilter a(long j10, int i10) {
        AbstractC6707i0.a();
        return AbstractC6705h0.a(AbstractC6737x0.j(j10), AbstractC6666F.a(i10));
    }

    public final C6699e0 b(BlendModeColorFilter blendModeColorFilter) {
        return new C6699e0(AbstractC6737x0.b(blendModeColorFilter.getColor()), AbstractC6666F.b(blendModeColorFilter.getMode()), blendModeColorFilter, null);
    }
}
