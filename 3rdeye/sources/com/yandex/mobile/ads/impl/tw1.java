package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public interface tw1 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final vw1 f33791a;

        /* renamed from: b, reason: collision with root package name */
        public final vw1 f33792b;

        public a(vw1 vw1Var) {
            this(vw1Var, vw1Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f33791a.equals(aVar.f33791a) && this.f33792b.equals(aVar.f33792b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f33792b.hashCode() + (this.f33791a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.f33791a);
            if (this.f33791a.equals(this.f33792b)) {
                str = "";
            } else {
                str = ", " + this.f33792b;
            }
            return B4.f.c(sb, str, "]");
        }

        public a(vw1 vw1Var, vw1 vw1Var2) {
            this.f33791a = (vw1) zf.a(vw1Var);
            this.f33792b = (vw1) zf.a(vw1Var2);
        }
    }

    public static class b implements tw1 {

        /* renamed from: a, reason: collision with root package name */
        private final long f33793a;

        /* renamed from: b, reason: collision with root package name */
        private final a f33794b;

        public b() {
            this(-9223372036854775807L, 0L);
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final boolean b() {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final long c() {
            return this.f33793a;
        }

        public b(long j4, long j10) {
            this.f33793a = j4;
            this.f33794b = new a(j10 == 0 ? vw1.f34726c : new vw1(0L, j10));
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final a b(long j4) {
            return this.f33794b;
        }
    }

    a b(long j4);

    boolean b();

    long c();
}
