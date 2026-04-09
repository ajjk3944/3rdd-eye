package y1;

import android.content.Context;

/* loaded from: classes.dex */
public final class n extends br.n implements ar.k {

    /* renamed from: g, reason: collision with root package name */
    public static final n f25745g;

    /* renamed from: r, reason: collision with root package name */
    public static final n f25746r;

    /* renamed from: x, reason: collision with root package name */
    public static final n f25747x;

    /* renamed from: y, reason: collision with root package name */
    public static final n f25748y;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25749d;

    static {
        int i10 = 1;
        f25745g = new n(i10, 0);
        f25746r = new n(i10, 1);
        f25747x = new n(i10, 2);
        f25748y = new n(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10, int i11) {
        super(i10);
        this.f25749d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f25749d) {
            case 0:
                return lq.b0.f15562a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            default:
                n0.f1 f1Var = (n0.f1) obj;
                n0.a0 a0Var = l0.f25734a;
                f1Var.getClass();
                n0.w.j(f1Var, a0Var);
                return ((Context) n0.w.j(f1Var, l0.f25735b)).getResources();
        }
    }
}
