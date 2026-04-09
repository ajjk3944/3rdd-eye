package w2;

import nk.l;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends l implements mk.c {

    /* renamed from: b, reason: collision with root package name */
    public static final e f36424b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f36425c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36426a;

    static {
        int i4 = 1;
        f36424b = new e(i4, 0);
        f36425c = new e(i4, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i4, int i10) {
        super(i4);
        this.f36426a = i10;
    }

    @Override // mk.c
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f36426a) {
            case 0:
                return u.f37649a;
            default:
                throw null;
        }
    }
}
