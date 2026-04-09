package j4;

import java.lang.reflect.Field;
import l4.AbstractC2649c;
import o4.C2762a;

/* renamed from: j4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2586s extends r {

    /* renamed from: b, reason: collision with root package name */
    public final i4.p f21449b;

    public C2586s(i4.p pVar, C2587t c2587t) {
        super(c2587t);
        this.f21449b = pVar;
    }

    @Override // j4.r
    public final Object d() {
        return this.f21449b.d();
    }

    @Override // j4.r
    public final void f(Object obj, C2762a c2762a, C2585q c2585q) throws IllegalAccessException, IllegalArgumentException {
        Field field = c2585q.f21441b;
        Object objB = c2585q.f21445f.b(c2762a);
        if (objB == null && c2585q.f21446g) {
            return;
        }
        if (c2585q.f21447h) {
            throw new g4.p(A.f.l("Cannot set value of 'static final' ", AbstractC2649c.d(field, false)));
        }
        field.set(obj, objB);
    }

    @Override // j4.r
    public final Object e(Object obj) {
        return obj;
    }
}
