package xr;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* loaded from: classes.dex */
public final class u extends w {

    /* renamed from: a, reason: collision with root package name */
    public final Field f25515a;

    public u(Field field) {
        br.l.e(field, "member");
        this.f25515a = field;
    }

    @Override // xr.w
    public final Member b() {
        return this.f25515a;
    }
}
