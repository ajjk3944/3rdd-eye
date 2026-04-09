package r5;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import java.util.Random;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32825a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32826b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f32825a) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? g.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new i.i((Context) this.f32826b, 2), new Random().nextInt(Math.max(1000, 1)) + PAGErrorCode.LOAD_FACTORY_NULL_CODE);
                break;
            default:
                ((Runnable) this.f32826b).run();
                break;
        }
    }

    public /* synthetic */ f(Runnable runnable) {
        this.f32826b = runnable;
    }
}
