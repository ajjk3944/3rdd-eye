package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.KotlinVersion;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public final class f extends View {

    /* renamed from: b, reason: collision with root package name */
    public int f15440b;

    /* renamed from: c, reason: collision with root package name */
    public View f15441c;

    /* renamed from: d, reason: collision with root package name */
    public int f15442d;

    public View getContent() {
        return this.f15441c;
    }

    public int getEmptyVisibility() {
        return this.f15442d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE);
            Paint paint = new Paint();
            paint.setARGB(KotlinVersion.MAX_COMPONENT_VALUE, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.f15440b == i) {
            return;
        }
        View view = this.f15441c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f15441c.getLayoutParams()).f15251f0 = false;
            this.f15441c = null;
        }
        this.f15440b = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f15442d = i;
    }
}
