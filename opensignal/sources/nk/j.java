package nk;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class j extends p0 {
    public final /* synthetic */ Method k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class f18405l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f18406m;

    public j(Method method, Class cls, int i10) {
        this.k = method;
        this.f18405l = cls;
        this.f18406m = i10;
    }

    @Override // nk.p0
    public final Object e() {
        return this.k.invoke(null, this.f18405l, Integer.valueOf(this.f18406m));
    }

    public final String toString() {
        return this.f18405l.getName();
    }
}
