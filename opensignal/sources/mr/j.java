package mr;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class j extends m implements f {

    /* renamed from: e, reason: collision with root package name */
    public final Object f16967e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Field field, Object obj) {
        super(field, false);
        br.l.e(field, "field");
        this.f16967e = obj;
    }

    @Override // mr.m, mr.g
    public final Object s(Object[] objArr) {
        br.l.e(objArr, "args");
        io.sentry.config.a.F(this, objArr);
        return ((Field) this.f16976a).get(this.f16967e);
    }
}
