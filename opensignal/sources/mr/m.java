package mr;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public abstract class m extends v {
    /* JADX WARN: Illegal instructions before constructor call */
    public m(Field field, boolean z10) {
        Type genericType = field.getGenericType();
        br.l.d(genericType, "field.genericType");
        super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // mr.g
    public Object s(Object[] objArr) {
        br.l.e(objArr, "args");
        c(objArr);
        return ((Field) this.f16976a).get(this.f16978c != null ? mq.l.m0(objArr) : null);
    }
}
