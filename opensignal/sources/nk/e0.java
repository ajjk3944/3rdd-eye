package nk;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18373a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f18374d;

    public /* synthetic */ e0(g0 g0Var, int i10) {
        this.f18373a = i10;
        this.f18374d = g0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f18373a) {
            case 0:
                this.f18374d.clear();
                break;
            default:
                this.f18374d.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        f0 f0VarA;
        Object obj2;
        Object value;
        switch (this.f18373a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                g0 g0Var = this.f18374d;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                f0 f0Var = null;
                if (key != null) {
                    try {
                        f0VarA = g0Var.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    f0VarA = null;
                }
                if (f0VarA != null && ((obj2 = f0VarA.D) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    f0Var = f0VarA;
                }
                return f0Var != null;
            default:
                return this.f18374d.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f18373a) {
            case 0:
                return new d0(this.f18374d, 0);
            default:
                return new d0(this.f18374d, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f0 f0VarA;
        Object obj2;
        Object value;
        switch (this.f18373a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    g0 g0Var = this.f18374d;
                    f0 f0Var = null;
                    if (key != null) {
                        try {
                            f0VarA = g0Var.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        f0VarA = null;
                    }
                    if (f0VarA != null && ((obj2 = f0VarA.D) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        f0Var = f0VarA;
                    }
                    if (f0Var != null) {
                        g0Var.c(f0Var, true);
                        break;
                    }
                }
                break;
            default:
                g0 g0Var2 = this.f18374d;
                f0 f0VarA2 = null;
                if (obj != null) {
                    try {
                        f0VarA2 = g0Var2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (f0VarA2 != null) {
                    g0Var2.c(f0VarA2, true);
                }
                if (f0VarA2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f18373a) {
        }
        return this.f18374d.f18390r;
    }
}
