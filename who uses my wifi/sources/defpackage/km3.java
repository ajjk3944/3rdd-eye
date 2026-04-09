package defpackage;

import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class km3 implements Map.Entry {
    public final Object f;
    public int g;
    public final /* synthetic */ lm3 h;

    public km3(lm3 lm3Var, int i) {
        Objects.requireNonNull(lm3Var);
        this.h = lm3Var;
        this.f = lm3Var.b()[i];
        this.g = i;
    }

    public final void a() {
        int i = this.g;
        Object obj = this.f;
        lm3 lm3Var = this.h;
        if (i != -1 && i < lm3Var.size()) {
            if (Objects.equals(obj, lm3Var.b()[this.g])) {
                return;
            }
        }
        this.g = lm3Var.i(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        lm3 lm3Var = this.h;
        Map mapE = lm3Var.e();
        if (mapE != null) {
            return mapE.get(this.f);
        }
        a();
        int i = this.g;
        if (i == -1) {
            return null;
        }
        return lm3Var.c()[i];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        lm3 lm3Var = this.h;
        Map mapE = lm3Var.e();
        Object obj2 = this.f;
        if (mapE != null) {
            return mapE.put(obj2, obj);
        }
        a();
        int i = this.g;
        if (i == -1) {
            lm3Var.put(obj2, obj);
            return null;
        }
        Object obj3 = lm3Var.c()[i];
        lm3Var.c()[this.g] = obj;
        return obj3;
    }

    public final String toString() {
        String strValueOf = String.valueOf(getKey());
        String strValueOf2 = String.valueOf(getValue());
        return ex0.l(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
