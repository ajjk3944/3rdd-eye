package r7;

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
import t7.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {
    public static final Matrix B = new Matrix();
    public b A;

    /* renamed from: a, reason: collision with root package name */
    public Canvas f32868a;

    /* renamed from: b, reason: collision with root package name */
    public m f32869b;

    /* renamed from: c, reason: collision with root package name */
    public int f32870c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f32871d;

    /* renamed from: e, reason: collision with root package name */
    public RectF f32872e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f32873f;
    public RectF g;

    /* renamed from: h, reason: collision with root package name */
    public RectF f32874h;

    /* renamed from: i, reason: collision with root package name */
    public Rect f32875i;
    public RectF j;

    /* renamed from: k, reason: collision with root package name */
    public g7.a f32876k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f32877l;

    /* renamed from: m, reason: collision with root package name */
    public Canvas f32878m;

    /* renamed from: n, reason: collision with root package name */
    public Rect f32879n;

    /* renamed from: o, reason: collision with root package name */
    public g7.a f32880o;

    /* renamed from: p, reason: collision with root package name */
    public Matrix f32881p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f32882q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f32883r;

    /* renamed from: s, reason: collision with root package name */
    public Bitmap f32884s;

    /* renamed from: t, reason: collision with root package name */
    public Canvas f32885t;

    /* renamed from: u, reason: collision with root package name */
    public Canvas f32886u;

    /* renamed from: v, reason: collision with root package name */
    public g7.a f32887v;

    /* renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f32888w;

    /* renamed from: x, reason: collision with root package name */
    public float f32889x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    public RenderNode f32890y;

    /* renamed from: z, reason: collision with root package name */
    public RenderNode f32891z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, b bVar) {
        if (this.f32872e == null) {
            this.f32872e = new RectF();
        }
        if (this.g == null) {
            this.g = new RectF();
        }
        this.f32872e.set(rectF);
        this.f32872e.offsetTo(rectF.left + bVar.f32847b, rectF.top + bVar.f32848c);
        RectF rectF2 = this.f32872e;
        float f10 = bVar.f32846a;
        rectF2.inset(-f10, -f10);
        this.g.set(rectF);
        this.f32872e.union(this.g);
        return this.f32872e;
    }

    public final void c() {
        float f10;
        g7.a aVar;
        if (this.f32868a == null || this.f32869b == null || this.f32882q == null || this.f32871d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iC = i3.e.c(this.f32870c);
        if (iC == 0 || iC == 1) {
            this.f32868a.restore();
        } else {
            if (iC != 2) {
                if (iC == 3) {
                    if (this.f32890y == null) {
                        throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 < 29) {
                        throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                    }
                    this.f32868a.save();
                    Canvas canvas = this.f32868a;
                    float[] fArr = this.f32882q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.f32890y.endRecording();
                    if (this.f32869b.o()) {
                        Canvas canvas2 = this.f32868a;
                        b bVar = (b) this.f32869b.f34474c;
                        if (this.f32890y == null || this.f32891z == null) {
                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                        }
                        if (i4 < 31) {
                            throw new RuntimeException("RenderEffect is not supported on API level <31");
                        }
                        float[] fArr2 = this.f32882q;
                        float f11 = fArr2 != null ? fArr2[0] : 1.0f;
                        f10 = fArr2 != null ? fArr2[4] : 1.0f;
                        b bVar2 = this.A;
                        if (bVar2 == null || bVar.f32846a != bVar2.f32846a || bVar.f32847b != bVar2.f32847b || bVar.f32848c != bVar2.f32848c || bVar.f32849d != bVar2.f32849d) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(bVar.f32849d, PorterDuff.Mode.SRC_IN));
                            float f12 = bVar.f32846a;
                            if (f12 > 0.0f) {
                                float f13 = ((f11 + f10) * f12) / 2.0f;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(f13, f13, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.f32891z.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.A = bVar;
                        }
                        RectF rectFB = b(this.f32871d, bVar);
                        RectF rectF = new RectF(rectFB.left * f11, rectFB.top * f10, rectFB.right * f11, rectFB.bottom * f10);
                        this.f32891z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.f32891z.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((bVar.f32847b * f11) + (-rectF.left), (bVar.f32848c * f10) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.f32890y);
                        this.f32891z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.f32891z);
                        canvas2.restore();
                    }
                    this.f32868a.drawRenderNode(this.f32890y);
                    this.f32868a.restore();
                }
            } else {
                if (this.f32877l == null) {
                    throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                }
                if (this.f32869b.o()) {
                    Canvas canvas3 = this.f32868a;
                    b bVar3 = (b) this.f32869b.f34474c;
                    RectF rectF2 = this.f32871d;
                    if (rectF2 == null || this.f32877l == null) {
                        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                    }
                    RectF rectFB2 = b(rectF2, bVar3);
                    if (this.f32873f == null) {
                        this.f32873f = new Rect();
                    }
                    this.f32873f.set((int) Math.floor(rectFB2.left), (int) Math.floor(rectFB2.top), (int) Math.ceil(rectFB2.right), (int) Math.ceil(rectFB2.bottom));
                    float[] fArr3 = this.f32882q;
                    float f14 = fArr3 != null ? fArr3[0] : 1.0f;
                    f10 = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.f32874h == null) {
                        this.f32874h = new RectF();
                    }
                    this.f32874h.set(rectFB2.left * f14, rectFB2.top * f10, rectFB2.right * f14, rectFB2.bottom * f10);
                    if (this.f32875i == null) {
                        this.f32875i = new Rect();
                    }
                    this.f32875i.set(0, 0, Math.round(this.f32874h.width()), Math.round(this.f32874h.height()));
                    if (d(this.f32883r, this.f32874h)) {
                        Bitmap bitmap = this.f32883r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.f32884s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.f32883r = a(this.f32874h, Bitmap.Config.ARGB_8888);
                        this.f32884s = a(this.f32874h, Bitmap.Config.ALPHA_8);
                        this.f32885t = new Canvas(this.f32883r);
                        this.f32886u = new Canvas(this.f32884s);
                    } else {
                        Canvas canvas4 = this.f32885t;
                        if (canvas4 == null || this.f32886u == null || (aVar = this.f32880o) == null) {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                        }
                        canvas4.drawRect(this.f32875i, aVar);
                        this.f32886u.drawRect(this.f32875i, this.f32880o);
                    }
                    if (this.f32884s == null) {
                        throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                    }
                    if (this.f32887v == null) {
                        this.f32887v = new g7.a(1, 0);
                    }
                    RectF rectF3 = this.f32871d;
                    this.f32886u.drawBitmap(this.f32877l, Math.round((rectF3.left - rectFB2.left) * f14), Math.round((rectF3.top - rectFB2.top) * f10), (Paint) null);
                    if (this.f32888w == null || this.f32889x != bVar3.f32846a) {
                        float f15 = ((f14 + f10) * bVar3.f32846a) / 2.0f;
                        if (f15 > 0.0f) {
                            this.f32888w = new BlurMaskFilter(f15, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.f32888w = null;
                        }
                        this.f32889x = bVar3.f32846a;
                    }
                    this.f32887v.setColor(bVar3.f32849d);
                    if (bVar3.f32846a > 0.0f) {
                        this.f32887v.setMaskFilter(this.f32888w);
                    } else {
                        this.f32887v.setMaskFilter(null);
                    }
                    this.f32887v.setFilterBitmap(true);
                    this.f32885t.drawBitmap(this.f32884s, Math.round(bVar3.f32847b * f14), Math.round(bVar3.f32848c * f10), this.f32887v);
                    canvas3.drawBitmap(this.f32883r, this.f32875i, this.f32873f, this.f32876k);
                }
                if (this.f32879n == null) {
                    this.f32879n = new Rect();
                }
                this.f32879n.set(0, 0, (int) (this.f32871d.width() * this.f32882q[0]), (int) (this.f32871d.height() * this.f32882q[4]));
                this.f32868a.drawBitmap(this.f32877l, this.f32879n, this.f32871d, this.f32876k);
            }
        }
        this.f32868a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, m mVar) {
        if (this.f32868a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f32882q == null) {
            this.f32882q = new float[9];
        }
        if (this.f32881p == null) {
            this.f32881p = new Matrix();
        }
        canvas.getMatrix(this.f32881p);
        this.f32881p.getValues(this.f32882q);
        float[] fArr = this.f32882q;
        float f10 = fArr[0];
        int i4 = 4;
        float f11 = fArr[4];
        if (this.j == null) {
            this.j = new RectF();
        }
        this.j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
        this.f32868a = canvas;
        this.f32869b = mVar;
        if (mVar.f34473b >= 255 && !mVar.o()) {
            i4 = 1;
        } else if (mVar.o()) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 29 || !canvas.isHardwareAccelerated() || i10 <= 31) {
                i4 = 3;
            }
        } else {
            i4 = 2;
        }
        this.f32870c = i4;
        if (this.f32871d == null) {
            this.f32871d = new RectF();
        }
        this.f32871d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f32876k == null) {
            this.f32876k = new g7.a();
        }
        this.f32876k.reset();
        int iC = i3.e.c(this.f32870c);
        if (iC == 0) {
            canvas.save();
            return canvas;
        }
        if (iC == 1) {
            this.f32876k.setAlpha(mVar.f34473b);
            this.f32876k.setColorFilter(null);
            g7.a aVar = this.f32876k;
            Matrix matrix = j.f32892a;
            canvas.saveLayer(rectF, aVar);
            return canvas;
        }
        Matrix matrix2 = B;
        if (iC == 2) {
            if (this.f32880o == null) {
                g7.a aVar2 = new g7.a();
                this.f32880o = aVar2;
                aVar2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.f32877l, this.j)) {
                Bitmap bitmap = this.f32877l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f32877l = a(this.j, Bitmap.Config.ARGB_8888);
                this.f32878m = new Canvas(this.f32877l);
            } else {
                Canvas canvas2 = this.f32878m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(matrix2);
                this.f32878m.drawRect(-1.0f, -1.0f, this.j.width() + 1.0f, this.j.height() + 1.0f, this.f32880o);
            }
            v3.c.a(0, this.f32876k);
            this.f32876k.setColorFilter(null);
            this.f32876k.setAlpha(mVar.f34473b);
            Canvas canvas3 = this.f32878m;
            canvas3.scale(f10, f11);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iC != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f32890y == null) {
            this.f32890y = new RenderNode("OffscreenLayer.main");
        }
        if (mVar.o() && this.f32891z == null) {
            this.f32891z = new RenderNode("OffscreenLayer.shadow");
            this.A = null;
        }
        this.f32890y.setAlpha(mVar.f34473b / 255.0f);
        if (mVar.o()) {
            RenderNode renderNode = this.f32891z;
            if (renderNode == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode.setAlpha(mVar.f34473b / 255.0f);
        }
        this.f32890y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.f32890y;
        RectF rectF2 = this.j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f32890y.beginRecording((int) this.j.width(), (int) this.j.height());
        recordingCanvasBeginRecording.setMatrix(matrix2);
        recordingCanvasBeginRecording.scale(f10, f11);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
