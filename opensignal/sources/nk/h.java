package nk;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class h extends p0 {
    public final /* synthetic */ int k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class f18393l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AccessibleObject f18394m;

    public h(Constructor constructor, Class cls) {
        this.f18394m = constructor;
        this.f18393l = cls;
    }

    @Override // nk.p0
    public final Object e() {
        switch (this.k) {
            case 0:
                return ((Constructor) this.f18394m).newInstance(null);
            default:
                return ((Method) this.f18394m).invoke(null, this.f18393l, Object.class);
        }
    }

    public final String toString() {
        switch (this.k) {
        }
        return this.f18393l.getName();
    }

    public h(Method method, Class cls) {
        this.f18394m = method;
        this.f18393l = cls;
    }
}
