package g0;

import C.e0;
import C.k0;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.impl.mediation.r;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;
import z0.C5848a;

/* compiled from: TextureViewImplementation.java */
/* renamed from: g0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4366m extends AbstractC4357d {

    /* renamed from: e, reason: collision with root package name */
    public TextureView f37930e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceTexture f37931f;

    /* renamed from: g, reason: collision with root package name */
    public b.d f37932g;

    /* renamed from: h, reason: collision with root package name */
    public k0 f37933h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public SurfaceTexture f37934j;

    /* renamed from: k, reason: collision with root package name */
    public AtomicReference<b.a<Void>> f37935k;

    /* renamed from: l, reason: collision with root package name */
    public D3.b f37936l;

    @Override // g0.AbstractC4357d
    public final View a() {
        return this.f37930e;
    }

    @Override // g0.AbstractC4357d
    public final Bitmap b() {
        TextureView textureView = this.f37930e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f37930e.getBitmap();
    }

    @Override // g0.AbstractC4357d
    public final void c() {
        if (!this.i || this.f37934j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f37930e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f37934j;
        if (surfaceTexture != surfaceTexture2) {
            this.f37930e.setSurfaceTexture(surfaceTexture2);
            this.f37934j = null;
            this.i = false;
        }
    }

    @Override // g0.AbstractC4357d
    public final void d() {
        this.i = true;
    }

    @Override // g0.AbstractC4357d
    public final void e(k0 k0Var, D3.b bVar) {
        Size size = k0Var.f732b;
        this.f37904a = size;
        this.f37936l = bVar;
        FrameLayout frameLayout = this.f37905b;
        size.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.f37930e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f37904a.getWidth(), this.f37904a.getHeight()));
        this.f37930e.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC4365l(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.f37930e);
        k0 k0Var2 = this.f37933h;
        if (k0Var2 != null) {
            k0Var2.d();
        }
        this.f37933h = k0Var;
        Executor mainExecutor = C5848a.getMainExecutor(this.f37930e.getContext());
        k0Var.f740k.a(new B.a(23, this, k0Var), mainExecutor);
        h();
    }

    @Override // g0.AbstractC4357d
    public final A4.a<Void> g() {
        return o0.b.a(new B8.b(this, 11));
    }

    public final void h() {
        SurfaceTexture surfaceTexture;
        Size size = this.f37904a;
        if (size == null || (surfaceTexture = this.f37931f) == null || this.f37933h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f37904a.getHeight());
        Surface surface = new Surface(this.f37931f);
        k0 k0Var = this.f37933h;
        b.d dVarA = o0.b.a(new e0(16, this, surface));
        this.f37932g = dVarA;
        dVarA.f44804c.addListener(new r(this, surface, dVarA, k0Var, 2), C5848a.getMainExecutor(this.f37930e.getContext()));
        this.f37907d = true;
        f();
    }
}
