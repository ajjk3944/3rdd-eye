package x1;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class j1 implements Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final j1 f24868d = new j1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24869a;

    public /* synthetic */ j1(int i10) {
        this.f24869a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f24869a) {
            case 0:
                f0 f0Var = (f0) obj;
                f0 f0Var2 = (f0) obj2;
                int iG = br.l.g(f0Var2.f24809o, f0Var.f24809o);
                return iG != 0 ? iG : br.l.g(f0Var.hashCode(), f0Var2.hashCode());
            default:
                f0 f0Var3 = (f0) obj;
                f0 f0Var4 = (f0) obj2;
                int iG2 = br.l.g(f0Var3.f24809o, f0Var4.f24809o);
                return iG2 != 0 ? iG2 : br.l.g(f0Var3.hashCode(), f0Var4.hashCode());
        }
    }
}
