package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class rj1 {

    public static class a<T> implements qj1<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        private final List<? extends qj1<? super T>> f32672b;

        public /* synthetic */ a(List list, int i) {
            this(list);
        }

        @Override // com.yandex.mobile.ads.impl.qj1
        public final boolean apply(T t10) {
            for (int i = 0; i < this.f32672b.size(); i++) {
                if (!this.f32672b.get(i).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f32672b.equals(((a) obj).f32672b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f32672b.hashCode() + 306654252;
        }

        public final String toString() {
            List<? extends qj1<? super T>> list = this.f32672b;
            StringBuilder sb = new StringBuilder("Predicates.and(");
            boolean z10 = true;
            for (T t10 : list) {
                if (!z10) {
                    sb.append(',');
                }
                sb.append(t10);
                z10 = false;
            }
            sb.append(')');
            return sb.toString();
        }

        private a(List<? extends qj1<? super T>> list) {
            this.f32672b = list;
        }
    }

    public static <T> qj1<T> a(qj1<? super T> qj1Var, qj1<? super T> qj1Var2) {
        qj1Var.getClass();
        qj1Var2.getClass();
        return new a(Arrays.asList(qj1Var, qj1Var2), 0);
    }
}
