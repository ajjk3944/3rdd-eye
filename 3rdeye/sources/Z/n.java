package Z;

import C.S;
import Z.k;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import b0.C1811b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f13957c;

    public /* synthetic */ n(p pVar, int i) {
        this.f13956b = i;
        this.f13957c = pVar;
    }

    private final void a() throws IllegalStateException {
        p pVar = this.f13957c;
        pVar.f13969k.set(false);
        k kVar = pVar.f13966g;
        kVar.a();
        if (kVar.f13937d.getAndSet(false)) {
            kVar.f13934a.stop();
            if (kVar.f13934a.getRecordingState() != 1) {
                S.g("AudioStreamImpl", "Failed to stop AudioRecord with state: " + kVar.f13934a.getRecordingState());
            }
            if (C1811b.f17055a.e(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                kVar.f13934a.release();
                kVar.f13934a = k.b(kVar.f13939f, kVar.f13935b, null);
            }
        }
        synchronized (pVar.f13964e) {
            pVar.f13965f = null;
            pVar.f13962c.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        k.a aVar;
        switch (this.f13956b) {
            case 0:
                a();
                return;
            default:
                p pVar = this.f13957c;
                pVar.f13969k.set(false);
                k kVar = pVar.f13966g;
                if (!kVar.f13936c.getAndSet(true)) {
                    if (Build.VERSION.SDK_INT >= 29 && (aVar = kVar.f13943k) != null) {
                        a0.c.d(kVar.f13934a, aVar);
                    }
                    kVar.f13934a.release();
                }
                synchronized (pVar.f13964e) {
                    pVar.f13965f = null;
                    pVar.f13962c.clear();
                }
                return;
        }
    }
}
