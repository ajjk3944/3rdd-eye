package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public class s1 {

    /* renamed from: b, reason: collision with root package name */
    private final String f7528b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f7529c;

    /* renamed from: a, reason: collision with root package name */
    private final String f7527a = UUID.randomUUID().toString();

    /* renamed from: d, reason: collision with root package name */
    private final long f7530d = System.currentTimeMillis();

    public s1(String str, Map map) {
        this.f7528b = str;
        this.f7529c = map;
    }

    public long a() {
        return this.f7530d;
    }

    public String b() {
        return this.f7527a;
    }

    public String c() {
        return this.f7528b;
    }

    public Map d() {
        return this.f7529c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (this.f7530d == s1Var.f7530d && Objects.equals(this.f7528b, s1Var.f7528b) && Objects.equals(this.f7529c, s1Var.f7529c)) {
            return Objects.equals(this.f7527a, s1Var.f7527a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7528b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f7529c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j10 = this.f7530d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f7527a;
        return i10 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f7528b + "', id='" + this.f7527a + "', creationTimestampMillis=" + this.f7530d + ", parameters=" + this.f7529c + '}';
    }
}
