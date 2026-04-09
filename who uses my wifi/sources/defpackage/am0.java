package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class am0 extends fo0 {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ bm0 d;

    public am0(bm0 bm0Var) {
        this.d = bm0Var;
    }

    @Override // defpackage.fo0
    public final void a(Rect rect, View view, RecyclerView recyclerView) {
        if (d(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.fo0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (d(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.a.setBounds(0, height, width, this.b + height);
                this.a.draw(canvas);
            }
        }
    }

    public final boolean d(View view, RecyclerView recyclerView) {
        wo0 wo0VarH = recyclerView.H(view);
        if (!(wo0VarH instanceof im0) || !((im0) wo0VarH).y) {
            return false;
        }
        boolean z = this.c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        wo0 wo0VarH2 = recyclerView.H(recyclerView.getChildAt(iIndexOfChild + 1));
        return (wo0VarH2 instanceof im0) && ((im0) wo0VarH2).x;
    }
}
