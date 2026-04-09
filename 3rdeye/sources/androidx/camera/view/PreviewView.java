package androidx.camera.view;

import C.J;
import C.S;
import C.U;
import C.W;
import C.k0;
import C.n0;
import G.n;
import G.o;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.J;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.lifecycle.C;
import androidx.lifecycle.E;
import com.applovin.impl.A0;
import g0.AbstractC4354a;
import g0.AbstractC4357d;
import g0.C4356c;
import g0.C4358e;
import g0.C4359f;
import g0.C4362i;
import g0.C4364k;
import g0.C4366m;
import h0.C4404a;
import h0.C4405b;
import i0.C4426a;
import j0.C5164a;
import java.util.concurrent.atomic.AtomicReference;
import z0.C5848a;

/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final c f15157n = c.PERFORMANCE;

    /* renamed from: b, reason: collision with root package name */
    public c f15158b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC4357d f15159c;

    /* renamed from: d, reason: collision with root package name */
    public final C4362i f15160d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.camera.view.b f15161e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15162f;

    /* renamed from: g, reason: collision with root package name */
    public final E<e> f15163g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference<androidx.camera.view.a> f15164h;
    public final C4358e i;

    /* renamed from: j, reason: collision with root package name */
    public I f15165j;

    /* renamed from: k, reason: collision with root package name */
    public final b f15166k;

    /* renamed from: l, reason: collision with root package name */
    public final S3.b f15167l;

    /* renamed from: m, reason: collision with root package name */
    public final a f15168m;

    public class a implements W.c {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // C.W.c
        public final void c(k0 k0Var) {
            C4364k c4364k;
            if (!n.b()) {
                C5848a.getMainExecutor(PreviewView.this.getContext()).execute(new B.a(22, this, k0Var));
                return;
            }
            S.a("PreviewView", "Surface requested by Preview.");
            J j4 = k0Var.f735e;
            PreviewView.this.f15165j = j4.n();
            C4358e c4358e = PreviewView.this.i;
            Rect rectD = j4.f().d();
            c4358e.getClass();
            new Rational(rectD.width(), rectD.height());
            synchronized (c4358e) {
                c4358e.f37909b = rectD;
            }
            k0Var.c(C5848a.getMainExecutor(PreviewView.this.getContext()), new A0(this, j4, k0Var));
            PreviewView previewView = PreviewView.this;
            AbstractC4357d abstractC4357d = previewView.f15159c;
            c cVar = previewView.f15158b;
            if (!(abstractC4357d instanceof C4364k) || PreviewView.b(k0Var, cVar)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.b(k0Var, previewView2.f15158b)) {
                    PreviewView previewView3 = PreviewView.this;
                    C4366m c4366m = new C4366m(previewView3, previewView3.f15161e);
                    c4366m.i = false;
                    c4366m.f37935k = new AtomicReference<>();
                    c4364k = c4366m;
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    c4364k = new C4364k(previewView4, previewView4.f15161e);
                }
                previewView2.f15159c = c4364k;
            }
            I iN = j4.n();
            PreviewView previewView5 = PreviewView.this;
            androidx.camera.view.a aVar = new androidx.camera.view.a(iN, previewView5.f15163g, previewView5.f15159c);
            PreviewView.this.f15164h.set(aVar);
            j4.e().e(C5848a.getMainExecutor(PreviewView.this.getContext()), aVar);
            PreviewView.this.f15159c.e(k0Var, new D3.b(this, aVar, j4, 8));
            PreviewView previewView6 = PreviewView.this;
            if (previewView6.indexOfChild(previewView6.f15160d) == -1) {
                PreviewView previewView7 = PreviewView.this;
                previewView7.addView(previewView7.f15160d);
            }
        }
    }

    public enum c {
        PERFORMANCE(0),
        COMPATIBLE(1);

        private final int mId;

        c(int i) {
            this.mId = i;
        }

        public static c fromId(int i) {
            for (c cVar : values()) {
                if (cVar.mId == i) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException(C4356c.h(i, "Unknown implementation mode id "));
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum d {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        private final int mId;

        d(int i) {
            this.mId = i;
        }

        public static d fromId(int i) {
            for (d dVar : values()) {
                if (dVar.mId == i) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException(C4356c.h(i, "Unknown scale type id "));
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum e {
        IDLE,
        STREAMING
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        c cVar = f15157n;
        this.f15158b = cVar;
        androidx.camera.view.b bVar = new androidx.camera.view.b();
        bVar.f15184h = androidx.camera.view.b.i;
        this.f15161e = bVar;
        this.f15162f = true;
        this.f15163g = new E<>(e.IDLE);
        this.f15164h = new AtomicReference<>();
        this.i = new C4358e(bVar);
        this.f15166k = new b();
        this.f15167l = new S3.b(this, 1);
        this.f15168m = new a();
        n.a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = C4359f.f37910a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        L0.I.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setScaleType(d.fromId(typedArrayObtainStyledAttributes.getInteger(1, bVar.f15184h.getId())));
            setImplementationMode(c.fromId(typedArrayObtainStyledAttributes.getInteger(0, cVar.getId())));
            typedArrayObtainStyledAttributes.recycle();
            new C4356c(this);
            ViewConfiguration.get(context).getScaledTouchSlop();
            new GestureDetector(context, new C4404a(new C4405b()));
            if (getBackground() == null) {
                setBackgroundColor(C5848a.getColor(getContext(), R.color.black));
            }
            C4362i c4362i = new C4362i(context, null, 0, 0);
            c4362i.setBackgroundColor(-1);
            c4362i.setAlpha(0.0f);
            c4362i.setElevation(Float.MAX_VALUE);
            this.f15160d = c4362i;
            c4362i.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean b(k0 k0Var, c cVar) {
        boolean zEquals = k0Var.f735e.n().i().equals("androidx.camera.camera2.legacy");
        boolean z10 = (C4426a.f38281a.e(SurfaceViewStretchedQuirk.class) == null && C4426a.f38281a.e(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT > 24 && !zEquals && !z10) {
            int iOrdinal = cVar.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
            }
        }
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private J.g getScreenFlashInternal() {
        return this.f15160d.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(J.g gVar) {
        S.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public final void a() {
        Rect rect;
        Display display;
        I i;
        n.a();
        if (this.f15159c != null) {
            if (this.f15162f && (display = getDisplay()) != null && (i = this.f15165j) != null) {
                int iJ = i.j(display.getRotation());
                int rotation = display.getRotation();
                androidx.camera.view.b bVar = this.f15161e;
                if (bVar.f15183g) {
                    bVar.f15179c = iJ;
                    bVar.f15181e = rotation;
                }
            }
            this.f15159c.f();
        }
        C4358e c4358e = this.i;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        c4358e.getClass();
        n.a();
        synchronized (c4358e) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = c4358e.f37909b) != null) {
                    c4358e.f37908a.a(size, layoutDirection, rect);
                }
            } finally {
            }
        }
    }

    public Bitmap getBitmap() {
        Bitmap bitmapB;
        n.a();
        AbstractC4357d abstractC4357d = this.f15159c;
        if (abstractC4357d == null || (bitmapB = abstractC4357d.b()) == null) {
            return null;
        }
        FrameLayout frameLayout = abstractC4357d.f37905b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        androidx.camera.view.b bVar = abstractC4357d.f37906c;
        if (!bVar.f()) {
            return bitmapB;
        }
        Matrix matrixD = bVar.d();
        RectF rectFE = bVar.e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapB.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixD);
        matrix.postScale(rectFE.width() / bVar.f15177a.getWidth(), rectFE.height() / bVar.f15177a.getHeight());
        matrix.postTranslate(rectFE.left, rectFE.top);
        canvas.drawBitmap(bitmapB, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public AbstractC4354a getController() {
        n.a();
        return null;
    }

    public c getImplementationMode() {
        n.a();
        return this.f15158b;
    }

    public U getMeteringPointFactory() {
        n.a();
        return this.i;
    }

    public C5164a getOutputTransform() {
        Matrix matrixC;
        androidx.camera.view.b bVar = this.f15161e;
        n.a();
        try {
            matrixC = bVar.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixC = null;
        }
        Rect rect = bVar.f15178b;
        if (matrixC == null || rect == null) {
            S.a("PreviewView", "Transform info is not ready");
            return null;
        }
        RectF rectF = o.f1843a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(o.f1843a, rectF2, Matrix.ScaleToFit.FILL);
        matrixC.preConcat(matrix);
        if (this.f15159c instanceof C4366m) {
            matrixC.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            S.g("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new Size(rect.width(), rect.height());
        return new C5164a();
    }

    public C<e> getPreviewStreamState() {
        return this.f15163g;
    }

    public d getScaleType() {
        n.a();
        return this.f15161e.f15184h;
    }

    public J.g getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        n.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        androidx.camera.view.b bVar = this.f15161e;
        if (!bVar.f()) {
            return null;
        }
        Matrix matrix = new Matrix(bVar.f15180d);
        matrix.postConcat(bVar.c(size, layoutDirection));
        return matrix;
    }

    public W.c getSurfaceProvider() {
        n.a();
        return this.f15168m;
    }

    public n0 getViewPort() {
        n.a();
        if (getDisplay() == null) {
            return null;
        }
        getDisplay().getRotation();
        n.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        new Rational(getWidth(), getHeight());
        getViewPortScaleType();
        getLayoutDirection();
        return new n0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f15166k, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f15167l);
        AbstractC4357d abstractC4357d = this.f15159c;
        if (abstractC4357d != null) {
            abstractC4357d.c();
        }
        n.a();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f15167l);
        AbstractC4357d abstractC4357d = this.f15159c;
        if (abstractC4357d != null) {
            abstractC4357d.d();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f15166k);
    }

    public void setController(AbstractC4354a abstractC4354a) {
        n.a();
        n.a();
        getViewPort();
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(c cVar) {
        n.a();
        this.f15158b = cVar;
        c cVar2 = c.PERFORMANCE;
    }

    public void setScaleType(d dVar) {
        n.a();
        this.f15161e.f15184h = dVar;
        a();
        n.a();
        getViewPort();
    }

    public void setScreenFlashOverlayColor(int i) {
        this.f15160d.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        n.a();
        this.f15160d.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public class b implements DisplayManager.DisplayListener {
        public b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            PreviewView previewView = PreviewView.this;
            Display display = previewView.getDisplay();
            if (display == null || display.getDisplayId() != i) {
                return;
            }
            previewView.a();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }
}
