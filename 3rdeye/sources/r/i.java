package R;

import G.h;
import N7.B8;
import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.EnumC1716u;
import androidx.camera.core.impl.EnumC1719w;
import androidx.camera.core.impl.EnumC1721y;
import androidx.camera.core.impl.EnumC1722z;
import androidx.camera.core.impl.P0;

/* compiled from: VirtualCameraCaptureResult.java */
/* loaded from: classes.dex */
public final class i implements A {

    /* renamed from: a, reason: collision with root package name */
    public final A f11595a;

    /* renamed from: b, reason: collision with root package name */
    public final P0 f11596b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11597c;

    public i(A a10, P0 p02, long j4) {
        this.f11595a = a10;
        this.f11596b = p02;
        this.f11597c = j4;
    }

    @Override // androidx.camera.core.impl.A
    public final P0 a() {
        return this.f11596b;
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ void b(h.b bVar) {
        B8.f(this, bVar);
    }

    @Override // androidx.camera.core.impl.A
    public final EnumC1721y c() {
        A a10 = this.f11595a;
        return a10 != null ? a10.c() : EnumC1721y.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.A
    public final EnumC1722z d() {
        A a10 = this.f11595a;
        return a10 != null ? a10.d() : EnumC1722z.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.A
    public final EnumC1716u e() {
        A a10 = this.f11595a;
        return a10 != null ? a10.e() : EnumC1716u.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ CaptureResult f() {
        return null;
    }

    @Override // androidx.camera.core.impl.A
    public final EnumC1719w g() {
        A a10 = this.f11595a;
        return a10 != null ? a10.g() : EnumC1719w.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.A
    public final long getTimestamp() {
        A a10 = this.f11595a;
        if (a10 != null) {
            return a10.getTimestamp();
        }
        long j4 = this.f11597c;
        if (j4 != -1) {
            return j4;
        }
        throw new IllegalStateException("No timestamp is available.");
    }
}
