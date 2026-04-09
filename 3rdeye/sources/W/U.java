package W;

import C.RunnableC0615b;
import android.os.SystemClock;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.H0;
import java.util.concurrent.atomic.AtomicBoolean;
import o0.b;

/* compiled from: VideoCapture.java */
/* loaded from: classes.dex */
public final class U extends AbstractC1707p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13208a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f13209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f13210c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H0.b f13211d;

    public U(AtomicBoolean atomicBoolean, b.a aVar, H0.b bVar) {
        this.f13209b = atomicBoolean;
        this.f13210c = aVar;
        this.f13211d = bVar;
    }

    @Override // androidx.camera.core.impl.AbstractC1707p
    public final void b(int i, androidx.camera.core.impl.A a10) {
        Object obj;
        if (this.f13208a) {
            this.f13208a = false;
            C.S.a("VideoCapture", "cameraCaptureResult timestampNs = " + a10.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
        }
        AtomicBoolean atomicBoolean = this.f13209b;
        if (atomicBoolean.get() || (obj = a10.a().f14935a.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        b.a aVar = this.f13210c;
        if (iIntValue == aVar.hashCode() && aVar.b(null) && !atomicBoolean.getAndSet(true)) {
            E.u.H().execute(new RunnableC0615b(9, this, this.f13211d));
        }
    }
}
