package c0;

import java.util.List;
import x1.l0;
import x1.m0;

/* loaded from: classes.dex */
public final class e implements v1.r {

    /* renamed from: b, reason: collision with root package name */
    public static final e f3068b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f3069c = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3070a;

    public /* synthetic */ e(int i10) {
        this.f3070a = i10;
    }

    @Override // v1.r
    public final l0 a(m0 m0Var, List list, long j) {
        switch (this.f3070a) {
            case 0:
                return m0Var.g0(t2.a.j(j), t2.a.i(j), mq.x.f16946a, new lu.u(13));
            default:
                return m0Var.g0(t2.a.f(j) ? t2.a.h(j) : 0, t2.a.e(j) ? t2.a.g(j) : 0, mq.x.f16946a, new lu.u(13));
        }
    }
}
