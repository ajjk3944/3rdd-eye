package io.appmetrica.analytics.coreutils.internal.cache;

import N7.C1154e9;

/* loaded from: classes3.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f38936a;

        /* renamed from: b, reason: collision with root package name */
        private volatile long f38937b;

        /* renamed from: c, reason: collision with root package name */
        private volatile long f38938c;

        /* renamed from: d, reason: collision with root package name */
        private long f38939d = 0;

        /* renamed from: e, reason: collision with root package name */
        private Object f38940e = null;

        public CachedData(long j4, long j10, String str) {
            this.f38936a = C1154e9.i("[CachedData-", str, "]");
            this.f38937b = j4;
            this.f38938c = j10;
        }

        public T getData() {
            return (T) this.f38940e;
        }

        public long getExpiryTime() {
            return this.f38938c;
        }

        public long getRefreshTime() {
            return this.f38937b;
        }

        public final boolean isEmpty() {
            return this.f38940e == null;
        }

        public void setData(T t10) {
            this.f38940e = t10;
            this.f38939d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j4, long j10) {
            this.f38937b = j4;
            this.f38938c = j10;
        }

        public final boolean shouldClearData() {
            if (this.f38939d == 0) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f38939d;
            return jCurrentTimeMillis > this.f38938c || jCurrentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f38939d;
            return jCurrentTimeMillis > this.f38937b || jCurrentTimeMillis < 0;
        }

        public String toString() {
            return "CachedData{tag='" + this.f38936a + "', refreshTime=" + this.f38937b + ", expiryTime=" + this.f38938c + ", mCachedTime=" + this.f38939d + ", mCachedData=" + this.f38940e + '}';
        }
    }
}
