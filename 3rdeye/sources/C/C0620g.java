package C;

import android.graphics.Matrix;
import androidx.camera.core.impl.P0;

/* compiled from: AutoValue_ImmutableImageInfo.java */
/* renamed from: C.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620g extends O {

    /* renamed from: a, reason: collision with root package name */
    public final P0 f703a;

    /* renamed from: b, reason: collision with root package name */
    public final long f704b;

    /* renamed from: c, reason: collision with root package name */
    public final int f705c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f706d;

    public C0620g(P0 p02, long j4, int i, Matrix matrix) {
        if (p02 == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f703a = p02;
        this.f704b = j4;
        this.f705c = i;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f706d = matrix;
    }

    @Override // C.L
    public final P0 a() {
        return this.f703a;
    }

    @Override // C.O
    public final int c() {
        return this.f705c;
    }

    @Override // C.O
    public final Matrix d() {
        return this.f706d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        C0620g c0620g = (C0620g) o10;
        if (this.f703a.equals(c0620g.f703a) && this.f704b == c0620g.f704b) {
            return this.f705c == o10.c() && this.f706d.equals(o10.d());
        }
        return false;
    }

    @Override // C.L
    public final long getTimestamp() {
        return this.f704b;
    }

    public final int hashCode() {
        int iHashCode = (this.f703a.hashCode() ^ 1000003) * 1000003;
        long j4 = this.f704b;
        return ((((iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f705c) * 1000003) ^ this.f706d.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f703a + ", timestamp=" + this.f704b + ", rotationDegrees=" + this.f705c + ", sensorToBufferTransformMatrix=" + this.f706d + "}";
    }
}
