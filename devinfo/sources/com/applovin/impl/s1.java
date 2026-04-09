package com.applovin.impl;

import j$.util.Objects;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class s1 {

    /* renamed from: b, reason: collision with root package name */
    private final String f5280b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f5281c;

    /* renamed from: a, reason: collision with root package name */
    private final String f5279a = UUID.randomUUID().toString();

    /* renamed from: d, reason: collision with root package name */
    private final long f5282d = System.currentTimeMillis();

    public s1(String str, Map map) {
        this.f5280b = str;
        this.f5281c = map;
    }

    public long a() {
        return this.f5282d;
    }

    public String b() {
        return this.f5279a;
    }

    public String c() {
        return this.f5280b;
    }

    public Map d() {
        return this.f5281c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (this.f5282d == s1Var.f5282d && Objects.equals(this.f5280b, s1Var.f5280b) && Objects.equals(this.f5281c, s1Var.f5281c)) {
            return Objects.equals(this.f5279a, s1Var.f5279a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f5280b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f5281c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j = this.f5282d;
        int i4 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f5279a;
        return i4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f5280b + "', id='" + this.f5279a + "', creationTimestampMillis=" + this.f5282d + ", parameters=" + this.f5281c + '}';
    }
}
