package org.tensorflow.lite.task.vision.core;

import java.util.Arrays;
import org.tensorflow.lite.task.vision.core.BaseVisionTaskApi;

/* loaded from: classes2.dex */
final class a extends BaseVisionTaskApi.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f57171a;

    /* renamed from: b, reason: collision with root package name */
    private final long f57172b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f57173c;

    a(long j10, long j11, byte[] bArr) {
        this.f57171a = j10;
        this.f57172b = j11;
        if (bArr == null) {
            throw new NullPointerException("Null byteArray");
        }
        this.f57173c = bArr;
    }

    @Override // org.tensorflow.lite.task.vision.core.BaseVisionTaskApi.b
    byte[] b() {
        return this.f57173c;
    }

    @Override // org.tensorflow.lite.task.vision.core.BaseVisionTaskApi.b
    long c() {
        return this.f57172b;
    }

    @Override // org.tensorflow.lite.task.vision.core.BaseVisionTaskApi.b
    long d() {
        return this.f57171a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseVisionTaskApi.b)) {
            return false;
        }
        BaseVisionTaskApi.b bVar = (BaseVisionTaskApi.b) obj;
        if (this.f57171a == bVar.d() && this.f57172b == bVar.c()) {
            if (Arrays.equals(this.f57173c, bVar instanceof a ? ((a) bVar).f57173c : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f57171a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f57172b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ Arrays.hashCode(this.f57173c);
    }

    public String toString() {
        return "FrameBufferData{frameBufferHandle=" + this.f57171a + ", byteArrayHandle=" + this.f57172b + ", byteArray=" + Arrays.toString(this.f57173c) + "}";
    }
}
