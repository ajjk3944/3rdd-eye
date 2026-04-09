package r7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import kotlin.KotlinVersion;
import o.C5391i;

/* compiled from: SuperLineHeightEditText.kt */
/* loaded from: classes.dex */
public class m extends C5391i implements X6.i {

    /* renamed from: h, reason: collision with root package name */
    public boolean f45811h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f45812j;

    /* renamed from: k, reason: collision with root package name */
    public final X6.h f45813k;

    /* renamed from: l, reason: collision with root package name */
    public int f45814l;

    public m(Context context) {
        super(context, null, R.attr.divInputStyle);
        this.i = true;
        this.f45813k = new X6.h(this);
    }

    private final boolean getInterceptTouchEventNeeded() {
        return (this.f45811h || this.i) ? false : true;
    }

    private final int getVisibleLineCount() {
        if (getLineCount() == 0) {
            return 1;
        }
        return getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
    }

    public final void f(int i) {
        if (getLayout() == null || i == 0) {
            return;
        }
        this.i = (i - getCompoundPaddingTop()) - getCompoundPaddingBottom() >= q.a(this, getLayout().getLineCount());
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.f45813k.f13585c;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.f45813k.f13584b;
    }

    public int getFixedLineHeight() {
        return this.f45813k.f13586d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        int maxLines = getLineCount() == 0 ? 1 : getLineCount() > getMaxLines() ? getMaxLines() : getLineCount();
        X6.h hVar = this.f45813k;
        if (hVar.f13586d == -1 || X6.r.b(i10)) {
            return;
        }
        TextView textView = hVar.f13583a;
        int paddingBottom = textView.getPaddingBottom() + textView.getPaddingTop() + q.a(textView, maxLines) + (maxLines >= textView.getLineCount() ? hVar.f13584b + hVar.f13585c : 0);
        int minimumHeight = textView.getMinimumHeight();
        if (paddingBottom < minimumHeight) {
            paddingBottom = minimumHeight;
        }
        super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i10)), RecyclerView.UNDEFINED_DURATION) : View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        f(i10);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        super.onTextChanged(charSequence, i, i10, i11);
        if (Build.VERSION.SDK_INT < 28) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null || layoutParams.height != -3) {
                this.f45814l = getLineCount() != 0 ? getLineCount() > getMaxLines() ? getMaxLines() : getLineCount() : 1;
            } else {
                if (this.f45814l != (getLineCount() == 0 ? 1 : getLineCount() > getMaxLines() ? getMaxLines() : getLineCount())) {
                    this.f45814l = getLineCount() != 0 ? getLineCount() > getMaxLines() ? getMaxLines() : getLineCount() : 1;
                    requestLayout();
                }
            }
        }
        f(getHeight());
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent event) {
        kotlin.jvm.internal.l.f(event, "event");
        if (!getInterceptTouchEventNeeded()) {
            if (this.f45812j) {
                this.f45812j = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            return super.onTouchEvent(event);
        }
        int action = event.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            this.f45812j = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            this.f45812j = false;
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(event);
    }

    @Override // X6.i
    public void setFixedLineHeight(int i) {
        X6.h hVar = this.f45813k;
        if (hVar.f13586d == i) {
            return;
        }
        hVar.f13586d = i;
        hVar.a(i);
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean z10) {
        this.f45811h = z10;
        super.setHorizontallyScrolling(z10);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f10) {
        super.setTextSize(i, f10);
        X6.h hVar = this.f45813k;
        hVar.a(hVar.f13586d);
    }
}
