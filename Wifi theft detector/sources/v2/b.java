package v2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import v2.f;

/* loaded from: classes.dex */
public class b extends TextureView implements TextureView.SurfaceTextureListener, f {

    /* renamed from: a, reason: collision with root package name */
    public c f24701a;

    public b(Context context) {
        this(context, null);
    }

    @Override // v2.f
    public void a(c cVar) {
        this.f24701a = cVar;
        setSurfaceTextureListener(this);
    }

    @Override // v2.f
    public void emc(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }

    @Override // v2.f
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        c cVar = this.f24701a;
        if (cVar != null) {
            cVar.emc(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c cVar = this.f24701a;
        if (cVar != null) {
            return cVar.emc(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        c cVar = this.f24701a;
        if (cVar != null) {
            cVar.ypw(surfaceTexture);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // v2.f
    public View getView() {
        return this;
    }

    public void setWindowVisibilityChangedListener(f.a aVar) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
