package org.ocpsoft.prettytime.impl;

import Aj.g;

/* loaded from: classes2.dex */
public abstract class ResourcesTimeUnit implements g {

    /* renamed from: d, reason: collision with root package name */
    private static long f57138d;

    /* renamed from: a, reason: collision with root package name */
    private long f57139a;

    /* renamed from: b, reason: collision with root package name */
    private long f57140b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f57141c = 1;

    public ResourcesTimeUnit() {
        long j10 = f57138d;
        f57138d = 1 + j10;
        this.f57139a = j10;
    }

    @Override // Aj.g
    public long a() {
        return this.f57140b;
    }

    @Override // Aj.g
    public long b() {
        return this.f57141c;
    }

    protected final String c() {
        return "org.ocpsoft.prettytime.i18n.Resources";
    }

    protected abstract String d();

    public void e(long j10) {
        this.f57140b = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcesTimeUnit resourcesTimeUnit = (ResourcesTimeUnit) obj;
        return this.f57140b == resourcesTimeUnit.f57140b && this.f57141c == resourcesTimeUnit.f57141c;
    }

    public void f(long j10) {
        this.f57141c = j10;
    }

    public int hashCode() {
        return 31 + Long.hashCode(this.f57139a);
    }

    public String toString() {
        return d();
    }
}
