package rr;

import java.util.List;

/* loaded from: classes.dex */
public final class s extends br.n implements ar.k {

    /* renamed from: g, reason: collision with root package name */
    public static final s f21714g;

    /* renamed from: r, reason: collision with root package name */
    public static final s f21715r;

    /* renamed from: x, reason: collision with root package name */
    public static final s f21716x;

    /* renamed from: y, reason: collision with root package name */
    public static final s f21717y;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21718d;

    static {
        int i10 = 1;
        f21714g = new s(i10, 0);
        f21715r = new s(i10, 1);
        f21716x = new s(i10, 2);
        f21717y = new s(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i10, int i11) {
        super(i10);
        this.f21718d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f21718d) {
            case 0:
                br.l.e((qs.b) obj, "it");
                return 0;
            case 1:
                f0 f0Var = (f0) obj;
                br.l.e(f0Var, "it");
                return ((ur.c0) f0Var).f23629y;
            case 2:
                br.l.e((l) obj, "it");
                return Boolean.valueOf(!(r2 instanceof k));
            default:
                l lVar = (l) obj;
                br.l.e(lVar, "it");
                List typeParameters = ((b) lVar).getTypeParameters();
                br.l.d(typeParameters, "it as CallableDescriptor).typeParameters");
                return mq.o.j0(typeParameters);
        }
    }
}
