package O6;

import H6.C0675l;
import H6.T;
import K6.C0713c;
import N7.B8;
import N7.X2;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.NinePatch;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewOutlineProvider;
import b9.C2001h;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import h7.C4421b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.KotlinVersion;
import p9.InterfaceC5480a;

/* compiled from: DivBorderDrawer.kt */
/* renamed from: O6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1476b implements i7.k {

    /* renamed from: b, reason: collision with root package name */
    public final C0675l f10381b;

    /* renamed from: c, reason: collision with root package name */
    public final View f10382c;

    /* renamed from: d, reason: collision with root package name */
    public X2 f10383d;

    /* renamed from: e, reason: collision with root package name */
    public final C0116b f10384e;

    /* renamed from: f, reason: collision with root package name */
    public final b9.p f10385f;

    /* renamed from: g, reason: collision with root package name */
    public final b9.p f10386g;

    /* renamed from: h, reason: collision with root package name */
    public final c f10387h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float[] f10388j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10389k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10390l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10391m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10392n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10393o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f10394p;

    /* compiled from: DivBorderDrawer.kt */
    /* renamed from: O6.b$a */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Paint f10395a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f10396b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f10397c;

        /* renamed from: d, reason: collision with root package name */
        public final float f10398d;

        /* renamed from: e, reason: collision with root package name */
        public final float f10399e;

        /* renamed from: f, reason: collision with root package name */
        public final float f10400f;

        /* renamed from: g, reason: collision with root package name */
        public final RectF f10401g;

        public a() {
            Paint paint = new Paint();
            this.f10395a = paint;
            this.f10396b = new Path();
            this.f10398d = C0713c.D(Double.valueOf(0.5d), C1476b.this.f());
            this.f10399e = C0713c.D(6, C1476b.this.f());
            this.f10400f = C0713c.D(2, C1476b.this.f());
            this.f10401g = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    /* renamed from: O6.b$b, reason: collision with other inner class name */
    public final class C0116b {

        /* renamed from: a, reason: collision with root package name */
        public final Path f10403a = new Path();

        /* renamed from: b, reason: collision with root package name */
        public final RectF f10404b = new RectF();

        public C0116b() {
        }

        public final void a(float[] fArr) {
            RectF rectF = this.f10404b;
            C1476b c1476b = C1476b.this;
            rectF.set(0.0f, 0.0f, c1476b.f10382c.getWidth(), c1476b.f10382c.getHeight());
            Path path = this.f10403a;
            path.reset();
            path.addRoundRect(rectF, (float[]) fArr.clone(), Path.Direction.CW);
            path.close();
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    /* renamed from: O6.b$c */
    public static final class c extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public float f10406a;

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            kotlin.jvm.internal.l.f(view, "view");
            kotlin.jvm.internal.l.f(outline, "outline");
            int width = view.getWidth();
            int height = view.getHeight();
            float f10 = this.f10406a;
            float width2 = view.getWidth();
            float height2 = view.getHeight();
            float fMin = 0.0f;
            if (height2 > 0.0f && width2 > 0.0f) {
                float fMin2 = Math.min(height2, width2) / 2;
                if (f10 > fMin2) {
                    int i = C4421b.f38269a;
                    C4421b.a(C7.a.WARNING);
                }
                fMin = Math.min(f10, fMin2);
            }
            outline.setRoundRect(0, 0, width, height, fMin);
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    /* renamed from: O6.b$d */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final float f10407a;

        /* renamed from: b, reason: collision with root package name */
        public float f10408b;

        /* renamed from: c, reason: collision with root package name */
        public int f10409c;

        /* renamed from: d, reason: collision with root package name */
        public float f10410d;

        /* renamed from: e, reason: collision with root package name */
        public final Paint f10411e;

        /* renamed from: f, reason: collision with root package name */
        public final Rect f10412f;

        /* renamed from: g, reason: collision with root package name */
        public NinePatch f10413g;

        /* renamed from: h, reason: collision with root package name */
        public float f10414h;
        public float i;

        public d() throws Resources.NotFoundException {
            float dimension = C1476b.this.f10382c.getContext().getResources().getDimension(R.dimen.div_shadow_elevation);
            this.f10407a = dimension;
            this.f10408b = dimension;
            this.f10409c = -16777216;
            this.f10410d = 0.14f;
            this.f10411e = new Paint();
            this.f10412f = new Rect();
            this.i = 0.5f;
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    /* renamed from: O6.b$e */
    public static final class e extends kotlin.jvm.internal.m implements InterfaceC5480a<a> {
        public e() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final a invoke() {
            return C1476b.this.new a();
        }
    }

    /* compiled from: DivBorderDrawer.kt */
    /* renamed from: O6.b$f */
    public static final class f extends kotlin.jvm.internal.m implements InterfaceC5480a<d> {
        public f() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final d invoke() {
            return C1476b.this.new d();
        }
    }

    public C1476b(C0675l divView, View view) {
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10381b = divView;
        this.f10382c = view;
        this.f10384e = new C0116b();
        this.f10385f = C2001h.b(new e());
        this.f10386g = C2001h.b(new f());
        c cVar = new c();
        cVar.f10406a = 0.0f;
        this.f10387h = cVar;
        this.f10393o = true;
        this.f10394p = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e5  */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(N7.X2 r24, A7.d r25) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O6.C1476b.a(N7.X2, A7.d):void");
    }

    @Override // i7.k
    public final /* synthetic */ void b(j6.d dVar) {
        B8.c(this, dVar);
    }

    public final void c(Canvas canvas) {
        if (k()) {
            canvas.clipPath(this.f10384e.f10403a);
        }
    }

    public final void d(Canvas canvas) {
        if (this.f10390l) {
            b9.p pVar = this.f10385f;
            canvas.drawPath(((a) pVar.getValue()).f10396b, ((a) pVar.getValue()).f10395a);
        }
    }

    public final void e(Canvas canvas) {
        if (r7.s.e(this.f10382c) || !this.f10391m) {
            return;
        }
        float f10 = g().f10414h;
        float f11 = g().i;
        int iSave = canvas.save();
        canvas.translate(f10, f11);
        try {
            NinePatch ninePatch = g().f10413g;
            if (ninePatch != null) {
                ninePatch.draw(canvas, g().f10412f, g().f10411e);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final DisplayMetrics f() {
        DisplayMetrics displayMetrics = this.f10382c.getResources().getDisplayMetrics();
        kotlin.jvm.internal.l.e(displayMetrics, "view.resources.displayMetrics");
        return displayMetrics;
    }

    public final d g() {
        return (d) this.f10386g.getValue();
    }

    @Override // i7.k
    public final List<j6.d> getSubscriptions() {
        return this.f10394p;
    }

    @Override // i7.k
    public final /* synthetic */ void h() throws Exception {
        B8.d(this);
    }

    public final void i() {
        float[] fArr;
        byte b10;
        DashPathEffect dashPathEffect;
        float[] fArr2 = this.f10388j;
        if (fArr2 != null && (fArr = (float[]) fArr2.clone()) != null) {
            this.f10384e.a(fArr);
            float f10 = this.i / 2.0f;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                fArr[i] = Math.max(0.0f, fArr[i] - f10);
            }
            if (this.f10390l) {
                a aVar = (a) this.f10385f.getValue();
                aVar.getClass();
                C1476b c1476b = C1476b.this;
                float f11 = c1476b.i;
                float fMin = (f11 - Math.min(aVar.f10398d, Math.max(1.0f, 0.1f * f11))) / 2.0f;
                View view = c1476b.f10382c;
                float width = view.getWidth();
                float height = view.getHeight();
                RectF rectF = aVar.f10401g;
                rectF.set(fMin, fMin, width - fMin, height - fMin);
                Path path = aVar.f10396b;
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                Paint paint = aVar.f10395a;
                if (aVar.f10397c) {
                    float fWidth = rectF.width();
                    float fHeight = rectF.height();
                    float f12 = 2;
                    float fSqrt = (f12 * fHeight) + (fWidth * f12);
                    if (fArr.length != 8) {
                        int i10 = C4421b.f38269a;
                        C4421b.a(C7.a.ERROR);
                    } else {
                        int iP = B7.d.p(0, fArr.length - 1, 2);
                        if (iP >= 0) {
                            int i11 = 0;
                            while (true) {
                                float f13 = fArr[i11];
                                fSqrt = ((fSqrt - f13) - fArr[i11 + 1]) + ((float) (Math.sqrt(((r14 * r14) + (f13 * f13)) / 8.0d) * 3.141592653589793d));
                                if (i11 == iP) {
                                    break;
                                } else {
                                    i11 += 2;
                                }
                            }
                        }
                        if (fSqrt < 0.0f) {
                            fSqrt = 0.0f;
                        }
                    }
                    float f14 = aVar.f10400f;
                    float f15 = aVar.f10399e;
                    if (fSqrt > 0.0f) {
                        float f16 = f15 + f14;
                        float f17 = (int) (fSqrt / f16);
                        float f18 = fSqrt - (f16 * f17);
                        f15 += ((f18 * f15) / f16) / f17;
                        f14 += ((f18 * f14) / f16) / f17;
                    }
                    dashPathEffect = new DashPathEffect(new float[]{f15, f14}, 0.0f);
                } else {
                    dashPathEffect = null;
                }
                paint.setPathEffect(dashPathEffect);
            }
            if (this.f10391m) {
                d dVarG = g();
                dVarG.getClass();
                C1476b c1476b2 = C1476b.this;
                float f19 = 2;
                int width2 = (int) ((dVarG.f10408b * f19) + c1476b2.f10382c.getWidth());
                View view2 = c1476b2.f10382c;
                dVarG.f10412f.set(0, 0, width2, (int) ((dVarG.f10408b * f19) + view2.getHeight()));
                Paint paint2 = dVarG.f10411e;
                paint2.setColor(dVarG.f10409c);
                paint2.setAlpha((int) (view2.getAlpha() * dVarG.f10410d * KotlinVersion.MAX_COMPONENT_VALUE));
                Paint paint3 = T.f2108a;
                Context context = view2.getContext();
                kotlin.jvm.internal.l.e(context, "view.context");
                float f20 = dVarG.f10408b;
                LinkedHashMap linkedHashMap = T.f2109b;
                T.a aVar2 = new T.a(fArr, f20);
                Object ninePatch = linkedHashMap.get(aVar2);
                if (ninePatch == null) {
                    float fMax = Math.max(fArr[1] + fArr[2], fArr[5] + fArr[6]) + f20;
                    float fMax2 = Math.max(fArr[0] + fArr[7], fArr[3] + fArr[4]) + f20;
                    float fK = v9.h.K(f20, 1.0f, 25.0f);
                    float f21 = f20 <= 25.0f ? 1.0f : 25.0f / f20;
                    float f22 = f20 * f19;
                    int i12 = (int) ((fMax + f22) * f21);
                    int i13 = (int) ((f22 + fMax2) * f21);
                    Bitmap.Config config = Bitmap.Config.ALPHA_8;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, config);
                    kotlin.jvm.internal.l.e(bitmapCreateBitmap, "createBitmap(\n          ….Config.ALPHA_8\n        )");
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i12, i13, config);
                    kotlin.jvm.internal.l.e(bitmapCreateBitmap2, "createBitmap(\n          ….Config.ALPHA_8\n        )");
                    RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
                    roundRectShape.resize(fMax, fMax2);
                    Canvas canvas = new Canvas();
                    canvas.setBitmap(bitmapCreateBitmap);
                    int iSave = canvas.save();
                    canvas.translate(fK, fK);
                    try {
                        iSave = canvas.save();
                        canvas.scale(f21, f21, 0.0f, 0.0f);
                        try {
                            roundRectShape.draw(canvas, T.f2108a);
                            canvas.restoreToCount(iSave);
                            RenderScript renderScriptCreate = RenderScript.create(context);
                            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.A_8(renderScriptCreate));
                            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap2);
                            scriptIntrinsicBlurCreate.setRadius(fK);
                            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap2);
                            allocationCreateFromBitmap2.destroy();
                            allocationCreateFromBitmap.destroy();
                            scriptIntrinsicBlurCreate.destroy();
                            bitmapCreateBitmap.recycle();
                            if (f21 < 1.0f) {
                                b10 = 1;
                                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap2, (int) (bitmapCreateBitmap2.getWidth() / f21), (int) (bitmapCreateBitmap2.getHeight() / f21), true);
                                bitmapCreateBitmap2.recycle();
                                bitmapCreateBitmap2 = bitmapCreateScaledBitmap;
                            } else {
                                b10 = 1;
                            }
                            int width3 = bitmapCreateBitmap2.getWidth();
                            int height2 = bitmapCreateBitmap2.getHeight() / 2;
                            int i14 = width3 / 2;
                            ByteBuffer byteBufferOrder = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
                            byteBufferOrder.put(b10);
                            byteBufferOrder.put((byte) 2);
                            byteBufferOrder.put((byte) 2);
                            byteBufferOrder.put((byte) 9);
                            byteBufferOrder.putInt(0);
                            byteBufferOrder.putInt(0);
                            byteBufferOrder.putInt(0);
                            byteBufferOrder.putInt(0);
                            byteBufferOrder.putInt(0);
                            byteBufferOrder.putInt(0);
                            byteBufferOrder.putInt(0);
                            byteBufferOrder.putInt(i14 - 1);
                            byteBufferOrder.putInt(i14 + b10);
                            byteBufferOrder.putInt(height2 - 1);
                            byteBufferOrder.putInt(height2 + b10);
                            for (int i15 = 0; i15 < 9; i15++) {
                                byteBufferOrder.putInt(1);
                            }
                            byte[] bArrArray = byteBufferOrder.array();
                            kotlin.jvm.internal.l.e(bArrArray, "buffer.array()");
                            ninePatch = new NinePatch(bitmapCreateBitmap2, bArrArray);
                            linkedHashMap.put(aVar2, ninePatch);
                        } finally {
                            canvas.restoreToCount(iSave);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                dVarG.f10413g = (NinePatch) ninePatch;
            }
        }
        j();
    }

    public final void j() {
        float f10;
        boolean zK = k();
        ViewOutlineProvider viewOutlineProvider = null;
        View view = this.f10382c;
        if (zK) {
            view.setClipToOutline(false);
            if (!this.f10391m && !r7.s.e(view)) {
                viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
            }
            view.setOutlineProvider(viewOutlineProvider);
            return;
        }
        float[] fArr = this.f10388j;
        if (fArr == null) {
            f10 = 0.0f;
        } else {
            if (fArr.length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            f10 = fArr[0];
        }
        if (f10 != 0.0f) {
            c cVar = this.f10387h;
            cVar.f10406a = f10;
            view.setOutlineProvider(cVar);
            view.setClipToOutline(this.f10393o);
            return;
        }
        view.setClipToOutline(false);
        if (!this.f10391m && !r7.s.e(view)) {
            viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
        }
        view.setOutlineProvider(viewOutlineProvider);
    }

    public final boolean k() {
        if (!this.f10393o) {
            return false;
        }
        if (this.f10381b.getForceCanvasClipping() || this.f10391m) {
            return true;
        }
        return (!this.f10392n && (this.f10389k || this.f10390l)) || r7.s.e(this.f10382c);
    }

    @Override // H6.O
    public final void release() throws Exception {
        h();
    }
}
