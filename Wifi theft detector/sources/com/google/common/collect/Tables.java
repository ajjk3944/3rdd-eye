package com.google.common.collect;

import com.google.common.collect.t0;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class Tables {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.base.c f11986a = new a();

    public static final class ImmutableCell<R, C, V> extends b implements Serializable {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        private final C columnKey;

        @ParametricNullness
        private final R rowKey;

        @ParametricNullness
        private final V value;

        /* JADX WARN: Multi-variable type inference failed */
        public ImmutableCell(Object obj, Object obj2, Object obj3) {
            this.rowKey = obj;
            this.columnKey = obj2;
            this.value = obj3;
        }

        @Override // com.google.common.collect.t0.a
        public Object d() {
            return this.rowKey;
        }

        @Override // com.google.common.collect.t0.a
        public Object g() {
            return this.columnKey;
        }

        @Override // com.google.common.collect.t0.a
        public Object getValue() {
            return this.value;
        }
    }

    public class a implements com.google.common.base.c {
        @Override // com.google.common.base.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map apply(Map map) {
            return Collections.unmodifiableMap(map);
        }
    }

    public static abstract class b implements t0.a {
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof t0.a) {
                t0.a aVar = (t0.a) obj;
                if (com.google.common.base.f.a(d(), aVar.d()) && com.google.common.base.f.a(g(), aVar.g()) && com.google.common.base.f.a(getValue(), aVar.getValue())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.base.f.b(d(), g(), getValue());
        }

        public String toString() {
            String strValueOf = String.valueOf(d());
            String strValueOf2 = String.valueOf(g());
            String strValueOf3 = String.valueOf(getValue());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 4 + strValueOf2.length() + strValueOf3.length());
            sb.append("(");
            sb.append(strValueOf);
            sb.append(",");
            sb.append(strValueOf2);
            sb.append(")=");
            sb.append(strValueOf3);
            return sb.toString();
        }
    }

    public static boolean a(t0 t0Var, Object obj) {
        if (obj == t0Var) {
            return true;
        }
        if (obj instanceof t0) {
            return t0Var.d().equals(((t0) obj).d());
        }
        return false;
    }

    public static t0.a b(Object obj, Object obj2, Object obj3) {
        return new ImmutableCell(obj, obj2, obj3);
    }
}
