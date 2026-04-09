package g0;

import g2.r0;
import g2.s0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24100a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f24102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24103d;

    public /* synthetic */ b0(int i4, s0 s0Var, int i10) {
        this.f24101b = i4;
        this.f24102c = s0Var;
        this.f24103d = i10;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f24100a) {
            case 0:
                r0.g((r0) obj, this.f24102c, this.f24101b, this.f24103d);
                break;
            default:
                r0.g((r0) obj, this.f24102c, pk.a.s((this.f24101b - r0.f24408a) / 2.0f), pk.a.s((this.f24103d - r0.f24409b) / 2.0f));
                break;
        }
        return yj.u.f37649a;
    }

    public /* synthetic */ b0(s0 s0Var, int i4, int i10) {
        this.f24102c = s0Var;
        this.f24101b = i4;
        this.f24103d = i10;
    }
}
