package mr;

import java.lang.reflect.Field;
import lq.b0;

/* loaded from: classes.dex */
public final class n extends q implements f {

    /* renamed from: g, reason: collision with root package name */
    public final Object f16969g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Field field, boolean z10, Object obj) {
        super(field, z10, false);
        br.l.e(field, "field");
        this.f16969g = obj;
    }

    @Override // mr.q, mr.g
    public final Object s(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        br.l.e(objArr, "args");
        c(objArr);
        ((Field) this.f16976a).set(this.f16969g, mq.l.m0(objArr));
        return b0.f15562a;
    }
}
