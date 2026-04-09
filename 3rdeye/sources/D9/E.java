package D9;

import g0.C4356c;

/* compiled from: SharedFlow.kt */
/* loaded from: classes3.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public static final F9.y f1151a = new F9.y("NO_VALUE");

    /* renamed from: b, reason: collision with root package name */
    public static final F9.y f1152b = new F9.y("NONE");

    /* renamed from: c, reason: collision with root package name */
    public static final F9.y f1153c = new F9.y("PENDING");

    public static final C a(int i, C9.a aVar) {
        if (i < 0) {
            throw new IllegalArgumentException(C4356c.h(i, "replay cannot be negative, but was ").toString());
        }
        if (i > 0 || aVar == C9.a.SUSPEND) {
            return new C(i, i < 0 ? Integer.MAX_VALUE : i, aVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
    }

    public static final J c(Object obj) {
        if (obj == null) {
            obj = E9.c.f1489b;
        }
        return new J(obj);
    }

    public static final void d(Object[] objArr, long j4, Object obj) {
        objArr[((int) j4) & (objArr.length - 1)] = obj;
    }
}
