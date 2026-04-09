package i2;

import java.util.Comparator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j1 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f25696b = new j1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25697a;

    public /* synthetic */ j1(int i4) {
        this.f25697a = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f25697a) {
            case 0:
                e0 e0Var = (e0) obj;
                e0 e0Var2 = (e0) obj2;
                int iF = nk.k.f(e0Var2.f25641q, e0Var.f25641q);
                return iF != 0 ? iF : nk.k.f(e0Var.hashCode(), e0Var2.hashCode());
            default:
                e0 e0Var3 = (e0) obj;
                e0 e0Var4 = (e0) obj2;
                int iF2 = nk.k.f(e0Var3.f25641q, e0Var4.f25641q);
                return iF2 != 0 ? iF2 : nk.k.f(e0Var3.hashCode(), e0Var4.hashCode());
        }
    }
}
