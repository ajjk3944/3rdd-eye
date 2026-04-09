package v1;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends nk.l implements mk.a {

    /* renamed from: b, reason: collision with root package name */
    public static final f f35665b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f35666c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35667a;

    static {
        int i4 = 0;
        f35665b = new f(i4, 0);
        f35666c = new f(i4, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i4, int i10) {
        super(i4);
        this.f35667a = i10;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f35667a) {
            case 0:
                return new p1.k(new PathMeasure());
            default:
                return yj.u.f37649a;
        }
    }
}
