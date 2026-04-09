package g3;

import androidx.lifecycle.a0;
import i2.e0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l extends nk.l implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public static final l f24503b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f24504c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f24505d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f24506e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f24507f;
    public static final l g;

    /* renamed from: h, reason: collision with root package name */
    public static final l f24508h;

    /* renamed from: i, reason: collision with root package name */
    public static final l f24509i;
    public static final l j;

    /* renamed from: k, reason: collision with root package name */
    public static final l f24510k;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24511a;

    static {
        int i4 = 2;
        f24503b = new l(i4, 0);
        f24504c = new l(i4, 1);
        f24505d = new l(i4, 2);
        f24506e = new l(i4, 3);
        f24507f = new l(i4, 4);
        g = new l(i4, 5);
        f24508h = new l(i4, 6);
        f24509i = new l(i4, 7);
        j = new l(i4, 8);
        f24510k = new l(i4, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i4, int i10) {
        super(i4);
        this.f24511a = i10;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        int i4;
        switch (this.f24511a) {
            case 0:
                k.d((e0) obj).setResetBlock((mk.c) obj2);
                return yj.u.f37649a;
            case 1:
                k.d((e0) obj).setUpdateBlock((mk.c) obj2);
                return yj.u.f37649a;
            case 2:
                k.d((e0) obj).setReleaseBlock((mk.c) obj2);
                return yj.u.f37649a;
            case 3:
                k.d((e0) obj).setUpdateBlock((mk.c) obj2);
                return yj.u.f37649a;
            case 4:
                k.d((e0) obj).setReleaseBlock((mk.c) obj2);
                return yj.u.f37649a;
            case 5:
                k.d((e0) obj).setModifier((i1.n) obj2);
                return yj.u.f37649a;
            case 6:
                k.d((e0) obj).setDensity((d3.c) obj2);
                return yj.u.f37649a;
            case 7:
                k.d((e0) obj).setLifecycleOwner((a0) obj2);
                return yj.u.f37649a;
            case 8:
                k.d((e0) obj).setSavedStateRegistryOwner((a6.f) obj2);
                return yj.u.f37649a;
            default:
                x xVarD = k.d((e0) obj);
                int iOrdinal = ((d3.l) obj2).ordinal();
                if (iOrdinal != 0) {
                    i4 = 1;
                    if (iOrdinal != 1) {
                        throw new ac.m();
                    }
                } else {
                    i4 = 0;
                }
                xVarD.setLayoutDirection(i4);
                return yj.u.f37649a;
        }
    }
}
