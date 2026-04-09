package rb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class p implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: x, reason: collision with root package name */
    public static final p f21497x = new p();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f21498a = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f21499d;

    /* renamed from: g, reason: collision with root package name */
    public Choreographer f21500g;

    /* renamed from: r, reason: collision with root package name */
    public int f21501r;

    public p() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i10 = qb.v.f20828a;
        Handler handler = new Handler(looper, this);
        this.f21499d = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f21498a = j;
        Choreographer choreographer = this.f21500g;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.f21500g = Choreographer.getInstance();
            return true;
        }
        if (i10 == 1) {
            int i11 = this.f21501r + 1;
            this.f21501r = i11;
            if (i11 == 1) {
                Choreographer choreographer = this.f21500g;
                choreographer.getClass();
                choreographer.postFrameCallback(this);
            }
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        int i12 = this.f21501r - 1;
        this.f21501r = i12;
        if (i12 == 0) {
            Choreographer choreographer2 = this.f21500g;
            choreographer2.getClass();
            choreographer2.removeFrameCallback(this);
            this.f21498a = -9223372036854775807L;
        }
        return true;
    }
}
