package G4;

import R.O;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.S;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.g0;
import com.apm.insight.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends M {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1673a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1674b;

    public a(Context context) {
        Paint paint = new Paint();
        this.f1673a = paint;
        this.f1674b = 4;
        paint.setStrokeWidth(2.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(context.getColor(R.color.color_divider));
    }

    @Override // androidx.recyclerview.widget.M
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, d0 d0Var) {
        super.onDrawOver(canvas, recyclerView, d0Var);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            g0 g0VarJ = RecyclerView.J(childAt);
            int layoutPosition = g0VarJ != null ? g0VarJ.getLayoutPosition() : -1;
            int i3 = this.f1674b;
            int i6 = (layoutPosition + 1) % i3;
            S s5 = (S) childAt.getLayoutParams();
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) s5).bottomMargin;
            WeakHashMap weakHashMap = O.f3270a;
            int iRound = Math.round(childAt.getTranslationY()) + bottom;
            int iRound2 = Math.round(childAt.getTranslationX()) + childAt.getRight() + ((ViewGroup.MarginLayoutParams) s5).rightMargin;
            int height = recyclerView.getHeight();
            Paint paint = this.f1673a;
            if (iRound < height) {
                float f2 = iRound;
                canvas.drawLine(childAt.getLeft(), f2, iRound2, f2, paint);
            }
            if (i6 < i3) {
                float f5 = iRound2;
                canvas.drawLine(f5, childAt.getTop(), f5, iRound, paint);
            }
        }
    }
}
