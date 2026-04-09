package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: AutoValue_CameraThreadConfig.java */
/* renamed from: androidx.camera.core.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1681c extends O {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f15006a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f15007b;

    public C1681c(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f15006a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f15007b = handler;
    }

    @Override // androidx.camera.core.impl.O
    public final Executor a() {
        return this.f15006a;
    }

    @Override // androidx.camera.core.impl.O
    public final Handler b() {
        return this.f15007b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return this.f15006a.equals(o10.a()) && this.f15007b.equals(o10.b());
    }

    public final int hashCode() {
        return ((this.f15006a.hashCode() ^ 1000003) * 1000003) ^ this.f15007b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f15006a + ", schedulerHandler=" + this.f15007b + "}";
    }
}
