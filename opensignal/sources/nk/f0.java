package nk;

import java.util.Map;

/* loaded from: classes.dex */
public final class f0 implements Map.Entry {
    public final int B;
    public Object D;
    public int E;

    /* renamed from: a, reason: collision with root package name */
    public f0 f18376a;

    /* renamed from: d, reason: collision with root package name */
    public f0 f18377d;

    /* renamed from: g, reason: collision with root package name */
    public f0 f18378g;

    /* renamed from: r, reason: collision with root package name */
    public f0 f18379r;

    /* renamed from: x, reason: collision with root package name */
    public f0 f18380x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f18381y;

    public f0() {
        this.f18381y = null;
        this.B = -1;
        this.f18380x = this;
        this.f18379r = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f18381y;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.D;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18381y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.D;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f18381y;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.D;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.D;
        this.D = obj;
        return obj2;
    }

    public final String toString() {
        return this.f18381y + "=" + this.D;
    }

    public f0(f0 f0Var, Object obj, int i10, f0 f0Var2, f0 f0Var3) {
        this.f18376a = f0Var;
        this.f18381y = obj;
        this.B = i10;
        this.E = 1;
        this.f18379r = f0Var2;
        this.f18380x = f0Var3;
        f0Var3.f18379r = this;
        f0Var2.f18380x = this;
    }
}
