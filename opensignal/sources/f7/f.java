package f7;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8662a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8663d;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f8662a) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new ah.a((Context) this.f8663d, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) this.f8663d).run();
                break;
        }
    }

    public /* synthetic */ f(Runnable runnable) {
        this.f8663d = runnable;
    }
}
