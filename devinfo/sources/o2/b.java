package o2;

import d3.j;
import nk.l;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends l implements mk.c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f30384b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f30385c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f30386d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30387a;

    static {
        int i4 = 1;
        f30384b = new b(i4, 0);
        f30385c = new b(i4, 1);
        f30386d = new b(i4, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i4, int i10) {
        super(i4);
        this.f30387a = i10;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f30387a) {
            case 0:
                ((Number) obj).longValue();
                return u.f37649a;
            case 1:
                return Integer.valueOf(((i) obj).f30403b);
            default:
                j jVar = ((i) obj).f30404c;
                return Integer.valueOf(jVar.f21964d - jVar.f21962b);
        }
    }
}
