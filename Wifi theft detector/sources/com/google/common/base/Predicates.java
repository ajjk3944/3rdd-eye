package com.google.common.base;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class Predicates {

    public static class IsEqualToPredicate implements h, Serializable {
        private static final long serialVersionUID = 0;
        private final Object target;

        @Override // com.google.common.base.h
        public boolean apply(Object obj) {
            return this.target.equals(obj);
        }

        public h d() {
            return this;
        }

        @Override // com.google.common.base.h
        public boolean equals(Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.target.equals(((IsEqualToPredicate) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.target);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
            sb.append("Predicates.equalTo(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }

        public IsEqualToPredicate(Object obj) {
            this.target = obj;
        }
    }

    public static class NotPredicate<T> implements h, Serializable {
        private static final long serialVersionUID = 0;
        final h predicate;

        public NotPredicate(h hVar) {
            this.predicate = (h) g.m(hVar);
        }

        @Override // com.google.common.base.h
        public boolean apply(Object obj) {
            return !this.predicate.apply(obj);
        }

        @Override // com.google.common.base.h
        public boolean equals(Object obj) {
            if (obj instanceof NotPredicate) {
                return this.predicate.equals(((NotPredicate) obj).predicate);
            }
            return false;
        }

        public int hashCode() {
            return ~this.predicate.hashCode();
        }

        public String toString() {
            String strValueOf = String.valueOf(this.predicate);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
            sb.append("Predicates.not(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public enum ObjectPredicate implements h {
        ALWAYS_TRUE { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // com.google.common.base.h
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // com.google.common.base.h
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // com.google.common.base.h
            public boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // com.google.common.base.h
            public boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        };

        public h g() {
            return this;
        }
    }

    public static h a(Object obj) {
        return obj == null ? b() : new IsEqualToPredicate(obj).d();
    }

    public static h b() {
        return ObjectPredicate.IS_NULL.g();
    }

    public static h c(h hVar) {
        return new NotPredicate(hVar);
    }
}
