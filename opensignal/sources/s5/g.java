package s5;

import a5.d0;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class g implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: x, reason: collision with root package name */
    public static final g f21897x = new g();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f21898a = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f21899d;

    /* renamed from: g, reason: collision with root package name */
    public Choreographer f21900g;

    /* renamed from: r, reason: collision with root package name */
    public int f21901r;

    public g() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i10 = d0.f105a;
        Handler handler = new Handler(looper, this);
        this.f21899d = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f21898a = j;
        Choreographer choreographer = this.f21900g;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            try {
                this.f21900g = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e4) {
                a5.a.C("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e4);
                return true;
            }
        }
        if (i10 == 1) {
            Choreographer choreographer = this.f21900g;
            if (choreographer != null) {
                int i11 = this.f21901r + 1;
                this.f21901r = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        } else {
            if (i10 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f21900g;
            if (choreographer2 != null) {
                int i12 = this.f21901r - 1;
                this.f21901r = i12;
                if (i12 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f21898a = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}
