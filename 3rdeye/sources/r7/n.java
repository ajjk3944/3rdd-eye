package r7;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SuperLineHeightTextView.kt */
/* loaded from: classes.dex */
public class n extends AppCompatTextView implements X6.i {
    public final X6.h i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f45815j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, int i) {
        super(context, null, i);
        kotlin.jvm.internal.l.f(context, "context");
        this.i = new X6.h(this);
    }

    private final int getVisibleLineCount() {
        return Math.min(getLineCount(), getMaxLines());
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.i.f13585c;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.i.f13584b;
    }

    public int getFixedLineHeight() {
        return this.i.f13586d;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        int iMin = Math.min(getLineCount(), getMaxLines());
        X6.h hVar = this.i;
        if (hVar.f13586d != -1 && !X6.r.b(i10)) {
            TextView textView = hVar.f13583a;
            int paddingBottom = textView.getPaddingBottom() + textView.getPaddingTop() + q.a(textView, iMin) + (iMin >= textView.getLineCount() ? hVar.f13584b + hVar.f13585c : 0);
            int minimumHeight = textView.getMinimumHeight();
            if (paddingBottom < minimumHeight) {
                paddingBottom = minimumHeight;
            }
            super.setMeasuredDimension(getMeasuredWidthAndState(), View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i10)), RecyclerView.UNDEFINED_DURATION) : View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C5533d c5533d = layoutParams instanceof C5533d ? (C5533d) layoutParams : null;
        if (c5533d != null && this.f45815j && ((ViewGroup.MarginLayoutParams) c5533d).width == -3 && c5533d.f45765h != Integer.MAX_VALUE) {
            int lineCount = getLayout().getLineCount();
            float fMax = 0.0f;
            for (int i11 = 0; i11 < lineCount; i11++) {
                fMax = Math.max(fMax, getLayout().getLineWidth(i11));
            }
            int iCeil = (int) Math.ceil(fMax + getCompoundPaddingRight() + getCompoundPaddingLeft());
            if (iCeil < getMeasuredWidth()) {
                super.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(iCeil, View.MeasureSpec.getMode(getMeasuredWidthAndState())), getMeasuredHeightAndState());
            }
        }
    }

    @Override // X6.i
    public void setFixedLineHeight(int i) {
        X6.h hVar = this.i;
        if (hVar.f13586d == i) {
            return;
        }
        hVar.f13586d = i;
        hVar.a(i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f10) {
        super.setTextSize(i, f10);
        X6.h hVar = this.i;
        hVar.a(hVar.f13586d);
    }

    public final void setTightenWidth(boolean z10) {
        boolean z11 = this.f45815j;
        this.f45815j = z10;
        if (z11 != z10) {
            requestLayout();
        }
    }
}
