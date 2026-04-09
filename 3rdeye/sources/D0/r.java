package d0;

import C.E;
import C.S;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import d0.s;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import o.b0;
import v.C5658m;
import v.C5670z;
import w.C5699m;
import w.C5704r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37251c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f37252d;

    public /* synthetic */ r(int i, Object obj, Object obj2) {
        this.f37250b = i;
        this.f37251c = obj;
        this.f37252d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar;
        Executor executor;
        switch (this.f37250b) {
            case 0:
                s.a aVar = (s.a) this.f37251c;
                aVar.getClass();
                A4.a aVar2 = (A4.a) this.f37252d;
                if (aVar2.cancel(true)) {
                    return;
                }
                A2.l.q(null, aVar2.isDone());
                try {
                    ((w) aVar2.get()).cancel();
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException e4) {
                    S.g(aVar.f37286d.f37258a, "Unable to cancel the input buffer: " + e4);
                    return;
                }
            case 1:
                s.c cVar = (s.c) this.f37251c;
                MediaFormat mediaFormat = (MediaFormat) this.f37252d;
                if (cVar.f37295j) {
                    S.g(cVar.f37296k.f37258a, "Receives onOutputFormatChanged after codec is reset.");
                    return;
                }
                switch (cVar.f37296k.f37276t.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (cVar.f37296k.f37259b) {
                            s sVar = cVar.f37296k;
                            lVar = sVar.f37274r;
                            executor = sVar.f37275s;
                        }
                        try {
                            executor.execute(new E(18, lVar, mediaFormat));
                            return;
                        } catch (RejectedExecutionException e10) {
                            S.c(cVar.f37296k.f37258a, "Unable to post to the supplied executor.", e10);
                            return;
                        }
                    default:
                        throw new IllegalStateException("Unknown state: " + cVar.f37296k.f37276t);
                }
            case 2:
                ((v5.f) this.f37251c).a((v5.c) this.f37252d);
                return;
            case 3:
                ((ProfileInstallerInitializer) this.f37251c).getClass();
                (Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new b0((Context) this.f37252d, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 4:
                ((C5658m) this.f37251c).f46752b.f46778a.remove((C5670z.f) this.f37252d);
                return;
            case 5:
                ((C5699m.b) this.f37251c).f47146a.onDisconnected((CameraDevice) this.f37252d);
                return;
            default:
                ((C5704r.a) this.f37251c).f47154b.onCameraUnavailable((String) this.f37252d);
                return;
        }
    }
}
