package H1;

import u.C2936e;
import u.C2940i;

/* loaded from: classes.dex */
public final class c extends C2936e {

    /* renamed from: g, reason: collision with root package name */
    public int f1756g;

    @Override // u.C2940i, java.util.Map
    public final void clear() {
        this.f1756g = 0;
        super.clear();
    }

    @Override // u.C2940i
    public final void g(C2940i c2940i) {
        this.f1756g = 0;
        super.g(c2940i);
    }

    @Override // u.C2940i
    public final Object h(int i) {
        this.f1756g = 0;
        return super.h(i);
    }

    @Override // u.C2940i, java.util.Map
    public final int hashCode() {
        if (this.f1756g == 0) {
            this.f1756g = super.hashCode();
        }
        return this.f1756g;
    }

    @Override // u.C2940i
    public final Object i(int i, Object obj) {
        this.f1756g = 0;
        return super.i(i, obj);
    }

    @Override // u.C2940i, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f1756g = 0;
        return super.put(obj, obj2);
    }
}
