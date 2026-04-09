package rb;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* loaded from: classes.dex */
public final class i extends GLSurfaceView implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f21490d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final h f21491a;

    public i(Context context) {
        super(context, null);
        h hVar = new h(this);
        this.f21491a = hVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(hVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(j jVar) {
        h hVar = this.f21491a;
        if (hVar.f21489y.getAndSet(jVar) != null) {
            throw new ClassCastException();
        }
        hVar.f21484a.requestRender();
    }

    @Deprecated
    public k getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
