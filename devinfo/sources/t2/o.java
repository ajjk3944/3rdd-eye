package t2;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f34139a;

    public final Canvas a() {
        Canvas canvas = this.f34139a;
        if (canvas != null) {
            return canvas;
        }
        x2.a.c("Text drawing wrapper is missing a Canvas!");
        throw new ac.m();
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        return c.a(a(), path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        return c.e(a(), rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        return a().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        return a().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        a().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        d.a(a());
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i4, int i10, int i11, int i12) {
        a().drawARGB(i4, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f10, float f11, boolean z3, Paint paint) {
        a().drawArc(rectF, f10, f11, z3, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        a().drawBitmap(bitmap, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i4, int i10, float[] fArr, int i11, int[] iArr, int i12, Paint paint) {
        a().drawBitmapMesh(bitmap, i4, i10, fArr, i11, iArr, i12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f10, float f11, float f12, Paint paint) {
        a().drawCircle(f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i4) {
        a().drawColor(i4);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        d.e(a(), rectF, f10, f11, rectF2, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i4, float[] fArr, int i10, int i11, Font font, Paint paint) {
        f.a(a(), iArr, i4, fArr, i10, i11, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        a().drawLine(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i4, int i10, Paint paint) {
        a().drawLines(fArr, i4, i10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        a().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        a().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        f.b(a(), ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        a().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        a().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f10, float f11, Paint paint) {
        a().drawPoint(f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i4, int i10, Paint paint) {
        a().drawPoints(fArr, i4, i10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i4, int i10, float[] fArr, Paint paint) {
        a().drawPosText(cArr, i4, i10, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i4, int i10, int i11) {
        a().drawRGB(i4, i10, i11);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        a().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        d.g(a(), renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        a().drawRoundRect(rectF, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i4, int i10, float f10, float f11, Paint paint) {
        a().drawText(cArr, i4, i10, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i4, int i10, Path path, float f10, float f11, Paint paint) {
        a().drawTextOnPath(cArr, i4, i10, path, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i4, int i10, int i11, int i12, float f10, float f11, boolean z3, Paint paint) {
        a().drawTextRun(cArr, i4, i10, i11, i12, f10, f11, z3, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i4, float[] fArr, int i10, float[] fArr2, int i11, int[] iArr, int i12, short[] sArr, int i13, int i14, Paint paint) {
        a().drawVertices(vertexMode, i4, fArr, i10, fArr2, i11, iArr, i12, sArr, i13, i14, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        d.i(a());
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        boolean clipBounds = a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return a().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return a().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return a().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        a().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return a().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return a().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return a().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return a().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return a().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return a().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        a().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i4) {
        a().restoreToCount(i4);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f10) {
        a().rotate(f10);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return a().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i4) {
        return a().saveLayer(rectF, paint, i4);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i4, int i10) {
        return a().saveLayerAlpha(rectF, i4, i10);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f10, float f11) {
        a().scale(f10, f11);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        a().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i4) {
        a().setDensity(i4);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        a().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        a().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f10, float f11) {
        a().skew(f10, f11);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f10, float f11) {
        a().translate(f10, f11);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        return c.d(a(), rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        return a().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        return a().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z3, Paint paint) {
        a().drawArc(f10, f11, f12, f13, f14, f15, z3, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        a().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        d.c(a(), j);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        a().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        a().drawOval(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        f.c(a(), ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        a().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        a().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        a().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        a().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        a().drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f10, float f11, Paint paint) {
        a().drawText(str, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        a().drawTextOnPath(str, path, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        return e.c(a(), rectF);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        return a().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i4) {
        return a().saveLayerAlpha(rectF, i4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f10, float f11, float f12, float f13) {
        return c.b(a(), f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        return a().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        a().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i4, PorterDuff.Mode mode) {
        a().drawColor(i4, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        d.f(a(), rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        a().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        a().drawRect(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i4, int i10, float f10, float f11, Paint paint) {
        a().drawText(str, i4, i10, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i4, int i10, int i11, int i12, float f10, float f11, boolean z3, Paint paint) {
        a().drawTextRun(charSequence, i4, i10, i11, i12, f10, f11, z3, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return a().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i4) {
        return a().saveLayer(f10, f11, f12, f13, paint, i4);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i4, int i10) {
        return a().saveLayerAlpha(f10, f11, f12, f13, i4, i10);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i4, int i10, int i11, int i12) {
        return c.c(a(), i4, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        return a().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i4, int i10, float f10, float f11, int i11, int i12, boolean z3, Paint paint) {
        a().drawBitmap(iArr, i4, i10, f10, f11, i11, i12, z3, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i4, BlendMode blendMode) {
        d.b(a(), i4, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i4, int i10, float f10, float f11, Paint paint) {
        a().drawText(charSequence, i4, i10, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        return e.b(a(), path);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        return a().saveLayer(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i4) {
        return a().saveLayerAlpha(f10, f11, f12, f13, i4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op) {
        return a().clipRect(f10, f11, f12, f13, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i4, int i10, int i11, int i12, int i13, int i14, boolean z3, Paint paint) {
        a().drawBitmap(iArr, i4, i10, i11, i12, i13, i14, z3, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode blendMode) {
        d.d(a(), j, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i4, int i10, int i11, int i12, float f10, float f11, boolean z3, Paint paint) {
        d.h(a(), measuredText, i4, i10, i11, i12, f10, f11, z3, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        return a().quickReject(f10, f11, f12, f13, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13) {
        return a().clipRect(f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        a().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f10, float f11, float f12, float f13) {
        return e.a(a(), f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i4, int i10, int i11, int i12) {
        return a().clipRect(i4, i10, i11, i12);
    }
}
