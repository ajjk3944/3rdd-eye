package j2;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m extends nk.l implements mk.c {

    /* renamed from: b, reason: collision with root package name */
    public static final m f27226b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f27227c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f27228d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f27229e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27230a;

    static {
        int i4 = 1;
        f27226b = new m(i4, 0);
        f27227c = new m(i4, 1);
        f27228d = new m(i4, 2);
        f27229e = new m(i4, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i4, int i10) {
        super(i4);
        this.f27230a = i10;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f27230a) {
            case 0:
                return Boolean.TRUE;
            case 1:
                p2.l lVarK = ((p2.p) obj).k();
                return Boolean.valueOf(lVarK.f31095a.c(p2.t.f31136y));
            case 2:
                u0.a0 a0Var = h0.f27169a;
                c1.l lVar = (c1.l) ((u0.i1) obj);
                lVar.getClass();
                u0.q.s(lVar, a0Var);
                return ((Context) u0.q.s(lVar, h0.f27170b)).getResources();
            default:
                return Boolean.valueOf(d0.f(obj));
        }
    }
}
