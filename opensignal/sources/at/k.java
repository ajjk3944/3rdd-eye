package at;

import rr.m0;
import ur.k0;

/* loaded from: classes.dex */
public final class k extends br.n implements ar.k {

    /* renamed from: g, reason: collision with root package name */
    public static final k f2297g;

    /* renamed from: r, reason: collision with root package name */
    public static final k f2298r;

    /* renamed from: x, reason: collision with root package name */
    public static final k f2299x;

    /* renamed from: y, reason: collision with root package name */
    public static final k f2300y;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2301d;

    static {
        int i10 = 1;
        f2297g = new k(i10, 0);
        f2298r = new k(i10, 1);
        f2299x = new k(i10, 2);
        f2300y = new k(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        super(i10);
        this.f2301d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f2301d) {
            case 0:
                br.l.e((qs.g) obj, "it");
                return Boolean.TRUE;
            case 1:
                rr.b bVar = (rr.b) obj;
                br.l.e(bVar, "$this$selectMostSpecificInEachOverridableGroup");
                return bVar;
            case 2:
                k0 k0Var = (k0) obj;
                br.l.e(k0Var, "$this$selectMostSpecificInEachOverridableGroup");
                return k0Var;
            default:
                m0 m0Var = (m0) obj;
                br.l.e(m0Var, "$this$selectMostSpecificInEachOverridableGroup");
                return m0Var;
        }
    }
}
