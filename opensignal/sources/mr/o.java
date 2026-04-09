package mr;

import java.lang.reflect.Field;
import lq.b0;

/* loaded from: classes.dex */
public final class o extends q implements f {
    @Override // mr.q, mr.g
    public final Object s(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        br.l.e(objArr, "args");
        c(objArr);
        ((Field) this.f16976a).set(null, mq.l.v0(objArr));
        return b0.f15562a;
    }
}
