package com.bumptech.glide.load.engine;

import java.security.MessageDigest;

/* loaded from: classes.dex */
final class d implements C2.e {

    /* renamed from: b, reason: collision with root package name */
    private final C2.e f34320b;

    /* renamed from: c, reason: collision with root package name */
    private final C2.e f34321c;

    d(C2.e eVar, C2.e eVar2) {
        this.f34320b = eVar;
        this.f34321c = eVar2;
    }

    @Override // C2.e
    public void a(MessageDigest messageDigest) {
        this.f34320b.a(messageDigest);
        this.f34321c.a(messageDigest);
    }

    @Override // C2.e
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f34320b.equals(dVar.f34320b) && this.f34321c.equals(dVar.f34321c);
    }

    @Override // C2.e
    public int hashCode() {
        return (this.f34320b.hashCode() * 31) + this.f34321c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f34320b + ", signature=" + this.f34321c + '}';
    }
}
