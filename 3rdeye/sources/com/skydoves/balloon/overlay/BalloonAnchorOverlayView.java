package com.skydoves.balloon.overlay;

import D9.G;
import V5.a;
import W5.b;
import W5.c;
import W5.d;
import W5.e;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import b9.j;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.x;
import w9.i;

/* compiled from: BalloonAnchorOverlayView.kt */
/* loaded from: classes2.dex */
public final class BalloonAnchorOverlayView extends View {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ i<Object>[] f23784m;

    /* renamed from: b, reason: collision with root package name */
    public final G f23785b;

    /* renamed from: c, reason: collision with root package name */
    public final G f23786c;

    /* renamed from: d, reason: collision with root package name */
    public final G f23787d;

    /* renamed from: e, reason: collision with root package name */
    public final G f23788e;

    /* renamed from: f, reason: collision with root package name */
    public final G f23789f;

    /* renamed from: g, reason: collision with root package name */
    public final G f23790g;

    /* renamed from: h, reason: collision with root package name */
    public final G f23791h;
    public Bitmap i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f23792j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f23793k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f23794l;

    static {
        n nVar = new n(BalloonAnchorOverlayView.class, "anchorView", "getAnchorView()Landroid/view/View;");
        x.f43661a.getClass();
        f23784m = new i[]{nVar, new n(BalloonAnchorOverlayView.class, "anchorViewList", "getAnchorViewList()Ljava/util/List;"), new n(BalloonAnchorOverlayView.class, "overlayColor", "getOverlayColor()I"), new n(BalloonAnchorOverlayView.class, "overlayPaddingColor", "getOverlayPaddingColor()I"), new n(BalloonAnchorOverlayView.class, "overlayPadding", "getOverlayPadding()F"), new n(BalloonAnchorOverlayView.class, "overlayPosition", "getOverlayPosition()Landroid/graphics/Point;"), new n(BalloonAnchorOverlayView.class, "balloonOverlayShape", "getBalloonOverlayShape()Lcom/skydoves/balloon/overlay/BalloonOverlayShape;")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalloonAnchorOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        this.f23785b = a.a(this, null);
        this.f23786c = a.a(this, null);
        this.f23787d = a.a(this, 0);
        this.f23788e = a.a(this, 0);
        this.f23789f = a.a(this, Float.valueOf(0.0f));
        this.f23790g = a.a(this, null);
        this.f23791h = a.a(this, c.f13338a);
        Paint paint = new Paint(1);
        this.f23792j = paint;
        Paint paint2 = new Paint(1);
        this.f23793k = paint2;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
    }

    private final int getStatusBarHeight() {
        Rect rect = new Rect();
        Context context = getContext();
        if (!(context instanceof Activity)) {
            return 0;
        }
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public final void a(View view, Canvas canvas) {
        RectF rectF;
        if (view != null) {
            view.getGlobalVisibleRect(new Rect());
            if (getOverlayPosition() != null) {
                rectF = new RectF(r1.x - getOverlayPadding(), (r1.y - getOverlayPadding()) + getStatusBarHeight(), getOverlayPadding() + view.getWidth() + r1.x, getOverlayPadding() + view.getHeight() + r1.y + getStatusBarHeight());
            } else {
                rectF = new RectF(r0.left - getOverlayPadding(), r0.top - getOverlayPadding(), getOverlayPadding() + r0.right, getOverlayPadding() + r0.bottom);
            }
            float overlayPadding = getOverlayPadding() / 2;
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(overlayPadding, overlayPadding);
            e balloonOverlayShape = getBalloonOverlayShape();
            if (balloonOverlayShape instanceof c) {
                canvas.drawOval(rectF, this.f23792j);
                canvas.drawOval(rectF2, this.f23793k);
            } else if (balloonOverlayShape instanceof b) {
                ((b) balloonOverlayShape).getClass();
            } else {
                if (!(balloonOverlayShape instanceof d)) {
                    throw new j();
                }
                ((d) balloonOverlayShape).getClass();
            }
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View anchorView;
        View anchorView2;
        Bitmap bitmap;
        l.f(canvas, "canvas");
        if ((this.f23794l || (bitmap = this.i) == null || bitmap.isRecycled()) && getWidth() != 0 && getHeight() != 0 && (((anchorView = getAnchorView()) == null || anchorView.getWidth() != 0) && ((anchorView2 = getAnchorView()) == null || anchorView2.getHeight() != 0))) {
            Bitmap bitmap2 = this.i;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.i = bitmapCreateBitmap;
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            Paint paint = this.f23792j;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
            paint.setColor(getOverlayColor());
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setColor(0);
            Paint paint2 = this.f23793k;
            paint2.setColor(getOverlayPaddingColor());
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(getOverlayPadding());
            List<View> anchorViewList = getAnchorViewList();
            if (anchorViewList == null || anchorViewList.isEmpty()) {
                a(getAnchorView(), canvas2);
            } else {
                List<View> anchorViewList2 = getAnchorViewList();
                if (anchorViewList2 != null) {
                    Iterator<T> it = anchorViewList2.iterator();
                    while (it.hasNext()) {
                        a((View) it.next(), canvas2);
                    }
                }
            }
            this.f23794l = false;
        }
        Bitmap bitmap3 = this.i;
        if (bitmap3 == null || bitmap3.isRecycled()) {
            return;
        }
        canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
    }

    public final View getAnchorView() {
        return (View) this.f23785b.g(this, f23784m[0]);
    }

    public final List<View> getAnchorViewList() {
        return (List) this.f23786c.g(this, f23784m[1]);
    }

    public final e getBalloonOverlayShape() {
        return (e) this.f23791h.g(this, f23784m[6]);
    }

    public final int getOverlayColor() {
        return ((Number) this.f23787d.g(this, f23784m[2])).intValue();
    }

    public final float getOverlayPadding() {
        return ((Number) this.f23789f.g(this, f23784m[4])).floatValue();
    }

    public final int getOverlayPaddingColor() {
        return ((Number) this.f23788e.g(this, f23784m[3])).intValue();
    }

    public final Point getOverlayPosition() {
        return (Point) this.f23790g.g(this, f23784m[5]);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        this.f23794l = true;
    }

    public final void setAnchorView(View view) {
        this.f23785b.j(this, f23784m[0], view);
    }

    public final void setAnchorViewList(List<? extends View> list) {
        this.f23786c.j(this, f23784m[1], list);
    }

    public final void setBalloonOverlayShape(e eVar) {
        l.f(eVar, "<set-?>");
        this.f23791h.j(this, f23784m[6], eVar);
    }

    public final void setOverlayColor(int i) {
        this.f23787d.j(this, f23784m[2], Integer.valueOf(i));
    }

    public final void setOverlayPadding(float f10) {
        this.f23789f.j(this, f23784m[4], Float.valueOf(f10));
    }

    public final void setOverlayPaddingColor(int i) {
        this.f23788e.j(this, f23784m[3], Integer.valueOf(i));
    }

    public final void setOverlayPosition(Point point) {
        this.f23790g.j(this, f23784m[5], point);
    }
}
