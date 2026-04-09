package x8;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.mwh.vt.fkw;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends TextureView implements TextureView.SurfaceTextureListener, f {

    /* renamed from: a, reason: collision with root package name */
    public fkw f37011a;

    @Override // x8.f
    public final void a(fkw fkwVar) {
        this.f37011a = fkwVar;
        setSurfaceTextureListener(this);
    }

    @Override // x8.f
    public final SurfaceHolder getHolder() {
        return null;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable th2) {
            th2.printStackTrace();
            if (pk.a.f32023b && pk.a.f32023b && pk.a.f32024c <= 4) {
                Log.i(pk.a.l("CSJ_VIDEO_TextureView"), "rethrow exception for debug & local_test, (TextureView)", th2);
            }
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i10) {
        pk.a.x("CSJ_VIDEO_TextureView", "onSurfaceTextureAvailable: ");
        fkw fkwVar = this.f37011a;
        if (fkwVar != null) {
            fkwVar.ouw(surfaceTexture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        pk.a.x("CSJ_VIDEO_TextureView", "onSurfaceTextureDestroyed: ");
        fkw fkwVar = this.f37011a;
        if (fkwVar != null) {
            return fkwVar.yu();
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i10) {
        pk.a.x("CSJ_VIDEO_TextureView", "onSurfaceTextureSizeChanged: ");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        fkw fkwVar = this.f37011a;
        if (fkwVar != null) {
            fkwVar.fkw();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
    }

    @Override // x8.f
    public final void ouw(int i4, int i10) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i10;
        layoutParams.width = i4;
        setLayoutParams(layoutParams);
    }

    @Override // x8.f
    public final View getView() {
        return this;
    }

    public final void setWindowVisibilityChangedListener(e eVar) {
    }
}
