package mr;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class u extends q {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16975g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Method method, boolean z10, int i10, int i11) {
        super(method, z10, i10);
        this.f16975g = i11;
    }

    @Override // mr.q, mr.g
    public final Object s(Object[] objArr) {
        switch (this.f16975g) {
            case 0:
                br.l.e(objArr, "args");
                io.sentry.config.a.F(this, objArr);
                return e(objArr[0], objArr.length <= 1 ? new Object[0] : mq.l.h0(objArr, 1, objArr.length));
            case 1:
                br.l.e(objArr, "args");
                io.sentry.config.a.F(this, objArr);
                d(mq.l.n0(objArr));
                return e(null, objArr.length <= 1 ? new Object[0] : mq.l.h0(objArr, 1, objArr.length));
            default:
                br.l.e(objArr, "args");
                io.sentry.config.a.F(this, objArr);
                return e(null, objArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Method method) {
        super(method, false, 6);
        this.f16975g = 0;
        br.l.e(method, "method");
    }
}
