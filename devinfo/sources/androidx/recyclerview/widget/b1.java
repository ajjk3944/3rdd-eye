package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b1 {
    @Deprecated
    public void getItemOffsets(Rect rect, int i4, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }

    @Deprecated
    public void onDraw(Canvas canvas, RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, t1 t1Var) {
        getItemOffsets(rect, ((g1) view.getLayoutParams()).f1374a.getLayoutPosition(), recyclerView);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, t1 t1Var) {
        onDraw(canvas, recyclerView);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, t1 t1Var) {
        onDrawOver(canvas, recyclerView);
    }
}
