package io.sentry.rrweb;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public c f12699a;

    /* renamed from: d, reason: collision with root package name */
    public long f12700d = System.currentTimeMillis();

    public b(c cVar) {
        this.f12699a = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12700d == bVar.f12700d && this.f12699a == bVar.f12699a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12699a, Long.valueOf(this.f12700d)});
    }
}
