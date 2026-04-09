package com.google.common.base;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class Equivalence {

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence equivalence;

        @ParametricNullness
        private final T reference;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            ((Wrapper) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.reference);
            StringBuilder sb = new StringBuilder("null".length() + 7 + strValueOf.length());
            sb.append("null");
            sb.append(".wrap(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }
}
