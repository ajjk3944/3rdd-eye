package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: classes.dex */
public class f extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f2301a;

    /* renamed from: b, reason: collision with root package name */
    public View f2302b;

    /* renamed from: c, reason: collision with root package name */
    public int f2303c;

    public f(Context context) {
        super(context);
        this.f2301a = -1;
        this.f2302b = null;
        this.f2303c = 4;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.f2303c);
        this.f2301a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b0.d.ConstraintLayout_placeholder);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == b0.d.ConstraintLayout_placeholder_content) {
                    this.f2301a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2301a);
                } else if (index == b0.d.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f2303c = typedArrayObtainStyledAttributes.getInt(index, this.f2303c);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f2302b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f2302b.getLayoutParams();
        bVar2.f2160u0.e1(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourB = bVar.f2160u0.B();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviourB != dimensionBehaviour) {
            bVar.f2160u0.f1(bVar2.f2160u0.U());
        }
        if (bVar.f2160u0.R() != dimensionBehaviour) {
            bVar.f2160u0.G0(bVar2.f2160u0.y());
        }
        bVar2.f2160u0.e1(8);
    }

    public void c(ConstraintLayout constraintLayout) {
        if (this.f2301a == -1 && !isInEditMode()) {
            setVisibility(this.f2303c);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f2301a);
        this.f2302b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).f2136i0 = true;
            this.f2302b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2302b;
    }

    public int getEmptyVisibility() {
        return this.f2303c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk$SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            Paint paint = new Paint();
            paint.setARGB(255, Sdk$SDKError.Reason.AD_NOT_LOADED_VALUE, Sdk$SDKError.Reason.AD_NOT_LOADED_VALUE, Sdk$SDKError.Reason.AD_NOT_LOADED_VALUE);
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

    public void setContentId(int i10) {
        View viewFindViewById;
        if (this.f2301a == i10) {
            return;
        }
        View view = this.f2302b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f2302b.getLayoutParams()).f2136i0 = false;
            this.f2302b = null;
        }
        this.f2301a = i10;
        if (i10 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f2303c = i10;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2301a = -1;
        this.f2302b = null;
        this.f2303c = 4;
        a(attributeSet);
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2301a = -1;
        this.f2302b = null;
        this.f2303c = 4;
        a(attributeSet);
    }
}
