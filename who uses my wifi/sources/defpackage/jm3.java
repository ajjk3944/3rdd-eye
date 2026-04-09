package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jm3 extends AbstractSet {
    public final /* synthetic */ int f;
    public final /* synthetic */ lm3 g;

    public /* synthetic */ jm3(lm3 lm3Var, int i) {
        this.f = i;
        this.g = lm3Var;
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
        switch (this.f) {
            case 0:
                lm3 lm3Var = this.g;
                Map mapE = lm3Var.e();
                if (mapE != null) {
                    return mapE.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int i = lm3Var.i(entry.getKey());
                    if (i != -1 && Objects.equals(lm3Var.c()[i], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.g.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f) {
            case 0:
                lm3 lm3Var = this.g;
                Map mapE = lm3Var.e();
                return mapE != null ? mapE.entrySet().iterator() : new im3(lm3Var, 1);
            default:
                lm3 lm3Var2 = this.g;
                Map mapE2 = lm3Var2.e();
                return mapE2 != null ? mapE2.keySet().iterator() : new im3(lm3Var2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f) {
            case 0:
                lm3 lm3Var = this.g;
                Map mapE = lm3Var.e();
                if (mapE != null) {
                    return mapE.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!lm3Var.d()) {
                        int iG = lm3Var.g();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = lm3Var.f;
                        Objects.requireNonNull(obj2);
                        int iR = ou1.R(key, value, iG, obj2, lm3Var.a(), lm3Var.b(), lm3Var.c());
                        if (iR != -1) {
                            lm3Var.f(iR, iG);
                            lm3Var.k--;
                            lm3Var.j += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                lm3 lm3Var2 = this.g;
                Map mapE2 = lm3Var2.e();
                return mapE2 != null ? mapE2.keySet().remove(obj) : lm3Var2.j(obj) != lm3.o;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f) {
        }
        return this.g.size();
    }
}
