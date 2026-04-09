package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Map;

/* loaded from: classes2.dex */
public final class a extends SchedulerConfig {

    /* renamed from: a, reason: collision with root package name */
    public final h4.a f9763a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f9764b;

    public a(h4.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f9763a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f9764b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public h4.a e() {
        return this.f9763a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig) {
            SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
            if (this.f9763a.equals(schedulerConfig.e()) && this.f9764b.equals(schedulerConfig.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public Map h() {
        return this.f9764b;
    }

    public int hashCode() {
        return ((this.f9763a.hashCode() ^ 1000003) * 1000003) ^ this.f9764b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f9763a + ", values=" + this.f9764b + "}";
    }
}
