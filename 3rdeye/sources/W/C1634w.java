package W;

import android.content.Context;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.services.BackgroundCameraXService;
import java.util.concurrent.Executor;

/* compiled from: PendingRecording.java */
/* renamed from: W.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1634w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13301a;

    /* renamed from: b, reason: collision with root package name */
    public final F f13302b;

    /* renamed from: c, reason: collision with root package name */
    public final C1631t f13303c;

    /* renamed from: d, reason: collision with root package name */
    public K0.b<a0> f13304d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f13305e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13306f = false;

    public C1634w(BackgroundCameraXService backgroundCameraXService, F f10, C1631t c1631t) {
        this.f13301a = G.e.a(backgroundCameraXService);
        this.f13302b = f10;
        this.f13303c = c1631t;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final W.M a(java.util.concurrent.Executor r12, K0.b<W.a0> r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.C1634w.a(java.util.concurrent.Executor, K0.b):W.M");
    }

    public final void b() {
        if (E.u.s(this.f13301a, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        A2.l.q("The Recorder this recording is associated to doesn't support audio.", ((AbstractC1630s) F.k(this.f13302b.f13082B)).b().c() != 0);
        this.f13306f = true;
    }
}
