package e9;

import a9.l;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;

/* loaded from: classes.dex */
public final class i {
    public static final Matrix B = new Matrix();
    public a A;

    /* renamed from: a, reason: collision with root package name */
    public Canvas f7995a;

    /* renamed from: b, reason: collision with root package name */
    public ag.b f7996b;

    /* renamed from: c, reason: collision with root package name */
    public h f7997c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f7998d;

    /* renamed from: e, reason: collision with root package name */
    public RectF f7999e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f8000f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f8001g;

    /* renamed from: h, reason: collision with root package name */
    public RectF f8002h;

    /* renamed from: i, reason: collision with root package name */
    public Rect f8003i;
    public RectF j;
    public l k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f8004l;

    /* renamed from: m, reason: collision with root package name */
    public Canvas f8005m;

    /* renamed from: n, reason: collision with root package name */
    public Rect f8006n;

    /* renamed from: o, reason: collision with root package name */
    public l f8007o;

    /* renamed from: p, reason: collision with root package name */
    public Matrix f8008p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f8009q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f8010r;

    /* renamed from: s, reason: collision with root package name */
    public Bitmap f8011s;

    /* renamed from: t, reason: collision with root package name */
    public Canvas f8012t;

    /* renamed from: u, reason: collision with root package name */
    public Canvas f8013u;

    /* renamed from: v, reason: collision with root package name */
    public l f8014v;

    /* renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f8015w;

    /* renamed from: x, reason: collision with root package name */
    public float f8016x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    public RenderNode f8017y;

    /* renamed from: z, reason: collision with root package name */
    public RenderNode f8018z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, a aVar) {
        if (this.f7999e == null) {
            this.f7999e = new RectF();
        }
        if (this.f8001g == null) {
            this.f8001g = new RectF();
        }
        this.f7999e.set(rectF);
        this.f7999e.offsetTo(rectF.left + aVar.f7977b, rectF.top + aVar.f7978c);
        RectF rectF2 = this.f7999e;
        float f10 = aVar.f7976a;
        rectF2.inset(-f10, -f10);
        this.f8001g.set(rectF);
        this.f7999e.union(this.f8001g);
        return this.f7999e;
    }

    public final void c() {
        float f10;
        l lVar;
        if (this.f7995a == null || this.f7996b == null || this.f8009q == null || this.f7998d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iOrdinal = this.f7997c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.f7995a.restore();
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (this.f8017y == null) {
                        throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                    }
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 < 29) {
                        throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                    }
                    this.f7995a.save();
                    Canvas canvas = this.f7995a;
                    float[] fArr = this.f8009q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.f8017y.endRecording();
                    if (this.f7996b.h()) {
                        Canvas canvas2 = this.f7995a;
                        a aVar = (a) this.f7996b.f346g;
                        if (this.f8017y == null || this.f8018z == null) {
                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                        }
                        if (i10 < 31) {
                            throw new RuntimeException("RenderEffect is not supported on API level <31");
                        }
                        float[] fArr2 = this.f8009q;
                        float f11 = fArr2 != null ? fArr2[0] : 1.0f;
                        f10 = fArr2 != null ? fArr2[4] : 1.0f;
                        a aVar2 = this.A;
                        if (aVar2 == null || aVar.f7976a != aVar2.f7976a || aVar.f7977b != aVar2.f7977b || aVar.f7978c != aVar2.f7978c || aVar.f7979d != aVar2.f7979d) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(aVar.f7979d, PorterDuff.Mode.SRC_IN));
                            float f12 = aVar.f7976a;
                            if (f12 > 0.0f) {
                                float f13 = ((f11 + f10) * f12) / 2.0f;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(f13, f13, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.f8018z.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.A = aVar;
                        }
                        RectF rectFB = b(this.f7998d, aVar);
                        RectF rectF = new RectF(rectFB.left * f11, rectFB.top * f10, rectFB.right * f11, rectFB.bottom * f10);
                        this.f8018z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.f8018z.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((aVar.f7977b * f11) + (-rectF.left), (aVar.f7978c * f10) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.f8017y);
                        this.f8018z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.f8018z);
                        canvas2.restore();
                    }
                    this.f7995a.drawRenderNode(this.f8017y);
                    this.f7995a.restore();
                }
            } else {
                if (this.f8004l == null) {
                    throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                }
                if (this.f7996b.h()) {
                    Canvas canvas3 = this.f7995a;
                    a aVar3 = (a) this.f7996b.f346g;
                    RectF rectF2 = this.f7998d;
                    if (rectF2 == null || this.f8004l == null) {
                        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                    }
                    RectF rectFB2 = b(rectF2, aVar3);
                    if (this.f8000f == null) {
                        this.f8000f = new Rect();
                    }
                    this.f8000f.set((int) Math.floor(rectFB2.left), (int) Math.floor(rectFB2.top), (int) Math.ceil(rectFB2.right), (int) Math.ceil(rectFB2.bottom));
                    float[] fArr3 = this.f8009q;
                    float f14 = fArr3 != null ? fArr3[0] : 1.0f;
                    f10 = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.f8002h == null) {
                        this.f8002h = new RectF();
                    }
                    this.f8002h.set(rectFB2.left * f14, rectFB2.top * f10, rectFB2.right * f14, rectFB2.bottom * f10);
                    if (this.f8003i == null) {
                        this.f8003i = new Rect();
                    }
                    this.f8003i.set(0, 0, Math.round(this.f8002h.width()), Math.round(this.f8002h.height()));
                    if (d(this.f8010r, this.f8002h)) {
                        Bitmap bitmap = this.f8010r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.f8011s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.f8010r = a(this.f8002h, Bitmap.Config.ARGB_8888);
                        this.f8011s = a(this.f8002h, Bitmap.Config.ALPHA_8);
                        this.f8012t = new Canvas(this.f8010r);
                        this.f8013u = new Canvas(this.f8011s);
                    } else {
                        Canvas canvas4 = this.f8012t;
                        if (canvas4 == null || this.f8013u == null || (lVar = this.f8007o) == null) {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                        }
                        canvas4.drawRect(this.f8003i, lVar);
                        this.f8013u.drawRect(this.f8003i, this.f8007o);
                    }
                    if (this.f8011s == null) {
                        throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                    }
                    if (this.f8014v == null) {
                        this.f8014v = new l(1, 2);
                    }
                    RectF rectF3 = this.f7998d;
                    this.f8013u.drawBitmap(this.f8004l, Math.round((rectF3.left - rectFB2.left) * f14), Math.round((rectF3.top - rectFB2.top) * f10), (Paint) null);
                    if (this.f8015w == null || this.f8016x != aVar3.f7976a) {
                        float f15 = ((f14 + f10) * aVar3.f7976a) / 2.0f;
                        if (f15 > 0.0f) {
                            this.f8015w = new BlurMaskFilter(f15, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.f8015w = null;
                        }
                        this.f8016x = aVar3.f7976a;
                    }
                    this.f8014v.setColor(aVar3.f7979d);
                    if (aVar3.f7976a > 0.0f) {
                        this.f8014v.setMaskFilter(this.f8015w);
                    } else {
                        this.f8014v.setMaskFilter(null);
                    }
                    this.f8014v.setFilterBitmap(true);
                    this.f8012t.drawBitmap(this.f8011s, Math.round(aVar3.f7977b * f14), Math.round(aVar3.f7978c * f10), this.f8014v);
                    canvas3.drawBitmap(this.f8010r, this.f8003i, this.f8000f, this.k);
                }
                if (this.f8006n == null) {
                    this.f8006n = new Rect();
                }
                this.f8006n.set(0, 0, (int) (this.f7998d.width() * this.f8009q[0]), (int) (this.f7998d.height() * this.f8009q[4]));
                this.f7995a.drawBitmap(this.f8004l, this.f8006n, this.f7998d, this.k);
            }
        }
        this.f7995a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, ag.b bVar) {
        h hVar;
        if (this.f7995a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f8009q == null) {
            this.f8009q = new float[9];
        }
        if (this.f8008p == null) {
            this.f8008p = new Matrix();
        }
        canvas.getMatrix(this.f8008p);
        this.f8008p.getValues(this.f8009q);
        float[] fArr = this.f8009q;
        float f10 = fArr[0];
        float f11 = fArr[4];
        if (this.j == null) {
            this.j = new RectF();
        }
        this.j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
        this.f7995a = canvas;
        this.f7996b = bVar;
        if (bVar.f345d >= 255 && !bVar.h()) {
            hVar = h.DIRECT;
        } else if (bVar.h()) {
            int i10 = Build.VERSION.SDK_INT;
            hVar = (i10 < 29 || !canvas.isHardwareAccelerated() || i10 <= 31) ? h.BITMAP : h.RENDER_NODE;
        } else {
            hVar = h.SAVE_LAYER;
        }
        this.f7997c = hVar;
        if (this.f7998d == null) {
            this.f7998d = new RectF();
        }
        this.f7998d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.k == null) {
            this.k = new l();
        }
        this.k.reset();
        int iOrdinal = this.f7997c.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.k.setAlpha(bVar.f345d);
            this.k.setColorFilter(null);
            j.e(canvas, rectF, this.k);
            return canvas;
        }
        Matrix matrix = B;
        if (iOrdinal == 2) {
            if (this.f8007o == null) {
                l lVar = new l();
                this.f8007o = lVar;
                lVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.f8004l, this.j)) {
                Bitmap bitmap = this.f8004l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f8004l = a(this.j, Bitmap.Config.ARGB_8888);
                this.f8005m = new Canvas(this.f8004l);
            } else {
                Canvas canvas2 = this.f8005m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(matrix);
                this.f8005m.drawRect(-1.0f, -1.0f, this.j.width() + 1.0f, this.j.height() + 1.0f, this.f8007o);
            }
            k3.e.a(this.k, null);
            this.k.setColorFilter(null);
            this.k.setAlpha(bVar.f345d);
            Canvas canvas3 = this.f8005m;
            canvas3.scale(f10, f11);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iOrdinal != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f8017y == null) {
            this.f8017y = a2.b.f();
        }
        if (bVar.h() && this.f8018z == null) {
            this.f8018z = a2.b.B();
            this.A = null;
        }
        this.f8017y.setAlpha(bVar.f345d / 255.0f);
        if (bVar.h()) {
            RenderNode renderNode = this.f8018z;
            if (renderNode == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode.setAlpha(bVar.f345d / 255.0f);
        }
        this.f8017y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.f8017y;
        RectF rectF2 = this.j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f8017y.beginRecording((int) this.j.width(), (int) this.j.height());
        recordingCanvasBeginRecording.setMatrix(matrix);
        recordingCanvasBeginRecording.scale(f10, f11);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
