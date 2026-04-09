package m1;

import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class e extends br.n implements ar.a {

    /* renamed from: g, reason: collision with root package name */
    public static final e f16169g;

    /* renamed from: r, reason: collision with root package name */
    public static final e f16170r;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16171d;

    static {
        int i10 = 0;
        f16169g = new e(i10, 0);
        f16170r = new e(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        super(i10);
        this.f16171d = i11;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f16171d) {
            case 0:
                return new g1.j(new PathMeasure());
            default:
                return lq.b0.f15562a;
        }
    }
}
