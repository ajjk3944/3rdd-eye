package mr;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class y extends z {
    @Override // mr.g
    public final Object s(Object[] objArr) {
        br.l.e(objArr, "args");
        io.sentry.config.a.F(this, objArr);
        Object obj = objArr[0];
        Object[] objArrH0 = objArr.length <= 1 ? new Object[0] : mq.l.h0(objArr, 1, objArr.length);
        return this.f16984a.invoke(obj, Arrays.copyOf(objArrH0, objArrH0.length));
    }
}
