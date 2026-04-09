package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i44 extends AbstractSet {
    public final /* synthetic */ int f;
    public final /* synthetic */ k44 g;

    public /* synthetic */ i44(k44 k44Var, int i) {
        this.f = i;
        this.g = k44Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f) {
            case 0:
                this.g.clear();
                break;
            default:
                this.g.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        j44 j44VarA;
        switch (this.f) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                k44 k44Var = this.g;
                k44Var.getClass();
                Object key = entry.getKey();
                j44 j44Var = null;
                if (key != null) {
                    try {
                        j44VarA = k44Var.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    j44VarA = null;
                }
                if (j44VarA != null && Objects.equals(j44VarA.l, entry.getValue())) {
                    j44Var = j44VarA;
                }
                return j44Var != null;
            default:
                return this.g.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f) {
            case 0:
                return new h44(this.g, 0);
            default:
                return new h44(this.g, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        j44 j44VarA;
        switch (this.f) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    k44 k44Var = this.g;
                    k44Var.getClass();
                    Object key = entry.getKey();
                    j44 j44Var = null;
                    if (key != null) {
                        try {
                            j44VarA = k44Var.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        j44VarA = null;
                    }
                    if (j44VarA != null && Objects.equals(j44VarA.l, entry.getValue())) {
                        j44Var = j44VarA;
                    }
                    if (j44Var != null) {
                        k44Var.b(j44Var, true);
                        break;
                    }
                }
                break;
            default:
                k44 k44Var2 = this.g;
                k44Var2.getClass();
                j44 j44VarA2 = null;
                if (obj != null) {
                    try {
                        j44VarA2 = k44Var2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (j44VarA2 != null) {
                    k44Var2.b(j44VarA2, true);
                }
                if (j44VarA2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f) {
        }
        return this.g.h;
    }
}
