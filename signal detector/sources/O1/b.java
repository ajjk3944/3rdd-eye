package O1;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.sz.ypw.bw;

/* loaded from: classes.dex */
public final class b extends TextureView implements TextureView.SurfaceTextureListener, g {

    /* renamed from: a, reason: collision with root package name */
    public bw f3059a;

    @Override // O1.g
    public final void a(bw bwVar) {
        this.f3059a = bwVar;
        setSurfaceTextureListener(this);
    }

    @Override // O1.g
    public final void emc(int i, int i3) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i3;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // O1.g
    public SurfaceHolder getHolder() {
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
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i3) {
        bw bwVar = this.f3059a;
        if (bwVar != null) {
            bwVar.emc(surfaceTexture, i, i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        bw bwVar = this.f3059a;
        if (bwVar != null) {
            return bwVar.emc(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        bw bwVar = this.f3059a;
        if (bwVar != null) {
            bwVar.ypw(surfaceTexture);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // O1.g
    public View getView() {
        return this;
    }

    public void setWindowVisibilityChangedListener(f fVar) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i3) {
    }
}
