package zp;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import br.l;
import com.survicate.surveys.entities.colors.MicroColorControlOpacity;
import h7.j1;
import h7.n1;
import h7.w0;
import h7.z0;

/* loaded from: classes.dex */
public final class a extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27492a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27493b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27494c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f27495d;

    public a(int i10, int i11, int i12, int i13) {
        this.f27492a = i10;
        this.f27493b = i11;
        this.f27494c = i12;
        Paint paint = new Paint();
        paint.setColor(se.b.z(i13, MicroColorControlOpacity.AnswerBackground.getOpacityValue()));
        paint.setStyle(Paint.Style.FILL);
        this.f27495d = paint;
    }

    @Override // h7.w0
    public final void c(Rect rect, View view, RecyclerView recyclerView, j1 j1Var) {
        RecyclerView recyclerView2;
        l.e(rect, "outRect");
        l.e(view, "view");
        l.e(j1Var, "state");
        n1 n1VarM = RecyclerView.M(view);
        int iJ = -1;
        if (n1VarM != null && (recyclerView2 = n1VarM.f10170r) != null) {
            iJ = recyclerView2.J(n1VarM);
        }
        int iB = j1Var.b() - 1;
        rect.set(0, 0, 0, 0);
        if (iJ < iB) {
            rect.bottom = this.f27492a + this.f27493b + this.f27494c;
        }
    }

    @Override // h7.w0
    public final void d(Canvas canvas, RecyclerView recyclerView, j1 j1Var) {
        RecyclerView recyclerView2;
        Canvas canvas2 = canvas;
        l.e(canvas2, "canvas");
        l.e(j1Var, "state");
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount() - 1;
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = recyclerView.getChildAt(i10);
            n1 n1VarM = RecyclerView.M(childAt);
            int iJ = -1;
            if (n1VarM != null && (recyclerView2 = n1VarM.f10170r) != null) {
                iJ = recyclerView2.J(n1VarM);
            }
            n1 n1VarI = recyclerView.I(iJ + 1);
            boolean z10 = (n1VarI instanceof c ? (c) n1VarI : null) != null;
            if (iJ != j1Var.b() - 1 && !z10) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                l.c(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                canvas2.drawRect(paddingLeft, childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((z0) layoutParams)).bottomMargin + this.f27493b, width, this.f27492a + r4, this.f27495d);
            }
            i10++;
            canvas2 = canvas;
        }
    }
}
