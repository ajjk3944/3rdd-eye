package nk;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class i extends p0 {
    public final /* synthetic */ Method k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f18399l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Class f18400m;

    public i(Method method, Object obj, Class cls) {
        this.k = method;
        this.f18399l = obj;
        this.f18400m = cls;
    }

    @Override // nk.p0
    public final Object e() {
        return this.k.invoke(this.f18399l, this.f18400m);
    }

    public final String toString() {
        return this.f18400m.getName();
    }
}
