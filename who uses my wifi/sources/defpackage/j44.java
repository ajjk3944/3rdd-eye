package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j44 implements Map.Entry {
    public j44 f;
    public j44 g;
    public j44 h;
    public j44 i;
    public j44 j;
    public final Object k;
    public Object l;
    public int m;

    public j44() {
        this.k = null;
        this.j = this;
        this.i = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.k;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.l;
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
        return this.k;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.k;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.l;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.l;
        this.l = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.k);
        String strValueOf2 = String.valueOf(this.l);
        return ex0.l(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }

    public j44(j44 j44Var, Object obj, j44 j44Var2, j44 j44Var3) {
        this.f = j44Var;
        this.k = obj;
        this.m = 1;
        this.i = j44Var2;
        this.j = j44Var3;
        j44Var3.i = this;
        j44Var2.j = this;
    }
}
