package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Mesh;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.os.Build;
import br.l;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f11977a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f11978b = new Paint();

    /* renamed from: c, reason: collision with root package name */
    public final Paint f11979c = new Paint();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f11980d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f11981e;

    /* renamed from: f, reason: collision with root package name */
    public final Canvas f11982f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f11983g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f11984h;

    public g() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        l.d(bitmapCreateBitmap, "createBitmap(...)");
        this.f11981e = bitmapCreateBitmap;
        this.f11982f = new Canvas(bitmapCreateBitmap);
        this.f11983g = new Rect(0, 0, 1, 1);
        this.f11984h = new WeakHashMap();
    }

    public static BitmapShader c(Paint paint) {
        if (paint != null) {
            Shader shader = paint.getShader();
            if (shader instanceof BitmapShader) {
                paint.setShader(null);
                return (BitmapShader) shader;
            }
        }
        return null;
    }

    public final void a(float f10, float f11, Paint paint) {
        ColorFilter colorFilter = paint.getColorFilter();
        Paint paint2 = this.f11979c;
        paint2.setColorFilter(colorFilter);
        int color = paint.getColor();
        paint2.setColor(Color.argb(100, Color.red(color), Color.green(color), Color.blue(color)));
        Rect rect = this.f11980d;
        drawRoundRect(rect.left + f10, rect.top + f11, rect.right + f10, rect.bottom + f11, 10.0f, 10.0f, paint2);
    }

    public final Canvas b() {
        Canvas canvas = this.f11977a;
        if (canvas != null) {
            return canvas;
        }
        l.l("delegate");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        l.e(path, "path");
        return b().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        l.e(rectF, "rect");
        return b().clipOutRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        l.e(path, "path");
        l.e(op, "op");
        return b().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        l.e(rectF, "rect");
        l.e(op, "op");
        return b().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        b().concat(matrix);
    }

    public final int d(Bitmap bitmap, Paint paint, Rect rect) {
        int pixel = -16777216;
        if (bitmap.isRecycled()) {
            return -16777216;
        }
        WeakHashMap weakHashMap = this.f11984h;
        lq.l lVar = (lq.l) weakHashMap.get(bitmap);
        if (lVar != null && ((Number) lVar.f15571a).intValue() == bitmap.getGenerationId()) {
            return ((Number) lVar.f15572d).intValue();
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        Bitmap bitmap2 = this.f11981e;
        Rect rect2 = this.f11983g;
        Canvas canvas = this.f11982f;
        if (config == config2 && Build.VERSION.SDK_INT >= 31) {
            BitmapShader bitmapShaderC = c(paint);
            canvas.drawBitmap(bitmap.asShared(), rect, rect2, paint);
            if (bitmapShaderC != null && paint != null) {
                paint.setShader(bitmapShaderC);
            }
            pixel = bitmap2.getPixel(0, 0);
        } else if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
            BitmapShader bitmapShaderC2 = c(paint);
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            if (bitmapShaderC2 != null && paint != null) {
                paint.setShader(bitmapShaderC2);
            }
            pixel = bitmap2.getPixel(0, 0);
        }
        weakHashMap.put(bitmap, new lq.l(Integer.valueOf(bitmap.getGenerationId()), Integer.valueOf(pixel)));
        return pixel;
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        b().disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i10, int i11, int i12, int i13) {
        b().drawARGB(i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        l.e(rectF, "oval");
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawArc(rectF, f10, f11, z10, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, float f10, float f11, int i12, int i13, boolean z10, Paint paint) {
        l.e(iArr, "colors");
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        l.e(bitmap, "bitmap");
        l.e(fArr, "verts");
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f10, float f11, float f12, Paint paint) {
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawCircle(f10, f11, f12, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10) {
        b().drawColor(i10);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        l.e(rectF, "outer");
        l.e(rectF2, "inner");
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        l.e(iArr, "glyphIds");
        l.e(fArr, "positions");
        l.e(font, "font");
        l.e(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawLine(f10, f11, f12, f13, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        l.e(fArr, "pts");
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawLines(fArr, i10, i11, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawMesh(Mesh mesh, BlendMode blendMode, Paint paint) {
        l.e(mesh, "mesh");
        l.e(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        l.e(rectF, "oval");
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawOval(rectF, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPaint(paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        l.e(ninePatch, "patch");
        l.e(rect, "dst");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPatch(ninePatch, rect, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        l.e(path, "path");
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPath(path, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        l.e(picture, "picture");
        Paint paint = this.f11978b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f10, float f11, Paint paint) {
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPoint(f10, f11, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPoints(fArr, i10, i11, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        l.e(str, "text");
        l.e(fArr, "pos");
        l.e(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i10, int i11, int i12) {
        b().drawRGB(i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        l.e(rectF, "rect");
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRect(rectF, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        l.e(renderNode, "renderNode");
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        l.e(rectF, "rect");
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRoundRect(rectF, f10, f11, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i10, int i11, float f10, float f11, Paint paint) {
        l.e(cArr, "text");
        l.e(paint, "paint");
        paint.getTextBounds(cArr, i10, i11, this.f11980d);
        a(f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        l.e(str, "text");
        l.e(path, "path");
        l.e(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        l.e(cArr, "text");
        l.e(paint, "paint");
        paint.getTextBounds(cArr, 0, i10 + i11, this.f11980d);
        a(f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        l.e(vertexMode, "mode");
        l.e(fArr, "verts");
        l.e(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        b().enableZ();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        l.e(rect, "bounds");
        return b().getClipBounds(rect);
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return b().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return b().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return b().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        l.e(matrix, "ctm");
        b().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return b().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return b().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return b().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return b().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isHardwareAccelerated() {
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return b().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        l.e(rectF, "rect");
        l.e(edgeType, "type");
        return b().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        b().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i10) {
        b().restoreToCount(i10);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f10) {
        b().rotate(f10);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return b().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i10) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(rectF, paint, i10);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10, int i11) {
        return b().saveLayerAlpha(rectF, i10, i11);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f10, float f11) {
        b().scale(f10, f11);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        b().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i10) {
        b().setDensity(i10);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        b().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        b().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f10, float f11) {
        b().skew(f10, f11);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f10, float f11) {
        b().translate(f10, f11);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        l.e(rect, "rect");
        return b().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        l.e(path, "path");
        return b().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        l.e(rect, "rect");
        l.e(op, "op");
        return b().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Paint paint) {
        l.e(iArr, "colors");
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        b().drawColor(j);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        l.e(cArr, "text");
        l.e(fArr, "pos");
        l.e(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f10, float f11, Paint paint) {
        l.e(cArr, "text");
        l.e(path, "path");
        l.e(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        l.e(rectF, "rect");
        return b().quickReject(rectF);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10) {
        return b().saveLayerAlpha(rectF, i10);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f10, float f11, float f12, float f13) {
        return b().clipOutRect(f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        l.e(rectF, "rect");
        return b().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        l.e(bitmap, "bitmap");
        int iD = d(bitmap, paint, null);
        Paint paint2 = this.f11978b;
        paint2.setColor(iD);
        paint2.setColorFilter(null);
        b().drawRect(f10, f11, f10 + bitmap.getWidth(), f11 + bitmap.getHeight(), paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, PorterDuff.Mode mode) {
        l.e(mode, "mode");
        b().drawColor(i10, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f10, float f11, Paint paint) {
        l.e(str, "text");
        l.e(paint, "paint");
        paint.getTextBounds(str, 0, str.length(), this.f11980d);
        a(f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        l.e(charSequence, "text");
        l.e(paint, "paint");
        paint.getTextBounds(charSequence.toString(), i10, i11, this.f11980d);
        a(f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        l.e(path, "path");
        l.e(edgeType, "type");
        return b().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10, int i11) {
        return b().saveLayerAlpha(f10, f11, f12, f13, i10, i11);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i10, int i11, int i12, int i13) {
        return b().clipOutRect(i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        l.e(rect, "rect");
        return b().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, BlendMode blendMode) {
        l.e(blendMode, "mode");
        b().drawColor(i10, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        l.e(rectF, "outer");
        l.e(fArr, "outerRadii");
        l.e(rectF2, "inner");
        l.e(fArr2, "innerRadii");
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        l.e(fArr, "pts");
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawLines(fArr, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawOval(f10, f11, f12, f13, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        l.e(ninePatch, "patch");
        l.e(rectF, "dst");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPatch(ninePatch, rectF, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        l.e(picture, "picture");
        l.e(rectF, "dst");
        Paint paint = this.f11978b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        l.e(fArr, "pts");
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPoints(fArr, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        l.e(rect, "r");
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRect(rect, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        l.e(path, "path");
        return b().quickReject(path);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(rectF, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10) {
        return b().saveLayerAlpha(f10, f11, f12, f13, i10);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op) {
        l.e(op, "op");
        return b().clipRect(f10, f11, f12, f13, op);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode blendMode) {
        l.e(blendMode, "mode");
        b().drawColor(j, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i10, int i11, float f10, float f11, Paint paint) {
        l.e(str, "text");
        l.e(paint, "paint");
        paint.getTextBounds(str, i10, i11, this.f11980d);
        a(f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        l.e(measuredText, "text");
        l.e(paint, "paint");
        paint.getTextBounds(measuredText.toString(), i10, i11, this.f11980d);
        a(f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        l.e(edgeType, "type");
        return b().quickReject(f10, f11, f12, f13, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13) {
        return b().clipRect(f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f10, float f11, float f12, float f13) {
        return b().quickReject(f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i10, int i11, int i12, int i13) {
        return b().clipRect(i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        l.e(bitmap, "bitmap");
        l.e(rectF, "dst");
        int iD = d(bitmap, paint, rect);
        Paint paint2 = this.f11978b;
        paint2.setColor(iD);
        paint2.setColorFilter(null);
        b().drawRect(rectF, paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        l.e(picture, "picture");
        l.e(rect, "dst");
        Paint paint = this.f11978b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        l.e(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRect(f10, f11, f12, f13, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i10, int i11, float f10, float f11, Paint paint) {
        l.e(charSequence, "text");
        l.e(paint, "paint");
        paint.getTextBounds(charSequence.toString(), 0, charSequence.length(), this.f11980d);
        a(f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i10) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(f10, f11, f12, f13, paint, i10);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(f10, f11, f12, f13, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        l.e(bitmap, "bitmap");
        l.e(rect2, "dst");
        int iD = d(bitmap, paint, rect);
        Paint paint2 = this.f11978b;
        paint2.setColor(iD);
        paint2.setColorFilter(null);
        b().drawRect(rect2, paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        l.e(bitmap, "bitmap");
        l.e(matrix, "matrix");
        int iD = d(bitmap, paint, null);
        Paint paint2 = this.f11978b;
        paint2.setColor(iD);
        paint2.setColorFilter(null);
        int iSave = b().save();
        b().setMatrix(matrix);
        b().drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint2);
        b().restoreToCount(iSave);
    }
}
