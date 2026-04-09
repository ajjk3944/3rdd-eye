package androidx.camera.core.impl;

import C.Z;
import androidx.camera.core.impl.P;

/* compiled from: CameraProviderInitRetryPolicy.java */
/* loaded from: classes.dex */
public final class L implements G0 {

    /* renamed from: b, reason: collision with root package name */
    public final R0 f14915b;

    /* compiled from: CameraProviderInitRetryPolicy.java */
    public class a implements C.Z {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f14916b;

        public a(long j4) {
            this.f14916b = j4;
        }

        @Override // C.Z
        public final long a() {
            return this.f14916b;
        }

        @Override // C.Z
        public final Z.a c(K k10) {
            return k10.f14899a == 1 ? Z.a.f672d : Z.a.f673e;
        }
    }

    /* compiled from: CameraProviderInitRetryPolicy.java */
    public static final class b implements G0 {

        /* renamed from: b, reason: collision with root package name */
        public final L f14917b;

        public b(long j4) {
            this.f14917b = new L(j4);
        }

        @Override // C.Z
        public final long a() {
            return this.f14917b.f14915b.f14936b;
        }

        @Override // androidx.camera.core.impl.G0
        public final C.Z b(long j4) {
            return new b(j4);
        }

        @Override // C.Z
        public final Z.a c(K k10) {
            if (this.f14917b.f14915b.c(k10).f676b) {
                return Z.a.f673e;
            }
            Throwable th = k10.f14901c;
            if (th instanceof P.b) {
                C.S.b("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((P.b) th).f14933b > 0) {
                    return Z.a.f674f;
                }
            }
            return Z.a.f672d;
        }
    }

    public L(long j4) {
        this.f14915b = new R0(j4, new a(j4));
    }

    @Override // C.Z
    public final long a() {
        return this.f14915b.f14936b;
    }

    @Override // androidx.camera.core.impl.G0
    public final C.Z b(long j4) {
        return new L(j4);
    }

    @Override // C.Z
    public final Z.a c(K k10) {
        return this.f14915b.c(k10);
    }
}
