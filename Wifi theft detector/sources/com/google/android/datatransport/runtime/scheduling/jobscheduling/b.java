package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b extends SchedulerConfig.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f9765a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9766b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f9767c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b$b, reason: collision with other inner class name */
    public static final class C0197b extends SchedulerConfig.b.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f9768a;

        /* renamed from: b, reason: collision with root package name */
        public Long f9769b;

        /* renamed from: c, reason: collision with root package name */
        public Set f9770c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b.a
        public SchedulerConfig.b a() {
            String str = "";
            if (this.f9768a == null) {
                str = " delta";
            }
            if (this.f9769b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f9770c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new b(this.f9768a.longValue(), this.f9769b.longValue(), this.f9770c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b.a
        public SchedulerConfig.b.a b(long j10) {
            this.f9768a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b.a
        public SchedulerConfig.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f9770c = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b.a
        public SchedulerConfig.b.a d(long j10) {
            this.f9769b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    public long b() {
        return this.f9765a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    public Set c() {
        return this.f9767c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.b
    public long d() {
        return this.f9766b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig.b) {
            SchedulerConfig.b bVar = (SchedulerConfig.b) obj;
            if (this.f9765a == bVar.b() && this.f9766b == bVar.d() && this.f9767c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f9765a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f9766b;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f9767c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f9765a + ", maxAllowedDelay=" + this.f9766b + ", flags=" + this.f9767c + "}";
    }

    public b(long j10, long j11, Set set) {
        this.f9765a = j10;
        this.f9766b = j11;
        this.f9767c = set;
    }
}
