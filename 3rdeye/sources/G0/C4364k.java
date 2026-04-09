package g0;

import C.S;
import C.g0;
import C.k0;
import E.y;
import I.m;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import z0.C5848a;

/* compiled from: SurfaceViewImplementation.java */
/* renamed from: g0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4364k extends AbstractC4357d {

    /* renamed from: e, reason: collision with root package name */
    public SurfaceView f37918e;

    /* renamed from: f, reason: collision with root package name */
    public final a f37919f;

    /* compiled from: SurfaceViewImplementation.java */
    /* renamed from: g0.k$a */
    public class a implements SurfaceHolder.Callback {

        /* renamed from: b, reason: collision with root package name */
        public Size f37920b;

        /* renamed from: c, reason: collision with root package name */
        public k0 f37921c;

        /* renamed from: d, reason: collision with root package name */
        public k0 f37922d;

        /* renamed from: e, reason: collision with root package name */
        public D3.b f37923e;

        /* renamed from: f, reason: collision with root package name */
        public Size f37924f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f37925g = false;

        /* renamed from: h, reason: collision with root package name */
        public boolean f37926h = false;

        public a() {
        }

        public final void a() {
            if (this.f37921c != null) {
                S.a("SurfaceViewImpl", "Request canceled: " + this.f37921c);
                this.f37921c.d();
            }
        }

        public final boolean b() {
            C4364k c4364k = C4364k.this;
            Surface surface = c4364k.f37918e.getHolder().getSurface();
            if (this.f37925g || this.f37921c == null || !Objects.equals(this.f37920b, this.f37924f)) {
                return false;
            }
            S.a("SurfaceViewImpl", "Surface set on Preview.");
            D3.b bVar = this.f37923e;
            k0 k0Var = this.f37921c;
            Objects.requireNonNull(k0Var);
            k0Var.b(surface, C5848a.getMainExecutor(c4364k.f37918e.getContext()), new y(bVar, 4));
            this.f37925g = true;
            c4364k.f37907d = true;
            c4364k.f();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i10, int i11) {
            S.a("SurfaceViewImpl", "Surface changed. Size: " + i10 + "x" + i11);
            this.f37924f = new Size(i10, i11);
            b();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            k0 k0Var;
            S.a("SurfaceViewImpl", "Surface created.");
            if (!this.f37926h || (k0Var = this.f37922d) == null) {
                return;
            }
            k0Var.d();
            k0Var.f739j.b(null);
            this.f37922d = null;
            this.f37926h = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            S.a("SurfaceViewImpl", "Surface destroyed.");
            if (!this.f37925g) {
                a();
            } else if (this.f37921c != null) {
                S.a("SurfaceViewImpl", "Surface closed " + this.f37921c);
                this.f37921c.f741l.a();
            }
            this.f37926h = true;
            k0 k0Var = this.f37921c;
            if (k0Var != null) {
                this.f37922d = k0Var;
            }
            this.f37925g = false;
            this.f37921c = null;
            this.f37923e = null;
            this.f37924f = null;
            this.f37920b = null;
        }
    }

    public C4364k(FrameLayout frameLayout, androidx.camera.view.b bVar) {
        super(frameLayout, bVar);
        this.f37919f = new a();
    }

    @Override // g0.AbstractC4357d
    public final View a() {
        return this.f37918e;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [g0.j] */
    @Override // g0.AbstractC4357d
    public final Bitmap b() {
        SurfaceView surfaceView = this.f37918e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f37918e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f37918e.getWidth(), this.f37918e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.f37918e, bitmapCreateBitmap, (PixelCopy$OnPixelCopyFinishedListener) new PixelCopy$OnPixelCopyFinishedListener() { // from class: g0.j
            public final void onPixelCopyFinished(int i) {
                Semaphore semaphore2 = semaphore;
                if (i == 0) {
                    S.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                } else {
                    S.b("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
                }
                semaphore2.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                S.b("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e4) {
            S.c("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e4);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // g0.AbstractC4357d
    public final void e(k0 k0Var, D3.b bVar) {
        SurfaceView surfaceView = this.f37918e;
        boolean zEquals = Objects.equals(this.f37904a, k0Var.f732b);
        if (surfaceView == null || !zEquals) {
            Size size = k0Var.f732b;
            this.f37904a = size;
            FrameLayout frameLayout = this.f37905b;
            size.getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.f37918e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.f37904a.getWidth(), this.f37904a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.f37918e);
            this.f37918e.getHolder().addCallback(this.f37919f);
        }
        Executor mainExecutor = C5848a.getMainExecutor(this.f37918e.getContext());
        k0Var.f740k.a(new g0(bVar, 22), mainExecutor);
        this.f37918e.post(new J4.e(this, k0Var, bVar, 17));
    }

    @Override // g0.AbstractC4357d
    public final A4.a<Void> g() {
        return m.c.f2366c;
    }

    @Override // g0.AbstractC4357d
    public final void c() {
    }

    @Override // g0.AbstractC4357d
    public final void d() {
    }
}
