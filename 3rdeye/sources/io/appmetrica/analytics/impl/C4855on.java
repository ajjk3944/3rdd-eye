package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.on, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4855on implements TempCacheStorage.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final long f41396a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41397b;

    /* renamed from: c, reason: collision with root package name */
    public final long f41398c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f41399d;

    public C4855on(long j4, String str, long j10, byte[] bArr) {
        this.f41396a = j4;
        this.f41397b = str;
        this.f41398c = j10;
        this.f41399d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4855on.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C4855on c4855on = (C4855on) obj;
        if (this.f41396a == c4855on.f41396a && kotlin.jvm.internal.l.b(this.f41397b, c4855on.f41397b) && this.f41398c == c4855on.f41398c) {
            return Arrays.equals(this.f41399d, c4855on.f41399d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final byte[] getData() {
        return this.f41399d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f41396a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final String getScope() {
        return this.f41397b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f41398c;
    }

    public final int hashCode() {
        long j4 = this.f41396a;
        int iN = B4.g.n(((int) (j4 ^ (j4 >>> 32))) * 31, 31, this.f41397b);
        long j10 = this.f41398c;
        return Arrays.hashCode(this.f41399d) + ((((int) (j10 ^ (j10 >>> 32))) + iN) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TempCacheEntry(id=");
        sb.append(this.f41396a);
        sb.append(", scope='");
        sb.append(this.f41397b);
        sb.append("', timestamp=");
        sb.append(this.f41398c);
        sb.append(", data=array[");
        return B4.i.j(sb, this.f41399d.length, "])");
    }
}
