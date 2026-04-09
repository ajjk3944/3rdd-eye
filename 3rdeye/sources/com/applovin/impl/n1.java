package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public class n1 {

    /* renamed from: b, reason: collision with root package name */
    private final String f20551b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f20552c;

    /* renamed from: a, reason: collision with root package name */
    private final String f20550a = UUID.randomUUID().toString();

    /* renamed from: d, reason: collision with root package name */
    private final long f20553d = System.currentTimeMillis();

    public n1(String str, Map map) {
        this.f20551b = str;
        this.f20552c = map;
    }

    public long a() {
        return this.f20553d;
    }

    public String b() {
        return this.f20550a;
    }

    public String c() {
        return this.f20551b;
    }

    public Map d() {
        return this.f20552c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n1 n1Var = (n1) obj;
        if (this.f20553d == n1Var.f20553d && Objects.equals(this.f20551b, n1Var.f20551b) && Objects.equals(this.f20552c, n1Var.f20552c)) {
            return Objects.equals(this.f20550a, n1Var.f20550a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f20551b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f20552c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j4 = this.f20553d;
        int i = (iHashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        String str2 = this.f20550a;
        return i + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f20551b + "', id='" + this.f20550a + "', creationTimestampMillis=" + this.f20553d + ", parameters=" + this.f20552c + '}';
    }
}
