package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class e extends View {

    /* renamed from: b, reason: collision with root package name */
    private int f1389b;

    /* renamed from: c, reason: collision with root package name */
    private View f1390c;

    /* renamed from: d, reason: collision with root package name */
    private int f1391d;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f1390c == null) {
            return;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.f1390c.getLayoutParams();
        aVar2.f1315l0.x0(0);
        aVar.f1315l0.y0(aVar2.f1315l0.D());
        aVar.f1315l0.b0(aVar2.f1315l0.r());
        aVar2.f1315l0.x0(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f1389b == -1 && !isInEditMode()) {
            setVisibility(this.f1391d);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f1389b);
        this.f1390c = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.a) viewFindViewById.getLayoutParams()).f1293a0 = true;
            this.f1390c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1390c;
    }

    public int getEmptyVisibility() {
        return this.f1391d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i2) {
        View viewFindViewById;
        if (this.f1389b == i2) {
            return;
        }
        View view = this.f1390c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.f1390c.getLayoutParams()).f1293a0 = false;
            this.f1390c = null;
        }
        this.f1389b = i2;
        if (i2 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i2)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i2) {
        this.f1391d = i2;
    }
}
