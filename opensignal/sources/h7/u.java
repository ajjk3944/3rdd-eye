package h7;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class u extends w0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f10206d = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    public Drawable f10207a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10208b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f10209c = new Rect();

    public u(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f10206d);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f10207a = drawable;
        if (drawable == null) {
            io.sentry.android.core.e0.p("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f10208b = 1;
    }

    @Override // h7.w0
    public final void c(Rect rect, View view, RecyclerView recyclerView, j1 j1Var) {
        Drawable drawable = this.f10207a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f10208b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // h7.w0
    public final void d(Canvas canvas, RecyclerView recyclerView, j1 j1Var) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || this.f10207a == null) {
            return;
        }
        int i10 = this.f10208b;
        int i11 = 0;
        Rect rect = this.f10209c;
        if (i10 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i11 < childCount) {
                View childAt = recyclerView.getChildAt(i11);
                RecyclerView.N(rect, childAt);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f10207a.setBounds(paddingLeft, iRound - this.f10207a.getIntrinsicHeight(), width, iRound);
                this.f10207a.draw(canvas);
                i11++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i11 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i11);
            recyclerView.getLayoutManager().y(rect, childAt2);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f10207a.setBounds(iRound2 - this.f10207a.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f10207a.draw(canvas);
            i11++;
        }
        canvas.restore();
    }
}
