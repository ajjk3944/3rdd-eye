package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.yandex.mobile.ads.impl.jw0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public interface ed {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f26797a;

        /* renamed from: b, reason: collision with root package name */
        public final v42 f26798b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26799c;

        /* renamed from: d, reason: collision with root package name */
        public final jw0.b f26800d;

        /* renamed from: e, reason: collision with root package name */
        public final long f26801e;

        /* renamed from: f, reason: collision with root package name */
        public final v42 f26802f;

        /* renamed from: g, reason: collision with root package name */
        public final int f26803g;

        /* renamed from: h, reason: collision with root package name */
        public final jw0.b f26804h;
        public final long i;

        /* renamed from: j, reason: collision with root package name */
        public final long f26805j;

        public a(long j4, v42 v42Var, int i, jw0.b bVar, long j10, v42 v42Var2, int i10, jw0.b bVar2, long j11, long j12) {
            this.f26797a = j4;
            this.f26798b = v42Var;
            this.f26799c = i;
            this.f26800d = bVar;
            this.f26801e = j10;
            this.f26802f = v42Var2;
            this.f26803g = i10;
            this.f26804h = bVar2;
            this.i = j11;
            this.f26805j = j12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f26797a == aVar.f26797a && this.f26799c == aVar.f26799c && this.f26801e == aVar.f26801e && this.f26803g == aVar.f26803g && this.i == aVar.i && this.f26805j == aVar.f26805j && pd1.a(this.f26798b, aVar.f26798b) && pd1.a(this.f26800d, aVar.f26800d) && pd1.a(this.f26802f, aVar.f26802f) && pd1.a(this.f26804h, aVar.f26804h)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f26797a), this.f26798b, Integer.valueOf(this.f26799c), this.f26800d, Long.valueOf(this.f26801e), this.f26802f, Integer.valueOf(this.f26803g), this.f26804h, Long.valueOf(this.i), Long.valueOf(this.f26805j)});
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final vb0 f26806a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f26807b;

        public b(vb0 vb0Var, SparseArray<a> sparseArray) {
            this.f26806a = vb0Var;
            SparseArray<a> sparseArray2 = new SparseArray<>(vb0Var.a());
            for (int i = 0; i < vb0Var.a(); i++) {
                int iB = vb0Var.b(i);
                sparseArray2.append(iB, (a) zf.a(sparseArray.get(iB)));
            }
            this.f26807b = sparseArray2;
        }

        public final boolean a(int i) {
            return this.f26806a.a(i);
        }

        public final int b(int i) {
            return this.f26806a.b(i);
        }

        public final a c(int i) {
            a aVar = this.f26807b.get(i);
            aVar.getClass();
            return aVar;
        }

        public final int a() {
            return this.f26806a.a();
        }
    }
}
