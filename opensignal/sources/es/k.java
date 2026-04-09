package es;

import java.lang.reflect.Modifier;
import ur.k0;

/* loaded from: classes.dex */
public final class k extends br.n implements ar.k {
    public static final k B;

    /* renamed from: g, reason: collision with root package name */
    public static final k f8309g;

    /* renamed from: r, reason: collision with root package name */
    public static final k f8310r;

    /* renamed from: x, reason: collision with root package name */
    public static final k f8311x;

    /* renamed from: y, reason: collision with root package name */
    public static final k f8312y;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8313d;

    static {
        int i10 = 1;
        f8309g = new k(i10, 0);
        f8310r = new k(i10, 1);
        f8311x = new k(i10, 2);
        f8312y = new k(i10, 3);
        B = new k(i10, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        super(i10);
        this.f8313d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f8313d) {
            case 0:
                br.l.e((xr.w) obj, "it");
                return Boolean.valueOf(!Modifier.isStatic(r2.b().getModifiers()));
            case 1:
                k0 k0Var = (k0) obj;
                br.l.e(k0Var, "$this$selectMostSpecificInEachOverridableGroup");
                return k0Var;
            case 2:
                xr.w wVar = (xr.w) obj;
                br.l.e(wVar, "it");
                return Boolean.valueOf(Modifier.isStatic(wVar.b().getModifiers()));
            case 3:
                at.n nVar = (at.n) obj;
                br.l.e(nVar, "it");
                return nVar.g();
            default:
                rr.i iVarP = ((ht.x) obj).Z().p();
                if (iVarP instanceof rr.f) {
                    return (rr.f) iVarP;
                }
                return null;
        }
    }
}
