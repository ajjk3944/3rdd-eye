package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dm3 extends AbstractCollection {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ dm3(int i, Serializable serializable) {
        this.f = i;
        this.g = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f) {
            case 0:
                ((pn3) this.g).e();
                break;
            case 1:
                ((lm3) this.g).clear();
                break;
            default:
                ((ul3) this.g).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f) {
            case 0:
                return ((pn3) this.g).c(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((ul3) this.g).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f) {
            case 2:
                return ((ul3) this.g).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f) {
            case 0:
                pn3 pn3Var = (pn3) this.g;
                pn3Var.getClass();
                return new rl3(pn3Var);
            case 1:
                lm3 lm3Var = (lm3) this.g;
                Map mapE = lm3Var.e();
                return mapE != null ? mapE.values().iterator() : new im3(lm3Var, 2);
            default:
                return new on3(((ul3) this.g).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    ul3 ul3Var = (ul3) this.g;
                    for (Map.Entry entry : ul3Var.entrySet()) {
                        if (Objects.equals(obj, entry.getValue())) {
                            ul3Var.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f) {
            case 2:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    ul3 ul3Var = (ul3) this.g;
                    for (Map.Entry entry : ul3Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ul3Var.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f) {
            case 2:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    ul3 ul3Var = (ul3) this.g;
                    for (Map.Entry entry : ul3Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ul3Var.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f) {
            case 0:
                return ((pn3) this.g).j;
            case 1:
                return ((lm3) this.g).size();
            default:
                return ((ul3) this.g).h.size();
        }
    }

    public dm3(ul3 ul3Var) {
        this.f = 2;
        this.g = ul3Var;
    }
}
