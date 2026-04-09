package androidx.camera.core.impl;

import C.C0634v;
import android.os.SystemClock;
import androidx.camera.core.impl.P;

/* compiled from: CameraProviderExecutionState.java */
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final int f14899a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14900b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f14901c;

    public K(long j4, Exception exc) {
        this.f14900b = SystemClock.elapsedRealtime() - j4;
        if (exc instanceof P.b) {
            this.f14899a = 2;
            this.f14901c = exc;
            return;
        }
        if (!(exc instanceof C.P)) {
            this.f14899a = 0;
            this.f14901c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.f14901c = exc;
        if (exc instanceof C0634v) {
            this.f14899a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.f14899a = 1;
        } else {
            this.f14899a = 0;
        }
    }
}
