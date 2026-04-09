package lr;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class k extends t1 {

    /* renamed from: d, reason: collision with root package name */
    public final Field f15630d;

    public k(Field field) {
        br.l.e(field, "field");
        this.f15630d = field;
    }

    @Override // lr.t1
    public final String i() {
        StringBuilder sb2 = new StringBuilder();
        Field field = this.f15630d;
        String name = field.getName();
        br.l.d(name, "field.name");
        sb2.append(as.z.a(name));
        sb2.append("()");
        Class<?> type = field.getType();
        br.l.d(type, "field.type");
        sb2.append(xr.d.b(type));
        return sb2.toString();
    }
}
