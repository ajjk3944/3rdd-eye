package androidx.camera.core.impl;

import N7.C1094a9;
import androidx.camera.core.impl.N0;

/* compiled from: AutoValue_SurfaceConfig.java */
/* renamed from: androidx.camera.core.impl.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1703n extends N0 {

    /* renamed from: a, reason: collision with root package name */
    public final N0.b f15096a;

    /* renamed from: b, reason: collision with root package name */
    public final N0.a f15097b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15098c;

    public C1703n(N0.b bVar, N0.a aVar, long j4) {
        if (bVar == null) {
            throw new NullPointerException("Null configType");
        }
        this.f15096a = bVar;
        if (aVar == null) {
            throw new NullPointerException("Null configSize");
        }
        this.f15097b = aVar;
        this.f15098c = j4;
    }

    @Override // androidx.camera.core.impl.N0
    public final N0.a b() {
        return this.f15097b;
    }

    @Override // androidx.camera.core.impl.N0
    public final N0.b c() {
        return this.f15096a;
    }

    @Override // androidx.camera.core.impl.N0
    public final long e() {
        return this.f15098c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        return this.f15096a.equals(n02.c()) && this.f15097b.equals(n02.b()) && this.f15098c == n02.e();
    }

    public final int hashCode() {
        int iHashCode = (((this.f15096a.hashCode() ^ 1000003) * 1000003) ^ this.f15097b.hashCode()) * 1000003;
        long j4 = this.f15098c;
        return iHashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        sb.append(this.f15096a);
        sb.append(", configSize=");
        sb.append(this.f15097b);
        sb.append(", streamUseCase=");
        return C1094a9.f(sb, this.f15098c, "}");
    }
}
